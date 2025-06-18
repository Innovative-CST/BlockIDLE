#!/usr/bin/env python3
import os
import re
from base64 import b64decode
from pathlib import Path
from typing import List, Optional

import javalang
from github import GithubIntegration
from langchain import PromptTemplate, LLMChain
from openai import OpenAI
from tqdm import tqdm
from unidiff import PatchSet

# Prompt & patterns
PROMPT_TEMPLATE = """
For the following Java method:
```java
{code}
```
An appropriate Javadoc would be:"""

COMMENT_TEMPLATE = """ Shall we add a Javadoc?

{javadoc}
{first_line_of_code}
```"""
JAVADOC_PATTERN = re.compile(r"/\\*\\*.+?\\*/", re.DOTALL)

def get_method_start_end(node, tree) -> tuple:
    # Implement logic to derive start_position, end_position, start_line, end_line for a method node.
    # ...
    raise NotImplementedError

def get_method_text(start_pos, end_pos, start_line, end_line, last_endline_index, codelines) -> str:
    # Use start_pos/end_pos or line bounds to extract full method source as string
    # ...
    raise NotImplementedError

def generate_pr_comment_for_adding_javadoc(
    method_data: dict, file_text: str, llm_chain: LLMChain
) -> Optional[dict]:
    method_text = get_method_text(
        method_data["start_position"],
        method_data["end_position"],
        method_data["start_line"],
        method_data["end_line"],
        None,
        file_text.splitlines(),
    )
    llm_resp = llm_chain.run(code=method_text)
    match = JAVADOC_PATTERN.search(llm_resp)
    if not match:
        return None
    javadoc = match.group(0).strip()
    first_line = method_text.splitlines()[0]
    indent_len = len(first_line) - len(first_line.lstrip())
    indent = " " * indent_len
    javadoc = indent + javadoc.replace("\n", "\n" + indent)

    return {
        "body": COMMENT_TEMPLATE.format(javadoc=javadoc, first_line_of_code=first_line).strip(),
        "line": method_data["start_line"],
        "start_side": "RIGHT"
    }

def main():
    # Load credentials
    gh_install_id = os.environ["GITHUB_INSTALLATION_ID"]
    gh_app_id = os.environ["GITHUB_APP_ID"]
    gh_key_path = os.environ["GITHUB_PRIVATE_KEY_PATH"]
    openai_key = os.environ["OPENAI_API"]

    private_key = Path(gh_key_path).read_text()
    integration = GithubIntegration(integration_id=int(gh_app_id), private_key=private_key)
    gh = integration.get_github_for_installation(int(gh_install_id))

    prompt = PromptTemplate(template=PROMPT_TEMPLATE, input_variables=["code"])
    llm = OpenAI(openai_api_key=openai_key)
    llm_chain = LLMChain(prompt=prompt, llm=llm)

    owner, repo = os.environ["REPO_OWNER"], os.environ["REPO_NAME"]
    pr_number = int(os.environ["PR_NUMBER"])
    repo = gh.get_repo(f"{owner}/{repo}")
    pr = repo.get_pull(pr_number)
    comments = []

    for file in tqdm(pr.get_files(), desc="Processing .java files"):
        if not file.filename.endswith(".java"):
            continue
        head = pr.head.repo
        f = head.get_contents(file.filename, ref=pr.head.ref)
        text = b64decode(f.content).decode()
        tree = javalang.parse.parse(text)

        methods = []
        for _, node in tree.filter(javalang.tree.MethodDeclaration):
            start_pos, end_pos, start_line, end_line = get_method_start_end(node, tree)
            methods.append({
                "node": node,
                "start_position": start_pos,
                "end_position": end_pos,
                "start_line": start_line,
                "end_line": end_line,
                "is_affected": False
            })

        patch = PatchSet("--- /dev/null\n+++ /dev/null\n" + file.patch)[0]
        for hunk in patch:
            for idx, line in enumerate(hunk.target):
                if line.startswith("+"):
                    num = hunk.target_start + idx
                    for m in methods:
                        if m["start_line"] <= num <= m["end_line"]:
                            m["is_affected"] = True
                            break

        for m in methods:
            if not m["is_affected"]:
                continue
            if any(isinstance(ann, javalang.tree.Documentation) for ann in getattr(m["node"], 'documentation') or []):
                continue
            c = generate_pr_comment_for_adding_javadoc(m, text, llm_chain)
            if c:
                c["path"] = file.filename
                comments.append(c)

    if comments:
        pr.create_review(comments=comments, event="COMMENT")
    else:
        print("No missing Javadoc suggestions found.")

if __name__ == "__main__":
    main()
