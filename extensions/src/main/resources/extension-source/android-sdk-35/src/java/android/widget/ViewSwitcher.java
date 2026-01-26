package android.widget;

import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

public class ViewSwitcher extends ViewAnimator
{
    public ViewSwitcher(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ViewSwitcher(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addView(final View child, final int index, final ViewGroup.LayoutParams params) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public View getNextView() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFactory(final ViewFactory factory) {
        throw new RuntimeException("Stub!");
    }
    
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    public interface ViewFactory
    {
        View makeView();
    }
}
