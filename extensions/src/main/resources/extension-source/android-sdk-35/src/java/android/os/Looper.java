package android.os;

import android.util.Printer;

public final class Looper
{
    Looper() {
        throw new RuntimeException("Stub!");
    }
    
    public static void prepare() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void prepareMainLooper() {
        throw new RuntimeException("Stub!");
    }
    
    public static Looper getMainLooper() {
        throw new RuntimeException("Stub!");
    }
    
    public static void loop() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static Looper myLooper() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static MessageQueue myQueue() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCurrentThread() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMessageLogging(@Nullable final Printer printer) {
        throw new RuntimeException("Stub!");
    }
    
    public void quit() {
        throw new RuntimeException("Stub!");
    }
    
    public void quitSafely() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Thread getThread() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public MessageQueue getQueue() {
        throw new RuntimeException("Stub!");
    }
    
    public void dump(@NonNull final Printer pw, @NonNull final String prefix) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
