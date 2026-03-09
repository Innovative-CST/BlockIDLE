package javax.xml.xpath;

import org.xml.sax.InputSource;
import javax.xml.namespace.QName;
import javax.xml.namespace.NamespaceContext;

public interface XPath
{
    void reset();
    
    void setXPathVariableResolver(final XPathVariableResolver p0);
    
    XPathVariableResolver getXPathVariableResolver();
    
    void setXPathFunctionResolver(final XPathFunctionResolver p0);
    
    XPathFunctionResolver getXPathFunctionResolver();
    
    void setNamespaceContext(final NamespaceContext p0);
    
    NamespaceContext getNamespaceContext();
    
    XPathExpression compile(final String p0) throws XPathExpressionException;
    
    Object evaluate(final String p0, final Object p1, final QName p2) throws XPathExpressionException;
    
    String evaluate(final String p0, final Object p1) throws XPathExpressionException;
    
    Object evaluate(final String p0, final InputSource p1, final QName p2) throws XPathExpressionException;
    
    String evaluate(final String p0, final InputSource p1) throws XPathExpressionException;
}
