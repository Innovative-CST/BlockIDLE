package android.media.tv;

import android.os.Parcel;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

public final class AdRequest implements Parcelable
{
    @NonNull
    public static final Creator<AdRequest> CREATOR;
    public static final int REQUEST_TYPE_START = 1;
    public static final int REQUEST_TYPE_STOP = 2;
    
    public AdRequest(final int id, final int requestType, @Nullable final ParcelFileDescriptor fileDescriptor, final long startTime, final long stopTime, final long echoInterval, @Nullable final String mediaFileType, @NonNull final Bundle metadata) {
        throw new RuntimeException("Stub!");
    }
    
    public AdRequest(final int id, final int requestType, @Nullable final Uri uri, final long startTime, final long stopTime, final long echoInterval, @NonNull final Bundle metadata) {
        throw new RuntimeException("Stub!");
    }
    
    public int getId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRequestType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ParcelFileDescriptor getFileDescriptor() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri getUri() {
        throw new RuntimeException("Stub!");
    }
    
    public long getStartTimeMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public long getStopTimeMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public long getEchoIntervalMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getMediaFileType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getMetadata() {
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
    
    static {
        CREATOR = null;
    }
}
