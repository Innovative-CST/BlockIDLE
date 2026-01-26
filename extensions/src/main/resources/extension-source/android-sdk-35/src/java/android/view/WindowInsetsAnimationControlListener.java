package android.view;

public interface WindowInsetsAnimationControlListener
{
    void onReady(@NonNull final WindowInsetsAnimationController p0, final int p1);
    
    void onFinished(@NonNull final WindowInsetsAnimationController p0);
    
    void onCancelled(@Nullable final WindowInsetsAnimationController p0);
}
