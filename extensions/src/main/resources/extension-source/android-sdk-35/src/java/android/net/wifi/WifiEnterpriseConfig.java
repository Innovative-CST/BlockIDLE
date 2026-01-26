package android.net.wifi;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import android.os.Parcel;
import android.os.Parcelable;

public class WifiEnterpriseConfig implements Parcelable
{
    @NonNull
    public static final Creator<WifiEnterpriseConfig> CREATOR;
    public static final String EXTRA_WAPI_AS_CERTIFICATE_DATA = "android.net.wifi.extra.WAPI_AS_CERTIFICATE_DATA";
    public static final String EXTRA_WAPI_AS_CERTIFICATE_NAME = "android.net.wifi.extra.WAPI_AS_CERTIFICATE_NAME";
    public static final String EXTRA_WAPI_USER_CERTIFICATE_DATA = "android.net.wifi.extra.WAPI_USER_CERTIFICATE_DATA";
    public static final String EXTRA_WAPI_USER_CERTIFICATE_NAME = "android.net.wifi.extra.WAPI_USER_CERTIFICATE_NAME";
    public static final int TLS_V1_0 = 0;
    public static final int TLS_V1_1 = 1;
    public static final int TLS_V1_2 = 2;
    public static final int TLS_V1_3 = 3;
    public static final String WAPI_AS_CERTIFICATE = "WAPIAS_";
    public static final String WAPI_USER_CERTIFICATE = "WAPIUSR_";
    
    public WifiEnterpriseConfig() {
        throw new RuntimeException("Stub!");
    }
    
    public WifiEnterpriseConfig(final WifiEnterpriseConfig source) {
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
    
    public void setEapMethod(final int eapMethod) {
        throw new RuntimeException("Stub!");
    }
    
    public int getEapMethod() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPhase2Method(final int phase2Method) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPhase2Method() {
        throw new RuntimeException("Stub!");
    }
    
    public void setIdentity(final String identity) {
        throw new RuntimeException("Stub!");
    }
    
    public String getIdentity() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAnonymousIdentity(final String anonymousIdentity) {
        throw new RuntimeException("Stub!");
    }
    
    public String getAnonymousIdentity() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPassword(final String password) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPassword() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasCaCertificate() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCaCertificate(@Nullable final X509Certificate cert) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public X509Certificate getCaCertificate() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCaCertificates(@Nullable final X509Certificate[] certs) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public X509Certificate[] getCaCertificates() {
        throw new RuntimeException("Stub!");
    }
    
    public void setClientKeyEntry(final PrivateKey privateKey, final X509Certificate clientCertificate) {
        throw new RuntimeException("Stub!");
    }
    
    public void setClientKeyEntryWithCertificateChain(final PrivateKey privateKey, final X509Certificate[] clientCertificateChain) {
        throw new RuntimeException("Stub!");
    }
    
    public void setClientKeyPairAlias(@NonNull final String alias) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getClientKeyPairAlias() {
        throw new RuntimeException("Stub!");
    }
    
    public X509Certificate getClientCertificate() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public X509Certificate[] getClientCertificateChain() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PrivateKey getClientPrivateKey() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSubjectMatch(final String subjectMatch) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getSubjectMatch() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAltSubjectMatch(final String altSubjectMatch) {
        throw new RuntimeException("Stub!");
    }
    
    public String getAltSubjectMatch() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDomainSuffixMatch(final String domain) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDomainSuffixMatch() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRealm(final String realm) {
        throw new RuntimeException("Stub!");
    }
    
    public String getRealm() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPlmn(final String plmn) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPlmn() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAuthenticationSimBased() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEapMethodServerCertUsed() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isServerCertValidationEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDecoratedIdentityPrefix(@Nullable final String decoratedIdentityPrefix) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getDecoratedIdentityPrefix() {
        throw new RuntimeException("Stub!");
    }
    
    public void enableTrustOnFirstUse(final boolean enable) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTrustOnFirstUseEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinimumTlsVersion(final int tlsVersion) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinimumTlsVersion() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Eap
    {
        public static final int AKA = 5;
        public static final int AKA_PRIME = 6;
        public static final int NONE = -1;
        public static final int PEAP = 0;
        public static final int PWD = 3;
        public static final int SIM = 4;
        public static final int TLS = 1;
        public static final int TTLS = 2;
        public static final int UNAUTH_TLS = 7;
        public static final int WAPI_CERT = 8;
        
        Eap() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Phase2
    {
        public static final int AKA = 6;
        public static final int AKA_PRIME = 7;
        public static final int GTC = 4;
        public static final int MSCHAP = 2;
        public static final int MSCHAPV2 = 3;
        public static final int NONE = 0;
        public static final int PAP = 1;
        public static final int SIM = 5;
        
        Phase2() {
            throw new RuntimeException("Stub!");
        }
    }
}
