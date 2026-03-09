package android.app.usage;

import android.content.pm.PackageManager;
import android.os.UserHandle;
import java.io.IOException;
import java.util.UUID;

public class StorageStatsManager
{
    StorageStatsManager() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTotalBytes(@NonNull final UUID storageUuid) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public long getFreeBytes(@NonNull final UUID storageUuid) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public StorageStats queryStatsForPackage(@NonNull final UUID storageUuid, @NonNull final String packageName, @NonNull final UserHandle user) throws IOException, PackageManager.NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public StorageStats queryStatsForUid(@NonNull final UUID storageUuid, final int uid) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public StorageStats queryStatsForUser(@NonNull final UUID storageUuid, @NonNull final UserHandle user) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ExternalStorageStats queryExternalStatsForUser(@NonNull final UUID storageUuid, @NonNull final UserHandle user) throws IOException {
        throw new RuntimeException("Stub!");
    }
}
