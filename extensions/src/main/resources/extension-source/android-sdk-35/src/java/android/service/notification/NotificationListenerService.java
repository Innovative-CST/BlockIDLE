package android.service.notification;

import android.os.Parcel;
import android.os.Parcelable;
import android.content.pm.ShortcutInfo;
import android.app.Notification;
import android.content.ComponentName;
import android.os.IBinder;
import android.content.Intent;
import java.util.List;
import android.app.NotificationChannelGroup;
import android.app.NotificationChannel;
import android.os.UserHandle;
import android.content.Context;
import android.app.Service;

public abstract class NotificationListenerService extends Service
{
    public static final String ACTION_SETTINGS_HOME = "android.service.notification.action.SETTINGS_HOME";
    public static final int FLAG_FILTER_TYPE_ALERTING = 2;
    public static final int FLAG_FILTER_TYPE_CONVERSATIONS = 1;
    public static final int FLAG_FILTER_TYPE_ONGOING = 8;
    public static final int FLAG_FILTER_TYPE_SILENT = 4;
    public static final int HINT_HOST_DISABLE_CALL_EFFECTS = 4;
    public static final int HINT_HOST_DISABLE_EFFECTS = 1;
    public static final int HINT_HOST_DISABLE_NOTIFICATION_EFFECTS = 2;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    public static final String META_DATA_DEFAULT_AUTOBIND = "android.service.notification.default_autobind_listenerservice";
    public static final String META_DATA_DEFAULT_FILTER_TYPES = "android.service.notification.default_filter_types";
    public static final String META_DATA_DISABLED_FILTER_TYPES = "android.service.notification.disabled_filter_types";
    public static final int NOTIFICATION_CHANNEL_OR_GROUP_ADDED = 1;
    public static final int NOTIFICATION_CHANNEL_OR_GROUP_DELETED = 3;
    public static final int NOTIFICATION_CHANNEL_OR_GROUP_UPDATED = 2;
    public static final int REASON_APP_CANCEL = 8;
    public static final int REASON_APP_CANCEL_ALL = 9;
    public static final int REASON_ASSISTANT_CANCEL = 22;
    public static final int REASON_CANCEL = 2;
    public static final int REASON_CANCEL_ALL = 3;
    public static final int REASON_CHANNEL_BANNED = 17;
    public static final int REASON_CHANNEL_REMOVED = 20;
    public static final int REASON_CLEAR_DATA = 21;
    public static final int REASON_CLICK = 1;
    public static final int REASON_ERROR = 4;
    public static final int REASON_GROUP_OPTIMIZATION = 13;
    public static final int REASON_GROUP_SUMMARY_CANCELED = 12;
    public static final int REASON_LISTENER_CANCEL = 10;
    public static final int REASON_LISTENER_CANCEL_ALL = 11;
    public static final int REASON_LOCKDOWN = 23;
    public static final int REASON_PACKAGE_BANNED = 7;
    public static final int REASON_PACKAGE_CHANGED = 5;
    public static final int REASON_PACKAGE_SUSPENDED = 14;
    public static final int REASON_PROFILE_TURNED_OFF = 15;
    public static final int REASON_SNOOZED = 18;
    public static final int REASON_TIMEOUT = 19;
    public static final int REASON_UNAUTOBUNDLED = 16;
    public static final int REASON_USER_STOPPED = 6;
    public static final String SERVICE_INTERFACE = "android.service.notification.NotificationListenerService";
    @Deprecated
    public static final int SUPPRESSED_EFFECT_SCREEN_OFF = 1;
    @Deprecated
    public static final int SUPPRESSED_EFFECT_SCREEN_ON = 2;
    
    public NotificationListenerService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void attachBaseContext(final Context base) {
        throw new RuntimeException("Stub!");
    }
    
    public void onNotificationPosted(final StatusBarNotification sbn) {
        throw new RuntimeException("Stub!");
    }
    
    public void onNotificationPosted(final StatusBarNotification sbn, final RankingMap rankingMap) {
        throw new RuntimeException("Stub!");
    }
    
    public void onNotificationRemoved(final StatusBarNotification sbn) {
        throw new RuntimeException("Stub!");
    }
    
    public void onNotificationRemoved(final StatusBarNotification sbn, final RankingMap rankingMap) {
        throw new RuntimeException("Stub!");
    }
    
    public void onNotificationRemoved(final StatusBarNotification sbn, final RankingMap rankingMap, final int reason) {
        throw new RuntimeException("Stub!");
    }
    
    public void onListenerConnected() {
        throw new RuntimeException("Stub!");
    }
    
    public void onListenerDisconnected() {
        throw new RuntimeException("Stub!");
    }
    
    public void onNotificationRankingUpdate(final RankingMap rankingMap) {
        throw new RuntimeException("Stub!");
    }
    
    public void onListenerHintsChanged(final int hints) {
        throw new RuntimeException("Stub!");
    }
    
    public void onSilentStatusBarIconsVisibilityChanged(final boolean hideSilentStatusIcons) {
        throw new RuntimeException("Stub!");
    }
    
    public void onNotificationChannelModified(final String pkg, final UserHandle user, final NotificationChannel channel, final int modificationType) {
        throw new RuntimeException("Stub!");
    }
    
    public void onNotificationChannelGroupModified(final String pkg, final UserHandle user, final NotificationChannelGroup group, final int modificationType) {
        throw new RuntimeException("Stub!");
    }
    
    public void onInterruptionFilterChanged(final int interruptionFilter) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void cancelNotification(final String pkg, final String tag, final int id) {
        throw new RuntimeException("Stub!");
    }
    
    public final void cancelNotification(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public final void cancelAllNotifications() {
        throw new RuntimeException("Stub!");
    }
    
    public final void cancelNotifications(final String[] keys) {
        throw new RuntimeException("Stub!");
    }
    
    public final void snoozeNotification(final String key, final long durationMs) {
        throw new RuntimeException("Stub!");
    }
    
    public final void migrateNotificationFilter(final int defaultTypes, @Nullable final List<String> disallowedPkgs) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setNotificationsShown(final String[] keys) {
        throw new RuntimeException("Stub!");
    }
    
    public final void updateNotificationChannel(@NonNull final String pkg, @NonNull final UserHandle user, @NonNull final NotificationChannel channel) {
        throw new RuntimeException("Stub!");
    }
    
    public final List<NotificationChannel> getNotificationChannels(@NonNull final String pkg, @NonNull final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    public final List<NotificationChannelGroup> getNotificationChannelGroups(@NonNull final String pkg, @NonNull final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    public StatusBarNotification[] getActiveNotifications() {
        throw new RuntimeException("Stub!");
    }
    
    public final StatusBarNotification[] getSnoozedNotifications() {
        throw new RuntimeException("Stub!");
    }
    
    public StatusBarNotification[] getActiveNotifications(final String[] keys) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getCurrentListenerHints() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getCurrentInterruptionFilter() {
        throw new RuntimeException("Stub!");
    }
    
    public final void clearRequestedListenerHints() {
        throw new RuntimeException("Stub!");
    }
    
    public final void requestListenerHints(final int hints) {
        throw new RuntimeException("Stub!");
    }
    
    public final void requestInterruptionFilter(final int interruptionFilter) {
        throw new RuntimeException("Stub!");
    }
    
    public RankingMap getCurrentRanking() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onDestroy() {
        throw new RuntimeException("Stub!");
    }
    
    public static void requestRebind(final ComponentName componentName) {
        throw new RuntimeException("Stub!");
    }
    
    public static void requestUnbind(@NonNull final ComponentName componentName) {
        throw new RuntimeException("Stub!");
    }
    
    public final void requestUnbind() {
        throw new RuntimeException("Stub!");
    }
    
    public static class Ranking
    {
        public static final int USER_SENTIMENT_NEGATIVE = -1;
        public static final int USER_SENTIMENT_NEUTRAL = 0;
        public static final int USER_SENTIMENT_POSITIVE = 1;
        public static final int VISIBILITY_NO_OVERRIDE = -1000;
        
        public Ranking() {
            throw new RuntimeException("Stub!");
        }
        
        public String getKey() {
            throw new RuntimeException("Stub!");
        }
        
        public int getRank() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isAmbient() {
            throw new RuntimeException("Stub!");
        }
        
        public int getLockscreenVisibilityOverride() {
            throw new RuntimeException("Stub!");
        }
        
        public int getSuppressedVisualEffects() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean matchesInterruptionFilter() {
            throw new RuntimeException("Stub!");
        }
        
        public int getImportance() {
            throw new RuntimeException("Stub!");
        }
        
        public CharSequence getImportanceExplanation() {
            throw new RuntimeException("Stub!");
        }
        
        public String getOverrideGroupKey() {
            throw new RuntimeException("Stub!");
        }
        
        public NotificationChannel getChannel() {
            throw new RuntimeException("Stub!");
        }
        
        public int getUserSentiment() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public List<Notification.Action> getSmartActions() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public List<CharSequence> getSmartReplies() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean canShowBadge() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isSuspended() {
            throw new RuntimeException("Stub!");
        }
        
        public long getLastAudiblyAlertedMillis() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean canBubble() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isConversation() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public ShortcutInfo getConversationShortcutInfo() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object o) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class RankingMap implements Parcelable
    {
        @NonNull
        public static final Creator<RankingMap> CREATOR;
        
        RankingMap() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object o) {
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
        
        public String[] getOrderedKeys() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean getRanking(final String key, final Ranking outRanking) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
}
