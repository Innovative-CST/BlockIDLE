package android.view.displayhash;

import android.os.Parcel;
import android.graphics.Rect;
import android.os.Parcelable;

public final class VerifiedDisplayHash implements Parcelable
{
    @NonNull
    public static final Creator<VerifiedDisplayHash> CREATOR;
    
    public VerifiedDisplayHash(final long timeMillis, @NonNull final Rect boundsInWindow, @NonNull final String hashAlgorithm, @NonNull final byte[] imageHash) {
        throw new RuntimeException("Stub!");
    }
    
    public long getTimeMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Rect getBoundsInWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getHashAlgorithm() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] getImageHash() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
