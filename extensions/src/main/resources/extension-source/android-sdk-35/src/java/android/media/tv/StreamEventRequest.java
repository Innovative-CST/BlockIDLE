package android.media.tv;

import android.os.Parcel;
import android.net.Uri;
import android.os.Parcelable;

public final class StreamEventRequest extends BroadcastInfoRequest implements Parcelable
{
    @NonNull
    public static final Creator<StreamEventRequest> CREATOR;
    
    public StreamEventRequest(final int requestId, final int option, @NonNull final Uri targetUri, @NonNull final String eventName) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getTargetUri() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getEventName() {
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
