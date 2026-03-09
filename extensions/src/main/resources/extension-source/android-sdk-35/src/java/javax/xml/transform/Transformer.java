package javax.xml.transform;

import java.util.Properties;

public abstract class Transformer
{
    protected Transformer() {
        throw new RuntimeException("Stub!");
    }
    
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void transform(final Source p0, final Result p1) throws TransformerException;
    
    public abstract void setParameter(final String p0, final Object p1);
    
    public abstract Object getParameter(final String p0);
    
    public abstract void clearParameters();
    
    public abstract void setURIResolver(final URIResolver p0);
    
    public abstract URIResolver getURIResolver();
    
    public abstract void setOutputProperties(final Properties p0);
    
    public abstract Properties getOutputProperties();
    
    public abstract void setOutputProperty(final String p0, final String p1) throws IllegalArgumentException;
    
    public abstract String getOutputProperty(final String p0) throws IllegalArgumentException;
    
    public abstract void setErrorListener(final ErrorListener p0) throws IllegalArgumentException;
    
    public abstract ErrorListener getErrorListener();
}
