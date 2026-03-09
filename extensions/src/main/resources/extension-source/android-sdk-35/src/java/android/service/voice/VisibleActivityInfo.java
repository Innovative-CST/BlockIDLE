package android.service.voice;

import android.os.Parcel;
import android.os.Parcelable;

public final class VisibleActivityInfo implements Parcelable
{
    @NonNull
    public static final Creator<VisibleActivityInfo> CREATOR;
    
    VisibleActivityInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public VoiceInteractionSession.ActivityId getActivityId() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
