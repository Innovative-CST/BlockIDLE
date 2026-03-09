package android.adservices.measurement;

import android.os.Parcel;
import android.net.Uri;
import android.os.Parcelable;

public final class WebSourceParams implements Parcelable
{
    @NonNull
    public static final Creator<WebSourceParams> CREATOR;
    
    WebSourceParams() {
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
    
    @NonNull
    public Uri getRegistrationUri() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDebugKeyAllowed() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Uri registrationUri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDebugKeyAllowed(final boolean debugKeyAllowed) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public WebSourceParams build() {
            throw new RuntimeException("Stub!");
        }
    }
}
