package android.net.wifi.aware;

import android.os.Parcel;
import android.os.Parcelable;

public final class AwarePairingConfig implements Parcelable
{
    @NonNull
    public static final Creator<AwarePairingConfig> CREATOR;
    public static final int PAIRING_BOOTSTRAPPING_NFC_READER = 256;
    public static final int PAIRING_BOOTSTRAPPING_NFC_TAG = 16;
    public static final int PAIRING_BOOTSTRAPPING_OPPORTUNISTIC = 1;
    public static final int PAIRING_BOOTSTRAPPING_PASSPHRASE_DISPLAY = 4;
    public static final int PAIRING_BOOTSTRAPPING_PASSPHRASE_KEYPAD = 64;
    public static final int PAIRING_BOOTSTRAPPING_PIN_CODE_DISPLAY = 2;
    public static final int PAIRING_BOOTSTRAPPING_PIN_CODE_KEYPAD = 32;
    public static final int PAIRING_BOOTSTRAPPING_QR_DISPLAY = 8;
    public static final int PAIRING_BOOTSTRAPPING_QR_SCAN = 128;
    
    AwarePairingConfig() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPairingCacheEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPairingSetupEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPairingVerificationEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBootstrappingMethods() {
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
        public Builder setPairingSetupEnabled(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPairingVerificationEnabled(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPairingCacheEnabled(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBootstrappingMethods(final int methods) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AwarePairingConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
}
