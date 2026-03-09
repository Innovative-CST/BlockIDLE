package android.view;

import android.graphics.Insets;

public interface WindowInsetsAnimationController
{
    @NonNull
    Insets getHiddenStateInsets();
    
    @NonNull
    Insets getShownStateInsets();
    
    @NonNull
    Insets getCurrentInsets();
    
    float getCurrentFraction();
    
    float getCurrentAlpha();
    
    int getTypes();
    
    void setInsetsAndAlpha(@Nullable final Insets p0, final float p1, final float p2);
    
    void finish(final boolean p0);
    
    default boolean isReady() {
        throw new RuntimeException("Stub!");
    }
    
    boolean isFinished();
    
    boolean isCancelled();
}
