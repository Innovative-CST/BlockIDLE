package android.app;

import android.os.Parcel;
import android.os.Parcelable;

public final class PictureInPictureUiState implements Parcelable
{
    @NonNull
    public static final Creator<PictureInPictureUiState> CREATOR;
    
    PictureInPictureUiState() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isStashed() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTransitioningToPip() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
