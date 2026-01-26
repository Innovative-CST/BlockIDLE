package javax.xml.validation;

import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXNotRecognizedException;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import javax.xml.transform.Result;
import org.xml.sax.SAXException;
import java.io.IOException;
import javax.xml.transform.Source;

public abstract class Validator
{
    protected Validator() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void reset();
    
    public void validate(final Source source) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void validate(final Source p0, final Result p1) throws IOException, SAXException;
    
    public abstract void setErrorHandler(final ErrorHandler p0);
    
    public abstract ErrorHandler getErrorHandler();
    
    public abstract void setResourceResolver(final LSResourceResolver p0);
    
    public abstract LSResourceResolver getResourceResolver();
    
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
}
