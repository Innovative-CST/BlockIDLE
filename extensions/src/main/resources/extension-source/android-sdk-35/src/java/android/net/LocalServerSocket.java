package android.net;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.Closeable;

public class LocalServerSocket implements Closeable
{
    public LocalServerSocket(final String name) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public LocalServerSocket(final FileDescriptor fd) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public LocalSocketAddress getLocalSocketAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public LocalSocket accept() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public FileDescriptor getFileDescriptor() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() throws IOException {
        throw new RuntimeException("Stub!");
    }
}
