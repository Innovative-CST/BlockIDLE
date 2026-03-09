package android.util;

import android.os.Parcel;
import android.os.Parcelable;

public final class SizeF implements Parcelable
{
    @NonNull
    public static final Creator<SizeF> CREATOR;
    
    public SizeF(final float width, final float height) {
        throw new RuntimeException("Stub!");
    }
    
    public float getWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public float getHeight() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static SizeF parseSizeF(final String string) throws NumberFormatException {
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
