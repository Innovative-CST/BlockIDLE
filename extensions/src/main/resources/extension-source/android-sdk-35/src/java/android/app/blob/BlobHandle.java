package android.app.blob;

import android.os.Parcel;
import android.os.Parcelable;

public final class BlobHandle implements Parcelable
{
    @NonNull
    public static final Creator<BlobHandle> CREATOR;
    
    BlobHandle() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static BlobHandle createWithSha256(@NonNull final byte[] digest, @NonNull final CharSequence label, final long expiryTimeMillis, @NonNull final String tag) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] getSha256Digest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getLabel() {
        throw new RuntimeException("Stub!");
    }
    
    public long getExpiryTimeMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getTag() {
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
    
    @Override
    public boolean equals(final Object obj) {
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
