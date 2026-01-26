package android.net.vcn;

import java.util.concurrent.Executor;
import java.util.List;
import java.io.IOException;
import android.os.ParcelUuid;

public class VcnManager
{
    public static final int VCN_ERROR_CODE_CONFIG_ERROR = 1;
    public static final int VCN_ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int VCN_ERROR_CODE_NETWORK_ERROR = 2;
    public static final int VCN_STATUS_CODE_ACTIVE = 2;
    public static final int VCN_STATUS_CODE_INACTIVE = 1;
    public static final int VCN_STATUS_CODE_NOT_CONFIGURED = 0;
    public static final int VCN_STATUS_CODE_SAFE_MODE = 3;
    
    VcnManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void setVcnConfig(@NonNull final ParcelUuid subscriptionGroup, @NonNull final VcnConfig config) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void clearVcnConfig(@NonNull final ParcelUuid subscriptionGroup) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ParcelUuid> getConfiguredSubscriptionGroups() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerVcnStatusCallback(@NonNull final ParcelUuid subscriptionGroup, @NonNull final Executor executor, @NonNull final VcnStatusCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterVcnStatusCallback(@NonNull final VcnStatusCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class VcnStatusCallback
    {
        public VcnStatusCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onStatusChanged(final int p0);
        
        public abstract void onGatewayConnectionError(@NonNull final String p0, final int p1, @Nullable final Throwable p2);
    }
}
