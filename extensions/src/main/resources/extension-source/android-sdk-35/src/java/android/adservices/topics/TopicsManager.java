package android.adservices.topics;

import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;
import android.content.Context;

public final class TopicsManager
{
    TopicsManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static TopicsManager get(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public void getTopics(@NonNull final GetTopicsRequest getTopicsRequest, @NonNull final Executor executor, @NonNull final OutcomeReceiver<GetTopicsResponse, Exception> callback) {
        throw new RuntimeException("Stub!");
    }
}
