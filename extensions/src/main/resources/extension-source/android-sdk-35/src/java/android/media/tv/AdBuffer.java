package android.media.tv;

import android.os.Parcel;
import android.os.SharedMemory;
import android.os.Parcelable;

public final class AdBuffer implements Parcelable
{
    @NonNull
    public static final Creator<AdBuffer> CREATOR;
    
    public AdBuffer(final int id, @NonNull final String mimeType, @NonNull final SharedMemory buffer, final int offset, final int length, final long presentationTimeUs, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public int getId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getMimeType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SharedMemory getSharedMemory() {
        throw new RuntimeException("Stub!");
    }
    
    public int getOffset() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLength() {
        throw new RuntimeException("Stub!");
    }
    
    public long getPresentationTimeUs() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFlags() {
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
