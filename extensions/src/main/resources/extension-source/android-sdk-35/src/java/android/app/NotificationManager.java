package android.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import android.content.ComponentName;
import android.service.notification.Condition;
import java.util.Map;
import java.util.List;

public class NotificationManager
{
    public static final String ACTION_APP_BLOCK_STATE_CHANGED = "android.app.action.APP_BLOCK_STATE_CHANGED";
    public static final String ACTION_AUTOMATIC_ZEN_RULE = "android.app.action.AUTOMATIC_ZEN_RULE";
    public static final String ACTION_AUTOMATIC_ZEN_RULE_STATUS_CHANGED = "android.app.action.AUTOMATIC_ZEN_RULE_STATUS_CHANGED";
    public static final String ACTION_CONSOLIDATED_NOTIFICATION_POLICY_CHANGED = "android.app.action.CONSOLIDATED_NOTIFICATION_POLICY_CHANGED";
    public static final String ACTION_INTERRUPTION_FILTER_CHANGED = "android.app.action.INTERRUPTION_FILTER_CHANGED";
    public static final String ACTION_NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED = "android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED";
    public static final String ACTION_NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED = "android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED";
    public static final String ACTION_NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED = "android.app.action.NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED";
    public static final String ACTION_NOTIFICATION_POLICY_CHANGED = "android.app.action.NOTIFICATION_POLICY_CHANGED";
    public static final int AUTOMATIC_RULE_STATUS_ACTIVATED = 4;
    public static final int AUTOMATIC_RULE_STATUS_DEACTIVATED = 5;
    public static final int AUTOMATIC_RULE_STATUS_DISABLED = 2;
    public static final int AUTOMATIC_RULE_STATUS_ENABLED = 1;
    public static final int AUTOMATIC_RULE_STATUS_REMOVED = 3;
    public static final int AUTOMATIC_RULE_STATUS_UNKNOWN = -1;
    public static final int BUBBLE_PREFERENCE_ALL = 1;
    public static final int BUBBLE_PREFERENCE_NONE = 0;
    public static final int BUBBLE_PREFERENCE_SELECTED = 2;
    public static final String EXTRA_AUTOMATIC_RULE_ID = "android.app.extra.AUTOMATIC_RULE_ID";
    public static final String EXTRA_AUTOMATIC_ZEN_RULE_ID = "android.app.extra.AUTOMATIC_ZEN_RULE_ID";
    public static final String EXTRA_AUTOMATIC_ZEN_RULE_STATUS = "android.app.extra.AUTOMATIC_ZEN_RULE_STATUS";
    public static final String EXTRA_BLOCKED_STATE = "android.app.extra.BLOCKED_STATE";
    public static final String EXTRA_NOTIFICATION_CHANNEL_GROUP_ID = "android.app.extra.NOTIFICATION_CHANNEL_GROUP_ID";
    public static final String EXTRA_NOTIFICATION_CHANNEL_ID = "android.app.extra.NOTIFICATION_CHANNEL_ID";
    public static final String EXTRA_NOTIFICATION_POLICY = "android.app.extra.NOTIFICATION_POLICY";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    public static final String META_DATA_AUTOMATIC_RULE_TYPE = "android.service.zen.automatic.ruleType";
    public static final String META_DATA_RULE_INSTANCE_LIMIT = "android.service.zen.automatic.ruleInstanceLimit";
    
    NotificationManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void notify(final int id, final Notification notification) {
        throw new RuntimeException("Stub!");
    }
    
    public void notify(final String tag, final int id, final Notification notification) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyAsPackage(@NonNull final String targetPackage, @Nullable final String tag, final int id, @NonNull final Notification notification) {
        throw new RuntimeException("Stub!");
    }
    
    public void cancel(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    public void cancel(@Nullable final String tag, final int id) {
        throw new RuntimeException("Stub!");
    }
    
    public void cancelAsPackage(@NonNull final String targetPackage, @Nullable final String tag, final int id) {
        throw new RuntimeException("Stub!");
    }
    
    public void cancelAll() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNotificationDelegate(@Nullable final String delegate) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getNotificationDelegate() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canNotifyAsPackage(@NonNull final String pkg) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canUseFullScreenIntent() {
        throw new RuntimeException("Stub!");
    }
    
    public void createNotificationChannelGroup(@NonNull final NotificationChannelGroup group) {
        throw new RuntimeException("Stub!");
    }
    
    public void createNotificationChannelGroups(@NonNull final List<NotificationChannelGroup> groups) {
        throw new RuntimeException("Stub!");
    }
    
    public void createNotificationChannel(@NonNull final NotificationChannel channel) {
        throw new RuntimeException("Stub!");
    }
    
    public void createNotificationChannels(@NonNull final List<NotificationChannel> channels) {
        throw new RuntimeException("Stub!");
    }
    
    public NotificationChannel getNotificationChannel(final String channelId) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public NotificationChannel getNotificationChannel(@NonNull final String channelId, @NonNull final String conversationId) {
        throw new RuntimeException("Stub!");
    }
    
    public List<NotificationChannel> getNotificationChannels() {
        throw new RuntimeException("Stub!");
    }
    
    public void deleteNotificationChannel(final String channelId) {
        throw new RuntimeException("Stub!");
    }
    
    public NotificationChannelGroup getNotificationChannelGroup(final String channelGroupId) {
        throw new RuntimeException("Stub!");
    }
    
    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        throw new RuntimeException("Stub!");
    }
    
    public void deleteNotificationChannelGroup(final String groupId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Policy getConsolidatedNotificationPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean areAutomaticZenRulesUserManaged() {
        throw new RuntimeException("Stub!");
    }
    
    public Map<String, AutomaticZenRule> getAutomaticZenRules() {
        throw new RuntimeException("Stub!");
    }
    
    public AutomaticZenRule getAutomaticZenRule(final String id) {
        throw new RuntimeException("Stub!");
    }
    
    public String addAutomaticZenRule(final AutomaticZenRule automaticZenRule) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean updateAutomaticZenRule(final String id, final AutomaticZenRule automaticZenRule) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAutomaticZenRuleState(@NonNull final String id) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAutomaticZenRuleState(@NonNull final String id, @NonNull final Condition condition) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeAutomaticZenRule(final String id) {
        throw new RuntimeException("Stub!");
    }
    
    public int getImportance() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean areNotificationsEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean areBubblesAllowed() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean areBubblesEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBubblePreference() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean areNotificationsPaused() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNotificationPolicyAccessGranted() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNotificationListenerAccessGranted(final ComponentName listener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldHideSilentStatusBarIcons() {
        throw new RuntimeException("Stub!");
    }
    
    public Policy getNotificationPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNotificationPolicy(@NonNull final Policy policy) {
        throw new RuntimeException("Stub!");
    }
    
    public StatusBarNotification[] getActiveNotifications() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getCurrentInterruptionFilter() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setInterruptionFilter(final int interruptionFilter) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean matchesCallFilter(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    public static class Policy implements Parcelable
    {
        public static final int CONVERSATION_SENDERS_ANYONE = 1;
        public static final int CONVERSATION_SENDERS_IMPORTANT = 2;
        public static final int CONVERSATION_SENDERS_NONE = 3;
        @NonNull
        public static final Creator<Policy> CREATOR;
        public static final int PRIORITY_CATEGORY_ALARMS = 32;
        public static final int PRIORITY_CATEGORY_CALLS = 8;
        public static final int PRIORITY_CATEGORY_CONVERSATIONS = 256;
        public static final int PRIORITY_CATEGORY_EVENTS = 2;
        public static final int PRIORITY_CATEGORY_MEDIA = 64;
        public static final int PRIORITY_CATEGORY_MESSAGES = 4;
        public static final int PRIORITY_CATEGORY_REMINDERS = 1;
        public static final int PRIORITY_CATEGORY_REPEAT_CALLERS = 16;
        public static final int PRIORITY_CATEGORY_SYSTEM = 128;
        public static final int PRIORITY_SENDERS_ANY = 0;
        public static final int PRIORITY_SENDERS_CONTACTS = 1;
        public static final int PRIORITY_SENDERS_STARRED = 2;
        public static final int SUPPRESSED_EFFECT_AMBIENT = 128;
        public static final int SUPPRESSED_EFFECT_BADGE = 64;
        public static final int SUPPRESSED_EFFECT_FULL_SCREEN_INTENT = 4;
        public static final int SUPPRESSED_EFFECT_LIGHTS = 8;
        public static final int SUPPRESSED_EFFECT_NOTIFICATION_LIST = 256;
        public static final int SUPPRESSED_EFFECT_PEEK = 16;
        @Deprecated
        public static final int SUPPRESSED_EFFECT_SCREEN_OFF = 1;
        @Deprecated
        public static final int SUPPRESSED_EFFECT_SCREEN_ON = 2;
        public static final int SUPPRESSED_EFFECT_STATUS_BAR = 32;
        public final int priorityCallSenders;
        public final int priorityCategories;
        public final int priorityConversationSenders;
        public final int priorityMessageSenders;
        public final int suppressedVisualEffects;
        
        public Policy(final int priorityCategories, final int priorityCallSenders, final int priorityMessageSenders) {
            this.priorityCallSenders = 0;
            this.priorityCategories = 0;
            this.priorityConversationSenders = 0;
            this.priorityMessageSenders = 0;
            this.suppressedVisualEffects = 0;
            throw new RuntimeException("Stub!");
        }
        
        public Policy(final int priorityCategories, final int priorityCallSenders, final int priorityMessageSenders, final int suppressedVisualEffects) {
            this.priorityCallSenders = 0;
            this.priorityCategories = 0;
            this.priorityConversationSenders = 0;
            this.priorityMessageSenders = 0;
            this.suppressedVisualEffects = 0;
            throw new RuntimeException("Stub!");
        }
        
        public Policy(final int priorityCategories, final int priorityCallSenders, final int priorityMessageSenders, final int suppressedVisualEffects, final int priorityConversationSenders) {
            this.priorityCallSenders = 0;
            this.priorityCategories = 0;
            this.priorityConversationSenders = 0;
            this.priorityMessageSenders = 0;
            this.suppressedVisualEffects = 0;
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object o) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        public static String suppressedEffectsToString(final int effects) {
            throw new RuntimeException("Stub!");
        }
        
        public static String priorityCategoriesToString(final int priorityCategories) {
            throw new RuntimeException("Stub!");
        }
        
        public static String prioritySendersToString(final int prioritySenders) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
}
