package android.app.admin;

import android.os.Parcel;
import android.os.Parcelable;

public final class SystemUpdateInfo implements Parcelable
{
    @NonNull
    public static final Creator<SystemUpdateInfo> CREATOR;
    public static final int SECURITY_PATCH_STATE_FALSE = 1;
    public static final int SECURITY_PATCH_STATE_TRUE = 2;
    public static final int SECURITY_PATCH_STATE_UNKNOWN = 0;
    
    SystemUpdateInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public long getReceivedTime() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSecurityPatchState() {
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
    
    static {
        CREATOR = null;
    }
}
