package javax.xml.parsers;

import javax.xml.validation.Schema;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.XMLReader;
import org.xml.sax.Parser;
import org.xml.sax.InputSource;
import java.io.File;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.SAXException;
import java.io.IOException;
import org.xml.sax.HandlerBase;
import java.io.InputStream;

public abstract class SAXParser
{
    protected SAXParser() {
        throw new RuntimeException("Stub!");
    }
    
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    public void parse(final InputStream is, final HandlerBase hb) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public void parse(final InputStream is, final HandlerBase hb, final String systemId) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public void parse(final InputStream is, final DefaultHandler dh) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public void parse(final InputStream is, final DefaultHandler dh, final String systemId) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public void parse(final String uri, final HandlerBase hb) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public void parse(final String uri, final DefaultHandler dh) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public void parse(final File f, final HandlerBase hb) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public void parse(final File f, final DefaultHandler dh) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public void parse(final InputSource is, final HandlerBase hb) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public void parse(final InputSource is, final DefaultHandler dh) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Parser getParser() throws SAXException;
    
    public abstract XMLReader getXMLReader() throws SAXException;
    
    public abstract boolean isNamespaceAware();
    
    public abstract boolean isValidating();
    
    public abstract void setProperty(final String p0, final Object p1) throws SAXNotRecognizedException, SAXNotSupportedException;
    
    public abstract Object getProperty(final String p0) throws SAXNotRecognizedException, SAXNotSupportedException;
    
    public Schema getSchema() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isXIncludeAware() {
        throw new RuntimeException("Stub!");
    }
}
