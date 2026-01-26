package android.companion.virtual;

import android.os.Parcel;
import android.os.Parcelable;

public final class VirtualDevice implements Parcelable
{
    @NonNull
    public static final Creator<VirtualDevice> CREATOR;
    
    VirtualDevice() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDeviceId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getPersistentDeviceId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getDisplayName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getDisplayIds() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasCustomSensorSupport() {
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
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
