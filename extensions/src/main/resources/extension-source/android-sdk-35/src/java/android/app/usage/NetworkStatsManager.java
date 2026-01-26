package android.app.usage;

import android.os.Handler;
import android.os.RemoteException;

public class NetworkStatsManager
{
    NetworkStatsManager() {
        throw new RuntimeException("Stub!");
    }
    
    public NetworkStats.Bucket querySummaryForDevice(final int networkType, @Nullable final String subscriberId, final long startTime, final long endTime) throws RemoteException, SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    public NetworkStats.Bucket querySummaryForUser(final int networkType, @Nullable final String subscriberId, final long startTime, final long endTime) throws RemoteException, SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    public NetworkStats querySummary(final int networkType, @Nullable final String subscriberId, final long startTime, final long endTime) throws RemoteException, SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public NetworkStats queryDetailsForUid(final int networkType, @Nullable final String subscriberId, final long startTime, final long endTime, final int uid) throws SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public NetworkStats queryDetailsForUidTag(final int networkType, @Nullable final String subscriberId, final long startTime, final long endTime, final int uid, final int tag) throws SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public NetworkStats queryDetailsForUidTagState(final int networkType, @Nullable final String subscriberId, final long startTime, final long endTime, final int uid, final int tag, final int state) throws SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    public NetworkStats queryDetails(final int networkType, @Nullable final String subscriberId, final long startTime, final long endTime) throws RemoteException, SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    public void registerUsageCallback(final int networkType, @Nullable final String subscriberId, final long thresholdBytes, @NonNull final UsageCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerUsageCallback(final int networkType, @Nullable final String subscriberId, final long thresholdBytes, @NonNull final UsageCallback callback, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterUsageCallback(@NonNull final UsageCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class UsageCallback
    {
        public UsageCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onThresholdReached(final int p0, @Nullable final String p1);
    }
}
