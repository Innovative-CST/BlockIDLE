package android.service.controls;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import android.content.Intent;
import java.util.function.Consumer;
import android.service.controls.actions.ControlAction;
import java.util.List;
import java.util.concurrent.Flow;
import android.app.Service;

public abstract class ControlsProviderService extends Service
{
    public static final int CONTROLS_SURFACE_ACTIVITY_PANEL = 0;
    public static final int CONTROLS_SURFACE_DREAM = 1;
    public static final String EXTRA_CONTROLS_SURFACE = "android.service.controls.extra.CONTROLS_SURFACE";
    public static final String EXTRA_LOCKSCREEN_ALLOW_TRIVIAL_CONTROLS = "android.service.controls.extra.LOCKSCREEN_ALLOW_TRIVIAL_CONTROLS";
    public static final String META_DATA_PANEL_ACTIVITY = "android.service.controls.META_DATA_PANEL_ACTIVITY";
    public static final String SERVICE_CONTROLS = "android.service.controls.ControlsProviderService";
    @NonNull
    public static final String TAG = "ControlsProviderService";
    
    public ControlsProviderService() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract Flow.Publisher<Control> createPublisherForAllAvailable();
    
    @Nullable
    public Flow.Publisher<Control> createPublisherForSuggested() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract Flow.Publisher<Control> createPublisherFor(@NonNull final List<String> p0);
    
    public abstract void performControlAction(@NonNull final String p0, @NonNull final ControlAction p1, @NonNull final Consumer<Integer> p2);
    
    @NonNull
    @Override
    public final IBinder onBind(@NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final boolean onUnbind(@NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public static void requestAddControl(@NonNull final Context context, @NonNull final ComponentName componentName, @NonNull final Control control) {
        throw new RuntimeException("Stub!");
    }
}
