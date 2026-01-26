package androidx.appcompat.widget;

import android.os.Build;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.PackageManager;
import android.view.MenuItem;
import android.view.SubMenu;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.R;
import android.util.TypedValue;
import android.view.View;
import android.content.Context;
import androidx.core.view.ActionProvider;

public class ShareActionProvider extends ActionProvider
{
    private static final int DEFAULT_INITIAL_ACTIVITY_COUNT = 4;
    private int mMaxShownActivityCount;
    private final ShareMenuItemOnMenuItemClickListener mOnMenuItemClickListener;
    public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
    final Context mContext;
    String mShareHistoryFileName;
    OnShareTargetSelectedListener mOnShareTargetSelectedListener;
    private ActivityChooserModel.OnChooseActivityListener mOnChooseActivityListener;
    
    public ShareActionProvider(final Context context) {
        super(context);
        this.mMaxShownActivityCount = 4;
        this.mOnMenuItemClickListener = new ShareMenuItemOnMenuItemClickListener();
        this.mShareHistoryFileName = "share_history.xml";
        this.mContext = context;
    }
    
    public void setOnShareTargetSelectedListener(final OnShareTargetSelectedListener listener) {
        this.mOnShareTargetSelectedListener = listener;
        this.setActivityChooserPolicyIfNeeded();
    }
    
    public View onCreateActionView() {
        final ActivityChooserView activityChooserView = new ActivityChooserView(this.mContext);
        if (!activityChooserView.isInEditMode()) {
            final ActivityChooserModel dataModel = ActivityChooserModel.get(this.mContext, this.mShareHistoryFileName);
            activityChooserView.setActivityChooserModel(dataModel);
        }
        final TypedValue outTypedValue = new TypedValue();
        this.mContext.getTheme().resolveAttribute(R.attr.actionModeShareDrawable, outTypedValue, true);
        final Drawable drawable = AppCompatResources.getDrawable(this.mContext, outTypedValue.resourceId);
        activityChooserView.setExpandActivityOverflowButtonDrawable(drawable);
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(R.string.abc_shareactionprovider_share_with_application);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(R.string.abc_shareactionprovider_share_with);
        return (View)activityChooserView;
    }
    
    public boolean hasSubMenu() {
        return true;
    }
    
    public void onPrepareSubMenu(final SubMenu subMenu) {
        subMenu.clear();
        final ActivityChooserModel dataModel = ActivityChooserModel.get(this.mContext, this.mShareHistoryFileName);
        final PackageManager packageManager = this.mContext.getPackageManager();
        final int expandedActivityCount = dataModel.getActivityCount();
        final int collapsedActivityCount = Math.min(expandedActivityCount, this.mMaxShownActivityCount);
        for (int i = 0; i < collapsedActivityCount; ++i) {
            final ResolveInfo activity = dataModel.getActivity(i);
            subMenu.add(0, i, i, activity.loadLabel(packageManager)).setIcon(activity.loadIcon(packageManager)).setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)this.mOnMenuItemClickListener);
        }
        if (collapsedActivityCount < expandedActivityCount) {
            final SubMenu expandedSubMenu = subMenu.addSubMenu(0, collapsedActivityCount, collapsedActivityCount, (CharSequence)this.mContext.getString(R.string.abc_activity_chooser_view_see_all));
            for (int j = 0; j < expandedActivityCount; ++j) {
                final ResolveInfo activity2 = dataModel.getActivity(j);
                expandedSubMenu.add(0, j, j, activity2.loadLabel(packageManager)).setIcon(activity2.loadIcon(packageManager)).setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)this.mOnMenuItemClickListener);
            }
        }
    }
    
    public void setShareHistoryFileName(final String shareHistoryFile) {
        this.mShareHistoryFileName = shareHistoryFile;
        this.setActivityChooserPolicyIfNeeded();
    }
    
    public void setShareIntent(final Intent shareIntent) {
        if (shareIntent != null) {
            final String action = shareIntent.getAction();
            if ("android.intent.action.SEND".equals((Object)action) || "android.intent.action.SEND_MULTIPLE".equals((Object)action)) {
                this.updateIntent(shareIntent);
            }
        }
        final ActivityChooserModel dataModel = ActivityChooserModel.get(this.mContext, this.mShareHistoryFileName);
        dataModel.setIntent(shareIntent);
    }
    
    private void setActivityChooserPolicyIfNeeded() {
        if (this.mOnShareTargetSelectedListener == null) {
            return;
        }
        if (this.mOnChooseActivityListener == null) {
            this.mOnChooseActivityListener = new ShareActivityChooserModelPolicy();
        }
        final ActivityChooserModel dataModel = ActivityChooserModel.get(this.mContext, this.mShareHistoryFileName);
        dataModel.setOnChooseActivityListener(this.mOnChooseActivityListener);
    }
    
    void updateIntent(final Intent intent) {
        if (Build.VERSION.SDK_INT >= 21) {
            intent.addFlags(134742016);
        }
        else {
            intent.addFlags(524288);
        }
    }
    
    private class ShareMenuItemOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener
    {
        ShareMenuItemOnMenuItemClickListener() {
        }
        
        public boolean onMenuItemClick(final MenuItem item) {
            final ActivityChooserModel dataModel = ActivityChooserModel.get(ShareActionProvider.this.mContext, ShareActionProvider.this.mShareHistoryFileName);
            final int itemId = item.getItemId();
            final Intent launchIntent = dataModel.chooseActivity(itemId);
            if (launchIntent != null) {
                final String action = launchIntent.getAction();
                if ("android.intent.action.SEND".equals((Object)action) || "android.intent.action.SEND_MULTIPLE".equals((Object)action)) {
                    ShareActionProvider.this.updateIntent(launchIntent);
                }
                ShareActionProvider.this.mContext.startActivity(launchIntent);
            }
            return true;
        }
    }
    
    private class ShareActivityChooserModelPolicy implements ActivityChooserModel.OnChooseActivityListener
    {
        ShareActivityChooserModelPolicy() {
        }
        
        @Override
        public boolean onChooseActivity(final ActivityChooserModel host, final Intent intent) {
            if (ShareActionProvider.this.mOnShareTargetSelectedListener != null) {
                ShareActionProvider.this.mOnShareTargetSelectedListener.onShareTargetSelected(ShareActionProvider.this, intent);
            }
            return false;
        }
    }
    
    public interface OnShareTargetSelectedListener
    {
        boolean onShareTargetSelected(final ShareActionProvider p0, final Intent p1);
    }
}
