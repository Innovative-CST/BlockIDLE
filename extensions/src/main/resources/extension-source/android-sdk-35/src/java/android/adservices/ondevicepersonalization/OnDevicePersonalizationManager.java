package android.adservices.ondevicepersonalization;

import android.view.SurfaceControlViewHost;
import android.os.IBinder;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;
import android.os.PersistableBundle;
import android.content.ComponentName;

public class OnDevicePersonalizationManager
{
    OnDevicePersonalizationManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void execute(@NonNull final ComponentName service, @NonNull final PersistableBundle params, @NonNull final Executor executor, @NonNull final OutcomeReceiver<ExecuteResult, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestSurfacePackage(@NonNull final SurfacePackageToken surfacePackageToken, @NonNull final IBinder surfaceViewHostToken, final int displayId, final int width, final int height, @NonNull final Executor executor, @NonNull final OutcomeReceiver<SurfaceControlViewHost.SurfacePackage, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public static class ExecuteResult
    {
        ExecuteResult() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public SurfacePackageToken getSurfacePackageToken() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public byte[] getOutputData() {
            throw new RuntimeException("Stub!");
        }
    }
}
