package android.telephony.euicc;

import android.os.Parcel;
import android.os.Parcelable;

public final class DownloadableSubscription implements Parcelable
{
    @NonNull
    public static final Creator<DownloadableSubscription> CREATOR;
    
    DownloadableSubscription() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getEncodedActivationCode() {
        throw new RuntimeException("Stub!");
    }
    
    public static DownloadableSubscription forActivationCode(final String encodedActivationCode) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getConfirmationCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
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
        public Builder(@NonNull final DownloadableSubscription baseSubscription) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final String encodedActivationCode) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public DownloadableSubscription build() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEncodedActivationCode(@NonNull final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setConfirmationCode(@NonNull final String value) {
            throw new RuntimeException("Stub!");
        }
    }
}
