package android.app.backup;

import java.io.IOException;
import java.io.InputStream;

public class BackupDataInputStream extends InputStream
{
    BackupDataInputStream() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int read() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int read(final byte[] b, final int offset, final int size) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int read(final byte[] b) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public String getKey() {
        throw new RuntimeException("Stub!");
    }
    
    public int size() {
        throw new RuntimeException("Stub!");
    }
}
