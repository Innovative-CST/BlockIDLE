package android.app.backup;

import android.os.ParcelFileDescriptor;

public interface BackupHelper
{
    void performBackup(final ParcelFileDescriptor p0, final BackupDataOutput p1, final ParcelFileDescriptor p2);
    
    void restoreEntity(final BackupDataInputStream p0);
    
    void writeNewStateDescription(final ParcelFileDescriptor p0);
}
