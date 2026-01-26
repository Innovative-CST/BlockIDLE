package android.app.sdksandbox;

import java.util.Set;
import android.os.IBinder;
import android.app.Activity;
import android.os.OutcomeReceiver;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Executor;

public final class SdkSandboxManager
{
    @Deprecated
    public static final String EXTRA_DISPLAY_ID = "android.app.sdksandbox.extra.DISPLAY_ID";
    @Deprecated
    public static final String EXTRA_HEIGHT_IN_PIXELS = "android.app.sdksandbox.extra.HEIGHT_IN_PIXELS";
    @Deprecated
    public static final String EXTRA_HOST_TOKEN = "android.app.sdksandbox.extra.HOST_TOKEN";
    @Deprecated
    public static final String EXTRA_SURFACE_PACKAGE = "android.app.sdksandbox.extra.SURFACE_PACKAGE";
    @Deprecated
    public static final String EXTRA_WIDTH_IN_PIXELS = "android.app.sdksandbox.extra.WIDTH_IN_PIXELS";
    public static final int LOAD_SDK_ALREADY_LOADED = 101;
    public static final int LOAD_SDK_INTERNAL_ERROR = 500;
    public static final int LOAD_SDK_NOT_FOUND = 100;
    public static final int LOAD_SDK_SDK_DEFINED_ERROR = 102;
    public static final int LOAD_SDK_SDK_SANDBOX_DISABLED = 103;
    public static final int REQUEST_SURFACE_PACKAGE_INTERNAL_ERROR = 700;
    public static final int REQUEST_SURFACE_PACKAGE_SDK_NOT_LOADED = 701;
    public static final int SDK_SANDBOX_PROCESS_NOT_AVAILABLE = 503;
    public static final String SDK_SANDBOX_SERVICE = "sdk_sandbox";
    public static final int SDK_SANDBOX_STATE_DISABLED = 0;
    public static final int SDK_SANDBOX_STATE_ENABLED_PROCESS_ISOLATION = 2;
    
    SdkSandboxManager() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getSdkSandboxState() {
        throw new RuntimeException("Stub!");
    }
    
    public void addSdkSandboxProcessDeathCallback(@NonNull final Executor callbackExecutor, @NonNull final SdkSandboxProcessDeathCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeSdkSandboxProcessDeathCallback(@NonNull final SdkSandboxProcessDeathCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerAppOwnedSdkSandboxInterface(@NonNull final AppOwnedSdkSandboxInterface appOwnedSdkSandboxInterface) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterAppOwnedSdkSandboxInterface(@NonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AppOwnedSdkSandboxInterface> getAppOwnedSdkSandboxInterfaces() {
        throw new RuntimeException("Stub!");
    }
    
    public void loadSdk(@NonNull final String sdkName, @NonNull final Bundle params, @NonNull final Executor executor, @NonNull final OutcomeReceiver<SandboxedSdk, LoadSdkException> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<SandboxedSdk> getSandboxedSdks() {
        throw new RuntimeException("Stub!");
    }
    
    public void unloadSdk(@NonNull final String sdkName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void requestSurfacePackage(@NonNull final String sdkName, @NonNull final Bundle params, @NonNull final Executor callbackExecutor, @NonNull final OutcomeReceiver<Bundle, RequestSurfacePackageException> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void startSdkSandboxActivity(@NonNull final Activity fromActivity, @NonNull final IBinder sdkActivityToken) {
        throw new RuntimeException("Stub!");
    }
    
    public void addSyncedSharedPreferencesKeys(@NonNull final Set<String> keys) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeSyncedSharedPreferencesKeys(@NonNull final Set<String> keys) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getSyncedSharedPreferencesKeys() {
        throw new RuntimeException("Stub!");
    }
    
    public interface SdkSandboxProcessDeathCallback
    {
        void onSdkSandboxDied();
    }
}
