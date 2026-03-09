package android.app.sdksandbox;

import android.os.Parcel;
import android.content.pm.SharedLibraryInfo;
import android.os.IBinder;
import android.os.Parcelable;

public final class SandboxedSdk implements Parcelable
{
    @NonNull
    public static final Creator<SandboxedSdk> CREATOR;
    
    public SandboxedSdk(@NonNull final IBinder sdkInterface) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public IBinder getInterface() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SharedLibraryInfo getSharedLibraryInfo() {
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
