package android.media.projection;

import android.os.Parcel;
import android.os.Parcelable;

public final class MediaProjectionConfig implements Parcelable
{
    @NonNull
    public static final Creator<MediaProjectionConfig> CREATOR;
    
    MediaProjectionConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static MediaProjectionConfig createConfigForDefaultDisplay() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static MediaProjectionConfig createConfigForUserChoice() {
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
