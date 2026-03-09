package android.telephony.mbms;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public final class DownloadRequest implements Parcelable
{
    @NonNull
    public static final Creator<DownloadRequest> CREATOR;
    
    DownloadRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public String getFileServiceId() {
        throw new RuntimeException("Stub!");
    }
    
    public Uri getSourceUri() {
        throw new RuntimeException("Stub!");
    }
    
    public Uri getDestinationUri() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSubscriptionId() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] toByteArray() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMaxAppIntentSize() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMaxDestinationUriSize() {
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
    
    static {
        CREATOR = null;
    }
    
    public static class Builder
    {
        public Builder(@NonNull final Uri sourceUri, @NonNull final Uri destinationUri) {
            throw new RuntimeException("Stub!");
        }
        
        public static Builder fromDownloadRequest(final DownloadRequest other) {
            throw new RuntimeException("Stub!");
        }
        
        public static Builder fromSerializedRequest(final byte[] data) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setServiceInfo(final FileServiceInfo serviceInfo) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setSubscriptionId(final int subscriptionId) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setAppIntent(final Intent intent) {
            throw new RuntimeException("Stub!");
        }
        
        public DownloadRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
