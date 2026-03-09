package android.view;

import android.graphics.Outline;

public abstract class ViewOutlineProvider
{
    public static final ViewOutlineProvider BACKGROUND;
    public static final ViewOutlineProvider BOUNDS;
    public static final ViewOutlineProvider PADDED_BOUNDS;
    
    public ViewOutlineProvider() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void getOutline(final View p0, final Outline p1);
    
    static {
        BACKGROUND = null;
        BOUNDS = null;
        PADDED_BOUNDS = null;
    }
}
