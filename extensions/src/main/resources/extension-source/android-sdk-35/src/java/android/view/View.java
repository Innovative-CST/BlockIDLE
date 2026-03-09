package android.view;

import android.os.Parcel;
import android.view.displayhash.DisplayHashResultCallback;
import java.util.concurrent.Executor;
import android.view.translation.TranslationCapability;
import android.util.LongSparseArray;
import android.view.translation.ViewTranslationResponse;
import android.view.translation.ViewTranslationCallback;
import android.view.translation.ViewTranslationRequest;
import java.util.function.Consumer;
import android.content.ClipData;
import android.graphics.Region;
import android.view.animation.Animation;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.RenderEffect;
import android.graphics.Paint;
import android.os.Parcelable;
import android.os.IBinder;
import android.os.Handler;
import android.graphics.Point;
import android.animation.StateListAnimator;
import android.graphics.Matrix;
import android.graphics.Canvas;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.content.res.Configuration;
import java.util.Collection;
import java.util.ArrayList;
import android.window.OnBackInvokedDispatcher;
import java.util.List;
import android.view.accessibility.AccessibilityNodeProvider;
import android.os.Bundle;
import android.view.contentcapture.ContentCaptureSession;
import android.view.autofill.AutofillId;
import android.util.SparseArray;
import android.view.autofill.AutofillValue;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.Rect;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.OutcomeReceiver;
import android.credentials.GetCredentialRequest;
import android.content.res.TypedArray;
import java.util.Map;
import android.util.AttributeSet;
import android.content.Context;
import android.util.Property;
import android.view.accessibility.AccessibilityEventSource;
import android.graphics.drawable.Drawable;

public class View implements Drawable.Callback, KeyEvent.Callback, AccessibilityEventSource
{
    public static final int ACCESSIBILITY_DATA_SENSITIVE_AUTO = 0;
    public static final int ACCESSIBILITY_DATA_SENSITIVE_NO = 2;
    public static final int ACCESSIBILITY_DATA_SENSITIVE_YES = 1;
    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
    public static final Property<View, Float> ALPHA;
    public static final int AUTOFILL_FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 1;
    public static final String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE = "creditCardExpirationDate";
    public static final String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY = "creditCardExpirationDay";
    public static final String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH = "creditCardExpirationMonth";
    public static final String AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR = "creditCardExpirationYear";
    public static final String AUTOFILL_HINT_CREDIT_CARD_NUMBER = "creditCardNumber";
    public static final String AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE = "creditCardSecurityCode";
    public static final String AUTOFILL_HINT_EMAIL_ADDRESS = "emailAddress";
    public static final String AUTOFILL_HINT_NAME = "name";
    public static final String AUTOFILL_HINT_PASSWORD = "password";
    public static final String AUTOFILL_HINT_PHONE = "phone";
    public static final String AUTOFILL_HINT_POSTAL_ADDRESS = "postalAddress";
    public static final String AUTOFILL_HINT_POSTAL_CODE = "postalCode";
    public static final String AUTOFILL_HINT_USERNAME = "username";
    public static final int AUTOFILL_TYPE_DATE = 4;
    public static final int AUTOFILL_TYPE_LIST = 3;
    public static final int AUTOFILL_TYPE_NONE = 0;
    public static final int AUTOFILL_TYPE_TEXT = 1;
    public static final int AUTOFILL_TYPE_TOGGLE = 2;
    public static final int CONTENT_SENSITIVITY_AUTO = 0;
    public static final int CONTENT_SENSITIVITY_NOT_SENSITIVE = 2;
    public static final int CONTENT_SENSITIVITY_SENSITIVE = 1;
    public static final int DRAG_FLAG_ACCESSIBILITY_ACTION = 1024;
    public static final int DRAG_FLAG_GLOBAL = 256;
    public static final int DRAG_FLAG_GLOBAL_PERSISTABLE_URI_PERMISSION = 64;
    public static final int DRAG_FLAG_GLOBAL_PREFIX_URI_PERMISSION = 128;
    public static final int DRAG_FLAG_GLOBAL_SAME_APPLICATION = 4096;
    public static final int DRAG_FLAG_GLOBAL_URI_READ = 1;
    public static final int DRAG_FLAG_GLOBAL_URI_WRITE = 2;
    public static final int DRAG_FLAG_OPAQUE = 512;
    public static final int DRAG_FLAG_START_INTENT_SENDER_ON_UNHANDLED_DRAG = 8192;
    @Deprecated
    public static final int DRAWING_CACHE_QUALITY_AUTO = 0;
    @Deprecated
    public static final int DRAWING_CACHE_QUALITY_HIGH = 1048576;
    @Deprecated
    public static final int DRAWING_CACHE_QUALITY_LOW = 524288;
    protected static final int[] EMPTY_STATE_SET;
    protected static final int[] ENABLED_FOCUSED_SELECTED_STATE_SET;
    protected static final int[] ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET;
    protected static final int[] ENABLED_FOCUSED_STATE_SET;
    protected static final int[] ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET;
    protected static final int[] ENABLED_SELECTED_STATE_SET;
    protected static final int[] ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET;
    protected static final int[] ENABLED_STATE_SET;
    protected static final int[] ENABLED_WINDOW_FOCUSED_STATE_SET;
    public static final int FIND_VIEWS_WITH_CONTENT_DESCRIPTION = 2;
    public static final int FIND_VIEWS_WITH_TEXT = 1;
    public static final int FOCUSABLE = 1;
    public static final int FOCUSABLES_ALL = 0;
    public static final int FOCUSABLES_TOUCH_MODE = 1;
    public static final int FOCUSABLE_AUTO = 16;
    protected static final int[] FOCUSED_SELECTED_STATE_SET;
    protected static final int[] FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET;
    protected static final int[] FOCUSED_STATE_SET;
    protected static final int[] FOCUSED_WINDOW_FOCUSED_STATE_SET;
    public static final int FOCUS_BACKWARD = 1;
    public static final int FOCUS_DOWN = 130;
    public static final int FOCUS_FORWARD = 2;
    public static final int FOCUS_LEFT = 17;
    public static final int FOCUS_RIGHT = 66;
    public static final int FOCUS_UP = 33;
    public static final int GONE = 8;
    public static final int HAPTIC_FEEDBACK_ENABLED = 268435456;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int IMPORTANT_FOR_AUTOFILL_AUTO = 0;
    public static final int IMPORTANT_FOR_AUTOFILL_NO = 2;
    public static final int IMPORTANT_FOR_AUTOFILL_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_AUTOFILL_YES = 1;
    public static final int IMPORTANT_FOR_AUTOFILL_YES_EXCLUDE_DESCENDANTS = 4;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;
    public static final int INVISIBLE = 4;
    public static final int KEEP_SCREEN_ON = 67108864;
    public static final int LAYER_TYPE_HARDWARE = 2;
    public static final int LAYER_TYPE_NONE = 0;
    public static final int LAYER_TYPE_SOFTWARE = 1;
    public static final int LAYOUT_DIRECTION_INHERIT = 2;
    public static final int LAYOUT_DIRECTION_LOCALE = 3;
    public static final int LAYOUT_DIRECTION_LTR = 0;
    public static final int LAYOUT_DIRECTION_RTL = 1;
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
    public static final int MEASURED_SIZE_MASK = 16777215;
    public static final int MEASURED_STATE_MASK = -16777216;
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;
    public static final int NOT_FOCUSABLE = 0;
    public static final int NO_ID = -1;
    public static final int OVER_SCROLL_ALWAYS = 0;
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
    public static final int OVER_SCROLL_NEVER = 2;
    protected static final int[] PRESSED_ENABLED_FOCUSED_SELECTED_STATE_SET;
    protected static final int[] PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET;
    protected static final int[] PRESSED_ENABLED_FOCUSED_STATE_SET;
    protected static final int[] PRESSED_ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET;
    protected static final int[] PRESSED_ENABLED_SELECTED_STATE_SET;
    protected static final int[] PRESSED_ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET;
    protected static final int[] PRESSED_ENABLED_STATE_SET;
    protected static final int[] PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET;
    protected static final int[] PRESSED_FOCUSED_SELECTED_STATE_SET;
    protected static final int[] PRESSED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET;
    protected static final int[] PRESSED_FOCUSED_STATE_SET;
    protected static final int[] PRESSED_FOCUSED_WINDOW_FOCUSED_STATE_SET;
    protected static final int[] PRESSED_SELECTED_STATE_SET;
    protected static final int[] PRESSED_SELECTED_WINDOW_FOCUSED_STATE_SET;
    protected static final int[] PRESSED_STATE_SET;
    protected static final int[] PRESSED_WINDOW_FOCUSED_STATE_SET;
    public static final float REQUESTED_FRAME_RATE_CATEGORY_DEFAULT = Float.NaN;
    public static final float REQUESTED_FRAME_RATE_CATEGORY_HIGH = -4.0f;
    public static final float REQUESTED_FRAME_RATE_CATEGORY_LOW = -2.0f;
    public static final float REQUESTED_FRAME_RATE_CATEGORY_NORMAL = -3.0f;
    public static final float REQUESTED_FRAME_RATE_CATEGORY_NO_PREFERENCE = -1.0f;
    public static final Property<View, Float> ROTATION;
    public static final Property<View, Float> ROTATION_X;
    public static final Property<View, Float> ROTATION_Y;
    public static final Property<View, Float> SCALE_X;
    public static final Property<View, Float> SCALE_Y;
    public static final int SCREEN_STATE_OFF = 0;
    public static final int SCREEN_STATE_ON = 1;
    public static final int SCROLLBARS_INSIDE_INSET = 16777216;
    public static final int SCROLLBARS_INSIDE_OVERLAY = 0;
    public static final int SCROLLBARS_OUTSIDE_INSET = 50331648;
    public static final int SCROLLBARS_OUTSIDE_OVERLAY = 33554432;
    public static final int SCROLLBAR_POSITION_DEFAULT = 0;
    public static final int SCROLLBAR_POSITION_LEFT = 1;
    public static final int SCROLLBAR_POSITION_RIGHT = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    public static final int SCROLL_CAPTURE_HINT_AUTO = 0;
    public static final int SCROLL_CAPTURE_HINT_EXCLUDE = 1;
    public static final int SCROLL_CAPTURE_HINT_EXCLUDE_DESCENDANTS = 4;
    public static final int SCROLL_CAPTURE_HINT_INCLUDE = 2;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_END = 32;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_TOP = 1;
    protected static final int[] SELECTED_STATE_SET;
    protected static final int[] SELECTED_WINDOW_FOCUSED_STATE_SET;
    public static final int SOUND_EFFECTS_ENABLED = 134217728;
    @Deprecated
    public static final int STATUS_BAR_HIDDEN = 1;
    @Deprecated
    public static final int STATUS_BAR_VISIBLE = 0;
    @Deprecated
    public static final int SYSTEM_UI_FLAG_FULLSCREEN = 4;
    @Deprecated
    public static final int SYSTEM_UI_FLAG_HIDE_NAVIGATION = 2;
    @Deprecated
    public static final int SYSTEM_UI_FLAG_IMMERSIVE = 2048;
    @Deprecated
    public static final int SYSTEM_UI_FLAG_IMMERSIVE_STICKY = 4096;
    @Deprecated
    public static final int SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN = 1024;
    @Deprecated
    public static final int SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION = 512;
    @Deprecated
    public static final int SYSTEM_UI_FLAG_LAYOUT_STABLE = 256;
    @Deprecated
    public static final int SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR = 16;
    @Deprecated
    public static final int SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = 8192;
    @Deprecated
    public static final int SYSTEM_UI_FLAG_LOW_PROFILE = 1;
    @Deprecated
    public static final int SYSTEM_UI_FLAG_VISIBLE = 0;
    @Deprecated
    public static final int SYSTEM_UI_LAYOUT_FLAGS = 1536;
    public static final int TEXT_ALIGNMENT_CENTER = 4;
    public static final int TEXT_ALIGNMENT_GRAVITY = 1;
    public static final int TEXT_ALIGNMENT_INHERIT = 0;
    public static final int TEXT_ALIGNMENT_TEXT_END = 3;
    public static final int TEXT_ALIGNMENT_TEXT_START = 2;
    public static final int TEXT_ALIGNMENT_VIEW_END = 6;
    public static final int TEXT_ALIGNMENT_VIEW_START = 5;
    public static final int TEXT_DIRECTION_ANY_RTL = 2;
    public static final int TEXT_DIRECTION_FIRST_STRONG = 1;
    public static final int TEXT_DIRECTION_FIRST_STRONG_LTR = 6;
    public static final int TEXT_DIRECTION_FIRST_STRONG_RTL = 7;
    public static final int TEXT_DIRECTION_INHERIT = 0;
    public static final int TEXT_DIRECTION_LOCALE = 5;
    public static final int TEXT_DIRECTION_LTR = 3;
    public static final int TEXT_DIRECTION_RTL = 4;
    public static final Property<View, Float> TRANSLATION_X;
    public static final Property<View, Float> TRANSLATION_Y;
    public static final Property<View, Float> TRANSLATION_Z;
    protected static final String VIEW_LOG_TAG = "View";
    public static final int VISIBLE = 0;
    protected static final int[] WINDOW_FOCUSED_STATE_SET;
    public static final Property<View, Float> X;
    public static final Property<View, Float> Y;
    public static final Property<View, Float> Z;
    
    public View(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public View(final Context context, @Nullable final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    public View(final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        throw new RuntimeException("Stub!");
    }
    
    public View(final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getAttributeResolutionStack(final int attribute) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<Integer, Integer> getAttributeSourceResourceMap() {
        throw new RuntimeException("Stub!");
    }
    
    public int getExplicitStyle() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isShowingLayoutBounds() {
        throw new RuntimeException("Stub!");
    }
    
    public final void saveAttributeDataForStyleable(@NonNull final Context context, @NonNull final int[] styleable, @Nullable final AttributeSet attrs, @NonNull final TypedArray t, final int defStyleAttr, final int defStyleRes) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVerticalFadingEdgeLength() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFadingEdgeLength(final int length) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearPendingCredentialRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPendingCredentialRequest(@NonNull final GetCredentialRequest request, @NonNull final OutcomeReceiver<GetCredentialResponse, GetCredentialException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public int getHorizontalFadingEdgeLength() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVerticalScrollbarWidth() {
        throw new RuntimeException("Stub!");
    }
    
    protected int getHorizontalScrollbarHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public void setVerticalScrollbarThumbDrawable(@Nullable final Drawable drawable) {
        throw new RuntimeException("Stub!");
    }
    
    public void setVerticalScrollbarTrackDrawable(@Nullable final Drawable drawable) {
        throw new RuntimeException("Stub!");
    }
    
    public void setHorizontalScrollbarThumbDrawable(@Nullable final Drawable drawable) {
        throw new RuntimeException("Stub!");
    }
    
    public void setHorizontalScrollbarTrackDrawable(@Nullable final Drawable drawable) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getVerticalScrollbarThumbDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getVerticalScrollbarTrackDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getHorizontalScrollbarThumbDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getHorizontalScrollbarTrackDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setVerticalScrollbarPosition(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    public int getVerticalScrollbarPosition() {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollIndicators(final int indicators) {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollIndicators(final int indicators, final int mask) {
        throw new RuntimeException("Stub!");
    }
    
    public int getScrollIndicators() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnScrollChangeListener(final OnScrollChangeListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnFocusChangeListener(final OnFocusChangeListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnLayoutChangeListener(final OnLayoutChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnLayoutChangeListener(final OnLayoutChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnAttachStateChangeListener(final OnAttachStateChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnAttachStateChangeListener(final OnAttachStateChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public OnFocusChangeListener getOnFocusChangeListener() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnClickListener(@Nullable final OnClickListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasOnClickListeners() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnLongClickListener(@Nullable final OnLongClickListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasOnLongClickListeners() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnContextClickListener(@Nullable final OnContextClickListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnCreateContextMenuListener(final OnCreateContextMenuListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean performClick() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean callOnClick() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean performLongClick() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean performLongClick(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean performContextClick(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean performContextClick() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean showContextMenu() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean showContextMenu(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public ActionMode startActionMode(final ActionMode.Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public ActionMode startActionMode(final ActionMode.Callback callback, final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnKeyListener(final OnKeyListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnTouchListener(final OnTouchListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnGenericMotionListener(final OnGenericMotionListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnHoverListener(final OnHoverListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnDragListener(final OnDragListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setRevealOnFocusHint(final boolean revealOnFocus) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean getRevealOnFocusHint() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean requestRectangleOnScreen(final Rect rectangle) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean requestRectangleOnScreen(final Rect rectangle, final boolean immediate) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearFocus() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "focus")
    public boolean hasFocus() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasFocusable() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasExplicitFocusable() {
        throw new RuntimeException("Stub!");
    }
    
    protected void onFocusChanged(final boolean gainFocus, final int direction, @Nullable final Rect previouslyFocusedRect) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAccessibilityPaneTitle(@Nullable final CharSequence accessibilityPaneTitle) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getAccessibilityPaneTitle() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void sendAccessibilityEvent(final int eventType) {
        throw new RuntimeException("Stub!");
    }
    
    public void announceForAccessibility(final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void sendAccessibilityEventUnchecked(final AccessibilityEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPopulateAccessibilityEvent(final AccessibilityEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo info) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public void onProvideStructure(final ViewStructure structure) {
        throw new RuntimeException("Stub!");
    }
    
    public void onProvideAutofillStructure(final ViewStructure structure, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void onProvideContentCaptureStructure(@NonNull final ViewStructure structure, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void onProvideVirtualStructure(final ViewStructure structure) {
        throw new RuntimeException("Stub!");
    }
    
    public void onProvideAutofillVirtualStructure(final ViewStructure structure, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnReceiveContentListener(@Nullable final String[] mimeTypes, @Nullable final OnReceiveContentListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ContentInfo performReceiveContent(@NonNull final ContentInfo payload) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ContentInfo onReceiveContent(@NonNull final ContentInfo payload) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String[] getReceiveContentMimeTypes() {
        throw new RuntimeException("Stub!");
    }
    
    public void autofill(final AutofillValue value) {
        throw new RuntimeException("Stub!");
    }
    
    public void autofill(@NonNull final SparseArray<AutofillValue> values) {
        throw new RuntimeException("Stub!");
    }
    
    public final AutofillId getAutofillId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final GetCredentialRequest getPendingCredentialRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final OutcomeReceiver<GetCredentialResponse, GetCredentialException> getPendingCredentialCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAutofillId(@Nullable final AutofillId id) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAutofillType() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    @Nullable
    public String[] getAutofillHints() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AutofillValue getAutofillValue() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(mapping = { @ViewDebug.IntToString(from = 0, to = "auto"), @ViewDebug.IntToString(from = 1, to = "yes"), @ViewDebug.IntToString(from = 2, to = "no"), @ViewDebug.IntToString(from = 4, to = "yesExcludeDescendants"), @ViewDebug.IntToString(from = 8, to = "noExcludeDescendants") })
    public int getImportantForAutofill() {
        throw new RuntimeException("Stub!");
    }
    
    public void setImportantForAutofill(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isImportantForAutofill() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setContentSensitivity(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getContentSensitivity() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isContentSensitive() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(mapping = { @ViewDebug.IntToString(from = 0, to = "auto"), @ViewDebug.IntToString(from = 1, to = "yes"), @ViewDebug.IntToString(from = 2, to = "no"), @ViewDebug.IntToString(from = 4, to = "yesExcludeDescendants"), @ViewDebug.IntToString(from = 8, to = "noExcludeDescendants") })
    public int getImportantForContentCapture() {
        throw new RuntimeException("Stub!");
    }
    
    public void setImportantForContentCapture(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isImportantForContentCapture() {
        throw new RuntimeException("Stub!");
    }
    
    public void setContentCaptureSession(@Nullable final ContentCaptureSession contentCaptureSession) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final ContentCaptureSession getContentCaptureSession() {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchProvideStructure(final ViewStructure structure) {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchProvideAutofillStructure(@NonNull final ViewStructure structure, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void addExtraDataToAccessibilityNodeInfo(@NonNull final AccessibilityNodeInfo info, @NonNull final String extraDataKey, @Nullable final Bundle arguments) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isVisibleToUserForAutofill(final int virtualId) {
        throw new RuntimeException("Stub!");
    }
    
    public AccessibilityDelegate getAccessibilityDelegate() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAccessibilityDelegate(@Nullable final AccessibilityDelegate delegate) {
        throw new RuntimeException("Stub!");
    }
    
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "accessibility")
    @Nullable
    public final CharSequence getStateDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "accessibility")
    public CharSequence getContentDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStateDescription(@Nullable final CharSequence stateDescription) {
        throw new RuntimeException("Stub!");
    }
    
    public void setContentDescription(final CharSequence contentDescription) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAccessibilityTraversalBefore(final int beforeId) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAccessibilityTraversalBefore() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAccessibilityTraversalAfter(final int afterId) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAccessibilityTraversalAfter() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "accessibility")
    public int getLabelFor() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLabelFor(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "focus")
    public boolean isFocused() {
        throw new RuntimeException("Stub!");
    }
    
    public View findFocus() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isScrollContainer() {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollContainer(final boolean isScrollContainer) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getDrawingCacheQuality() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDrawingCacheQuality(final int quality) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getKeepScreenOn() {
        throw new RuntimeException("Stub!");
    }
    
    public void setKeepScreenOn(final boolean keepScreenOn) {
        throw new RuntimeException("Stub!");
    }
    
    public int getNextFocusLeftId() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNextFocusLeftId(final int nextFocusLeftId) {
        throw new RuntimeException("Stub!");
    }
    
    public int getNextFocusRightId() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNextFocusRightId(final int nextFocusRightId) {
        throw new RuntimeException("Stub!");
    }
    
    public int getNextFocusUpId() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNextFocusUpId(final int nextFocusUpId) {
        throw new RuntimeException("Stub!");
    }
    
    public int getNextFocusDownId() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNextFocusDownId(final int nextFocusDownId) {
        throw new RuntimeException("Stub!");
    }
    
    public int getNextFocusForwardId() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNextFocusForwardId(final int nextFocusForwardId) {
        throw new RuntimeException("Stub!");
    }
    
    public int getNextClusterForwardId() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNextClusterForwardId(final int nextClusterForwardId) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isShown() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected boolean fitSystemWindows(final Rect insets) {
        throw new RuntimeException("Stub!");
    }
    
    public WindowInsets onApplyWindowInsets(final WindowInsets insets) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnApplyWindowInsetsListener(final OnApplyWindowInsetsListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public WindowInsets dispatchApplyWindowInsets(final WindowInsets insets) {
        throw new RuntimeException("Stub!");
    }
    
    public void setWindowInsetsAnimationCallback(@Nullable final WindowInsetsAnimation.Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchWindowInsetsAnimationPrepare(@NonNull final WindowInsetsAnimation animation) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public WindowInsetsAnimation.Bounds dispatchWindowInsetsAnimationStart(@NonNull final WindowInsetsAnimation animation, @NonNull final WindowInsetsAnimation.Bounds bounds) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public WindowInsets dispatchWindowInsetsAnimationProgress(@NonNull final WindowInsets insets, @NonNull final List<WindowInsetsAnimation> runningAnimations) {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchWindowInsetsAnimationEnd(@NonNull final WindowInsetsAnimation animation) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSystemGestureExclusionRects(@NonNull final List<Rect> rects) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Rect> getSystemGestureExclusionRects() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setPreferKeepClear(final boolean preferKeepClear) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isPreferKeepClear() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setPreferKeepClearRects(@NonNull final List<Rect> rects) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final List<Rect> getPreferKeepClearRects() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHandwritingBoundsOffsets(final float offsetLeft, final float offsetTop, final float offsetRight, final float offsetBottom) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHandwritingBoundsOffsetLeft() {
        throw new RuntimeException("Stub!");
    }
    
    public float getHandwritingBoundsOffsetTop() {
        throw new RuntimeException("Stub!");
    }
    
    public float getHandwritingBoundsOffsetRight() {
        throw new RuntimeException("Stub!");
    }
    
    public float getHandwritingBoundsOffsetBottom() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHandwritingDelegatorCallback(@Nullable final Runnable callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Runnable getHandwritingDelegatorCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAllowedHandwritingDelegatePackage(@Nullable final String allowedPackageName) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getAllowedHandwritingDelegatePackageName() {
        throw new RuntimeException("Stub!");
    }
    
    public void setIsHandwritingDelegate(final boolean isHandwritingDelegate) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isHandwritingDelegate() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAllowedHandwritingDelegatorPackage(@Nullable final String allowedPackageName) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getAllowedHandwritingDelegatorPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHandwritingDelegateFlags(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public int getHandwritingDelegateFlags() {
        throw new RuntimeException("Stub!");
    }
    
    public void getLocationInSurface(@NonNull final int[] location) {
        throw new RuntimeException("Stub!");
    }
    
    public WindowInsets getRootWindowInsets() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public WindowInsetsController getWindowInsetsController() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final OnBackInvokedDispatcher findOnBackInvokedDispatcher() {
        throw new RuntimeException("Stub!");
    }
    
    public WindowInsets computeSystemWindowInsets(final WindowInsets in, final Rect outLocalInsets) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFitsSystemWindows(final boolean fitSystemWindows) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public boolean getFitsSystemWindows() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void requestFitSystemWindows() {
        throw new RuntimeException("Stub!");
    }
    
    public void requestApplyInsets() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(mapping = { @ViewDebug.IntToString(from = 0, to = "VISIBLE"), @ViewDebug.IntToString(from = 4, to = "INVISIBLE"), @ViewDebug.IntToString(from = 8, to = "GONE") })
    public int getVisibility() {
        throw new RuntimeException("Stub!");
    }
    
    public void setVisibility(final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFocusable(final boolean focusable) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFocusable(final int focusable) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFocusableInTouchMode(final boolean focusableInTouchMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAutofillHints(@Nullable final String... autofillHints) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSoundEffectsEnabled(final boolean soundEffectsEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public boolean isSoundEffectsEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHapticFeedbackEnabled(final boolean hapticFeedbackEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public boolean isHapticFeedbackEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayoutDirection(final int layoutDirection) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "layout", mapping = { @ViewDebug.IntToString(from = 0, to = "RESOLVED_DIRECTION_LTR"), @ViewDebug.IntToString(from = 1, to = "RESOLVED_DIRECTION_RTL") })
    public int getLayoutDirection() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "layout")
    public boolean hasTransientState() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHasTransientState(final boolean hasTransientState) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAttachedToWindow() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLaidOut() {
        throw new RuntimeException("Stub!");
    }
    
    public void setWillNotDraw(final boolean willNotDraw) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public boolean willNotDraw() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setWillNotCacheDrawing(final boolean willNotCacheDrawing) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @ViewDebug.ExportedProperty(category = "drawing")
    public boolean willNotCacheDrawing() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public boolean isClickable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setClickable(final boolean clickable) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAllowClickWhenDisabled(final boolean clickableWhenDisabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLongClickable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLongClickable(final boolean longClickable) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isContextClickable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setContextClickable(final boolean contextClickable) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPressed(final boolean pressed) {
        throw new RuntimeException("Stub!");
    }
    
    protected void dispatchSetPressed(final boolean pressed) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public boolean isPressed() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSaveEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSaveEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public boolean getFilterTouchesWhenObscured() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFilterTouchesWhenObscured(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSaveFromParentEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSaveFromParentEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "focus")
    public final boolean isFocusable() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(mapping = { @ViewDebug.IntToString(from = 0, to = "NOT_FOCUSABLE"), @ViewDebug.IntToString(from = 1, to = "FOCUSABLE"), @ViewDebug.IntToString(from = 16, to = "FOCUSABLE_AUTO") }, category = "focus")
    public int getFocusable() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "focus")
    public final boolean isFocusableInTouchMode() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isScreenReaderFocusable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setScreenReaderFocusable(final boolean screenReaderFocusable) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAccessibilityHeading() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAccessibilityHeading(final boolean isHeading) {
        throw new RuntimeException("Stub!");
    }
    
    public View focusSearch(final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "focus")
    public final boolean isKeyboardNavigationCluster() {
        throw new RuntimeException("Stub!");
    }
    
    public void setKeyboardNavigationCluster(final boolean isCluster) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "focus")
    public final boolean isFocusedByDefault() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFocusedByDefault(final boolean isFocusedByDefault) {
        throw new RuntimeException("Stub!");
    }
    
    public View keyboardNavigationClusterSearch(final View currentCluster, final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean dispatchUnhandledMove(final View focused, final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDefaultFocusHighlightEnabled(final boolean defaultFocusHighlightEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "focus")
    public final boolean getDefaultFocusHighlightEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public ArrayList<View> getFocusables(final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    public void addFocusables(final ArrayList<View> views, final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    public void addFocusables(final ArrayList<View> views, final int direction, final int focusableMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void addKeyboardNavigationClusters(@NonNull final Collection<View> views, final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    public void findViewsWithText(final ArrayList<View> outViews, final CharSequence searched, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public ArrayList<View> getTouchables() {
        throw new RuntimeException("Stub!");
    }
    
    public void addTouchables(final ArrayList<View> views) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAccessibilityFocused() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean requestFocus() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean restoreDefaultFocus() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean requestFocus(final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean requestFocus(final int direction, final Rect previouslyFocusedRect) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean requestFocusFromTouch() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "accessibility", mapping = { @ViewDebug.IntToString(from = 0, to = "auto"), @ViewDebug.IntToString(from = 1, to = "yes"), @ViewDebug.IntToString(from = 2, to = "no"), @ViewDebug.IntToString(from = 4, to = "noHideDescendants") })
    public int getImportantForAccessibility() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAccessibilityLiveRegion(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAccessibilityLiveRegion() {
        throw new RuntimeException("Stub!");
    }
    
    public void setImportantForAccessibility(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isImportantForAccessibility() {
        throw new RuntimeException("Stub!");
    }
    
    public ViewParent getParentForAccessibility() {
        throw new RuntimeException("Stub!");
    }
    
    public void addChildrenForAccessibility(final ArrayList<View> outChildren) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "accessibility")
    public boolean isAccessibilityDataSensitive() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAccessibilityDataSensitive(final int accessibilityDataSensitive) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTransitionVisibility(final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean dispatchNestedPrePerformAccessibilityAction(final int action, @Nullable final Bundle arguments) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean performAccessibilityAction(final int action, @Nullable final Bundle arguments) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isTemporarilyDetached() {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchStartTemporaryDetach() {
        throw new RuntimeException("Stub!");
    }
    
    public void onStartTemporaryDetach() {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchFinishTemporaryDetach() {
        throw new RuntimeException("Stub!");
    }
    
    public void onFinishTemporaryDetach() {
        throw new RuntimeException("Stub!");
    }
    
    public KeyEvent.DispatcherState getKeyDispatcherState() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean dispatchKeyEventPreIme(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean dispatchKeyEvent(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean dispatchKeyShortcutEvent(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean dispatchTouchEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onFilterTouchEventForSecurity(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean dispatchTrackballEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean dispatchCapturedPointerEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean dispatchGenericMotionEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean dispatchHoverEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean dispatchGenericPointerEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean dispatchGenericFocusedEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchWindowFocusChanged(final boolean hasFocus) {
        throw new RuntimeException("Stub!");
    }
    
    public void onWindowFocusChanged(final boolean hasWindowFocus) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasWindowFocus() {
        throw new RuntimeException("Stub!");
    }
    
    protected void dispatchVisibilityChanged(@NonNull final View changedView, final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onVisibilityChanged(@NonNull final View changedView, final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchDisplayHint(final int hint) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onDisplayHint(final int hint) {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchWindowVisibilityChanged(final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onWindowVisibilityChanged(final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    public void onVisibilityAggregated(final boolean isVisible) {
        throw new RuntimeException("Stub!");
    }
    
    public int getWindowVisibility() {
        throw new RuntimeException("Stub!");
    }
    
    public void getWindowVisibleDisplayFrame(final Rect outRect) {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchConfigurationChanged(final Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onConfigurationChanged(final Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public boolean isInTouchMode() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.CapturedViewProperty
    public final Context getContext() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onKeyPreIme(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyLongPress(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyMultiple(final int keyCode, final int repeatCount, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onKeyShortcut(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onCheckIsTextEditor() {
        throw new RuntimeException("Stub!");
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo outAttrs) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean checkInputConnectionProxy(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void createContextMenu(final ContextMenu menu) {
        throw new RuntimeException("Stub!");
    }
    
    protected ContextMenu.ContextMenuInfo getContextMenuInfo() {
        throw new RuntimeException("Stub!");
    }
    
    protected void onCreateContextMenu(final ContextMenu menu) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onTrackballEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onGenericMotionEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onHoverEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public boolean isHovered() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHovered(final boolean hovered) {
        throw new RuntimeException("Stub!");
    }
    
    public void onHoverChanged(final boolean hovered) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onTouchEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void cancelLongPress() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTouchDelegate(final TouchDelegate delegate) {
        throw new RuntimeException("Stub!");
    }
    
    public TouchDelegate getTouchDelegate() {
        throw new RuntimeException("Stub!");
    }
    
    public final void requestUnbufferedDispatch(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public final void requestUnbufferedDispatch(final int source) {
        throw new RuntimeException("Stub!");
    }
    
    public void bringToFront() {
        throw new RuntimeException("Stub!");
    }
    
    protected void onScrollChanged(final int l, final int t, final int oldl, final int oldt) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onSizeChanged(final int w, final int h, final int oldw, final int oldh) {
        throw new RuntimeException("Stub!");
    }
    
    protected void dispatchDraw(@NonNull final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    public final ViewParent getParent() {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollX(final int value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollY(final int value) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getScrollX() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getScrollY() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "layout")
    public final int getWidth() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "layout")
    public final int getHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public void getDrawingRect(final Rect outRect) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getMeasuredWidth() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "measurement", flagMapping = { @ViewDebug.FlagToString(mask = -16777216, equals = 16777216, name = "MEASURED_STATE_TOO_SMALL") })
    public final int getMeasuredWidthAndState() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getMeasuredHeight() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "measurement", flagMapping = { @ViewDebug.FlagToString(mask = -16777216, equals = 16777216, name = "MEASURED_STATE_TOO_SMALL") })
    public final int getMeasuredHeightAndState() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getMeasuredState() {
        throw new RuntimeException("Stub!");
    }
    
    public Matrix getMatrix() {
        throw new RuntimeException("Stub!");
    }
    
    public float getCameraDistance() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCameraDistance(final float distance) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public float getRotation() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRotation(final float rotation) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public float getRotationY() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRotationY(final float rotationY) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public float getRotationX() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRotationX(final float rotationX) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public float getScaleX() {
        throw new RuntimeException("Stub!");
    }
    
    public void setScaleX(final float scaleX) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public float getScaleY() {
        throw new RuntimeException("Stub!");
    }
    
    public void setScaleY(final float scaleY) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public float getPivotX() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPivotX(final float pivotX) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public float getPivotY() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPivotY(final float pivotY) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPivotSet() {
        throw new RuntimeException("Stub!");
    }
    
    public void resetPivot() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public float getAlpha() {
        throw new RuntimeException("Stub!");
    }
    
    public void forceHasOverlappingRendering(final boolean hasOverlappingRendering) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean getHasOverlappingRendering() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public boolean hasOverlappingRendering() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAlpha(final float alpha) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTransitionAlpha(final float alpha) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public float getTransitionAlpha() {
        throw new RuntimeException("Stub!");
    }
    
    public void setForceDarkAllowed(final boolean allow) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public boolean isForceDarkAllowed() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.CapturedViewProperty
    public final int getTop() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setTop(final int top) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.CapturedViewProperty
    public final int getBottom() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDirty() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setBottom(final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.CapturedViewProperty
    public final int getLeft() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setLeft(final int left) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.CapturedViewProperty
    public final int getRight() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setRight(final int right) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public float getX() {
        throw new RuntimeException("Stub!");
    }
    
    public void setX(final float x) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public float getY() {
        throw new RuntimeException("Stub!");
    }
    
    public void setY(final float y) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public float getZ() {
        throw new RuntimeException("Stub!");
    }
    
    public void setZ(final float z) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public float getElevation() {
        throw new RuntimeException("Stub!");
    }
    
    public void setElevation(final float elevation) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public float getTranslationX() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTranslationX(final float translationX) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public float getTranslationY() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTranslationY(final float translationY) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public float getTranslationZ() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTranslationZ(final float translationZ) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAnimationMatrix(@Nullable final Matrix matrix) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Matrix getAnimationMatrix() {
        throw new RuntimeException("Stub!");
    }
    
    public StateListAnimator getStateListAnimator() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStateListAnimator(final StateListAnimator stateListAnimator) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean getClipToOutline() {
        throw new RuntimeException("Stub!");
    }
    
    public void setClipToOutline(final boolean clipToOutline) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOutlineProvider(final ViewOutlineProvider provider) {
        throw new RuntimeException("Stub!");
    }
    
    public ViewOutlineProvider getOutlineProvider() {
        throw new RuntimeException("Stub!");
    }
    
    public void invalidateOutline() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOutlineSpotShadowColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public int getOutlineSpotShadowColor() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOutlineAmbientShadowColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public int getOutlineAmbientShadowColor() {
        throw new RuntimeException("Stub!");
    }
    
    public void getHitRect(final Rect outRect) {
        throw new RuntimeException("Stub!");
    }
    
    public void getFocusedRect(final Rect r) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getGlobalVisibleRect(final Rect r, final Point globalOffset) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean getGlobalVisibleRect(final Rect r) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean getLocalVisibleRect(final Rect r) {
        throw new RuntimeException("Stub!");
    }
    
    public void offsetTopAndBottom(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public void offsetLeftAndRight(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(deepExport = true, prefix = "layout_")
    public ViewGroup.LayoutParams getLayoutParams() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayoutParams(final ViewGroup.LayoutParams params) {
        throw new RuntimeException("Stub!");
    }
    
    public void scrollTo(final int x, final int y) {
        throw new RuntimeException("Stub!");
    }
    
    public void scrollBy(final int x, final int y) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean awakenScrollBars() {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean awakenScrollBars(final int startDelay) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean awakenScrollBars(final int startDelay, final boolean invalidate) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void invalidate(final Rect dirty) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void invalidate(final int l, final int t, final int r, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    public void invalidate() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public boolean isOpaque() {
        throw new RuntimeException("Stub!");
    }
    
    public Handler getHandler() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean post(final Runnable action) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean postDelayed(final Runnable action, final long delayMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public void postOnAnimation(final Runnable action) {
        throw new RuntimeException("Stub!");
    }
    
    public void postOnAnimationDelayed(final Runnable action, final long delayMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeCallbacks(final Runnable action) {
        throw new RuntimeException("Stub!");
    }
    
    public void postInvalidate() {
        throw new RuntimeException("Stub!");
    }
    
    public void postInvalidate(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void postInvalidateDelayed(final long delayMilliseconds) {
        throw new RuntimeException("Stub!");
    }
    
    public void postInvalidateDelayed(final long delayMilliseconds, final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void postInvalidateOnAnimation() {
        throw new RuntimeException("Stub!");
    }
    
    public void postInvalidateOnAnimation(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void computeScroll() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isHorizontalFadingEdgeEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHorizontalFadingEdgeEnabled(final boolean horizontalFadingEdgeEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isVerticalFadingEdgeEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setVerticalFadingEdgeEnabled(final boolean verticalFadingEdgeEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    protected float getTopFadingEdgeStrength() {
        throw new RuntimeException("Stub!");
    }
    
    protected float getBottomFadingEdgeStrength() {
        throw new RuntimeException("Stub!");
    }
    
    protected float getLeftFadingEdgeStrength() {
        throw new RuntimeException("Stub!");
    }
    
    protected float getRightFadingEdgeStrength() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isHorizontalScrollBarEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHorizontalScrollBarEnabled(final boolean horizontalScrollBarEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isVerticalScrollBarEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setVerticalScrollBarEnabled(final boolean verticalScrollBarEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollbarFadingEnabled(final boolean fadeScrollbars) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isScrollbarFadingEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public int getScrollBarDefaultDelayBeforeFade() {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollBarDefaultDelayBeforeFade(final int scrollBarDefaultDelayBeforeFade) {
        throw new RuntimeException("Stub!");
    }
    
    public int getScrollBarFadeDuration() {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollBarFadeDuration(final int scrollBarFadeDuration) {
        throw new RuntimeException("Stub!");
    }
    
    public int getScrollBarSize() {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollBarSize(final int scrollBarSize) {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollBarStyle(final int style) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(mapping = { @ViewDebug.IntToString(from = 0, to = "INSIDE_OVERLAY"), @ViewDebug.IntToString(from = 16777216, to = "INSIDE_INSET"), @ViewDebug.IntToString(from = 33554432, to = "OUTSIDE_OVERLAY"), @ViewDebug.IntToString(from = 50331648, to = "OUTSIDE_INSET") })
    public int getScrollBarStyle() {
        throw new RuntimeException("Stub!");
    }
    
    protected int computeHorizontalScrollRange() {
        throw new RuntimeException("Stub!");
    }
    
    protected int computeHorizontalScrollOffset() {
        throw new RuntimeException("Stub!");
    }
    
    protected int computeHorizontalScrollExtent() {
        throw new RuntimeException("Stub!");
    }
    
    protected int computeVerticalScrollRange() {
        throw new RuntimeException("Stub!");
    }
    
    protected int computeVerticalScrollOffset() {
        throw new RuntimeException("Stub!");
    }
    
    protected int computeVerticalScrollExtent() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canScrollHorizontally(final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canScrollVertically(final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    protected final void onDrawScrollBars(@NonNull final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onDraw(@NonNull final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onAttachedToWindow() {
        throw new RuntimeException("Stub!");
    }
    
    public void onScreenStateChanged(final int screenState) {
        throw new RuntimeException("Stub!");
    }
    
    public void onRtlPropertiesChanged(final int layoutDirection) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canResolveLayoutDirection() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLayoutDirectionResolved() {
        throw new RuntimeException("Stub!");
    }
    
    protected void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    protected int getWindowAttachCount() {
        throw new RuntimeException("Stub!");
    }
    
    public IBinder getWindowToken() {
        throw new RuntimeException("Stub!");
    }
    
    public WindowId getWindowId() {
        throw new RuntimeException("Stub!");
    }
    
    public IBinder getApplicationWindowToken() {
        throw new RuntimeException("Stub!");
    }
    
    public Display getDisplay() {
        throw new RuntimeException("Stub!");
    }
    
    public final void cancelPendingInputEvents() {
        throw new RuntimeException("Stub!");
    }
    
    public void onCancelPendingInputEvents() {
        throw new RuntimeException("Stub!");
    }
    
    public void saveHierarchyState(final SparseArray<Parcelable> container) {
        throw new RuntimeException("Stub!");
    }
    
    protected void dispatchSaveInstanceState(final SparseArray<Parcelable> container) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    protected Parcelable onSaveInstanceState() {
        throw new RuntimeException("Stub!");
    }
    
    public void restoreHierarchyState(final SparseArray<Parcelable> container) {
        throw new RuntimeException("Stub!");
    }
    
    protected void dispatchRestoreInstanceState(final SparseArray<Parcelable> container) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onRestoreInstanceState(final Parcelable state) {
        throw new RuntimeException("Stub!");
    }
    
    public long getDrawingTime() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDuplicateParentStateEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDuplicateParentStateEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayerType(final int layerType, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRenderEffect(@Nullable final RenderEffect renderEffect) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayerPaint(@Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing", mapping = { @ViewDebug.IntToString(from = 0, to = "NONE"), @ViewDebug.IntToString(from = 1, to = "SOFTWARE"), @ViewDebug.IntToString(from = 2, to = "HARDWARE") })
    public int getLayerType() {
        throw new RuntimeException("Stub!");
    }
    
    public void buildLayer() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDrawingCacheEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @ViewDebug.ExportedProperty(category = "drawing")
    public boolean isDrawingCacheEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Bitmap getDrawingCache() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Bitmap getDrawingCache(final boolean autoScale) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void destroyDrawingCache() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDrawingCacheBackgroundColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getDrawingCacheBackgroundColor() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void buildDrawingCache() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void buildDrawingCache(final boolean autoScale) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInEditMode() {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean isPaddingOffsetRequired() {
        throw new RuntimeException("Stub!");
    }
    
    protected int getLeftPaddingOffset() {
        throw new RuntimeException("Stub!");
    }
    
    protected int getRightPaddingOffset() {
        throw new RuntimeException("Stub!");
    }
    
    protected int getTopPaddingOffset() {
        throw new RuntimeException("Stub!");
    }
    
    protected int getBottomPaddingOffset() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public boolean isHardwareAccelerated() {
        throw new RuntimeException("Stub!");
    }
    
    public void setClipBounds(final Rect clipBounds) {
        throw new RuntimeException("Stub!");
    }
    
    public Rect getClipBounds() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getClipBounds(final Rect outRect) {
        throw new RuntimeException("Stub!");
    }
    
    public void draw(@NonNull final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    public ViewOverlay getOverlay() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "drawing")
    public int getSolidColor() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLayoutRequested() {
        throw new RuntimeException("Stub!");
    }
    
    public void layout(final int l, final int t, final int r, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setLeftTopRightBottom(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onFinishInflate() {
        throw new RuntimeException("Stub!");
    }
    
    public Resources getResources() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void invalidateDrawable(@NonNull final Drawable drawable) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void scheduleDrawable(@NonNull final Drawable who, @NonNull final Runnable what, final long when) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void unscheduleDrawable(@NonNull final Drawable who, @NonNull final Runnable what) {
        throw new RuntimeException("Stub!");
    }
    
    public void unscheduleDrawable(final Drawable who) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean verifyDrawable(@NonNull final Drawable who) {
        throw new RuntimeException("Stub!");
    }
    
    protected void drawableStateChanged() {
        throw new RuntimeException("Stub!");
    }
    
    public void drawableHotspotChanged(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchDrawableHotspotChanged(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public void refreshDrawableState() {
        throw new RuntimeException("Stub!");
    }
    
    public final int[] getDrawableState() {
        throw new RuntimeException("Stub!");
    }
    
    protected int[] onCreateDrawableState(final int extraSpace) {
        throw new RuntimeException("Stub!");
    }
    
    protected static int[] mergeDrawableStates(final int[] baseState, final int[] additionalState) {
        throw new RuntimeException("Stub!");
    }
    
    public void jumpDrawablesToCurrentState() {
        throw new RuntimeException("Stub!");
    }
    
    public void setBackgroundColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public void setBackgroundResource(final int resid) {
        throw new RuntimeException("Stub!");
    }
    
    public void setBackground(final Drawable background) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setBackgroundDrawable(final Drawable background) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getBackground() {
        throw new RuntimeException("Stub!");
    }
    
    public void setBackgroundTintList(@Nullable final ColorStateList tint) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ColorStateList getBackgroundTintList() {
        throw new RuntimeException("Stub!");
    }
    
    public void setBackgroundTintMode(@Nullable final PorterDuff.Mode tintMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setBackgroundTintBlendMode(@Nullable final BlendMode blendMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BlendMode getBackgroundTintBlendMode() {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getForeground() {
        throw new RuntimeException("Stub!");
    }
    
    public void setForeground(final Drawable foreground) {
        throw new RuntimeException("Stub!");
    }
    
    public int getForegroundGravity() {
        throw new RuntimeException("Stub!");
    }
    
    public void setForegroundGravity(final int gravity) {
        throw new RuntimeException("Stub!");
    }
    
    public void setForegroundTintList(@Nullable final ColorStateList tint) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ColorStateList getForegroundTintList() {
        throw new RuntimeException("Stub!");
    }
    
    public void setForegroundTintMode(@Nullable final PorterDuff.Mode tintMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setForegroundTintBlendMode(@Nullable final BlendMode blendMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PorterDuff.Mode getForegroundTintMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BlendMode getForegroundTintBlendMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void onDrawForeground(@NonNull final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPadding(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPaddingRelative(final int start, final int top, final int end, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public int getSourceLayoutResId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPaddingTop() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPaddingBottom() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPaddingLeft() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPaddingStart() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPaddingRight() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPaddingEnd() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPaddingRelative() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSelected(final boolean selected) {
        throw new RuntimeException("Stub!");
    }
    
    protected void dispatchSetSelected(final boolean selected) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public boolean isSelected() {
        throw new RuntimeException("Stub!");
    }
    
    public void setActivated(final boolean activated) {
        throw new RuntimeException("Stub!");
    }
    
    protected void dispatchSetActivated(final boolean activated) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public boolean isActivated() {
        throw new RuntimeException("Stub!");
    }
    
    public ViewTreeObserver getViewTreeObserver() {
        throw new RuntimeException("Stub!");
    }
    
    public View getRootView() {
        throw new RuntimeException("Stub!");
    }
    
    public void transformMatrixToGlobal(@NonNull final Matrix matrix) {
        throw new RuntimeException("Stub!");
    }
    
    public void transformMatrixToLocal(@NonNull final Matrix matrix) {
        throw new RuntimeException("Stub!");
    }
    
    public void getLocationOnScreen(final int[] outLocation) {
        throw new RuntimeException("Stub!");
    }
    
    public void getLocationInWindow(final int[] outLocation) {
        throw new RuntimeException("Stub!");
    }
    
    public final <T extends View> T findViewById(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final <T extends View> T requireViewById(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    public final <T extends View> T findViewWithTag(final Object tag) {
        throw new RuntimeException("Stub!");
    }
    
    public void setId(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.CapturedViewProperty
    public int getId() {
        throw new RuntimeException("Stub!");
    }
    
    public long getUniqueDrawingId() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public Object getTag() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTag(final Object tag) {
        throw new RuntimeException("Stub!");
    }
    
    public Object getTag(final int key) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTag(final int key, final Object tag) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "layout")
    public int getBaseline() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInLayout() {
        throw new RuntimeException("Stub!");
    }
    
    public void requestLayout() {
        throw new RuntimeException("Stub!");
    }
    
    public void forceLayout() {
        throw new RuntimeException("Stub!");
    }
    
    public final void measure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    protected final void setMeasuredDimension(final int measuredWidth, final int measuredHeight) {
        throw new RuntimeException("Stub!");
    }
    
    public static int combineMeasuredStates(final int curState, final int newState) {
        throw new RuntimeException("Stub!");
    }
    
    public static int resolveSize(final int size, final int measureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    public static int resolveSizeAndState(final int size, final int measureSpec, final int childMeasuredState) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getDefaultSize(final int size, final int measureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    protected int getSuggestedMinimumHeight() {
        throw new RuntimeException("Stub!");
    }
    
    protected int getSuggestedMinimumWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinimumHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinimumHeight(final int minHeight) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinimumWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinimumWidth(final int minWidth) {
        throw new RuntimeException("Stub!");
    }
    
    public Animation getAnimation() {
        throw new RuntimeException("Stub!");
    }
    
    public void startAnimation(final Animation animation) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearAnimation() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAnimation(final Animation animation) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onAnimationStart() {
        throw new RuntimeException("Stub!");
    }
    
    protected void onAnimationEnd() {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean onSetAlpha(final int alpha) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean gatherTransparentRegion(@Nullable final Region region) {
        throw new RuntimeException("Stub!");
    }
    
    public void playSoundEffect(final int soundConstant) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean performHapticFeedback(final int feedbackConstant) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean performHapticFeedback(final int feedbackConstant, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSystemUiVisibility(final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getSystemUiVisibility() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getWindowSystemUiVisibility() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(final int visible) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchWindowSystemUiVisiblityChanged(final int visible) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setOnSystemUiVisibilityChangeListener(final OnSystemUiVisibilityChangeListener l) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchSystemUiVisibilityChanged(final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final boolean startDrag(final ClipData data, final DragShadowBuilder shadowBuilder, final Object myLocalState, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean startDragAndDrop(final ClipData data, final DragShadowBuilder shadowBuilder, final Object myLocalState, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public final void cancelDragAndDrop() {
        throw new RuntimeException("Stub!");
    }
    
    public final void updateDragShadow(final DragShadowBuilder shadowBuilder) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onDragEvent(final DragEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean dispatchDragEvent(final DragEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public static View inflate(final Context context, final int resource, final ViewGroup root) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean overScrollBy(final int deltaX, final int deltaY, final int scrollX, final int scrollY, final int scrollRangeX, final int scrollRangeY, final int maxOverScrollX, final int maxOverScrollY, final boolean isTouchEvent) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onOverScrolled(final int scrollX, final int scrollY, final boolean clampedX, final boolean clampedY) {
        throw new RuntimeException("Stub!");
    }
    
    public int getOverScrollMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOverScrollMode(final int overScrollMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setNestedScrollingEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNestedScrollingEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean startNestedScroll(final int axes) {
        throw new RuntimeException("Stub!");
    }
    
    public void stopNestedScroll() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasNestedScrollingParent() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean dispatchNestedScroll(final int dxConsumed, final int dyConsumed, final int dxUnconsumed, final int dyUnconsumed, @Nullable final int[] offsetInWindow) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean dispatchNestedPreScroll(final int dx, final int dy, @Nullable final int[] consumed, @Nullable final int[] offsetInWindow) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean dispatchNestedFling(final float velocityX, final float velocityY, final boolean consumed) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean dispatchNestedPreFling(final float velocityX, final float velocityY) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextDirection(final int textDirection) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "text", mapping = { @ViewDebug.IntToString(from = 0, to = "INHERIT"), @ViewDebug.IntToString(from = 1, to = "FIRST_STRONG"), @ViewDebug.IntToString(from = 2, to = "ANY_RTL"), @ViewDebug.IntToString(from = 3, to = "LTR"), @ViewDebug.IntToString(from = 4, to = "RTL"), @ViewDebug.IntToString(from = 5, to = "LOCALE"), @ViewDebug.IntToString(from = 6, to = "FIRST_STRONG_LTR"), @ViewDebug.IntToString(from = 7, to = "FIRST_STRONG_RTL") })
    public int getTextDirection() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canResolveTextDirection() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTextDirectionResolved() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextAlignment(final int textAlignment) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "text", mapping = { @ViewDebug.IntToString(from = 0, to = "INHERIT"), @ViewDebug.IntToString(from = 1, to = "GRAVITY"), @ViewDebug.IntToString(from = 2, to = "TEXT_START"), @ViewDebug.IntToString(from = 3, to = "TEXT_END"), @ViewDebug.IntToString(from = 4, to = "CENTER"), @ViewDebug.IntToString(from = 5, to = "VIEW_START"), @ViewDebug.IntToString(from = 6, to = "VIEW_END") })
    public int getTextAlignment() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canResolveTextAlignment() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTextAlignmentResolved() {
        throw new RuntimeException("Stub!");
    }
    
    public static int generateViewId() {
        throw new RuntimeException("Stub!");
    }
    
    public PointerIcon onResolvePointerIcon(final MotionEvent event, final int pointerIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPointerIcon(final PointerIcon pointerIcon) {
        throw new RuntimeException("Stub!");
    }
    
    public PointerIcon getPointerIcon() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasPointerCapture() {
        throw new RuntimeException("Stub!");
    }
    
    public void requestPointerCapture() {
        throw new RuntimeException("Stub!");
    }
    
    public void releasePointerCapture() {
        throw new RuntimeException("Stub!");
    }
    
    public void onPointerCaptureChange(final boolean hasCapture) {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchPointerCaptureChanged(final boolean hasCapture) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onCapturedPointerEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnCapturedPointerListener(final OnCapturedPointerListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public ViewPropertyAnimator animate() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setTransitionName(final String transitionName) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public String getTransitionName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getScrollCaptureHint() {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollCaptureHint(final int hint) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setScrollCaptureCallback(@Nullable final ScrollCaptureCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchScrollCaptureSearch(@NonNull final Rect localVisibleRect, @NonNull final Point windowOffset, @NonNull final Consumer<ScrollCaptureTarget> targets) {
        throw new RuntimeException("Stub!");
    }
    
    public void onScrollCaptureSearch(@NonNull final Rect localVisibleRect, @NonNull final Point windowOffset, @NonNull final Consumer<ScrollCaptureTarget> targets) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTooltipText(@Nullable final CharSequence tooltipText) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getTooltipText() {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnUnhandledKeyEventListener(final OnUnhandledKeyEventListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnUnhandledKeyEventListener(final OnUnhandledKeyEventListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIsCredential(final boolean isCredential) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCredential() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAutoHandwritingEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAutoHandwritingEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void onCreateViewTranslationRequest(@NonNull final int[] supportedFormats, @NonNull final Consumer<ViewTranslationRequest> requestsCollector) {
        throw new RuntimeException("Stub!");
    }
    
    public void onCreateVirtualViewTranslationRequests(@NonNull final long[] virtualIds, @NonNull final int[] supportedFormats, @NonNull final Consumer<ViewTranslationRequest> requestsCollector) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewTranslationCallback(@NonNull final ViewTranslationCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearViewTranslationCallback() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ViewTranslationResponse getViewTranslationResponse() {
        throw new RuntimeException("Stub!");
    }
    
    public void onViewTranslationResponse(@NonNull final ViewTranslationResponse response) {
        throw new RuntimeException("Stub!");
    }
    
    public void onVirtualViewTranslationResponses(@NonNull final LongSparseArray<ViewTranslationResponse> response) {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchCreateViewTranslationRequest(@NonNull final Map<AutofillId, long[]> viewIds, @NonNull final int[] supportedFormats, @NonNull final TranslationCapability capability, @NonNull final List<ViewTranslationRequest> requests) {
        throw new RuntimeException("Stub!");
    }
    
    public void generateDisplayHash(@NonNull final String hashAlgorithm, @Nullable final Rect bounds, @NonNull final Executor executor, @NonNull final DisplayHashResultCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AttachedSurfaceControl getRootSurfaceControl() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFrameContentVelocity(final float pixelsPerSecond) {
        throw new RuntimeException("Stub!");
    }
    
    public float getFrameContentVelocity() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRequestedFrameRate(final float frameRate) {
        throw new RuntimeException("Stub!");
    }
    
    public float getRequestedFrameRate() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        ALPHA = null;
        EMPTY_STATE_SET = null;
        ENABLED_FOCUSED_SELECTED_STATE_SET = null;
        ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
        ENABLED_FOCUSED_STATE_SET = null;
        ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
        ENABLED_SELECTED_STATE_SET = null;
        ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
        ENABLED_STATE_SET = null;
        ENABLED_WINDOW_FOCUSED_STATE_SET = null;
        FOCUSED_SELECTED_STATE_SET = null;
        FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
        FOCUSED_STATE_SET = null;
        FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
        PRESSED_ENABLED_FOCUSED_SELECTED_STATE_SET = null;
        PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
        PRESSED_ENABLED_FOCUSED_STATE_SET = null;
        PRESSED_ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
        PRESSED_ENABLED_SELECTED_STATE_SET = null;
        PRESSED_ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
        PRESSED_ENABLED_STATE_SET = null;
        PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET = null;
        PRESSED_FOCUSED_SELECTED_STATE_SET = null;
        PRESSED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
        PRESSED_FOCUSED_STATE_SET = null;
        PRESSED_FOCUSED_WINDOW_FOCUSED_STATE_SET = null;
        PRESSED_SELECTED_STATE_SET = null;
        PRESSED_SELECTED_WINDOW_FOCUSED_STATE_SET = null;
        PRESSED_STATE_SET = null;
        PRESSED_WINDOW_FOCUSED_STATE_SET = null;
        ROTATION = null;
        ROTATION_X = null;
        ROTATION_Y = null;
        SCALE_X = null;
        SCALE_Y = null;
        SELECTED_STATE_SET = null;
        SELECTED_WINDOW_FOCUSED_STATE_SET = null;
        TRANSLATION_X = null;
        TRANSLATION_Y = null;
        TRANSLATION_Z = null;
        WINDOW_FOCUSED_STATE_SET = null;
        X = null;
        Y = null;
        Z = null;
    }
    
    public static class AccessibilityDelegate
    {
        public AccessibilityDelegate() {
            throw new RuntimeException("Stub!");
        }
        
        public void sendAccessibilityEvent(@NonNull final View host, final int eventType) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean performAccessibilityAction(@NonNull final View host, final int action, @Nullable final Bundle args) {
            throw new RuntimeException("Stub!");
        }
        
        public void sendAccessibilityEventUnchecked(@NonNull final View host, @NonNull final AccessibilityEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean dispatchPopulateAccessibilityEvent(@NonNull final View host, @NonNull final AccessibilityEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        public void onPopulateAccessibilityEvent(@NonNull final View host, @NonNull final AccessibilityEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        public void onInitializeAccessibilityEvent(@NonNull final View host, @NonNull final AccessibilityEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        public void onInitializeAccessibilityNodeInfo(@NonNull final View host, @NonNull final AccessibilityNodeInfo info) {
            throw new RuntimeException("Stub!");
        }
        
        public void addExtraDataToAccessibilityNodeInfo(@NonNull final View host, @NonNull final AccessibilityNodeInfo info, @NonNull final String extraDataKey, @Nullable final Bundle arguments) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean onRequestSendAccessibilityEvent(@NonNull final ViewGroup host, @NonNull final View child, @NonNull final AccessibilityEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public AccessibilityNodeProvider getAccessibilityNodeProvider(@NonNull final View host) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class BaseSavedState extends AbsSavedState
    {
        @NonNull
        public static final Parcelable.Creator<BaseSavedState> CREATOR;
        
        public BaseSavedState(final Parcel source) {
            super((Parcelable)null);
            throw new RuntimeException("Stub!");
        }
        
        public BaseSavedState(final Parcel source, final ClassLoader loader) {
            super((Parcelable)null);
            throw new RuntimeException("Stub!");
        }
        
        public BaseSavedState(final Parcelable superState) {
            super((Parcelable)null);
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel out, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
    
    public static class DragShadowBuilder
    {
        public DragShadowBuilder(final View view) {
            throw new RuntimeException("Stub!");
        }
        
        public DragShadowBuilder() {
            throw new RuntimeException("Stub!");
        }
        
        public final View getView() {
            throw new RuntimeException("Stub!");
        }
        
        public void onProvideShadowMetrics(final Point outShadowSize, final Point outShadowTouchPoint) {
            throw new RuntimeException("Stub!");
        }
        
        public void onDrawShadow(@NonNull final Canvas canvas) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class MeasureSpec
    {
        public static final int AT_MOST = Integer.MIN_VALUE;
        public static final int EXACTLY = 1073741824;
        public static final int UNSPECIFIED = 0;
        
        public MeasureSpec() {
            throw new RuntimeException("Stub!");
        }
        
        public static int makeMeasureSpec(final int size, final int mode) {
            throw new RuntimeException("Stub!");
        }
        
        public static int getMode(final int measureSpec) {
            throw new RuntimeException("Stub!");
        }
        
        public static int getSize(final int measureSpec) {
            throw new RuntimeException("Stub!");
        }
        
        public static String toString(final int measureSpec) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnLongClickListener
    {
        boolean onLongClick(final View p0);
        
        default boolean onLongClickUseDefaultHapticFeedback(@NonNull final View v) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnUnhandledKeyEventListener
    {
        boolean onUnhandledKeyEvent(final View p0, final KeyEvent p1);
    }
    
    public interface OnTouchListener
    {
        boolean onTouch(final View p0, final MotionEvent p1);
    }
    
    @Deprecated
    public interface OnSystemUiVisibilityChangeListener
    {
        @Deprecated
        void onSystemUiVisibilityChange(final int p0);
    }
    
    public interface OnScrollChangeListener
    {
        void onScrollChange(final View p0, final int p1, final int p2, final int p3, final int p4);
    }
    
    public interface OnLayoutChangeListener
    {
        void onLayoutChange(final View p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8);
    }
    
    public interface OnKeyListener
    {
        boolean onKey(final View p0, final int p1, final KeyEvent p2);
    }
    
    public interface OnHoverListener
    {
        boolean onHover(final View p0, final MotionEvent p1);
    }
    
    public interface OnGenericMotionListener
    {
        boolean onGenericMotion(final View p0, final MotionEvent p1);
    }
    
    public interface OnFocusChangeListener
    {
        void onFocusChange(final View p0, final boolean p1);
    }
    
    public interface OnDragListener
    {
        boolean onDrag(final View p0, final DragEvent p1);
    }
    
    public interface OnCreateContextMenuListener
    {
        void onCreateContextMenu(final ContextMenu p0, final View p1, final ContextMenu.ContextMenuInfo p2);
    }
    
    public interface OnContextClickListener
    {
        boolean onContextClick(final View p0);
    }
    
    public interface OnClickListener
    {
        void onClick(final View p0);
    }
    
    public interface OnCapturedPointerListener
    {
        boolean onCapturedPointer(final View p0, final MotionEvent p1);
    }
    
    public interface OnAttachStateChangeListener
    {
        void onViewAttachedToWindow(@NonNull final View p0);
        
        void onViewDetachedFromWindow(@NonNull final View p0);
    }
    
    public interface OnApplyWindowInsetsListener
    {
        @NonNull
        WindowInsets onApplyWindowInsets(@NonNull final View p0, @NonNull final WindowInsets p1);
    }
}
