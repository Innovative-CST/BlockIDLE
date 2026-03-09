package androidx.appcompat.app;

import java.util.Objects;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import android.os.PowerManager;
import android.content.IntentFilter;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.view.KeyboardShortcutGroup;
import java.util.List;
import androidx.appcompat.view.SupportActionModeWrapper;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.content.res.AppCompatResources;
import android.view.MotionEvent;
import android.os.Parcel;
import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.core.util.ObjectsCompat;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import android.util.DisplayMetrics;
import androidx.core.app.ActivityCompat;
import java.util.Locale;
import android.app.UiModeManager;
import android.util.AndroidRuntimeException;
import androidx.core.content.ContextCompat;
import android.media.AudioManager;
import android.view.KeyCharacterMap;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.MenuPresenter;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.content.ContextWrapper;
import androidx.core.view.LayoutInflaterCompat;
import androidx.appcompat.widget.VectorEnabledTintResources;
import android.view.ViewParent;
import org.xmlpull.v1.XmlPullParser;
import android.util.Log;
import androidx.core.view.KeyEventDispatcher;
import android.view.KeyEvent;
import android.content.res.Resources;
import androidx.appcompat.view.StandaloneActionMode;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.widget.PopupWindowCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.content.res.TypedArray;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewUtils;
import androidx.appcompat.widget.FitWindowsViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import android.util.TypedValue;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.TintTypedArray;
import androidx.annotation.StyleRes;
import androidx.annotation.IdRes;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NavUtils;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.core.os.LocaleListCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.appcompat.R;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatDrawableManager;
import android.app.Dialog;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import android.graphics.Rect;
import android.content.res.Configuration;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import androidx.core.view.ViewPropertyAnimatorCompat;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.DecorContentParent;
import android.view.MenuInflater;
import android.view.Window;
import android.content.Context;
import androidx.collection.SimpleArrayMap;
import androidx.annotation.RestrictTo;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.MenuBuilder;

@RestrictTo({ RestrictTo.Scope.LIBRARY })
class AppCompatDelegateImpl extends AppCompatDelegate implements MenuBuilder.Callback, LayoutInflater.Factory2
{
    private static final SimpleArrayMap<String, Integer> sLocalNightModes;
    private static final boolean IS_PRE_LOLLIPOP;
    private static final int[] sWindowBackgroundStyleable;
    private static final boolean sCanReturnDifferentContext;
    private static boolean sInstalledExceptionHandler;
    static final String EXCEPTION_HANDLER_MESSAGE_SUFFIX = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    final Object mHost;
    final Context mContext;
    Window mWindow;
    private AppCompatWindowCallback mAppCompatWindowCallback;
    final AppCompatCallback mAppCompatCallback;
    ActionBar mActionBar;
    MenuInflater mMenuInflater;
    private CharSequence mTitle;
    private DecorContentParent mDecorContentParent;
    private ActionMenuPresenterCallback mActionMenuPresenterCallback;
    private PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    ActionMode mActionMode;
    ActionBarContextView mActionModeView;
    PopupWindow mActionModePopup;
    Runnable mShowActionModePopup;
    ViewPropertyAnimatorCompat mFadeAnim;
    private boolean mHandleNativeActionModes;
    private boolean mSubDecorInstalled;
    ViewGroup mSubDecor;
    private TextView mTitleView;
    private View mStatusGuard;
    private boolean mFeatureProgress;
    private boolean mFeatureIndeterminateProgress;
    boolean mHasActionBar;
    boolean mOverlayActionBar;
    boolean mOverlayActionMode;
    boolean mIsFloating;
    boolean mWindowNoTitle;
    private boolean mClosingActionMenu;
    private PanelFeatureState[] mPanels;
    private PanelFeatureState mPreparedPanel;
    private boolean mLongPressBackDown;
    private boolean mBaseContextAttached;
    private boolean mCreated;
    boolean mDestroyed;
    private Configuration mEffectiveConfiguration;
    private int mLocalNightMode;
    private int mThemeResId;
    private int mActivityHandlesConfigFlags;
    private boolean mActivityHandlesConfigFlagsChecked;
    private AutoNightModeManager mAutoTimeNightModeManager;
    private AutoNightModeManager mAutoBatteryNightModeManager;
    boolean mInvalidatePanelMenuPosted;
    int mInvalidatePanelMenuFeatures;
    private final Runnable mInvalidatePanelMenuRunnable;
    private boolean mEnableDefaultActionBarUp;
    private Rect mTempRect1;
    private Rect mTempRect2;
    private AppCompatViewInflater mAppCompatViewInflater;
    private LayoutIncludeDetector mLayoutIncludeDetector;
    private OnBackInvokedDispatcher mDispatcher;
    private OnBackInvokedCallback mBackCallback;
    
    AppCompatDelegateImpl(final Activity activity, final AppCompatCallback callback) {
        this((Context)activity, null, callback, activity);
    }
    
    AppCompatDelegateImpl(final Dialog dialog, final AppCompatCallback callback) {
        this(dialog.getContext(), dialog.getWindow(), callback, dialog);
    }
    
    AppCompatDelegateImpl(final Context context, final Window window, final AppCompatCallback callback) {
        this(context, window, callback, context);
    }
    
    AppCompatDelegateImpl(final Context context, final Activity activity, final AppCompatCallback callback) {
        this(context, null, callback, activity);
    }
    
    private AppCompatDelegateImpl(final Context context, final Window window, final AppCompatCallback callback, final Object host) {
        this.mFadeAnim = null;
        this.mHandleNativeActionModes = true;
        this.mLocalNightMode = -100;
        this.mInvalidatePanelMenuRunnable = (Runnable)new Runnable() {
            public void run() {
                if ((AppCompatDelegateImpl.this.mInvalidatePanelMenuFeatures & 0x1) != 0x0) {
                    AppCompatDelegateImpl.this.doInvalidatePanelMenu(0);
                }
                if ((AppCompatDelegateImpl.this.mInvalidatePanelMenuFeatures & 0x1000) != 0x0) {
                    AppCompatDelegateImpl.this.doInvalidatePanelMenu(108);
                }
                AppCompatDelegateImpl.this.mInvalidatePanelMenuPosted = false;
                AppCompatDelegateImpl.this.mInvalidatePanelMenuFeatures = 0;
            }
        };
        this.mContext = context;
        this.mAppCompatCallback = callback;
        this.mHost = host;
        if (this.mLocalNightMode == -100 && this.mHost instanceof Dialog) {
            final AppCompatActivity activity = this.tryUnwrapContext();
            if (activity != null) {
                this.mLocalNightMode = activity.getDelegate().getLocalNightMode();
            }
        }
        if (this.mLocalNightMode == -100) {
            final Integer value = (Integer)AppCompatDelegateImpl.sLocalNightModes.get((Object)this.mHost.getClass().getName());
            if (value != null) {
                this.mLocalNightMode = value;
                AppCompatDelegateImpl.sLocalNightModes.remove((Object)this.mHost.getClass().getName());
            }
        }
        if (window != null) {
            this.attachToWindow(window);
        }
        AppCompatDrawableManager.preload();
    }
    
    @RequiresApi(33)
    @Override
    public void setOnBackInvokedDispatcher(@Nullable final OnBackInvokedDispatcher dispatcher) {
        super.setOnBackInvokedDispatcher(dispatcher);
        if (this.mDispatcher != null && this.mBackCallback != null) {
            Api33Impl.unregisterOnBackInvokedCallback(this.mDispatcher, this.mBackCallback);
            this.mBackCallback = null;
        }
        if (dispatcher == null && this.mHost instanceof Activity && ((Activity)this.mHost).getWindow() != null) {
            this.mDispatcher = Api33Impl.getOnBackInvokedDispatcher((Activity)this.mHost);
        }
        else {
            this.mDispatcher = dispatcher;
        }
        this.updateBackInvokedCallbackState();
    }
    
    void updateBackInvokedCallbackState() {
        if (Build.VERSION.SDK_INT >= 33) {
            final boolean shouldRegister = this.shouldRegisterBackInvokedCallback();
            if (shouldRegister && this.mBackCallback == null) {
                this.mBackCallback = Api33Impl.registerOnBackPressedCallback(this.mDispatcher, this);
            }
            else if (!shouldRegister && this.mBackCallback != null) {
                Api33Impl.unregisterOnBackInvokedCallback(this.mDispatcher, this.mBackCallback);
                this.mBackCallback = null;
            }
        }
    }
    
    @NonNull
    @CallSuper
    @Override
    public Context attachBaseContext2(@NonNull final Context baseContext) {
        this.mBaseContextAttached = true;
        final int modeToApply = this.mapNightMode(baseContext, this.calculateNightMode());
        if (AppCompatDelegate.isAutoStorageOptedIn(baseContext)) {
            AppCompatDelegate.syncRequestedAndStoredLocales(baseContext);
        }
        final LocaleListCompat localesToApply = this.calculateApplicationLocales(baseContext);
        if (baseContext instanceof ContextThemeWrapper) {
            final Configuration config = this.createOverrideAppConfiguration(baseContext, modeToApply, localesToApply, null, false);
            try {
                ((ContextThemeWrapper)baseContext).applyOverrideConfiguration(config);
                return baseContext;
            }
            catch (final IllegalStateException ex) {}
        }
        if (baseContext instanceof androidx.appcompat.view.ContextThemeWrapper) {
            final Configuration config = this.createOverrideAppConfiguration(baseContext, modeToApply, localesToApply, null, false);
            try {
                ((androidx.appcompat.view.ContextThemeWrapper)baseContext).applyOverrideConfiguration(config);
                return baseContext;
            }
            catch (final IllegalStateException ex2) {}
        }
        if (!AppCompatDelegateImpl.sCanReturnDifferentContext) {
            return super.attachBaseContext2(baseContext);
        }
        Configuration configOverlay = null;
        final Configuration overrideConfig = new Configuration();
        overrideConfig.uiMode = -1;
        overrideConfig.fontScale = 0.0f;
        final Configuration referenceConfig = baseContext.createConfigurationContext(overrideConfig).getResources().getConfiguration();
        final Configuration baseConfig = baseContext.getResources().getConfiguration();
        referenceConfig.uiMode = baseConfig.uiMode;
        if (!referenceConfig.equals(baseConfig)) {
            configOverlay = generateConfigDelta(referenceConfig, baseConfig);
        }
        final Configuration config2 = this.createOverrideAppConfiguration(baseContext, modeToApply, localesToApply, configOverlay, true);
        final androidx.appcompat.view.ContextThemeWrapper wrappedContext = new androidx.appcompat.view.ContextThemeWrapper(baseContext, R.style.Theme_AppCompat_Empty);
        wrappedContext.applyOverrideConfiguration(config2);
        boolean needsThemeRebase;
        try {
            needsThemeRebase = (baseContext.getTheme() != null);
        }
        catch (final NullPointerException e) {
            needsThemeRebase = false;
        }
        if (needsThemeRebase) {
            ResourcesCompat.ThemeCompat.rebase(wrappedContext.getTheme());
        }
        return super.attachBaseContext2((Context)wrappedContext);
    }
    
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        this.mBaseContextAttached = true;
        this.applyApplicationSpecificConfig(false);
        this.ensureWindow();
        if (this.mHost instanceof Activity) {
            String parentActivityName = null;
            try {
                parentActivityName = NavUtils.getParentActivityName((Activity)this.mHost);
            }
            catch (final IllegalArgumentException ex) {}
            if (parentActivityName != null) {
                final ActionBar ab = this.peekSupportActionBar();
                if (ab == null) {
                    this.mEnableDefaultActionBarUp = true;
                }
                else {
                    ab.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
            AppCompatDelegate.addActiveDelegate(this);
        }
        this.mEffectiveConfiguration = new Configuration(this.mContext.getResources().getConfiguration());
        this.mCreated = true;
    }
    
    @Override
    public void onPostCreate(final Bundle savedInstanceState) {
        this.ensureSubDecor();
    }
    
    @Override
    public ActionBar getSupportActionBar() {
        this.initWindowDecorActionBar();
        return this.mActionBar;
    }
    
    final ActionBar peekSupportActionBar() {
        return this.mActionBar;
    }
    
    final Window.Callback getWindowCallback() {
        return this.mWindow.getCallback();
    }
    
    private void initWindowDecorActionBar() {
        this.ensureSubDecor();
        if (!this.mHasActionBar || this.mActionBar != null) {
            return;
        }
        if (this.mHost instanceof Activity) {
            this.mActionBar = new WindowDecorActionBar((Activity)this.mHost, this.mOverlayActionBar);
        }
        else if (this.mHost instanceof Dialog) {
            this.mActionBar = new WindowDecorActionBar((Dialog)this.mHost);
        }
        if (this.mActionBar != null) {
            this.mActionBar.setDefaultDisplayHomeAsUpEnabled(this.mEnableDefaultActionBarUp);
        }
    }
    
    @Override
    public void setSupportActionBar(final Toolbar toolbar) {
        if (!(this.mHost instanceof Activity)) {
            return;
        }
        final ActionBar ab = this.getSupportActionBar();
        if (ab instanceof WindowDecorActionBar) {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
        this.mMenuInflater = null;
        if (ab != null) {
            ab.onDestroy();
        }
        this.mActionBar = null;
        if (toolbar != null) {
            final ToolbarActionBar tbab = new ToolbarActionBar(toolbar, this.getTitle(), (Window.Callback)this.mAppCompatWindowCallback);
            this.mActionBar = tbab;
            this.mAppCompatWindowCallback.setActionBarCallback(tbab.mMenuCallback);
            toolbar.setBackInvokedCallbackEnabled(true);
        }
        else {
            this.mAppCompatWindowCallback.setActionBarCallback(null);
        }
        this.invalidateOptionsMenu();
    }
    
    final Context getActionBarThemedContext() {
        Context context = null;
        final ActionBar ab = this.getSupportActionBar();
        if (ab != null) {
            context = ab.getThemedContext();
        }
        if (context == null) {
            context = this.mContext;
        }
        return context;
    }
    
    @Override
    public MenuInflater getMenuInflater() {
        if (this.mMenuInflater == null) {
            this.initWindowDecorActionBar();
            this.mMenuInflater = new SupportMenuInflater((this.mActionBar != null) ? this.mActionBar.getThemedContext() : this.mContext);
        }
        return this.mMenuInflater;
    }
    
    @Nullable
    @Override
    public <T extends View> T findViewById(@IdRes final int id) {
        this.ensureSubDecor();
        return (T)this.mWindow.findViewById(id);
    }
    
    @Override
    public void onConfigurationChanged(final Configuration newConfig) {
        if (this.mHasActionBar && this.mSubDecorInstalled) {
            final ActionBar ab = this.getSupportActionBar();
            if (ab != null) {
                ab.onConfigurationChanged(newConfig);
            }
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.mContext);
        this.mEffectiveConfiguration = new Configuration(this.mContext.getResources().getConfiguration());
        this.applyApplicationSpecificConfig(false, false);
    }
    
    @Override
    public void onStart() {
        this.applyApplicationSpecificConfig(true, false);
    }
    
    @Override
    public void onStop() {
        final ActionBar ab = this.getSupportActionBar();
        if (ab != null) {
            ab.setShowHideAnimationEnabled(false);
        }
    }
    
    @Override
    public void onPostResume() {
        final ActionBar ab = this.getSupportActionBar();
        if (ab != null) {
            ab.setShowHideAnimationEnabled(true);
        }
    }
    
    @Override
    public void setContentView(final View v) {
        this.ensureSubDecor();
        final ViewGroup contentParent = (ViewGroup)this.mSubDecor.findViewById(16908290);
        contentParent.removeAllViews();
        contentParent.addView(v);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }
    
    @Override
    public void setContentView(final int resId) {
        this.ensureSubDecor();
        final ViewGroup contentParent = (ViewGroup)this.mSubDecor.findViewById(16908290);
        contentParent.removeAllViews();
        LayoutInflater.from(this.mContext).inflate(resId, contentParent);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }
    
    @Override
    public void setContentView(final View v, final ViewGroup.LayoutParams lp) {
        this.ensureSubDecor();
        final ViewGroup contentParent = (ViewGroup)this.mSubDecor.findViewById(16908290);
        contentParent.removeAllViews();
        contentParent.addView(v, lp);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }
    
    @Override
    public void addContentView(final View v, final ViewGroup.LayoutParams lp) {
        this.ensureSubDecor();
        final ViewGroup contentParent = (ViewGroup)this.mSubDecor.findViewById(16908290);
        contentParent.addView(v, lp);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }
    
    @Override
    public void onSaveInstanceState(final Bundle outState) {
    }
    
    @Override
    public void onDestroy() {
        if (this.mHost instanceof Activity) {
            AppCompatDelegate.removeActivityDelegate(this);
        }
        if (this.mInvalidatePanelMenuPosted) {
            this.mWindow.getDecorView().removeCallbacks(this.mInvalidatePanelMenuRunnable);
        }
        this.mDestroyed = true;
        if (this.mLocalNightMode != -100 && this.mHost instanceof Activity && ((Activity)this.mHost).isChangingConfigurations()) {
            AppCompatDelegateImpl.sLocalNightModes.put((Object)this.mHost.getClass().getName(), (Object)this.mLocalNightMode);
        }
        else {
            AppCompatDelegateImpl.sLocalNightModes.remove((Object)this.mHost.getClass().getName());
        }
        if (this.mActionBar != null) {
            this.mActionBar.onDestroy();
        }
        this.cleanupAutoManagers();
    }
    
    private void cleanupAutoManagers() {
        if (this.mAutoTimeNightModeManager != null) {
            this.mAutoTimeNightModeManager.cleanup();
        }
        if (this.mAutoBatteryNightModeManager != null) {
            this.mAutoBatteryNightModeManager.cleanup();
        }
    }
    
    @Override
    public void setTheme(@StyleRes final int themeResId) {
        this.mThemeResId = themeResId;
    }
    
    private void ensureWindow() {
        if (this.mWindow == null && this.mHost instanceof Activity) {
            this.attachToWindow(((Activity)this.mHost).getWindow());
        }
        if (this.mWindow == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }
    
    private void attachToWindow(@NonNull final Window window) {
        if (this.mWindow != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        final Window.Callback callback = window.getCallback();
        if (callback instanceof AppCompatWindowCallback) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        window.setCallback((Window.Callback)(this.mAppCompatWindowCallback = new AppCompatWindowCallback(callback)));
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(this.mContext, null, AppCompatDelegateImpl.sWindowBackgroundStyleable);
        final Drawable winBg = a.getDrawableIfKnown(0);
        if (winBg != null) {
            window.setBackgroundDrawable(winBg);
        }
        a.recycle();
        this.mWindow = window;
        if (Build.VERSION.SDK_INT >= 33 && this.mDispatcher == null) {
            this.setOnBackInvokedDispatcher(null);
        }
    }
    
    private void ensureSubDecor() {
        if (!this.mSubDecorInstalled) {
            this.mSubDecor = this.createSubDecor();
            final CharSequence title = this.getTitle();
            if (!TextUtils.isEmpty(title)) {
                if (this.mDecorContentParent != null) {
                    this.mDecorContentParent.setWindowTitle(title);
                }
                else if (this.peekSupportActionBar() != null) {
                    this.peekSupportActionBar().setWindowTitle(title);
                }
                else if (this.mTitleView != null) {
                    this.mTitleView.setText(title);
                }
            }
            this.applyFixedSizeWindow();
            this.onSubDecorInstalled(this.mSubDecor);
            this.mSubDecorInstalled = true;
            final PanelFeatureState st = this.getPanelState(0, false);
            if (!this.mDestroyed && (st == null || st.menu == null)) {
                this.invalidatePanelMenu(108);
            }
        }
    }
    
    private ViewGroup createSubDecor() {
        final TypedArray a = this.mContext.obtainStyledAttributes(R.styleable.AppCompatTheme);
        if (!a.hasValue(R.styleable.AppCompatTheme_windowActionBar)) {
            a.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (a.getBoolean(R.styleable.AppCompatTheme_windowNoTitle, false)) {
            this.requestWindowFeature(1);
        }
        else if (a.getBoolean(R.styleable.AppCompatTheme_windowActionBar, false)) {
            this.requestWindowFeature(108);
        }
        if (a.getBoolean(R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            this.requestWindowFeature(109);
        }
        if (a.getBoolean(R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            this.requestWindowFeature(10);
        }
        this.mIsFloating = a.getBoolean(R.styleable.AppCompatTheme_android_windowIsFloating, false);
        a.recycle();
        this.ensureWindow();
        this.mWindow.getDecorView();
        final LayoutInflater inflater = LayoutInflater.from(this.mContext);
        ViewGroup subDecor = null;
        if (!this.mWindowNoTitle) {
            if (this.mIsFloating) {
                subDecor = (ViewGroup)inflater.inflate(R.layout.abc_dialog_title_material, (ViewGroup)null);
                final boolean b = false;
                this.mOverlayActionBar = b;
                this.mHasActionBar = b;
            }
            else if (this.mHasActionBar) {
                final TypedValue outValue = new TypedValue();
                this.mContext.getTheme().resolveAttribute(R.attr.actionBarTheme, outValue, true);
                Context themedContext;
                if (outValue.resourceId != 0) {
                    themedContext = (Context)new androidx.appcompat.view.ContextThemeWrapper(this.mContext, outValue.resourceId);
                }
                else {
                    themedContext = this.mContext;
                }
                subDecor = (ViewGroup)LayoutInflater.from(themedContext).inflate(R.layout.abc_screen_toolbar, (ViewGroup)null);
                (this.mDecorContentParent = (DecorContentParent)subDecor.findViewById(R.id.decor_content_parent)).setWindowCallback(this.getWindowCallback());
                if (this.mOverlayActionBar) {
                    this.mDecorContentParent.initFeature(109);
                }
                if (this.mFeatureProgress) {
                    this.mDecorContentParent.initFeature(2);
                }
                if (this.mFeatureIndeterminateProgress) {
                    this.mDecorContentParent.initFeature(5);
                }
            }
        }
        else if (this.mOverlayActionMode) {
            subDecor = (ViewGroup)inflater.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup)null);
        }
        else {
            subDecor = (ViewGroup)inflater.inflate(R.layout.abc_screen_simple, (ViewGroup)null);
        }
        if (subDecor == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.mHasActionBar + ", windowActionBarOverlay: " + this.mOverlayActionBar + ", android:windowIsFloating: " + this.mIsFloating + ", windowActionModeOverlay: " + this.mOverlayActionMode + ", windowNoTitle: " + this.mWindowNoTitle + " }");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            ViewCompat.setOnApplyWindowInsetsListener((View)subDecor, (OnApplyWindowInsetsListener)new OnApplyWindowInsetsListener() {
                public WindowInsetsCompat onApplyWindowInsets(final View v, WindowInsetsCompat insets) {
                    final int top = insets.getSystemWindowInsetTop();
                    final int newTop = AppCompatDelegateImpl.this.updateStatusGuard(insets, null);
                    if (top != newTop) {
                        insets = insets.replaceSystemWindowInsets(insets.getSystemWindowInsetLeft(), newTop, insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom());
                    }
                    return ViewCompat.onApplyWindowInsets(v, insets);
                }
            });
        }
        else if (subDecor instanceof FitWindowsViewGroup) {
            ((FitWindowsViewGroup)subDecor).setOnFitSystemWindowsListener(new FitWindowsViewGroup.OnFitSystemWindowsListener() {
                @Override
                public void onFitSystemWindows(final Rect insets) {
                    insets.top = AppCompatDelegateImpl.this.updateStatusGuard(null, insets);
                }
            });
        }
        if (this.mDecorContentParent == null) {
            this.mTitleView = (TextView)subDecor.findViewById(R.id.title);
        }
        ViewUtils.makeOptionalFitsSystemWindows((View)subDecor);
        final ContentFrameLayout contentView = (ContentFrameLayout)subDecor.findViewById(R.id.action_bar_activity_content);
        final ViewGroup windowContentView = (ViewGroup)this.mWindow.findViewById(16908290);
        if (windowContentView != null) {
            while (windowContentView.getChildCount() > 0) {
                final View child = windowContentView.getChildAt(0);
                windowContentView.removeViewAt(0);
                contentView.addView(child);
            }
            windowContentView.setId(-1);
            contentView.setId(16908290);
            if (windowContentView instanceof FrameLayout) {
                ((FrameLayout)windowContentView).setForeground((Drawable)null);
            }
        }
        this.mWindow.setContentView((View)subDecor);
        contentView.setAttachListener(new ContentFrameLayout.OnAttachListener() {
            @Override
            public void onAttachedFromWindow() {
            }
            
            @Override
            public void onDetachedFromWindow() {
                AppCompatDelegateImpl.this.dismissPopups();
            }
        });
        return subDecor;
    }
    
    void onSubDecorInstalled(final ViewGroup subDecor) {
    }
    
    private void applyFixedSizeWindow() {
        final ContentFrameLayout cfl = (ContentFrameLayout)this.mSubDecor.findViewById(16908290);
        final View windowDecor = this.mWindow.getDecorView();
        cfl.setDecorPadding(windowDecor.getPaddingLeft(), windowDecor.getPaddingTop(), windowDecor.getPaddingRight(), windowDecor.getPaddingBottom());
        final TypedArray a = this.mContext.obtainStyledAttributes(R.styleable.AppCompatTheme);
        a.getValue(R.styleable.AppCompatTheme_windowMinWidthMajor, cfl.getMinWidthMajor());
        a.getValue(R.styleable.AppCompatTheme_windowMinWidthMinor, cfl.getMinWidthMinor());
        if (a.hasValue(R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
            a.getValue(R.styleable.AppCompatTheme_windowFixedWidthMajor, cfl.getFixedWidthMajor());
        }
        if (a.hasValue(R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
            a.getValue(R.styleable.AppCompatTheme_windowFixedWidthMinor, cfl.getFixedWidthMinor());
        }
        if (a.hasValue(R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
            a.getValue(R.styleable.AppCompatTheme_windowFixedHeightMajor, cfl.getFixedHeightMajor());
        }
        if (a.hasValue(R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
            a.getValue(R.styleable.AppCompatTheme_windowFixedHeightMinor, cfl.getFixedHeightMinor());
        }
        a.recycle();
        cfl.requestLayout();
    }
    
    @Override
    public boolean requestWindowFeature(int featureId) {
        featureId = this.sanitizeWindowFeatureId(featureId);
        if (this.mWindowNoTitle && featureId == 108) {
            return false;
        }
        if (this.mHasActionBar && featureId == 1) {
            this.mHasActionBar = false;
        }
        switch (featureId) {
            case 108: {
                this.throwFeatureRequestIfSubDecorInstalled();
                return this.mHasActionBar = true;
            }
            case 109: {
                this.throwFeatureRequestIfSubDecorInstalled();
                return this.mOverlayActionBar = true;
            }
            case 10: {
                this.throwFeatureRequestIfSubDecorInstalled();
                return this.mOverlayActionMode = true;
            }
            case 2: {
                this.throwFeatureRequestIfSubDecorInstalled();
                return this.mFeatureProgress = true;
            }
            case 5: {
                this.throwFeatureRequestIfSubDecorInstalled();
                return this.mFeatureIndeterminateProgress = true;
            }
            case 1: {
                this.throwFeatureRequestIfSubDecorInstalled();
                return this.mWindowNoTitle = true;
            }
            default: {
                return this.mWindow.requestFeature(featureId);
            }
        }
    }
    
    @Override
    public boolean hasWindowFeature(final int featureId) {
        boolean result = false;
        switch (this.sanitizeWindowFeatureId(featureId)) {
            case 108: {
                result = this.mHasActionBar;
                break;
            }
            case 109: {
                result = this.mOverlayActionBar;
                break;
            }
            case 10: {
                result = this.mOverlayActionMode;
                break;
            }
            case 2: {
                result = this.mFeatureProgress;
                break;
            }
            case 5: {
                result = this.mFeatureIndeterminateProgress;
                break;
            }
            case 1: {
                result = this.mWindowNoTitle;
                break;
            }
        }
        return result || this.mWindow.hasFeature(featureId);
    }
    
    @Override
    public final void setTitle(final CharSequence title) {
        this.mTitle = title;
        if (this.mDecorContentParent != null) {
            this.mDecorContentParent.setWindowTitle(title);
        }
        else if (this.peekSupportActionBar() != null) {
            this.peekSupportActionBar().setWindowTitle(title);
        }
        else if (this.mTitleView != null) {
            this.mTitleView.setText(title);
        }
    }
    
    final CharSequence getTitle() {
        if (this.mHost instanceof Activity) {
            return ((Activity)this.mHost).getTitle();
        }
        return this.mTitle;
    }
    
    void onPanelClosed(final int featureId) {
        if (featureId == 108) {
            final ActionBar ab = this.getSupportActionBar();
            if (ab != null) {
                ab.dispatchMenuVisibilityChanged(false);
            }
        }
        else if (featureId == 0) {
            final PanelFeatureState st = this.getPanelState(featureId, true);
            if (st.isOpen) {
                this.closePanel(st, false);
            }
        }
    }
    
    void onMenuOpened(final int featureId) {
        if (featureId == 108) {
            final ActionBar ab = this.getSupportActionBar();
            if (ab != null) {
                ab.dispatchMenuVisibilityChanged(true);
            }
        }
    }
    
    @Override
    public boolean onMenuItemSelected(@NonNull final MenuBuilder menu, @NonNull final MenuItem item) {
        final Window.Callback cb = this.getWindowCallback();
        if (cb != null && !this.mDestroyed) {
            final PanelFeatureState panel = this.findMenuPanel((Menu)menu.getRootMenu());
            if (panel != null) {
                return cb.onMenuItemSelected(panel.featureId, item);
            }
        }
        return false;
    }
    
    @Override
    public void onMenuModeChange(@NonNull final MenuBuilder menu) {
        this.reopenMenu(true);
    }
    
    @Override
    public ActionMode startSupportActionMode(@NonNull final ActionMode.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (this.mActionMode != null) {
            this.mActionMode.finish();
        }
        final ActionMode.Callback wrappedCallback = new ActionModeCallbackWrapperV9(callback);
        final ActionBar ab = this.getSupportActionBar();
        if (ab != null) {
            this.mActionMode = ab.startActionMode(wrappedCallback);
            if (this.mActionMode != null && this.mAppCompatCallback != null) {
                this.mAppCompatCallback.onSupportActionModeStarted(this.mActionMode);
            }
        }
        if (this.mActionMode == null) {
            this.mActionMode = this.startSupportActionModeFromWindow(wrappedCallback);
        }
        this.updateBackInvokedCallbackState();
        return this.mActionMode;
    }
    
    @Override
    public void invalidateOptionsMenu() {
        if (this.peekSupportActionBar() == null || this.getSupportActionBar().invalidateOptionsMenu()) {
            return;
        }
        this.invalidatePanelMenu(0);
    }
    
    ActionMode startSupportActionModeFromWindow(@NonNull ActionMode.Callback callback) {
        this.endOnGoingFadeAnimation();
        if (this.mActionMode != null) {
            this.mActionMode.finish();
        }
        if (!(callback instanceof ActionModeCallbackWrapperV9)) {
            callback = new ActionModeCallbackWrapperV9(callback);
        }
        ActionMode mode = null;
        if (this.mAppCompatCallback != null && !this.mDestroyed) {
            try {
                mode = this.mAppCompatCallback.onWindowStartingSupportActionMode(callback);
            }
            catch (final AbstractMethodError abstractMethodError) {}
        }
        if (mode != null) {
            this.mActionMode = mode;
        }
        else {
            if (this.mActionModeView == null) {
                if (this.mIsFloating) {
                    final TypedValue outValue = new TypedValue();
                    final Resources.Theme baseTheme = this.mContext.getTheme();
                    baseTheme.resolveAttribute(R.attr.actionBarTheme, outValue, true);
                    Context actionBarContext;
                    if (outValue.resourceId != 0) {
                        final Resources.Theme actionBarTheme = this.mContext.getResources().newTheme();
                        actionBarTheme.setTo(baseTheme);
                        actionBarTheme.applyStyle(outValue.resourceId, true);
                        actionBarContext = (Context)new androidx.appcompat.view.ContextThemeWrapper(this.mContext, 0);
                        actionBarContext.getTheme().setTo(actionBarTheme);
                    }
                    else {
                        actionBarContext = this.mContext;
                    }
                    this.mActionModeView = new ActionBarContextView(actionBarContext);
                    PopupWindowCompat.setWindowLayoutType(this.mActionModePopup = new PopupWindow(actionBarContext, (AttributeSet)null, R.attr.actionModePopupWindowStyle), 2);
                    this.mActionModePopup.setContentView((View)this.mActionModeView);
                    this.mActionModePopup.setWidth(-1);
                    actionBarContext.getTheme().resolveAttribute(R.attr.actionBarSize, outValue, true);
                    final int height = TypedValue.complexToDimensionPixelSize(outValue.data, actionBarContext.getResources().getDisplayMetrics());
                    this.mActionModeView.setContentHeight(height);
                    this.mActionModePopup.setHeight(-2);
                    this.mShowActionModePopup = (Runnable)new Runnable() {
                        public void run() {
                            AppCompatDelegateImpl.this.mActionModePopup.showAtLocation((View)AppCompatDelegateImpl.this.mActionModeView, 55, 0, 0);
                            AppCompatDelegateImpl.this.endOnGoingFadeAnimation();
                            if (AppCompatDelegateImpl.this.shouldAnimateActionModeView()) {
                                AppCompatDelegateImpl.this.mActionModeView.setAlpha(0.0f);
                                (AppCompatDelegateImpl.this.mFadeAnim = ViewCompat.animate((View)AppCompatDelegateImpl.this.mActionModeView).alpha(1.0f)).setListener((ViewPropertyAnimatorListener)new ViewPropertyAnimatorListenerAdapter() {
                                    public void onAnimationStart(final View view) {
                                        AppCompatDelegateImpl.this.mActionModeView.setVisibility();
                                    }
                                    
                                    public void onAnimationEnd(final View view) {
                                        AppCompatDelegateImpl.this.mActionModeView.setAlpha(1.0f);
                                        AppCompatDelegateImpl.this.mFadeAnim.setListener((ViewPropertyAnimatorListener)null);
                                        AppCompatDelegateImpl.this.mFadeAnim = null;
                                    }
                                });
                            }
                            else {
                                AppCompatDelegateImpl.this.mActionModeView.setAlpha(1.0f);
                                AppCompatDelegateImpl.this.mActionModeView.setVisibility();
                            }
                        }
                    };
                }
                else {
                    final ViewStubCompat stub = (ViewStubCompat)this.mSubDecor.findViewById(R.id.action_mode_bar_stub);
                    if (stub != null) {
                        stub.setLayoutInflater(LayoutInflater.from(this.getActionBarThemedContext()));
                        this.mActionModeView = (ActionBarContextView)stub.inflate();
                    }
                }
            }
            if (this.mActionModeView != null) {
                this.endOnGoingFadeAnimation();
                this.mActionModeView.killMode();
                mode = new StandaloneActionMode(this.mActionModeView.getContext(), this.mActionModeView, callback, this.mActionModePopup == null);
                if (callback.onCreateActionMode(mode, mode.getMenu())) {
                    mode.invalidate();
                    this.mActionModeView.initForMode(mode);
                    this.mActionMode = mode;
                    if (this.shouldAnimateActionModeView()) {
                        this.mActionModeView.setAlpha(0.0f);
                        (this.mFadeAnim = ViewCompat.animate((View)this.mActionModeView).alpha(1.0f)).setListener((ViewPropertyAnimatorListener)new ViewPropertyAnimatorListenerAdapter() {
                            public void onAnimationStart(final View view) {
                                AppCompatDelegateImpl.this.mActionModeView.setVisibility();
                                if (AppCompatDelegateImpl.this.mActionModeView.getParent() instanceof View) {
                                    ViewCompat.requestApplyInsets((View)AppCompatDelegateImpl.this.mActionModeView.getParent());
                                }
                            }
                            
                            public void onAnimationEnd(final View view) {
                                AppCompatDelegateImpl.this.mActionModeView.setAlpha(1.0f);
                                AppCompatDelegateImpl.this.mFadeAnim.setListener((ViewPropertyAnimatorListener)null);
                                AppCompatDelegateImpl.this.mFadeAnim = null;
                            }
                        });
                    }
                    else {
                        this.mActionModeView.setAlpha(1.0f);
                        this.mActionModeView.setVisibility();
                        if (this.mActionModeView.getParent() instanceof View) {
                            ViewCompat.requestApplyInsets((View)this.mActionModeView.getParent());
                        }
                    }
                    if (this.mActionModePopup != null) {
                        this.mWindow.getDecorView().post(this.mShowActionModePopup);
                    }
                }
                else {
                    this.mActionMode = null;
                }
            }
        }
        if (this.mActionMode != null && this.mAppCompatCallback != null) {
            this.mAppCompatCallback.onSupportActionModeStarted(this.mActionMode);
        }
        this.updateBackInvokedCallbackState();
        return this.mActionMode;
    }
    
    final boolean shouldAnimateActionModeView() {
        return this.mSubDecorInstalled && this.mSubDecor != null && this.mSubDecor.isLaidOut();
    }
    
    @Override
    public void setHandleNativeActionModesEnabled(final boolean enabled) {
        this.mHandleNativeActionModes = enabled;
    }
    
    @Override
    public boolean isHandleNativeActionModesEnabled() {
        return this.mHandleNativeActionModes;
    }
    
    void endOnGoingFadeAnimation() {
        if (this.mFadeAnim != null) {
            this.mFadeAnim.cancel();
        }
    }
    
    boolean shouldRegisterBackInvokedCallback() {
        if (this.mDispatcher == null) {
            return false;
        }
        final PanelFeatureState st = this.getPanelState(0, false);
        return (st != null && st.isOpen) || this.mActionMode != null;
    }
    
    boolean onBackPressed() {
        final boolean wasLongPressBackDown = this.mLongPressBackDown;
        this.mLongPressBackDown = false;
        final PanelFeatureState st = this.getPanelState(0, false);
        if (st != null && st.isOpen) {
            if (!wasLongPressBackDown) {
                this.closePanel(st, true);
            }
            return true;
        }
        if (this.mActionMode != null) {
            this.mActionMode.finish();
            return true;
        }
        final ActionBar ab = this.getSupportActionBar();
        return ab != null && ab.collapseActionView();
    }
    
    boolean onKeyShortcut(final int keyCode, final KeyEvent ev) {
        final ActionBar ab = this.getSupportActionBar();
        if (ab != null && ab.onKeyShortcut(keyCode, ev)) {
            return true;
        }
        if (this.mPreparedPanel != null) {
            final boolean handled = this.performPanelShortcut(this.mPreparedPanel, ev.getKeyCode(), ev, 1);
            if (handled) {
                if (this.mPreparedPanel != null) {
                    this.mPreparedPanel.isHandled = true;
                }
                return true;
            }
        }
        if (this.mPreparedPanel == null) {
            final PanelFeatureState st = this.getPanelState(0, true);
            this.preparePanel(st, ev);
            final boolean handled = this.performPanelShortcut(st, ev.getKeyCode(), ev, 1);
            st.isPrepared = false;
            if (handled) {
                return true;
            }
        }
        return false;
    }
    
    boolean dispatchKeyEvent(final KeyEvent event) {
        if (this.mHost instanceof KeyEventDispatcher.Component || this.mHost instanceof AppCompatDialog) {
            final View root = this.mWindow.getDecorView();
            if (root != null && KeyEventDispatcher.dispatchBeforeHierarchy(root, event)) {
                return true;
            }
        }
        if (event.getKeyCode() == 82 && this.mAppCompatWindowCallback.bypassDispatchKeyEvent(this.mWindow.getCallback(), event)) {
            return true;
        }
        final int keyCode = event.getKeyCode();
        final int action = event.getAction();
        final boolean isDown = action == 0;
        return isDown ? this.onKeyDown(keyCode, event) : this.onKeyUp(keyCode, event);
    }
    
    boolean onKeyUp(final int keyCode, final KeyEvent event) {
        switch (keyCode) {
            case 82: {
                this.onKeyUpPanel(0, event);
                return true;
            }
            case 4: {
                if (this.onBackPressed()) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
    
    boolean onKeyDown(final int keyCode, final KeyEvent event) {
        switch (keyCode) {
            case 82: {
                this.onKeyDownPanel(0, event);
                return true;
            }
            case 4: {
                this.mLongPressBackDown = ((event.getFlags() & 0x80) != 0x0);
                break;
            }
        }
        return false;
    }
    
    @Override
    public View createView(final View parent, final String name, @NonNull final Context context, @NonNull final AttributeSet attrs) {
        if (this.mAppCompatViewInflater == null) {
            final TypedArray a = this.mContext.obtainStyledAttributes(R.styleable.AppCompatTheme);
            final String viewInflaterClassName = a.getString(R.styleable.AppCompatTheme_viewInflaterClass);
            a.recycle();
            if (viewInflaterClassName == null) {
                this.mAppCompatViewInflater = new AppCompatViewInflater();
            }
            else {
                try {
                    final Class<?> viewInflaterClass = this.mContext.getClassLoader().loadClass(viewInflaterClassName);
                    this.mAppCompatViewInflater = (AppCompatViewInflater)viewInflaterClass.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                }
                catch (final Throwable t) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + viewInflaterClassName + ". Falling back to default.", t);
                    this.mAppCompatViewInflater = new AppCompatViewInflater();
                }
            }
        }
        boolean inheritContext = false;
        if (AppCompatDelegateImpl.IS_PRE_LOLLIPOP) {
            if (this.mLayoutIncludeDetector == null) {
                this.mLayoutIncludeDetector = new LayoutIncludeDetector();
            }
            inheritContext = (this.mLayoutIncludeDetector.detect(attrs) || ((attrs instanceof XmlPullParser) ? (((XmlPullParser)attrs).getDepth() > 1) : this.shouldInheritContext((ViewParent)parent)));
        }
        return this.mAppCompatViewInflater.createView(parent, name, context, attrs, inheritContext, AppCompatDelegateImpl.IS_PRE_LOLLIPOP, true, VectorEnabledTintResources.shouldBeUsed());
    }
    
    private boolean shouldInheritContext(ViewParent parent) {
        if (parent == null) {
            return false;
        }
        final View windowDecor = this.mWindow.getDecorView();
        while (parent != null) {
            if (parent == windowDecor || !(parent instanceof View) || ((View)parent).isAttachedToWindow()) {
                return false;
            }
            parent = parent.getParent();
        }
        return true;
    }
    
    @Override
    public void installViewFactory() {
        final LayoutInflater layoutInflater = LayoutInflater.from(this.mContext);
        if (layoutInflater.getFactory() == null) {
            LayoutInflaterCompat.setFactory2(layoutInflater, (LayoutInflater.Factory2)this);
        }
        else if (!(layoutInflater.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }
    
    public final View onCreateView(final View parent, final String name, final Context context, final AttributeSet attrs) {
        return this.createView(parent, name, context, attrs);
    }
    
    public View onCreateView(final String name, final Context context, final AttributeSet attrs) {
        return this.onCreateView(null, name, context, attrs);
    }
    
    @Nullable
    private AppCompatActivity tryUnwrapContext() {
        for (Context context = this.mContext; context != null; context = ((ContextWrapper)context).getBaseContext()) {
            if (context instanceof AppCompatActivity) {
                return (AppCompatActivity)context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
        }
        return null;
    }
    
    private void openPanel(final PanelFeatureState st, final KeyEvent event) {
        if (st.isOpen || this.mDestroyed) {
            return;
        }
        if (st.featureId == 0) {
            final Configuration config = this.mContext.getResources().getConfiguration();
            final boolean isXLarge = (config.screenLayout & 0xF) == 0x4;
            if (isXLarge) {
                return;
            }
        }
        final Window.Callback cb = this.getWindowCallback();
        if (cb != null && !cb.onMenuOpened(st.featureId, (Menu)st.menu)) {
            this.closePanel(st, true);
            return;
        }
        final WindowManager wm = (WindowManager)this.mContext.getSystemService("window");
        if (wm == null) {
            return;
        }
        if (!this.preparePanel(st, event)) {
            return;
        }
        int width = -2;
        if (st.decorView == null || st.refreshDecorView) {
            if (st.decorView == null) {
                if (!this.initializePanelDecor(st) || st.decorView == null) {
                    return;
                }
            }
            else if (st.refreshDecorView && st.decorView.getChildCount() > 0) {
                st.decorView.removeAllViews();
            }
            if (!this.initializePanelContent(st) || !st.hasPanelItems()) {
                st.refreshDecorView = true;
                return;
            }
            ViewGroup.LayoutParams lp = st.shownPanelView.getLayoutParams();
            if (lp == null) {
                lp = new ViewGroup.LayoutParams(-2, -2);
            }
            final int backgroundResId = st.background;
            st.decorView.setBackgroundResource(backgroundResId);
            final ViewParent shownPanelParent = st.shownPanelView.getParent();
            if (shownPanelParent instanceof ViewGroup) {
                ((ViewGroup)shownPanelParent).removeView(st.shownPanelView);
            }
            st.decorView.addView(st.shownPanelView, lp);
            if (!st.shownPanelView.hasFocus()) {
                st.shownPanelView.requestFocus();
            }
        }
        else if (st.createdPanelView != null) {
            final ViewGroup.LayoutParams lp = st.createdPanelView.getLayoutParams();
            if (lp != null && lp.width == -1) {
                width = -1;
            }
        }
        st.isHandled = false;
        final WindowManager.LayoutParams lp2 = new WindowManager.LayoutParams(width, -2, st.x, st.y, 1002, 8519680, -3);
        lp2.gravity = st.gravity;
        lp2.windowAnimations = st.windowAnimations;
        wm.addView((View)st.decorView, (ViewGroup.LayoutParams)lp2);
        st.isOpen = true;
        if (st.featureId == 0) {
            this.updateBackInvokedCallbackState();
        }
    }
    
    private boolean initializePanelDecor(final PanelFeatureState st) {
        st.setStyle(this.getActionBarThemedContext());
        st.decorView = (ViewGroup)new ListMenuDecorView(st.listPresenterContext);
        st.gravity = 81;
        return true;
    }
    
    private void reopenMenu(final boolean toggleMenuMode) {
        if (this.mDecorContentParent != null && this.mDecorContentParent.canShowOverflowMenu() && (!ViewConfiguration.get(this.mContext).hasPermanentMenuKey() || this.mDecorContentParent.isOverflowMenuShowPending())) {
            final Window.Callback cb = this.getWindowCallback();
            if (!this.mDecorContentParent.isOverflowMenuShowing() || !toggleMenuMode) {
                if (cb != null && !this.mDestroyed) {
                    if (this.mInvalidatePanelMenuPosted && (this.mInvalidatePanelMenuFeatures & 0x1) != 0x0) {
                        this.mWindow.getDecorView().removeCallbacks(this.mInvalidatePanelMenuRunnable);
                        this.mInvalidatePanelMenuRunnable.run();
                    }
                    final PanelFeatureState st = this.getPanelState(0, true);
                    if (st.menu != null && !st.refreshMenuContent && cb.onPreparePanel(0, st.createdPanelView, (Menu)st.menu)) {
                        cb.onMenuOpened(108, (Menu)st.menu);
                        this.mDecorContentParent.showOverflowMenu();
                    }
                }
            }
            else {
                this.mDecorContentParent.hideOverflowMenu();
                if (!this.mDestroyed) {
                    final PanelFeatureState st = this.getPanelState(0, true);
                    cb.onPanelClosed(108, (Menu)st.menu);
                }
            }
            return;
        }
        final PanelFeatureState st2 = this.getPanelState(0, true);
        st2.refreshDecorView = true;
        this.closePanel(st2, false);
        this.openPanel(st2, null);
    }
    
    private boolean initializePanelMenu(final PanelFeatureState st) {
        Context context = this.mContext;
        if ((st.featureId == 0 || st.featureId == 108) && this.mDecorContentParent != null) {
            final TypedValue outValue = new TypedValue();
            final Resources.Theme baseTheme = context.getTheme();
            baseTheme.resolveAttribute(R.attr.actionBarTheme, outValue, true);
            Resources.Theme widgetTheme = null;
            if (outValue.resourceId != 0) {
                widgetTheme = context.getResources().newTheme();
                widgetTheme.setTo(baseTheme);
                widgetTheme.applyStyle(outValue.resourceId, true);
                widgetTheme.resolveAttribute(R.attr.actionBarWidgetTheme, outValue, true);
            }
            else {
                baseTheme.resolveAttribute(R.attr.actionBarWidgetTheme, outValue, true);
            }
            if (outValue.resourceId != 0) {
                if (widgetTheme == null) {
                    widgetTheme = context.getResources().newTheme();
                    widgetTheme.setTo(baseTheme);
                }
                widgetTheme.applyStyle(outValue.resourceId, true);
            }
            if (widgetTheme != null) {
                context = (Context)new androidx.appcompat.view.ContextThemeWrapper(context, 0);
                context.getTheme().setTo(widgetTheme);
            }
        }
        final MenuBuilder menu = new MenuBuilder(context);
        menu.setCallback(this);
        st.setMenu(menu);
        return true;
    }
    
    private boolean initializePanelContent(final PanelFeatureState st) {
        if (st.createdPanelView != null) {
            st.shownPanelView = st.createdPanelView;
            return true;
        }
        if (st.menu == null) {
            return false;
        }
        if (this.mPanelMenuPresenterCallback == null) {
            this.mPanelMenuPresenterCallback = new PanelMenuPresenterCallback();
        }
        final MenuView menuView = st.getListMenuView(this.mPanelMenuPresenterCallback);
        st.shownPanelView = (View)menuView;
        return st.shownPanelView != null;
    }
    
    private boolean preparePanel(final PanelFeatureState st, final KeyEvent event) {
        if (this.mDestroyed) {
            return false;
        }
        if (st.isPrepared) {
            return true;
        }
        if (this.mPreparedPanel != null && this.mPreparedPanel != st) {
            this.closePanel(this.mPreparedPanel, false);
        }
        final Window.Callback cb = this.getWindowCallback();
        if (cb != null) {
            st.createdPanelView = cb.onCreatePanelView(st.featureId);
        }
        final boolean isActionBarMenu = st.featureId == 0 || st.featureId == 108;
        if (isActionBarMenu && this.mDecorContentParent != null) {
            this.mDecorContentParent.setMenuPrepared();
        }
        if (st.createdPanelView == null && (!isActionBarMenu || !(this.peekSupportActionBar() instanceof ToolbarActionBar))) {
            if (st.menu == null || st.refreshMenuContent) {
                if (st.menu == null && (!this.initializePanelMenu(st) || st.menu == null)) {
                    return false;
                }
                if (isActionBarMenu && this.mDecorContentParent != null) {
                    if (this.mActionMenuPresenterCallback == null) {
                        this.mActionMenuPresenterCallback = new ActionMenuPresenterCallback();
                    }
                    this.mDecorContentParent.setMenu((Menu)st.menu, this.mActionMenuPresenterCallback);
                }
                st.menu.stopDispatchingItemsChanged();
                if (!cb.onCreatePanelMenu(st.featureId, (Menu)st.menu)) {
                    st.setMenu(null);
                    if (isActionBarMenu && this.mDecorContentParent != null) {
                        this.mDecorContentParent.setMenu(null, this.mActionMenuPresenterCallback);
                    }
                    return false;
                }
                st.refreshMenuContent = false;
            }
            st.menu.stopDispatchingItemsChanged();
            if (st.frozenActionViewState != null) {
                st.menu.restoreActionViewStates(st.frozenActionViewState);
                st.frozenActionViewState = null;
            }
            if (!cb.onPreparePanel(0, st.createdPanelView, (Menu)st.menu)) {
                if (isActionBarMenu && this.mDecorContentParent != null) {
                    this.mDecorContentParent.setMenu(null, this.mActionMenuPresenterCallback);
                }
                st.menu.startDispatchingItemsChanged();
                return false;
            }
            final KeyCharacterMap kmap = KeyCharacterMap.load((event != null) ? event.getDeviceId() : -1);
            st.qwertyMode = (kmap.getKeyboardType() != 1);
            st.menu.setQwertyMode(st.qwertyMode);
            st.menu.startDispatchingItemsChanged();
        }
        st.isPrepared = true;
        st.isHandled = false;
        this.mPreparedPanel = st;
        return true;
    }
    
    void checkCloseActionMenu(@NonNull final MenuBuilder menu) {
        if (this.mClosingActionMenu) {
            return;
        }
        this.mClosingActionMenu = true;
        this.mDecorContentParent.dismissPopups();
        final Window.Callback cb = this.getWindowCallback();
        if (cb != null && !this.mDestroyed) {
            cb.onPanelClosed(108, (Menu)menu);
        }
        this.mClosingActionMenu = false;
    }
    
    void closePanel(final int featureId) {
        this.closePanel(this.getPanelState(featureId, true), true);
    }
    
    void closePanel(final PanelFeatureState st, final boolean doCallback) {
        if (doCallback && st.featureId == 0 && this.mDecorContentParent != null && this.mDecorContentParent.isOverflowMenuShowing()) {
            this.checkCloseActionMenu(st.menu);
            return;
        }
        final WindowManager wm = (WindowManager)this.mContext.getSystemService("window");
        if (wm != null && st.isOpen && st.decorView != null) {
            wm.removeView((View)st.decorView);
            if (doCallback) {
                this.callOnPanelClosed(st.featureId, st, null);
            }
        }
        st.isPrepared = false;
        st.isHandled = false;
        st.isOpen = false;
        st.shownPanelView = null;
        st.refreshDecorView = true;
        if (this.mPreparedPanel == st) {
            this.mPreparedPanel = null;
        }
        if (st.featureId == 0) {
            this.updateBackInvokedCallbackState();
        }
    }
    
    private boolean onKeyDownPanel(final int featureId, final KeyEvent event) {
        if (event.getRepeatCount() == 0) {
            final PanelFeatureState st = this.getPanelState(featureId, true);
            if (!st.isOpen) {
                return this.preparePanel(st, event);
            }
        }
        return false;
    }
    
    private boolean onKeyUpPanel(final int featureId, final KeyEvent event) {
        if (this.mActionMode != null) {
            return false;
        }
        boolean handled = false;
        final PanelFeatureState st = this.getPanelState(featureId, true);
        if (featureId == 0 && this.mDecorContentParent != null && this.mDecorContentParent.canShowOverflowMenu() && !ViewConfiguration.get(this.mContext).hasPermanentMenuKey()) {
            if (!this.mDecorContentParent.isOverflowMenuShowing()) {
                if (!this.mDestroyed && this.preparePanel(st, event)) {
                    handled = this.mDecorContentParent.showOverflowMenu();
                }
            }
            else {
                handled = this.mDecorContentParent.hideOverflowMenu();
            }
        }
        else if (st.isOpen || st.isHandled) {
            handled = st.isOpen;
            this.closePanel(st, true);
        }
        else if (st.isPrepared) {
            boolean show = true;
            if (st.refreshMenuContent) {
                st.isPrepared = false;
                show = this.preparePanel(st, event);
            }
            if (show) {
                this.openPanel(st, event);
                handled = true;
            }
        }
        if (handled) {
            final AudioManager audioManager = (AudioManager)this.mContext.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            }
            else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return handled;
    }
    
    void callOnPanelClosed(final int featureId, PanelFeatureState panel, Menu menu) {
        if (menu == null) {
            if (panel == null && featureId >= 0 && featureId < this.mPanels.length) {
                panel = this.mPanels[featureId];
            }
            if (panel != null) {
                menu = (Menu)panel.menu;
            }
        }
        if (panel != null && !panel.isOpen) {
            return;
        }
        if (!this.mDestroyed) {
            this.mAppCompatWindowCallback.bypassOnPanelClosed(this.mWindow.getCallback(), featureId, menu);
        }
    }
    
    PanelFeatureState findMenuPanel(final Menu menu) {
        final PanelFeatureState[] panels = this.mPanels;
        for (int N = (panels != null) ? panels.length : 0, i = 0; i < N; ++i) {
            final PanelFeatureState panel = panels[i];
            if (panel != null && panel.menu == menu) {
                return panel;
            }
        }
        return null;
    }
    
    protected PanelFeatureState getPanelState(final int featureId, final boolean required) {
        PanelFeatureState[] ar;
        if ((ar = this.mPanels) == null || ar.length <= featureId) {
            final PanelFeatureState[] nar = new PanelFeatureState[featureId + 1];
            if (ar != null) {
                System.arraycopy((Object)ar, 0, (Object)nar, 0, ar.length);
            }
            ar = (this.mPanels = nar);
        }
        PanelFeatureState st = ar[featureId];
        if (st == null) {
            st = (ar[featureId] = new PanelFeatureState(featureId));
        }
        return st;
    }
    
    private boolean performPanelShortcut(final PanelFeatureState st, final int keyCode, final KeyEvent event, final int flags) {
        if (event.isSystem()) {
            return false;
        }
        boolean handled = false;
        if ((st.isPrepared || this.preparePanel(st, event)) && st.menu != null) {
            handled = st.menu.performShortcut(keyCode, event, flags);
        }
        if (handled && (flags & 0x1) == 0x0 && this.mDecorContentParent == null) {
            this.closePanel(st, true);
        }
        return handled;
    }
    
    private void invalidatePanelMenu(final int featureId) {
        this.mInvalidatePanelMenuFeatures |= 1 << featureId;
        if (!this.mInvalidatePanelMenuPosted) {
            ViewCompat.postOnAnimation(this.mWindow.getDecorView(), this.mInvalidatePanelMenuRunnable);
            this.mInvalidatePanelMenuPosted = true;
        }
    }
    
    void doInvalidatePanelMenu(final int featureId) {
        PanelFeatureState st = this.getPanelState(featureId, true);
        Bundle savedActionViewStates = null;
        if (st.menu != null) {
            savedActionViewStates = new Bundle();
            st.menu.saveActionViewStates(savedActionViewStates);
            if (savedActionViewStates.size() > 0) {
                st.frozenActionViewState = savedActionViewStates;
            }
            st.menu.stopDispatchingItemsChanged();
            st.menu.clear();
        }
        st.refreshMenuContent = true;
        st.refreshDecorView = true;
        if ((featureId == 108 || featureId == 0) && this.mDecorContentParent != null) {
            st = this.getPanelState(0, false);
            if (st != null) {
                st.isPrepared = false;
                this.preparePanel(st, null);
            }
        }
    }
    
    final int updateStatusGuard(@Nullable final WindowInsetsCompat insets, @Nullable final Rect rectInsets) {
        int systemWindowInsetTop = 0;
        if (insets != null) {
            systemWindowInsetTop = insets.getSystemWindowInsetTop();
        }
        else if (rectInsets != null) {
            systemWindowInsetTop = rectInsets.top;
        }
        boolean showStatusGuard = false;
        if (this.mActionModeView != null && this.mActionModeView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            final ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams)this.mActionModeView.getLayoutParams();
            boolean mlpChanged = false;
            if (this.mActionModeView.isShown()) {
                if (this.mTempRect1 == null) {
                    this.mTempRect1 = new Rect();
                    this.mTempRect2 = new Rect();
                }
                final Rect innerInsets = this.mTempRect1;
                final Rect rect = this.mTempRect2;
                if (insets == null) {
                    innerInsets.set(rectInsets);
                }
                else {
                    innerInsets.set(insets.getSystemWindowInsetLeft(), insets.getSystemWindowInsetTop(), insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom());
                }
                ViewUtils.computeFitSystemWindows((View)this.mSubDecor, innerInsets, rect);
                final int newTopMargin = innerInsets.top;
                final int newLeftMargin = innerInsets.left;
                final int newRightMargin = innerInsets.right;
                final WindowInsetsCompat rootInsets = ViewCompat.getRootWindowInsets((View)this.mSubDecor);
                final int newGuardLeftMargin = (rootInsets == null) ? 0 : rootInsets.getSystemWindowInsetLeft();
                final int newGuardRightMargin = (rootInsets == null) ? 0 : rootInsets.getSystemWindowInsetRight();
                if (mlp.topMargin != newTopMargin || mlp.leftMargin != newLeftMargin || mlp.rightMargin != newRightMargin) {
                    mlpChanged = true;
                    mlp.topMargin = newTopMargin;
                    mlp.leftMargin = newLeftMargin;
                    mlp.rightMargin = newRightMargin;
                }
                if (newTopMargin > 0 && this.mStatusGuard == null) {
                    (this.mStatusGuard = new View(this.mContext)).setVisibility(8);
                    final FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(-1, mlp.topMargin, 51);
                    lp.leftMargin = newGuardLeftMargin;
                    lp.rightMargin = newGuardRightMargin;
                    this.mSubDecor.addView(this.mStatusGuard, -1, (ViewGroup.LayoutParams)lp);
                }
                else if (this.mStatusGuard != null) {
                    final ViewGroup.MarginLayoutParams lp2 = (ViewGroup.MarginLayoutParams)this.mStatusGuard.getLayoutParams();
                    if (lp2.height != mlp.topMargin || lp2.leftMargin != newGuardLeftMargin || lp2.rightMargin != newGuardRightMargin) {
                        lp2.height = mlp.topMargin;
                        lp2.leftMargin = newGuardLeftMargin;
                        lp2.rightMargin = newGuardRightMargin;
                        this.mStatusGuard.setLayoutParams((ViewGroup.LayoutParams)lp2);
                    }
                }
                showStatusGuard = (this.mStatusGuard != null);
                if (showStatusGuard && this.mStatusGuard.getVisibility() != 0) {
                    this.updateStatusGuardColor(this.mStatusGuard);
                }
                if (!this.mOverlayActionMode && showStatusGuard) {
                    systemWindowInsetTop = 0;
                }
            }
            else if (mlp.topMargin != 0) {
                mlpChanged = true;
                mlp.topMargin = 0;
            }
            if (mlpChanged) {
                this.mActionModeView.setLayoutParams((ViewGroup.LayoutParams)mlp);
            }
        }
        if (this.mStatusGuard != null) {
            this.mStatusGuard.setVisibility(showStatusGuard ? 0 : 8);
        }
        return systemWindowInsetTop;
    }
    
    private void updateStatusGuardColor(final View v) {
        final boolean lightStatusBar = (ViewCompat.getWindowSystemUiVisibility(v) & 0x2000) != 0x0;
        v.setBackgroundColor(lightStatusBar ? ContextCompat.getColor(this.mContext, R.color.abc_decor_view_status_guard_light) : ContextCompat.getColor(this.mContext, R.color.abc_decor_view_status_guard));
    }
    
    private void throwFeatureRequestIfSubDecorInstalled() {
        if (this.mSubDecorInstalled) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }
    
    private int sanitizeWindowFeatureId(final int featureId) {
        if (featureId == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (featureId == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
        return featureId;
    }
    
    ViewGroup getSubDecor() {
        return this.mSubDecor;
    }
    
    void dismissPopups() {
        if (this.mDecorContentParent != null) {
            this.mDecorContentParent.dismissPopups();
        }
        if (this.mActionModePopup != null) {
            this.mWindow.getDecorView().removeCallbacks(this.mShowActionModePopup);
            if (this.mActionModePopup.isShowing()) {
                try {
                    this.mActionModePopup.dismiss();
                }
                catch (final IllegalArgumentException ex) {}
            }
            this.mActionModePopup = null;
        }
        this.endOnGoingFadeAnimation();
        final PanelFeatureState st = this.getPanelState(0, false);
        if (st != null && st.menu != null) {
            st.menu.close();
        }
    }
    
    @Override
    public Context getContextForDelegate() {
        return this.mContext;
    }
    
    @Override
    public boolean applyDayNight() {
        return this.applyApplicationSpecificConfig(true);
    }
    
    @Override
    boolean applyAppLocales() {
        if (AppCompatDelegate.isAutoStorageOptedIn(this.mContext) && getRequestedAppLocales() != null && !AppCompatDelegate.getRequestedAppLocales().equals((Object)AppCompatDelegate.getStoredAppLocales())) {
            this.asyncExecuteSyncRequestedAndStoredLocales(this.mContext);
        }
        return this.applyApplicationSpecificConfig(true);
    }
    
    private boolean applyApplicationSpecificConfig(final boolean allowRecreation) {
        return this.applyApplicationSpecificConfig(allowRecreation, true);
    }
    
    private boolean applyApplicationSpecificConfig(final boolean allowRecreation, final boolean isLocalesApplicationRequired) {
        if (this.mDestroyed) {
            return false;
        }
        final int nightMode = this.calculateNightMode();
        final int modeToApply = this.mapNightMode(this.mContext, nightMode);
        LocaleListCompat localesToBeApplied = null;
        if (Build.VERSION.SDK_INT < 33) {
            localesToBeApplied = this.calculateApplicationLocales(this.mContext);
        }
        if (!isLocalesApplicationRequired && localesToBeApplied != null) {
            localesToBeApplied = this.getConfigurationLocales(this.mContext.getResources().getConfiguration());
        }
        final boolean applied = this.updateAppConfiguration(modeToApply, localesToBeApplied, allowRecreation);
        if (nightMode == 0) {
            this.getAutoTimeNightModeManager(this.mContext).setup();
        }
        else if (this.mAutoTimeNightModeManager != null) {
            this.mAutoTimeNightModeManager.cleanup();
        }
        if (nightMode == 3) {
            this.getAutoBatteryNightModeManager(this.mContext).setup();
        }
        else if (this.mAutoBatteryNightModeManager != null) {
            this.mAutoBatteryNightModeManager.cleanup();
        }
        return applied;
    }
    
    @Nullable
    LocaleListCompat calculateApplicationLocales(@NonNull final Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            return null;
        }
        final LocaleListCompat requestedLocales = AppCompatDelegate.getRequestedAppLocales();
        if (requestedLocales == null) {
            return null;
        }
        final LocaleListCompat systemLocales = this.getConfigurationLocales(context.getApplicationContext().getResources().getConfiguration());
        LocaleListCompat localesToBeApplied;
        if (Build.VERSION.SDK_INT >= 24) {
            localesToBeApplied = LocaleOverlayHelper.combineLocalesIfOverlayExists(requestedLocales, systemLocales);
        }
        else if (requestedLocales.isEmpty()) {
            localesToBeApplied = LocaleListCompat.getEmptyLocaleList();
        }
        else if (Build.VERSION.SDK_INT >= 21) {
            localesToBeApplied = LocaleListCompat.forLanguageTags(Api21Impl.toLanguageTag(requestedLocales.get(0)));
        }
        else {
            localesToBeApplied = LocaleListCompat.forLanguageTags(requestedLocales.get(0).toString());
        }
        if (localesToBeApplied.isEmpty()) {
            localesToBeApplied = systemLocales;
        }
        return localesToBeApplied;
    }
    
    @Override
    public void setLocalNightMode(final int mode) {
        if (this.mLocalNightMode != mode) {
            this.mLocalNightMode = mode;
            if (this.mBaseContextAttached) {
                this.applyDayNight();
            }
        }
    }
    
    @Override
    public int getLocalNightMode() {
        return this.mLocalNightMode;
    }
    
    int mapNightMode(@NonNull final Context context, final int mode) {
        switch (mode) {
            case -1:
            case 1:
            case 2: {
                return mode;
            }
            case 0: {
                if (Build.VERSION.SDK_INT >= 23) {
                    final UiModeManager uiModeManager = (UiModeManager)context.getApplicationContext().getSystemService("uimode");
                    if (uiModeManager.getNightMode() == 0) {
                        return -1;
                    }
                }
                return this.getAutoTimeNightModeManager(context).getApplyableNightMode();
            }
            case 3: {
                return this.getAutoBatteryNightModeManager(context).getApplyableNightMode();
            }
            case -100: {
                return -1;
            }
            default: {
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
    }
    
    private int calculateNightMode() {
        return (this.mLocalNightMode != -100) ? this.mLocalNightMode : AppCompatDelegate.getDefaultNightMode();
    }
    
    void setConfigurationLocales(final Configuration conf, @NonNull final LocaleListCompat locales) {
        if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.setLocales(conf, locales);
        }
        else {
            conf.setLocale(locales.get(0));
            conf.setLayoutDirection(locales.get(0));
        }
    }
    
    LocaleListCompat getConfigurationLocales(final Configuration conf) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.getLocales(conf);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return LocaleListCompat.forLanguageTags(Api21Impl.toLanguageTag(conf.locale));
        }
        return LocaleListCompat.create(new Locale[] { conf.locale });
    }
    
    void setDefaultLocalesForLocaleList(final LocaleListCompat locales) {
        if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.setDefaultLocales(locales);
        }
        else {
            Locale.setDefault(locales.get(0));
        }
    }
    
    @NonNull
    private Configuration createOverrideAppConfiguration(@NonNull final Context context, final int mode, @Nullable final LocaleListCompat locales, @Nullable final Configuration configOverlay, final boolean ignoreFollowSystem) {
        int newNightMode = 0;
        switch (mode) {
            case 2: {
                newNightMode = 32;
                break;
            }
            case 1: {
                newNightMode = 16;
                break;
            }
            default: {
                if (ignoreFollowSystem) {
                    newNightMode = 0;
                    break;
                }
                final Configuration appConfig = context.getApplicationContext().getResources().getConfiguration();
                newNightMode = (appConfig.uiMode & 0x30);
                break;
            }
        }
        final Configuration overrideConf = new Configuration();
        overrideConf.fontScale = 0.0f;
        if (configOverlay != null) {
            overrideConf.setTo(configOverlay);
        }
        overrideConf.uiMode = (newNightMode | (overrideConf.uiMode & 0xFFFFFFCF));
        if (locales != null) {
            this.setConfigurationLocales(overrideConf, locales);
        }
        return overrideConf;
    }
    
    private boolean updateAppConfiguration(final int nightMode, @Nullable final LocaleListCompat locales, final boolean allowRecreation) {
        boolean handled = false;
        final Configuration overrideConfig = this.createOverrideAppConfiguration(this.mContext, nightMode, locales, null, false);
        final int activityHandlingConfigChange = this.getActivityHandlesConfigChangesFlags(this.mContext);
        final Configuration currentConfiguration = (this.mEffectiveConfiguration == null) ? this.mContext.getResources().getConfiguration() : this.mEffectiveConfiguration;
        final int currentNightMode = currentConfiguration.uiMode & 0x30;
        final int newNightMode = overrideConfig.uiMode & 0x30;
        final LocaleListCompat currentLocales = this.getConfigurationLocales(currentConfiguration);
        LocaleListCompat newLocales;
        if (locales == null) {
            newLocales = null;
        }
        else {
            newLocales = this.getConfigurationLocales(overrideConfig);
        }
        int configChanges = 0;
        if (currentNightMode != newNightMode) {
            configChanges |= 0x200;
        }
        if (newLocales != null && !currentLocales.equals((Object)newLocales)) {
            configChanges |= 0x4;
            configChanges |= 0x2000;
        }
        if ((~activityHandlingConfigChange & configChanges) != 0x0 && allowRecreation && this.mBaseContextAttached && (AppCompatDelegateImpl.sCanReturnDifferentContext || this.mCreated) && this.mHost instanceof Activity && !((Activity)this.mHost).isChild()) {
            if (Build.VERSION.SDK_INT >= 31 && (configChanges & 0x2000) != 0x0) {
                final View view = ((Activity)this.mHost).getWindow().getDecorView();
                view.setLayoutDirection(overrideConfig.getLayoutDirection());
            }
            ActivityCompat.recreate((Activity)this.mHost);
            handled = true;
        }
        if (!handled && configChanges != 0) {
            this.updateResourcesConfiguration(newNightMode, newLocales, (configChanges & activityHandlingConfigChange) == configChanges, null);
            handled = true;
        }
        if (handled && this.mHost instanceof AppCompatActivity) {
            if ((configChanges & 0x200) != 0x0) {
                ((AppCompatActivity)this.mHost).onNightModeChanged(nightMode);
            }
            if ((configChanges & 0x4) != 0x0) {
                ((AppCompatActivity)this.mHost).onLocalesChanged(locales);
            }
        }
        if (newLocales != null) {
            this.setDefaultLocalesForLocaleList(this.getConfigurationLocales(this.mContext.getResources().getConfiguration()));
        }
        return handled;
    }
    
    private void updateResourcesConfiguration(final int uiModeNightModeValue, @Nullable final LocaleListCompat locales, final boolean callOnConfigChange, @Nullable final Configuration configOverlay) {
        final Resources res = this.mContext.getResources();
        final Configuration conf = new Configuration(res.getConfiguration());
        if (configOverlay != null) {
            conf.updateFrom(configOverlay);
        }
        conf.uiMode = (uiModeNightModeValue | (res.getConfiguration().uiMode & 0xFFFFFFCF));
        if (locales != null) {
            this.setConfigurationLocales(conf, locales);
        }
        res.updateConfiguration(conf, (DisplayMetrics)null);
        if (Build.VERSION.SDK_INT < 26) {
            ResourcesFlusher.flush(res);
        }
        if (this.mThemeResId != 0) {
            this.mContext.setTheme(this.mThemeResId);
            if (Build.VERSION.SDK_INT >= 23) {
                this.mContext.getTheme().applyStyle(this.mThemeResId, true);
            }
        }
        if (callOnConfigChange && this.mHost instanceof Activity) {
            this.updateActivityConfiguration(conf);
        }
    }
    
    private void updateActivityConfiguration(final Configuration conf) {
        final Activity activity = (Activity)this.mHost;
        if (activity instanceof LifecycleOwner) {
            final Lifecycle lifecycle = ((LifecycleOwner)activity).getLifecycle();
            if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                activity.onConfigurationChanged(conf);
            }
        }
        else if (this.mCreated && !this.mDestroyed) {
            activity.onConfigurationChanged(conf);
        }
    }
    
    @NonNull
    @RestrictTo({ RestrictTo.Scope.LIBRARY })
    @VisibleForTesting
    final AutoNightModeManager getAutoTimeNightModeManager() {
        return this.getAutoTimeNightModeManager(this.mContext);
    }
    
    private AutoNightModeManager getAutoTimeNightModeManager(@NonNull final Context context) {
        if (this.mAutoTimeNightModeManager == null) {
            this.mAutoTimeNightModeManager = new AutoTimeNightModeManager(TwilightManager.getInstance(context));
        }
        return this.mAutoTimeNightModeManager;
    }
    
    private AutoNightModeManager getAutoBatteryNightModeManager(@NonNull final Context context) {
        if (this.mAutoBatteryNightModeManager == null) {
            this.mAutoBatteryNightModeManager = new AutoBatteryNightModeManager(context);
        }
        return this.mAutoBatteryNightModeManager;
    }
    
    private int getActivityHandlesConfigChangesFlags(final Context baseContext) {
        if (!this.mActivityHandlesConfigFlagsChecked && this.mHost instanceof Activity) {
            final PackageManager pm = baseContext.getPackageManager();
            if (pm == null) {
                return 0;
            }
            try {
                int flags = 0;
                if (Build.VERSION.SDK_INT >= 29) {
                    flags = 269221888;
                }
                else if (Build.VERSION.SDK_INT >= 24) {
                    flags = 786432;
                }
                final ActivityInfo info = pm.getActivityInfo(new ComponentName(baseContext, (Class)this.mHost.getClass()), flags);
                if (info != null) {
                    this.mActivityHandlesConfigFlags = info.configChanges;
                }
            }
            catch (final PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", (Throwable)e);
                this.mActivityHandlesConfigFlags = 0;
            }
        }
        this.mActivityHandlesConfigFlagsChecked = true;
        return this.mActivityHandlesConfigFlags;
    }
    
    @Override
    public final ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        return new ActionBarDrawableToggleImpl();
    }
    
    @NonNull
    private static Configuration generateConfigDelta(@NonNull final Configuration base, @Nullable final Configuration change) {
        final Configuration delta = new Configuration();
        delta.fontScale = 0.0f;
        if (change == null || base.diff(change) == 0) {
            return delta;
        }
        if (base.fontScale != change.fontScale) {
            delta.fontScale = change.fontScale;
        }
        if (base.mcc != change.mcc) {
            delta.mcc = change.mcc;
        }
        if (base.mnc != change.mnc) {
            delta.mnc = change.mnc;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.generateConfigDelta_locale(base, change, delta);
        }
        else if (!ObjectsCompat.equals((Object)base.locale, (Object)change.locale)) {
            delta.locale = change.locale;
        }
        if (base.touchscreen != change.touchscreen) {
            delta.touchscreen = change.touchscreen;
        }
        if (base.keyboard != change.keyboard) {
            delta.keyboard = change.keyboard;
        }
        if (base.keyboardHidden != change.keyboardHidden) {
            delta.keyboardHidden = change.keyboardHidden;
        }
        if (base.navigation != change.navigation) {
            delta.navigation = change.navigation;
        }
        if (base.navigationHidden != change.navigationHidden) {
            delta.navigationHidden = change.navigationHidden;
        }
        if (base.orientation != change.orientation) {
            delta.orientation = change.orientation;
        }
        if ((base.screenLayout & 0xF) != (change.screenLayout & 0xF)) {
            final Configuration configuration = delta;
            configuration.screenLayout |= (change.screenLayout & 0xF);
        }
        if ((base.screenLayout & 0xC0) != (change.screenLayout & 0xC0)) {
            final Configuration configuration2 = delta;
            configuration2.screenLayout |= (change.screenLayout & 0xC0);
        }
        if ((base.screenLayout & 0x30) != (change.screenLayout & 0x30)) {
            final Configuration configuration3 = delta;
            configuration3.screenLayout |= (change.screenLayout & 0x30);
        }
        if ((base.screenLayout & 0x300) != (change.screenLayout & 0x300)) {
            final Configuration configuration4 = delta;
            configuration4.screenLayout |= (change.screenLayout & 0x300);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.generateConfigDelta_colorMode(base, change, delta);
        }
        if ((base.uiMode & 0xF) != (change.uiMode & 0xF)) {
            final Configuration configuration5 = delta;
            configuration5.uiMode |= (change.uiMode & 0xF);
        }
        if ((base.uiMode & 0x30) != (change.uiMode & 0x30)) {
            final Configuration configuration6 = delta;
            configuration6.uiMode |= (change.uiMode & 0x30);
        }
        if (base.screenWidthDp != change.screenWidthDp) {
            delta.screenWidthDp = change.screenWidthDp;
        }
        if (base.screenHeightDp != change.screenHeightDp) {
            delta.screenHeightDp = change.screenHeightDp;
        }
        if (base.smallestScreenWidthDp != change.smallestScreenWidthDp) {
            delta.smallestScreenWidthDp = change.smallestScreenWidthDp;
        }
        if (base.densityDpi != change.densityDpi) {
            delta.densityDpi = change.densityDpi;
        }
        return delta;
    }
    
    static {
        sLocalNightModes = new SimpleArrayMap();
        IS_PRE_LOLLIPOP = (Build.VERSION.SDK_INT < 21);
        sWindowBackgroundStyleable = new int[] { 16842836 };
        sCanReturnDifferentContext = !"robolectric".equals((Object)Build.FINGERPRINT);
        if (AppCompatDelegateImpl.IS_PRE_LOLLIPOP && !AppCompatDelegateImpl.sInstalledExceptionHandler) {
            final Thread.UncaughtExceptionHandler defHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new Thread.UncaughtExceptionHandler() {
                final /* synthetic */ Thread.UncaughtExceptionHandler val$defHandler;
                
                public void uncaughtException(@NonNull final Thread thread, @NonNull final Throwable throwable) {
                    if (this.shouldWrapException(throwable)) {
                        final Throwable wrapped = (Throwable)new Resources.NotFoundException(throwable.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        wrapped.initCause(throwable.getCause());
                        wrapped.setStackTrace(throwable.getStackTrace());
                        this.val$defHandler.uncaughtException(thread, wrapped);
                    }
                    else {
                        this.val$defHandler.uncaughtException(thread, throwable);
                    }
                }
                
                private boolean shouldWrapException(final Throwable throwable) {
                    if (throwable instanceof Resources.NotFoundException) {
                        final String message = throwable.getMessage();
                        return message != null && (message.contains((CharSequence)"drawable") || message.contains((CharSequence)"Drawable"));
                    }
                    return false;
                }
            });
            AppCompatDelegateImpl.sInstalledExceptionHandler = true;
        }
    }
    
    class ActionModeCallbackWrapperV9 implements ActionMode.Callback
    {
        private ActionMode.Callback mWrapped;
        
        public ActionModeCallbackWrapperV9(final ActionMode.Callback wrapped) {
            this.mWrapped = wrapped;
        }
        
        @Override
        public boolean onCreateActionMode(final ActionMode mode, final Menu menu) {
            return this.mWrapped.onCreateActionMode(mode, menu);
        }
        
        @Override
        public boolean onPrepareActionMode(final ActionMode mode, final Menu menu) {
            ViewCompat.requestApplyInsets((View)AppCompatDelegateImpl.this.mSubDecor);
            return this.mWrapped.onPrepareActionMode(mode, menu);
        }
        
        @Override
        public boolean onActionItemClicked(final ActionMode mode, final MenuItem item) {
            return this.mWrapped.onActionItemClicked(mode, item);
        }
        
        @Override
        public void onDestroyActionMode(final ActionMode mode) {
            this.mWrapped.onDestroyActionMode(mode);
            if (AppCompatDelegateImpl.this.mActionModePopup != null) {
                AppCompatDelegateImpl.this.mWindow.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.mShowActionModePopup);
            }
            if (AppCompatDelegateImpl.this.mActionModeView != null) {
                AppCompatDelegateImpl.this.endOnGoingFadeAnimation();
                (AppCompatDelegateImpl.this.mFadeAnim = ViewCompat.animate((View)AppCompatDelegateImpl.this.mActionModeView).alpha(0.0f)).setListener((ViewPropertyAnimatorListener)new ViewPropertyAnimatorListenerAdapter() {
                    public void onAnimationEnd(final View view) {
                        AppCompatDelegateImpl.this.mActionModeView.setVisibility();
                        if (AppCompatDelegateImpl.this.mActionModePopup != null) {
                            AppCompatDelegateImpl.this.mActionModePopup.dismiss();
                        }
                        else if (AppCompatDelegateImpl.this.mActionModeView.getParent() instanceof View) {
                            ViewCompat.requestApplyInsets((View)AppCompatDelegateImpl.this.mActionModeView.getParent());
                        }
                        AppCompatDelegateImpl.this.mActionModeView.killMode();
                        AppCompatDelegateImpl.this.mFadeAnim.setListener((ViewPropertyAnimatorListener)null);
                        AppCompatDelegateImpl.this.mFadeAnim = null;
                        ViewCompat.requestApplyInsets((View)AppCompatDelegateImpl.this.mSubDecor);
                    }
                });
            }
            if (AppCompatDelegateImpl.this.mAppCompatCallback != null) {
                AppCompatDelegateImpl.this.mAppCompatCallback.onSupportActionModeFinished(AppCompatDelegateImpl.this.mActionMode);
            }
            AppCompatDelegateImpl.this.mActionMode = null;
            ViewCompat.requestApplyInsets((View)AppCompatDelegateImpl.this.mSubDecor);
            AppCompatDelegateImpl.this.updateBackInvokedCallbackState();
        }
    }
    
    private final class PanelMenuPresenterCallback implements MenuPresenter.Callback
    {
        PanelMenuPresenterCallback() {
        }
        
        @Override
        public void onCloseMenu(@NonNull final MenuBuilder menu, final boolean allMenusAreClosing) {
            final Menu parentMenu = (Menu)menu.getRootMenu();
            final boolean isSubMenu = parentMenu != menu;
            final PanelFeatureState panel = AppCompatDelegateImpl.this.findMenuPanel((Menu)(isSubMenu ? parentMenu : menu));
            if (panel != null) {
                if (isSubMenu) {
                    AppCompatDelegateImpl.this.callOnPanelClosed(panel.featureId, panel, parentMenu);
                    AppCompatDelegateImpl.this.closePanel(panel, true);
                }
                else {
                    AppCompatDelegateImpl.this.closePanel(panel, allMenusAreClosing);
                }
            }
        }
        
        @Override
        public boolean onOpenSubMenu(@NonNull final MenuBuilder subMenu) {
            if (subMenu == subMenu.getRootMenu() && AppCompatDelegateImpl.this.mHasActionBar) {
                final Window.Callback cb = AppCompatDelegateImpl.this.getWindowCallback();
                if (cb != null && !AppCompatDelegateImpl.this.mDestroyed) {
                    cb.onMenuOpened(108, (Menu)subMenu);
                }
            }
            return true;
        }
    }
    
    private final class ActionMenuPresenterCallback implements MenuPresenter.Callback
    {
        ActionMenuPresenterCallback() {
        }
        
        @Override
        public boolean onOpenSubMenu(@NonNull final MenuBuilder subMenu) {
            final Window.Callback cb = AppCompatDelegateImpl.this.getWindowCallback();
            if (cb != null) {
                cb.onMenuOpened(108, (Menu)subMenu);
            }
            return true;
        }
        
        @Override
        public void onCloseMenu(@NonNull final MenuBuilder menu, final boolean allMenusAreClosing) {
            AppCompatDelegateImpl.this.checkCloseActionMenu(menu);
        }
    }
    
    protected static final class PanelFeatureState
    {
        int featureId;
        int background;
        int gravity;
        int x;
        int y;
        int windowAnimations;
        ViewGroup decorView;
        View shownPanelView;
        View createdPanelView;
        MenuBuilder menu;
        ListMenuPresenter listMenuPresenter;
        Context listPresenterContext;
        boolean isPrepared;
        boolean isHandled;
        boolean isOpen;
        public boolean qwertyMode;
        boolean refreshDecorView;
        boolean refreshMenuContent;
        boolean wasLastOpen;
        Bundle frozenMenuState;
        Bundle frozenActionViewState;
        
        PanelFeatureState(final int featureId) {
            this.featureId = featureId;
            this.refreshDecorView = false;
        }
        
        public boolean hasPanelItems() {
            return this.shownPanelView != null && (this.createdPanelView != null || this.listMenuPresenter.getAdapter().getCount() > 0);
        }
        
        public void clearMenuPresenters() {
            if (this.menu != null) {
                this.menu.removeMenuPresenter(this.listMenuPresenter);
            }
            this.listMenuPresenter = null;
        }
        
        void setStyle(Context context) {
            final TypedValue outValue = new TypedValue();
            final Resources.Theme widgetTheme = context.getResources().newTheme();
            widgetTheme.setTo(context.getTheme());
            widgetTheme.resolveAttribute(R.attr.actionBarPopupTheme, outValue, true);
            if (outValue.resourceId != 0) {
                widgetTheme.applyStyle(outValue.resourceId, true);
            }
            widgetTheme.resolveAttribute(R.attr.panelMenuListTheme, outValue, true);
            if (outValue.resourceId != 0) {
                widgetTheme.applyStyle(outValue.resourceId, true);
            }
            else {
                widgetTheme.applyStyle(R.style.Theme_AppCompat_CompactMenu, true);
            }
            context = (Context)new androidx.appcompat.view.ContextThemeWrapper(context, 0);
            context.getTheme().setTo(widgetTheme);
            this.listPresenterContext = context;
            final TypedArray a = context.obtainStyledAttributes(R.styleable.AppCompatTheme);
            this.background = a.getResourceId(R.styleable.AppCompatTheme_panelBackground, 0);
            this.windowAnimations = a.getResourceId(R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            a.recycle();
        }
        
        void setMenu(final MenuBuilder menu) {
            if (menu == this.menu) {
                return;
            }
            if (this.menu != null) {
                this.menu.removeMenuPresenter(this.listMenuPresenter);
            }
            this.menu = menu;
            if (menu != null && this.listMenuPresenter != null) {
                menu.addMenuPresenter(this.listMenuPresenter);
            }
        }
        
        MenuView getListMenuView(final MenuPresenter.Callback cb) {
            if (this.menu == null) {
                return null;
            }
            if (this.listMenuPresenter == null) {
                (this.listMenuPresenter = new ListMenuPresenter(this.listPresenterContext, R.layout.abc_list_menu_item_layout)).setCallback(cb);
                this.menu.addMenuPresenter(this.listMenuPresenter);
            }
            final MenuView result = this.listMenuPresenter.getMenuView(this.decorView);
            return result;
        }
        
        Parcelable onSaveInstanceState() {
            final SavedState savedState = new SavedState();
            savedState.featureId = this.featureId;
            savedState.isOpen = this.isOpen;
            if (this.menu != null) {
                savedState.menuState = new Bundle();
                this.menu.savePresenterStates(savedState.menuState);
            }
            return (Parcelable)savedState;
        }
        
        void onRestoreInstanceState(final Parcelable state) {
            final SavedState savedState = (SavedState)state;
            this.featureId = savedState.featureId;
            this.wasLastOpen = savedState.isOpen;
            this.frozenMenuState = savedState.menuState;
            this.shownPanelView = null;
            this.decorView = null;
        }
        
        void applyFrozenState() {
            if (this.menu != null && this.frozenMenuState != null) {
                this.menu.restorePresenterStates(this.frozenMenuState);
                this.frozenMenuState = null;
            }
        }
        
        @SuppressLint({ "BanParcelableUsage" })
        private static class SavedState implements Parcelable
        {
            int featureId;
            boolean isOpen;
            Bundle menuState;
            public static final Parcelable.Creator<SavedState> CREATOR;
            
            SavedState() {
            }
            
            public int describeContents() {
                return 0;
            }
            
            public void writeToParcel(final Parcel dest, final int flags) {
                dest.writeInt(this.featureId);
                dest.writeInt((int)(this.isOpen ? 1 : 0));
                if (this.isOpen) {
                    dest.writeBundle(this.menuState);
                }
            }
            
            static SavedState readFromParcel(final Parcel source, final ClassLoader loader) {
                final SavedState savedState = new SavedState();
                savedState.featureId = source.readInt();
                savedState.isOpen = (source.readInt() == 1);
                if (savedState.isOpen) {
                    savedState.menuState = source.readBundle(loader);
                }
                return savedState;
            }
            
            static {
                CREATOR = (Parcelable.Creator)new Parcelable.ClassLoaderCreator<SavedState>() {
                    public SavedState createFromParcel(final Parcel in, final ClassLoader loader) {
                        return SavedState.readFromParcel(in, loader);
                    }
                    
                    public SavedState createFromParcel(final Parcel in) {
                        return SavedState.readFromParcel(in, null);
                    }
                    
                    public SavedState[] newArray(final int size) {
                        return new SavedState[size];
                    }
                };
            }
        }
    }
    
    private class ListMenuDecorView extends ContentFrameLayout
    {
        public ListMenuDecorView(final Context context) {
            super(context);
        }
        
        public boolean dispatchKeyEvent(final KeyEvent event) {
            return AppCompatDelegateImpl.this.dispatchKeyEvent(event) || super.dispatchKeyEvent(event);
        }
        
        public boolean onInterceptTouchEvent(final MotionEvent event) {
            final int action = event.getAction();
            if (action == 0) {
                final int x = (int)event.getX();
                final int y = (int)event.getY();
                if (this.isOutOfBounds(x, y)) {
                    AppCompatDelegateImpl.this.closePanel(0);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(event);
        }
        
        public void setBackgroundResource(final int resid) {
            this.setBackgroundDrawable(AppCompatResources.getDrawable(this.getContext(), resid));
        }
        
        private boolean isOutOfBounds(final int x, final int y) {
            return x < -5 || y < -5 || x > this.getWidth() + 5 || y > this.getHeight() + 5;
        }
    }
    
    class AppCompatWindowCallback extends WindowCallbackWrapper
    {
        private ActionBarMenuCallback mActionBarCallback;
        private boolean mOnContentChangedBypassEnabled;
        private boolean mDispatchKeyEventBypassEnabled;
        private boolean mOnPanelClosedBypassEnabled;
        
        AppCompatWindowCallback(final Window.Callback callback) {
            super(callback);
        }
        
        void setActionBarCallback(@Nullable final ActionBarMenuCallback callback) {
            this.mActionBarCallback = callback;
        }
        
        @Override
        public boolean dispatchKeyEvent(final KeyEvent event) {
            if (this.mDispatchKeyEventBypassEnabled) {
                return this.getWrapped().dispatchKeyEvent(event);
            }
            return AppCompatDelegateImpl.this.dispatchKeyEvent(event) || super.dispatchKeyEvent(event);
        }
        
        @Override
        public boolean dispatchKeyShortcutEvent(final KeyEvent event) {
            return super.dispatchKeyShortcutEvent(event) || AppCompatDelegateImpl.this.onKeyShortcut(event.getKeyCode(), event);
        }
        
        @Override
        public boolean onCreatePanelMenu(final int featureId, final Menu menu) {
            return (featureId != 0 || menu instanceof MenuBuilder) && super.onCreatePanelMenu(featureId, menu);
        }
        
        @Override
        public View onCreatePanelView(final int featureId) {
            if (this.mActionBarCallback != null) {
                final View created = this.mActionBarCallback.onCreatePanelView(featureId);
                if (created != null) {
                    return created;
                }
            }
            return super.onCreatePanelView(featureId);
        }
        
        @Override
        public void onContentChanged() {
            if (this.mOnContentChangedBypassEnabled) {
                this.getWrapped().onContentChanged();
            }
        }
        
        @Override
        public boolean onPreparePanel(final int featureId, final View view, final Menu menu) {
            final MenuBuilder mb = (menu instanceof MenuBuilder) ? menu : null;
            if (featureId == 0 && mb == null) {
                return false;
            }
            if (mb != null) {
                mb.setOverrideVisibleItems(true);
            }
            boolean handled = false;
            if (this.mActionBarCallback != null && this.mActionBarCallback.onPreparePanel(featureId)) {
                handled = true;
            }
            if (!handled) {
                handled = super.onPreparePanel(featureId, view, menu);
            }
            if (mb != null) {
                mb.setOverrideVisibleItems(false);
            }
            return handled;
        }
        
        @Override
        public boolean onMenuOpened(final int featureId, final Menu menu) {
            super.onMenuOpened(featureId, menu);
            AppCompatDelegateImpl.this.onMenuOpened(featureId);
            return true;
        }
        
        @Override
        public void onPanelClosed(final int featureId, final Menu menu) {
            if (this.mOnPanelClosedBypassEnabled) {
                this.getWrapped().onPanelClosed(featureId, menu);
                return;
            }
            super.onPanelClosed(featureId, menu);
            AppCompatDelegateImpl.this.onPanelClosed(featureId);
        }
        
        @Override
        public android.view.ActionMode onWindowStartingActionMode(final android.view.ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.isHandleNativeActionModesEnabled()) {
                return this.startAsSupportActionMode(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }
        
        final android.view.ActionMode startAsSupportActionMode(final android.view.ActionMode.Callback callback) {
            final SupportActionModeWrapper.CallbackWrapper callbackWrapper = new SupportActionModeWrapper.CallbackWrapper(AppCompatDelegateImpl.this.mContext, callback);
            final ActionMode supportActionMode = AppCompatDelegateImpl.this.startSupportActionMode(callbackWrapper);
            if (supportActionMode != null) {
                return callbackWrapper.getActionModeWrapper(supportActionMode);
            }
            return null;
        }
        
        @RequiresApi(23)
        @Override
        public android.view.ActionMode onWindowStartingActionMode(final android.view.ActionMode.Callback callback, final int type) {
            if (AppCompatDelegateImpl.this.isHandleNativeActionModesEnabled()) {
                switch (type) {
                    case 0: {
                        return this.startAsSupportActionMode(callback);
                    }
                }
            }
            return super.onWindowStartingActionMode(callback, type);
        }
        
        @RequiresApi(24)
        @Override
        public void onProvideKeyboardShortcuts(final List<KeyboardShortcutGroup> data, final Menu menu, final int deviceId) {
            final PanelFeatureState panel = AppCompatDelegateImpl.this.getPanelState(0, true);
            if (panel != null && panel.menu != null) {
                super.onProvideKeyboardShortcuts(data, (Menu)panel.menu, deviceId);
            }
            else {
                super.onProvideKeyboardShortcuts(data, menu, deviceId);
            }
        }
        
        public void bypassOnContentChanged(final Window.Callback c) {
            try {
                this.mOnContentChangedBypassEnabled = true;
                c.onContentChanged();
            }
            finally {
                this.mOnContentChangedBypassEnabled = false;
            }
        }
        
        public boolean bypassDispatchKeyEvent(final Window.Callback c, final KeyEvent e) {
            try {
                this.mDispatchKeyEventBypassEnabled = true;
                return c.dispatchKeyEvent(e);
            }
            finally {
                this.mDispatchKeyEventBypassEnabled = false;
            }
        }
        
        public void bypassOnPanelClosed(final Window.Callback c, final int featureId, final Menu menu) {
            try {
                this.mOnPanelClosedBypassEnabled = true;
                c.onPanelClosed(featureId, menu);
            }
            finally {
                this.mOnPanelClosedBypassEnabled = false;
            }
        }
    }
    
    @VisibleForTesting
    @RestrictTo({ RestrictTo.Scope.LIBRARY })
    abstract class AutoNightModeManager
    {
        private BroadcastReceiver mReceiver;
        
        abstract int getApplyableNightMode();
        
        abstract void onChange();
        
        void setup() {
            this.cleanup();
            final IntentFilter filter = this.createIntentFilterForBroadcastReceiver();
            if (filter == null || filter.countActions() == 0) {
                return;
            }
            if (this.mReceiver == null) {
                this.mReceiver = new BroadcastReceiver() {
                    public void onReceive(final Context context, final Intent intent) {
                        AutoNightModeManager.this.onChange();
                    }
                };
            }
            AppCompatDelegateImpl.this.mContext.registerReceiver(this.mReceiver, filter);
        }
        
        @Nullable
        abstract IntentFilter createIntentFilterForBroadcastReceiver();
        
        void cleanup() {
            if (this.mReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.mContext.unregisterReceiver(this.mReceiver);
                }
                catch (final IllegalArgumentException ex) {}
                this.mReceiver = null;
            }
        }
        
        boolean isListening() {
            return this.mReceiver != null;
        }
    }
    
    private class AutoTimeNightModeManager extends AutoNightModeManager
    {
        private final TwilightManager mTwilightManager;
        
        AutoTimeNightModeManager(final TwilightManager twilightManager) {
            this.mTwilightManager = twilightManager;
        }
        
        public int getApplyableNightMode() {
            return this.mTwilightManager.isNight() ? 2 : 1;
        }
        
        public void onChange() {
            AppCompatDelegateImpl.this.applyDayNight();
        }
        
        @Override
        IntentFilter createIntentFilterForBroadcastReceiver() {
            final IntentFilter filter = new IntentFilter();
            filter.addAction("android.intent.action.TIME_SET");
            filter.addAction("android.intent.action.TIMEZONE_CHANGED");
            filter.addAction("android.intent.action.TIME_TICK");
            return filter;
        }
    }
    
    private class AutoBatteryNightModeManager extends AutoNightModeManager
    {
        private final PowerManager mPowerManager;
        
        AutoBatteryNightModeManager(final Context context) {
            this.mPowerManager = (PowerManager)context.getApplicationContext().getSystemService("power");
        }
        
        public int getApplyableNightMode() {
            if (Build.VERSION.SDK_INT >= 21) {
                return Api21Impl.isPowerSaveMode(this.mPowerManager) ? 2 : 1;
            }
            return 1;
        }
        
        public void onChange() {
            AppCompatDelegateImpl.this.applyDayNight();
        }
        
        @Override
        IntentFilter createIntentFilterForBroadcastReceiver() {
            if (Build.VERSION.SDK_INT >= 21) {
                final IntentFilter filter = new IntentFilter();
                filter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return filter;
            }
            return null;
        }
    }
    
    private class ActionBarDrawableToggleImpl implements ActionBarDrawerToggle.Delegate
    {
        ActionBarDrawableToggleImpl() {
        }
        
        @Override
        public Drawable getThemeUpIndicator() {
            final TintTypedArray a = TintTypedArray.obtainStyledAttributes(this.getActionBarThemedContext(), null, new int[] { R.attr.homeAsUpIndicator });
            final Drawable result = a.getDrawable(0);
            a.recycle();
            return result;
        }
        
        @Override
        public Context getActionBarThemedContext() {
            return AppCompatDelegateImpl.this.getActionBarThemedContext();
        }
        
        @Override
        public boolean isNavigationVisible() {
            final ActionBar ab = AppCompatDelegateImpl.this.getSupportActionBar();
            return ab != null && (ab.getDisplayOptions() & 0x4) != 0x0;
        }
        
        @Override
        public void setActionBarUpIndicator(final Drawable upDrawable, final int contentDescRes) {
            final ActionBar ab = AppCompatDelegateImpl.this.getSupportActionBar();
            if (ab != null) {
                ab.setHomeAsUpIndicator(upDrawable);
                ab.setHomeActionContentDescription(contentDescRes);
            }
        }
        
        @Override
        public void setActionBarDescription(final int contentDescRes) {
            final ActionBar ab = AppCompatDelegateImpl.this.getSupportActionBar();
            if (ab != null) {
                ab.setHomeActionContentDescription(contentDescRes);
            }
        }
    }
    
    @RequiresApi(21)
    static class Api21Impl
    {
        private Api21Impl() {
        }
        
        @DoNotInline
        static boolean isPowerSaveMode(final PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
        
        @DoNotInline
        static String toLanguageTag(final Locale locale) {
            return locale.toLanguageTag();
        }
    }
    
    @RequiresApi(24)
    static class Api24Impl
    {
        private Api24Impl() {
        }
        
        @DoNotInline
        static void generateConfigDelta_locale(@NonNull final Configuration base, @NonNull final Configuration change, @NonNull final Configuration delta) {
            final LocaleList baseLocales = base.getLocales();
            final LocaleList changeLocales = change.getLocales();
            if (!baseLocales.equals((Object)changeLocales)) {
                delta.setLocales(changeLocales);
                delta.locale = change.locale;
            }
        }
        
        @DoNotInline
        static LocaleListCompat getLocales(final Configuration configuration) {
            return LocaleListCompat.forLanguageTags(configuration.getLocales().toLanguageTags());
        }
        
        @DoNotInline
        static void setLocales(final Configuration configuration, final LocaleListCompat locales) {
            configuration.setLocales(LocaleList.forLanguageTags(locales.toLanguageTags()));
        }
        
        @DoNotInline
        public static void setDefaultLocales(final LocaleListCompat locales) {
            LocaleList.setDefault(LocaleList.forLanguageTags(locales.toLanguageTags()));
        }
    }
    
    @RequiresApi(26)
    static class Api26Impl
    {
        private Api26Impl() {
        }
        
        static void generateConfigDelta_colorMode(@NonNull final Configuration base, @NonNull final Configuration change, @NonNull final Configuration delta) {
            if ((base.colorMode & 0x3) != (change.colorMode & 0x3)) {
                delta.colorMode |= (change.colorMode & 0x3);
            }
            if ((base.colorMode & 0xC) != (change.colorMode & 0xC)) {
                delta.colorMode |= (change.colorMode & 0xC);
            }
        }
    }
    
    @RequiresApi(33)
    static class Api33Impl
    {
        private Api33Impl() {
        }
        
        @DoNotInline
        static OnBackInvokedCallback registerOnBackPressedCallback(final Object dispatcher, final AppCompatDelegateImpl delegate) {
            Objects.requireNonNull((Object)delegate);
            final OnBackInvokedCallback onBackInvokedCallback = delegate::onBackPressed;
            final OnBackInvokedDispatcher typedDispatcher = (OnBackInvokedDispatcher)dispatcher;
            typedDispatcher.registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }
        
        @DoNotInline
        static void unregisterOnBackInvokedCallback(final Object dispatcher, final Object callback) {
            final OnBackInvokedCallback onBackInvokedCallback = (OnBackInvokedCallback)callback;
            final OnBackInvokedDispatcher typedDispatcher = (OnBackInvokedDispatcher)dispatcher;
            typedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
        }
        
        @DoNotInline
        static OnBackInvokedDispatcher getOnBackInvokedDispatcher(final Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }
    
    interface ActionBarMenuCallback
    {
        boolean onPreparePanel(final int p0);
        
        @Nullable
        View onCreatePanelView(final int p0);
    }
}
