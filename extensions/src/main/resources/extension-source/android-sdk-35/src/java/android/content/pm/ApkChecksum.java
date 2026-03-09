package android.content.pm;

import android.os.Parcel;
import java.security.cert.CertificateException;
import java.security.cert.Certificate;
import android.os.Parcelable;

public final class ApkChecksum implements Parcelable
{
    @NonNull
    public static final Creator<ApkChecksum> CREATOR;
    
    ApkChecksum() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] getValue() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Certificate getInstallerCertificate() throws CertificateException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getSplitName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getInstallerPackageName() {
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
