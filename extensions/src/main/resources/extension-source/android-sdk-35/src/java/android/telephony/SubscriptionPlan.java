package android.telephony;

import java.time.Period;
import java.time.ZonedDateTime;
import android.util.Range;
import java.util.Iterator;
import android.os.Parcel;
import android.os.Parcelable;

public final class SubscriptionPlan implements Parcelable
{
    public static final long BYTES_UNKNOWN = -1L;
    public static final long BYTES_UNLIMITED = Long.MAX_VALUE;
    @NonNull
    public static final Creator<SubscriptionPlan> CREATOR;
    public static final int LIMIT_BEHAVIOR_BILLED = 1;
    public static final int LIMIT_BEHAVIOR_DISABLED = 0;
    public static final int LIMIT_BEHAVIOR_THROTTLED = 2;
    public static final int LIMIT_BEHAVIOR_UNKNOWN = -1;
    public static final long TIME_UNKNOWN = -1L;
    
    SubscriptionPlan() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getTitle() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getSummary() {
        throw new RuntimeException("Stub!");
    }
    
    public long getDataLimitBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDataLimitBehavior() {
        throw new RuntimeException("Stub!");
    }
    
    public long getDataUsageBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public long getDataUsageTime() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getNetworkTypes() {
        throw new RuntimeException("Stub!");
    }
    
    public Iterator<Range<ZonedDateTime>> cycleIterator() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static class Builder
    {
        Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public static Builder createNonrecurring(final ZonedDateTime start, final ZonedDateTime end) {
            throw new RuntimeException("Stub!");
        }
        
        public static Builder createRecurring(final ZonedDateTime start, final Period period) {
            throw new RuntimeException("Stub!");
        }
        
        public SubscriptionPlan build() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setTitle(@Nullable final CharSequence title) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setSummary(@Nullable final CharSequence summary) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setDataLimit(final long dataLimitBytes, final int dataLimitBehavior) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setDataUsage(final long dataUsageBytes, final long dataUsageTime) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNetworkTypes(@NonNull final int[] networkTypes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder resetNetworkTypes() {
            throw new RuntimeException("Stub!");
        }
    }
}
