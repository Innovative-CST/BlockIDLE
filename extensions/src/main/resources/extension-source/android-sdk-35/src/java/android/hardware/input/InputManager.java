package android.hardware.input;

import android.view.Display;
import android.view.VerifiedInputEvent;
import android.view.InputEvent;
import android.os.Handler;
import android.view.InputDevice;

public final class InputManager
{
    public static final String ACTION_QUERY_KEYBOARD_LAYOUTS = "android.hardware.input.action.QUERY_KEYBOARD_LAYOUTS";
    public static final String META_DATA_KEYBOARD_LAYOUTS = "android.hardware.input.metadata.KEYBOARD_LAYOUTS";
    
    InputManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public InputDevice getInputDevice(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public InputDevice.ViewBehavior getInputDeviceViewBehavior(final int deviceId) {
        throw new RuntimeException("Stub!");
    }
    
    public int[] getInputDeviceIds() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerInputDeviceListener(final InputDeviceListener listener, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterInputDeviceListener(final InputDeviceListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public float getMaximumObscuringOpacityForTouch() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public VerifiedInputEvent verifyInputEvent(@NonNull final InputEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isStylusPointerIconEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public HostUsiVersion getHostUsiVersion(@NonNull final Display display) {
        throw new RuntimeException("Stub!");
    }
    
    public interface InputDeviceListener
    {
        void onInputDeviceAdded(final int p0);
        
        void onInputDeviceRemoved(final int p0);
        
        void onInputDeviceChanged(final int p0);
    }
}
