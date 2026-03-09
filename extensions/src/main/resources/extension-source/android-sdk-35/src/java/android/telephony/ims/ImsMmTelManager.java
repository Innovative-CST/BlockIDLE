package android.telephony.ims;

import android.telephony.ims.feature.MmTelFeature;
import java.util.function.Consumer;
import java.util.concurrent.Executor;

public class ImsMmTelManager implements RegistrationManager
{
    public static final int WIFI_MODE_CELLULAR_PREFERRED = 1;
    public static final int WIFI_MODE_WIFI_ONLY = 0;
    public static final int WIFI_MODE_WIFI_PREFERRED = 2;
    
    ImsMmTelManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void registerImsRegistrationCallback(@NonNull final Executor executor, @NonNull final RegistrationCallback c) throws ImsException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void unregisterImsRegistrationCallback(@NonNull final RegistrationCallback c) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void getRegistrationState(@NonNull final Executor executor, @NonNull final Consumer<Integer> stateCallback) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void getRegistrationTransportType(@NonNull final Executor executor, @NonNull final Consumer<Integer> transportTypeCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerMmTelCapabilityCallback(@NonNull final Executor executor, @NonNull final CapabilityCallback c) throws ImsException {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterMmTelCapabilityCallback(@NonNull final CapabilityCallback c) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAdvancedCallingSettingEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isVtSettingEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isVoWiFiSettingEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCrossSimCallingEnabled() throws ImsException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isVoWiFiRoamingSettingEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVoWiFiModeSetting() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTtyOverVolteEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerImsStateCallback(@NonNull final Executor executor, @NonNull final ImsStateCallback callback) throws ImsException {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterImsStateCallback(@NonNull final ImsStateCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public static class CapabilityCallback
    {
        public CapabilityCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onCapabilitiesStatusChanged(@NonNull final MmTelFeature.MmTelCapabilities capabilities) {
            throw new RuntimeException("Stub!");
        }
    }
}
