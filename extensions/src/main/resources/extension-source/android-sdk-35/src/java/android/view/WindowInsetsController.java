package android.view;

import android.os.CancellationSignal;
import android.view.animation.Interpolator;

public interface WindowInsetsController
{
    public static final int APPEARANCE_LIGHT_CAPTION_BARS = 256;
    public static final int APPEARANCE_LIGHT_NAVIGATION_BARS = 16;
    public static final int APPEARANCE_LIGHT_STATUS_BARS = 8;
    public static final int APPEARANCE_TRANSPARENT_CAPTION_BAR_BACKGROUND = 128;
    public static final int BEHAVIOR_DEFAULT = 1;
    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_SWIPE = 1;
    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_TOUCH = 0;
    public static final int BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE = 2;
    
    void show(final int p0);
    
    void hide(final int p0);
    
    void controlWindowInsetsAnimation(final int p0, final long p1, @Nullable final Interpolator p2, @Nullable final CancellationSignal p3, @NonNull final WindowInsetsAnimationControlListener p4);
    
    void setSystemBarsAppearance(final int p0, final int p1);
    
    int getSystemBarsAppearance();
    
    void setSystemBarsBehavior(final int p0);
    
    int getSystemBarsBehavior();
    
    void addOnControllableInsetsChangedListener(@NonNull final OnControllableInsetsChangedListener p0);
    
    void removeOnControllableInsetsChangedListener(@NonNull final OnControllableInsetsChangedListener p0);
    
    public interface OnControllableInsetsChangedListener
    {
        void onControllableInsetsChanged(@NonNull final WindowInsetsController p0, final int p1);
    }
}
