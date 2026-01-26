package javax.xml.parsers;

import javax.xml.validation.Schema;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXException;

public abstract class SAXParserFactory
{
    protected SAXParserFactory() {
        throw new RuntimeException("Stub!");
    }
    
    public static SAXParserFactory newInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static SAXParserFactory newInstance(final String factoryClassName, final ClassLoader classLoader) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract SAXParser newSAXParser() throws ParserConfigurationException, SAXException;
    
    public void setNamespaceAware(final boolean awareness) {
        throw new RuntimeException("Stub!");
    }
    
    public void setValidating(final boolean validating) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNamespaceAware() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isValidating() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setFeature(final String p0, final boolean p1) throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException;
    
    public abstract boolean getFeature(final String p0) throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException;
    
    public Schema getSchema() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSchema(final Schema schema) {
        throw new RuntimeException("Stub!");
    }
    
    public void setXIncludeAware(final boolean state) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isXIncludeAware() {
        throw new RuntimeException("Stub!");
    }
}
