import fs from "fs";
import path from "path";
import React from "react";
import matter from "gray-matter";
import { compile, run } from "@mdx-js/mdx";
import * as runtime from "react/jsx-runtime";
import { renderToStaticMarkup } from "react-dom/server";
import rehypeSlug from "rehype-slug";
import rehypePrettyCode from "rehype-pretty-code";
import rehypeAutolinkHeadings from "rehype-autolink-headings";
import { visit } from "unist-util-visit";

import LinkRef from "./LinkRef.js"

const INPUT_DIR = "../beans/basebeans/build/markdown-docs";
const OUTPUT_DIR = "./public";
const FRAG_DIR = path.join(OUTPUT_DIR, "fragments");
const pagesUrlData = []

//  rehype plugin 
function rehypeInjectCustomClasses() {
  return (tree) => {
    visit(tree, "element", (node) => {
      if (/^h[1-4]$/.test(node.tagName)) {
        node.properties = node.properties || {};
        node.properties.className = [
          ...(node.properties.className || []),
          "heading",
          `heading-${node.tagName}`,
        ];
      }
    });
  };
}

//  get all markdown files 
function getAllMarkdownFiles(dir) {
  let results = [];
  const list = fs.readdirSync(dir);
  for (const file of list) {
    const filePath = path.join(dir, file);
    const stat = fs.statSync(filePath);
    if (stat.isDirectory()) {
      results = results.concat(getAllMarkdownFiles(filePath));
    } else if (file.endsWith(".md")) {
      results.push(filePath);
    }
  }
  return results;
}

//  generate HTML fragment 
async function generateFragment(filePath) {
  const source = fs.readFileSync(filePath, "utf8");
  const { content } = matter(source);

  const compiled = await compile(content, {
    outputFormat: "function-body",
    rehypePlugins: [
      rehypeSlug,
      rehypeInjectCustomClasses,
      rehypeAutolinkHeadings,
      [rehypePrettyCode, { theme: "github-dark" }],
    ],
  });
  const { default: MDXContent } = await run(compiled, runtime);

  const htmlContent = renderToStaticMarkup(
    MDXContent({
      components: {
        LinkRef: (props) =>
        React.createElement(LinkRef, {
          ...props,
          pagesUrlData
        })
      }
    })
  );

  const relativePath = path.relative(INPUT_DIR, filePath);
  const fragmentPath = path.join(
    FRAG_DIR,
    relativePath.replace(".md", ".html")
  );
  const processedHtml = `
<style>

figure[data-rehype-pretty-code-figure] {
  margin: 0;
}

pre {
  padding: 16px;
  border-radius: 8px;
  overflow-x: auto;
  margin: 0;
}

pre code {
  display: block;
  white-space: pre;
}

pre code span[data-line] {
  display: block;
  padding-left: 0;
}

h1,
h2,
h3 {
  margin-top: 0.5em;
}
</style>
${htmlContent}
`
  fs.mkdirSync(path.dirname(fragmentPath), { recursive: true });
  fs.writeFileSync(fragmentPath, processedHtml);

  return fragmentPath;
}

function generatePagesJson(files) {
  const pages = files.map(f =>
    f.replace(".md", ".html")
  );

  fs.writeFileSync(
    path.join(OUTPUT_DIR, "pages.json"),
    JSON.stringify(pages, null, 2)
  );
}

function pageLinkResolver() {
  const localFiles = getAllMarkdownFiles(INPUT_DIR);
  for (let file of localFiles) {
    let parts = file.split("/");
    let className = parts[parts.length - 1];
    
    let relativePath = path.relative(INPUT_DIR, file);
    let classDocPath = path.join(
      "docs",
      relativePath.replace(".md", ".html")
    );

    pagesUrlData.push({
      "class": className,
      "path": classDocPath
    });
  }
}

//  main build function 
async function build() {
  fs.mkdirSync(FRAG_DIR, { recursive: true });
  const files = getAllMarkdownFiles(INPUT_DIR);
  console.log("Found MD files:", files.length);

  for (const file of files) {
    console.log("Generating fragment for:", file);
    await generateFragment(file);
  }
  
  generatePagesJson(files.map(f => path.relative(INPUT_DIR, f)));

  console.log("Static docs site generated in 'dist/'!");
}
pageLinkResolver();
build();