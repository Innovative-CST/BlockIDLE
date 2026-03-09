package android.view;

import android.graphics.Rect;

public abstract class ActionMode
{
    public static final int DEFAULT_HIDE_DURATION = -1;
    public static final int TYPE_FLOATING = 1;
    public static final int TYPE_PRIMARY = 0;
    
    public ActionMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTag(final Object tag) {
        throw new RuntimeException("Stub!");
    }
    
    public Object getTag() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setTitle(final CharSequence p0);
    
    public abstract void setTitle(final int p0);
    
    public abstract void setSubtitle(final CharSequence p0);
    
    public abstract void setSubtitle(final int p0);
    
    public void setTitleOptionalHint(final boolean titleOptional) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getTitleOptionalHint() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTitleOptional() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setCustomView(final View p0);
    
    public void setType(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void invalidate();
    
    public void invalidateContentRect() {
        throw new RuntimeException("Stub!");
    }
    
    public void hide(final long duration) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void finish();
    
    public abstract Menu getMenu();
    
    public abstract CharSequence getTitle();
    
    public abstract CharSequence getSubtitle();
    
    public abstract View getCustomView();
    
    public abstract MenuInflater getMenuInflater();
    
    public void onWindowFocusChanged(final boolean hasWindowFocus) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class Callback2 implements Callback
    {
        public Callback2() {
            throw new RuntimeException("Stub!");
        }
        
        public void onGetContentRect(final ActionMode mode, final View view, final Rect outRect) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface Callback
    {
        boolean onCreateActionMode(final ActionMode p0, final Menu p1);
        
        boolean onPrepareActionMode(final ActionMode p0, final Menu p1);
        
        boolean onActionItemClicked(final ActionMode p0, final MenuItem p1);
        
        void onDestroyActionMode(final ActionMode p0);
    }
}
