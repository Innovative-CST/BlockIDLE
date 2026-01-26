package android.view;

import android.os.Parcel;
import android.graphics.Path;
import android.os.Parcelable;

public final class DisplayShape implements Parcelable
{
    @NonNull
    public static final Creator<DisplayShape> CREATOR;
    
    DisplayShape() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Path getPath() {
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
