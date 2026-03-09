package androidx.appcompat.view;

import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.core.internal.view.SupportMenuItem;
import android.view.MenuItem;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import android.view.MenuInflater;
import android.view.View;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.core.internal.view.SupportMenu;
import android.view.Menu;
import android.content.Context;
import androidx.annotation.RestrictTo;
import android.view.ActionMode;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class SupportActionModeWrapper extends ActionMode
{
    final Context mContext;
    final androidx.appcompat.view.ActionMode mWrappedObject;
    
    public SupportActionModeWrapper(final Context context, final androidx.appcompat.view.ActionMode supportActionMode) {
        this.mContext = context;
        this.mWrappedObject = supportActionMode;
    }
    
    public Object getTag() {
        return this.mWrappedObject.getTag();
    }
    
    public void setTag(final Object tag) {
        this.mWrappedObject.setTag(tag);
    }
    
    public void setTitle(final CharSequence title) {
        this.mWrappedObject.setTitle(title);
    }
    
    public void setSubtitle(final CharSequence subtitle) {
        this.mWrappedObject.setSubtitle(subtitle);
    }
    
    public void invalidate() {
        this.mWrappedObject.invalidate();
    }
    
    public void finish() {
        this.mWrappedObject.finish();
    }
    
    public Menu getMenu() {
        return (Menu)new MenuWrapperICS(this.mContext, (SupportMenu)this.mWrappedObject.getMenu());
    }
    
    public CharSequence getTitle() {
        return this.mWrappedObject.getTitle();
    }
    
    public void setTitle(final int resId) {
        this.mWrappedObject.setTitle(resId);
    }
    
    public CharSequence getSubtitle() {
        return this.mWrappedObject.getSubtitle();
    }
    
    public void setSubtitle(final int resId) {
        this.mWrappedObject.setSubtitle(resId);
    }
    
    public View getCustomView() {
        return this.mWrappedObject.getCustomView();
    }
    
    public void setCustomView(final View view) {
        this.mWrappedObject.setCustomView(view);
    }
    
    public MenuInflater getMenuInflater() {
        return this.mWrappedObject.getMenuInflater();
    }
    
    public boolean getTitleOptionalHint() {
        return this.mWrappedObject.getTitleOptionalHint();
    }
    
    public void setTitleOptionalHint(final boolean titleOptional) {
        this.mWrappedObject.setTitleOptionalHint(titleOptional);
    }
    
    public boolean isTitleOptional() {
        return this.mWrappedObject.isTitleOptional();
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public static class CallbackWrapper implements ActionMode.Callback
    {
        final android.view.ActionMode.Callback mWrappedCallback;
        final Context mContext;
        final ArrayList<SupportActionModeWrapper> mActionModes;
        final SimpleArrayMap<Menu, Menu> mMenus;
        
        public CallbackWrapper(final Context context, final android.view.ActionMode.Callback supportCallback) {
            this.mContext = context;
            this.mWrappedCallback = supportCallback;
            this.mActionModes = (ArrayList<SupportActionModeWrapper>)new ArrayList();
            this.mMenus = (SimpleArrayMap<Menu, Menu>)new SimpleArrayMap();
        }
        
        @Override
        public boolean onCreateActionMode(final ActionMode mode, final Menu menu) {
            return this.mWrappedCallback.onCreateActionMode(this.getActionModeWrapper(mode), this.getMenuWrapper(menu));
        }
        
        @Override
        public boolean onPrepareActionMode(final ActionMode mode, final Menu menu) {
            return this.mWrappedCallback.onPrepareActionMode(this.getActionModeWrapper(mode), this.getMenuWrapper(menu));
        }
        
        @Override
        public boolean onActionItemClicked(final ActionMode mode, final MenuItem item) {
            return this.mWrappedCallback.onActionItemClicked(this.getActionModeWrapper(mode), (MenuItem)new MenuItemWrapperICS(this.mContext, (SupportMenuItem)item));
        }
        
        @Override
        public void onDestroyActionMode(final ActionMode mode) {
            this.mWrappedCallback.onDestroyActionMode(this.getActionModeWrapper(mode));
        }
        
        private Menu getMenuWrapper(final Menu menu) {
            Menu wrapper = (Menu)this.mMenus.get((Object)menu);
            if (wrapper == null) {
                wrapper = (Menu)new MenuWrapperICS(this.mContext, (SupportMenu)menu);
                this.mMenus.put((Object)menu, (Object)wrapper);
            }
            return wrapper;
        }
        
        public android.view.ActionMode getActionModeWrapper(final ActionMode mode) {
            for (int i = 0, count = this.mActionModes.size(); i < count; ++i) {
                final SupportActionModeWrapper wrapper = (SupportActionModeWrapper)this.mActionModes.get(i);
                if (wrapper != null && wrapper.mWrappedObject == mode) {
                    return wrapper;
                }
            }
            final SupportActionModeWrapper wrapper2 = new SupportActionModeWrapper(this.mContext, mode);
            this.mActionModes.add((Object)wrapper2);
            return wrapper2;
        }
    }
}
