package android.app;

import java.util.concurrent.Executor;
import java.time.LocalTime;

public class UiModeManager
{
    public static String ACTION_ENTER_CAR_MODE;
    public static String ACTION_ENTER_DESK_MODE;
    public static String ACTION_EXIT_CAR_MODE;
    public static String ACTION_EXIT_DESK_MODE;
    public static final int DISABLE_CAR_MODE_GO_HOME = 1;
    public static final int ENABLE_CAR_MODE_ALLOW_SLEEP = 2;
    public static final int ENABLE_CAR_MODE_GO_CAR_HOME = 1;
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_CUSTOM = 3;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_YES = 2;
    
    UiModeManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void enableCarMode(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void disableCarMode(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public int getCurrentModeType() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNightMode(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setApplicationNightMode(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getNightMode() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LocalTime getCustomNightModeStart() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCustomNightModeStart(@NonNull final LocalTime time) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LocalTime getCustomNightModeEnd() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCustomNightModeEnd(@NonNull final LocalTime time) {
        throw new RuntimeException("Stub!");
    }
    
    public float getContrast() {
        throw new RuntimeException("Stub!");
    }
    
    public void addContrastChangeListener(@NonNull final Executor executor, @NonNull final ContrastChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeContrastChangeListener(@NonNull final ContrastChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        UiModeManager.ACTION_ENTER_CAR_MODE = "android.app.action.ENTER_CAR_MODE";
        UiModeManager.ACTION_ENTER_DESK_MODE = "android.app.action.ENTER_DESK_MODE";
        UiModeManager.ACTION_EXIT_CAR_MODE = "android.app.action.EXIT_CAR_MODE";
        UiModeManager.ACTION_EXIT_DESK_MODE = "android.app.action.EXIT_DESK_MODE";
    }
    
    public interface ContrastChangeListener
    {
        void onContrastChanged(final float p0);
    }
}
