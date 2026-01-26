package android.os.storage;

import android.os.ParcelFileDescriptor;
import android.os.Handler;
import android.os.ProxyFileDescriptorCallback;
import java.util.List;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.File;
import android.app.PendingIntent;
import java.util.concurrent.Executor;
import java.util.UUID;

public class StorageManager
{
    public static final String ACTION_CLEAR_APP_CACHE = "android.os.storage.action.CLEAR_APP_CACHE";
    public static final String ACTION_MANAGE_STORAGE = "android.os.storage.action.MANAGE_STORAGE";
    public static final String EXTRA_REQUESTED_BYTES = "android.os.storage.extra.REQUESTED_BYTES";
    public static final String EXTRA_UUID = "android.os.storage.extra.UUID";
    public static final UUID UUID_DEFAULT;
    
    StorageManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerStorageVolumeCallback(@NonNull final Executor executor, @NonNull final StorageVolumeCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterStorageVolumeCallback(@NonNull final StorageVolumeCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean mountObb(final String rawPath, final String key, final OnObbStateChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PendingIntent getManageSpaceActivityIntent(@NonNull final String packageName, final int requestCode) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean unmountObb(final String rawPath, final boolean force, final OnObbStateChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isObbMounted(final String rawPath) {
        throw new RuntimeException("Stub!");
    }
    
    public String getMountedObbPath(final String rawPath) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public UUID getUuidForPath(@NonNull final File path) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAllocationSupported(@NonNull final FileDescriptor fd) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public StorageVolume getStorageVolume(@NonNull final File file) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public StorageVolume getStorageVolume(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<StorageVolume> getStorageVolumes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<StorageVolume> getStorageVolumesIncludingSharedProfiles() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<StorageVolume> getRecentStorageVolumes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public StorageVolume getPrimaryStorageVolume() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEncrypted(final File file) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ParcelFileDescriptor openProxyFileDescriptor(final int mode, final ProxyFileDescriptorCallback callback, final Handler handler) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public long getCacheQuotaBytes(@NonNull final UUID storageUuid) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public long getCacheSizeBytes(@NonNull final UUID storageUuid) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public long getAllocatableBytes(@NonNull final UUID storageUuid) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void allocateBytes(@NonNull final UUID storageUuid, final long bytes) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void allocateBytes(final FileDescriptor fd, final long bytes) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void setCacheBehaviorGroup(final File path, final boolean group) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCacheBehaviorGroup(final File path) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void setCacheBehaviorTombstone(final File path, final boolean tombstone) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCacheBehaviorTombstone(final File path) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCheckpointSupported() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        UUID_DEFAULT = null;
    }
    
    public static class StorageVolumeCallback
    {
        public StorageVolumeCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onStateChanged(@NonNull final StorageVolume volume) {
            throw new RuntimeException("Stub!");
        }
    }
}
