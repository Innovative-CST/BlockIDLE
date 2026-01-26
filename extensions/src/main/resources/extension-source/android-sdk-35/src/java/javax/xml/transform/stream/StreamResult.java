package javax.xml.transform.stream;

import java.io.File;
import java.io.Writer;
import java.io.OutputStream;
import javax.xml.transform.Result;

public class StreamResult implements Result
{
    public static final String FEATURE = "http://javax.xml.transform.stream.StreamResult/feature";
    
    public StreamResult() {
        throw new RuntimeException("Stub!");
    }
    
    public StreamResult(final OutputStream outputStream) {
        throw new RuntimeException("Stub!");
    }
    
    public StreamResult(final Writer writer) {
        throw new RuntimeException("Stub!");
    }
    
    public StreamResult(final String systemId) {
        throw new RuntimeException("Stub!");
    }
    
    public StreamResult(final File f) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOutputStream(final OutputStream outputStream) {
        throw new RuntimeException("Stub!");
    }
    
    public OutputStream getOutputStream() {
        throw new RuntimeException("Stub!");
    }
    
    public void setWriter(final Writer writer) {
        throw new RuntimeException("Stub!");
    }
    
    public Writer getWriter() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setSystemId(final String systemId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSystemId(final File f) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getSystemId() {
        throw new RuntimeException("Stub!");
    }
}
