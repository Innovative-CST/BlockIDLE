package android.adservices.measurement;

import android.os.Parcel;
import android.net.Uri;
import java.util.List;
import android.os.Parcelable;

public final class WebTriggerRegistrationRequest implements Parcelable
{
    @NonNull
    public static final Creator<WebTriggerRegistrationRequest> CREATOR;
    
    WebTriggerRegistrationRequest() {
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
    public List<WebTriggerParams> getTriggerParams() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getDestination() {
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
        public Builder(@NonNull final List<WebTriggerParams> webTriggerParams, @NonNull final Uri destination) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public WebTriggerRegistrationRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
