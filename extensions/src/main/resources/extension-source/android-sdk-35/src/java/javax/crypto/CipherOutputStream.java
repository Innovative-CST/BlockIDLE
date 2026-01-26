package javax.crypto;

import java.io.IOException;
import java.io.OutputStream;
import java.io.FilterOutputStream;

public class CipherOutputStream extends FilterOutputStream
{
    public CipherOutputStream(final OutputStream os, final Cipher c) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    protected CipherOutputStream(final OutputStream os) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void write(final int b) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void write(final byte[] b) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void write(final byte[] b, final int off, final int len) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void flush() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() throws IOException {
        throw new RuntimeException("Stub!");
    }
}
