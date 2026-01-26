package android.companion;

import android.os.Parcel;
import android.os.Parcelable;

public final class AssociationRequest implements Parcelable
{
    @NonNull
    public static final Creator<AssociationRequest> CREATOR;
    public static final String DEVICE_PROFILE_APP_STREAMING = "android.app.role.COMPANION_DEVICE_APP_STREAMING";
    public static final String DEVICE_PROFILE_AUTOMOTIVE_PROJECTION = "android.app.role.SYSTEM_AUTOMOTIVE_PROJECTION";
    public static final String DEVICE_PROFILE_COMPUTER = "android.app.role.COMPANION_DEVICE_COMPUTER";
    public static final String DEVICE_PROFILE_GLASSES = "android.app.role.COMPANION_DEVICE_GLASSES";
    public static final String DEVICE_PROFILE_NEARBY_DEVICE_STREAMING = "android.app.role.COMPANION_DEVICE_NEARBY_DEVICE_STREAMING";
    public static final String DEVICE_PROFILE_WATCH = "android.app.role.COMPANION_DEVICE_WATCH";
    
    AssociationRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getDeviceProfile() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getDisplayName() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSelfManaged() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isForceConfirmation() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSingleDevice() {
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
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSingleDevice(final boolean singleDevice) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addDeviceFilter(@Nullable final DeviceFilter<?> deviceFilter) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDeviceProfile(@NonNull final String deviceProfile) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDisplayName(@NonNull final CharSequence displayName) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSelfManaged(final boolean selfManaged) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setForceConfirmation(final boolean forceConfirmation) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AssociationRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
