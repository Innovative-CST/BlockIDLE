package android.app.backup;

import android.os.ParcelFileDescriptor;
import android.content.Context;

public class SharedPreferencesBackupHelper implements BackupHelper
{
    public SharedPreferencesBackupHelper(final Context context, final String... prefGroups) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void performBackup(final ParcelFileDescriptor oldState, final BackupDataOutput data, final ParcelFileDescriptor newState) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void restoreEntity(final BackupDataInputStream data) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeNewStateDescription(final ParcelFileDescriptor fd) {
        throw new RuntimeException("Stub!");
    }
}
