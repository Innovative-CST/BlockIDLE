package android.net;

import java.util.Set;
import android.os.Parcel;
import android.os.Parcelable;

public final class IpSecAlgorithm implements Parcelable
{
    public static final String AUTH_AES_CMAC = "cmac(aes)";
    public static final String AUTH_AES_XCBC = "xcbc(aes)";
    public static final String AUTH_CRYPT_AES_GCM = "rfc4106(gcm(aes))";
    public static final String AUTH_CRYPT_CHACHA20_POLY1305 = "rfc7539esp(chacha20,poly1305)";
    public static final String AUTH_HMAC_MD5 = "hmac(md5)";
    public static final String AUTH_HMAC_SHA1 = "hmac(sha1)";
    public static final String AUTH_HMAC_SHA256 = "hmac(sha256)";
    public static final String AUTH_HMAC_SHA384 = "hmac(sha384)";
    public static final String AUTH_HMAC_SHA512 = "hmac(sha512)";
    @NonNull
    public static final Creator<IpSecAlgorithm> CREATOR;
    public static final String CRYPT_AES_CBC = "cbc(aes)";
    public static final String CRYPT_AES_CTR = "rfc3686(ctr(aes))";
    
    public IpSecAlgorithm(@NonNull final String algorithm, @NonNull final byte[] key) {
        throw new RuntimeException("Stub!");
    }
    
    public IpSecAlgorithm(@NonNull final String algorithm, @NonNull final byte[] key, final int truncLenBits) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] getKey() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTruncationLengthBits() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Set<String> getSupportedAlgorithms() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
