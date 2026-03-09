package android.telephony;

import android.telephony.mbms.GroupCall;
import android.telephony.mbms.GroupCallCallback;
import java.util.List;
import android.telephony.mbms.MbmsGroupCallSessionCallback;
import java.util.concurrent.Executor;
import android.content.Context;

public class MbmsGroupCallSession implements AutoCloseable
{
    MbmsGroupCallSession() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static MbmsGroupCallSession create(@NonNull final Context context, final int subscriptionId, @NonNull final Executor executor, @NonNull final MbmsGroupCallSessionCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static MbmsGroupCallSession create(@NonNull final Context context, @NonNull final Executor executor, @NonNull final MbmsGroupCallSessionCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public GroupCall startGroupCall(final long tmgi, @NonNull final List<Integer> saiList, @NonNull final List<Integer> frequencyList, @NonNull final Executor executor, @NonNull final GroupCallCallback callback) {
        throw new RuntimeException("Stub!");
    }
}
