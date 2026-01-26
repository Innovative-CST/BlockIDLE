package android.nfc;

import android.os.Parcel;
import android.os.Parcelable;

public final class AvailableNfcAntenna implements Parcelable
{
    @NonNull
    public static final Creator<AvailableNfcAntenna> CREATOR;
    
    public AvailableNfcAntenna(final int locationX, final int locationY) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLocationX() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLocationY() {
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
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
