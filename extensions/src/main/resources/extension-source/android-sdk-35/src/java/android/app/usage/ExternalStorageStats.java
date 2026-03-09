package android.app.usage;

import android.os.Parcel;
import android.os.Parcelable;

public final class ExternalStorageStats implements Parcelable
{
    @NonNull
    public static final Creator<ExternalStorageStats> CREATOR;
    
    ExternalStorageStats() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTotalBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public long getAudioBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public long getVideoBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public long getImageBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public long getAppBytes() {
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
