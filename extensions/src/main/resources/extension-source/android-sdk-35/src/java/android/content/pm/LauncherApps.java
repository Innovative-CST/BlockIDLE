package android.content.pm;

import android.content.LocusId;
import android.os.Parcel;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.os.Parcelable;
import java.util.concurrent.Executor;
import android.os.Handler;
import android.graphics.drawable.Drawable;
import android.app.PendingIntent;
import android.os.Bundle;
import android.graphics.Rect;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentSender;
import android.os.UserHandle;
import java.util.List;

public class LauncherApps
{
    public static final String ACTION_CONFIRM_PIN_APPWIDGET = "android.content.pm.action.CONFIRM_PIN_APPWIDGET";
    public static final String ACTION_CONFIRM_PIN_SHORTCUT = "android.content.pm.action.CONFIRM_PIN_SHORTCUT";
    public static final String EXTRA_PIN_ITEM_REQUEST = "android.content.pm.extra.PIN_ITEM_REQUEST";
    
    LauncherApps() {
        throw new RuntimeException("Stub!");
    }
    
    public List<UserHandle> getProfiles() {
        throw new RuntimeException("Stub!");
    }
    
    public List<LauncherActivityInfo> getActivityList(final String packageName, final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final LauncherUserInfo getLauncherUserInfo(@NonNull final UserHandle userHandle) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public IntentSender getAppMarketActivityIntent(@Nullable final String packageName, @NonNull final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getPreInstalledSystemPackages(@NonNull final UserHandle userHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public LauncherActivityInfo resolveActivity(final Intent intent, final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    public void startMainActivity(final ComponentName component, final UserHandle user, final Rect sourceBounds, final Bundle opts) {
        throw new RuntimeException("Stub!");
    }
    
    public void startPackageInstallerSessionDetailsActivity(@NonNull final PackageInstaller.SessionInfo sessionInfo, @Nullable final Rect sourceBounds, @Nullable final Bundle opts) {
        throw new RuntimeException("Stub!");
    }
    
    public void startAppDetailsActivity(final ComponentName component, final UserHandle user, final Rect sourceBounds, final Bundle opts) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PendingIntent getShortcutIntent(@NonNull final String packageName, @NonNull final String shortcutId, @Nullable final Bundle opts, @NonNull final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    public List<LauncherActivityInfo> getShortcutConfigActivityList(@Nullable final String packageName, @NonNull final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public IntentSender getShortcutConfigActivityIntent(@NonNull final LauncherActivityInfo info) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPackageEnabled(final String packageName, final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle getSuspendedPackageLauncherExtras(final String packageName, final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldHideFromSuggestions(@NonNull final String packageName, @NonNull final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    public ApplicationInfo getApplicationInfo(@NonNull final String packageName, final int flags, @NonNull final UserHandle user) throws PackageManager.NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isActivityEnabled(final ComponentName component, final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasShortcutHostPermission() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<ShortcutInfo> getShortcuts(@NonNull final ShortcutQuery query, @NonNull final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    public void pinShortcuts(@NonNull final String packageName, @NonNull final List<String> shortcutIds, @NonNull final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getShortcutIconDrawable(@NonNull final ShortcutInfo shortcut, final int density) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getShortcutBadgedIconDrawable(final ShortcutInfo shortcut, final int density) {
        throw new RuntimeException("Stub!");
    }
    
    public void startShortcut(@NonNull final String packageName, @NonNull final String shortcutId, @Nullable final Rect sourceBounds, @Nullable final Bundle startActivityOptions, @NonNull final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    public void startShortcut(@NonNull final ShortcutInfo shortcut, @Nullable final Rect sourceBounds, @Nullable final Bundle startActivityOptions) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerCallback(final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerCallback(final Callback callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterCallback(final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void setArchiveCompatibility(@NonNull final ArchiveCompatibilityParams params) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerPackageInstallerSessionCallback(@NonNull final Executor executor, @NonNull final PackageInstaller.SessionCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterPackageInstallerSessionCallback(@NonNull final PackageInstaller.SessionCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<PackageInstaller.SessionInfo> getAllPackageInstallerSessions() {
        throw new RuntimeException("Stub!");
    }
    
    public PinItemRequest getPinItemRequest(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public static class ArchiveCompatibilityParams
    {
        public ArchiveCompatibilityParams() {
            throw new RuntimeException("Stub!");
        }
        
        public void setEnableIconOverlay(final boolean enableIconOverlay) {
            throw new RuntimeException("Stub!");
        }
        
        public void setEnableUnarchivalConfirmation(final boolean enableUnarchivalConfirmation) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class Callback
    {
        public Callback() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onPackageRemoved(final String p0, final UserHandle p1);
        
        public abstract void onPackageAdded(final String p0, final UserHandle p1);
        
        public abstract void onPackageChanged(final String p0, final UserHandle p1);
        
        public abstract void onPackagesAvailable(final String[] p0, final UserHandle p1, final boolean p2);
        
        public abstract void onPackagesUnavailable(final String[] p0, final UserHandle p1, final boolean p2);
        
        public void onPackagesSuspended(final String[] packageNames, final UserHandle user) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onPackagesSuspended(final String[] packageNames, final UserHandle user, @Nullable final Bundle launcherExtras) {
            throw new RuntimeException("Stub!");
        }
        
        public void onPackagesUnsuspended(final String[] packageNames, final UserHandle user) {
            throw new RuntimeException("Stub!");
        }
        
        public void onShortcutsChanged(@NonNull final String packageName, @NonNull final List<ShortcutInfo> shortcuts, @NonNull final UserHandle user) {
            throw new RuntimeException("Stub!");
        }
        
        public void onPackageLoadingProgressChanged(@NonNull final String packageName, @NonNull final UserHandle user, final float progress) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class PinItemRequest implements Parcelable
    {
        @NonNull
        public static final Creator<PinItemRequest> CREATOR;
        public static final int REQUEST_TYPE_APPWIDGET = 2;
        public static final int REQUEST_TYPE_SHORTCUT = 1;
        
        PinItemRequest() {
            throw new RuntimeException("Stub!");
        }
        
        public int getRequestType() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public ShortcutInfo getShortcutInfo() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public AppWidgetProviderInfo getAppWidgetProviderInfo(final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Bundle getExtras() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isValid() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean accept(@Nullable final Bundle options) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean accept() {
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
        
        static {
            CREATOR = null;
        }
    }
    
    public static class ShortcutQuery
    {
        public static final int FLAG_GET_KEY_FIELDS_ONLY = 4;
        public static final int FLAG_MATCH_CACHED = 16;
        public static final int FLAG_MATCH_DYNAMIC = 1;
        public static final int FLAG_MATCH_MANIFEST = 8;
        public static final int FLAG_MATCH_PINNED = 2;
        public static final int FLAG_MATCH_PINNED_BY_ANY_LAUNCHER = 1024;
        
        public ShortcutQuery() {
            throw new RuntimeException("Stub!");
        }
        
        public ShortcutQuery setChangedSince(final long changedSince) {
            throw new RuntimeException("Stub!");
        }
        
        public ShortcutQuery setPackage(@Nullable final String packageName) {
            throw new RuntimeException("Stub!");
        }
        
        public ShortcutQuery setShortcutIds(@Nullable final List<String> shortcutIds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ShortcutQuery setLocusIds(@Nullable final List<LocusId> locusIds) {
            throw new RuntimeException("Stub!");
        }
        
        public ShortcutQuery setActivity(@Nullable final ComponentName activity) {
            throw new RuntimeException("Stub!");
        }
        
        public ShortcutQuery setQueryFlags(final int queryFlags) {
            throw new RuntimeException("Stub!");
        }
    }
}
