package android.os;

import java.util.Map;
import java.util.concurrent.Executor;
import java.time.Duration;

public final class PowerManager
{
    @Deprecated
    public static final int ACQUIRE_CAUSES_WAKEUP = 268435456;
    public static final String ACTION_DEVICE_IDLE_MODE_CHANGED = "android.os.action.DEVICE_IDLE_MODE_CHANGED";
    public static final String ACTION_DEVICE_LIGHT_IDLE_MODE_CHANGED = "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED";
    public static final String ACTION_LOW_POWER_STANDBY_ENABLED_CHANGED = "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED";
    public static final String ACTION_LOW_POWER_STANDBY_POLICY_CHANGED = "android.os.action.LOW_POWER_STANDBY_POLICY_CHANGED";
    public static final String ACTION_POWER_SAVE_MODE_CHANGED = "android.os.action.POWER_SAVE_MODE_CHANGED";
    public static final String FEATURE_WAKE_ON_LAN_IN_LOW_POWER_STANDBY = "com.android.lowpowerstandby.WAKE_ON_LAN";
    @Deprecated
    public static final int FULL_WAKE_LOCK = 26;
    public static final int LOCATION_MODE_ALL_DISABLED_WHEN_SCREEN_OFF = 2;
    public static final int LOCATION_MODE_FOREGROUND_ONLY = 3;
    public static final int LOCATION_MODE_GPS_DISABLED_WHEN_SCREEN_OFF = 1;
    public static final int LOCATION_MODE_NO_CHANGE = 0;
    public static final int LOCATION_MODE_THROTTLE_REQUESTS_WHEN_SCREEN_OFF = 4;
    public static final int LOW_POWER_STANDBY_ALLOWED_REASON_ONGOING_CALL = 4;
    public static final int LOW_POWER_STANDBY_ALLOWED_REASON_TEMP_POWER_SAVE_ALLOWLIST = 2;
    public static final int LOW_POWER_STANDBY_ALLOWED_REASON_VOICE_INTERACTION = 1;
    public static final int ON_AFTER_RELEASE = 536870912;
    public static final int PARTIAL_WAKE_LOCK = 1;
    public static final int PROXIMITY_SCREEN_OFF_WAKE_LOCK = 32;
    public static final int RELEASE_FLAG_WAIT_FOR_NO_PROXIMITY = 1;
    @Deprecated
    public static final int SCREEN_BRIGHT_WAKE_LOCK = 10;
    @Deprecated
    public static final int SCREEN_DIM_WAKE_LOCK = 6;
    public static final int THERMAL_STATUS_CRITICAL = 4;
    public static final int THERMAL_STATUS_EMERGENCY = 5;
    public static final int THERMAL_STATUS_LIGHT = 1;
    public static final int THERMAL_STATUS_MODERATE = 2;
    public static final int THERMAL_STATUS_NONE = 0;
    public static final int THERMAL_STATUS_SEVERE = 3;
    public static final int THERMAL_STATUS_SHUTDOWN = 6;
    
    PowerManager() {
        throw new RuntimeException("Stub!");
    }
    
    public WakeLock newWakeLock(final int levelAndFlags, final String tag) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWakeLockLevelSupported(final int level) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isScreenOn() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInteractive() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isRebootingUserspaceSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public void reboot(@Nullable final String reason) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPowerSaveMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Duration getBatteryDischargePrediction() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isBatteryDischargePredictionPersonalized() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLocationPowerSaveMode() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDeviceIdleMode() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDeviceLightIdleMode() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLowPowerStandbyEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isExemptFromLowPowerStandby() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAllowedInLowPowerStandby(final int reason) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAllowedInLowPowerStandby(@NonNull final String feature) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isIgnoringBatteryOptimizations(final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSustainedPerformanceModeSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCurrentThermalStatus() {
        throw new RuntimeException("Stub!");
    }
    
    public void addThermalStatusListener(@NonNull final OnThermalStatusChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void addThermalStatusListener(@NonNull final Executor executor, @NonNull final OnThermalStatusChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeThermalStatusListener(@NonNull final OnThermalStatusChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public float getThermalHeadroom(final int forecastSeconds) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<Integer, Float> getThermalHeadroomThresholds() {
        throw new RuntimeException("Stub!");
    }
    
    public final class WakeLock
    {
        WakeLock() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        protected void finalize() throws Throwable {
            throw new RuntimeException("Stub!");
        }
        
        public void setReferenceCounted(final boolean value) {
            throw new RuntimeException("Stub!");
        }
        
        public void acquire() {
            throw new RuntimeException("Stub!");
        }
        
        public void acquire(final long timeout) {
            throw new RuntimeException("Stub!");
        }
        
        public void release() {
            throw new RuntimeException("Stub!");
        }
        
        public void release(final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isHeld() {
            throw new RuntimeException("Stub!");
        }
        
        public void setWorkSource(final WorkSource ws) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        public void setStateListener(@NonNull final Executor executor, @Nullable final WakeLockStateListener listener) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface WakeLockStateListener
    {
        void onStateChanged(final boolean p0);
    }
    
    public interface OnThermalStatusChangedListener
    {
        void onThermalStatusChanged(final int p0);
    }
}
