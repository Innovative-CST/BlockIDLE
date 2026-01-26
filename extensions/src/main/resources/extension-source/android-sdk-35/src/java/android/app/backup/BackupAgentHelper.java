package android.app.backup;

import java.io.IOException;
import android.os.ParcelFileDescriptor;

public class BackupAgentHelper extends BackupAgent
{
    public BackupAgentHelper() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onBackup(final ParcelFileDescriptor oldState, final BackupDataOutput data, final ParcelFileDescriptor newState) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onRestore(final BackupDataInput data, final int appVersionCode, final ParcelFileDescriptor newState) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void addHelper(final String keyPrefix, final BackupHelper helper) {
        throw new RuntimeException("Stub!");
    }
}
