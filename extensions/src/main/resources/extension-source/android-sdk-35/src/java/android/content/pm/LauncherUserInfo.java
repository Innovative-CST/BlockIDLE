package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

public final class LauncherUserInfo implements Parcelable
{
    @NonNull
    public static final Creator<LauncherUserInfo> CREATOR;
    
    LauncherUserInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getUserType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getUserSerialNumber() {
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
