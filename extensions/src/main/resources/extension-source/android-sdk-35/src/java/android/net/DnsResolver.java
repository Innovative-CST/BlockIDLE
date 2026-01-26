package android.net;

import java.net.InetAddress;
import java.util.List;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

public final class DnsResolver
{
    public static final int CLASS_IN = 1;
    public static final int ERROR_PARSE = 0;
    public static final int ERROR_SYSTEM = 1;
    public static final int FLAG_EMPTY = 0;
    public static final int FLAG_NO_CACHE_LOOKUP = 4;
    public static final int FLAG_NO_CACHE_STORE = 2;
    public static final int FLAG_NO_RETRY = 1;
    public static final int TYPE_A = 1;
    public static final int TYPE_AAAA = 28;
    
    DnsResolver() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static DnsResolver getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public void rawQuery(@Nullable final Network network, @NonNull final byte[] query, final int flags, @NonNull final Executor executor, @Nullable final CancellationSignal cancellationSignal, @NonNull final Callback<? super byte[]> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void rawQuery(@Nullable final Network network, @NonNull final String domain, final int nsClass, final int nsType, final int flags, @NonNull final Executor executor, @Nullable final CancellationSignal cancellationSignal, @NonNull final Callback<? super byte[]> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void query(@Nullable final Network network, @NonNull final String domain, final int flags, @NonNull final Executor executor, @Nullable final CancellationSignal cancellationSignal, @NonNull final Callback<? super List<InetAddress>> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void query(@Nullable final Network network, @NonNull final String domain, final int nsType, final int flags, @NonNull final Executor executor, @Nullable final CancellationSignal cancellationSignal, @NonNull final Callback<? super List<InetAddress>> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public static class DnsException extends Exception
    {
        public final int code;
        
        public DnsException(final int code, @Nullable final Throwable cause) {
            this.code = 0;
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface Callback<T>
    {
        void onAnswer(@NonNull final T p0, final int p1);
        
        void onError(@NonNull final DnsException p0);
    }
}
