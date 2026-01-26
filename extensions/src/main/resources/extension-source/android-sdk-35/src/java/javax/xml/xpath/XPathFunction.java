package javax.xml.xpath;

import java.util.List;

public interface XPathFunction
{
    Object evaluate(final List p0) throws XPathFunctionException;
}
