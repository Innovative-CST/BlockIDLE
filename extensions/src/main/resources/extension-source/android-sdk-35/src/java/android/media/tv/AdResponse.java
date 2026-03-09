package android.media.tv;

import android.os.Parcel;
import android.os.Parcelable;

public final class AdResponse implements Parcelable
{
    @NonNull
    public static final Creator<AdResponse> CREATOR;
    public static final int RESPONSE_TYPE_BUFFERING = 5;
    public static final int RESPONSE_TYPE_ERROR = 4;
    public static final int RESPONSE_TYPE_FINISHED = 2;
    public static final int RESPONSE_TYPE_PLAYING = 1;
    public static final int RESPONSE_TYPE_STOPPED = 3;
    
    public AdResponse(final int id, final int responseType, final long elapsedTime) {
        throw new RuntimeException("Stub!");
    }
    
    public int getId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getResponseType() {
        throw new RuntimeException("Stub!");
    }
    
    public long getElapsedTimeMillis() {
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
