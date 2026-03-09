package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

public class PointF implements Parcelable
{
    @NonNull
    public static final Creator<PointF> CREATOR;
    public float x;
    public float y;
    
    public PointF() {
        throw new RuntimeException("Stub!");
    }
    
    public PointF(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public PointF(@NonNull final Point p) {
        throw new RuntimeException("Stub!");
    }
    
    public PointF(@NonNull final PointF p) {
        throw new RuntimeException("Stub!");
    }
    
    public final void set(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public final void set(@NonNull final PointF p) {
        throw new RuntimeException("Stub!");
    }
    
    public final void negate() {
        throw new RuntimeException("Stub!");
    }
    
    public final void offset(final float dx, final float dy) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean equals(final float x, final float y) {
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
    
    public final float length() {
        throw new RuntimeException("Stub!");
    }
    
    public static float length(final float x, final float y) {
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
