package android.media.tv;

import android.os.Parcel;
import android.net.Uri;
import android.os.Parcelable;

public final class TimelineResponse extends BroadcastInfoResponse implements Parcelable
{
    @NonNull
    public static final Creator<TimelineResponse> CREATOR;
    
    public TimelineResponse(final int requestId, final int sequence, final int responseResult, @Nullable final String selector, final int unitsPerTick, final int unitsPerSecond, final long wallClock, final long ticks) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri getSelector() {
        throw new RuntimeException("Stub!");
    }
    
    public int getUnitsPerTick() {
        throw new RuntimeException("Stub!");
    }
    
    public int getUnitsPerSecond() {
        throw new RuntimeException("Stub!");
    }
    
    public long getWallClock() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTicks() {
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
