package android.app.sdksandbox;

import android.os.Parcel;
import android.os.IBinder;
import android.os.Parcelable;

public final class AppOwnedSdkSandboxInterface implements Parcelable
{
    @NonNull
    public static final Creator<AppOwnedSdkSandboxInterface> CREATOR;
    
    public AppOwnedSdkSandboxInterface(@NonNull final String name, final long version, @NonNull final IBinder binder) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public long getVersion() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public IBinder getInterface() {
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
    
    static {
        CREATOR = null;
    }
}
