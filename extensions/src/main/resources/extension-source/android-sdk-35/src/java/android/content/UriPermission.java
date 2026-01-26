package android.content;

import android.os.Parcel;
import android.net.Uri;
import android.os.Parcelable;

public final class UriPermission implements Parcelable
{
    @NonNull
    public static final Creator<UriPermission> CREATOR;
    public static final long INVALID_TIME = Long.MIN_VALUE;
    
    UriPermission() {
        throw new RuntimeException("Stub!");
    }
    
    public Uri getUri() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isReadPermission() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWritePermission() {
        throw new RuntimeException("Stub!");
    }
    
    public long getPersistedTime() {
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
