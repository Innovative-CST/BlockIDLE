package android.companion;

import android.os.Parcel;
import android.net.MacAddress;
import android.os.Parcelable;

public final class AssociationInfo implements Parcelable
{
    @NonNull
    public static final Creator<AssociationInfo> CREATOR;
    
    AssociationInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public int getId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MacAddress getDeviceMacAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getDisplayName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getDeviceProfile() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AssociatedDevice getAssociatedDevice() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSelfManaged() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSystemDataSyncFlags() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
