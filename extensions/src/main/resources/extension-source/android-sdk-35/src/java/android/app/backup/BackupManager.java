package android.app.backup;

import android.os.UserHandle;
import android.content.Context;

public class BackupManager
{
    public BackupManager(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public void dataChanged() {
        throw new RuntimeException("Stub!");
    }
    
    public static void dataChanged(final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int requestRestore(final RestoreObserver observer) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public UserHandle getUserForAncestralSerialNumber(final long ancestralSerialNumber) {
        throw new RuntimeException("Stub!");
    }
}
