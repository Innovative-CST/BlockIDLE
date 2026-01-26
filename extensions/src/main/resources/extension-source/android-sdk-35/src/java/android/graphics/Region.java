package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

public class Region implements Parcelable
{
    @NonNull
    public static final Creator<Region> CREATOR;
    
    public Region() {
        throw new RuntimeException("Stub!");
    }
    
    public Region(@NonNull final Region region) {
        throw new RuntimeException("Stub!");
    }
    
    public Region(@NonNull final Rect r) {
        throw new RuntimeException("Stub!");
    }
    
    public Region(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void setEmpty() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean set(@NonNull final Region region) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean set(@NonNull final Rect r) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean set(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setPath(@NonNull final Path path, @NonNull final Region clip) {
        throw new RuntimeException("Stub!");
    }
    
    public native boolean isEmpty();
    
    public native boolean isRect();
    
    public native boolean isComplex();
    
    @NonNull
    public Rect getBounds() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getBounds(@NonNull final Rect r) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Path getBoundaryPath() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getBoundaryPath(@NonNull final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    public native boolean contains(final int p0, final int p1);
    
    public boolean quickContains(@NonNull final Rect r) {
        throw new RuntimeException("Stub!");
    }
    
    public native boolean quickContains(final int p0, final int p1, final int p2, final int p3);
    
    public boolean quickReject(@NonNull final Rect r) {
        throw new RuntimeException("Stub!");
    }
    
    public native boolean quickReject(final int p0, final int p1, final int p2, final int p3);
    
    public native boolean quickReject(final Region p0);
    
    public void translate(final int dx, final int dy) {
        throw new RuntimeException("Stub!");
    }
    
    public native void translate(final int p0, final int p1, final Region p2);
    
    public final boolean union(@NonNull final Rect r) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean op(@NonNull final Rect r, @NonNull final Op op) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean op(final int left, final int top, final int right, final int bottom, @NonNull final Op op) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean op(@NonNull final Region region, @NonNull final Op op) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean op(@NonNull final Rect rect, @NonNull final Region region, @NonNull final Op op) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean op(@NonNull final Region region1, @NonNull final Region region2, @NonNull final Op op) {
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
    public void writeToParcel(final Parcel p, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public enum Op
    {
        DIFFERENCE, 
        INTERSECT, 
        UNION, 
        XOR, 
        REVERSE_DIFFERENCE, 
        REPLACE;
    }
}
