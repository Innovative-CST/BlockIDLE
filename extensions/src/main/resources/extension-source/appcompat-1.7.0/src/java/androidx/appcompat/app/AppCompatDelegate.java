package androidx.appcompat.app;

import androidx.annotation.RestrictTo;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import android.app.LocaleManager;
import androidx.annotation.DoNotInline;
import android.os.LocaleList;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import android.content.ComponentName;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.core.app.AppLocalesStorageHelper;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager;
import java.util.Iterator;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.AnyThread;
import android.os.Build;
import java.util.Objects;
import android.util.Log;
import androidx.annotation.RequiresApi;
import android.window.OnBackInvokedDispatcher;
import android.util.AttributeSet;
import androidx.appcompat.view.ActionMode;
import androidx.annotation.CallSuper;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.StyleRes;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import androidx.appcompat.widget.Toolbar;
import android.view.Window;
import android.content.Context;
import android.app.Dialog;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import android.app.Activity;
import java.lang.ref.WeakReference;
import androidx.collection.ArraySet;
import androidx.core.os.LocaleListCompat;

public abstract class AppCompatDelegate
{
    static final boolean DEBUG = false;
    static final String TAG = "AppCompatDelegate";
    static SerialExecutor sSerialExecutorForLocalesStorage;
    static final String APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME = "androidx.appcompat.app.AppLocalesMetadataHolderService";
    public static final int MODE_NIGHT_FOLLOW_SYSTEM = -1;
    @Deprecated
    public static final int MODE_NIGHT_AUTO_TIME = 0;
    @Deprecated
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_YES = 2;
    public static final int MODE_NIGHT_AUTO_BATTERY = 3;
    public static final int MODE_NIGHT_UNSPECIFIED = -100;
    private static int sDefaultNightMode;
    private static LocaleListCompat sRequestedAppLocales;
    private static LocaleListCompat sStoredAppLocales;
    private static Boolean sIsAutoStoreLocalesOptedIn;
    private static boolean sIsFrameworkSyncChecked;
    private static final ArraySet<WeakReference<AppCompatDelegate>> sActivityDelegates;
    private static final Object sActivityDelegatesLock;
    private static final Object sAppLocalesStorageSyncLock;
    public static final int FEATURE_SUPPORT_ACTION_BAR = 108;
    public static final int FEATURE_SUPPORT_ACTION_BAR_OVERLAY = 109;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    
    @NonNull
    public static AppCompatDelegate create(@NonNull final Activity activity, @Nullable final AppCompatCallback callback) {
        return new AppCompatDelegateImpl(activity, callback);
    }
    
    @NonNull
    public static AppCompatDelegate create(@NonNull final Dialog dialog, @Nullable final AppCompatCallback callback) {
        return new AppCompatDelegateImpl(dialog, callback);
    }
    
    @NonNull
    public static AppCompatDelegate create(@NonNull final Context context, @NonNull final Window window, @Nullable final AppCompatCallback callback) {
        return new AppCompatDelegateImpl(context, window, callback);
    }
    
    @NonNull
    public static AppCompatDelegate create(@NonNull final Context context, @NonNull final Activity activity, @Nullable final AppCompatCallback callback) {
        return new AppCompatDelegateImpl(context, activity, callback);
    }
    
    AppCompatDelegate() {
    }
    
    @Nullable
    public abstract ActionBar getSupportActionBar();
    
    public abstract void setSupportActionBar(@Nullable final Toolbar p0);
    
    public abstract MenuInflater getMenuInflater();
    
    public abstract void onCreate(final Bundle p0);
    
    public abstract void onPostCreate(final Bundle p0);
    
    public abstract void onConfigurationChanged(final Configuration p0);
    
    public abstract void onStart();
    
    public abstract void onStop();
    
    public abstract void onPostResume();
    
    public void setTheme(@StyleRes final int themeResId) {
    }
    
    @Nullable
    public abstract <T extends View> T findViewById(@IdRes final int p0);
    
    public abstract void setContentView(final View p0);
    
    public abstract void setContentView(@LayoutRes final int p0);
    
    public abstract void setContentView(final View p0, final ViewGroup.LayoutParams p1);
    
    public abstract void addContentView(final View p0, final ViewGroup.LayoutParams p1);
    
    @Deprecated
    public void attachBaseContext(final Context context) {
    }
    
    @NonNull
    @CallSuper
    public Context attachBaseContext2(@NonNull final Context context) {
        this.attachBaseContext(context);
        return context;
    }
    
    public abstract void setTitle(@Nullable final CharSequence p0);
    
    public abstract void invalidateOptionsMenu();
    
    public abstract void onDestroy();
    
    @Nullable
    public abstract ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();
    
    public abstract boolean requestWindowFeature(final int p0);
    
    public abstract boolean hasWindowFeature(final int p0);
    
    @Nullable
    public abstract ActionMode startSupportActionMode(@NonNull final ActionMode.Callback p0);
    
    public abstract void installViewFactory();
    
    public abstract View createView(@Nullable final View p0, final String p1, @NonNull final Context p2, @NonNull final AttributeSet p3);
    
    public abstract void setHandleNativeActionModesEnabled(final boolean p0);
    
    public abstract boolean isHandleNativeActionModesEnabled();
    
    public abstract void onSaveInstanceState(final Bundle p0);
    
    public abstract boolean applyDayNight();
    
    @CallSuper
    @RequiresApi(33)
    public void setOnBackInvokedDispatcher(@Nullable final OnBackInvokedDispatcher dispatcher) {
    }
    
    boolean applyAppLocales() {
        return false;
    }
    
    @Nullable
    public Context getContextForDelegate() {
        return null;
    }
    
    public abstract void setLocalNightMode(final int p0);
    
    public int getLocalNightMode() {
        return -100;
    }
    
    public static void setDefaultNightMode(final int mode) {
        switch (mode) {
            case -1:
            case 0:
            case 1:
            case 2:
            case 3: {
                if (AppCompatDelegate.sDefaultNightMode != mode) {
                    AppCompatDelegate.sDefaultNightMode = mode;
                    applyDayNightToActiveDelegates();
                    break;
                }
                break;
            }
            default: {
                Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
                break;
            }
        }
    }
    
    public static void setApplicationLocales(@NonNull final LocaleListCompat locales) {
        Objects.requireNonNull((Object)locales);
        if (Build.VERSION.SDK_INT >= 33) {
            final Object localeManager = getLocaleManagerForApplication();
            if (localeManager != null) {
                Api33Impl.localeManagerSetApplicationLocales(localeManager, Api24Impl.localeListForLanguageTags(locales.toLanguageTags()));
            }
        }
        else if (!locales.equals((Object)AppCompatDelegate.sRequestedAppLocales)) {
            synchronized (AppCompatDelegate.sActivityDelegatesLock) {
                AppCompatDelegate.sRequestedAppLocales = locales;
                applyLocalesToActiveDelegates();
            }
        }
    }
    
    @AnyThread
    @NonNull
    public static LocaleListCompat getApplicationLocales() {
        if (Build.VERSION.SDK_INT >= 33) {
            final Object localeManager = getLocaleManagerForApplication();
            if (localeManager != null) {
                return LocaleListCompat.wrap(Api33Impl.localeManagerGetApplicationLocales(localeManager));
            }
        }
        else if (AppCompatDelegate.sRequestedAppLocales != null) {
            return AppCompatDelegate.sRequestedAppLocales;
        }
        return LocaleListCompat.getEmptyLocaleList();
    }
    
    public static int getDefaultNightMode() {
        return AppCompatDelegate.sDefaultNightMode;
    }
    
    @Nullable
    static LocaleListCompat getRequestedAppLocales() {
        return AppCompatDelegate.sRequestedAppLocales;
    }
    
    @Nullable
    static LocaleListCompat getStoredAppLocales() {
        return AppCompatDelegate.sStoredAppLocales;
    }
    
    @VisibleForTesting
    static void resetStaticRequestedAndStoredLocales() {
        AppCompatDelegate.sRequestedAppLocales = null;
        AppCompatDelegate.sStoredAppLocales = null;
    }
    
    @VisibleForTesting
    static void setIsAutoStoreLocalesOptedIn(final boolean isAutoStoreLocalesOptedIn) {
        AppCompatDelegate.sIsAutoStoreLocalesOptedIn = isAutoStoreLocalesOptedIn;
    }
    
    @RequiresApi(33)
    static Object getLocaleManagerForApplication() {
        for (final WeakReference<AppCompatDelegate> activeDelegate : AppCompatDelegate.sActivityDelegates) {
            final AppCompatDelegate delegate = (AppCompatDelegate)activeDelegate.get();
            if (delegate != null) {
                final Context context = delegate.getContextForDelegate();
                if (context != null) {
                    return context.getSystemService("locale");
                }
                continue;
            }
        }
        return null;
    }
    
    static boolean isAutoStorageOptedIn(final Context context) {
        if (AppCompatDelegate.sIsAutoStoreLocalesOptedIn == null) {
            try {
                final ServiceInfo serviceInfo = AppLocalesMetadataHolderService.getServiceInfo(context);
                if (serviceInfo.metaData != null) {
                    AppCompatDelegate.sIsAutoStoreLocalesOptedIn = serviceInfo.metaData.getBoolean("autoStoreLocales");
                }
            }
            catch (final PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                AppCompatDelegate.sIsAutoStoreLocalesOptedIn = false;
            }
        }
        return AppCompatDelegate.sIsAutoStoreLocalesOptedIn;
    }
    
    void asyncExecuteSyncRequestedAndStoredLocales(final Context context) {
        AppCompatDelegate.sSerialExecutorForLocalesStorage.execute(() -> syncRequestedAndStoredLocales(context));
    }
    
    static void syncRequestedAndStoredLocales(final Context context) {
        if (!isAutoStorageOptedIn(context)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (!AppCompatDelegate.sIsFrameworkSyncChecked) {
                AppCompatDelegate.sSerialExecutorForLocalesStorage.execute(() -> {
                    syncLocalesToFramework(context);
                    AppCompatDelegate.sIsFrameworkSyncChecked = true;
                });
            }
        }
        else {
            synchronized (AppCompatDelegate.sAppLocalesStorageSyncLock) {
                if (AppCompatDelegate.sRequestedAppLocales == null) {
                    if (AppCompatDelegate.sStoredAppLocales == null) {
                        AppCompatDelegate.sStoredAppLocales = LocaleListCompat.forLanguageTags(AppLocalesStorageHelper.readLocales(context));
                    }
                    if (AppCompatDelegate.sStoredAppLocales.isEmpty()) {
                        return;
                    }
                    AppCompatDelegate.sRequestedAppLocales = AppCompatDelegate.sStoredAppLocales;
                }
                else if (!AppCompatDelegate.sRequestedAppLocales.equals((Object)AppCompatDelegate.sStoredAppLocales)) {
                    AppCompatDelegate.sStoredAppLocales = AppCompatDelegate.sRequestedAppLocales;
                    AppLocalesStorageHelper.persistLocales(context, AppCompatDelegate.sRequestedAppLocales.toLanguageTags());
                }
            }
        }
    }
    
    public static void setCompatVectorFromResourcesEnabled(final boolean enabled) {
        VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(enabled);
    }
    
    public static boolean isCompatVectorFromResourcesEnabled() {
        return VectorEnabledTintResources.isCompatVectorFromResourcesEnabled();
    }
    
    static void addActiveDelegate(@NonNull final AppCompatDelegate delegate) {
        synchronized (AppCompatDelegate.sActivityDelegatesLock) {
            removeDelegateFromActives(delegate);
            AppCompatDelegate.sActivityDelegates.add((Object)new WeakReference((Object)delegate));
        }
    }
    
    static void removeActivityDelegate(@NonNull final AppCompatDelegate delegate) {
        synchronized (AppCompatDelegate.sActivityDelegatesLock) {
            removeDelegateFromActives(delegate);
        }
    }
    
    static void syncLocalesToFramework(final Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            final ComponentName app_locales_component = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(app_locales_component) != 1) {
                if (getApplicationLocales().isEmpty()) {
                    final String appLocales = AppLocalesStorageHelper.readLocales(context);
                    final Object localeManager = context.getSystemService("locale");
                    if (localeManager != null) {
                        Api33Impl.localeManagerSetApplicationLocales(localeManager, Api24Impl.localeListForLanguageTags(appLocales));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(app_locales_component, 1, 1);
            }
        }
    }
    
    private static void removeDelegateFromActives(@NonNull final AppCompatDelegate toRemove) {
        synchronized (AppCompatDelegate.sActivityDelegatesLock) {
            final Iterator<WeakReference<AppCompatDelegate>> i = (Iterator<WeakReference<AppCompatDelegate>>)AppCompatDelegate.sActivityDelegates.iterator();
            while (i.hasNext()) {
                final AppCompatDelegate delegate = (AppCompatDelegate)((WeakReference)i.next()).get();
                if (delegate == toRemove || delegate == null) {
                    i.remove();
                }
            }
        }
    }
    
    private static void applyDayNightToActiveDelegates() {
        synchronized (AppCompatDelegate.sActivityDelegatesLock) {
            for (final WeakReference<AppCompatDelegate> activeDelegate : AppCompatDelegate.sActivityDelegates) {
                final AppCompatDelegate delegate = (AppCompatDelegate)activeDelegate.get();
                if (delegate != null) {
                    delegate.applyDayNight();
                }
            }
        }
    }
    
    private static void applyLocalesToActiveDelegates() {
        for (final WeakReference<AppCompatDelegate> activeDelegate : AppCompatDelegate.sActivityDelegates) {
            final AppCompatDelegate delegate = (AppCompatDelegate)activeDelegate.get();
            if (delegate != null) {
                delegate.applyAppLocales();
            }
        }
    }
    
    static {
        AppCompatDelegate.sSerialExecutorForLocalesStorage = new SerialExecutor((Executor)new ThreadPerTaskExecutor());
        AppCompatDelegate.sDefaultNightMode = -100;
        AppCompatDelegate.sRequestedAppLocales = null;
        AppCompatDelegate.sStoredAppLocales = null;
        AppCompatDelegate.sIsAutoStoreLocalesOptedIn = null;
        AppCompatDelegate.sIsFrameworkSyncChecked = false;
        sActivityDelegates = new ArraySet();
        sActivityDelegatesLock = new Object();
        sAppLocalesStorageSyncLock = new Object();
    }
    
    static class SerialExecutor implements Executor
    {
        private final Object mLock;
        final Queue<Runnable> mTasks;
        final Executor mExecutor;
        Runnable mActive;
        
        SerialExecutor(final Executor executor) {
            this.mLock = new Object();
            this.mTasks = (Queue<Runnable>)new ArrayDeque();
            this.mExecutor = executor;
        }
        
        public void execute(final Runnable r) {
            synchronized (this.mLock) {
                this.mTasks.add((Object)(() -> {
                    try {
                        r.run();
                    }
                    finally {
                        this.scheduleNext();
                    }
                }));
                if (this.mActive == null) {
                    this.scheduleNext();
                }
            }
        }
        
        protected void scheduleNext() {
            synchronized (this.mLock) {
                final Runnable mActive = (Runnable)this.mTasks.poll();
                this.mActive = mActive;
                if (mActive != null) {
                    this.mExecutor.execute(this.mActive);
                }
            }
        }
    }
    
    static class ThreadPerTaskExecutor implements Executor
    {
        public void execute(final Runnable r) {
            new Thread(r).start();
        }
    }
    
    @RequiresApi(24)
    static class Api24Impl
    {
        private Api24Impl() {
        }
        
        @DoNotInline
        static LocaleList localeListForLanguageTags(final String list) {
            return LocaleList.forLanguageTags(list);
        }
    }
    
    @RequiresApi(33)
    static class Api33Impl
    {
        private Api33Impl() {
        }
        
        @DoNotInline
        static void localeManagerSetApplicationLocales(final Object localeManager, final LocaleList locales) {
            final LocaleManager mLocaleManager = (LocaleManager)localeManager;
            mLocaleManager.setApplicationLocales(locales);
        }
        
        @DoNotInline
        static LocaleList localeManagerGetApplicationLocales(final Object localeManager) {
            final LocaleManager mLocaleManager = (LocaleManager)localeManager;
            return mLocaleManager.getApplicationLocales();
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public @interface NightMode {
    }
}
