package android.app;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

@Deprecated
public class FragmentBreadCrumbs extends ViewGroup implements FragmentManager.OnBackStackChangedListener
{
    @Deprecated
    public FragmentBreadCrumbs(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public FragmentBreadCrumbs(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public FragmentBreadCrumbs(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setActivity(final Activity a) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setMaxVisible(final int visibleCrumbs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setParentTitle(final CharSequence title, final CharSequence shortTitle, final OnClickListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setOnBreadCrumbClickListener(final OnBreadCrumbClickListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setTitle(final CharSequence title, final CharSequence shortTitle) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onLayout(final boolean changed, final int l, final int t, final int r, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onBackStackChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public interface OnBreadCrumbClickListener
    {
        @Deprecated
        boolean onBreadCrumbClick(final FragmentManager.BackStackEntry p0, final int p1);
    }
}
