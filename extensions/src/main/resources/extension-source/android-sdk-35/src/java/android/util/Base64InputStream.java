package android.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.FilterInputStream;

public class Base64InputStream extends FilterInputStream
{
    public Base64InputStream(final InputStream in, final int flags) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean markSupported() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void mark(final int readlimit) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int available() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long skip(final long n) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int read() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int read(final byte[] b, final int off, final int len) throws IOException {
        throw new RuntimeException("Stub!");
    }
}
