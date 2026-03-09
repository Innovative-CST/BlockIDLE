package android.view;

import android.os.Parcel;
import android.graphics.Point;
import android.os.Parcelable;

public final class RoundedCorner implements Parcelable
{
    @NonNull
    public static final Creator<RoundedCorner> CREATOR;
    public static final int POSITION_BOTTOM_LEFT = 3;
    public static final int POSITION_BOTTOM_RIGHT = 2;
    public static final int POSITION_TOP_LEFT = 0;
    public static final int POSITION_TOP_RIGHT = 1;
    
    public RoundedCorner(final int position, final int radius, final int centerX, final int centerY) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPosition() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRadius() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Point getCenter() {
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
    public String toString() {
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
