package android.os;

public class SecurityStateManager
{
    public static final String KEY_KERNEL_VERSION = "kernel_version";
    public static final String KEY_SYSTEM_SPL = "system_spl";
    public static final String KEY_VENDOR_SPL = "vendor_spl";
    
    SecurityStateManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getGlobalSecurityState() {
        throw new RuntimeException("Stub!");
    }
}
