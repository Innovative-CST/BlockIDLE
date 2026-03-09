package androidx.appcompat.widget;

import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.BaseAdapter;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.graphics.drawable.ColorDrawable;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.LayoutInflater;
import androidx.core.view.ViewCompat;
import androidx.appcompat.R;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import android.widget.PopupWindow;
import android.view.ViewTreeObserver;
import android.database.DataSetObserver;
import androidx.core.view.ActionProvider;
import android.widget.ImageView;
import android.widget.FrameLayout;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.RestrictTo;
import android.view.ViewGroup;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class ActivityChooserView extends ViewGroup implements ActivityChooserModel.ActivityChooserModelClient
{
    final ActivityChooserViewAdapter mAdapter;
    private final Callbacks mCallbacks;
    private final View mActivityChooserContent;
    private final Drawable mActivityChooserContentBackground;
    final FrameLayout mExpandActivityOverflowButton;
    private final ImageView mExpandActivityOverflowButtonImage;
    final FrameLayout mDefaultActivityButton;
    private final ImageView mDefaultActivityButtonImage;
    private final int mListPopupMaxWidth;
    ActionProvider mProvider;
    final DataSetObserver mModelDataSetObserver;
    private final ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    private ListPopupWindow mListPopupWindow;
    PopupWindow.OnDismissListener mOnDismissListener;
    boolean mIsSelectingDefaultActivity;
    int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    private int mDefaultActionButtonContentDescription;
    
    public ActivityChooserView(@NonNull final Context context) {
        this(context, null);
    }
    
    public ActivityChooserView(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, 0);
    }
    
    public ActivityChooserView(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);
        this.mModelDataSetObserver = new DataSetObserver() {
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.mAdapter.notifyDataSetChanged();
            }
            
            public void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.mAdapter.notifyDataSetInvalidated();
            }
        };
        this.mOnGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener)new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (ActivityChooserView.this.isShowingPopup()) {
                    if (!ActivityChooserView.this.isShown()) {
                        ActivityChooserView.this.getListPopupWindow().dismiss();
                    }
                    else {
                        ActivityChooserView.this.getListPopupWindow().show();
                        if (ActivityChooserView.this.mProvider != null) {
                            ActivityChooserView.this.mProvider.subUiVisibilityChanged(true);
                        }
                    }
                }
            }
        };
        this.mInitialActivityCount = 4;
        final TypedArray attributesArray = context.obtainStyledAttributes(attrs, R.styleable.ActivityChooserView, defStyle, 0);
        ViewCompat.saveAttributeDataForStyleable((View)this, context, R.styleable.ActivityChooserView, attrs, attributesArray, defStyle, 0);
        this.mInitialActivityCount = attributesArray.getInt(R.styleable.ActivityChooserView_initialActivityCount, 4);
        final Drawable expandActivityOverflowButtonDrawable = attributesArray.getDrawable(R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
        attributesArray.recycle();
        final LayoutInflater inflater = LayoutInflater.from(this.getContext());
        inflater.inflate(R.layout.abc_activity_chooser_view, (ViewGroup)this, true);
        this.mCallbacks = new Callbacks();
        this.mActivityChooserContent = this.findViewById(R.id.activity_chooser_view_content);
        this.mActivityChooserContentBackground = this.mActivityChooserContent.getBackground();
        (this.mDefaultActivityButton = (FrameLayout)this.findViewById(R.id.default_activity_button)).setOnClickListener((View.OnClickListener)this.mCallbacks);
        this.mDefaultActivityButton.setOnLongClickListener((View.OnLongClickListener)this.mCallbacks);
        this.mDefaultActivityButtonImage = (ImageView)this.mDefaultActivityButton.findViewById(R.id.image);
        final FrameLayout expandButton = (FrameLayout)this.findViewById(R.id.expand_activities_button);
        expandButton.setOnClickListener((View.OnClickListener)this.mCallbacks);
        expandButton.setAccessibilityDelegate((View.AccessibilityDelegate)new View.AccessibilityDelegate() {
            public void onInitializeAccessibilityNodeInfo(final View host, final AccessibilityNodeInfo info) {
                super.onInitializeAccessibilityNodeInfo(host, info);
                AccessibilityNodeInfoCompat.wrap(info).setCanOpenPopup(true);
            }
        });
        expandButton.setOnTouchListener((View.OnTouchListener)new ForwardingListener(expandButton) {
            @Override
            public ShowableListMenu getPopup() {
                return ActivityChooserView.this.getListPopupWindow();
            }
            
            @Override
            protected boolean onForwardingStarted() {
                ActivityChooserView.this.showPopup();
                return true;
            }
            
            @Override
            protected boolean onForwardingStopped() {
                ActivityChooserView.this.dismissPopup();
                return true;
            }
        });
        this.mExpandActivityOverflowButton = expandButton;
        (this.mExpandActivityOverflowButtonImage = (ImageView)expandButton.findViewById(R.id.image)).setImageDrawable(expandActivityOverflowButtonDrawable);
        (this.mAdapter = new ActivityChooserViewAdapter()).registerDataSetObserver((DataSetObserver)new DataSetObserver() {
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.updateAppearance();
            }
        });
        final Resources resources = context.getResources();
        this.mListPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY })
    public void setActivityChooserModel(final ActivityChooserModel dataModel) {
        this.mAdapter.setDataModel(dataModel);
        if (this.isShowingPopup()) {
            this.dismissPopup();
            this.showPopup();
        }
    }
    
    public void setExpandActivityOverflowButtonDrawable(final Drawable drawable) {
        this.mExpandActivityOverflowButtonImage.setImageDrawable(drawable);
    }
    
    public void setExpandActivityOverflowButtonContentDescription(final int resourceId) {
        final CharSequence contentDescription = (CharSequence)this.getContext().getString(resourceId);
        this.mExpandActivityOverflowButtonImage.setContentDescription(contentDescription);
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setProvider(final ActionProvider provider) {
        this.mProvider = provider;
    }
    
    public boolean showPopup() {
        if (this.isShowingPopup() || !this.mIsAttachedToWindow) {
            return false;
        }
        this.mIsSelectingDefaultActivity = false;
        this.showPopupUnchecked(this.mInitialActivityCount);
        return true;
    }
    
    void showPopupUnchecked(final int maxActivityCount) {
        if (this.mAdapter.getDataModel() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        this.getViewTreeObserver().addOnGlobalLayoutListener(this.mOnGlobalLayoutListener);
        final boolean defaultActivityButtonShown = this.mDefaultActivityButton.getVisibility() == 0;
        final int activityCount = this.mAdapter.getActivityCount();
        final int maxActivityCountOffset = defaultActivityButtonShown ? 1 : 0;
        if (maxActivityCount != Integer.MAX_VALUE && activityCount > maxActivityCount + maxActivityCountOffset) {
            this.mAdapter.setShowFooterView(true);
            this.mAdapter.setMaxActivityCount(maxActivityCount - 1);
        }
        else {
            this.mAdapter.setShowFooterView(false);
            this.mAdapter.setMaxActivityCount(maxActivityCount);
        }
        final ListPopupWindow popupWindow = this.getListPopupWindow();
        if (!popupWindow.isShowing()) {
            if (this.mIsSelectingDefaultActivity || !defaultActivityButtonShown) {
                this.mAdapter.setShowDefaultActivity(true, defaultActivityButtonShown);
            }
            else {
                this.mAdapter.setShowDefaultActivity(false, false);
            }
            final int contentWidth = Math.min(this.mAdapter.measureContentWidth(), this.mListPopupMaxWidth);
            popupWindow.setContentWidth(contentWidth);
            popupWindow.show();
            if (this.mProvider != null) {
                this.mProvider.subUiVisibilityChanged(true);
            }
            popupWindow.getListView().setContentDescription((CharSequence)this.getContext().getString(R.string.abc_activitychooserview_choose_application));
            popupWindow.getListView().setSelector((Drawable)new ColorDrawable(0));
        }
    }
    
    public boolean dismissPopup() {
        if (this.isShowingPopup()) {
            this.getListPopupWindow().dismiss();
            final ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
            }
        }
        return true;
    }
    
    public boolean isShowingPopup() {
        return this.getListPopupWindow().isShowing();
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final ActivityChooserModel dataModel = this.mAdapter.getDataModel();
        if (dataModel != null) {
            dataModel.registerObserver((Object)this.mModelDataSetObserver);
        }
        this.mIsAttachedToWindow = true;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final ActivityChooserModel dataModel = this.mAdapter.getDataModel();
        if (dataModel != null) {
            dataModel.unregisterObserver((Object)this.mModelDataSetObserver);
        }
        final ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
        }
        if (this.isShowingPopup()) {
            this.dismissPopup();
        }
        this.mIsAttachedToWindow = false;
    }
    
    protected void onMeasure(final int widthMeasureSpec, int heightMeasureSpec) {
        final View child = this.mActivityChooserContent;
        if (this.mDefaultActivityButton.getVisibility() != 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(heightMeasureSpec), 1073741824);
        }
        this.measureChild(child, widthMeasureSpec, heightMeasureSpec);
        this.setMeasuredDimension(child.getMeasuredWidth(), child.getMeasuredHeight());
    }
    
    protected void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        this.mActivityChooserContent.layout(0, 0, right - left, bottom - top);
        if (!this.isShowingPopup()) {
            this.dismissPopup();
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY })
    public ActivityChooserModel getDataModel() {
        return this.mAdapter.getDataModel();
    }
    
    public void setOnDismissListener(final PopupWindow.OnDismissListener listener) {
        this.mOnDismissListener = listener;
    }
    
    public void setInitialActivityCount(final int itemCount) {
        this.mInitialActivityCount = itemCount;
    }
    
    public void setDefaultActionButtonContentDescription(final int resourceId) {
        this.mDefaultActionButtonContentDescription = resourceId;
    }
    
    ListPopupWindow getListPopupWindow() {
        if (this.mListPopupWindow == null) {
            (this.mListPopupWindow = new ListPopupWindow(this.getContext())).setAdapter((ListAdapter)this.mAdapter);
            this.mListPopupWindow.setAnchorView((View)this);
            this.mListPopupWindow.setModal(true);
            this.mListPopupWindow.setOnItemClickListener((AdapterView.OnItemClickListener)this.mCallbacks);
            this.mListPopupWindow.setOnDismissListener((PopupWindow.OnDismissListener)this.mCallbacks);
        }
        return this.mListPopupWindow;
    }
    
    void updateAppearance() {
        if (this.mAdapter.getCount() > 0) {
            this.mExpandActivityOverflowButton.setEnabled(true);
        }
        else {
            this.mExpandActivityOverflowButton.setEnabled(false);
        }
        final int activityCount = this.mAdapter.getActivityCount();
        final int historySize = this.mAdapter.getHistorySize();
        if (activityCount == 1 || (activityCount > 1 && historySize > 0)) {
            this.mDefaultActivityButton.setVisibility(0);
            final ResolveInfo activity = this.mAdapter.getDefaultActivity();
            final PackageManager packageManager = this.getContext().getPackageManager();
            this.mDefaultActivityButtonImage.setImageDrawable(activity.loadIcon(packageManager));
            if (this.mDefaultActionButtonContentDescription != 0) {
                final CharSequence label = activity.loadLabel(packageManager);
                final String contentDescription = this.getContext().getString(this.mDefaultActionButtonContentDescription, new Object[] { label });
                this.mDefaultActivityButton.setContentDescription((CharSequence)contentDescription);
            }
        }
        else {
            this.mDefaultActivityButton.setVisibility(8);
        }
        if (this.mDefaultActivityButton.getVisibility() == 0) {
            this.mActivityChooserContent.setBackgroundDrawable(this.mActivityChooserContentBackground);
        }
        else {
            this.mActivityChooserContent.setBackgroundDrawable((Drawable)null);
        }
    }
    
    private class Callbacks implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener
    {
        Callbacks() {
        }
        
        public void onItemClick(final AdapterView<?> parent, final View view, int position, final long id) {
            final ActivityChooserViewAdapter adapter = (ActivityChooserViewAdapter)parent.getAdapter();
            final int itemViewType = adapter.getItemViewType(position);
            switch (itemViewType) {
                case 1: {
                    ActivityChooserView.this.showPopupUnchecked(Integer.MAX_VALUE);
                    break;
                }
                case 0: {
                    ActivityChooserView.this.dismissPopup();
                    if (!ActivityChooserView.this.mIsSelectingDefaultActivity) {
                        position = (ActivityChooserView.this.mAdapter.getShowDefaultActivity() ? position : (position + 1));
                        final Intent launchIntent = ActivityChooserView.this.mAdapter.getDataModel().chooseActivity(position);
                        if (launchIntent != null) {
                            launchIntent.addFlags(524288);
                            ActivityChooserView.this.getContext().startActivity(launchIntent);
                        }
                        break;
                    }
                    if (position > 0) {
                        ActivityChooserView.this.mAdapter.getDataModel().setDefaultActivity(position);
                        break;
                    }
                    break;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        
        public void onClick(final View view) {
            if (view == ActivityChooserView.this.mDefaultActivityButton) {
                ActivityChooserView.this.dismissPopup();
                final ResolveInfo defaultActivity = ActivityChooserView.this.mAdapter.getDefaultActivity();
                final int index = ActivityChooserView.this.mAdapter.getDataModel().getActivityIndex(defaultActivity);
                final Intent launchIntent = ActivityChooserView.this.mAdapter.getDataModel().chooseActivity(index);
                if (launchIntent != null) {
                    launchIntent.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(launchIntent);
                }
            }
            else {
                if (view != ActivityChooserView.this.mExpandActivityOverflowButton) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.mIsSelectingDefaultActivity = false;
                ActivityChooserView.this.showPopupUnchecked(ActivityChooserView.this.mInitialActivityCount);
            }
        }
        
        public boolean onLongClick(final View view) {
            if (view == ActivityChooserView.this.mDefaultActivityButton) {
                if (ActivityChooserView.this.mAdapter.getCount() > 0) {
                    ActivityChooserView.this.mIsSelectingDefaultActivity = true;
                    ActivityChooserView.this.showPopupUnchecked(ActivityChooserView.this.mInitialActivityCount);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
        
        public void onDismiss() {
            this.notifyOnDismissListener();
            if (ActivityChooserView.this.mProvider != null) {
                ActivityChooserView.this.mProvider.subUiVisibilityChanged(false);
            }
        }
        
        private void notifyOnDismissListener() {
            if (ActivityChooserView.this.mOnDismissListener != null) {
                ActivityChooserView.this.mOnDismissListener.onDismiss();
            }
        }
    }
    
    private class ActivityChooserViewAdapter extends BaseAdapter
    {
        public static final int MAX_ACTIVITY_COUNT_UNLIMITED = Integer.MAX_VALUE;
        public static final int MAX_ACTIVITY_COUNT_DEFAULT = 4;
        private static final int ITEM_VIEW_TYPE_ACTIVITY = 0;
        private static final int ITEM_VIEW_TYPE_FOOTER = 1;
        private static final int ITEM_VIEW_TYPE_COUNT = 3;
        private ActivityChooserModel mDataModel;
        private int mMaxActivityCount;
        private boolean mShowDefaultActivity;
        private boolean mHighlightDefaultActivity;
        private boolean mShowFooterView;
        
        ActivityChooserViewAdapter() {
            this.mMaxActivityCount = 4;
        }
        
        public void setDataModel(final ActivityChooserModel dataModel) {
            final ActivityChooserModel oldDataModel = ActivityChooserView.this.mAdapter.getDataModel();
            if (oldDataModel != null && ActivityChooserView.this.isShown()) {
                oldDataModel.unregisterObserver((Object)ActivityChooserView.this.mModelDataSetObserver);
            }
            if ((this.mDataModel = dataModel) != null && ActivityChooserView.this.isShown()) {
                dataModel.registerObserver((Object)ActivityChooserView.this.mModelDataSetObserver);
            }
            this.notifyDataSetChanged();
        }
        
        public int getItemViewType(final int position) {
            if (this.mShowFooterView && position == this.getCount() - 1) {
                return 1;
            }
            return 0;
        }
        
        public int getViewTypeCount() {
            return 3;
        }
        
        public int getCount() {
            int activityCount = this.mDataModel.getActivityCount();
            if (!this.mShowDefaultActivity && this.mDataModel.getDefaultActivity() != null) {
                --activityCount;
            }
            int count = Math.min(activityCount, this.mMaxActivityCount);
            if (this.mShowFooterView) {
                ++count;
            }
            return count;
        }
        
        public Object getItem(int position) {
            final int itemViewType = this.getItemViewType(position);
            switch (itemViewType) {
                case 1: {
                    return null;
                }
                case 0: {
                    if (!this.mShowDefaultActivity && this.mDataModel.getDefaultActivity() != null) {
                        ++position;
                    }
                    return this.mDataModel.getActivity(position);
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        
        public long getItemId(final int position) {
            return position;
        }
        
        public View getView(final int position, View convertView, final ViewGroup parent) {
            final int itemViewType = this.getItemViewType(position);
            switch (itemViewType) {
                case 1: {
                    if (convertView == null || convertView.getId() != 1) {
                        convertView = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, parent, false);
                        convertView.setId(1);
                        final TextView titleView = (TextView)convertView.findViewById(R.id.title);
                        titleView.setText((CharSequence)ActivityChooserView.this.getContext().getString(R.string.abc_activity_chooser_view_see_all));
                    }
                    return convertView;
                }
                case 0: {
                    if (convertView == null || convertView.getId() != R.id.list_item) {
                        convertView = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, parent, false);
                    }
                    final PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                    final ImageView iconView = (ImageView)convertView.findViewById(R.id.icon);
                    final ResolveInfo activity = (ResolveInfo)this.getItem(position);
                    iconView.setImageDrawable(activity.loadIcon(packageManager));
                    final TextView titleView2 = (TextView)convertView.findViewById(R.id.title);
                    titleView2.setText(activity.loadLabel(packageManager));
                    if (this.mShowDefaultActivity && position == 0 && this.mHighlightDefaultActivity) {
                        convertView.setActivated(true);
                    }
                    else {
                        convertView.setActivated(false);
                    }
                    return convertView;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        
        public int measureContentWidth() {
            final int oldMaxActivityCount = this.mMaxActivityCount;
            this.mMaxActivityCount = Integer.MAX_VALUE;
            int contentWidth = 0;
            View itemView = null;
            final int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            final int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            for (int count = this.getCount(), i = 0; i < count; ++i) {
                itemView = this.getView(i, itemView, null);
                itemView.measure(widthMeasureSpec, heightMeasureSpec);
                contentWidth = Math.max(contentWidth, itemView.getMeasuredWidth());
            }
            this.mMaxActivityCount = oldMaxActivityCount;
            return contentWidth;
        }
        
        public void setMaxActivityCount(final int maxActivityCount) {
            if (this.mMaxActivityCount != maxActivityCount) {
                this.mMaxActivityCount = maxActivityCount;
                this.notifyDataSetChanged();
            }
        }
        
        public ResolveInfo getDefaultActivity() {
            return this.mDataModel.getDefaultActivity();
        }
        
        public void setShowFooterView(final boolean showFooterView) {
            if (this.mShowFooterView != showFooterView) {
                this.mShowFooterView = showFooterView;
                this.notifyDataSetChanged();
            }
        }
        
        public int getActivityCount() {
            return this.mDataModel.getActivityCount();
        }
        
        public int getHistorySize() {
            return this.mDataModel.getHistorySize();
        }
        
        public ActivityChooserModel getDataModel() {
            return this.mDataModel;
        }
        
        public void setShowDefaultActivity(final boolean showDefaultActivity, final boolean highlightDefaultActivity) {
            if (this.mShowDefaultActivity != showDefaultActivity || this.mHighlightDefaultActivity != highlightDefaultActivity) {
                this.mShowDefaultActivity = showDefaultActivity;
                this.mHighlightDefaultActivity = highlightDefaultActivity;
                this.notifyDataSetChanged();
            }
        }
        
        public boolean getShowDefaultActivity() {
            return this.mShowDefaultActivity;
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public static class InnerLayout extends LinearLayout
    {
        private static final int[] TINT_ATTRS;
        
        public InnerLayout(final Context context, final AttributeSet attrs) {
            super(context, attrs);
            final TintTypedArray a = TintTypedArray.obtainStyledAttributes(context, attrs, InnerLayout.TINT_ATTRS);
            this.setBackgroundDrawable(a.getDrawable(0));
            a.recycle();
        }
        
        static {
            TINT_ATTRS = new int[] { 16842964 };
        }
    }
}
