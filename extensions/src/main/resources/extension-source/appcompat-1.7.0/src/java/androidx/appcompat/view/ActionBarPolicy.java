package androidx.appcompat.view;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.R;
import android.content.res.Configuration;
import android.content.Context;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class ActionBarPolicy
{
    private Context mContext;
    
    public static ActionBarPolicy get(final Context context) {
        return new ActionBarPolicy(context);
    }
    
    private ActionBarPolicy(final Context context) {
        this.mContext = context;
    }
    
    public int getMaxActionButtons() {
        final Configuration configuration = this.mContext.getResources().getConfiguration();
        final int widthDp = configuration.screenWidthDp;
        final int heightDp = configuration.screenHeightDp;
        final int smallest = configuration.smallestScreenWidthDp;
        if (smallest > 600 || widthDp > 600 || (widthDp > 960 && heightDp > 720) || (widthDp > 720 && heightDp > 960)) {
            return 5;
        }
        if (widthDp >= 500 || (widthDp > 640 && heightDp > 480) || (widthDp > 480 && heightDp > 640)) {
            return 4;
        }
        if (widthDp >= 360) {
            return 3;
        }
        return 2;
    }
    
    public boolean showsOverflowMenuButton() {
        return true;
    }
    
    public int getEmbeddedMenuWidthLimit() {
        return this.mContext.getResources().getDisplayMetrics().widthPixels / 2;
    }
    
    public boolean hasEmbeddedTabs() {
        return this.mContext.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }
    
    public int getTabContainerHeight() {
        final TypedArray a = this.mContext.obtainStyledAttributes((AttributeSet)null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        int height = a.getLayoutDimension(R.styleable.ActionBar_height, 0);
        final Resources r = this.mContext.getResources();
        if (!this.hasEmbeddedTabs()) {
            height = Math.min(height, r.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        a.recycle();
        return height;
    }
    
    public boolean enableHomeButtonByDefault() {
        return this.mContext.getApplicationInfo().targetSdkVersion < 14;
    }
    
    public int getStackedTabMaxWidth() {
        return this.mContext.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }
}
