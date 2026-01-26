package android.app;

import android.os.TestLooperManager;
import android.os.Looper;
import android.os.PersistableBundle;
import android.content.pm.ActivityInfo;
import android.os.IBinder;
import android.view.MotionEvent;
import android.view.KeyEvent;
import android.content.IntentFilter;
import android.content.Intent;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;

public class Instrumentation
{
    public static final String REPORT_KEY_IDENTIFIER = "id";
    public static final String REPORT_KEY_STREAMRESULT = "stream";
    
    public Instrumentation() {
        throw new RuntimeException("Stub!");
    }
    
    public void onCreate(final Bundle arguments) {
        throw new RuntimeException("Stub!");
    }
    
    public void start() {
        throw new RuntimeException("Stub!");
    }
    
    public void onStart() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onException(final Object obj, final Throwable e) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendStatus(final int resultCode, final Bundle results) {
        throw new RuntimeException("Stub!");
    }
    
    public void addResults(final Bundle results) {
        throw new RuntimeException("Stub!");
    }
    
    public void finish(final int resultCode, final Bundle results) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAutomaticPerformanceSnapshots() {
        throw new RuntimeException("Stub!");
    }
    
    public void startPerformanceSnapshot() {
        throw new RuntimeException("Stub!");
    }
    
    public void endPerformanceSnapshot() {
        throw new RuntimeException("Stub!");
    }
    
    public void onDestroy() {
        throw new RuntimeException("Stub!");
    }
    
    public Context getContext() {
        throw new RuntimeException("Stub!");
    }
    
    public ComponentName getComponentName() {
        throw new RuntimeException("Stub!");
    }
    
    public Context getTargetContext() {
        throw new RuntimeException("Stub!");
    }
    
    public String getProcessName() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isProfiling() {
        throw new RuntimeException("Stub!");
    }
    
    public void startProfiling() {
        throw new RuntimeException("Stub!");
    }
    
    public void stopProfiling() {
        throw new RuntimeException("Stub!");
    }
    
    public void setInTouchMode(final boolean inTouch) {
        throw new RuntimeException("Stub!");
    }
    
    public void resetInTouchMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void waitForIdle(final Runnable recipient) {
        throw new RuntimeException("Stub!");
    }
    
    public void waitForIdleSync() {
        throw new RuntimeException("Stub!");
    }
    
    public void runOnMainSync(final Runnable runner) {
        throw new RuntimeException("Stub!");
    }
    
    public Activity startActivitySync(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Activity startActivitySync(@NonNull final Intent intent, @Nullable final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    public void addMonitor(final ActivityMonitor monitor) {
        throw new RuntimeException("Stub!");
    }
    
    public ActivityMonitor addMonitor(final IntentFilter filter, final ActivityResult result, final boolean block) {
        throw new RuntimeException("Stub!");
    }
    
    public ActivityMonitor addMonitor(final String cls, final ActivityResult result, final boolean block) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean checkMonitorHit(final ActivityMonitor monitor, final int minHits) {
        throw new RuntimeException("Stub!");
    }
    
    public Activity waitForMonitor(final ActivityMonitor monitor) {
        throw new RuntimeException("Stub!");
    }
    
    public Activity waitForMonitorWithTimeout(final ActivityMonitor monitor, final long timeOut) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeMonitor(final ActivityMonitor monitor) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean invokeMenuActionSync(final Activity targetActivity, final int id, final int flag) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean invokeContextMenuAction(final Activity targetActivity, final int id, final int flag) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendStringSync(final String text) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendKeySync(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendKeyDownUpSync(final int keyCode) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendCharacterSync(final int keyCode) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendPointerSync(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendTrackballEventSync(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public Application newApplication(final ClassLoader cl, final String className, final Context context) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        throw new RuntimeException("Stub!");
    }
    
    public static Application newApplication(final Class<?> clazz, final Context context) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        throw new RuntimeException("Stub!");
    }
    
    public void callApplicationOnCreate(final Application app) {
        throw new RuntimeException("Stub!");
    }
    
    public Activity newActivity(final Class<?> clazz, final Context context, final IBinder token, final Application application, final Intent intent, final ActivityInfo info, final CharSequence title, final Activity parent, final String id, final Object lastNonConfigurationInstance) throws IllegalAccessException, InstantiationException {
        throw new RuntimeException("Stub!");
    }
    
    public Activity newActivity(final ClassLoader cl, final String className, final Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        throw new RuntimeException("Stub!");
    }
    
    public void callActivityOnCreate(final Activity activity, final Bundle icicle) {
        throw new RuntimeException("Stub!");
    }
    
    public void callActivityOnCreate(final Activity activity, final Bundle icicle, final PersistableBundle persistentState) {
        throw new RuntimeException("Stub!");
    }
    
    public void callActivityOnDestroy(final Activity activity) {
        throw new RuntimeException("Stub!");
    }
    
    public void callActivityOnRestoreInstanceState(@NonNull final Activity activity, @NonNull final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    public void callActivityOnRestoreInstanceState(@NonNull final Activity activity, @Nullable final Bundle savedInstanceState, @Nullable final PersistableBundle persistentState) {
        throw new RuntimeException("Stub!");
    }
    
    public void callActivityOnPostCreate(@NonNull final Activity activity, @Nullable final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    public void callActivityOnPostCreate(@NonNull final Activity activity, @Nullable final Bundle savedInstanceState, @Nullable final PersistableBundle persistentState) {
        throw new RuntimeException("Stub!");
    }
    
    public void callActivityOnNewIntent(final Activity activity, final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void callActivityOnNewIntent(@NonNull final Activity activity, @NonNull final Intent intent, @NonNull final ComponentCaller caller) {
        throw new RuntimeException("Stub!");
    }
    
    public void callActivityOnStart(final Activity activity) {
        throw new RuntimeException("Stub!");
    }
    
    public void callActivityOnRestart(final Activity activity) {
        throw new RuntimeException("Stub!");
    }
    
    public void callActivityOnResume(final Activity activity) {
        throw new RuntimeException("Stub!");
    }
    
    public void callActivityOnStop(final Activity activity) {
        throw new RuntimeException("Stub!");
    }
    
    public void callActivityOnSaveInstanceState(@NonNull final Activity activity, @NonNull final Bundle outState) {
        throw new RuntimeException("Stub!");
    }
    
    public void callActivityOnSaveInstanceState(@NonNull final Activity activity, @NonNull final Bundle outState, @NonNull final PersistableBundle outPersistentState) {
        throw new RuntimeException("Stub!");
    }
    
    public void callActivityOnPause(final Activity activity) {
        throw new RuntimeException("Stub!");
    }
    
    public void callActivityOnUserLeaving(final Activity activity) {
        throw new RuntimeException("Stub!");
    }
    
    public void callActivityOnPictureInPictureRequested(@NonNull final Activity activity) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void startAllocCounting() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void stopAllocCounting() {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle getAllocCounts() {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle getBinderCounts() {
        throw new RuntimeException("Stub!");
    }
    
    public UiAutomation getUiAutomation() {
        throw new RuntimeException("Stub!");
    }
    
    public UiAutomation getUiAutomation(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public TestLooperManager acquireLooperManager(final Looper looper) {
        throw new RuntimeException("Stub!");
    }
    
    public static class ActivityMonitor
    {
        public ActivityMonitor(final IntentFilter which, final ActivityResult result, final boolean block) {
            throw new RuntimeException("Stub!");
        }
        
        public ActivityMonitor(final String cls, final ActivityResult result, final boolean block) {
            throw new RuntimeException("Stub!");
        }
        
        public ActivityMonitor() {
            throw new RuntimeException("Stub!");
        }
        
        public final IntentFilter getFilter() {
            throw new RuntimeException("Stub!");
        }
        
        public final ActivityResult getResult() {
            throw new RuntimeException("Stub!");
        }
        
        public final boolean isBlocking() {
            throw new RuntimeException("Stub!");
        }
        
        public final int getHits() {
            throw new RuntimeException("Stub!");
        }
        
        public final Activity getLastActivity() {
            throw new RuntimeException("Stub!");
        }
        
        public final Activity waitForActivity() {
            throw new RuntimeException("Stub!");
        }
        
        public final Activity waitForActivityWithTimeout(final long timeOut) {
            throw new RuntimeException("Stub!");
        }
        
        public ActivityResult onStartActivity(final Intent intent) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ActivityResult
    {
        public ActivityResult(final int resultCode, final Intent resultData) {
            throw new RuntimeException("Stub!");
        }
        
        public int getResultCode() {
            throw new RuntimeException("Stub!");
        }
        
        public Intent getResultData() {
            throw new RuntimeException("Stub!");
        }
    }
}
