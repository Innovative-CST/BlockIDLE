package android.app.backup;

import java.io.IOException;

public class BackupDataInput
{
    BackupDataInput() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public boolean readNextHeader() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public String getKey() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDataSize() {
        throw new RuntimeException("Stub!");
    }
    
    public int readEntityData(final byte[] data, final int offset, final int size) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void skipEntityData() throws IOException {
        throw new RuntimeException("Stub!");
    }
}
