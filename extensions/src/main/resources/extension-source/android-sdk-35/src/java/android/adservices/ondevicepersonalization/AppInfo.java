package android.adservices.ondevicepersonalization;

import android.os.Parcel;
import android.os.Parcelable;

public final class AppInfo implements Parcelable
{
    @NonNull
    public static final Creator<AppInfo> CREATOR;
    
    AppInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public boolean isInstalled() {
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
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
