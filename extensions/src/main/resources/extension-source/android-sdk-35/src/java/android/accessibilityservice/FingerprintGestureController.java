package android.accessibilityservice;

import android.os.Handler;

public final class FingerprintGestureController
{
    public static final int FINGERPRINT_GESTURE_SWIPE_DOWN = 8;
    public static final int FINGERPRINT_GESTURE_SWIPE_LEFT = 2;
    public static final int FINGERPRINT_GESTURE_SWIPE_RIGHT = 1;
    public static final int FINGERPRINT_GESTURE_SWIPE_UP = 4;
    
    FingerprintGestureController() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isGestureDetectionAvailable() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerFingerprintGestureCallback(@NonNull final FingerprintGestureCallback callback, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterFingerprintGestureCallback(final FingerprintGestureCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class FingerprintGestureCallback
    {
        public FingerprintGestureCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onGestureDetectionAvailabilityChanged(final boolean available) {
            throw new RuntimeException("Stub!");
        }
        
        public void onGestureDetected(final int gesture) {
            throw new RuntimeException("Stub!");
        }
    }
}
