package android.net;

public abstract class PlatformVpnProfile
{
    public static final int TYPE_IKEV2_IPSEC_PSK = 7;
    public static final int TYPE_IKEV2_IPSEC_RSA = 8;
    public static final int TYPE_IKEV2_IPSEC_USER_PASS = 6;
    
    PlatformVpnProfile() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean areLocalRoutesExcluded() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isInternetValidationRequired() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final String getTypeString() {
        throw new RuntimeException("Stub!");
    }
}
