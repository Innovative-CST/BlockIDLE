package androidx.appcompat.view.menu;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.view.View;
import android.content.res.TypedArray;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.ImageView;
import androidx.annotation.RestrictTo;
import android.widget.AbsListView;
import android.widget.LinearLayout;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class ListMenuItemView extends LinearLayout implements MenuView.ItemView, AbsListView.SelectionBoundsAdjuster
{
    private static final String TAG = "ListMenuItemView";
    private MenuItemImpl mItemData;
    private ImageView mIconView;
    private RadioButton mRadioButton;
    private TextView mTitleView;
    private CheckBox mCheckBox;
    private TextView mShortcutView;
    private ImageView mSubMenuArrowView;
    private ImageView mGroupDivider;
    private LinearLayout mContent;
    private Drawable mBackground;
    private int mTextAppearance;
    private Context mTextAppearanceContext;
    private boolean mPreserveIconSpacing;
    private Drawable mSubMenuArrow;
    private boolean mHasListDivider;
    private LayoutInflater mInflater;
    private boolean mForceShowIcon;
    
    public ListMenuItemView(final Context context, final AttributeSet attrs) {
        this(context, attrs, R.attr.listMenuViewStyle);
    }
    
    public ListMenuItemView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs);
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(this.getContext(), attrs, R.styleable.MenuView, defStyleAttr, 0);
        this.mBackground = a.getDrawable(R.styleable.MenuView_android_itemBackground);
        this.mTextAppearance = a.getResourceId(R.styleable.MenuView_android_itemTextAppearance, -1);
        this.mPreserveIconSpacing = a.getBoolean(R.styleable.MenuView_preserveIconSpacing, false);
        this.mTextAppearanceContext = context;
        this.mSubMenuArrow = a.getDrawable(R.styleable.MenuView_subMenuArrow);
        final TypedArray b = context.getTheme().obtainStyledAttributes((AttributeSet)null, new int[] { 16843049 }, R.attr.dropDownListViewStyle, 0);
        this.mHasListDivider = b.hasValue(0);
        a.recycle();
        b.recycle();
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.setBackground(this.mBackground);
        this.mTitleView = (TextView)this.findViewById(R.id.title);
        if (this.mTextAppearance != -1) {
            this.mTitleView.setTextAppearance(this.mTextAppearanceContext, this.mTextAppearance);
        }
        this.mShortcutView = (TextView)this.findViewById(R.id.shortcut);
        this.mSubMenuArrowView = (ImageView)this.findViewById(R.id.submenuarrow);
        if (this.mSubMenuArrowView != null) {
            this.mSubMenuArrowView.setImageDrawable(this.mSubMenuArrow);
        }
        this.mGroupDivider = (ImageView)this.findViewById(R.id.group_divider);
        this.mContent = (LinearLayout)this.findViewById(R.id.content);
    }
    
    public void initialize(final MenuItemImpl itemData, final int menuType) {
        this.mItemData = itemData;
        this.setVisibility(itemData.isVisible() ? 0 : 8);
        this.setTitle(itemData.getTitleForItemView(this));
        this.setCheckable(itemData.isCheckable());
        this.setShortcut(itemData.shouldShowShortcut(), itemData.getShortcut());
        this.setIcon(itemData.getIcon());
        this.setEnabled(itemData.isEnabled());
        this.setSubMenuArrowVisible(itemData.hasSubMenu());
        this.setContentDescription(itemData.getContentDescription());
    }
    
    private void addContentView(final View v) {
        this.addContentView(v, -1);
    }
    
    private void addContentView(final View v, final int index) {
        if (this.mContent != null) {
            this.mContent.addView(v, index);
        }
        else {
            this.addView(v, index);
        }
    }
    
    public void setForceShowIcon(final boolean forceShow) {
        this.mForceShowIcon = forceShow;
        this.mPreserveIconSpacing = forceShow;
    }
    
    public void setTitle(final CharSequence title) {
        if (title != null) {
            this.mTitleView.setText(title);
            if (this.mTitleView.getVisibility() != 0) {
                this.mTitleView.setVisibility(0);
            }
        }
        else if (this.mTitleView.getVisibility() != 8) {
            this.mTitleView.setVisibility(8);
        }
    }
    
    public MenuItemImpl getItemData() {
        return this.mItemData;
    }
    
    public void setCheckable(final boolean checkable) {
        if (!checkable && this.mRadioButton == null && this.mCheckBox == null) {
            return;
        }
        CompoundButton compoundButton;
        CompoundButton otherCompoundButton;
        if (this.mItemData.isExclusiveCheckable()) {
            if (this.mRadioButton == null) {
                this.insertRadioButton();
            }
            compoundButton = (CompoundButton)this.mRadioButton;
            otherCompoundButton = (CompoundButton)this.mCheckBox;
        }
        else {
            if (this.mCheckBox == null) {
                this.insertCheckBox();
            }
            compoundButton = (CompoundButton)this.mCheckBox;
            otherCompoundButton = (CompoundButton)this.mRadioButton;
        }
        if (checkable) {
            compoundButton.setChecked(this.mItemData.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (otherCompoundButton != null && otherCompoundButton.getVisibility() != 8) {
                otherCompoundButton.setVisibility(8);
            }
        }
        else {
            if (this.mCheckBox != null) {
                this.mCheckBox.setVisibility(8);
            }
            if (this.mRadioButton != null) {
                this.mRadioButton.setVisibility(8);
            }
        }
    }
    
    public void setChecked(final boolean checked) {
        CompoundButton compoundButton;
        if (this.mItemData.isExclusiveCheckable()) {
            if (this.mRadioButton == null) {
                this.insertRadioButton();
            }
            compoundButton = (CompoundButton)this.mRadioButton;
        }
        else {
            if (this.mCheckBox == null) {
                this.insertCheckBox();
            }
            compoundButton = (CompoundButton)this.mCheckBox;
        }
        compoundButton.setChecked(checked);
    }
    
    private void setSubMenuArrowVisible(final boolean hasSubmenu) {
        if (this.mSubMenuArrowView != null) {
            this.mSubMenuArrowView.setVisibility(hasSubmenu ? 0 : 8);
        }
    }
    
    public void setShortcut(final boolean showShortcut, final char shortcutKey) {
        final int newVisibility = (showShortcut && this.mItemData.shouldShowShortcut()) ? 0 : 8;
        if (newVisibility == 0) {
            this.mShortcutView.setText((CharSequence)this.mItemData.getShortcutLabel());
        }
        if (this.mShortcutView.getVisibility() != newVisibility) {
            this.mShortcutView.setVisibility(newVisibility);
        }
    }
    
    public void setIcon(final Drawable icon) {
        final boolean showIcon = this.mItemData.shouldShowIcon() || this.mForceShowIcon;
        if (!showIcon && !this.mPreserveIconSpacing) {
            return;
        }
        if (this.mIconView == null && icon == null && !this.mPreserveIconSpacing) {
            return;
        }
        if (this.mIconView == null) {
            this.insertIconView();
        }
        if (icon != null || this.mPreserveIconSpacing) {
            this.mIconView.setImageDrawable(showIcon ? icon : null);
            if (this.mIconView.getVisibility() != 0) {
                this.mIconView.setVisibility(0);
            }
        }
        else {
            this.mIconView.setVisibility(8);
        }
    }
    
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        if (this.mIconView != null && this.mPreserveIconSpacing) {
            final ViewGroup.LayoutParams lp = this.getLayoutParams();
            final LinearLayout.LayoutParams iconLp = (LinearLayout.LayoutParams)this.mIconView.getLayoutParams();
            if (lp.height > 0 && iconLp.width <= 0) {
                iconLp.width = lp.height;
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
    
    private void insertIconView() {
        final LayoutInflater inflater = this.getInflater();
        this.addContentView((View)(this.mIconView = (ImageView)inflater.inflate(R.layout.abc_list_menu_item_icon, (ViewGroup)this, false)), 0);
    }
    
    private void insertRadioButton() {
        final LayoutInflater inflater = this.getInflater();
        this.addContentView((View)(this.mRadioButton = (RadioButton)inflater.inflate(R.layout.abc_list_menu_item_radio, (ViewGroup)this, false)));
    }
    
    private void insertCheckBox() {
        final LayoutInflater inflater = this.getInflater();
        this.addContentView((View)(this.mCheckBox = (CheckBox)inflater.inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup)this, false)));
    }
    
    public boolean prefersCondensedTitle() {
        return false;
    }
    
    public boolean showsIcon() {
        return this.mForceShowIcon;
    }
    
    private LayoutInflater getInflater() {
        if (this.mInflater == null) {
            this.mInflater = LayoutInflater.from(this.getContext());
        }
        return this.mInflater;
    }
    
    public void setGroupDividerEnabled(final boolean groupDividerEnabled) {
        if (this.mGroupDivider != null) {
            this.mGroupDivider.setVisibility((!this.mHasListDivider && groupDividerEnabled) ? 0 : 8);
        }
    }
    
    public void adjustListItemSelectionBounds(final Rect rect) {
        if (this.mGroupDivider != null && this.mGroupDivider.getVisibility() == 0) {
            final LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams)this.mGroupDivider.getLayoutParams();
            rect.top += this.mGroupDivider.getHeight() + lp.topMargin + lp.bottomMargin;
        }
    }
}
