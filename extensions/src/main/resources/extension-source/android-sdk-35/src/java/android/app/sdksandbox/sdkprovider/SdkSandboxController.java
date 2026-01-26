package android.app.sdksandbox.sdkprovider;

import android.os.IBinder;
import android.content.SharedPreferences;
import android.app.sdksandbox.LoadSdkException;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;
import android.os.Bundle;
import android.app.sdksandbox.SandboxedSdk;
import android.app.sdksandbox.AppOwnedSdkSandboxInterface;
import java.util.List;

public class SdkSandboxController
{
    public static final String SDK_SANDBOX_CONTROLLER_SERVICE = "sdk_sandbox_controller_service";
    
    SdkSandboxController() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AppOwnedSdkSandboxInterface> getAppOwnedSdkSandboxInterfaces() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<SandboxedSdk> getSandboxedSdks() {
        throw new RuntimeException("Stub!");
    }
    
    public void loadSdk(@NonNull final String sdkName, @NonNull final Bundle params, @NonNull final Executor executor, @NonNull final OutcomeReceiver<SandboxedSdk, LoadSdkException> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SharedPreferences getClientSharedPreferences() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public IBinder registerSdkSandboxActivityHandler(@NonNull final SdkSandboxActivityHandler sdkSandboxActivityHandler) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public void unregisterSdkSandboxActivityHandler(@NonNull final SdkSandboxActivityHandler sdkSandboxActivityHandler) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getClientPackageName() {
        throw new RuntimeException("Stub!");
    }
}
