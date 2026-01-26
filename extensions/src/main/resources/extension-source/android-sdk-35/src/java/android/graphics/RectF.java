package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

public class RectF implements Parcelable
{
    @NonNull
    public static final Creator<RectF> CREATOR;
    public float bottom;
    public float left;
    public float right;
    public float top;
    
    public RectF() {
        throw new RuntimeException("Stub!");
    }
    
    public RectF(final float left, final float top, final float right, final float bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public RectF(@Nullable final RectF r) {
        throw new RuntimeException("Stub!");
    }
    
    public RectF(@Nullable final Rect r) {
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
    
    @NonNull
    public String toShortString() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isEmpty() {
        throw new RuntimeException("Stub!");
    }
    
    public final float width() {
        throw new RuntimeException("Stub!");
    }
    
    public final float height() {
        throw new RuntimeException("Stub!");
    }
    
    public final float centerX() {
        throw new RuntimeException("Stub!");
    }
    
    public final float centerY() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEmpty() {
        throw new RuntimeException("Stub!");
    }
    
    public void set(final float left, final float top, final float right, final float bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void set(@NonNull final RectF src) {
        throw new RuntimeException("Stub!");
    }
    
    public void set(@NonNull final Rect src) {
        throw new RuntimeException("Stub!");
    }
    
    public void offset(final float dx, final float dy) {
        throw new RuntimeException("Stub!");
    }
    
    public void offsetTo(final float newLeft, final float newTop) {
        throw new RuntimeException("Stub!");
    }
    
    public void inset(final float dx, final float dy) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean contains(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean contains(final float left, final float top, final float right, final float bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean contains(@NonNull final RectF r) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean intersect(final float left, final float top, final float right, final float bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean intersect(@NonNull final RectF r) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setIntersect(@NonNull final RectF a, @NonNull final RectF b) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean intersects(final float left, final float top, final float right, final float bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean intersects(@NonNull final RectF a, @NonNull final RectF b) {
        throw new RuntimeException("Stub!");
    }
    
    public void round(@NonNull final Rect dst) {
        throw new RuntimeException("Stub!");
    }
    
    public void roundOut(@NonNull final Rect dst) {
        throw new RuntimeException("Stub!");
    }
    
    public void union(final float left, final float top, final float right, final float bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void union(@NonNull final RectF r) {
        throw new RuntimeException("Stub!");
    }
    
    public void union(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public void sort() {
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
