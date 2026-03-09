package android.nfc;

import android.os.Parcel;
import android.os.Parcelable;

public final class Tag implements Parcelable
{
    @NonNull
    public static final Creator<Tag> CREATOR;
    
    Tag() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getId() {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getTechList() {
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
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
