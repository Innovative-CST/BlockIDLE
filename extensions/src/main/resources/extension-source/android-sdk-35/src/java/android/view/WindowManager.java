package android.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Looper;
import android.window.InputTransferToken;
import android.window.TrustedPresentationThresholds;
import android.os.IBinder;
import java.util.function.IntConsumer;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public interface WindowManager extends ViewManager
{
    public static final int COMPAT_SMALL_COVER_SCREEN_OPT_IN = 1;
    public static final String PROPERTY_ACTIVITY_EMBEDDING_ALLOW_SYSTEM_OVERRIDE = "android.window.PROPERTY_ACTIVITY_EMBEDDING_ALLOW_SYSTEM_OVERRIDE";
    public static final String PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED = "android.window.PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED";
    public static final String PROPERTY_CAMERA_COMPAT_ALLOW_FORCE_ROTATION = "android.window.PROPERTY_CAMERA_COMPAT_ALLOW_FORCE_ROTATION";
    public static final String PROPERTY_CAMERA_COMPAT_ALLOW_REFRESH = "android.window.PROPERTY_CAMERA_COMPAT_ALLOW_REFRESH";
    public static final String PROPERTY_CAMERA_COMPAT_ENABLE_REFRESH_VIA_PAUSE = "android.window.PROPERTY_CAMERA_COMPAT_ENABLE_REFRESH_VIA_PAUSE";
    public static final String PROPERTY_COMPAT_ALLOW_DISPLAY_ORIENTATION_OVERRIDE = "android.window.PROPERTY_COMPAT_ALLOW_DISPLAY_ORIENTATION_OVERRIDE";
    public static final String PROPERTY_COMPAT_ALLOW_IGNORING_ORIENTATION_REQUEST_WHEN_LOOP_DETECTED = "android.window.PROPERTY_COMPAT_ALLOW_IGNORING_ORIENTATION_REQUEST_WHEN_LOOP_DETECTED";
    public static final String PROPERTY_COMPAT_ALLOW_MIN_ASPECT_RATIO_OVERRIDE = "android.window.PROPERTY_COMPAT_ALLOW_MIN_ASPECT_RATIO_OVERRIDE";
    public static final String PROPERTY_COMPAT_ALLOW_ORIENTATION_OVERRIDE = "android.window.PROPERTY_COMPAT_ALLOW_ORIENTATION_OVERRIDE";
    public static final String PROPERTY_COMPAT_ALLOW_RESIZEABLE_ACTIVITY_OVERRIDES = "android.window.PROPERTY_COMPAT_ALLOW_RESIZEABLE_ACTIVITY_OVERRIDES";
    public static final String PROPERTY_COMPAT_ALLOW_SANDBOXING_VIEW_BOUNDS_APIS = "android.window.PROPERTY_COMPAT_ALLOW_SANDBOXING_VIEW_BOUNDS_APIS";
    public static final String PROPERTY_COMPAT_ALLOW_SMALL_COVER_SCREEN = "android.window.PROPERTY_COMPAT_ALLOW_SMALL_COVER_SCREEN";
    public static final String PROPERTY_COMPAT_ALLOW_USER_ASPECT_RATIO_FULLSCREEN_OVERRIDE = "android.window.PROPERTY_COMPAT_ALLOW_USER_ASPECT_RATIO_FULLSCREEN_OVERRIDE";
    public static final String PROPERTY_COMPAT_ALLOW_USER_ASPECT_RATIO_OVERRIDE = "android.window.PROPERTY_COMPAT_ALLOW_USER_ASPECT_RATIO_OVERRIDE";
    public static final String PROPERTY_COMPAT_ENABLE_FAKE_FOCUS = "android.window.PROPERTY_COMPAT_ENABLE_FAKE_FOCUS";
    public static final String PROPERTY_COMPAT_IGNORE_REQUESTED_ORIENTATION = "android.window.PROPERTY_COMPAT_IGNORE_REQUESTED_ORIENTATION";
    public static final String PROPERTY_SUPPORTS_MULTI_INSTANCE_SYSTEM_UI = "android.window.PROPERTY_SUPPORTS_MULTI_INSTANCE_SYSTEM_UI";
    public static final int SCREEN_RECORDING_STATE_NOT_VISIBLE = 0;
    public static final int SCREEN_RECORDING_STATE_VISIBLE = 1;
    
    @Deprecated
    Display getDefaultDisplay();
    
    void removeViewImmediate(final View p0);
    
    @NonNull
    default WindowMetrics getCurrentWindowMetrics() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    default WindowMetrics getMaximumWindowMetrics() {
        throw new RuntimeException("Stub!");
    }
    
    default boolean isCrossWindowBlurEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    default void addCrossWindowBlurEnabledListener(@NonNull final Consumer<Boolean> listener) {
        throw new RuntimeException("Stub!");
    }
    
    default void addCrossWindowBlurEnabledListener(@NonNull final Executor executor, @NonNull final Consumer<Boolean> listener) {
        throw new RuntimeException("Stub!");
    }
    
    default void removeCrossWindowBlurEnabledListener(@NonNull final Consumer<Boolean> listener) {
        throw new RuntimeException("Stub!");
    }
    
    default void addProposedRotationListener(@NonNull final Executor executor, @NonNull final IntConsumer listener) {
        throw new RuntimeException("Stub!");
    }
    
    default void removeProposedRotationListener(@NonNull final IntConsumer listener) {
        throw new RuntimeException("Stub!");
    }
    
    default void registerTrustedPresentationListener(@NonNull final IBinder window, @NonNull final TrustedPresentationThresholds thresholds, @NonNull final Executor executor, @NonNull final Consumer<Boolean> listener) {
        throw new RuntimeException("Stub!");
    }
    
    default void unregisterTrustedPresentationListener(@NonNull final Consumer<Boolean> listener) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    default InputTransferToken registerBatchedSurfaceControlInputReceiver(@NonNull final InputTransferToken hostInputTransferToken, @NonNull final SurfaceControl surfaceControl, @NonNull final Choreographer choreographer, @NonNull final SurfaceControlInputReceiver receiver) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    default InputTransferToken registerUnbatchedSurfaceControlInputReceiver(@NonNull final InputTransferToken hostInputTransferToken, @NonNull final SurfaceControl surfaceControl, @NonNull final Looper looper, @NonNull final SurfaceControlInputReceiver receiver) {
        throw new RuntimeException("Stub!");
    }
    
    default void unregisterSurfaceControlInputReceiver(@NonNull final SurfaceControl surfaceControl) {
        throw new RuntimeException("Stub!");
    }
    
    default boolean transferTouchGesture(@NonNull final InputTransferToken transferFromToken, @NonNull final InputTransferToken transferToToken) {
        throw new RuntimeException("Stub!");
    }
    
    default int addScreenRecordingCallback(@NonNull final Executor executor, @NonNull final Consumer<Integer> callback) {
        throw new RuntimeException("Stub!");
    }
    
    default void removeScreenRecordingCallback(@NonNull final Consumer<Integer> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public static class BadTokenException extends RuntimeException
    {
        public BadTokenException() {
            throw new RuntimeException("Stub!");
        }
        
        public BadTokenException(final String name) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class InvalidDisplayException extends RuntimeException
    {
        public InvalidDisplayException() {
            throw new RuntimeException("Stub!");
        }
        
        public InvalidDisplayException(final String name) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class LayoutParams extends ViewGroup.LayoutParams implements Parcelable
    {
        public static final int ALPHA_CHANGED = 128;
        public static final int ANIMATION_CHANGED = 16;
        public static final float BRIGHTNESS_OVERRIDE_FULL = 1.0f;
        public static final float BRIGHTNESS_OVERRIDE_NONE = -1.0f;
        public static final float BRIGHTNESS_OVERRIDE_OFF = 0.0f;
        @NonNull
        public static final Creator<LayoutParams> CREATOR;
        public static final int DIM_AMOUNT_CHANGED = 32;
        public static final int DISPLAY_FLAG_DISABLE_HDR_CONVERSION = 1;
        public static final int FIRST_APPLICATION_WINDOW = 1;
        public static final int FIRST_SUB_WINDOW = 1000;
        public static final int FIRST_SYSTEM_WINDOW = 2000;
        public static final int FLAGS_CHANGED = 4;
        public static final int FLAG_ALLOW_LOCK_WHILE_SCREEN_ON = 1;
        public static final int FLAG_ALT_FOCUSABLE_IM = 131072;
        public static final int FLAG_BLUR_BEHIND = 4;
        public static final int FLAG_DIM_BEHIND = 2;
        @Deprecated
        public static final int FLAG_DISMISS_KEYGUARD = 4194304;
        @Deprecated
        public static final int FLAG_DITHER = 4096;
        public static final int FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS = Integer.MIN_VALUE;
        @Deprecated
        public static final int FLAG_FORCE_NOT_FULLSCREEN = 2048;
        @Deprecated
        public static final int FLAG_FULLSCREEN = 1024;
        public static final int FLAG_HARDWARE_ACCELERATED = 16777216;
        public static final int FLAG_IGNORE_CHEEK_PRESSES = 32768;
        public static final int FLAG_KEEP_SCREEN_ON = 128;
        @Deprecated
        public static final int FLAG_LAYOUT_ATTACHED_IN_DECOR = 1073741824;
        @Deprecated
        public static final int FLAG_LAYOUT_INSET_DECOR = 65536;
        @Deprecated
        public static final int FLAG_LAYOUT_IN_OVERSCAN = 33554432;
        public static final int FLAG_LAYOUT_IN_SCREEN = 256;
        public static final int FLAG_LAYOUT_NO_LIMITS = 512;
        public static final int FLAG_LOCAL_FOCUS_MODE = 268435456;
        public static final int FLAG_NOT_FOCUSABLE = 8;
        public static final int FLAG_NOT_TOUCHABLE = 16;
        public static final int FLAG_NOT_TOUCH_MODAL = 32;
        public static final int FLAG_SCALED = 16384;
        public static final int FLAG_SECURE = 8192;
        public static final int FLAG_SHOW_WALLPAPER = 1048576;
        @Deprecated
        public static final int FLAG_SHOW_WHEN_LOCKED = 524288;
        public static final int FLAG_SPLIT_TOUCH = 8388608;
        @Deprecated
        public static final int FLAG_TOUCHABLE_WHEN_WAKING = 64;
        @Deprecated
        public static final int FLAG_TRANSLUCENT_NAVIGATION = 134217728;
        @Deprecated
        public static final int FLAG_TRANSLUCENT_STATUS = 67108864;
        @Deprecated
        public static final int FLAG_TURN_SCREEN_ON = 2097152;
        public static final int FLAG_WATCH_OUTSIDE_TOUCH = 262144;
        public static final int FORMAT_CHANGED = 8;
        public static final int LAST_APPLICATION_WINDOW = 99;
        public static final int LAST_SUB_WINDOW = 1999;
        public static final int LAST_SYSTEM_WINDOW = 2999;
        public static final int LAYOUT_CHANGED = 1;
        public static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_ALWAYS = 3;
        public static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_DEFAULT = 0;
        public static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_NEVER = 2;
        public static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES = 1;
        public static final int MEMORY_TYPE_CHANGED = 256;
        @Deprecated
        public static final int MEMORY_TYPE_GPU = 2;
        @Deprecated
        public static final int MEMORY_TYPE_HARDWARE = 1;
        @Deprecated
        public static final int MEMORY_TYPE_NORMAL = 0;
        @Deprecated
        public static final int MEMORY_TYPE_PUSH_BUFFERS = 3;
        public static final int ROTATION_ANIMATION_CHANGED = 4096;
        public static final int ROTATION_ANIMATION_CROSSFADE = 1;
        public static final int ROTATION_ANIMATION_JUMPCUT = 2;
        public static final int ROTATION_ANIMATION_ROTATE = 0;
        public static final int ROTATION_ANIMATION_SEAMLESS = 3;
        public static final int SCREEN_BRIGHTNESS_CHANGED = 2048;
        public static final int SCREEN_ORIENTATION_CHANGED = 1024;
        public static final int SOFT_INPUT_ADJUST_NOTHING = 48;
        public static final int SOFT_INPUT_ADJUST_PAN = 32;
        @Deprecated
        public static final int SOFT_INPUT_ADJUST_RESIZE = 16;
        public static final int SOFT_INPUT_ADJUST_UNSPECIFIED = 0;
        public static final int SOFT_INPUT_IS_FORWARD_NAVIGATION = 256;
        public static final int SOFT_INPUT_MASK_ADJUST = 240;
        public static final int SOFT_INPUT_MASK_STATE = 15;
        public static final int SOFT_INPUT_MODE_CHANGED = 512;
        public static final int SOFT_INPUT_STATE_ALWAYS_HIDDEN = 3;
        public static final int SOFT_INPUT_STATE_ALWAYS_VISIBLE = 5;
        public static final int SOFT_INPUT_STATE_HIDDEN = 2;
        public static final int SOFT_INPUT_STATE_UNCHANGED = 1;
        public static final int SOFT_INPUT_STATE_UNSPECIFIED = 0;
        public static final int SOFT_INPUT_STATE_VISIBLE = 4;
        public static final int TITLE_CHANGED = 64;
        public static final int TYPE_ACCESSIBILITY_OVERLAY = 2032;
        public static final int TYPE_APPLICATION = 2;
        public static final int TYPE_APPLICATION_ATTACHED_DIALOG = 1003;
        public static final int TYPE_APPLICATION_MEDIA = 1001;
        public static final int TYPE_APPLICATION_OVERLAY = 2038;
        public static final int TYPE_APPLICATION_PANEL = 1000;
        public static final int TYPE_APPLICATION_STARTING = 3;
        public static final int TYPE_APPLICATION_SUB_PANEL = 1002;
        public static final int TYPE_BASE_APPLICATION = 1;
        public static final int TYPE_CHANGED = 2;
        public static final int TYPE_DRAWN_APPLICATION = 4;
        public static final int TYPE_INPUT_METHOD = 2011;
        public static final int TYPE_INPUT_METHOD_DIALOG = 2012;
        public static final int TYPE_KEYGUARD_DIALOG = 2009;
        @Deprecated
        public static final int TYPE_PHONE = 2002;
        @Deprecated
        public static final int TYPE_PRIORITY_PHONE = 2007;
        public static final int TYPE_PRIVATE_PRESENTATION = 2030;
        public static final int TYPE_SEARCH_BAR = 2001;
        public static final int TYPE_STATUS_BAR = 2000;
        @Deprecated
        public static final int TYPE_SYSTEM_ALERT = 2003;
        public static final int TYPE_SYSTEM_DIALOG = 2008;
        @Deprecated
        public static final int TYPE_SYSTEM_ERROR = 2010;
        @Deprecated
        public static final int TYPE_SYSTEM_OVERLAY = 2006;
        @Deprecated
        public static final int TYPE_TOAST = 2005;
        public static final int TYPE_WALLPAPER = 2013;
        public float alpha;
        public float buttonBrightness;
        public float dimAmount;
        @ViewDebug.ExportedProperty(flagMapping = { @ViewDebug.FlagToString(mask = 1, equals = 1, name = "ALLOW_LOCK_WHILE_SCREEN_ON"), @ViewDebug.FlagToString(mask = 2, equals = 2, name = "DIM_BEHIND"), @ViewDebug.FlagToString(mask = 4, equals = 4, name = "BLUR_BEHIND"), @ViewDebug.FlagToString(mask = 8, equals = 8, name = "NOT_FOCUSABLE"), @ViewDebug.FlagToString(mask = 16, equals = 16, name = "NOT_TOUCHABLE"), @ViewDebug.FlagToString(mask = 32, equals = 32, name = "NOT_TOUCH_MODAL"), @ViewDebug.FlagToString(mask = 64, equals = 64, name = "TOUCHABLE_WHEN_WAKING"), @ViewDebug.FlagToString(mask = 128, equals = 128, name = "KEEP_SCREEN_ON"), @ViewDebug.FlagToString(mask = 256, equals = 256, name = "LAYOUT_IN_SCREEN"), @ViewDebug.FlagToString(mask = 512, equals = 512, name = "LAYOUT_NO_LIMITS"), @ViewDebug.FlagToString(mask = 1024, equals = 1024, name = "FULLSCREEN"), @ViewDebug.FlagToString(mask = 2048, equals = 2048, name = "FORCE_NOT_FULLSCREEN"), @ViewDebug.FlagToString(mask = 4096, equals = 4096, name = "DITHER"), @ViewDebug.FlagToString(mask = 8192, equals = 8192, name = "SECURE"), @ViewDebug.FlagToString(mask = 16384, equals = 16384, name = "SCALED"), @ViewDebug.FlagToString(mask = 32768, equals = 32768, name = "IGNORE_CHEEK_PRESSES"), @ViewDebug.FlagToString(mask = 65536, equals = 65536, name = "LAYOUT_INSET_DECOR"), @ViewDebug.FlagToString(mask = 131072, equals = 131072, name = "ALT_FOCUSABLE_IM"), @ViewDebug.FlagToString(mask = 262144, equals = 262144, name = "WATCH_OUTSIDE_TOUCH"), @ViewDebug.FlagToString(mask = 524288, equals = 524288, name = "SHOW_WHEN_LOCKED"), @ViewDebug.FlagToString(mask = 1048576, equals = 1048576, name = "SHOW_WALLPAPER"), @ViewDebug.FlagToString(mask = 2097152, equals = 2097152, name = "TURN_SCREEN_ON"), @ViewDebug.FlagToString(mask = 4194304, equals = 4194304, name = "DISMISS_KEYGUARD"), @ViewDebug.FlagToString(mask = 8388608, equals = 8388608, name = "SPLIT_TOUCH"), @ViewDebug.FlagToString(mask = 16777216, equals = 16777216, name = "HARDWARE_ACCELERATED"), @ViewDebug.FlagToString(mask = 33554432, equals = 33554432, name = "LOCAL_FOCUS_MODE"), @ViewDebug.FlagToString(mask = 67108864, equals = 67108864, name = "TRANSLUCENT_STATUS"), @ViewDebug.FlagToString(mask = 134217728, equals = 134217728, name = "TRANSLUCENT_NAVIGATION"), @ViewDebug.FlagToString(mask = 268435456, equals = 268435456, name = "LOCAL_FOCUS_MODE"), @ViewDebug.FlagToString(mask = 536870912, equals = 536870912, name = "FLAG_SLIPPERY"), @ViewDebug.FlagToString(mask = 1073741824, equals = 1073741824, name = "FLAG_LAYOUT_ATTACHED_IN_DECOR"), @ViewDebug.FlagToString(mask = Integer.MIN_VALUE, equals = Integer.MIN_VALUE, name = "DRAWS_SYSTEM_BAR_BACKGROUNDS") }, formatToHexString = true)
        public int flags;
        public int format;
        public int gravity;
        public float horizontalMargin;
        @ViewDebug.ExportedProperty
        public float horizontalWeight;
        public int layoutInDisplayCutoutMode;
        @Deprecated
        public int memoryType;
        public String packageName;
        public boolean preferMinimalPostProcessing;
        public int preferredDisplayModeId;
        public float preferredRefreshRate;
        public int rotationAnimation;
        public float screenBrightness;
        public int screenOrientation;
        public int softInputMode;
        @Deprecated
        public int systemUiVisibility;
        public IBinder token;
        @ViewDebug.ExportedProperty(mapping = { @ViewDebug.IntToString(from = 1, to = "BASE_APPLICATION"), @ViewDebug.IntToString(from = 2, to = "APPLICATION"), @ViewDebug.IntToString(from = 3, to = "APPLICATION_STARTING"), @ViewDebug.IntToString(from = 4, to = "DRAWN_APPLICATION"), @ViewDebug.IntToString(from = 1000, to = "APPLICATION_PANEL"), @ViewDebug.IntToString(from = 1001, to = "APPLICATION_MEDIA"), @ViewDebug.IntToString(from = 1002, to = "APPLICATION_SUB_PANEL"), @ViewDebug.IntToString(from = 1005, to = "APPLICATION_ABOVE_SUB_PANEL"), @ViewDebug.IntToString(from = 1003, to = "APPLICATION_ATTACHED_DIALOG"), @ViewDebug.IntToString(from = 1004, to = "APPLICATION_MEDIA_OVERLAY"), @ViewDebug.IntToString(from = 2000, to = "STATUS_BAR"), @ViewDebug.IntToString(from = 2001, to = "SEARCH_BAR"), @ViewDebug.IntToString(from = 2002, to = "PHONE"), @ViewDebug.IntToString(from = 2003, to = "SYSTEM_ALERT"), @ViewDebug.IntToString(from = 2004, to = "KEYGUARD"), @ViewDebug.IntToString(from = 2005, to = "TOAST"), @ViewDebug.IntToString(from = 2006, to = "SYSTEM_OVERLAY"), @ViewDebug.IntToString(from = 2007, to = "PRIORITY_PHONE"), @ViewDebug.IntToString(from = 2008, to = "SYSTEM_DIALOG"), @ViewDebug.IntToString(from = 2009, to = "KEYGUARD_DIALOG"), @ViewDebug.IntToString(from = 2010, to = "SYSTEM_ERROR"), @ViewDebug.IntToString(from = 2011, to = "INPUT_METHOD"), @ViewDebug.IntToString(from = 2012, to = "INPUT_METHOD_DIALOG"), @ViewDebug.IntToString(from = 2013, to = "WALLPAPER"), @ViewDebug.IntToString(from = 2014, to = "STATUS_BAR_PANEL"), @ViewDebug.IntToString(from = 2015, to = "SECURE_SYSTEM_OVERLAY"), @ViewDebug.IntToString(from = 2016, to = "DRAG"), @ViewDebug.IntToString(from = 2017, to = "STATUS_BAR_SUB_PANEL"), @ViewDebug.IntToString(from = 2018, to = "POINTER"), @ViewDebug.IntToString(from = 2019, to = "NAVIGATION_BAR"), @ViewDebug.IntToString(from = 2020, to = "VOLUME_OVERLAY"), @ViewDebug.IntToString(from = 2021, to = "BOOT_PROGRESS"), @ViewDebug.IntToString(from = 2022, to = "INPUT_CONSUMER"), @ViewDebug.IntToString(from = 2024, to = "NAVIGATION_BAR_PANEL"), @ViewDebug.IntToString(from = 2026, to = "DISPLAY_OVERLAY"), @ViewDebug.IntToString(from = 2027, to = "MAGNIFICATION_OVERLAY"), @ViewDebug.IntToString(from = 2037, to = "PRESENTATION"), @ViewDebug.IntToString(from = 2030, to = "PRIVATE_PRESENTATION"), @ViewDebug.IntToString(from = 2031, to = "VOICE_INTERACTION"), @ViewDebug.IntToString(from = 2032, to = "ACCESSIBILITY_OVERLAY"), @ViewDebug.IntToString(from = 2033, to = "VOICE_INTERACTION_STARTING"), @ViewDebug.IntToString(from = 2034, to = "DOCK_DIVIDER"), @ViewDebug.IntToString(from = 2035, to = "QS_DIALOG"), @ViewDebug.IntToString(from = 2036, to = "SCREENSHOT"), @ViewDebug.IntToString(from = 2038, to = "APPLICATION_OVERLAY"), @ViewDebug.IntToString(from = 2039, to = "ACCESSIBILITY_MAGNIFICATION_OVERLAY"), @ViewDebug.IntToString(from = 2040, to = "NOTIFICATION_SHADE"), @ViewDebug.IntToString(from = 2041, to = "STATUS_BAR_ADDITIONAL") })
        public int type;
        public float verticalMargin;
        @ViewDebug.ExportedProperty
        public float verticalWeight;
        public int windowAnimations;
        @ViewDebug.ExportedProperty
        public int x;
        @ViewDebug.ExportedProperty
        public int y;
        
        public LayoutParams() {
            super(null);
            this.alpha = 1.0f;
            this.buttonBrightness = -1.0f;
            this.dimAmount = 1.0f;
            this.layoutInDisplayCutoutMode = 0;
            this.preferMinimalPostProcessing = false;
            this.rotationAnimation = 0;
            this.screenBrightness = -1.0f;
            this.screenOrientation = -1;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final int _type) {
            super(null);
            this.alpha = 1.0f;
            this.buttonBrightness = -1.0f;
            this.dimAmount = 1.0f;
            this.layoutInDisplayCutoutMode = 0;
            this.preferMinimalPostProcessing = false;
            this.rotationAnimation = 0;
            this.screenBrightness = -1.0f;
            this.screenOrientation = -1;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final int _type, final int _flags) {
            super(null);
            this.alpha = 1.0f;
            this.buttonBrightness = -1.0f;
            this.dimAmount = 1.0f;
            this.layoutInDisplayCutoutMode = 0;
            this.preferMinimalPostProcessing = false;
            this.rotationAnimation = 0;
            this.screenBrightness = -1.0f;
            this.screenOrientation = -1;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final int _type, final int _flags, final int _format) {
            super(null);
            this.alpha = 1.0f;
            this.buttonBrightness = -1.0f;
            this.dimAmount = 1.0f;
            this.layoutInDisplayCutoutMode = 0;
            this.preferMinimalPostProcessing = false;
            this.rotationAnimation = 0;
            this.screenBrightness = -1.0f;
            this.screenOrientation = -1;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final int w, final int h, final int _type, final int _flags, final int _format) {
            super(null);
            this.alpha = 1.0f;
            this.buttonBrightness = -1.0f;
            this.dimAmount = 1.0f;
            this.layoutInDisplayCutoutMode = 0;
            this.preferMinimalPostProcessing = false;
            this.rotationAnimation = 0;
            this.screenBrightness = -1.0f;
            this.screenOrientation = -1;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final int w, final int h, final int xpos, final int ypos, final int _type, final int _flags, final int _format) {
            super(null);
            this.alpha = 1.0f;
            this.buttonBrightness = -1.0f;
            this.dimAmount = 1.0f;
            this.layoutInDisplayCutoutMode = 0;
            this.preferMinimalPostProcessing = false;
            this.rotationAnimation = 0;
            this.screenBrightness = -1.0f;
            this.screenOrientation = -1;
            throw new RuntimeException("Stub!");
        }
        
        public LayoutParams(final Parcel in) {
            super(null);
            this.alpha = 1.0f;
            this.buttonBrightness = -1.0f;
            this.dimAmount = 1.0f;
            this.layoutInDisplayCutoutMode = 0;
            this.preferMinimalPostProcessing = false;
            this.rotationAnimation = 0;
            this.screenBrightness = -1.0f;
            this.screenOrientation = -1;
            throw new RuntimeException("Stub!");
        }
        
        public static boolean mayUseInputMethod(final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        public void setFitInsetsTypes(final int types) {
            throw new RuntimeException("Stub!");
        }
        
        public void setFitInsetsSides(final int sides) {
            throw new RuntimeException("Stub!");
        }
        
        public void setFitInsetsIgnoringVisibility(final boolean ignore) {
            throw new RuntimeException("Stub!");
        }
        
        public void setWallpaperTouchEventsEnabled(final boolean enable) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean areWallpaperTouchEventsEnabled() {
            throw new RuntimeException("Stub!");
        }
        
        public void setCanPlayMoveAnimation(final boolean enable) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean canPlayMoveAnimation() {
            throw new RuntimeException("Stub!");
        }
        
        public int getFitInsetsTypes() {
            throw new RuntimeException("Stub!");
        }
        
        public int getFitInsetsSides() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isFitInsetsIgnoringVisibility() {
            throw new RuntimeException("Stub!");
        }
        
        public final void setTitle(final CharSequence title) {
            throw new RuntimeException("Stub!");
        }
        
        public final CharSequence getTitle() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isHdrConversionEnabled() {
            throw new RuntimeException("Stub!");
        }
        
        public void setHdrConversionEnabled(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        public void setColorMode(final int colorMode) {
            throw new RuntimeException("Stub!");
        }
        
        public int getColorMode() {
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
        
        public void setBlurBehindRadius(final int blurBehindRadius) {
            throw new RuntimeException("Stub!");
        }
        
        public int getBlurBehindRadius() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel out, final int parcelableFlags) {
            throw new RuntimeException("Stub!");
        }
        
        public final int copyFrom(final LayoutParams o) {
            throw new RuntimeException("Stub!");
        }
        
        public String debug(final String output) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
}
