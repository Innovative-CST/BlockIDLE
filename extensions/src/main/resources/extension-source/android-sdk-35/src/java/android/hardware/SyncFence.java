package android.hardware;

import android.os.Parcel;
import java.time.Duration;
import android.os.Parcelable;

public final class SyncFence implements AutoCloseable, Parcelable
{
    @NonNull
    public static final Creator<SyncFence> CREATOR;
    public static final long SIGNAL_TIME_INVALID = -1L;
    public static final long SIGNAL_TIME_PENDING = Long.MAX_VALUE;
    
    public SyncFence(@NonNull final SyncFence other) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isValid() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean await(@NonNull final Duration timeout) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean awaitForever() {
        throw new RuntimeException("Stub!");
    }
    
    public long getSignalTime() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
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
}
