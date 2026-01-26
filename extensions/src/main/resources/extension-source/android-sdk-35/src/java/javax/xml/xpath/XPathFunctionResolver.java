package javax.xml.xpath;

import javax.xml.namespace.QName;

public interface XPathFunctionResolver
{
    XPathFunction resolveFunction(final QName p0, final int p1);
}
