package android.view;

public interface ScrollFeedbackProvider
{
    @NonNull
    default ScrollFeedbackProvider createProvider(@NonNull final View view) {
        throw new RuntimeException("Stub!");
    }
    
    void onSnapToItem(final int p0, final int p1, final int p2);
    
    void onScrollLimit(final int p0, final int p1, final int p2, final boolean p3);
    
    void onScrollProgress(final int p0, final int p1, final int p2, final int p3);
}
