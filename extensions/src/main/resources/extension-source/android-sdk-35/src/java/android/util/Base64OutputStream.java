package android.util;

import java.io.IOException;
import java.io.OutputStream;
import java.io.FilterOutputStream;

public class Base64OutputStream extends FilterOutputStream
{
    public Base64OutputStream(final OutputStream out, final int flags) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void write(final int b) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void write(final byte[] b, final int off, final int len) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() throws IOException {
        throw new RuntimeException("Stub!");
    }
}
