package android.view;

import android.os.Parcel;
import android.hardware.SensorManager;
import android.hardware.lights.LightsManager;
import android.hardware.BatteryState;
import android.os.VibratorManager;
import android.os.Vibrator;
import java.util.List;
import android.os.Parcelable;

public final class InputDevice implements Parcelable
{
    @NonNull
    public static final Creator<InputDevice> CREATOR;
    public static final int KEYBOARD_TYPE_ALPHABETIC = 2;
    public static final int KEYBOARD_TYPE_NONE = 0;
    public static final int KEYBOARD_TYPE_NON_ALPHABETIC = 1;
    @Deprecated
    public static final int MOTION_RANGE_ORIENTATION = 8;
    @Deprecated
    public static final int MOTION_RANGE_PRESSURE = 2;
    @Deprecated
    public static final int MOTION_RANGE_SIZE = 3;
    @Deprecated
    public static final int MOTION_RANGE_TOOL_MAJOR = 6;
    @Deprecated
    public static final int MOTION_RANGE_TOOL_MINOR = 7;
    @Deprecated
    public static final int MOTION_RANGE_TOUCH_MAJOR = 4;
    @Deprecated
    public static final int MOTION_RANGE_TOUCH_MINOR = 5;
    @Deprecated
    public static final int MOTION_RANGE_X = 0;
    @Deprecated
    public static final int MOTION_RANGE_Y = 1;
    public static final int SOURCE_ANY = -256;
    public static final int SOURCE_BLUETOOTH_STYLUS = 49154;
    public static final int SOURCE_CLASS_BUTTON = 1;
    public static final int SOURCE_CLASS_JOYSTICK = 16;
    public static final int SOURCE_CLASS_MASK = 255;
    public static final int SOURCE_CLASS_NONE = 0;
    public static final int SOURCE_CLASS_POINTER = 2;
    public static final int SOURCE_CLASS_POSITION = 8;
    public static final int SOURCE_CLASS_TRACKBALL = 4;
    public static final int SOURCE_DPAD = 513;
    public static final int SOURCE_GAMEPAD = 1025;
    public static final int SOURCE_HDMI = 33554433;
    public static final int SOURCE_JOYSTICK = 16777232;
    public static final int SOURCE_KEYBOARD = 257;
    public static final int SOURCE_MOUSE = 8194;
    public static final int SOURCE_MOUSE_RELATIVE = 131076;
    public static final int SOURCE_ROTARY_ENCODER = 4194304;
    public static final int SOURCE_SENSOR = 67108864;
    public static final int SOURCE_STYLUS = 16386;
    public static final int SOURCE_TOUCHPAD = 1048584;
    public static final int SOURCE_TOUCHSCREEN = 4098;
    public static final int SOURCE_TOUCH_NAVIGATION = 2097152;
    public static final int SOURCE_TRACKBALL = 65540;
    public static final int SOURCE_UNKNOWN = 0;
    
    InputDevice() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static InputDevice getDevice(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    public static int[] getDeviceIds() {
        throw new RuntimeException("Stub!");
    }
    
    public int getId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getControllerNumber() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVendorId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getProductId() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDescriptor() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isVirtual() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isExternal() {
        throw new RuntimeException("Stub!");
    }
    
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSources() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean supportsSource(final int source) {
        throw new RuntimeException("Stub!");
    }
    
    public int getKeyboardType() {
        throw new RuntimeException("Stub!");
    }
    
    public KeyCharacterMap getKeyCharacterMap() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean[] hasKeys(final int... keys) {
        throw new RuntimeException("Stub!");
    }
    
    public int getKeyCodeForKeyLocation(final int locationKeyCode) {
        throw new RuntimeException("Stub!");
    }
    
    public MotionRange getMotionRange(final int axis) {
        throw new RuntimeException("Stub!");
    }
    
    public MotionRange getMotionRange(final int axis, final int source) {
        throw new RuntimeException("Stub!");
    }
    
    public List<MotionRange> getMotionRanges() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Vibrator getVibrator() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public VibratorManager getVibratorManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public BatteryState getBatteryState() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LightsManager getLightsManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SensorManager getSensorManager() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasMicrophone() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
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
    
    static {
        CREATOR = null;
    }
    
    public static final class MotionRange
    {
        MotionRange() {
            throw new RuntimeException("Stub!");
        }
        
        public int getAxis() {
            throw new RuntimeException("Stub!");
        }
        
        public int getSource() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isFromSource(final int source) {
            throw new RuntimeException("Stub!");
        }
        
        public float getMin() {
            throw new RuntimeException("Stub!");
        }
        
        public float getMax() {
            throw new RuntimeException("Stub!");
        }
        
        public float getRange() {
            throw new RuntimeException("Stub!");
        }
        
        public float getFlat() {
            throw new RuntimeException("Stub!");
        }
        
        public float getFuzz() {
            throw new RuntimeException("Stub!");
        }
        
        public float getResolution() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ViewBehavior
    {
        ViewBehavior() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean shouldSmoothScroll(final int axis, final int source) {
            throw new RuntimeException("Stub!");
        }
    }
}
