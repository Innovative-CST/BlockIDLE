package android.app;

import android.service.notification.ZenDeviceEffects;
import android.os.Parcel;
import android.service.notification.ZenPolicy;
import android.net.Uri;
import android.content.ComponentName;
import android.os.Parcelable;

public final class AutomaticZenRule implements Parcelable
{
    @NonNull
    public static final Creator<AutomaticZenRule> CREATOR;
    public static final int TYPE_BEDTIME = 3;
    public static final int TYPE_DRIVING = 4;
    public static final int TYPE_IMMERSIVE = 5;
    public static final int TYPE_MANAGED = 7;
    public static final int TYPE_OTHER = 0;
    public static final int TYPE_SCHEDULE_CALENDAR = 2;
    public static final int TYPE_SCHEDULE_TIME = 1;
    public static final int TYPE_THEATER = 6;
    public static final int TYPE_UNKNOWN = -1;
    
    @Deprecated
    public AutomaticZenRule(final String name, final ComponentName owner, final Uri conditionId, final int interruptionFilter, final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public AutomaticZenRule(@NonNull final String name, @Nullable final ComponentName owner, @Nullable final ComponentName configurationActivity, @NonNull final Uri conditionId, @Nullable final ZenPolicy policy, final int interruptionFilter, final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public AutomaticZenRule(final Parcel source) {
        throw new RuntimeException("Stub!");
    }
    
    public ComponentName getOwner() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ComponentName getConfigurationActivity() {
        throw new RuntimeException("Stub!");
    }
    
    public Uri getConditionId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getInterruptionFilter() {
        throw new RuntimeException("Stub!");
    }
    
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ZenPolicy getZenPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ZenDeviceEffects getDeviceEffects() {
        throw new RuntimeException("Stub!");
    }
    
    public long getCreationTime() {
        throw new RuntimeException("Stub!");
    }
    
    public void setConditionId(final Uri conditionId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInterruptionFilter(final int interruptionFilter) {
        throw new RuntimeException("Stub!");
    }
    
    public void setName(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public void setEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void setZenPolicy(@Nullable final ZenPolicy zenPolicy) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDeviceEffects(@Nullable final ZenDeviceEffects deviceEffects) {
        throw new RuntimeException("Stub!");
    }
    
    public void setConfigurationActivity(@Nullable final ComponentName componentName) {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getTriggerDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public int getIconResId() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isManualInvocationAllowed() {
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
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final AutomaticZenRule rule) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final String name, @NonNull final Uri conditionId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setName(@NonNull final String name) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setOwner(@Nullable final ComponentName owner) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setConditionId(@NonNull final Uri conditionId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setInterruptionFilter(final int interruptionFilter) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEnabled(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setConfigurationActivity(@Nullable final ComponentName configurationActivity) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setZenPolicy(@Nullable final ZenPolicy policy) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDeviceEffects(@Nullable final ZenDeviceEffects deviceEffects) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setType(final int type) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTriggerDescription(@Nullable final String description) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIconResId(final int iconResId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setManualInvocationAllowed(final boolean allowManualInvocation) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AutomaticZenRule build() {
            throw new RuntimeException("Stub!");
        }
    }
}
