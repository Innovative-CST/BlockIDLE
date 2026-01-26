package android.content;

import java.util.function.IntConsumer;
import android.view.Display;
import android.content.res.Configuration;
import java.util.Collection;
import java.util.List;
import android.net.Uri;
import android.os.UserHandle;
import android.os.Handler;
import android.os.Bundle;
import java.io.InputStream;
import java.io.IOException;
import android.graphics.Bitmap;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import android.content.pm.ApplicationInfo;
import android.util.AttributeSet;
import android.content.res.TypedArray;
import android.view.ViewDebug;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import java.util.concurrent.Executor;
import android.os.Looper;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.AssetManager;

public abstract class Context
{
    public static final String ACCESSIBILITY_SERVICE = "accessibility";
    public static final String ACCOUNT_SERVICE = "account";
    public static final String ACTIVITY_SERVICE = "activity";
    public static final String ALARM_SERVICE = "alarm";
    public static final String APPWIDGET_SERVICE = "appwidget";
    public static final String APP_OPS_SERVICE = "appops";
    public static final String APP_SEARCH_SERVICE = "app_search";
    public static final String AUDIO_SERVICE = "audio";
    public static final String BATTERY_SERVICE = "batterymanager";
    public static final int BIND_ABOVE_CLIENT = 8;
    public static final int BIND_ADJUST_WITH_ACTIVITY = 128;
    public static final int BIND_ALLOW_ACTIVITY_STARTS = 512;
    public static final int BIND_ALLOW_OOM_MANAGEMENT = 16;
    public static final int BIND_AUTO_CREATE = 1;
    public static final int BIND_DEBUG_UNBIND = 2;
    public static final int BIND_EXTERNAL_SERVICE = Integer.MIN_VALUE;
    public static final long BIND_EXTERNAL_SERVICE_LONG = 4611686018427387904L;
    public static final int BIND_IMPORTANT = 64;
    public static final int BIND_INCLUDE_CAPABILITIES = 4096;
    public static final int BIND_NOT_FOREGROUND = 4;
    public static final int BIND_NOT_PERCEPTIBLE = 256;
    public static final int BIND_PACKAGE_ISOLATED_PROCESS = 16384;
    public static final int BIND_SHARED_ISOLATED_PROCESS = 8192;
    public static final int BIND_WAIVE_PRIORITY = 32;
    public static final String BIOMETRIC_SERVICE = "biometric";
    public static final String BLOB_STORE_SERVICE = "blob_store";
    public static final String BLUETOOTH_SERVICE = "bluetooth";
    public static final String BUGREPORT_SERVICE = "bugreport";
    public static final String CAMERA_SERVICE = "camera";
    public static final String CAPTIONING_SERVICE = "captioning";
    public static final String CARRIER_CONFIG_SERVICE = "carrier_config";
    public static final String CLIPBOARD_SERVICE = "clipboard";
    public static final String COMPANION_DEVICE_SERVICE = "companiondevice";
    public static final String CONNECTIVITY_DIAGNOSTICS_SERVICE = "connectivity_diagnostics";
    public static final String CONNECTIVITY_SERVICE = "connectivity";
    public static final String CONSUMER_IR_SERVICE = "consumer_ir";
    public static final String CONTACT_KEYS_SERVICE = "contact_keys";
    public static final int CONTEXT_IGNORE_SECURITY = 2;
    public static final int CONTEXT_INCLUDE_CODE = 1;
    public static final int CONTEXT_RESTRICTED = 4;
    public static final String CREDENTIAL_SERVICE = "credential";
    public static final String CROSS_PROFILE_APPS_SERVICE = "crossprofileapps";
    public static final int DEVICE_ID_DEFAULT = 0;
    public static final int DEVICE_ID_INVALID = -1;
    public static final String DEVICE_LOCK_SERVICE = "device_lock";
    public static final String DEVICE_POLICY_SERVICE = "device_policy";
    public static final String DISPLAY_HASH_SERVICE = "display_hash";
    public static final String DISPLAY_SERVICE = "display";
    public static final String DOMAIN_VERIFICATION_SERVICE = "domain_verification";
    public static final String DOWNLOAD_SERVICE = "download";
    public static final String DROPBOX_SERVICE = "dropbox";
    public static final String EUICC_SERVICE = "euicc";
    public static final String FILE_INTEGRITY_SERVICE = "file_integrity";
    public static final String FINGERPRINT_SERVICE = "fingerprint";
    public static final String GAME_SERVICE = "game";
    public static final String GRAMMATICAL_INFLECTION_SERVICE = "grammatical_inflection";
    public static final String HARDWARE_PROPERTIES_SERVICE = "hardware_properties";
    public static final String HEALTHCONNECT_SERVICE = "healthconnect";
    public static final String INPUT_METHOD_SERVICE = "input_method";
    public static final String INPUT_SERVICE = "input";
    public static final String IPSEC_SERVICE = "ipsec";
    public static final String JOB_SCHEDULER_SERVICE = "jobscheduler";
    public static final String KEYGUARD_SERVICE = "keyguard";
    public static final String LAUNCHER_APPS_SERVICE = "launcherapps";
    public static final String LAYOUT_INFLATER_SERVICE = "layout_inflater";
    public static final String LOCALE_SERVICE = "locale";
    public static final String LOCATION_SERVICE = "location";
    public static final String MEDIA_COMMUNICATION_SERVICE = "media_communication";
    public static final String MEDIA_METRICS_SERVICE = "media_metrics";
    public static final String MEDIA_PROJECTION_SERVICE = "media_projection";
    public static final String MEDIA_ROUTER_SERVICE = "media_router";
    public static final String MEDIA_SESSION_SERVICE = "media_session";
    public static final String MIDI_SERVICE = "midi";
    public static final int MODE_APPEND = 32768;
    public static final int MODE_ENABLE_WRITE_AHEAD_LOGGING = 8;
    @Deprecated
    public static final int MODE_MULTI_PROCESS = 4;
    public static final int MODE_NO_LOCALIZED_COLLATORS = 16;
    public static final int MODE_PRIVATE = 0;
    @Deprecated
    public static final int MODE_WORLD_READABLE = 1;
    @Deprecated
    public static final int MODE_WORLD_WRITEABLE = 2;
    public static final String NETWORK_STATS_SERVICE = "netstats";
    public static final String NFC_SERVICE = "nfc";
    public static final String NOTIFICATION_SERVICE = "notification";
    public static final String NSD_SERVICE = "servicediscovery";
    public static final String OVERLAY_SERVICE = "overlay";
    public static final String PEOPLE_SERVICE = "people";
    public static final String PERFORMANCE_HINT_SERVICE = "performance_hint";
    public static final String PERSISTENT_DATA_BLOCK_SERVICE = "persistent_data_block";
    public static final String POWER_SERVICE = "power";
    public static final String PRINT_SERVICE = "print";
    public static final String PROFILING_SERVICE = "profiling";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    public static final String RESTRICTIONS_SERVICE = "restrictions";
    public static final String ROLE_SERVICE = "role";
    public static final String SEARCH_SERVICE = "search";
    public static final String SECURITY_STATE_SERVICE = "security_state";
    public static final String SENSOR_SERVICE = "sensor";
    public static final String SHORTCUT_SERVICE = "shortcut";
    public static final String STATUS_BAR_SERVICE = "statusbar";
    public static final String STORAGE_SERVICE = "storage";
    public static final String STORAGE_STATS_SERVICE = "storagestats";
    public static final String SYSTEM_HEALTH_SERVICE = "systemhealth";
    public static final String TELECOM_SERVICE = "telecom";
    public static final String TELEPHONY_IMS_SERVICE = "telephony_ims";
    public static final String TELEPHONY_SERVICE = "phone";
    public static final String TELEPHONY_SUBSCRIPTION_SERVICE = "telephony_subscription_service";
    public static final String TEXT_CLASSIFICATION_SERVICE = "textclassification";
    public static final String TEXT_SERVICES_MANAGER_SERVICE = "textservices";
    public static final String TV_INPUT_SERVICE = "tv_input";
    public static final String TV_INTERACTIVE_APP_SERVICE = "tv_interactive_app";
    public static final String UI_MODE_SERVICE = "uimode";
    public static final String USAGE_STATS_SERVICE = "usagestats";
    public static final String USB_SERVICE = "usb";
    public static final String USER_SERVICE = "user";
    public static final String VIBRATOR_MANAGER_SERVICE = "vibrator_manager";
    @Deprecated
    public static final String VIBRATOR_SERVICE = "vibrator";
    public static final String VIRTUAL_DEVICE_SERVICE = "virtualdevice";
    public static final String VPN_MANAGEMENT_SERVICE = "vpn_management";
    public static final String WALLPAPER_SERVICE = "wallpaper";
    public static final String WIFI_AWARE_SERVICE = "wifiaware";
    public static final String WIFI_P2P_SERVICE = "wifip2p";
    public static final String WIFI_RTT_RANGING_SERVICE = "wifirtt";
    public static final String WIFI_SERVICE = "wifi";
    public static final String WINDOW_SERVICE = "window";
    
    public Context() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract AssetManager getAssets();
    
    public abstract Resources getResources();
    
    public abstract PackageManager getPackageManager();
    
    public abstract ContentResolver getContentResolver();
    
    public abstract Looper getMainLooper();
    
    public Executor getMainExecutor() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Context getApplicationContext();
    
    public void registerComponentCallbacks(final ComponentCallbacks callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterComponentCallbacks(final ComponentCallbacks callback) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final CharSequence getText(final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final String getString(final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final String getString(final int resId, final Object... formatArgs) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getColor(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final Drawable getDrawable(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final ColorStateList getColorStateList(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setTheme(final int p0);
    
    @ViewDebug.ExportedProperty(deepExport = true)
    public abstract Resources.Theme getTheme();
    
    @NonNull
    public final TypedArray obtainStyledAttributes(@NonNull final int[] attrs) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final TypedArray obtainStyledAttributes(final int resid, @NonNull final int[] attrs) throws Resources.NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final TypedArray obtainStyledAttributes(@Nullable final AttributeSet set, @NonNull final int[] attrs) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final TypedArray obtainStyledAttributes(@Nullable final AttributeSet set, @NonNull final int[] attrs, final int defStyleAttr, final int defStyleRes) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract ClassLoader getClassLoader();
    
    public abstract String getPackageName();
    
    @NonNull
    public String getOpPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getAttributionTag() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AttributionSource getAttributionSource() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ContextParams getParams() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract ApplicationInfo getApplicationInfo();
    
    public abstract String getPackageResourcePath();
    
    public abstract String getPackageCodePath();
    
    public abstract SharedPreferences getSharedPreferences(final String p0, final int p1);
    
    public abstract boolean moveSharedPreferencesFrom(final Context p0, final String p1);
    
    public abstract boolean deleteSharedPreferences(final String p0);
    
    public abstract FileInputStream openFileInput(final String p0) throws FileNotFoundException;
    
    public abstract FileOutputStream openFileOutput(final String p0, final int p1) throws FileNotFoundException;
    
    public abstract boolean deleteFile(final String p0);
    
    public abstract File getFileStreamPath(final String p0);
    
    public abstract File getDataDir();
    
    public abstract File getFilesDir();
    
    public abstract File getNoBackupFilesDir();
    
    @Nullable
    public abstract File getExternalFilesDir(@Nullable final String p0);
    
    public abstract File[] getExternalFilesDirs(final String p0);
    
    public abstract File getObbDir();
    
    public abstract File[] getObbDirs();
    
    public abstract File getCacheDir();
    
    public abstract File getCodeCacheDir();
    
    @Nullable
    public abstract File getExternalCacheDir();
    
    public abstract File[] getExternalCacheDirs();
    
    @Deprecated
    public abstract File[] getExternalMediaDirs();
    
    public abstract String[] fileList();
    
    public abstract File getDir(final String p0, final int p1);
    
    public abstract SQLiteDatabase openOrCreateDatabase(final String p0, final int p1, final SQLiteDatabase.CursorFactory p2);
    
    public abstract SQLiteDatabase openOrCreateDatabase(final String p0, final int p1, final SQLiteDatabase.CursorFactory p2, @Nullable final DatabaseErrorHandler p3);
    
    public abstract boolean moveDatabaseFrom(final Context p0, final String p1);
    
    public abstract boolean deleteDatabase(final String p0);
    
    public abstract File getDatabasePath(final String p0);
    
    public abstract String[] databaseList();
    
    @Deprecated
    public abstract Drawable getWallpaper();
    
    @Deprecated
    public abstract Drawable peekWallpaper();
    
    @Deprecated
    public abstract int getWallpaperDesiredMinimumWidth();
    
    @Deprecated
    public abstract int getWallpaperDesiredMinimumHeight();
    
    @Deprecated
    public abstract void setWallpaper(final Bitmap p0) throws IOException;
    
    @Deprecated
    public abstract void setWallpaper(final InputStream p0) throws IOException;
    
    @Deprecated
    public abstract void clearWallpaper() throws IOException;
    
    public abstract void startActivity(final Intent p0);
    
    public abstract void startActivity(final Intent p0, @Nullable final Bundle p1);
    
    public abstract void startActivities(final Intent[] p0);
    
    public abstract void startActivities(final Intent[] p0, final Bundle p1);
    
    public abstract void startIntentSender(final IntentSender p0, @Nullable final Intent p1, final int p2, final int p3, final int p4) throws IntentSender.SendIntentException;
    
    public abstract void startIntentSender(final IntentSender p0, @Nullable final Intent p1, final int p2, final int p3, final int p4, @Nullable final Bundle p5) throws IntentSender.SendIntentException;
    
    public abstract void sendBroadcast(final Intent p0);
    
    public abstract void sendBroadcast(final Intent p0, @Nullable final String p1);
    
    public void sendBroadcastWithMultiplePermissions(@NonNull final Intent intent, @NonNull final String[] receiverPermissions) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendBroadcast(@NonNull final Intent intent, @Nullable final String receiverPermission, @Nullable final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void sendOrderedBroadcast(final Intent p0, @Nullable final String p1);
    
    public void sendOrderedBroadcast(@NonNull final Intent intent, @Nullable final String receiverPermission, @Nullable final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void sendOrderedBroadcast(@NonNull final Intent p0, @Nullable final String p1, @Nullable final BroadcastReceiver p2, @Nullable final Handler p3, final int p4, @Nullable final String p5, @Nullable final Bundle p6);
    
    public void sendOrderedBroadcast(@NonNull final Intent intent, @Nullable final String receiverPermission, @Nullable final Bundle options, @Nullable final BroadcastReceiver resultReceiver, @Nullable final Handler scheduler, final int initialCode, @Nullable final String initialData, @Nullable final Bundle initialExtras) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void sendBroadcastAsUser(final Intent p0, final UserHandle p1);
    
    public abstract void sendBroadcastAsUser(final Intent p0, final UserHandle p1, @Nullable final String p2);
    
    public abstract void sendOrderedBroadcastAsUser(final Intent p0, final UserHandle p1, @Nullable final String p2, final BroadcastReceiver p3, @Nullable final Handler p4, final int p5, @Nullable final String p6, @Nullable final Bundle p7);
    
    public void sendOrderedBroadcast(@NonNull final Intent intent, @Nullable final String receiverPermission, @Nullable final String receiverAppOp, @Nullable final BroadcastReceiver resultReceiver, @Nullable final Handler scheduler, final int initialCode, @Nullable final String initialData, @Nullable final Bundle initialExtras) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract void sendStickyBroadcast(final Intent p0);
    
    @Deprecated
    public void sendStickyBroadcast(@NonNull final Intent intent, @Nullable final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract void sendStickyOrderedBroadcast(final Intent p0, final BroadcastReceiver p1, @Nullable final Handler p2, final int p3, @Nullable final String p4, @Nullable final Bundle p5);
    
    @Deprecated
    public abstract void removeStickyBroadcast(final Intent p0);
    
    @Deprecated
    public abstract void sendStickyBroadcastAsUser(final Intent p0, final UserHandle p1);
    
    @Deprecated
    public abstract void sendStickyOrderedBroadcastAsUser(final Intent p0, final UserHandle p1, final BroadcastReceiver p2, @Nullable final Handler p3, final int p4, @Nullable final String p5, @Nullable final Bundle p6);
    
    @Deprecated
    public abstract void removeStickyBroadcastAsUser(final Intent p0, final UserHandle p1);
    
    @Nullable
    public abstract Intent registerReceiver(@Nullable final BroadcastReceiver p0, final IntentFilter p1);
    
    @Nullable
    public abstract Intent registerReceiver(@Nullable final BroadcastReceiver p0, final IntentFilter p1, final int p2);
    
    @Nullable
    public abstract Intent registerReceiver(final BroadcastReceiver p0, final IntentFilter p1, @Nullable final String p2, @Nullable final Handler p3);
    
    @Nullable
    public abstract Intent registerReceiver(final BroadcastReceiver p0, final IntentFilter p1, @Nullable final String p2, @Nullable final Handler p3, final int p4);
    
    public abstract void unregisterReceiver(final BroadcastReceiver p0);
    
    @Nullable
    public abstract ComponentName startService(final Intent p0);
    
    @Nullable
    public abstract ComponentName startForegroundService(final Intent p0);
    
    public abstract boolean stopService(final Intent p0);
    
    public abstract boolean bindService(@NonNull final Intent p0, @NonNull final ServiceConnection p1, final int p2);
    
    public boolean bindService(@NonNull final Intent service, @NonNull final ServiceConnection conn, @NonNull final BindServiceFlags flags) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean bindService(@NonNull final Intent service, final int flags, @NonNull final Executor executor, @NonNull final ServiceConnection conn) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean bindService(@NonNull final Intent service, @NonNull final BindServiceFlags flags, @NonNull final Executor executor, @NonNull final ServiceConnection conn) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean bindIsolatedService(@NonNull final Intent service, final int flags, @NonNull final String instanceName, @NonNull final Executor executor, @NonNull final ServiceConnection conn) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean bindIsolatedService(@NonNull final Intent service, @NonNull final BindServiceFlags flags, @NonNull final String instanceName, @NonNull final Executor executor, @NonNull final ServiceConnection conn) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean bindServiceAsUser(@NonNull final Intent service, @NonNull final ServiceConnection conn, final int flags, @NonNull final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean bindServiceAsUser(@NonNull final Intent service, @NonNull final ServiceConnection conn, @NonNull final BindServiceFlags flags, @NonNull final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateServiceGroup(@NonNull final ServiceConnection conn, final int group, final int importance) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void unbindService(@NonNull final ServiceConnection p0);
    
    public abstract boolean startInstrumentation(@NonNull final ComponentName p0, @Nullable final String p1, @Nullable final Bundle p2);
    
    public abstract Object getSystemService(@NonNull final String p0);
    
    public final <T> T getSystemService(@NonNull final Class<T> serviceClass) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public abstract String getSystemServiceName(@NonNull final Class<?> p0);
    
    public abstract int checkPermission(@NonNull final String p0, final int p1, final int p2);
    
    public abstract int checkCallingPermission(@NonNull final String p0);
    
    public abstract int checkCallingOrSelfPermission(@NonNull final String p0);
    
    public abstract int checkSelfPermission(@NonNull final String p0);
    
    public abstract void enforcePermission(@NonNull final String p0, final int p1, final int p2, @Nullable final String p3);
    
    public abstract void enforceCallingPermission(@NonNull final String p0, @Nullable final String p1);
    
    public abstract void enforceCallingOrSelfPermission(@NonNull final String p0, @Nullable final String p1);
    
    public abstract void grantUriPermission(final String p0, final Uri p1, final int p2);
    
    public abstract void revokeUriPermission(final Uri p0, final int p1);
    
    public abstract void revokeUriPermission(final String p0, final Uri p1, final int p2);
    
    public abstract int checkUriPermission(final Uri p0, final int p1, final int p2, final int p3);
    
    public int checkContentUriPermissionFull(@NonNull final Uri uri, final int pid, final int uid, final int modeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] checkUriPermissions(@NonNull final List<Uri> uris, final int pid, final int uid, final int modeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int checkCallingUriPermission(final Uri p0, final int p1);
    
    @NonNull
    public int[] checkCallingUriPermissions(@NonNull final List<Uri> uris, final int modeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int checkCallingOrSelfUriPermission(final Uri p0, final int p1);
    
    @NonNull
    public int[] checkCallingOrSelfUriPermissions(@NonNull final List<Uri> uris, final int modeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int checkUriPermission(@Nullable final Uri p0, @Nullable final String p1, @Nullable final String p2, final int p3, final int p4, final int p5);
    
    public abstract void enforceUriPermission(final Uri p0, final int p1, final int p2, final int p3, final String p4);
    
    public abstract void enforceCallingUriPermission(final Uri p0, final int p1, final String p2);
    
    public abstract void enforceCallingOrSelfUriPermission(final Uri p0, final int p1, final String p2);
    
    public abstract void enforceUriPermission(@Nullable final Uri p0, @Nullable final String p1, @Nullable final String p2, final int p3, final int p4, final int p5, @Nullable final String p6);
    
    public void revokeSelfPermissionOnKill(@NonNull final String permName) {
        throw new RuntimeException("Stub!");
    }
    
    public void revokeSelfPermissionsOnKill(@NonNull final Collection<String> permissions) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Context createPackageContext(final String p0, final int p1) throws PackageManager.NameNotFoundException;
    
    public abstract Context createContextForSplit(final String p0) throws PackageManager.NameNotFoundException;
    
    public abstract Context createConfigurationContext(@NonNull final Configuration p0);
    
    public abstract Context createDisplayContext(@NonNull final Display p0);
    
    @NonNull
    public Context createDeviceContext(final int deviceId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Context createWindowContext(final int type, @Nullable final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Context createWindowContext(@NonNull final Display display, final int type, @Nullable final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Context createContext(@NonNull final ContextParams contextParams) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Context createAttributionContext(@Nullable final String attributionTag) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Context createDeviceProtectedStorageContext();
    
    @NonNull
    public Display getDisplay() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDeviceId() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerDeviceIdChangeListener(@NonNull final Executor executor, @NonNull final IntConsumer listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterDeviceIdChangeListener(@NonNull final IntConsumer listener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRestricted() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract boolean isDeviceProtectedStorage();
    
    public boolean isUiContext() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class BindServiceFlags
    {
        BindServiceFlags() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static BindServiceFlags of(final long value) {
            throw new RuntimeException("Stub!");
        }
    }
}
