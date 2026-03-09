package android.content;

import android.os.Parcel;
import android.os.Parcelable;

public class SyncAdapterType implements Parcelable
{
    @NonNull
    public static final Creator<SyncAdapterType> CREATOR;
    public final String accountType;
    public final String authority;
    public final boolean isKey;
    
    public SyncAdapterType(final String authority, final String accountType, final boolean userVisible, final boolean supportsUploading) {
        this.accountType = null;
        this.authority = null;
        this.isKey = false;
        throw new RuntimeException("Stub!");
    }
    
    public SyncAdapterType(final Parcel source) {
        this.accountType = null;
        this.authority = null;
        this.isKey = false;
        throw new RuntimeException("Stub!");
    }
    
    public boolean supportsUploading() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUserVisible() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean allowParallelSyncs() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAlwaysSyncable() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSettingsActivity() {
        throw new RuntimeException("Stub!");
    }
    
    public static SyncAdapterType newKey(final String authority, final String accountType) {
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
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
