package android.view;

import android.os.Parcel;
import android.graphics.Matrix;
import android.os.Parcelable;

public final class MotionEvent extends InputEvent implements Parcelable
{
    public static final int ACTION_BUTTON_PRESS = 11;
    public static final int ACTION_BUTTON_RELEASE = 12;
    public static final int ACTION_CANCEL = 3;
    public static final int ACTION_DOWN = 0;
    public static final int ACTION_HOVER_ENTER = 9;
    public static final int ACTION_HOVER_EXIT = 10;
    public static final int ACTION_HOVER_MOVE = 7;
    public static final int ACTION_MASK = 255;
    public static final int ACTION_MOVE = 2;
    public static final int ACTION_OUTSIDE = 4;
    @Deprecated
    public static final int ACTION_POINTER_1_DOWN = 5;
    @Deprecated
    public static final int ACTION_POINTER_1_UP = 6;
    @Deprecated
    public static final int ACTION_POINTER_2_DOWN = 261;
    @Deprecated
    public static final int ACTION_POINTER_2_UP = 262;
    @Deprecated
    public static final int ACTION_POINTER_3_DOWN = 517;
    @Deprecated
    public static final int ACTION_POINTER_3_UP = 518;
    public static final int ACTION_POINTER_DOWN = 5;
    @Deprecated
    public static final int ACTION_POINTER_ID_MASK = 65280;
    @Deprecated
    public static final int ACTION_POINTER_ID_SHIFT = 8;
    public static final int ACTION_POINTER_INDEX_MASK = 65280;
    public static final int ACTION_POINTER_INDEX_SHIFT = 8;
    public static final int ACTION_POINTER_UP = 6;
    public static final int ACTION_SCROLL = 8;
    public static final int ACTION_UP = 1;
    public static final int AXIS_BRAKE = 23;
    public static final int AXIS_DISTANCE = 24;
    public static final int AXIS_GAS = 22;
    public static final int AXIS_GENERIC_1 = 32;
    public static final int AXIS_GENERIC_10 = 41;
    public static final int AXIS_GENERIC_11 = 42;
    public static final int AXIS_GENERIC_12 = 43;
    public static final int AXIS_GENERIC_13 = 44;
    public static final int AXIS_GENERIC_14 = 45;
    public static final int AXIS_GENERIC_15 = 46;
    public static final int AXIS_GENERIC_16 = 47;
    public static final int AXIS_GENERIC_2 = 33;
    public static final int AXIS_GENERIC_3 = 34;
    public static final int AXIS_GENERIC_4 = 35;
    public static final int AXIS_GENERIC_5 = 36;
    public static final int AXIS_GENERIC_6 = 37;
    public static final int AXIS_GENERIC_7 = 38;
    public static final int AXIS_GENERIC_8 = 39;
    public static final int AXIS_GENERIC_9 = 40;
    public static final int AXIS_GESTURE_PINCH_SCALE_FACTOR = 52;
    public static final int AXIS_GESTURE_SCROLL_X_DISTANCE = 50;
    public static final int AXIS_GESTURE_SCROLL_Y_DISTANCE = 51;
    public static final int AXIS_GESTURE_X_OFFSET = 48;
    public static final int AXIS_GESTURE_Y_OFFSET = 49;
    public static final int AXIS_HAT_X = 15;
    public static final int AXIS_HAT_Y = 16;
    public static final int AXIS_HSCROLL = 10;
    public static final int AXIS_LTRIGGER = 17;
    public static final int AXIS_ORIENTATION = 8;
    public static final int AXIS_PRESSURE = 2;
    public static final int AXIS_RELATIVE_X = 27;
    public static final int AXIS_RELATIVE_Y = 28;
    public static final int AXIS_RTRIGGER = 18;
    public static final int AXIS_RUDDER = 20;
    public static final int AXIS_RX = 12;
    public static final int AXIS_RY = 13;
    public static final int AXIS_RZ = 14;
    public static final int AXIS_SCROLL = 26;
    public static final int AXIS_SIZE = 3;
    public static final int AXIS_THROTTLE = 19;
    public static final int AXIS_TILT = 25;
    public static final int AXIS_TOOL_MAJOR = 6;
    public static final int AXIS_TOOL_MINOR = 7;
    public static final int AXIS_TOUCH_MAJOR = 4;
    public static final int AXIS_TOUCH_MINOR = 5;
    public static final int AXIS_VSCROLL = 9;
    public static final int AXIS_WHEEL = 21;
    public static final int AXIS_X = 0;
    public static final int AXIS_Y = 1;
    public static final int AXIS_Z = 11;
    public static final int BUTTON_BACK = 8;
    public static final int BUTTON_FORWARD = 16;
    public static final int BUTTON_PRIMARY = 1;
    public static final int BUTTON_SECONDARY = 2;
    public static final int BUTTON_STYLUS_PRIMARY = 32;
    public static final int BUTTON_STYLUS_SECONDARY = 64;
    public static final int BUTTON_TERTIARY = 4;
    public static final int CLASSIFICATION_AMBIGUOUS_GESTURE = 1;
    public static final int CLASSIFICATION_DEEP_PRESS = 2;
    public static final int CLASSIFICATION_NONE = 0;
    public static final int CLASSIFICATION_PINCH = 5;
    public static final int CLASSIFICATION_TWO_FINGER_SWIPE = 3;
    @NonNull
    public static final Creator<MotionEvent> CREATOR;
    public static final int EDGE_BOTTOM = 2;
    public static final int EDGE_LEFT = 4;
    public static final int EDGE_RIGHT = 8;
    public static final int EDGE_TOP = 1;
    public static final int FLAG_CANCELED = 32;
    public static final int FLAG_WINDOW_IS_OBSCURED = 1;
    public static final int FLAG_WINDOW_IS_PARTIALLY_OBSCURED = 2;
    public static final int INVALID_POINTER_ID = -1;
    public static final int TOOL_TYPE_ERASER = 4;
    public static final int TOOL_TYPE_FINGER = 1;
    public static final int TOOL_TYPE_MOUSE = 3;
    public static final int TOOL_TYPE_STYLUS = 2;
    public static final int TOOL_TYPE_UNKNOWN = 0;
    
    MotionEvent() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static MotionEvent obtain(final long downTime, final long eventTime, final int action, final int pointerCount, @NonNull final PointerProperties[] pointerProperties, @NonNull final PointerCoords[] pointerCoords, final int metaState, final int buttonState, final float xPrecision, final float yPrecision, final int deviceId, final int edgeFlags, final int source, final int displayId, final int flags, final int classification) {
        throw new RuntimeException("Stub!");
    }
    
    public static MotionEvent obtain(final long downTime, final long eventTime, final int action, final int pointerCount, final PointerProperties[] pointerProperties, final PointerCoords[] pointerCoords, final int metaState, final int buttonState, final float xPrecision, final float yPrecision, final int deviceId, final int edgeFlags, final int source, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static MotionEvent obtain(final long downTime, final long eventTime, final int action, final int pointerCount, final int[] pointerIds, final PointerCoords[] pointerCoords, final int metaState, final float xPrecision, final float yPrecision, final int deviceId, final int edgeFlags, final int source, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static MotionEvent obtain(final long downTime, final long eventTime, final int action, final float x, final float y, final float pressure, final float size, final int metaState, final float xPrecision, final float yPrecision, final int deviceId, final int edgeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static MotionEvent obtain(final long downTime, final long eventTime, final int action, final int pointerCount, final float x, final float y, final float pressure, final float size, final int metaState, final float xPrecision, final float yPrecision, final int deviceId, final int edgeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public static MotionEvent obtain(final long downTime, final long eventTime, final int action, final float x, final float y, final int metaState) {
        throw new RuntimeException("Stub!");
    }
    
    public static MotionEvent obtain(final MotionEvent other) {
        throw new RuntimeException("Stub!");
    }
    
    public static MotionEvent obtainNoHistory(final MotionEvent other) {
        throw new RuntimeException("Stub!");
    }
    
    public void recycle() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getDeviceId() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getSource() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSource(final int source) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAction() {
        throw new RuntimeException("Stub!");
    }
    
    public int getActionMasked() {
        throw new RuntimeException("Stub!");
    }
    
    public int getActionIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFlags() {
        throw new RuntimeException("Stub!");
    }
    
    public long getDownTime() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getEventTime() {
        throw new RuntimeException("Stub!");
    }
    
    public long getEventTimeNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public float getX() {
        throw new RuntimeException("Stub!");
    }
    
    public float getY() {
        throw new RuntimeException("Stub!");
    }
    
    public float getPressure() {
        throw new RuntimeException("Stub!");
    }
    
    public float getSize() {
        throw new RuntimeException("Stub!");
    }
    
    public float getTouchMajor() {
        throw new RuntimeException("Stub!");
    }
    
    public float getTouchMinor() {
        throw new RuntimeException("Stub!");
    }
    
    public float getToolMajor() {
        throw new RuntimeException("Stub!");
    }
    
    public float getToolMinor() {
        throw new RuntimeException("Stub!");
    }
    
    public float getOrientation() {
        throw new RuntimeException("Stub!");
    }
    
    public float getAxisValue(final int axis) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPointerCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPointerId(final int pointerIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public int getToolType(final int pointerIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public int findPointerIndex(final int pointerId) {
        throw new RuntimeException("Stub!");
    }
    
    public float getX(final int pointerIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public float getY(final int pointerIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public float getPressure(final int pointerIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public float getSize(final int pointerIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public float getTouchMajor(final int pointerIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public float getTouchMinor(final int pointerIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public float getToolMajor(final int pointerIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public float getToolMinor(final int pointerIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public float getOrientation(final int pointerIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public float getAxisValue(final int axis, final int pointerIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public void getPointerCoords(final int pointerIndex, final PointerCoords outPointerCoords) {
        throw new RuntimeException("Stub!");
    }
    
    public void getPointerProperties(final int pointerIndex, final PointerProperties outPointerProperties) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMetaState() {
        throw new RuntimeException("Stub!");
    }
    
    public int getButtonState() {
        throw new RuntimeException("Stub!");
    }
    
    public int getClassification() {
        throw new RuntimeException("Stub!");
    }
    
    public int getActionButton() {
        throw new RuntimeException("Stub!");
    }
    
    public float getRawX() {
        throw new RuntimeException("Stub!");
    }
    
    public float getRawY() {
        throw new RuntimeException("Stub!");
    }
    
    public float getRawX(final int pointerIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public float getRawY(final int pointerIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public float getXPrecision() {
        throw new RuntimeException("Stub!");
    }
    
    public float getYPrecision() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHistorySize() {
        throw new RuntimeException("Stub!");
    }
    
    public long getHistoricalEventTime(final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public long getHistoricalEventTimeNanos(final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalX(final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalY(final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalPressure(final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalSize(final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalTouchMajor(final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalTouchMinor(final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalToolMajor(final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalToolMinor(final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalOrientation(final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalAxisValue(final int axis, final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalX(final int pointerIndex, final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalY(final int pointerIndex, final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalPressure(final int pointerIndex, final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalSize(final int pointerIndex, final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalTouchMajor(final int pointerIndex, final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalTouchMinor(final int pointerIndex, final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalToolMajor(final int pointerIndex, final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalToolMinor(final int pointerIndex, final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalOrientation(final int pointerIndex, final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHistoricalAxisValue(final int axis, final int pointerIndex, final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public void getHistoricalPointerCoords(final int pointerIndex, final int pos, final PointerCoords outPointerCoords) {
        throw new RuntimeException("Stub!");
    }
    
    public int getEdgeFlags() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEdgeFlags(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAction(final int action) {
        throw new RuntimeException("Stub!");
    }
    
    public void offsetLocation(final float deltaX, final float deltaY) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLocation(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public void transform(final Matrix matrix) {
        throw new RuntimeException("Stub!");
    }
    
    public void addBatch(final long eventTime, final float x, final float y, final float pressure, final float size, final int metaState) {
        throw new RuntimeException("Stub!");
    }
    
    public void addBatch(final long eventTime, final PointerCoords[] pointerCoords, final int metaState) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static String actionToString(final int action) {
        throw new RuntimeException("Stub!");
    }
    
    public static String axisToString(final int axis) {
        throw new RuntimeException("Stub!");
    }
    
    public static int axisFromString(final String symbolicName) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isButtonPressed(final int button) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class PointerCoords
    {
        public float orientation;
        public float pressure;
        public float size;
        public float toolMajor;
        public float toolMinor;
        public float touchMajor;
        public float touchMinor;
        public float x;
        public float y;
        
        public PointerCoords() {
            throw new RuntimeException("Stub!");
        }
        
        public PointerCoords(final PointerCoords other) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isResampled() {
            throw new RuntimeException("Stub!");
        }
        
        public void clear() {
            throw new RuntimeException("Stub!");
        }
        
        public void copyFrom(final PointerCoords other) {
            throw new RuntimeException("Stub!");
        }
        
        public float getAxisValue(final int axis) {
            throw new RuntimeException("Stub!");
        }
        
        public void setAxisValue(final int axis, final float value) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class PointerProperties
    {
        public int id;
        public int toolType;
        
        public PointerProperties() {
            throw new RuntimeException("Stub!");
        }
        
        public PointerProperties(final PointerProperties other) {
            throw new RuntimeException("Stub!");
        }
        
        public void clear() {
            throw new RuntimeException("Stub!");
        }
        
        public void copyFrom(final PointerProperties other) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
    }
}
