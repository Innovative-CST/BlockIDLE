package android.speech;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class RecognitionSupport implements Parcelable
{
    @NonNull
    public static final Creator<RecognitionSupport> CREATOR;
    
    RecognitionSupport() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getInstalledOnDeviceLanguages() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getPendingOnDeviceLanguages() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getSupportedOnDeviceLanguages() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getOnlineLanguages() {
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
        public Builder setInstalledOnDeviceLanguages(@NonNull final List<String> value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addInstalledOnDeviceLanguage(@NonNull final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPendingOnDeviceLanguages(@NonNull final List<String> value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addPendingOnDeviceLanguage(@NonNull final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSupportedOnDeviceLanguages(@NonNull final List<String> value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addSupportedOnDeviceLanguage(@NonNull final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setOnlineLanguages(@NonNull final List<String> value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addOnlineLanguage(@NonNull final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public RecognitionSupport build() {
            throw new RuntimeException("Stub!");
        }
    }
}
