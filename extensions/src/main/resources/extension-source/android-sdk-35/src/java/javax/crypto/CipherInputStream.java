package javax.crypto;

import java.io.IOException;
import java.io.InputStream;
import java.io.FilterInputStream;

public class CipherInputStream extends FilterInputStream
{
    public CipherInputStream(final InputStream is, final Cipher c) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    protected CipherInputStream(final InputStream is) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int read() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int read(final byte[] b) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int read(final byte[] b, final int off, final int len) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long skip(final long n) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int available() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean markSupported() {
        throw new RuntimeException("Stub!");
    }
}
