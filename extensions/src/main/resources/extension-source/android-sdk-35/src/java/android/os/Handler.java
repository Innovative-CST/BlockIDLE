package android.os;

import android.util.Printer;

public class Handler
{
    @Deprecated
    public Handler() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Handler(@Nullable final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public Handler(@NonNull final Looper looper) {
        throw new RuntimeException("Stub!");
    }
    
    public Handler(@NonNull final Looper looper, @Nullable final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void handleMessage(@NonNull final Message msg) {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchMessage(@NonNull final Message msg) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Handler createAsync(@NonNull final Looper looper) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Handler createAsync(@NonNull final Looper looper, @NonNull final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getMessageName(@NonNull final Message message) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final Message obtainMessage() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final Message obtainMessage(final int what) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final Message obtainMessage(final int what, @Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final Message obtainMessage(final int what, final int arg1, final int arg2) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final Message obtainMessage(final int what, final int arg1, final int arg2, @Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean post(@NonNull final Runnable r) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean postAtTime(@NonNull final Runnable r, final long uptimeMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean postAtTime(@NonNull final Runnable r, @Nullable final Object token, final long uptimeMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean postDelayed(@NonNull final Runnable r, final long delayMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean postDelayed(@NonNull final Runnable r, @Nullable final Object token, final long delayMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean postAtFrontOfQueue(@NonNull final Runnable r) {
        throw new RuntimeException("Stub!");
    }
    
    public final void removeCallbacks(@NonNull final Runnable r) {
        throw new RuntimeException("Stub!");
    }
    
    public final void removeCallbacks(@NonNull final Runnable r, @Nullable final Object token) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean sendMessage(@NonNull final Message msg) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean sendEmptyMessage(final int what) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean sendEmptyMessageDelayed(final int what, final long delayMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean sendEmptyMessageAtTime(final int what, final long uptimeMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean sendMessageDelayed(@NonNull final Message msg, final long delayMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean sendMessageAtTime(@NonNull final Message msg, final long uptimeMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean sendMessageAtFrontOfQueue(@NonNull final Message msg) {
        throw new RuntimeException("Stub!");
    }
    
    public final void removeMessages(final int what) {
        throw new RuntimeException("Stub!");
    }
    
    public final void removeMessages(final int what, @Nullable final Object object) {
        throw new RuntimeException("Stub!");
    }
    
    public final void removeCallbacksAndMessages(@Nullable final Object token) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean hasMessages(final int what) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean hasMessages(final int what, @Nullable final Object object) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean hasCallbacks(@NonNull final Runnable r) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final Looper getLooper() {
        throw new RuntimeException("Stub!");
    }
    
    public final void dump(@NonNull final Printer pw, @NonNull final String prefix) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public interface Callback
    {
        boolean handleMessage(@NonNull final Message p0);
    }
}
