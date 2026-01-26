package android.adservices.adselection;

import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;
import android.content.Context;

public class AdSelectionManager
{
    AdSelectionManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static AdSelectionManager get(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public TestAdSelectionManager getTestAdSelectionManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void getAdSelectionData(@NonNull final GetAdSelectionDataRequest request, @NonNull final Executor executor, @NonNull final OutcomeReceiver<GetAdSelectionDataOutcome, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void persistAdSelectionResult(@NonNull final PersistAdSelectionResultRequest request, @NonNull final Executor executor, @NonNull final OutcomeReceiver<AdSelectionOutcome, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void selectAds(@NonNull final AdSelectionConfig adSelectionConfig, @NonNull final Executor executor, @NonNull final OutcomeReceiver<AdSelectionOutcome, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void selectAds(@NonNull final AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, @NonNull final Executor executor, @NonNull final OutcomeReceiver<AdSelectionOutcome, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void reportImpression(@NonNull final ReportImpressionRequest request, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Object, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void reportEvent(@NonNull final ReportEventRequest request, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Object, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAppInstallAdvertisers(@NonNull final SetAppInstallAdvertisersRequest request, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Object, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateAdCounterHistogram(@NonNull final UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Object, Exception> outcomeReceiver) {
        throw new RuntimeException("Stub!");
    }
}
