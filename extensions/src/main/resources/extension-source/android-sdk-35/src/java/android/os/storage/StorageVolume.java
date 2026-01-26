package android.os.storage;

import android.os.Parcel;
import android.content.Intent;
import java.util.UUID;
import android.os.UserHandle;
import android.content.Context;
import java.io.File;
import android.os.Parcelable;

public final class StorageVolume implements Parcelable
{
    @NonNull
    public static final Creator<StorageVolume> CREATOR;
    public static final String EXTRA_STORAGE_VOLUME = "android.os.storage.extra.STORAGE_VOLUME";
    
    StorageVolume() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public File getDirectory() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDescription(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPrimary() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRemovable() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEmulated() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public UserHandle getOwner() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public UUID getStorageUuid() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getUuid() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getMediaStoreVolumeName() {
        throw new RuntimeException("Stub!");
    }
    
    public String getState() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public Intent createAccessIntent(final String directoryName) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Intent createOpenDocumentTreeIntent() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
