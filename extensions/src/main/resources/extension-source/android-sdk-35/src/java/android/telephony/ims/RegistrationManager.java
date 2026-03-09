package android.telephony.ims;

import java.util.function.Consumer;
import java.util.concurrent.Executor;

public interface RegistrationManager
{
    public static final int REGISTRATION_STATE_NOT_REGISTERED = 0;
    public static final int REGISTRATION_STATE_REGISTERED = 2;
    public static final int REGISTRATION_STATE_REGISTERING = 1;
    
    void registerImsRegistrationCallback(@NonNull final Executor p0, @NonNull final RegistrationCallback p1) throws ImsException;
    
    void unregisterImsRegistrationCallback(@NonNull final RegistrationCallback p0);
    
    void getRegistrationState(@NonNull final Executor p0, @NonNull final Consumer<Integer> p1);
    
    void getRegistrationTransportType(@NonNull final Executor p0, @NonNull final Consumer<Integer> p1);
    
    public static class RegistrationCallback
    {
        public RegistrationCallback() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onRegistered(final int imsTransportType) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRegistered(@NonNull final ImsRegistrationAttributes attributes) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onRegistering(final int imsTransportType) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRegistering(@NonNull final ImsRegistrationAttributes attributes) {
            throw new RuntimeException("Stub!");
        }
        
        public void onUnregistered(@NonNull final ImsReasonInfo info) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTechnologyChangeFailed(final int imsTransportType, @NonNull final ImsReasonInfo info) {
            throw new RuntimeException("Stub!");
        }
    }
}
