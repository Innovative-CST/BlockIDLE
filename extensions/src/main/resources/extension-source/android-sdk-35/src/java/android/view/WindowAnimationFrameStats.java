package android.view;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class WindowAnimationFrameStats extends FrameStats implements Parcelable
{
    @Deprecated
    @NonNull
    public static final Creator<WindowAnimationFrameStats> CREATOR;
    
    WindowAnimationFrameStats() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
