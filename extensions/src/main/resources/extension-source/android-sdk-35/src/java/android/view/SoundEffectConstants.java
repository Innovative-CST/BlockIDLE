package android.view;

public class SoundEffectConstants
{
    public static final int CLICK = 0;
    public static final int NAVIGATION_DOWN = 4;
    public static final int NAVIGATION_LEFT = 1;
    public static final int NAVIGATION_REPEAT_DOWN = 8;
    public static final int NAVIGATION_REPEAT_LEFT = 5;
    public static final int NAVIGATION_REPEAT_RIGHT = 7;
    public static final int NAVIGATION_REPEAT_UP = 6;
    public static final int NAVIGATION_RIGHT = 3;
    public static final int NAVIGATION_UP = 2;
    
    SoundEffectConstants() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getContantForFocusDirection(final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getConstantForFocusDirection(final int direction, final boolean repeating) {
        throw new RuntimeException("Stub!");
    }
}
