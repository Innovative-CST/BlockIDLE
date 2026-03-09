package android.view;

import android.view.accessibility.AccessibilityEvent;
import android.window.OnBackInvokedDispatcher;
import android.graphics.Rect;
import java.util.List;
import android.transition.Transition;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.media.session.MediaController;
import android.os.Bundle;
import android.net.Uri;
import android.graphics.drawable.Drawable;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.IBinder;
import android.content.res.TypedArray;
import android.content.Context;

public abstract class Window
{
    public static final int DECOR_CAPTION_SHADE_AUTO = 0;
    public static final int DECOR_CAPTION_SHADE_DARK = 2;
    public static final int DECOR_CAPTION_SHADE_LIGHT = 1;
    @Deprecated
    protected static final int DEFAULT_FEATURES = 65;
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    public static final int FEATURE_ACTIVITY_TRANSITIONS = 13;
    public static final int FEATURE_CONTENT_TRANSITIONS = 12;
    public static final int FEATURE_CONTEXT_MENU = 6;
    public static final int FEATURE_CUSTOM_TITLE = 7;
    @Deprecated
    public static final int FEATURE_INDETERMINATE_PROGRESS = 5;
    public static final int FEATURE_LEFT_ICON = 3;
    public static final int FEATURE_NO_TITLE = 1;
    public static final int FEATURE_OPTIONS_PANEL = 0;
    @Deprecated
    public static final int FEATURE_PROGRESS = 2;
    public static final int FEATURE_RIGHT_ICON = 4;
    @Deprecated
    public static final int FEATURE_SWIPE_TO_DISMISS = 11;
    public static final int ID_ANDROID_CONTENT = 16908290;
    public static final String NAVIGATION_BAR_BACKGROUND_TRANSITION_NAME = "android:navigation:background";
    @Deprecated
    public static final int PROGRESS_END = 10000;
    @Deprecated
    public static final int PROGRESS_INDETERMINATE_OFF = -4;
    @Deprecated
    public static final int PROGRESS_INDETERMINATE_ON = -3;
    @Deprecated
    public static final int PROGRESS_SECONDARY_END = 30000;
    @Deprecated
    public static final int PROGRESS_SECONDARY_START = 20000;
    @Deprecated
    public static final int PROGRESS_START = 0;
    @Deprecated
    public static final int PROGRESS_VISIBILITY_OFF = -2;
    @Deprecated
    public static final int PROGRESS_VISIBILITY_ON = -1;
    public static final String STATUS_BAR_BACKGROUND_TRANSITION_NAME = "android:status:background";
    
    public Window(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public final Context getContext() {
        throw new RuntimeException("Stub!");
    }
    
    public final TypedArray getWindowStyle() {
        throw new RuntimeException("Stub!");
    }
    
    public void setContainer(final Window container) {
        throw new RuntimeException("Stub!");
    }
    
    public final Window getContainer() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean hasChildren() {
        throw new RuntimeException("Stub!");
    }
    
    public void setWindowManager(final WindowManager wm, final IBinder appToken, final String appName) {
        throw new RuntimeException("Stub!");
    }
    
    public void setWindowManager(final WindowManager wm, final IBinder appToken, final String appName, final boolean hardwareAccelerated) {
        throw new RuntimeException("Stub!");
    }
    
    public WindowManager getWindowManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCallback(final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public final Callback getCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public final void addOnFrameMetricsAvailableListener(@NonNull final OnFrameMetricsAvailableListener listener, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public final void removeOnFrameMetricsAvailableListener(final OnFrameMetricsAvailableListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setRestrictedCaptionAreaListener(final OnRestrictedCaptionAreaChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setHideOverlayWindows(final boolean hide) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void takeSurface(final SurfaceHolder.Callback2 p0);
    
    public abstract void takeInputQueue(final InputQueue.Callback p0);
    
    public abstract boolean isFloating();
    
    public void setLayout(final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public void setGravity(final int gravity) {
        throw new RuntimeException("Stub!");
    }
    
    public void setType(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFormat(final int format) {
        throw new RuntimeException("Stub!");
    }
    
    public void setWindowAnimations(final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSoftInputMode(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public void addFlags(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearFlags(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFlags(final int flags, final int mask) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColorMode(final int colorMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDesiredHdrHeadroom(final float desiredHeadroom) {
        throw new RuntimeException("Stub!");
    }
    
    public float getDesiredHdrHeadroom() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFrameRateBoostOnTouchEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getFrameRateBoostOnTouchEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFrameRatePowerSavingsBalanced(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFrameRatePowerSavingsBalanced() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPreferMinimalPostProcessing(final boolean isPreferred) {
        throw new RuntimeException("Stub!");
    }
    
    public int getColorMode() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWideColorGamut() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDimAmount(final float amount) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDecorFitsSystemWindows(final boolean decorFitsSystemWindows) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAttributes(final WindowManager.LayoutParams a) {
        throw new RuntimeException("Stub!");
    }
    
    public final WindowManager.LayoutParams getAttributes() {
        throw new RuntimeException("Stub!");
    }
    
    protected final int getForcedWindowFlags() {
        throw new RuntimeException("Stub!");
    }
    
    protected final boolean hasSoftInputMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSustainedPerformanceMode(final boolean enable) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean requestFeature(final int featureId) {
        throw new RuntimeException("Stub!");
    }
    
    public final void makeActive() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isActive() {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends View> T findViewById(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final <T extends View> T requireViewById(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setContentView(final int p0);
    
    public abstract void setContentView(final View p0);
    
    public abstract void setContentView(final View p0, final ViewGroup.LayoutParams p1);
    
    public abstract void addContentView(final View p0, final ViewGroup.LayoutParams p1);
    
    @Nullable
    public abstract View getCurrentFocus();
    
    @NonNull
    public abstract LayoutInflater getLayoutInflater();
    
    public abstract void setTitle(final CharSequence p0);
    
    @Deprecated
    public abstract void setTitleColor(final int p0);
    
    public abstract void openPanel(final int p0, final KeyEvent p1);
    
    public abstract void closePanel(final int p0);
    
    public abstract void togglePanel(final int p0, final KeyEvent p1);
    
    public abstract void invalidatePanelMenu(final int p0);
    
    public abstract boolean performPanelShortcut(final int p0, final int p1, final KeyEvent p2, final int p3);
    
    public abstract boolean performPanelIdentifierAction(final int p0, final int p1, final int p2);
    
    public abstract void closeAllPanels();
    
    public abstract boolean performContextMenuIdentifierAction(final int p0, final int p1);
    
    public abstract void onConfigurationChanged(final Configuration p0);
    
    public void setElevation(final float elevation) {
        throw new RuntimeException("Stub!");
    }
    
    public void setClipToOutline(final boolean clipToOutline) {
        throw new RuntimeException("Stub!");
    }
    
    public void setBackgroundDrawableResource(final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setBackgroundDrawable(final Drawable p0);
    
    public void setBackgroundBlurRadius(final int blurRadius) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setFeatureDrawableResource(final int p0, final int p1);
    
    public abstract void setFeatureDrawableUri(final int p0, final Uri p1);
    
    public abstract void setFeatureDrawable(final int p0, final Drawable p1);
    
    public abstract void setFeatureDrawableAlpha(final int p0, final int p1);
    
    public abstract void setFeatureInt(final int p0, final int p1);
    
    public abstract void takeKeyEvents(final boolean p0);
    
    public abstract boolean superDispatchKeyEvent(final KeyEvent p0);
    
    public abstract boolean superDispatchKeyShortcutEvent(final KeyEvent p0);
    
    public abstract boolean superDispatchTouchEvent(final MotionEvent p0);
    
    public abstract boolean superDispatchTrackballEvent(final MotionEvent p0);
    
    public abstract boolean superDispatchGenericMotionEvent(final MotionEvent p0);
    
    @NonNull
    public abstract View getDecorView();
    
    public abstract View peekDecorView();
    
    public abstract Bundle saveHierarchyState();
    
    public abstract void restoreHierarchyState(final Bundle p0);
    
    protected abstract void onActive();
    
    protected final int getFeatures() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getDefaultFeatures(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasFeature(final int feature) {
        throw new RuntimeException("Stub!");
    }
    
    protected final int getLocalFeatures() {
        throw new RuntimeException("Stub!");
    }
    
    protected void setDefaultWindowFormat(final int format) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setChildDrawable(final int p0, final Drawable p1);
    
    public abstract void setChildInt(final int p0, final int p1);
    
    public abstract boolean isShortcutKey(final int p0, final KeyEvent p1);
    
    public abstract void setVolumeControlStream(final int p0);
    
    public abstract int getVolumeControlStream();
    
    public void setMediaController(final MediaController controller) {
        throw new RuntimeException("Stub!");
    }
    
    public MediaController getMediaController() {
        throw new RuntimeException("Stub!");
    }
    
    public void setUiOptions(final int uiOptions) {
        throw new RuntimeException("Stub!");
    }
    
    public void setUiOptions(final int uiOptions, final int mask) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIcon(final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLogo(final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLocalFocus(final boolean hasFocus, final boolean inTouchMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void injectInputEvent(final InputEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public TransitionManager getTransitionManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTransitionManager(final TransitionManager tm) {
        throw new RuntimeException("Stub!");
    }
    
    public Scene getContentScene() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEnterTransition(final Transition transition) {
        throw new RuntimeException("Stub!");
    }
    
    public void setReturnTransition(final Transition transition) {
        throw new RuntimeException("Stub!");
    }
    
    public void setExitTransition(final Transition transition) {
        throw new RuntimeException("Stub!");
    }
    
    public void setReenterTransition(final Transition transition) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition getEnterTransition() {
        throw new RuntimeException("Stub!");
    }
    
    public Transition getReturnTransition() {
        throw new RuntimeException("Stub!");
    }
    
    public Transition getExitTransition() {
        throw new RuntimeException("Stub!");
    }
    
    public Transition getReenterTransition() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSharedElementEnterTransition(final Transition transition) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSharedElementReturnTransition(final Transition transition) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition getSharedElementEnterTransition() {
        throw new RuntimeException("Stub!");
    }
    
    public Transition getSharedElementReturnTransition() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSharedElementExitTransition(final Transition transition) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSharedElementReenterTransition(final Transition transition) {
        throw new RuntimeException("Stub!");
    }
    
    public Transition getSharedElementExitTransition() {
        throw new RuntimeException("Stub!");
    }
    
    public Transition getSharedElementReenterTransition() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAllowEnterTransitionOverlap(final boolean allow) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getAllowEnterTransitionOverlap() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAllowReturnTransitionOverlap(final boolean allow) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getAllowReturnTransitionOverlap() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTransitionBackgroundFadeDuration() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTransitionBackgroundFadeDuration(final long fadeDurationMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getSharedElementsUseOverlay() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSharedElementsUseOverlay(final boolean sharedElementsUseOverlay) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract int getStatusBarColor();
    
    @Deprecated
    public abstract void setStatusBarColor(final int p0);
    
    @Deprecated
    public abstract int getNavigationBarColor();
    
    @Deprecated
    public abstract void setNavigationBarColor(final int p0);
    
    @Deprecated
    public void setNavigationBarDividerColor(final int dividerColor) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getNavigationBarDividerColor() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setStatusBarContrastEnforced(final boolean ensureContrast) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isStatusBarContrastEnforced() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNavigationBarContrastEnforced(final boolean enforceContrast) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNavigationBarContrastEnforced() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSystemGestureExclusionRects(@NonNull final List<Rect> rects) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Rect> getSystemGestureExclusionRects() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerScrollCaptureCallback(@NonNull final ScrollCaptureCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterScrollCaptureCallback(@NonNull final ScrollCaptureCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setDecorCaptionShade(final int p0);
    
    public abstract void setResizingCaptionDrawable(final Drawable p0);
    
    @Nullable
    public WindowInsetsController getInsetsController() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AttachedSurfaceControl getRootSurfaceControl() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public OnBackInvokedDispatcher getOnBackInvokedDispatcher() {
        throw new RuntimeException("Stub!");
    }
    
    public interface Callback
    {
        boolean dispatchKeyEvent(final KeyEvent p0);
        
        boolean dispatchKeyShortcutEvent(final KeyEvent p0);
        
        boolean dispatchTouchEvent(final MotionEvent p0);
        
        boolean dispatchTrackballEvent(final MotionEvent p0);
        
        boolean dispatchGenericMotionEvent(final MotionEvent p0);
        
        boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent p0);
        
        @Nullable
        View onCreatePanelView(final int p0);
        
        boolean onCreatePanelMenu(final int p0, @NonNull final Menu p1);
        
        boolean onPreparePanel(final int p0, @Nullable final View p1, @NonNull final Menu p2);
        
        boolean onMenuOpened(final int p0, @NonNull final Menu p1);
        
        boolean onMenuItemSelected(final int p0, @NonNull final MenuItem p1);
        
        void onWindowAttributesChanged(final WindowManager.LayoutParams p0);
        
        void onContentChanged();
        
        void onWindowFocusChanged(final boolean p0);
        
        void onAttachedToWindow();
        
        void onDetachedFromWindow();
        
        void onPanelClosed(final int p0, @NonNull final Menu p1);
        
        boolean onSearchRequested();
        
        boolean onSearchRequested(final SearchEvent p0);
        
        @Nullable
        ActionMode onWindowStartingActionMode(final ActionMode.Callback p0);
        
        @Nullable
        ActionMode onWindowStartingActionMode(final ActionMode.Callback p0, final int p1);
        
        void onActionModeStarted(final ActionMode p0);
        
        void onActionModeFinished(final ActionMode p0);
        
        default void onProvideKeyboardShortcuts(final List<KeyboardShortcutGroup> data, @Nullable final Menu menu, final int deviceId) {
            throw new RuntimeException("Stub!");
        }
        
        default void onPointerCaptureChanged(final boolean hasCapture) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnRestrictedCaptionAreaChangedListener
    {
        void onRestrictedCaptionAreaChanged(final Rect p0);
    }
    
    public interface OnFrameMetricsAvailableListener
    {
        void onFrameMetricsAvailable(final Window p0, final FrameMetrics p1, final int p2);
    }
}
