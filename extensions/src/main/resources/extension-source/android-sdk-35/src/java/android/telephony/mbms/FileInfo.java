package android.telephony.mbms;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public final class FileInfo implements Parcelable
{
    @NonNull
    public static final Creator<FileInfo> CREATOR;
    
    FileInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    public Uri getUri() {
        throw new RuntimeException("Stub!");
    }
    
    public String getMimeType() {
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
    
    static {
        CREATOR = null;
    }
}
