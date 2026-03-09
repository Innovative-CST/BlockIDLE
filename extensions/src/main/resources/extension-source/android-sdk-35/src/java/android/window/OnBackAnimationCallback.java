package android.window;

public interface OnBackAnimationCallback extends OnBackInvokedCallback
{
    default void onBackStarted(@NonNull final BackEvent backEvent) {
        throw new RuntimeException("Stub!");
    }
    
    default void onBackProgressed(@NonNull final BackEvent backEvent) {
        throw new RuntimeException("Stub!");
    }
    
    default void onBackCancelled() {
        throw new RuntimeException("Stub!");
    }
}
