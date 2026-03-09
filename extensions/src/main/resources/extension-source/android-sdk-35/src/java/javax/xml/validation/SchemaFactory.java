package javax.xml.validation;

import java.net.URL;
import java.io.File;
import org.xml.sax.SAXException;
import javax.xml.transform.Source;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXNotRecognizedException;

public abstract class SchemaFactory
{
    protected SchemaFactory() {
        throw new RuntimeException("Stub!");
    }
    
    public static SchemaFactory newInstance(final String schemaLanguage) {
        throw new RuntimeException("Stub!");
    }
    
    public static SchemaFactory newInstance(final String schemaLanguage, final String factoryClassName, final ClassLoader classLoader) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract boolean isSchemaLanguageSupported(final String p0);
    
    public boolean getFeature(final String name) throws SAXNotRecognizedException, SAXNotSupportedException {
        throw new RuntimeException("Stub!");
    }
    
    public void setFeature(final String name, final boolean value) throws SAXNotRecognizedException, SAXNotSupportedException {
        throw new RuntimeException("Stub!");
    }
    
    public void setProperty(final String name, final Object object) throws SAXNotRecognizedException, SAXNotSupportedException {
        throw new RuntimeException("Stub!");
    }
    
    public Object getProperty(final String name) throws SAXNotRecognizedException, SAXNotSupportedException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setErrorHandler(final ErrorHandler p0);
    
    public abstract ErrorHandler getErrorHandler();
    
    public abstract void setResourceResolver(final LSResourceResolver p0);
    
    public abstract LSResourceResolver getResourceResolver();
    
    public Schema newSchema(final Source schema) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public Schema newSchema(final File schema) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public Schema newSchema(final URL schema) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Schema newSchema(final Source[] p0) throws SAXException;
    
    public abstract Schema newSchema() throws SAXException;
}
