package android.view;

import android.graphics.Rect;

public class FocusFinder
{
    FocusFinder() {
        throw new RuntimeException("Stub!");
    }
    
    public static FocusFinder getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public final View findNextFocus(final ViewGroup root, final View focused, final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    public View findNextFocusFromRect(final ViewGroup root, final Rect focusedRect, final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    public View findNextKeyboardNavigationCluster(@NonNull final View root, @Nullable final View currentCluster, final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    public View findNearestTouchable(final ViewGroup root, final int x, final int y, final int direction, final int[] deltas) {
        throw new RuntimeException("Stub!");
    }
}
