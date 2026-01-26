package javax.xml.parsers;

import javax.xml.validation.Schema;
import org.w3c.dom.DOMImplementation;
import org.xml.sax.ErrorHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import java.io.File;
import org.xml.sax.SAXException;
import java.io.IOException;
import org.w3c.dom.Document;
import java.io.InputStream;

public abstract class DocumentBuilder
{
    protected DocumentBuilder() {
        throw new RuntimeException("Stub!");
    }
    
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    public Document parse(final InputStream is) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public Document parse(final InputStream is, final String systemId) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public Document parse(final String uri) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public Document parse(final File f) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Document parse(final InputSource p0) throws IOException, SAXException;
    
    public abstract boolean isNamespaceAware();
    
    public abstract boolean isValidating();
    
    public abstract void setEntityResolver(final EntityResolver p0);
    
    public abstract void setErrorHandler(final ErrorHandler p0);
    
    public abstract Document newDocument();
    
    public abstract DOMImplementation getDOMImplementation();
    
    public Schema getSchema() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isXIncludeAware() {
        throw new RuntimeException("Stub!");
    }
}
