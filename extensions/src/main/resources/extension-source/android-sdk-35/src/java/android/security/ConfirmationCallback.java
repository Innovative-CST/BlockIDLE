package android.security;

public abstract class ConfirmationCallback
{
    public ConfirmationCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public void onConfirmed(@NonNull final byte[] dataThatWasConfirmed) {
        throw new RuntimeException("Stub!");
    }
    
    public void onDismissed() {
        throw new RuntimeException("Stub!");
    }
    
    public void onCanceled() {
        throw new RuntimeException("Stub!");
    }
    
    public void onError(final Throwable e) {
        throw new RuntimeException("Stub!");
    }
}
