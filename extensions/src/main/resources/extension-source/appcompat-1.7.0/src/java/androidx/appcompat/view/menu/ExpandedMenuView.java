package androidx.appcompat.view.menu;

import android.view.View;
import android.view.MenuItem;
import androidx.appcompat.widget.TintTypedArray;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.RestrictTo;
import android.widget.AdapterView;
import android.widget.ListView;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public final class ExpandedMenuView extends ListView implements MenuBuilder.ItemInvoker, MenuView, AdapterView.OnItemClickListener
{
    private static final int[] TINT_ATTRS;
    private MenuBuilder mMenu;
    private int mAnimations;
    
    public ExpandedMenuView(final Context context, final AttributeSet attrs) {
        this(context, attrs, 16842868);
    }
    
    public ExpandedMenuView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs);
        this.setOnItemClickListener((AdapterView.OnItemClickListener)this);
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(context, attrs, ExpandedMenuView.TINT_ATTRS, defStyleAttr, 0);
        if (a.hasValue(0)) {
            this.setBackgroundDrawable(a.getDrawable(0));
        }
        if (a.hasValue(1)) {
            this.setDivider(a.getDrawable(1));
        }
        a.recycle();
    }
    
    public void initialize(final MenuBuilder menu) {
        this.mMenu = menu;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setChildrenDrawingCacheEnabled(false);
    }
    
    public boolean invokeItem(final MenuItemImpl item) {
        return this.mMenu.performItemAction((MenuItem)item, 0);
    }
    
    public void onItemClick(final AdapterView parent, final View v, final int position, final long id) {
        this.invokeItem((MenuItemImpl)this.getAdapter().getItem(position));
    }
    
    public int getWindowAnimations() {
        return this.mAnimations;
    }
    
    static {
        TINT_ATTRS = new int[] { 16842964, 16843049 };
    }
}
