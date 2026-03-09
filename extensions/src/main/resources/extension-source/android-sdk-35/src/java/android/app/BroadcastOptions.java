package android.app;

import android.os.Bundle;

public class BroadcastOptions
{
    public static final int DEFERRAL_POLICY_DEFAULT = 0;
    public static final int DEFERRAL_POLICY_NONE = 1;
    public static final int DEFERRAL_POLICY_UNTIL_ACTIVE = 2;
    public static final int DELIVERY_GROUP_POLICY_ALL = 0;
    public static final int DELIVERY_GROUP_POLICY_MOST_RECENT = 1;
    
    BroadcastOptions() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static BroadcastOptions makeBasic() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public BroadcastOptions setShareIdentityEnabled(final boolean shareIdentityEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isShareIdentityEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public BroadcastOptions setDeferralPolicy(final int deferralPolicy) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDeferralPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    public void clearDeferralPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public BroadcastOptions setDeliveryGroupPolicy(final int policy) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDeliveryGroupPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    public void clearDeliveryGroupPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public BroadcastOptions setDeliveryGroupMatchingKey(@NonNull final String namespace, @NonNull final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getDeliveryGroupMatchingKey() {
        throw new RuntimeException("Stub!");
    }
    
    public void clearDeliveryGroupMatchingKey() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle toBundle() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static BroadcastOptions fromBundle(@NonNull final Bundle options) {
        throw new RuntimeException("Stub!");
    }
}
