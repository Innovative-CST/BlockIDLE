package android.app.job;

import android.net.Uri;
import android.os.Parcel;
import java.util.Set;
import android.net.NetworkRequest;
import android.content.ComponentName;
import android.content.ClipData;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.Parcelable;

public class JobInfo implements Parcelable
{
    public static final int BACKOFF_POLICY_EXPONENTIAL = 1;
    public static final int BACKOFF_POLICY_LINEAR = 0;
    @NonNull
    public static final Creator<JobInfo> CREATOR;
    public static final long DEFAULT_INITIAL_BACKOFF_MILLIS = 30000L;
    public static final long MAX_BACKOFF_DELAY_MILLIS = 18000000L;
    public static final int NETWORK_BYTES_UNKNOWN = -1;
    public static final int NETWORK_TYPE_ANY = 1;
    public static final int NETWORK_TYPE_CELLULAR = 4;
    @Deprecated
    public static final int NETWORK_TYPE_METERED = 4;
    public static final int NETWORK_TYPE_NONE = 0;
    public static final int NETWORK_TYPE_NOT_ROAMING = 3;
    public static final int NETWORK_TYPE_UNMETERED = 2;
    public static final int PRIORITY_DEFAULT = 300;
    public static final int PRIORITY_HIGH = 400;
    public static final int PRIORITY_LOW = 200;
    public static final int PRIORITY_MAX = 500;
    public static final int PRIORITY_MIN = 100;
    
    JobInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public static final long getMinPeriodMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public static final long getMinFlexMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public int getId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PersistableBundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getTransientExtras() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ClipData getClipData() {
        throw new RuntimeException("Stub!");
    }
    
    public int getClipGrantFlags() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ComponentName getService() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPriority() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRequireCharging() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRequireBatteryNotLow() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRequireDeviceIdle() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRequireStorageNotLow() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public TriggerContentUri[] getTriggerContentUris() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTriggerContentUpdateDelay() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTriggerContentMaxDelay() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getNetworkType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public NetworkRequest getRequiredNetwork() {
        throw new RuntimeException("Stub!");
    }
    
    public long getEstimatedNetworkDownloadBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public long getEstimatedNetworkUploadBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public long getMinimumNetworkChunkBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public long getMinLatencyMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public long getMaxExecutionDelayMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPeriodic() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPersisted() {
        throw new RuntimeException("Stub!");
    }
    
    public long getIntervalMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public long getFlexMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public long getInitialBackoffMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBackoffPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getDebugTags() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getTraceTag() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isExpedited() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUserInitiated() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isImportantWhileForeground() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPrefetch() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(final int jobId, @NonNull final ComponentName jobService) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addDebugTag(@NonNull final String tag) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder removeDebugTag(@NonNull final String tag) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPriority(final int priority) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setExtras(@NonNull final PersistableBundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setTransientExtras(@NonNull final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setClipData(@Nullable final ClipData clip, final int grantFlags) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setRequiredNetworkType(final int networkType) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setRequiredNetwork(@Nullable final NetworkRequest networkRequest) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setEstimatedNetworkBytes(final long downloadBytes, final long uploadBytes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMinimumNetworkChunkBytes(final long chunkSizeBytes) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setRequiresCharging(final boolean requiresCharging) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setRequiresBatteryNotLow(final boolean batteryNotLow) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setRequiresDeviceIdle(final boolean requiresDeviceIdle) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setRequiresStorageNotLow(final boolean storageNotLow) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder addTriggerContentUri(@NonNull final TriggerContentUri uri) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setTriggerContentUpdateDelay(final long durationMs) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setTriggerContentMaxDelay(final long durationMs) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setPeriodic(final long intervalMillis) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setPeriodic(final long intervalMillis, final long flexMillis) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setMinimumLatency(final long minLatencyMillis) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setOverrideDeadline(final long maxExecutionDelayMillis) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setBackoffCriteria(final long initialBackoffMillis, final int backoffPolicy) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExpedited(final boolean expedited) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUserInitiated(final boolean userInitiated) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setImportantWhileForeground(final boolean importantWhileForeground) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setPrefetch(final boolean prefetch) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setPersisted(final boolean isPersisted) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTraceTag(@Nullable final String traceTag) {
            throw new RuntimeException("Stub!");
        }
        
        public JobInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class TriggerContentUri implements Parcelable
    {
        @NonNull
        public static final Creator<TriggerContentUri> CREATOR;
        public static final int FLAG_NOTIFY_FOR_DESCENDANTS = 1;
        
        public TriggerContentUri(@NonNull final Uri uri, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        public Uri getUri() {
            throw new RuntimeException("Stub!");
        }
        
        public int getFlags() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object o) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel out, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
}
