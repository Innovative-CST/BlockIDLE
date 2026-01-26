package javax.xml.transform.stream;

import java.io.File;
import java.io.Reader;
import java.io.InputStream;
import javax.xml.transform.Source;

public class StreamSource implements Source
{
    public static final String FEATURE = "http://javax.xml.transform.stream.StreamSource/feature";
    
    public StreamSource() {
        throw new RuntimeException("Stub!");
    }
    
    public StreamSource(final InputStream inputStream) {
        throw new RuntimeException("Stub!");
    }
    
    public StreamSource(final InputStream inputStream, final String systemId) {
        throw new RuntimeException("Stub!");
    }
    
    public StreamSource(final Reader reader) {
        throw new RuntimeException("Stub!");
    }
    
    public StreamSource(final Reader reader, final String systemId) {
        throw new RuntimeException("Stub!");
    }
    
    public StreamSource(final String systemId) {
        throw new RuntimeException("Stub!");
    }
    
    public StreamSource(final File f) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInputStream(final InputStream inputStream) {
        throw new RuntimeException("Stub!");
    }
    
    public InputStream getInputStream() {
        throw new RuntimeException("Stub!");
    }
    
    public void setReader(final Reader reader) {
        throw new RuntimeException("Stub!");
    }
    
    public Reader getReader() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPublicId(final String publicId) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPublicId() {
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
    
    public void setSystemId(final File f) {
        throw new RuntimeException("Stub!");
    }
}
