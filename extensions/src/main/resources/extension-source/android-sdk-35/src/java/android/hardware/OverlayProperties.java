package android.hardware;

import android.os.Parcel;
import android.os.Parcelable;

public final class OverlayProperties implements Parcelable
{
    @NonNull
    public static final Creator<OverlayProperties> CREATOR;
    
    OverlayProperties() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCombinationSupported(final int dataspace, final int format) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMixedColorSpacesSupported() {
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
    
    static {
        CREATOR = null;
    }
}
