package android.view;

public interface ViewManager
{
    void addView(final View p0, final ViewGroup.LayoutParams p1);
    
    void updateViewLayout(final View p0, final ViewGroup.LayoutParams p1);
    
    void removeView(final View p0);
}
