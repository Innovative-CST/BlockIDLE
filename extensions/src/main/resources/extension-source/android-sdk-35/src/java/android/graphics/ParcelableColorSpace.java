package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

public final class ParcelableColorSpace implements Parcelable
{
    @NonNull
    public static final Creator<ParcelableColorSpace> CREATOR;
    
    public ParcelableColorSpace(@NonNull final ColorSpace colorSpace) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isParcelable(@NonNull final ColorSpace colorSpace) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ColorSpace getColorSpace() {
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
