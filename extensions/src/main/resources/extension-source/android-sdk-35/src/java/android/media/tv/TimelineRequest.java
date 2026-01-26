package android.media.tv;

import android.os.Parcel;
import android.os.Parcelable;

public final class TimelineRequest extends BroadcastInfoRequest implements Parcelable
{
    @NonNull
    public static final Creator<TimelineRequest> CREATOR;
    
    public TimelineRequest(final int requestId, final int option, final int intervalMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public TimelineRequest(final int requestId, final int option, final int intervalMillis, @NonNull final String selector) {
        throw new RuntimeException("Stub!");
    }
    
    public int getIntervalMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getSelector() {
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
