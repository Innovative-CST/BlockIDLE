package android.app.backup;

import java.io.IOException;

public class BackupDataOutput
{
    BackupDataOutput() {
        throw new RuntimeException("Stub!");
    }
    
    public long getQuota() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTransportFlags() {
        throw new RuntimeException("Stub!");
    }
    
    public int writeEntityHeader(final String key, final int dataSize) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public int writeEntityData(final byte[] data, final int size) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
}
