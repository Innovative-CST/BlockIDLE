package androidx.appcompat.view;

import android.view.MenuItem;
import androidx.annotation.RestrictTo;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.View;

public abstract class ActionMode
{
    private Object mTag;
    private boolean mTitleOptionalHint;
    
    public void setTag(final Object tag) {
        this.mTag = tag;
    }
    
    public Object getTag() {
        return this.mTag;
    }
    
    public abstract void setTitle(final CharSequence p0);
    
    public abstract void setTitle(final int p0);
    
    public abstract void setSubtitle(final CharSequence p0);
    
    public abstract void setSubtitle(final int p0);
    
    public void setTitleOptionalHint(final boolean titleOptional) {
        this.mTitleOptionalHint = titleOptional;
    }
    
    public boolean getTitleOptionalHint() {
        return this.mTitleOptionalHint;
    }
    
    public boolean isTitleOptional() {
        return false;
    }
    
    public abstract void setCustomView(final View p0);
    
    public abstract void invalidate();
    
    public abstract void finish();
    
    public abstract Menu getMenu();
    
    public abstract CharSequence getTitle();
    
    public abstract CharSequence getSubtitle();
    
    public abstract View getCustomView();
    
    public abstract MenuInflater getMenuInflater();
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public boolean isUiFocusable() {
        return true;
    }
    
    public interface Callback
    {
        boolean onCreateActionMode(final ActionMode p0, final Menu p1);
        
        boolean onPrepareActionMode(final ActionMode p0, final Menu p1);
        
        boolean onActionItemClicked(final ActionMode p0, final MenuItem p1);
        
        void onDestroyActionMode(final ActionMode p0);
    }
}
