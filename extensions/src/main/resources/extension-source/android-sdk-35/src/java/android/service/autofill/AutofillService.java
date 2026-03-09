package android.service.autofill;

import android.os.CancellationSignal;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class AutofillService extends Service
{
    public static final String EXTRA_FILL_RESPONSE = "android.service.autofill.extra.FILL_RESPONSE";
    public static final String SERVICE_INTERFACE = "android.service.autofill.AutofillService";
    public static final String SERVICE_META_DATA = "android.autofill";
    
    public AutofillService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onCreate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void onConnected() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onFillRequest(@NonNull final FillRequest p0, @NonNull final CancellationSignal p1, @NonNull final FillCallback p2);
    
    public abstract void onSaveRequest(@NonNull final SaveRequest p0, @NonNull final SaveCallback p1);
    
    public void onSavedDatasetsInfoRequest(@NonNull final SavedDatasetsInfoCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void onDisconnected() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final FillEventHistory getFillEventHistory() {
        throw new RuntimeException("Stub!");
    }
}
