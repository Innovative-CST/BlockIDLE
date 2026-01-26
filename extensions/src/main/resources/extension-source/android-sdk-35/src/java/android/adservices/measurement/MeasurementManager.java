package android.adservices.measurement;

import android.adservices.common.AdServicesOutcomeReceiver;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;
import android.view.InputEvent;
import android.net.Uri;
import android.content.Context;

public class MeasurementManager
{
    public static final int MEASUREMENT_API_STATE_DISABLED = 0;
    public static final int MEASUREMENT_API_STATE_ENABLED = 1;
    
    MeasurementManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static MeasurementManager get(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerSource(@NonNull final Uri attributionSource, @Nullable final InputEvent inputEvent, @Nullable final Executor executor, @Nullable final OutcomeReceiver<Object, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerSource(@NonNull final Uri attributionSource, @Nullable final InputEvent inputEvent, @Nullable final Executor executor, @Nullable final AdServicesOutcomeReceiver<Object, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerSource(@NonNull final SourceRegistrationRequest request, @Nullable final Executor executor, @Nullable final OutcomeReceiver<Object, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerSource(@NonNull final SourceRegistrationRequest request, @Nullable final Executor executor, @Nullable final AdServicesOutcomeReceiver<Object, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerWebSource(@NonNull final WebSourceRegistrationRequest request, @Nullable final Executor executor, @Nullable final OutcomeReceiver<Object, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerWebSource(@NonNull final WebSourceRegistrationRequest request, @Nullable final Executor executor, @Nullable final AdServicesOutcomeReceiver<Object, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerWebTrigger(@NonNull final WebTriggerRegistrationRequest request, @Nullable final Executor executor, @Nullable final OutcomeReceiver<Object, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerWebTrigger(@NonNull final WebTriggerRegistrationRequest request, @Nullable final Executor executor, @Nullable final AdServicesOutcomeReceiver<Object, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerTrigger(@NonNull final Uri trigger, @Nullable final Executor executor, @Nullable final OutcomeReceiver<Object, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerTrigger(@NonNull final Uri trigger, @Nullable final Executor executor, @Nullable final AdServicesOutcomeReceiver<Object, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void deleteRegistrations(@NonNull final DeletionRequest deletionRequest, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Object, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void deleteRegistrations(@NonNull final DeletionRequest deletionRequest, @NonNull final Executor executor, @NonNull final AdServicesOutcomeReceiver<Object, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getMeasurementApiStatus(@NonNull final Executor executor, @NonNull final OutcomeReceiver<Integer, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getMeasurementApiStatus(@NonNull final Executor executor, @NonNull final AdServicesOutcomeReceiver<Integer, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
}
