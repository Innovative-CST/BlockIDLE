package android.view.accessibility;

import android.os.Parcel;
import android.os.Parcelable;

public final class AccessibilityEvent extends AccessibilityRecord implements Parcelable
{
    public static final int CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION = 4;
    public static final int CONTENT_CHANGE_TYPE_CONTENT_INVALID = 1024;
    public static final int CONTENT_CHANGE_TYPE_DRAG_CANCELLED = 512;
    public static final int CONTENT_CHANGE_TYPE_DRAG_DROPPED = 256;
    public static final int CONTENT_CHANGE_TYPE_DRAG_STARTED = 128;
    public static final int CONTENT_CHANGE_TYPE_ENABLED = 4096;
    public static final int CONTENT_CHANGE_TYPE_ERROR = 2048;
    public static final int CONTENT_CHANGE_TYPE_PANE_APPEARED = 16;
    public static final int CONTENT_CHANGE_TYPE_PANE_DISAPPEARED = 32;
    public static final int CONTENT_CHANGE_TYPE_PANE_TITLE = 8;
    public static final int CONTENT_CHANGE_TYPE_STATE_DESCRIPTION = 64;
    public static final int CONTENT_CHANGE_TYPE_SUBTREE = 1;
    public static final int CONTENT_CHANGE_TYPE_TEXT = 2;
    public static final int CONTENT_CHANGE_TYPE_UNDEFINED = 0;
    @NonNull
    public static final Creator<AccessibilityEvent> CREATOR;
    public static final int INVALID_POSITION = -1;
    @Deprecated
    public static final int MAX_TEXT_LENGTH = 500;
    public static final int SPEECH_STATE_LISTENING_END = 8;
    public static final int SPEECH_STATE_LISTENING_START = 4;
    public static final int SPEECH_STATE_SPEAKING_END = 2;
    public static final int SPEECH_STATE_SPEAKING_START = 1;
    public static final int TYPES_ALL_MASK = -1;
    public static final int TYPE_ANNOUNCEMENT = 16384;
    public static final int TYPE_ASSIST_READING_CONTEXT = 16777216;
    public static final int TYPE_GESTURE_DETECTION_END = 524288;
    public static final int TYPE_GESTURE_DETECTION_START = 262144;
    public static final int TYPE_NOTIFICATION_STATE_CHANGED = 64;
    public static final int TYPE_SPEECH_STATE_CHANGE = 33554432;
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_END = 1024;
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_START = 512;
    public static final int TYPE_TOUCH_INTERACTION_END = 2097152;
    public static final int TYPE_TOUCH_INTERACTION_START = 1048576;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUSED = 32768;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED = 65536;
    public static final int TYPE_VIEW_CLICKED = 1;
    public static final int TYPE_VIEW_CONTEXT_CLICKED = 8388608;
    public static final int TYPE_VIEW_FOCUSED = 8;
    public static final int TYPE_VIEW_HOVER_ENTER = 128;
    public static final int TYPE_VIEW_HOVER_EXIT = 256;
    public static final int TYPE_VIEW_LONG_CLICKED = 2;
    public static final int TYPE_VIEW_SCROLLED = 4096;
    public static final int TYPE_VIEW_SELECTED = 4;
    public static final int TYPE_VIEW_TARGETED_BY_SCROLL = 67108864;
    public static final int TYPE_VIEW_TEXT_CHANGED = 16;
    public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED = 8192;
    public static final int TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY = 131072;
    public static final int TYPE_WINDOWS_CHANGED = 4194304;
    public static final int TYPE_WINDOW_CONTENT_CHANGED = 2048;
    public static final int TYPE_WINDOW_STATE_CHANGED = 32;
    public static final int WINDOWS_CHANGE_ACCESSIBILITY_FOCUSED = 128;
    public static final int WINDOWS_CHANGE_ACTIVE = 32;
    public static final int WINDOWS_CHANGE_ADDED = 1;
    public static final int WINDOWS_CHANGE_BOUNDS = 8;
    public static final int WINDOWS_CHANGE_CHILDREN = 512;
    public static final int WINDOWS_CHANGE_FOCUSED = 64;
    public static final int WINDOWS_CHANGE_LAYER = 16;
    public static final int WINDOWS_CHANGE_PARENT = 256;
    public static final int WINDOWS_CHANGE_PIP = 1024;
    public static final int WINDOWS_CHANGE_REMOVED = 2;
    public static final int WINDOWS_CHANGE_TITLE = 4;
    
    public AccessibilityEvent() {
        throw new RuntimeException("Stub!");
    }
    
    public AccessibilityEvent(final int eventType) {
        throw new RuntimeException("Stub!");
    }
    
    public AccessibilityEvent(@NonNull final AccessibilityEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRecordCount() {
        throw new RuntimeException("Stub!");
    }
    
    public void appendRecord(final AccessibilityRecord record) {
        throw new RuntimeException("Stub!");
    }
    
    public AccessibilityRecord getRecord(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public int getEventType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getContentChangeTypes() {
        throw new RuntimeException("Stub!");
    }
    
    public void setContentChangeTypes(final int changeTypes) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAccessibilityDataSensitive() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAccessibilityDataSensitive(final boolean accessibilityDataSensitive) {
        throw new RuntimeException("Stub!");
    }
    
    public int getSpeechStateChangeTypes() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSpeechStateChangeTypes(final int state) {
        throw new RuntimeException("Stub!");
    }
    
    public int getWindowChanges() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEventType(final int eventType) {
        throw new RuntimeException("Stub!");
    }
    
    public long getEventTime() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEventTime(final long eventTime) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPackageName(final CharSequence packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMovementGranularity(final int granularity) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMovementGranularity() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAction(final int action) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAction() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static AccessibilityEvent obtain(final int eventType) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static AccessibilityEvent obtain(final AccessibilityEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static AccessibilityEvent obtain() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void recycle() {
        throw new RuntimeException("Stub!");
    }
    
    public void initFromParcel(final Parcel parcel) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static String eventTypeToString(final int eventType) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
