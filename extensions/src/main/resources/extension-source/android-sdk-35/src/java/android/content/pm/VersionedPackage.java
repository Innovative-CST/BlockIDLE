package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

public final class VersionedPackage implements Parcelable
{
    @NonNull
    public static final Creator<VersionedPackage> CREATOR;
    
    public VersionedPackage(@NonNull final String packageName, final int versionCode) {
        throw new RuntimeException("Stub!");
    }
    
    public VersionedPackage(@NonNull final String packageName, final long versionCode) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getVersionCode() {
        throw new RuntimeException("Stub!");
    }
    
    public long getLongVersionCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
