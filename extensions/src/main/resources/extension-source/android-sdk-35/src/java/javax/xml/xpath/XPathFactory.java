package javax.xml.xpath;

public abstract class XPathFactory
{
    public static final String DEFAULT_OBJECT_MODEL_URI = "http://java.sun.com/jaxp/xpath/dom";
    public static final String DEFAULT_PROPERTY_NAME = "javax.xml.xpath.XPathFactory";
    
    protected XPathFactory() {
        throw new RuntimeException("Stub!");
    }
    
    public static final XPathFactory newInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static final XPathFactory newInstance(final String uri) throws XPathFactoryConfigurationException {
        throw new RuntimeException("Stub!");
    }
    
    public static XPathFactory newInstance(final String uri, final String factoryClassName, final ClassLoader classLoader) throws XPathFactoryConfigurationException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract boolean isObjectModelSupported(final String p0);
    
    public abstract void setFeature(final String p0, final boolean p1) throws XPathFactoryConfigurationException;
    
    public abstract boolean getFeature(final String p0) throws XPathFactoryConfigurationException;
    
    public abstract void setXPathVariableResolver(final XPathVariableResolver p0);
    
    public abstract void setXPathFunctionResolver(final XPathFunctionResolver p0);
    
    public abstract XPath newXPath();
}
