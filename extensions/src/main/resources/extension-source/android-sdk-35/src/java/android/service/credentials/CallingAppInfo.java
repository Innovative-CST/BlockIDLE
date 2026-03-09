package android.service.credentials;

import android.os.Parcel;
import android.content.pm.SigningInfo;
import android.os.Parcelable;

public final class CallingAppInfo implements Parcelable
{
    @NonNull
    public static final Creator<CallingAppInfo> CREATOR;
    
    public CallingAppInfo(@NonNull final String packageName, @NonNull final SigningInfo signingInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public CallingAppInfo(@NonNull final String packageName, @NonNull final SigningInfo signingInfo, @Nullable final String origin) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SigningInfo getSigningInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getOrigin() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
