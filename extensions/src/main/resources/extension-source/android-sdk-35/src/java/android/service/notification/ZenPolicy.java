package android.service.notification;

import android.os.Parcel;
import android.os.Parcelable;

public final class ZenPolicy implements Parcelable
{
    public static final int CONVERSATION_SENDERS_ANYONE = 1;
    public static final int CONVERSATION_SENDERS_IMPORTANT = 2;
    public static final int CONVERSATION_SENDERS_NONE = 3;
    public static final int CONVERSATION_SENDERS_UNSET = 0;
    @NonNull
    public static final Creator<ZenPolicy> CREATOR;
    public static final int PEOPLE_TYPE_ANYONE = 1;
    public static final int PEOPLE_TYPE_CONTACTS = 2;
    public static final int PEOPLE_TYPE_NONE = 4;
    public static final int PEOPLE_TYPE_STARRED = 3;
    public static final int PEOPLE_TYPE_UNSET = 0;
    public static final int STATE_ALLOW = 1;
    public static final int STATE_DISALLOW = 2;
    public static final int STATE_UNSET = 0;
    
    ZenPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPriorityConversationSenders() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPriorityMessageSenders() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPriorityCallSenders() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPriorityCategoryConversations() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPriorityCategoryReminders() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPriorityCategoryEvents() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPriorityCategoryMessages() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPriorityCategoryCalls() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPriorityCategoryRepeatCallers() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPriorityCategoryAlarms() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPriorityCategoryMedia() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPriorityCategorySystem() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVisualEffectFullScreenIntent() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVisualEffectLights() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVisualEffectPeek() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVisualEffectStatusBar() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVisualEffectBadge() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVisualEffectAmbient() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVisualEffectNotificationList() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPriorityChannelsAllowed() {
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
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ZenPolicy build() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder allowAllSounds() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder disallowAllSounds() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder showAllVisualEffects() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder hideAllVisualEffects() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder allowReminders(final boolean allow) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder allowEvents(final boolean allow) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder allowConversations(final int audienceType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder allowMessages(final int audienceType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder allowCalls(final int audienceType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder allowRepeatCallers(final boolean allow) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder allowAlarms(final boolean allow) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder allowMedia(final boolean allow) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder allowSystem(final boolean allow) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder showFullScreenIntent(final boolean show) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder showLights(final boolean show) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder showPeeking(final boolean show) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder showStatusBarIcons(final boolean show) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder showBadges(final boolean show) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder showInAmbientDisplay(final boolean show) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder showInNotificationList(final boolean show) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder allowPriorityChannels(final boolean allow) {
            throw new RuntimeException("Stub!");
        }
    }
}
