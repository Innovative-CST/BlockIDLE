package android.app.usage;

import java.util.Map;
import java.util.List;

public final class UsageStatsManager
{
    public static final String EXTRA_EVENT_ACTION = "android.app.usage.extra.EVENT_ACTION";
    public static final String EXTRA_EVENT_CATEGORY = "android.app.usage.extra.EVENT_CATEGORY";
    public static final int INTERVAL_BEST = 4;
    public static final int INTERVAL_DAILY = 0;
    public static final int INTERVAL_MONTHLY = 2;
    public static final int INTERVAL_WEEKLY = 1;
    public static final int INTERVAL_YEARLY = 3;
    public static final int STANDBY_BUCKET_ACTIVE = 10;
    public static final int STANDBY_BUCKET_FREQUENT = 30;
    public static final int STANDBY_BUCKET_RARE = 40;
    public static final int STANDBY_BUCKET_RESTRICTED = 45;
    public static final int STANDBY_BUCKET_WORKING_SET = 20;
    
    UsageStatsManager() {
        throw new RuntimeException("Stub!");
    }
    
    public List<UsageStats> queryUsageStats(final int intervalType, final long beginTime, final long endTime) {
        throw new RuntimeException("Stub!");
    }
    
    public List<ConfigurationStats> queryConfigurations(final int intervalType, final long beginTime, final long endTime) {
        throw new RuntimeException("Stub!");
    }
    
    public List<EventStats> queryEventStats(final int intervalType, final long beginTime, final long endTime) {
        throw new RuntimeException("Stub!");
    }
    
    public UsageEvents queryEvents(final long beginTime, final long endTime) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public UsageEvents queryEvents(@NonNull final UsageEventsQuery query) {
        throw new RuntimeException("Stub!");
    }
    
    public UsageEvents queryEventsForSelf(final long beginTime, final long endTime) {
        throw new RuntimeException("Stub!");
    }
    
    public Map<String, UsageStats> queryAndAggregateUsageStats(final long beginTime, final long endTime) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAppInactive(final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAppStandbyBucket() {
        throw new RuntimeException("Stub!");
    }
}
