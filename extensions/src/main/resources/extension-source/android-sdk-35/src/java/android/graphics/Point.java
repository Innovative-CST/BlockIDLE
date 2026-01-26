package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

public class Point implements Parcelable
{
    @NonNull
    public static final Creator<Point> CREATOR;
    public int x;
    public int y;
    
    public Point() {
        throw new RuntimeException("Stub!");
    }
    
    public Point(final int x, final int y) {
        throw new RuntimeException("Stub!");
    }
    
    public Point(@NonNull final Point src) {
        throw new RuntimeException("Stub!");
    }
    
    public void set(final int x, final int y) {
        throw new RuntimeException("Stub!");
    }
    
    public final void negate() {
        throw new RuntimeException("Stub!");
    }
    
    public final void offset(final int dx, final int dy) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean equals(final int x, final int y) {
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
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void readFromParcel(@NonNull final Parcel in) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
