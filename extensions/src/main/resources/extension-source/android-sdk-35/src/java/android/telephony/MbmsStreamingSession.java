package android.telephony;

import android.telephony.mbms.StreamingService;
import android.telephony.mbms.StreamingServiceCallback;
import android.telephony.mbms.StreamingServiceInfo;
import java.util.List;
import android.telephony.mbms.MbmsStreamingSessionCallback;
import java.util.concurrent.Executor;
import android.content.Context;

public class MbmsStreamingSession implements AutoCloseable
{
    MbmsStreamingSession() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static MbmsStreamingSession create(@NonNull final Context context, @NonNull final Executor executor, final int subscriptionId, @NonNull final MbmsStreamingSessionCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public static MbmsStreamingSession create(@NonNull final Context context, @NonNull final Executor executor, @NonNull final MbmsStreamingSessionCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    public void requestUpdateStreamingServices(final List<String> serviceClassList) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public StreamingService startStreaming(final StreamingServiceInfo serviceInfo, @NonNull final Executor executor, final StreamingServiceCallback callback) {
        throw new RuntimeException("Stub!");
    }
}
