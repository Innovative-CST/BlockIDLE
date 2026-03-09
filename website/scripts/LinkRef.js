import { jsx as _jsx } from "react/jsx-runtime";

export default function LinkRef({ name, pagesUrlData }) {
  if (!name) return null;

  // Hash-only link
  if (name.startsWith("#")) {
    const hash = name.substring(1);
    return _jsx("a", {
      href: `#${hash}`,
      children: hash
    });
  }

  const [className, hash] = name.split("#");


  const match = pagesUrlData?.find(p =>
    p.class.replace(".md", "") === className
  );

  if (!match) {
    return _jsx("span", {
      children: name
    });
  }

  const url = "/" + match.path + (hash ? `#${hash}` : "");

  return _jsx("a", {
    href: url,
    children: name
  });
}