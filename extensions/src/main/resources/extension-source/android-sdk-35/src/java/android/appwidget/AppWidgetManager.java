package android.appwidget;

import android.app.PendingIntent;
import java.util.List;
import android.os.UserHandle;
import android.content.ComponentName;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.content.Context;

public class AppWidgetManager
{
    public static final String ACTION_APPWIDGET_BIND = "android.appwidget.action.APPWIDGET_BIND";
    public static final String ACTION_APPWIDGET_CONFIGURE = "android.appwidget.action.APPWIDGET_CONFIGURE";
    public static final String ACTION_APPWIDGET_DELETED = "android.appwidget.action.APPWIDGET_DELETED";
    public static final String ACTION_APPWIDGET_DISABLED = "android.appwidget.action.APPWIDGET_DISABLED";
    public static final String ACTION_APPWIDGET_ENABLED = "android.appwidget.action.APPWIDGET_ENABLED";
    public static final String ACTION_APPWIDGET_HOST_RESTORED = "android.appwidget.action.APPWIDGET_HOST_RESTORED";
    public static final String ACTION_APPWIDGET_OPTIONS_CHANGED = "android.appwidget.action.APPWIDGET_UPDATE_OPTIONS";
    public static final String ACTION_APPWIDGET_PICK = "android.appwidget.action.APPWIDGET_PICK";
    public static final String ACTION_APPWIDGET_RESTORED = "android.appwidget.action.APPWIDGET_RESTORED";
    public static final String ACTION_APPWIDGET_UPDATE = "android.appwidget.action.APPWIDGET_UPDATE";
    public static final String EXTRA_APPWIDGET_ID = "appWidgetId";
    public static final String EXTRA_APPWIDGET_IDS = "appWidgetIds";
    public static final String EXTRA_APPWIDGET_OLD_IDS = "appWidgetOldIds";
    public static final String EXTRA_APPWIDGET_OPTIONS = "appWidgetOptions";
    public static final String EXTRA_APPWIDGET_PREVIEW = "appWidgetPreview";
    public static final String EXTRA_APPWIDGET_PROVIDER = "appWidgetProvider";
    public static final String EXTRA_APPWIDGET_PROVIDER_PROFILE = "appWidgetProviderProfile";
    public static final String EXTRA_CUSTOM_EXTRAS = "customExtras";
    public static final String EXTRA_CUSTOM_INFO = "customInfo";
    public static final String EXTRA_HOST_ID = "hostId";
    public static final int INVALID_APPWIDGET_ID = 0;
    public static final String META_DATA_APPWIDGET_PROVIDER = "android.appwidget.provider";
    public static final String OPTION_APPWIDGET_HOST_CATEGORY = "appWidgetCategory";
    public static final String OPTION_APPWIDGET_MAX_HEIGHT = "appWidgetMaxHeight";
    public static final String OPTION_APPWIDGET_MAX_WIDTH = "appWidgetMaxWidth";
    public static final String OPTION_APPWIDGET_MIN_HEIGHT = "appWidgetMinHeight";
    public static final String OPTION_APPWIDGET_MIN_WIDTH = "appWidgetMinWidth";
    public static final String OPTION_APPWIDGET_RESTORE_COMPLETED = "appWidgetRestoreCompleted";
    public static final String OPTION_APPWIDGET_SIZES = "appWidgetSizes";
    
    AppWidgetManager() {
        throw new RuntimeException("Stub!");
    }
    
    public static AppWidgetManager getInstance(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateAppWidget(final int[] appWidgetIds, final RemoteViews views) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateAppWidgetOptions(final int appWidgetId, final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle getAppWidgetOptions(final int appWidgetId) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateAppWidget(final int appWidgetId, final RemoteViews views) {
        throw new RuntimeException("Stub!");
    }
    
    public void partiallyUpdateAppWidget(final int[] appWidgetIds, final RemoteViews views) {
        throw new RuntimeException("Stub!");
    }
    
    public void partiallyUpdateAppWidget(final int appWidgetId, final RemoteViews views) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateAppWidget(final ComponentName provider, final RemoteViews views) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateAppWidgetProviderInfo(final ComponentName provider, @Nullable final String metaDataKey) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void notifyAppWidgetViewDataChanged(final int[] appWidgetIds, final int viewId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void notifyAppWidgetViewDataChanged(final int appWidgetId, final int viewId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AppWidgetProviderInfo> getInstalledProvidersForProfile(@Nullable final UserHandle profile) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AppWidgetProviderInfo> getInstalledProvidersForPackage(@NonNull final String packageName, @Nullable final UserHandle profile) {
        throw new RuntimeException("Stub!");
    }
    
    public List<AppWidgetProviderInfo> getInstalledProviders() {
        throw new RuntimeException("Stub!");
    }
    
    public AppWidgetProviderInfo getAppWidgetInfo(final int appWidgetId) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean bindAppWidgetIdIfAllowed(final int appWidgetId, final ComponentName provider) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean bindAppWidgetIdIfAllowed(final int appWidgetId, final ComponentName provider, final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean bindAppWidgetIdIfAllowed(final int appWidgetId, final UserHandle user, final ComponentName provider, final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    public int[] getAppWidgetIds(final ComponentName provider) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRequestPinAppWidgetSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean requestPinAppWidget(@NonNull final ComponentName provider, @Nullable final Bundle extras, @Nullable final PendingIntent successCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setWidgetPreview(@NonNull final ComponentName provider, final int widgetCategories, @NonNull final RemoteViews preview) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public RemoteViews getWidgetPreview(@NonNull final ComponentName provider, @Nullable final UserHandle profile, final int widgetCategory) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeWidgetPreview(@NonNull final ComponentName provider, final int widgetCategories) {
        throw new RuntimeException("Stub!");
    }
}
