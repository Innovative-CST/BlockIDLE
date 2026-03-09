package android.telephony.ims;

public class ImsManager
{
    public static final String ACTION_WFC_IMS_REGISTRATION_ERROR = "android.telephony.ims.action.WFC_IMS_REGISTRATION_ERROR";
    public static final String EXTRA_WFC_REGISTRATION_FAILURE_MESSAGE = "android.telephony.ims.extra.WFC_REGISTRATION_FAILURE_MESSAGE";
    public static final String EXTRA_WFC_REGISTRATION_FAILURE_TITLE = "android.telephony.ims.extra.WFC_REGISTRATION_FAILURE_TITLE";
    
    ImsManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ImsRcsManager getImsRcsManager(final int subscriptionId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ImsMmTelManager getImsMmTelManager(final int subscriptionId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ProvisioningManager getProvisioningManager(final int subscriptionId) {
        throw new RuntimeException("Stub!");
    }
}
