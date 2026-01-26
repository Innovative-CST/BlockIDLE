package android.os.health;

import android.os.PowerMonitorReadings;
import android.os.OutcomeReceiver;
import android.os.PowerMonitor;
import java.util.List;
import java.util.function.Consumer;
import java.util.concurrent.Executor;

public class SystemHealthManager
{
    SystemHealthManager() {
        throw new RuntimeException("Stub!");
    }
    
    public HealthStats takeUidSnapshot(final int uid) {
        throw new RuntimeException("Stub!");
    }
    
    public HealthStats takeMyUidSnapshot() {
        throw new RuntimeException("Stub!");
    }
    
    public HealthStats[] takeUidSnapshots(final int[] uids) {
        throw new RuntimeException("Stub!");
    }
    
    public void getSupportedPowerMonitors(@Nullable final Executor executor, @NonNull final Consumer<List<PowerMonitor>> onResult) {
        throw new RuntimeException("Stub!");
    }
    
    public void getPowerMonitorReadings(@NonNull final List<PowerMonitor> powerMonitors, @Nullable final Executor executor, @NonNull final OutcomeReceiver<PowerMonitorReadings, RuntimeException> onResult) {
        throw new RuntimeException("Stub!");
    }
}
