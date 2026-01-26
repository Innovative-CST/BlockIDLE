package javax.xml.xpath;

import org.xml.sax.InputSource;
import javax.xml.namespace.QName;

public interface XPathExpression
{
    Object evaluate(final Object p0, final QName p1) throws XPathExpressionException;
    
    String evaluate(final Object p0) throws XPathExpressionException;
    
    Object evaluate(final InputSource p0, final QName p1) throws XPathExpressionException;
    
    String evaluate(final InputSource p0) throws XPathExpressionException;
}
