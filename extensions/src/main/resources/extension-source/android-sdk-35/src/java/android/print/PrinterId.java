package android.print;

import android.os.Parcel;
import android.os.Parcelable;

public final class PrinterId implements Parcelable
{
    @NonNull
    public static final Creator<PrinterId> CREATOR;
    
    PrinterId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getLocalId() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object object) {
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
    
    static {
        CREATOR = null;
    }
}
