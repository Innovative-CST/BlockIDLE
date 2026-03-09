package android.app.usage;

import android.os.Parcel;
import android.os.Parcelable;

public final class EventStats implements Parcelable
{
    @NonNull
    public static final Creator<EventStats> CREATOR;
    
    public EventStats(final EventStats stats) {
        throw new RuntimeException("Stub!");
    }
    
    public int getEventType() {
        throw new RuntimeException("Stub!");
    }
    
    public long getFirstTimeStamp() {
        throw new RuntimeException("Stub!");
    }
    
    public long getLastTimeStamp() {
        throw new RuntimeException("Stub!");
    }
    
    public long getLastEventTime() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCount() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTotalTime() {
        throw new RuntimeException("Stub!");
    }
    
    public void add(final EventStats right) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
