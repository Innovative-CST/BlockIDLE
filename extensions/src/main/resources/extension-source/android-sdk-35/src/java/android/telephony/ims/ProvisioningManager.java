package android.telephony.ims;

import java.util.concurrent.Executor;

public class ProvisioningManager
{
    ProvisioningManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerFeatureProvisioningChangedCallback(@NonNull final Executor executor, @NonNull final FeatureProvisioningCallback callback) throws ImsException {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterFeatureProvisioningChangedCallback(@NonNull final FeatureProvisioningCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void setProvisioningStatusForCapability(final int capability, final int tech, final boolean isProvisioned) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getProvisioningStatusForCapability(final int capability, final int tech) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getRcsProvisioningStatusForCapability(final int capability, final int tech) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRcsProvisioningStatusForCapability(final int capability, final int tech, final boolean isProvisioned) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isProvisioningRequiredForCapability(final int capability, final int tech) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRcsProvisioningRequiredForCapability(final int capability, final int tech) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class FeatureProvisioningCallback
    {
        public FeatureProvisioningCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onFeatureProvisioningChanged(final int p0, final int p1, final boolean p2);
        
        public abstract void onRcsFeatureProvisioningChanged(final int p0, final int p1, final boolean p2);
    }
}
