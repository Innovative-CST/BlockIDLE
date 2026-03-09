package android.os.health;

import android.os.Parcel;
import android.os.Parcelable;

public final class TimerStat implements Parcelable
{
    @NonNull
    public static final Creator<TimerStat> CREATOR;
    
    public TimerStat() {
        throw new RuntimeException("Stub!");
    }
    
    public TimerStat(final int count, final long time) {
        throw new RuntimeException("Stub!");
    }
    
    public TimerStat(final Parcel in) {
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
    
    public void setCount(final int count) {
        throw new RuntimeException("Stub!");
    }
    
    public int getCount() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTime(final long time) {
        throw new RuntimeException("Stub!");
    }
    
    public long getTime() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
