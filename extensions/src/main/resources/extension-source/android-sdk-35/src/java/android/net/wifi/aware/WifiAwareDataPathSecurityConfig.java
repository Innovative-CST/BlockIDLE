package android.net.wifi.aware;

import android.os.Parcel;
import android.os.Parcelable;

public final class WifiAwareDataPathSecurityConfig implements Parcelable
{
    @NonNull
    public static final Creator<WifiAwareDataPathSecurityConfig> CREATOR;
    
    WifiAwareDataPathSecurityConfig() {
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
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCipherSuite() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getPmk() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getPmkId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getPskPassphrase() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(final int cipherSuite) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPskPassphrase(@NonNull final String pskPassphrase) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPmk(@NonNull final byte[] pmk) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPmkId(@NonNull final byte[] pmkId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public WifiAwareDataPathSecurityConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
}
