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
import android.graphics.drawable.Drawable;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import android.content.pm.ApplicationInfo;
import java.util.concurrent.Executor;
import android.os.Looper;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.AssetManager;

public class ContextWrapper extends Context
{
    public ContextWrapper(final Context base) {
        throw new RuntimeException("Stub!");
    }
    
    protected void attachBaseContext(final Context base) {
        throw new RuntimeException("Stub!");
    }
    
    public Context getBaseContext() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public AssetManager getAssets() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Resources getResources() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public PackageManager getPackageManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ContentResolver getContentResolver() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Looper getMainLooper() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Executor getMainExecutor() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Context getApplicationContext() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setTheme(final int resid) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Resources.Theme getTheme() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ClassLoader getClassLoader() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getOpPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public String getAttributionTag() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public ContextParams getParams() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ApplicationInfo getApplicationInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getPackageResourcePath() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getPackageCodePath() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public SharedPreferences getSharedPreferences(final String name, final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean moveSharedPreferencesFrom(final Context sourceContext, final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean deleteSharedPreferences(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public FileInputStream openFileInput(final String name) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public FileOutputStream openFileOutput(final String name, final int mode) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean deleteFile(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public File getFileStreamPath(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String[] fileList() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public File getDataDir() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public File getFilesDir() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public File getNoBackupFilesDir() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public File getExternalFilesDir(@Nullable final String type) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public File[] getExternalFilesDirs(final String type) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public File getObbDir() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public File[] getObbDirs() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public File getCacheDir() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public File getCodeCacheDir() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public File getExternalCacheDir() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public File[] getExternalCacheDirs() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public File[] getExternalMediaDirs() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public File getDir(final String name, final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode, final SQLiteDatabase.CursorFactory factory) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode, final SQLiteDatabase.CursorFactory factory, @Nullable final DatabaseErrorHandler errorHandler) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean moveDatabaseFrom(final Context sourceContext, final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean deleteDatabase(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public File getDatabasePath(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String[] databaseList() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public Drawable getWallpaper() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public Drawable peekWallpaper() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public int getWallpaperDesiredMinimumWidth() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public int getWallpaperDesiredMinimumHeight() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void setWallpaper(final Bitmap bitmap) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void setWallpaper(final InputStream data) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void clearWallpaper() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void startActivity(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void startActivity(final Intent intent, @Nullable final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void startActivities(final Intent[] intents) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void startActivities(final Intent[] intents, @Nullable final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void startIntentSender(final IntentSender intent, @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues, final int extraFlags) throws IntentSender.SendIntentException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void startIntentSender(final IntentSender intent, @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues, final int extraFlags, @Nullable final Bundle options) throws IntentSender.SendIntentException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void sendBroadcast(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void sendBroadcast(final Intent intent, @Nullable final String receiverPermission) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void sendBroadcast(@NonNull final Intent intent, @Nullable final String receiverPermission, @Nullable final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void sendOrderedBroadcast(final Intent intent, @Nullable final String receiverPermission) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void sendOrderedBroadcast(@NonNull final Intent intent, @Nullable final String receiverPermission, @Nullable final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void sendOrderedBroadcast(final Intent intent, @Nullable final String receiverPermission, @Nullable final BroadcastReceiver resultReceiver, @Nullable final Handler scheduler, final int initialCode, @Nullable final String initialData, @Nullable final Bundle initialExtras) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void sendOrderedBroadcast(@NonNull final Intent intent, @Nullable final String receiverPermission, @Nullable final Bundle options, @Nullable final BroadcastReceiver resultReceiver, @Nullable final Handler scheduler, final int initialCode, @Nullable final String initialData, @Nullable final Bundle initialExtras) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void sendBroadcastAsUser(final Intent intent, final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void sendBroadcastAsUser(final Intent intent, final UserHandle user, final String receiverPermission) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void sendOrderedBroadcastAsUser(final Intent intent, final UserHandle user, @Nullable final String receiverPermission, @Nullable final BroadcastReceiver resultReceiver, @Nullable final Handler scheduler, final int initialCode, @Nullable final String initialData, @Nullable final Bundle initialExtras) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void sendOrderedBroadcast(@NonNull final Intent intent, @Nullable final String receiverPermission, @Nullable final String receiverAppOp, @Nullable final BroadcastReceiver resultReceiver, @Nullable final Handler scheduler, final int initialCode, @Nullable final String initialData, @Nullable final Bundle initialExtras) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendOrderedBroadcast(@NonNull final Intent intent, final int initialCode, @Nullable final String receiverPermission, @Nullable final String receiverAppOp, @Nullable final BroadcastReceiver resultReceiver, @Nullable final Handler scheduler, @Nullable final String initialData, @Nullable final Bundle initialExtras, @Nullable final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void sendStickyBroadcast(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void sendStickyBroadcast(@NonNull final Intent intent, @Nullable final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void sendStickyOrderedBroadcast(final Intent intent, @Nullable final BroadcastReceiver resultReceiver, @Nullable final Handler scheduler, final int initialCode, @Nullable final String initialData, @Nullable final Bundle initialExtras) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void removeStickyBroadcast(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void sendStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void sendStickyOrderedBroadcastAsUser(final Intent intent, final UserHandle user, @Nullable final BroadcastReceiver resultReceiver, @Nullable final Handler scheduler, final int initialCode, @Nullable final String initialData, @Nullable final Bundle initialExtras) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void removeStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Intent registerReceiver(@Nullable final BroadcastReceiver receiver, final IntentFilter filter) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Intent registerReceiver(@Nullable final BroadcastReceiver receiver, final IntentFilter filter, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Intent registerReceiver(@Nullable final BroadcastReceiver receiver, final IntentFilter filter, @Nullable final String broadcastPermission, @Nullable final Handler scheduler) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Intent registerReceiver(@Nullable final BroadcastReceiver receiver, final IntentFilter filter, @Nullable final String broadcastPermission, @Nullable final Handler scheduler, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void unregisterReceiver(final BroadcastReceiver receiver) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public ComponentName startService(final Intent service) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public ComponentName startForegroundService(final Intent service) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean stopService(final Intent name) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean bindService(final Intent service, final ServiceConnection conn, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean bindService(@NonNull final Intent service, @NonNull final ServiceConnection conn, @NonNull final BindServiceFlags flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean bindService(final Intent service, final int flags, final Executor executor, final ServiceConnection conn) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean bindService(@NonNull final Intent service, @NonNull final BindServiceFlags flags, @NonNull final Executor executor, @NonNull final ServiceConnection conn) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean bindIsolatedService(final Intent service, final int flags, final String instanceName, final Executor executor, final ServiceConnection conn) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean bindServiceAsUser(final Intent service, final ServiceConnection conn, final int flags, final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean bindServiceAsUser(final Intent service, final ServiceConnection conn, @NonNull final BindServiceFlags flags, final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void updateServiceGroup(final ServiceConnection conn, final int group, final int importance) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void unbindService(final ServiceConnection conn) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean startInstrumentation(final ComponentName className, @Nullable final String profileFile, @Nullable final Bundle arguments) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object getSystemService(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getSystemServiceName(final Class<?> serviceClass) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int checkPermission(final String permission, final int pid, final int uid) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int checkCallingPermission(final String permission) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int checkCallingOrSelfPermission(final String permission) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int checkSelfPermission(final String permission) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void enforcePermission(final String permission, final int pid, final int uid, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void enforceCallingPermission(final String permission, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void enforceCallingOrSelfPermission(final String permission, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void grantUriPermission(final String toPackage, final Uri uri, final int modeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void revokeUriPermission(final Uri uri, final int modeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void revokeUriPermission(final String targetPackage, final Uri uri, final int modeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int checkUriPermission(final Uri uri, final int pid, final int uid, final int modeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int checkContentUriPermissionFull(@NonNull final Uri uri, final int pid, final int uid, final int modeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public int[] checkUriPermissions(@NonNull final List<Uri> uris, final int pid, final int uid, final int modeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int checkCallingUriPermission(final Uri uri, final int modeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public int[] checkCallingUriPermissions(@NonNull final List<Uri> uris, final int modeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int checkCallingOrSelfUriPermission(final Uri uri, final int modeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public int[] checkCallingOrSelfUriPermissions(@NonNull final List<Uri> uris, final int modeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int checkUriPermission(@Nullable final Uri uri, @Nullable final String readPermission, @Nullable final String writePermission, final int pid, final int uid, final int modeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void enforceUriPermission(final Uri uri, final int pid, final int uid, final int modeFlags, final String message) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void enforceCallingUriPermission(final Uri uri, final int modeFlags, final String message) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void enforceCallingOrSelfUriPermission(final Uri uri, final int modeFlags, final String message) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void enforceUriPermission(@Nullable final Uri uri, @Nullable final String readPermission, @Nullable final String writePermission, final int pid, final int uid, final int modeFlags, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void revokeSelfPermissionsOnKill(@NonNull final Collection<String> permissions) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Context createPackageContext(final String packageName, final int flags) throws PackageManager.NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Context createContextForSplit(final String splitName) throws PackageManager.NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Context createConfigurationContext(final Configuration overrideConfiguration) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Context createDisplayContext(final Display display) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public Context createDeviceContext(final int deviceId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public Context createWindowContext(final int type, @Nullable final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public Context createWindowContext(@NonNull final Display display, final int type, @Nullable final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public Context createContext(@NonNull final ContextParams contextParams) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public Context createAttributionContext(@Nullable final String attributionTag) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public AttributionSource getAttributionSource() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isRestricted() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public Display getDisplay() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getDeviceId() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void registerDeviceIdChangeListener(@NonNull final Executor executor, @NonNull final IntConsumer listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void unregisterDeviceIdChangeListener(@NonNull final IntConsumer listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Context createDeviceProtectedStorageContext() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isDeviceProtectedStorage() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isUiContext() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void registerComponentCallbacks(final ComponentCallbacks callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void unregisterComponentCallbacks(final ComponentCallbacks callback) {
        throw new RuntimeException("Stub!");
    }
}
