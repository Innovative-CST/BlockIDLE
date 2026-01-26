package android.content.pm;

import android.os.Parcel;
import java.security.PublicKey;
import java.util.Collection;
import android.os.Parcelable;

public final class SigningInfo implements Parcelable
{
    @NonNull
    public static final Creator<SigningInfo> CREATOR;
    
    public SigningInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public SigningInfo(final int schemeVersion, @Nullable final Collection<Signature> apkContentsSigners, @Nullable final Collection<PublicKey> publicKeys, @Nullable final Collection<Signature> signingCertificateHistory) {
        throw new RuntimeException("Stub!");
    }
    
    public SigningInfo(final SigningInfo orig) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasMultipleSigners() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasPastSigningCertificates() {
        throw new RuntimeException("Stub!");
    }
    
    public Signature[] getSigningCertificateHistory() {
        throw new RuntimeException("Stub!");
    }
    
    public Signature[] getApkContentsSigners() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSchemeVersion() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Collection<PublicKey> getPublicKeys() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int parcelableFlags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
