package android.adservices.appsetid;

import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;
import android.content.Context;

public class AppSetIdManager
{
    AppSetIdManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static AppSetIdManager get(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public void getAppSetId(@NonNull final Executor executor, @NonNull final OutcomeReceiver<AppSetId, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
}
