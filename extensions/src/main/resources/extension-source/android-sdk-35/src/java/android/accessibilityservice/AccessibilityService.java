package android.accessibilityservice;

import android.hardware.HardwareBuffer;
import android.graphics.ColorSpace;
import android.view.SurfaceControl;
import android.graphics.Region;
import android.os.IBinder;
import android.content.Intent;
import java.util.concurrent.Executor;
import android.os.Handler;
import android.os.Bundle;
import android.content.Context;
import android.view.Display;
import android.view.accessibility.AccessibilityNodeInfo;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityWindowInfo;
import java.util.List;
import android.view.MotionEvent;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import android.app.Service;

public abstract class AccessibilityService extends Service
{
    public static final int ERROR_TAKE_SCREENSHOT_INTERNAL_ERROR = 1;
    public static final int ERROR_TAKE_SCREENSHOT_INTERVAL_TIME_SHORT = 3;
    public static final int ERROR_TAKE_SCREENSHOT_INVALID_DISPLAY = 4;
    public static final int ERROR_TAKE_SCREENSHOT_INVALID_WINDOW = 5;
    public static final int ERROR_TAKE_SCREENSHOT_NO_ACCESSIBILITY_ACCESS = 2;
    public static final int ERROR_TAKE_SCREENSHOT_SECURE_WINDOW = 6;
    public static final int GESTURE_2_FINGER_DOUBLE_TAP = 20;
    public static final int GESTURE_2_FINGER_DOUBLE_TAP_AND_HOLD = 40;
    public static final int GESTURE_2_FINGER_SINGLE_TAP = 19;
    public static final int GESTURE_2_FINGER_SWIPE_DOWN = 26;
    public static final int GESTURE_2_FINGER_SWIPE_LEFT = 27;
    public static final int GESTURE_2_FINGER_SWIPE_RIGHT = 28;
    public static final int GESTURE_2_FINGER_SWIPE_UP = 25;
    public static final int GESTURE_2_FINGER_TRIPLE_TAP = 21;
    public static final int GESTURE_2_FINGER_TRIPLE_TAP_AND_HOLD = 43;
    public static final int GESTURE_3_FINGER_DOUBLE_TAP = 23;
    public static final int GESTURE_3_FINGER_DOUBLE_TAP_AND_HOLD = 41;
    public static final int GESTURE_3_FINGER_SINGLE_TAP = 22;
    public static final int GESTURE_3_FINGER_SINGLE_TAP_AND_HOLD = 44;
    public static final int GESTURE_3_FINGER_SWIPE_DOWN = 30;
    public static final int GESTURE_3_FINGER_SWIPE_LEFT = 31;
    public static final int GESTURE_3_FINGER_SWIPE_RIGHT = 32;
    public static final int GESTURE_3_FINGER_SWIPE_UP = 29;
    public static final int GESTURE_3_FINGER_TRIPLE_TAP = 24;
    public static final int GESTURE_3_FINGER_TRIPLE_TAP_AND_HOLD = 45;
    public static final int GESTURE_4_FINGER_DOUBLE_TAP = 38;
    public static final int GESTURE_4_FINGER_DOUBLE_TAP_AND_HOLD = 42;
    public static final int GESTURE_4_FINGER_SINGLE_TAP = 37;
    public static final int GESTURE_4_FINGER_SWIPE_DOWN = 34;
    public static final int GESTURE_4_FINGER_SWIPE_LEFT = 35;
    public static final int GESTURE_4_FINGER_SWIPE_RIGHT = 36;
    public static final int GESTURE_4_FINGER_SWIPE_UP = 33;
    public static final int GESTURE_4_FINGER_TRIPLE_TAP = 39;
    public static final int GESTURE_DOUBLE_TAP = 17;
    public static final int GESTURE_DOUBLE_TAP_AND_HOLD = 18;
    public static final int GESTURE_SWIPE_DOWN = 2;
    public static final int GESTURE_SWIPE_DOWN_AND_LEFT = 15;
    public static final int GESTURE_SWIPE_DOWN_AND_RIGHT = 16;
    public static final int GESTURE_SWIPE_DOWN_AND_UP = 8;
    public static final int GESTURE_SWIPE_LEFT = 3;
    public static final int GESTURE_SWIPE_LEFT_AND_DOWN = 10;
    public static final int GESTURE_SWIPE_LEFT_AND_RIGHT = 5;
    public static final int GESTURE_SWIPE_LEFT_AND_UP = 9;
    public static final int GESTURE_SWIPE_RIGHT = 4;
    public static final int GESTURE_SWIPE_RIGHT_AND_DOWN = 12;
    public static final int GESTURE_SWIPE_RIGHT_AND_LEFT = 6;
    public static final int GESTURE_SWIPE_RIGHT_AND_UP = 11;
    public static final int GESTURE_SWIPE_UP = 1;
    public static final int GESTURE_SWIPE_UP_AND_DOWN = 7;
    public static final int GESTURE_SWIPE_UP_AND_LEFT = 13;
    public static final int GESTURE_SWIPE_UP_AND_RIGHT = 14;
    public static final int GESTURE_UNKNOWN = 0;
    public static final int GLOBAL_ACTION_ACCESSIBILITY_ALL_APPS = 14;
    public static final int GLOBAL_ACTION_ACCESSIBILITY_BUTTON = 11;
    public static final int GLOBAL_ACTION_ACCESSIBILITY_BUTTON_CHOOSER = 12;
    public static final int GLOBAL_ACTION_ACCESSIBILITY_SHORTCUT = 13;
    public static final int GLOBAL_ACTION_BACK = 1;
    public static final int GLOBAL_ACTION_DISMISS_NOTIFICATION_SHADE = 15;
    public static final int GLOBAL_ACTION_DPAD_CENTER = 20;
    public static final int GLOBAL_ACTION_DPAD_DOWN = 17;
    public static final int GLOBAL_ACTION_DPAD_LEFT = 18;
    public static final int GLOBAL_ACTION_DPAD_RIGHT = 19;
    public static final int GLOBAL_ACTION_DPAD_UP = 16;
    public static final int GLOBAL_ACTION_HOME = 2;
    public static final int GLOBAL_ACTION_KEYCODE_HEADSETHOOK = 10;
    public static final int GLOBAL_ACTION_LOCK_SCREEN = 8;
    public static final int GLOBAL_ACTION_NOTIFICATIONS = 4;
    public static final int GLOBAL_ACTION_POWER_DIALOG = 6;
    public static final int GLOBAL_ACTION_QUICK_SETTINGS = 5;
    public static final int GLOBAL_ACTION_RECENTS = 3;
    public static final int GLOBAL_ACTION_TAKE_SCREENSHOT = 9;
    public static final int GLOBAL_ACTION_TOGGLE_SPLIT_SCREEN = 7;
    public static final String SERVICE_INTERFACE = "android.accessibilityservice.AccessibilityService";
    public static final String SERVICE_META_DATA = "android.accessibilityservice";
    public static final int SHOW_MODE_AUTO = 0;
    public static final int SHOW_MODE_HIDDEN = 1;
    public static final int SHOW_MODE_IGNORE_HARD_KEYBOARD = 2;
    
    public AccessibilityService() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onAccessibilityEvent(final AccessibilityEvent p0);
    
    public abstract void onInterrupt();
    
    protected void onServiceConnected() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected boolean onGesture(final int gestureId) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onGesture(@NonNull final AccessibilityGestureEvent gestureEvent) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean onKeyEvent(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void onMotionEvent(@NonNull final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public List<AccessibilityWindowInfo> getWindows() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final SparseArray<List<AccessibilityWindowInfo>> getWindowsOnAllDisplays() {
        throw new RuntimeException("Stub!");
    }
    
    public AccessibilityNodeInfo getRootInActiveWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AccessibilityNodeInfo getRootInActiveWindow(final int prefetchingStrategy) {
        throw new RuntimeException("Stub!");
    }
    
    public final void disableSelf() {
        throw new RuntimeException("Stub!");
    }
    
    @RecentlyNonNull
    @Override
    public Context createDisplayContext(final Display display) {
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
    public final MagnificationController getMagnificationController() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final FingerprintGestureController getFingerprintGestureController() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean dispatchGesture(@NonNull final GestureDescription gesture, @Nullable final GestureResultCallback callback, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final SoftKeyboardController getSoftKeyboardController() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public InputMethod onCreateInputMethod() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final InputMethod getInputMethod() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final AccessibilityButtonController getAccessibilityButtonController() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final AccessibilityButtonController getAccessibilityButtonController(final int displayId) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setCacheEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean clearCachedSubtree(@NonNull final AccessibilityNodeInfo node) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean clearCache() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNodeInCache(@NonNull final AccessibilityNodeInfo node) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCacheEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void onSystemActionsChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final List<AccessibilityNodeInfo.AccessibilityAction> getSystemActions() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean performGlobalAction(final int action) {
        throw new RuntimeException("Stub!");
    }
    
    public AccessibilityNodeInfo findFocus(final int focus) {
        throw new RuntimeException("Stub!");
    }
    
    public final AccessibilityServiceInfo getServiceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setServiceInfo(final AccessibilityServiceInfo info) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object getSystemService(@RecentlyNonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public void takeScreenshot(final int displayId, @NonNull final Executor executor, @NonNull final TakeScreenshotCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void takeScreenshotOfWindow(final int accessibilityWindowId, @NonNull final Executor executor, @NonNull final TakeScreenshotCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAccessibilityFocusAppearance(final int strokeWidth, final int color) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void setGestureDetectionPassthroughRegion(final int displayId, @NonNull final Region region) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTouchExplorationPassthroughRegion(final int displayId, @NonNull final Region region) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAnimationScale(final float scale) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final TouchInteractionController getTouchInteractionController(final int displayId) {
        throw new RuntimeException("Stub!");
    }
    
    public void attachAccessibilityOverlayToDisplay(final int displayId, @NonNull final SurfaceControl sc) {
        throw new RuntimeException("Stub!");
    }
    
    public void attachAccessibilityOverlayToWindow(final int accessibilityWindowId, @NonNull final SurfaceControl sc) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final BrailleDisplayController getBrailleDisplayController() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class GestureResultCallback
    {
        public GestureResultCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onCompleted(final GestureDescription gestureDescription) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCancelled(final GestureDescription gestureDescription) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class MagnificationController
    {
        MagnificationController() {
            throw new RuntimeException("Stub!");
        }
        
        public void addListener(@NonNull final OnMagnificationChangedListener listener) {
            throw new RuntimeException("Stub!");
        }
        
        public void addListener(@NonNull final OnMagnificationChangedListener listener, @Nullable final Handler handler) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean removeListener(@NonNull final OnMagnificationChangedListener listener) {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public MagnificationConfig getMagnificationConfig() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public float getScale() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public float getCenterX() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public float getCenterY() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Region getMagnificationRegion() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Region getCurrentMagnificationRegion() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean reset(final boolean animate) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean resetCurrentMagnification(final boolean animate) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean setMagnificationConfig(@NonNull final MagnificationConfig config, final boolean animate) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public boolean setScale(final float scale, final boolean animate) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public boolean setCenter(final float centerX, final float centerY, final boolean animate) {
            throw new RuntimeException("Stub!");
        }
        
        public interface OnMagnificationChangedListener
        {
            @Deprecated
            void onMagnificationChanged(@NonNull final MagnificationController p0, @NonNull final Region p1, final float p2, final float p3, final float p4);
            
            default void onMagnificationChanged(@NonNull final MagnificationController controller, @NonNull final Region region, @NonNull final MagnificationConfig config) {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class ScreenshotResult
    {
        ScreenshotResult() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ColorSpace getColorSpace() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public HardwareBuffer getHardwareBuffer() {
            throw new RuntimeException("Stub!");
        }
        
        public long getTimestamp() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class SoftKeyboardController
    {
        public static final int ENABLE_IME_FAIL_BY_ADMIN = 1;
        public static final int ENABLE_IME_FAIL_UNKNOWN = 2;
        public static final int ENABLE_IME_SUCCESS = 0;
        
        SoftKeyboardController() {
            throw new RuntimeException("Stub!");
        }
        
        public void addOnShowModeChangedListener(@NonNull final OnShowModeChangedListener listener) {
            throw new RuntimeException("Stub!");
        }
        
        public void addOnShowModeChangedListener(@NonNull final OnShowModeChangedListener listener, @Nullable final Handler handler) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean removeOnShowModeChangedListener(@NonNull final OnShowModeChangedListener listener) {
            throw new RuntimeException("Stub!");
        }
        
        public int getShowMode() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean setShowMode(final int showMode) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean switchToInputMethod(@NonNull final String imeId) {
            throw new RuntimeException("Stub!");
        }
        
        public int setInputMethodEnabled(@NonNull final String imeId, final boolean enabled) throws SecurityException {
            throw new RuntimeException("Stub!");
        }
        
        public interface OnShowModeChangedListener
        {
            void onShowModeChanged(@NonNull final SoftKeyboardController p0, final int p1);
        }
    }
    
    public interface TakeScreenshotCallback
    {
        void onSuccess(@NonNull final ScreenshotResult p0);
        
        void onFailure(final int p0);
    }
}
