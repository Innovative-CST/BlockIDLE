package android.view.contentcapture;

import android.os.Parcel;
import android.content.LocusId;
import android.os.Bundle;
import android.os.Parcelable;

public final class ContentCaptureContext implements Parcelable
{
    @NonNull
    public static final Creator<ContentCaptureContext> CREATOR;
    
    ContentCaptureContext() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public LocusId getLocusId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ContentCaptureContext forLocusId(@NonNull final String id) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final LocusId id) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExtras(@NonNull final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ContentCaptureContext build() {
            throw new RuntimeException("Stub!");
        }
    }
}
