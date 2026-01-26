package android.view.displayhash;

import android.os.Parcel;
import android.os.Parcelable;

public final class DisplayHash implements Parcelable
{
    @NonNull
    public static final Creator<DisplayHash> CREATOR;
    
    DisplayHash() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
