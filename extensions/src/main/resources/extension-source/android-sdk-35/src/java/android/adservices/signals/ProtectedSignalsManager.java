package android.adservices.signals;

import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;
import android.content.Context;

public class ProtectedSignalsManager
{
    ProtectedSignalsManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ProtectedSignalsManager get(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateSignals(@NonNull final UpdateSignalsRequest updateSignalsRequest, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Object, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
}
