package androidx.appcompat.view.menu;

import android.os.Parcelable;
import androidx.appcompat.widget.TooltipCompat;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.Button;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.content.res.Resources;
import androidx.appcompat.R;
import android.util.AttributeSet;
import android.content.Context;
import androidx.appcompat.widget.ForwardingListener;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuView;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class ActionMenuItemView extends AppCompatTextView implements MenuView.ItemView, View.OnClickListener, ActionMenuView.ActionMenuChildView
{
    private static final String TAG = "ActionMenuItemView";
    MenuItemImpl mItemData;
    private CharSequence mTitle;
    private Drawable mIcon;
    MenuBuilder.ItemInvoker mItemInvoker;
    private ForwardingListener mForwardingListener;
    PopupCallback mPopupCallback;
    private boolean mAllowTextWithIcon;
    private boolean mExpandedFormat;
    private int mMinWidth;
    private int mSavedPaddingLeft;
    private static final int MAX_ICON_SIZE = 32;
    private int mMaxIconSize;
    
    public ActionMenuItemView(final Context context) {
        this(context, null);
    }
    
    public ActionMenuItemView(final Context context, final AttributeSet attrs) {
        this(context, attrs, 0);
    }
    
    public ActionMenuItemView(final Context context, final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);
        final Resources res = context.getResources();
        this.mAllowTextWithIcon = this.shouldAllowTextWithIcon();
        final TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ActionMenuItemView, defStyle, 0);
        this.mMinWidth = a.getDimensionPixelSize(R.styleable.ActionMenuItemView_android_minWidth, 0);
        a.recycle();
        final float density = res.getDisplayMetrics().density;
        this.mMaxIconSize = (int)(32.0f * density + 0.5f);
        this.setOnClickListener((View.OnClickListener)this);
        this.mSavedPaddingLeft = -1;
        this.setSaveEnabled(false);
    }
    
    public void onConfigurationChanged(final Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.mAllowTextWithIcon = this.shouldAllowTextWithIcon();
        this.updateTextButtonVisibility();
    }
    
    public CharSequence getAccessibilityClassName() {
        return (CharSequence)Button.class.getName();
    }
    
    private boolean shouldAllowTextWithIcon() {
        final Configuration config = this.getContext().getResources().getConfiguration();
        final int widthDp = config.screenWidthDp;
        final int heightDp = config.screenHeightDp;
        return widthDp >= 480 || (widthDp >= 640 && heightDp >= 480) || config.orientation == 2;
    }
    
    public void setPadding(final int l, final int t, final int r, final int b) {
        super.setPadding(this.mSavedPaddingLeft = l, t, r, b);
    }
    
    @Override
    public MenuItemImpl getItemData() {
        return this.mItemData;
    }
    
    @Override
    public void initialize(final MenuItemImpl itemData, final int menuType) {
        this.mItemData = itemData;
        this.setIcon(itemData.getIcon());
        this.setTitle(itemData.getTitleForItemView(this));
        this.setId(itemData.getItemId());
        this.setVisibility(itemData.isVisible() ? 0 : 8);
        this.setEnabled(itemData.isEnabled());
        if (itemData.hasSubMenu() && this.mForwardingListener == null) {
            this.mForwardingListener = new ActionMenuItemForwardingListener();
        }
    }
    
    public boolean onTouchEvent(final MotionEvent e) {
        return (this.mItemData.hasSubMenu() && this.mForwardingListener != null && this.mForwardingListener.onTouch((View)this, e)) || super.onTouchEvent(e);
    }
    
    public void onClick(final View v) {
        if (this.mItemInvoker != null) {
            this.mItemInvoker.invokeItem(this.mItemData);
        }
    }
    
    public void setItemInvoker(final MenuBuilder.ItemInvoker invoker) {
        this.mItemInvoker = invoker;
    }
    
    public void setPopupCallback(final PopupCallback popupCallback) {
        this.mPopupCallback = popupCallback;
    }
    
    @Override
    public boolean prefersCondensedTitle() {
        return true;
    }
    
    @Override
    public void setCheckable(final boolean checkable) {
    }
    
    @Override
    public void setChecked(final boolean checked) {
    }
    
    public void setExpandedFormat(final boolean expandedFormat) {
        if (this.mExpandedFormat != expandedFormat) {
            this.mExpandedFormat = expandedFormat;
            if (this.mItemData != null) {
                this.mItemData.actionFormatChanged();
            }
        }
    }
    
    private void updateTextButtonVisibility() {
        boolean visible = !TextUtils.isEmpty(this.mTitle);
        visible &= (this.mIcon == null || (this.mItemData.showsTextAsAction() && (this.mAllowTextWithIcon || this.mExpandedFormat)));
        this.setText(visible ? this.mTitle : null);
        final CharSequence contentDescription = this.mItemData.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            this.setContentDescription(visible ? null : this.mItemData.getTitle());
        }
        else {
            this.setContentDescription(contentDescription);
        }
        final CharSequence tooltipText = this.mItemData.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            TooltipCompat.setTooltipText((View)this, visible ? null : this.mItemData.getTitle());
        }
        else {
            TooltipCompat.setTooltipText((View)this, tooltipText);
        }
    }
    
    @Override
    public void setIcon(final Drawable icon) {
        this.mIcon = icon;
        if (icon != null) {
            int width = icon.getIntrinsicWidth();
            int height = icon.getIntrinsicHeight();
            if (width > this.mMaxIconSize) {
                final float scale = this.mMaxIconSize / (float)width;
                width = this.mMaxIconSize;
                height *= (int)scale;
            }
            if (height > this.mMaxIconSize) {
                final float scale = this.mMaxIconSize / (float)height;
                height = this.mMaxIconSize;
                width *= (int)scale;
            }
            icon.setBounds(0, 0, width, height);
        }
        this.setCompoundDrawables(icon, null, null, null);
        this.updateTextButtonVisibility();
    }
    
    public boolean hasText() {
        return !TextUtils.isEmpty(this.getText());
    }
    
    @Override
    public void setShortcut(final boolean showShortcut, final char shortcutKey) {
    }
    
    @Override
    public void setTitle(final CharSequence title) {
        this.mTitle = title;
        this.updateTextButtonVisibility();
    }
    
    @Override
    public boolean showsIcon() {
        return true;
    }
    
    public boolean needsDividerBefore() {
        return this.hasText() && this.mItemData.getIcon() == null;
    }
    
    public boolean needsDividerAfter() {
        return this.hasText();
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        final boolean textVisible = this.hasText();
        if (textVisible && this.mSavedPaddingLeft >= 0) {
            super.setPadding(this.mSavedPaddingLeft, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        final int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        final int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        final int oldMeasuredWidth = this.getMeasuredWidth();
        final int targetWidth = (widthMode == Integer.MIN_VALUE) ? Math.min(widthSize, this.mMinWidth) : this.mMinWidth;
        if (widthMode != 1073741824 && this.mMinWidth > 0 && oldMeasuredWidth < targetWidth) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(targetWidth, 1073741824), heightMeasureSpec);
        }
        if (!textVisible && this.mIcon != null) {
            final int w = this.getMeasuredWidth();
            final int dw = this.mIcon.getBounds().width();
            super.setPadding((w - dw) / 2, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
    }
    
    public void onRestoreInstanceState(final Parcelable state) {
        super.onRestoreInstanceState((Parcelable)null);
    }
    
    private class ActionMenuItemForwardingListener extends ForwardingListener
    {
        public ActionMenuItemForwardingListener() {
            super((View)ActionMenuItemView.this);
        }
        
        @Override
        public ShowableListMenu getPopup() {
            if (ActionMenuItemView.this.mPopupCallback != null) {
                return ActionMenuItemView.this.mPopupCallback.getPopup();
            }
            return null;
        }
        
        @Override
        protected boolean onForwardingStarted() {
            if (ActionMenuItemView.this.mItemInvoker != null && ActionMenuItemView.this.mItemInvoker.invokeItem(ActionMenuItemView.this.mItemData)) {
                final ShowableListMenu popup = this.getPopup();
                return popup != null && popup.isShowing();
            }
            return false;
        }
    }
    
    public abstract static class PopupCallback
    {
        public abstract ShowableListMenu getPopup();
    }
}
