package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

public final class Rect implements Parcelable
{
    @NonNull
    public static final Creator<Rect> CREATOR;
    public int bottom;
    public int left;
    public int right;
    public int top;
    
    public Rect() {
        throw new RuntimeException("Stub!");
    }
    
    public Rect(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public Rect(@Nullable final Rect r) {
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
    
    @NonNull
    public String flattenToString() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static Rect unflattenFromString(@Nullable final String str) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEmpty() {
        throw new RuntimeException("Stub!");
    }
    
    public int width() {
        throw new RuntimeException("Stub!");
    }
    
    public int height() {
        throw new RuntimeException("Stub!");
    }
    
    public int centerX() {
        throw new RuntimeException("Stub!");
    }
    
    public int centerY() {
        throw new RuntimeException("Stub!");
    }
    
    public float exactCenterX() {
        throw new RuntimeException("Stub!");
    }
    
    public float exactCenterY() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEmpty() {
        throw new RuntimeException("Stub!");
    }
    
    public void set(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void set(@NonNull final Rect src) {
        throw new RuntimeException("Stub!");
    }
    
    public void offset(final int dx, final int dy) {
        throw new RuntimeException("Stub!");
    }
    
    public void offsetTo(final int newLeft, final int newTop) {
        throw new RuntimeException("Stub!");
    }
    
    public void inset(final int dx, final int dy) {
        throw new RuntimeException("Stub!");
    }
    
    public void inset(@NonNull final Insets insets) {
        throw new RuntimeException("Stub!");
    }
    
    public void inset(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean contains(final int x, final int y) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean contains(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean contains(@NonNull final Rect r) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean intersect(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean intersect(@NonNull final Rect r) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setIntersect(@NonNull final Rect a, @NonNull final Rect b) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean intersects(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean intersects(@NonNull final Rect a, @NonNull final Rect b) {
        throw new RuntimeException("Stub!");
    }
    
    public void union(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void union(@NonNull final Rect r) {
        throw new RuntimeException("Stub!");
    }
    
    public void union(final int x, final int y) {
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
