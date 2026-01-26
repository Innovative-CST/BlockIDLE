package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

public final class Checksum implements Parcelable
{
    @NonNull
    public static final Creator<Checksum> CREATOR;
    public static final int TYPE_PARTIAL_MERKLE_ROOT_1M_SHA256 = 32;
    public static final int TYPE_PARTIAL_MERKLE_ROOT_1M_SHA512 = 64;
    @Deprecated
    public static final int TYPE_WHOLE_MD5 = 2;
    public static final int TYPE_WHOLE_MERKLE_ROOT_4K_SHA256 = 1;
    @Deprecated
    public static final int TYPE_WHOLE_SHA1 = 4;
    @Deprecated
    public static final int TYPE_WHOLE_SHA256 = 8;
    @Deprecated
    public static final int TYPE_WHOLE_SHA512 = 16;
    
    public Checksum(final int type, @NonNull final byte[] value) {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] getValue() {
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
