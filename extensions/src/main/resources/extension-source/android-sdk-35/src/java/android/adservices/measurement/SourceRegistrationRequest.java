package android.adservices.measurement;

import android.os.Parcel;
import android.view.InputEvent;
import android.net.Uri;
import java.util.List;
import android.os.Parcelable;

public final class SourceRegistrationRequest implements Parcelable
{
    @NonNull
    public static final Creator<SourceRegistrationRequest> CREATOR;
    
    SourceRegistrationRequest() {
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
    public List<Uri> getRegistrationUris() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public InputEvent getInputEvent() {
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
        public Builder(@NonNull final List<Uri> registrationUris) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setInputEvent(@Nullable final InputEvent inputEvent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SourceRegistrationRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
