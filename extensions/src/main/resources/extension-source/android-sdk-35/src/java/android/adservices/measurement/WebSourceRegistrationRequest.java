package android.adservices.measurement;

import android.os.Parcel;
import android.view.InputEvent;
import android.net.Uri;
import java.util.List;
import android.os.Parcelable;

public final class WebSourceRegistrationRequest implements Parcelable
{
    @NonNull
    public static final Creator<WebSourceRegistrationRequest> CREATOR;
    
    WebSourceRegistrationRequest() {
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
    public List<WebSourceParams> getSourceParams() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getTopOriginUri() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public InputEvent getInputEvent() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri getAppDestination() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri getWebDestination() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri getVerifiedDestination() {
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
        public Builder(@NonNull final List<WebSourceParams> webSourceParams, @NonNull final Uri topOriginUri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setInputEvent(@Nullable final InputEvent inputEvent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAppDestination(@Nullable final Uri appDestination) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setWebDestination(@Nullable final Uri webDestination) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVerifiedDestination(@Nullable final Uri verifiedDestination) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public WebSourceRegistrationRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
