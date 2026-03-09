package android.app;

import android.os.Bundle;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.content.Context;
import android.content.ComponentCallbacks2;
import android.content.ContextWrapper;

public class Application extends ContextWrapper implements ComponentCallbacks2
{
    public Application() {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void onCreate() {
        throw new RuntimeException("Stub!");
    }
    
    public void onTerminate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onConfigurationChanged(@NonNull final Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onLowMemory() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onTrimMemory(final int level) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void registerComponentCallbacks(final ComponentCallbacks callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void unregisterComponentCallbacks(final ComponentCallbacks callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerActivityLifecycleCallbacks(final ActivityLifecycleCallbacks callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterActivityLifecycleCallbacks(final ActivityLifecycleCallbacks callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerOnProvideAssistDataListener(final OnProvideAssistDataListener callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterOnProvideAssistDataListener(final OnProvideAssistDataListener callback) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getProcessName() {
        throw new RuntimeException("Stub!");
    }
    
    public interface ActivityLifecycleCallbacks
    {
        default void onActivityPreCreated(@NonNull final Activity activity, @Nullable final Bundle savedInstanceState) {
            throw new RuntimeException("Stub!");
        }
        
        void onActivityCreated(@NonNull final Activity p0, @Nullable final Bundle p1);
        
        default void onActivityPostCreated(@NonNull final Activity activity, @Nullable final Bundle savedInstanceState) {
            throw new RuntimeException("Stub!");
        }
        
        default void onActivityPreStarted(@NonNull final Activity activity) {
            throw new RuntimeException("Stub!");
        }
        
        void onActivityStarted(@NonNull final Activity p0);
        
        default void onActivityPostStarted(@NonNull final Activity activity) {
            throw new RuntimeException("Stub!");
        }
        
        default void onActivityPreResumed(@NonNull final Activity activity) {
            throw new RuntimeException("Stub!");
        }
        
        void onActivityResumed(@NonNull final Activity p0);
        
        default void onActivityPostResumed(@NonNull final Activity activity) {
            throw new RuntimeException("Stub!");
        }
        
        default void onActivityPrePaused(@NonNull final Activity activity) {
            throw new RuntimeException("Stub!");
        }
        
        void onActivityPaused(@NonNull final Activity p0);
        
        default void onActivityPostPaused(@NonNull final Activity activity) {
            throw new RuntimeException("Stub!");
        }
        
        default void onActivityPreStopped(@NonNull final Activity activity) {
            throw new RuntimeException("Stub!");
        }
        
        void onActivityStopped(@NonNull final Activity p0);
        
        default void onActivityPostStopped(@NonNull final Activity activity) {
            throw new RuntimeException("Stub!");
        }
        
        default void onActivityPreSaveInstanceState(@NonNull final Activity activity, @NonNull final Bundle outState) {
            throw new RuntimeException("Stub!");
        }
        
        void onActivitySaveInstanceState(@NonNull final Activity p0, @NonNull final Bundle p1);
        
        default void onActivityPostSaveInstanceState(@NonNull final Activity activity, @NonNull final Bundle outState) {
            throw new RuntimeException("Stub!");
        }
        
        default void onActivityPreDestroyed(@NonNull final Activity activity) {
            throw new RuntimeException("Stub!");
        }
        
        void onActivityDestroyed(@NonNull final Activity p0);
        
        default void onActivityPostDestroyed(@NonNull final Activity activity) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnProvideAssistDataListener
    {
        void onProvideAssistData(final Activity p0, final Bundle p1);
    }
}
