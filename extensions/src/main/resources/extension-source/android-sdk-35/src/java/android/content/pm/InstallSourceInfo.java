package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

public final class InstallSourceInfo implements Parcelable
{
    @NonNull
    public static final Creator<InstallSourceInfo> CREATOR;
    
    InstallSourceInfo() {
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
    
    @Nullable
    public String getInitiatingPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SigningInfo getInitiatingPackageSigningInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getOriginatingPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getInstallingPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getUpdateOwnerPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPackageSource() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
