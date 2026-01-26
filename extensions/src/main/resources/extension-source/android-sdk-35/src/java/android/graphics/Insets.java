package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

public final class Insets implements Parcelable
{
    @NonNull
    public static final Creator<Insets> CREATOR;
    @NonNull
    public static final Insets NONE;
    public final int bottom;
    public final int left;
    public final int right;
    public final int top;
    
    Insets() {
        this.bottom = 0;
        this.left = 0;
        this.right = 0;
        this.top = 0;
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Insets of(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Insets of(@Nullable final Rect r) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Insets add(@NonNull final Insets a, @NonNull final Insets b) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Insets subtract(@NonNull final Insets a, @NonNull final Insets b) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Insets max(@NonNull final Insets a, @NonNull final Insets b) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Insets min(@NonNull final Insets a, @NonNull final Insets b) {
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
    
    static {
        CREATOR = null;
        NONE = null;
    }
}
