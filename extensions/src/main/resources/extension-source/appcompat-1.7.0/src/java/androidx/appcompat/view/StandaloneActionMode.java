package androidx.appcompat.view;

import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.SubMenuBuilder;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.View;
import java.lang.ref.WeakReference;
import androidx.appcompat.widget.ActionBarContextView;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class StandaloneActionMode extends ActionMode implements MenuBuilder.Callback
{
    private Context mContext;
    private ActionBarContextView mContextView;
    private ActionMode.Callback mCallback;
    private WeakReference<View> mCustomView;
    private boolean mFinished;
    private boolean mFocusable;
    private MenuBuilder mMenu;
    
    public StandaloneActionMode(final Context context, final ActionBarContextView view, final ActionMode.Callback callback, final boolean isFocusable) {
        this.mContext = context;
        this.mContextView = view;
        this.mCallback = callback;
        (this.mMenu = new MenuBuilder(view.getContext()).setDefaultShowAsAction(1)).setCallback(this);
        this.mFocusable = isFocusable;
    }
    
    @Override
    public void setTitle(final CharSequence title) {
        this.mContextView.setTitle(title);
    }
    
    @Override
    public void setSubtitle(final CharSequence subtitle) {
        this.mContextView.setSubtitle(subtitle);
    }
    
    @Override
    public void setTitle(final int resId) {
        this.setTitle((CharSequence)this.mContext.getString(resId));
    }
    
    @Override
    public void setSubtitle(final int resId) {
        this.setSubtitle((CharSequence)this.mContext.getString(resId));
    }
    
    @Override
    public void setTitleOptionalHint(final boolean titleOptional) {
        super.setTitleOptionalHint(titleOptional);
        this.mContextView.setTitleOptional(titleOptional);
    }
    
    @Override
    public boolean isTitleOptional() {
        return this.mContextView.isTitleOptional();
    }
    
    @Override
    public void setCustomView(final View view) {
        this.mContextView.setCustomView(view);
        this.mCustomView = (WeakReference<View>)((view != null) ? new WeakReference((Object)view) : null);
    }
    
    @Override
    public void invalidate() {
        this.mCallback.onPrepareActionMode(this, (Menu)this.mMenu);
    }
    
    @Override
    public void finish() {
        if (this.mFinished) {
            return;
        }
        this.mFinished = true;
        this.mCallback.onDestroyActionMode(this);
    }
    
    @Override
    public Menu getMenu() {
        return (Menu)this.mMenu;
    }
    
    @Override
    public CharSequence getTitle() {
        return this.mContextView.getTitle();
    }
    
    @Override
    public CharSequence getSubtitle() {
        return this.mContextView.getSubtitle();
    }
    
    @Override
    public View getCustomView() {
        return (this.mCustomView != null) ? ((View)this.mCustomView.get()) : null;
    }
    
    @Override
    public MenuInflater getMenuInflater() {
        return new SupportMenuInflater(this.mContextView.getContext());
    }
    
    @Override
    public boolean onMenuItemSelected(@NonNull final MenuBuilder menu, @NonNull final MenuItem item) {
        return this.mCallback.onActionItemClicked(this, item);
    }
    
    public void onCloseMenu(final MenuBuilder menu, final boolean allMenusAreClosing) {
    }
    
    public boolean onSubMenuSelected(final SubMenuBuilder subMenu) {
        if (!subMenu.hasVisibleItems()) {
            return true;
        }
        new MenuPopupHelper(this.mContextView.getContext(), subMenu).show();
        return true;
    }
    
    public void onCloseSubMenu(final SubMenuBuilder menu) {
    }
    
    @Override
    public void onMenuModeChange(@NonNull final MenuBuilder menu) {
        this.invalidate();
        this.mContextView.showOverflowMenu();
    }
    
    @Override
    public boolean isUiFocusable() {
        return this.mFocusable;
    }
}
