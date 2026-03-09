package android.telephony.ims;

import java.util.function.Consumer;
import java.util.concurrent.Executor;

public class ImsRcsManager
{
    public static final String ACTION_SHOW_CAPABILITY_DISCOVERY_OPT_IN = "android.telephony.ims.action.SHOW_CAPABILITY_DISCOVERY_OPT_IN";
    public static final int CAPABILITY_TYPE_NONE = 0;
    public static final int CAPABILITY_TYPE_OPTIONS_UCE = 1;
    public static final int CAPABILITY_TYPE_PRESENCE_UCE = 2;
    
    ImsRcsManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public RcsUceAdapter getUceAdapter() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerImsRegistrationCallback(@NonNull final Executor executor, @NonNull final RegistrationManager.RegistrationCallback c) throws ImsException {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterImsRegistrationCallback(@NonNull final RegistrationManager.RegistrationCallback c) {
        throw new RuntimeException("Stub!");
    }
    
    public void getRegistrationState(@NonNull final Executor executor, @NonNull final Consumer<Integer> stateCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getRegistrationTransportType(@NonNull final Executor executor, @NonNull final Consumer<Integer> transportTypeCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerImsStateCallback(@NonNull final Executor executor, @NonNull final ImsStateCallback callback) throws ImsException {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterImsStateCallback(@NonNull final ImsStateCallback callback) {
        throw new RuntimeException("Stub!");
    }
}
