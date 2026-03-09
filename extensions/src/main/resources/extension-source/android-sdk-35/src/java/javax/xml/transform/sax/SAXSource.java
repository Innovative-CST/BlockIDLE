package javax.xml.transform.sax;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import javax.xml.transform.Source;

public class SAXSource implements Source
{
    public static final String FEATURE = "http://javax.xml.transform.sax.SAXSource/feature";
    
    public SAXSource() {
        throw new RuntimeException("Stub!");
    }
    
    public SAXSource(final XMLReader reader, final InputSource inputSource) {
        throw new RuntimeException("Stub!");
    }
    
    public SAXSource(final InputSource inputSource) {
        throw new RuntimeException("Stub!");
    }
    
    public void setXMLReader(final XMLReader reader) {
        throw new RuntimeException("Stub!");
    }
    
    public XMLReader getXMLReader() {
        throw new RuntimeException("Stub!");
    }
    
    public void setInputSource(final InputSource inputSource) {
        throw new RuntimeException("Stub!");
    }
    
    public InputSource getInputSource() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setSystemId(final String systemId) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getSystemId() {
        throw new RuntimeException("Stub!");
    }
    
    public static InputSource sourceToInputSource(final Source source) {
        throw new RuntimeException("Stub!");
    }
}
