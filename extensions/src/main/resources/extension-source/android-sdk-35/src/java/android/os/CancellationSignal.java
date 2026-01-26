package android.os;

public final class CancellationSignal
{
    public CancellationSignal() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCanceled() {
        throw new RuntimeException("Stub!");
    }
    
    public void throwIfCanceled() {
        throw new RuntimeException("Stub!");
    }
    
    public void cancel() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnCancelListener(final OnCancelListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnCancelListener
    {
        void onCancel();
    }
}
