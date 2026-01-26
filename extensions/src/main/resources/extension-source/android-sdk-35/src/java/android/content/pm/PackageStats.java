package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public class PackageStats implements Parcelable
{
    @Deprecated
    @NonNull
    public static final Creator<PackageStats> CREATOR;
    @Deprecated
    public long cacheSize;
    @Deprecated
    public long codeSize;
    @Deprecated
    public long dataSize;
    @Deprecated
    public long externalCacheSize;
    @Deprecated
    public long externalCodeSize;
    @Deprecated
    public long externalDataSize;
    @Deprecated
    public long externalMediaSize;
    @Deprecated
    public long externalObbSize;
    @Deprecated
    public String packageName;
    
    @Deprecated
    public PackageStats(final String pkgName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public PackageStats(final Parcel source) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public PackageStats(final PackageStats pStats) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void writeToParcel(final Parcel dest, final int parcelableFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
