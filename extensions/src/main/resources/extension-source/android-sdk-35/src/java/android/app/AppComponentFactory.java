package android.app;

import android.content.ContentProvider;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.pm.ApplicationInfo;

public class AppComponentFactory
{
    public AppComponentFactory() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ClassLoader instantiateClassLoader(@NonNull final ClassLoader cl, @NonNull final ApplicationInfo aInfo) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Application instantiateApplication(@NonNull final ClassLoader cl, @NonNull final String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Activity instantiateActivity(@NonNull final ClassLoader cl, @NonNull final String className, @Nullable final Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public BroadcastReceiver instantiateReceiver(@NonNull final ClassLoader cl, @NonNull final String className, @Nullable final Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Service instantiateService(@NonNull final ClassLoader cl, @NonNull final String className, @Nullable final Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ContentProvider instantiateProvider(@NonNull final ClassLoader cl, @NonNull final String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        throw new RuntimeException("Stub!");
    }
}
