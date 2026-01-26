package androidx.appcompat.view.menu;

import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import android.util.Log;
import android.graphics.PorterDuff;
import android.content.res.ColorStateList;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.View;
import android.view.ContextMenu;
import android.view.SubMenu;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.content.Context;
import java.lang.reflect.Method;
import androidx.core.internal.view.SupportMenuItem;
import androidx.annotation.RestrictTo;
import android.view.MenuItem;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class MenuItemWrapperICS extends BaseMenuWrapper implements MenuItem
{
    static final String LOG_TAG = "MenuItemWrapper";
    private final SupportMenuItem mWrappedObject;
    private Method mSetExclusiveCheckableMethod;
    
    public MenuItemWrapperICS(final Context context, final SupportMenuItem object) {
        super(context);
        if (object == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.mWrappedObject = object;
    }
    
    public int getItemId() {
        return this.mWrappedObject.getItemId();
    }
    
    public int getGroupId() {
        return this.mWrappedObject.getGroupId();
    }
    
    public int getOrder() {
        return this.mWrappedObject.getOrder();
    }
    
    public MenuItem setTitle(final CharSequence title) {
        this.mWrappedObject.setTitle(title);
        return (MenuItem)this;
    }
    
    public MenuItem setTitle(final int title) {
        this.mWrappedObject.setTitle(title);
        return (MenuItem)this;
    }
    
    public CharSequence getTitle() {
        return this.mWrappedObject.getTitle();
    }
    
    public MenuItem setTitleCondensed(final CharSequence title) {
        this.mWrappedObject.setTitleCondensed(title);
        return (MenuItem)this;
    }
    
    public CharSequence getTitleCondensed() {
        return this.mWrappedObject.getTitleCondensed();
    }
    
    public MenuItem setIcon(final Drawable icon) {
        this.mWrappedObject.setIcon(icon);
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final int iconRes) {
        this.mWrappedObject.setIcon(iconRes);
        return (MenuItem)this;
    }
    
    public Drawable getIcon() {
        return this.mWrappedObject.getIcon();
    }
    
    public MenuItem setIntent(final Intent intent) {
        this.mWrappedObject.setIntent(intent);
        return (MenuItem)this;
    }
    
    public Intent getIntent() {
        return this.mWrappedObject.getIntent();
    }
    
    public MenuItem setShortcut(final char numericChar, final char alphaChar) {
        this.mWrappedObject.setShortcut(numericChar, alphaChar);
        return (MenuItem)this;
    }
    
    public MenuItem setShortcut(final char numericChar, final char alphaChar, final int numericModifiers, final int alphaModifiers) {
        this.mWrappedObject.setShortcut(numericChar, alphaChar, numericModifiers, alphaModifiers);
        return (MenuItem)this;
    }
    
    public MenuItem setNumericShortcut(final char numericChar) {
        this.mWrappedObject.setNumericShortcut(numericChar);
        return (MenuItem)this;
    }
    
    public MenuItem setNumericShortcut(final char numericChar, final int numericModifiers) {
        this.mWrappedObject.setNumericShortcut(numericChar, numericModifiers);
        return (MenuItem)this;
    }
    
    public char getNumericShortcut() {
        return this.mWrappedObject.getNumericShortcut();
    }
    
    public int getNumericModifiers() {
        return this.mWrappedObject.getNumericModifiers();
    }
    
    public MenuItem setAlphabeticShortcut(final char alphaChar) {
        this.mWrappedObject.setAlphabeticShortcut(alphaChar);
        return (MenuItem)this;
    }
    
    public MenuItem setAlphabeticShortcut(final char alphaChar, final int alphaModifiers) {
        this.mWrappedObject.setAlphabeticShortcut(alphaChar, alphaModifiers);
        return (MenuItem)this;
    }
    
    public char getAlphabeticShortcut() {
        return this.mWrappedObject.getAlphabeticShortcut();
    }
    
    public int getAlphabeticModifiers() {
        return this.mWrappedObject.getAlphabeticModifiers();
    }
    
    public MenuItem setCheckable(final boolean checkable) {
        this.mWrappedObject.setCheckable(checkable);
        return (MenuItem)this;
    }
    
    public boolean isCheckable() {
        return this.mWrappedObject.isCheckable();
    }
    
    public MenuItem setChecked(final boolean checked) {
        this.mWrappedObject.setChecked(checked);
        return (MenuItem)this;
    }
    
    public boolean isChecked() {
        return this.mWrappedObject.isChecked();
    }
    
    public MenuItem setVisible(final boolean visible) {
        return this.mWrappedObject.setVisible(visible);
    }
    
    public boolean isVisible() {
        return this.mWrappedObject.isVisible();
    }
    
    public MenuItem setEnabled(final boolean enabled) {
        this.mWrappedObject.setEnabled(enabled);
        return (MenuItem)this;
    }
    
    public boolean isEnabled() {
        return this.mWrappedObject.isEnabled();
    }
    
    public boolean hasSubMenu() {
        return this.mWrappedObject.hasSubMenu();
    }
    
    public SubMenu getSubMenu() {
        return this.getSubMenuWrapper(this.mWrappedObject.getSubMenu());
    }
    
    public MenuItem setOnMenuItemClickListener(final MenuItem.OnMenuItemClickListener menuItemClickListener) {
        this.mWrappedObject.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)((menuItemClickListener != null) ? new OnMenuItemClickListenerWrapper(menuItemClickListener) : null));
        return (MenuItem)this;
    }
    
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.mWrappedObject.getMenuInfo();
    }
    
    public void setShowAsAction(final int actionEnum) {
        this.mWrappedObject.setShowAsAction(actionEnum);
    }
    
    public MenuItem setShowAsActionFlags(final int actionEnum) {
        this.mWrappedObject.setShowAsActionFlags(actionEnum);
        return (MenuItem)this;
    }
    
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = (View)new CollapsibleActionViewWrapper(view);
        }
        this.mWrappedObject.setActionView(view);
        return (MenuItem)this;
    }
    
    public MenuItem setActionView(final int resId) {
        this.mWrappedObject.setActionView(resId);
        final View actionView = this.mWrappedObject.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.mWrappedObject.setActionView((View)new CollapsibleActionViewWrapper(actionView));
        }
        return (MenuItem)this;
    }
    
    public View getActionView() {
        final View actionView = this.mWrappedObject.getActionView();
        if (actionView instanceof CollapsibleActionViewWrapper) {
            return ((CollapsibleActionViewWrapper)actionView).getWrappedView();
        }
        return actionView;
    }
    
    public MenuItem setActionProvider(final ActionProvider provider) {
        final ActionProviderWrapper actionProviderWrapper = new ActionProviderWrapper(this.mContext, provider);
        this.mWrappedObject.setSupportActionProvider((androidx.core.view.ActionProvider)((provider != null) ? actionProviderWrapper : null));
        return (MenuItem)this;
    }
    
    public ActionProvider getActionProvider() {
        final androidx.core.view.ActionProvider provider = this.mWrappedObject.getSupportActionProvider();
        if (provider instanceof ActionProviderWrapper) {
            return ((ActionProviderWrapper)provider).mInner;
        }
        return null;
    }
    
    public boolean expandActionView() {
        return this.mWrappedObject.expandActionView();
    }
    
    public boolean collapseActionView() {
        return this.mWrappedObject.collapseActionView();
    }
    
    public boolean isActionViewExpanded() {
        return this.mWrappedObject.isActionViewExpanded();
    }
    
    public MenuItem setOnActionExpandListener(final MenuItem.OnActionExpandListener listener) {
        this.mWrappedObject.setOnActionExpandListener((MenuItem.OnActionExpandListener)((listener != null) ? new OnActionExpandListenerWrapper(listener) : null));
        return (MenuItem)this;
    }
    
    public MenuItem setContentDescription(final CharSequence contentDescription) {
        this.mWrappedObject.setContentDescription(contentDescription);
        return (MenuItem)this;
    }
    
    public CharSequence getContentDescription() {
        return this.mWrappedObject.getContentDescription();
    }
    
    public MenuItem setTooltipText(final CharSequence tooltipText) {
        this.mWrappedObject.setTooltipText(tooltipText);
        return (MenuItem)this;
    }
    
    public CharSequence getTooltipText() {
        return this.mWrappedObject.getTooltipText();
    }
    
    public MenuItem setIconTintList(final ColorStateList tint) {
        this.mWrappedObject.setIconTintList(tint);
        return (MenuItem)this;
    }
    
    public ColorStateList getIconTintList() {
        return this.mWrappedObject.getIconTintList();
    }
    
    public MenuItem setIconTintMode(final PorterDuff.Mode tintMode) {
        this.mWrappedObject.setIconTintMode(tintMode);
        return (MenuItem)this;
    }
    
    public PorterDuff.Mode getIconTintMode() {
        return this.mWrappedObject.getIconTintMode();
    }
    
    public void setExclusiveCheckable(final boolean checkable) {
        try {
            if (this.mSetExclusiveCheckableMethod == null) {
                this.mSetExclusiveCheckableMethod = this.mWrappedObject.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.mSetExclusiveCheckableMethod.invoke((Object)this.mWrappedObject, new Object[] { checkable });
        }
        catch (final Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", (Throwable)e);
        }
    }
    
    private class OnMenuItemClickListenerWrapper implements MenuItem.OnMenuItemClickListener
    {
        private final MenuItem.OnMenuItemClickListener mObject;
        
        OnMenuItemClickListenerWrapper(final MenuItem.OnMenuItemClickListener object) {
            this.mObject = object;
        }
        
        public boolean onMenuItemClick(final MenuItem item) {
            return this.mObject.onMenuItemClick(MenuItemWrapperICS.this.getMenuItemWrapper(item));
        }
    }
    
    private class OnActionExpandListenerWrapper implements MenuItem.OnActionExpandListener
    {
        private final MenuItem.OnActionExpandListener mObject;
        
        OnActionExpandListenerWrapper(final MenuItem.OnActionExpandListener object) {
            this.mObject = object;
        }
        
        public boolean onMenuItemActionExpand(final MenuItem item) {
            return this.mObject.onMenuItemActionExpand(MenuItemWrapperICS.this.getMenuItemWrapper(item));
        }
        
        public boolean onMenuItemActionCollapse(final MenuItem item) {
            return this.mObject.onMenuItemActionCollapse(MenuItemWrapperICS.this.getMenuItemWrapper(item));
        }
    }
    
    private class ActionProviderWrapper extends androidx.core.view.ActionProvider implements ActionProvider.VisibilityListener
    {
        private androidx.core.view.ActionProvider.VisibilityListener mListener;
        private final ActionProvider mInner;
        
        ActionProviderWrapper(final Context context, final ActionProvider inner) {
            super(context);
            this.mInner = inner;
        }
        
        public View onCreateActionView(final MenuItem forItem) {
            return this.mInner.onCreateActionView(forItem);
        }
        
        public boolean overridesItemVisibility() {
            return this.mInner.overridesItemVisibility();
        }
        
        public boolean isVisible() {
            return this.mInner.isVisible();
        }
        
        public void refreshVisibility() {
            this.mInner.refreshVisibility();
        }
        
        public void setVisibilityListener(final androidx.core.view.ActionProvider.VisibilityListener listener) {
            this.mListener = listener;
            this.mInner.setVisibilityListener((ActionProvider.VisibilityListener)((listener != null) ? this : null));
        }
        
        public void onActionProviderVisibilityChanged(final boolean isVisible) {
            if (this.mListener != null) {
                this.mListener.onActionProviderVisibilityChanged(isVisible);
            }
        }
        
        public boolean onPerformDefaultAction() {
            return this.mInner.onPerformDefaultAction();
        }
        
        @NonNull
        public View onCreateActionView() {
            return this.mInner.onCreateActionView();
        }
        
        public boolean hasSubMenu() {
            return this.mInner.hasSubMenu();
        }
        
        public void onPrepareSubMenu(final SubMenu subMenu) {
            this.mInner.onPrepareSubMenu(MenuItemWrapperICS.this.getSubMenuWrapper(subMenu));
        }
    }
    
    static class CollapsibleActionViewWrapper extends FrameLayout implements CollapsibleActionView
    {
        final android.view.CollapsibleActionView mWrappedView;
        
        CollapsibleActionViewWrapper(final View actionView) {
            super(actionView.getContext());
            this.mWrappedView = (android.view.CollapsibleActionView)actionView;
            this.addView(actionView);
        }
        
        public void onActionViewExpanded() {
            this.mWrappedView.onActionViewExpanded();
        }
        
        public void onActionViewCollapsed() {
            this.mWrappedView.onActionViewCollapsed();
        }
        
        View getWrappedView() {
            return (View)this.mWrappedView;
        }
    }
}
