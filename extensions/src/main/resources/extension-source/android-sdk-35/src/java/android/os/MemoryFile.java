package android.os;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;

public class MemoryFile
{
    public MemoryFile(final String name, final int length) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    public int length() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isPurgingAllowed() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public synchronized boolean allowPurging(final boolean allowPurging) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public InputStream getInputStream() {
        throw new RuntimeException("Stub!");
    }
    
    public OutputStream getOutputStream() {
        throw new RuntimeException("Stub!");
    }
    
    public int readBytes(final byte[] buffer, final int srcOffset, final int destOffset, final int count) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void writeBytes(final byte[] buffer, final int srcOffset, final int destOffset, final int count) throws IOException {
        throw new RuntimeException("Stub!");
    }
}
