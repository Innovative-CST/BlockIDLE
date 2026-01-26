package javax.xml.transform.sax;

import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.ContentHandler;
import javax.xml.transform.Result;

public class SAXResult implements Result
{
    public static final String FEATURE = "http://javax.xml.transform.sax.SAXResult/feature";
    
    public SAXResult() {
        throw new RuntimeException("Stub!");
    }
    
    public SAXResult(final ContentHandler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setHandler(final ContentHandler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public ContentHandler getHandler() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLexicalHandler(final LexicalHandler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public LexicalHandler getLexicalHandler() {
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
}
