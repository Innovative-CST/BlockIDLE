package javax.xml.parsers;

import javax.xml.validation.Schema;

public abstract class DocumentBuilderFactory
{
    protected DocumentBuilderFactory() {
        throw new RuntimeException("Stub!");
    }
    
    public static DocumentBuilderFactory newInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static DocumentBuilderFactory newInstance(final String factoryClassName, final ClassLoader classLoader) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract DocumentBuilder newDocumentBuilder() throws ParserConfigurationException;
    
    public void setNamespaceAware(final boolean awareness) {
        throw new RuntimeException("Stub!");
    }
    
    public void setValidating(final boolean validating) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIgnoringElementContentWhitespace(final boolean whitespace) {
        throw new RuntimeException("Stub!");
    }
    
    public void setExpandEntityReferences(final boolean expandEntityRef) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIgnoringComments(final boolean ignoreComments) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCoalescing(final boolean coalescing) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNamespaceAware() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isValidating() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isIgnoringElementContentWhitespace() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isExpandEntityReferences() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isIgnoringComments() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCoalescing() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setAttribute(final String p0, final Object p1) throws IllegalArgumentException;
    
    public abstract Object getAttribute(final String p0) throws IllegalArgumentException;
    
    public abstract void setFeature(final String p0, final boolean p1) throws ParserConfigurationException;
    
    public abstract boolean getFeature(final String p0) throws ParserConfigurationException;
    
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
