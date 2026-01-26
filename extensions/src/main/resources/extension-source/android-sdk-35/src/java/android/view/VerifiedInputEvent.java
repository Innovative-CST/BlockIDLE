package android.view;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class VerifiedInputEvent implements Parcelable
{
    @NonNull
    public static final Creator<VerifiedInputEvent> CREATOR;
    
    VerifiedInputEvent() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDeviceId() {
        throw new RuntimeException("Stub!");
    }
    
    public long getEventTimeNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSource() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDisplayId() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
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
}
