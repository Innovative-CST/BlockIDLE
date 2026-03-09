package android.net.wifi.hotspot2.pps;

import android.os.Parcel;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import android.os.Parcelable;

public final class Credential implements Parcelable
{
    @NonNull
    public static final Creator<Credential> CREATOR;
    
    public Credential() {
        throw new RuntimeException("Stub!");
    }
    
    public Credential(final Credential source) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRealm(final String realm) {
        throw new RuntimeException("Stub!");
    }
    
    public String getRealm() {
        throw new RuntimeException("Stub!");
    }
    
    public void setUserCredential(final UserCredential userCredential) {
        throw new RuntimeException("Stub!");
    }
    
    public UserCredential getUserCredential() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCertCredential(final CertificateCredential certCredential) {
        throw new RuntimeException("Stub!");
    }
    
    public CertificateCredential getCertCredential() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSimCredential(final SimCredential simCredential) {
        throw new RuntimeException("Stub!");
    }
    
    public SimCredential getSimCredential() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCaCertificate(final X509Certificate caCertificate) {
        throw new RuntimeException("Stub!");
    }
    
    public X509Certificate getCaCertificate() {
        throw new RuntimeException("Stub!");
    }
    
    public void setClientCertificateChain(final X509Certificate[] certificateChain) {
        throw new RuntimeException("Stub!");
    }
    
    public X509Certificate[] getClientCertificateChain() {
        throw new RuntimeException("Stub!");
    }
    
    public void setClientPrivateKey(final PrivateKey clientPrivateKey) {
        throw new RuntimeException("Stub!");
    }
    
    public PrivateKey getClientPrivateKey() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinimumTlsVersion(final int tlsVersion) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinimumTlsVersion() {
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
    
    @Override
    public boolean equals(final Object thatObject) {
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
    
    public static final class CertificateCredential implements Parcelable
    {
        @NonNull
        public static final Creator<CertificateCredential> CREATOR;
        
        public CertificateCredential() {
            throw new RuntimeException("Stub!");
        }
        
        public CertificateCredential(final CertificateCredential source) {
            throw new RuntimeException("Stub!");
        }
        
        public void setCertType(final String certType) {
            throw new RuntimeException("Stub!");
        }
        
        public String getCertType() {
            throw new RuntimeException("Stub!");
        }
        
        public void setCertSha256Fingerprint(final byte[] certSha256Fingerprint) {
            throw new RuntimeException("Stub!");
        }
        
        public byte[] getCertSha256Fingerprint() {
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
        
        @Override
        public boolean equals(final Object thatObject) {
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
    
    public static final class SimCredential implements Parcelable
    {
        @NonNull
        public static final Creator<SimCredential> CREATOR;
        
        public SimCredential() {
            throw new RuntimeException("Stub!");
        }
        
        public SimCredential(final SimCredential source) {
            throw new RuntimeException("Stub!");
        }
        
        public void setImsi(final String imsi) {
            throw new RuntimeException("Stub!");
        }
        
        public String getImsi() {
            throw new RuntimeException("Stub!");
        }
        
        public void setEapType(final int eapType) {
            throw new RuntimeException("Stub!");
        }
        
        public int getEapType() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object thatObject) {
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
        
        @Override
        public void writeToParcel(final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
    
    public static final class UserCredential implements Parcelable
    {
        @NonNull
        public static final Creator<UserCredential> CREATOR;
        
        public UserCredential() {
            throw new RuntimeException("Stub!");
        }
        
        public UserCredential(final UserCredential source) {
            throw new RuntimeException("Stub!");
        }
        
        public void setUsername(final String username) {
            throw new RuntimeException("Stub!");
        }
        
        public String getUsername() {
            throw new RuntimeException("Stub!");
        }
        
        public void setPassword(final String password) {
            throw new RuntimeException("Stub!");
        }
        
        public String getPassword() {
            throw new RuntimeException("Stub!");
        }
        
        public void setEapType(final int eapType) {
            throw new RuntimeException("Stub!");
        }
        
        public int getEapType() {
            throw new RuntimeException("Stub!");
        }
        
        public void setNonEapInnerMethod(final String nonEapInnerMethod) {
            throw new RuntimeException("Stub!");
        }
        
        public String getNonEapInnerMethod() {
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
        
        @Override
        public boolean equals(final Object thatObject) {
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
}
