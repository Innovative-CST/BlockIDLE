package android.window;

public interface OnBackInvokedDispatcher
{
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_OVERLAY = 1000000;
    
    void registerOnBackInvokedCallback(final int p0, @NonNull final OnBackInvokedCallback p1);
    
    void unregisterOnBackInvokedCallback(@NonNull final OnBackInvokedCallback p0);
}
