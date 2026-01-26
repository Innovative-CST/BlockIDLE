package androidx.appcompat.app;

import android.widget.SimpleCursorAdapter;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.database.Cursor;
import java.lang.ref.WeakReference;
import android.widget.LinearLayout;
import android.text.TextUtils;
import androidx.appcompat.widget.LinearLayoutCompat;
import android.widget.FrameLayout;
import android.view.LayoutInflater;
import android.widget.AbsListView;
import androidx.core.view.ViewCompat;
import android.os.Build;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.annotation.Nullable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.DialogInterface;
import androidx.appcompat.R;
import android.util.TypedValue;
import android.os.Handler;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.widget.Button;
import android.view.View;
import android.widget.ListView;
import android.view.Window;
import android.content.Context;

class AlertController
{
    private final Context mContext;
    final AppCompatDialog mDialog;
    private final Window mWindow;
    private final int mButtonIconDimen;
    private CharSequence mTitle;
    private CharSequence mMessage;
    ListView mListView;
    private View mView;
    private int mViewLayoutResId;
    private int mViewSpacingLeft;
    private int mViewSpacingTop;
    private int mViewSpacingRight;
    private int mViewSpacingBottom;
    private boolean mViewSpacingSpecified;
    Button mButtonPositive;
    private CharSequence mButtonPositiveText;
    Message mButtonPositiveMessage;
    private Drawable mButtonPositiveIcon;
    Button mButtonNegative;
    private CharSequence mButtonNegativeText;
    Message mButtonNegativeMessage;
    private Drawable mButtonNegativeIcon;
    Button mButtonNeutral;
    private CharSequence mButtonNeutralText;
    Message mButtonNeutralMessage;
    private Drawable mButtonNeutralIcon;
    NestedScrollView mScrollView;
    private int mIconId;
    private Drawable mIcon;
    private ImageView mIconView;
    private TextView mTitleView;
    private TextView mMessageView;
    private View mCustomTitleView;
    ListAdapter mAdapter;
    int mCheckedItem;
    private int mAlertDialogLayout;
    private int mButtonPanelSideLayout;
    int mListLayout;
    int mMultiChoiceItemLayout;
    int mSingleChoiceItemLayout;
    int mListItemLayout;
    private boolean mShowTitle;
    private int mButtonPanelLayoutHint;
    Handler mHandler;
    private final View.OnClickListener mButtonHandler;
    
    private static boolean shouldCenterSingleButton(final Context context) {
        final TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, outValue, true);
        return outValue.data != 0;
    }
    
    public AlertController(final Context context, final AppCompatDialog di, final Window window) {
        this.mViewSpacingSpecified = false;
        this.mIconId = 0;
        this.mCheckedItem = -1;
        this.mButtonPanelLayoutHint = 0;
        this.mButtonHandler = (View.OnClickListener)new View.OnClickListener() {
            public void onClick(final View v) {
                Message m;
                if (v == AlertController.this.mButtonPositive && AlertController.this.mButtonPositiveMessage != null) {
                    m = Message.obtain(AlertController.this.mButtonPositiveMessage);
                }
                else if (v == AlertController.this.mButtonNegative && AlertController.this.mButtonNegativeMessage != null) {
                    m = Message.obtain(AlertController.this.mButtonNegativeMessage);
                }
                else if (v == AlertController.this.mButtonNeutral && AlertController.this.mButtonNeutralMessage != null) {
                    m = Message.obtain(AlertController.this.mButtonNeutralMessage);
                }
                else {
                    m = null;
                }
                if (m != null) {
                    m.sendToTarget();
                }
                AlertController.this.mHandler.obtainMessage(1, (Object)AlertController.this.mDialog).sendToTarget();
            }
        };
        this.mContext = context;
        this.mDialog = di;
        this.mWindow = window;
        this.mHandler = new ButtonHandler((DialogInterface)di);
        final TypedArray a = context.obtainStyledAttributes((AttributeSet)null, R.styleable.AlertDialog, R.attr.alertDialogStyle, 0);
        this.mAlertDialogLayout = a.getResourceId(R.styleable.AlertDialog_android_layout, 0);
        this.mButtonPanelSideLayout = a.getResourceId(R.styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.mListLayout = a.getResourceId(R.styleable.AlertDialog_listLayout, 0);
        this.mMultiChoiceItemLayout = a.getResourceId(R.styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.mSingleChoiceItemLayout = a.getResourceId(R.styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.mListItemLayout = a.getResourceId(R.styleable.AlertDialog_listItemLayout, 0);
        this.mShowTitle = a.getBoolean(R.styleable.AlertDialog_showTitle, true);
        this.mButtonIconDimen = a.getDimensionPixelSize(R.styleable.AlertDialog_buttonIconDimen, 0);
        a.recycle();
        di.supportRequestWindowFeature(1);
    }
    
    static boolean canTextInput(View v) {
        if (v.onCheckIsTextEditor()) {
            return true;
        }
        if (!(v instanceof ViewGroup)) {
            return false;
        }
        final ViewGroup vg = (ViewGroup)v;
        int i = vg.getChildCount();
        while (i > 0) {
            --i;
            v = vg.getChildAt(i);
            if (canTextInput(v)) {
                return true;
            }
        }
        return false;
    }
    
    public void installContent() {
        final int contentView = this.selectContentView();
        this.mDialog.setContentView(contentView);
        this.setupView();
    }
    
    private int selectContentView() {
        if (this.mButtonPanelSideLayout == 0) {
            return this.mAlertDialogLayout;
        }
        if (this.mButtonPanelLayoutHint == 1) {
            return this.mButtonPanelSideLayout;
        }
        return this.mAlertDialogLayout;
    }
    
    public void setTitle(final CharSequence title) {
        this.mTitle = title;
        if (this.mTitleView != null) {
            this.mTitleView.setText(title);
        }
    }
    
    public void setCustomTitle(final View customTitleView) {
        this.mCustomTitleView = customTitleView;
    }
    
    public void setMessage(final CharSequence message) {
        this.mMessage = message;
        if (this.mMessageView != null) {
            this.mMessageView.setText(message);
        }
    }
    
    public void setView(final int layoutResId) {
        this.mView = null;
        this.mViewLayoutResId = layoutResId;
        this.mViewSpacingSpecified = false;
    }
    
    public void setView(final View view) {
        this.mView = view;
        this.mViewLayoutResId = 0;
        this.mViewSpacingSpecified = false;
    }
    
    public void setView(final View view, final int viewSpacingLeft, final int viewSpacingTop, final int viewSpacingRight, final int viewSpacingBottom) {
        this.mView = view;
        this.mViewLayoutResId = 0;
        this.mViewSpacingSpecified = true;
        this.mViewSpacingLeft = viewSpacingLeft;
        this.mViewSpacingTop = viewSpacingTop;
        this.mViewSpacingRight = viewSpacingRight;
        this.mViewSpacingBottom = viewSpacingBottom;
    }
    
    public void setButtonPanelLayoutHint(final int layoutHint) {
        this.mButtonPanelLayoutHint = layoutHint;
    }
    
    public void setButton(final int whichButton, final CharSequence text, final DialogInterface.OnClickListener listener, Message msg, final Drawable icon) {
        if (msg == null && listener != null) {
            msg = this.mHandler.obtainMessage(whichButton, (Object)listener);
        }
        switch (whichButton) {
            case -1: {
                this.mButtonPositiveText = text;
                this.mButtonPositiveMessage = msg;
                this.mButtonPositiveIcon = icon;
                break;
            }
            case -2: {
                this.mButtonNegativeText = text;
                this.mButtonNegativeMessage = msg;
                this.mButtonNegativeIcon = icon;
                break;
            }
            case -3: {
                this.mButtonNeutralText = text;
                this.mButtonNeutralMessage = msg;
                this.mButtonNeutralIcon = icon;
                break;
            }
            default: {
                throw new IllegalArgumentException("Button does not exist");
            }
        }
    }
    
    public void setIcon(final int resId) {
        this.mIcon = null;
        this.mIconId = resId;
        if (this.mIconView != null) {
            if (resId != 0) {
                this.mIconView.setVisibility(0);
                this.mIconView.setImageResource(this.mIconId);
            }
            else {
                this.mIconView.setVisibility(8);
            }
        }
    }
    
    public void setIcon(final Drawable icon) {
        this.mIcon = icon;
        this.mIconId = 0;
        if (this.mIconView != null) {
            if (icon != null) {
                this.mIconView.setVisibility(0);
                this.mIconView.setImageDrawable(icon);
            }
            else {
                this.mIconView.setVisibility(8);
            }
        }
    }
    
    public int getIconAttributeResId(final int attrId) {
        final TypedValue out = new TypedValue();
        this.mContext.getTheme().resolveAttribute(attrId, out, true);
        return out.resourceId;
    }
    
    public ListView getListView() {
        return this.mListView;
    }
    
    public Button getButton(final int whichButton) {
        switch (whichButton) {
            case -1: {
                return this.mButtonPositive;
            }
            case -2: {
                return this.mButtonNegative;
            }
            case -3: {
                return this.mButtonNeutral;
            }
            default: {
                return null;
            }
        }
    }
    
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        return this.mScrollView != null && this.mScrollView.executeKeyEvent(event);
    }
    
    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        return this.mScrollView != null && this.mScrollView.executeKeyEvent(event);
    }
    
    @Nullable
    private ViewGroup resolvePanel(@Nullable View customPanel, @Nullable View defaultPanel) {
        if (customPanel == null) {
            if (defaultPanel instanceof ViewStub) {
                defaultPanel = ((ViewStub)defaultPanel).inflate();
            }
            return (ViewGroup)defaultPanel;
        }
        if (defaultPanel != null) {
            final ViewParent parent = defaultPanel.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup)parent).removeView(defaultPanel);
            }
        }
        if (customPanel instanceof ViewStub) {
            customPanel = ((ViewStub)customPanel).inflate();
        }
        return (ViewGroup)customPanel;
    }
    
    private void setupView() {
        final View parentPanel = this.mWindow.findViewById(R.id.parentPanel);
        final View defaultTopPanel = parentPanel.findViewById(R.id.topPanel);
        final View defaultContentPanel = parentPanel.findViewById(R.id.contentPanel);
        final View defaultButtonPanel = parentPanel.findViewById(R.id.buttonPanel);
        final ViewGroup customPanel = (ViewGroup)parentPanel.findViewById(R.id.customPanel);
        this.setupCustomContent(customPanel);
        final View customTopPanel = customPanel.findViewById(R.id.topPanel);
        final View customContentPanel = customPanel.findViewById(R.id.contentPanel);
        final View customButtonPanel = customPanel.findViewById(R.id.buttonPanel);
        final ViewGroup topPanel = this.resolvePanel(customTopPanel, defaultTopPanel);
        final ViewGroup contentPanel = this.resolvePanel(customContentPanel, defaultContentPanel);
        final ViewGroup buttonPanel = this.resolvePanel(customButtonPanel, defaultButtonPanel);
        this.setupContent(contentPanel);
        this.setupButtons(buttonPanel);
        this.setupTitle(topPanel);
        final boolean hasCustomPanel = customPanel != null && customPanel.getVisibility() != 8;
        final boolean hasTopPanel = topPanel != null && topPanel.getVisibility() != 8;
        final boolean hasButtonPanel = buttonPanel != null && buttonPanel.getVisibility() != 8;
        if (!hasButtonPanel && contentPanel != null) {
            final View spacer = contentPanel.findViewById(R.id.textSpacerNoButtons);
            if (spacer != null) {
                spacer.setVisibility(0);
            }
        }
        if (hasTopPanel) {
            if (this.mScrollView != null) {
                this.mScrollView.setClipToPadding(true);
            }
            View divider = null;
            if (this.mMessage != null || this.mListView != null) {
                divider = topPanel.findViewById(R.id.titleDividerNoCustom);
            }
            if (divider != null) {
                divider.setVisibility(0);
            }
        }
        else if (contentPanel != null) {
            final View spacer = contentPanel.findViewById(R.id.textSpacerNoTitle);
            if (spacer != null) {
                spacer.setVisibility(0);
            }
        }
        if (this.mListView instanceof RecycleListView) {
            ((RecycleListView)this.mListView).setHasDecor(hasTopPanel, hasButtonPanel);
        }
        if (!hasCustomPanel) {
            final View content = (View)((this.mListView != null) ? this.mListView : this.mScrollView);
            if (content != null) {
                final int indicators = (hasTopPanel ? 1 : 0) | (hasButtonPanel ? 2 : 0);
                this.setScrollIndicators(contentPanel, content, indicators, 3);
            }
        }
        final ListView listView = this.mListView;
        if (listView != null && this.mAdapter != null) {
            listView.setAdapter(this.mAdapter);
            final int checkedItem = this.mCheckedItem;
            if (checkedItem > -1) {
                listView.setItemChecked(checkedItem, true);
                listView.setSelection(checkedItem);
            }
        }
    }
    
    private void setScrollIndicators(final ViewGroup contentPanel, final View content, final int indicators, final int mask) {
        View indicatorUp = this.mWindow.findViewById(R.id.scrollIndicatorUp);
        View indicatorDown = this.mWindow.findViewById(R.id.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            ViewCompat.setScrollIndicators(content, indicators, mask);
            if (indicatorUp != null) {
                contentPanel.removeView(indicatorUp);
            }
            if (indicatorDown != null) {
                contentPanel.removeView(indicatorDown);
            }
        }
        else {
            if (indicatorUp != null && (indicators & 0x1) == 0x0) {
                contentPanel.removeView(indicatorUp);
                indicatorUp = null;
            }
            if (indicatorDown != null && (indicators & 0x2) == 0x0) {
                contentPanel.removeView(indicatorDown);
                indicatorDown = null;
            }
            if (indicatorUp != null || indicatorDown != null) {
                final View top = indicatorUp;
                final View bottom = indicatorDown;
                if (this.mMessage != null) {
                    this.mScrollView.setOnScrollChangeListener((NestedScrollView.OnScrollChangeListener)new NestedScrollView.OnScrollChangeListener() {
                        public void onScrollChange(final NestedScrollView v, final int scrollX, final int scrollY, final int oldScrollX, final int oldScrollY) {
                            AlertController.manageScrollIndicators((View)v, top, bottom);
                        }
                    });
                    this.mScrollView.post((Runnable)new Runnable() {
                        public void run() {
                            AlertController.manageScrollIndicators((View)AlertController.this.mScrollView, top, bottom);
                        }
                    });
                }
                else if (this.mListView != null) {
                    this.mListView.setOnScrollListener((AbsListView.OnScrollListener)new AbsListView.OnScrollListener() {
                        public void onScrollStateChanged(final AbsListView view, final int scrollState) {
                        }
                        
                        public void onScroll(final AbsListView v, final int firstVisibleItem, final int visibleItemCount, final int totalItemCount) {
                            AlertController.manageScrollIndicators((View)v, top, bottom);
                        }
                    });
                    this.mListView.post((Runnable)new Runnable() {
                        public void run() {
                            AlertController.manageScrollIndicators((View)AlertController.this.mListView, top, bottom);
                        }
                    });
                }
                else {
                    if (top != null) {
                        contentPanel.removeView(top);
                    }
                    if (bottom != null) {
                        contentPanel.removeView(bottom);
                    }
                }
            }
        }
    }
    
    private void setupCustomContent(final ViewGroup customPanel) {
        View customView;
        if (this.mView != null) {
            customView = this.mView;
        }
        else if (this.mViewLayoutResId != 0) {
            final LayoutInflater inflater = LayoutInflater.from(this.mContext);
            customView = inflater.inflate(this.mViewLayoutResId, customPanel, false);
        }
        else {
            customView = null;
        }
        final boolean hasCustomView = customView != null;
        if (!hasCustomView || !canTextInput(customView)) {
            this.mWindow.setFlags(131072, 131072);
        }
        if (hasCustomView) {
            final FrameLayout custom = (FrameLayout)this.mWindow.findViewById(R.id.custom);
            custom.addView(customView, new ViewGroup.LayoutParams(-1, -1));
            if (this.mViewSpacingSpecified) {
                custom.setPadding(this.mViewSpacingLeft, this.mViewSpacingTop, this.mViewSpacingRight, this.mViewSpacingBottom);
            }
            if (this.mListView != null) {
                ((LinearLayoutCompat.LayoutParams)customPanel.getLayoutParams()).weight = 0.0f;
            }
        }
        else {
            customPanel.setVisibility(8);
        }
    }
    
    private void setupTitle(final ViewGroup topPanel) {
        if (this.mCustomTitleView != null) {
            final ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(-1, -2);
            topPanel.addView(this.mCustomTitleView, 0, lp);
            final View titleTemplate = this.mWindow.findViewById(R.id.title_template);
            titleTemplate.setVisibility(8);
        }
        else {
            this.mIconView = (ImageView)this.mWindow.findViewById(16908294);
            final boolean hasTextTitle = !TextUtils.isEmpty(this.mTitle);
            if (hasTextTitle && this.mShowTitle) {
                (this.mTitleView = (TextView)this.mWindow.findViewById(R.id.alertTitle)).setText(this.mTitle);
                if (this.mIconId != 0) {
                    this.mIconView.setImageResource(this.mIconId);
                }
                else if (this.mIcon != null) {
                    this.mIconView.setImageDrawable(this.mIcon);
                }
                else {
                    this.mTitleView.setPadding(this.mIconView.getPaddingLeft(), this.mIconView.getPaddingTop(), this.mIconView.getPaddingRight(), this.mIconView.getPaddingBottom());
                    this.mIconView.setVisibility(8);
                }
            }
            else {
                final View titleTemplate = this.mWindow.findViewById(R.id.title_template);
                titleTemplate.setVisibility(8);
                this.mIconView.setVisibility(8);
                topPanel.setVisibility(8);
            }
        }
    }
    
    private void setupContent(final ViewGroup contentPanel) {
        (this.mScrollView = (NestedScrollView)this.mWindow.findViewById(R.id.scrollView)).setFocusable(false);
        this.mScrollView.setNestedScrollingEnabled(false);
        this.mMessageView = (TextView)contentPanel.findViewById(16908299);
        if (this.mMessageView == null) {
            return;
        }
        if (this.mMessage != null) {
            this.mMessageView.setText(this.mMessage);
        }
        else {
            this.mMessageView.setVisibility(8);
            this.mScrollView.removeView((View)this.mMessageView);
            if (this.mListView != null) {
                final ViewGroup scrollParent = (ViewGroup)this.mScrollView.getParent();
                final int childIndex = scrollParent.indexOfChild((View)this.mScrollView);
                scrollParent.removeViewAt(childIndex);
                scrollParent.addView((View)this.mListView, childIndex, new ViewGroup.LayoutParams(-1, -1));
            }
            else {
                contentPanel.setVisibility(8);
            }
        }
    }
    
    static void manageScrollIndicators(final View v, final View upIndicator, final View downIndicator) {
        if (upIndicator != null) {
            upIndicator.setVisibility(v.canScrollVertically(-1) ? 0 : 4);
        }
        if (downIndicator != null) {
            downIndicator.setVisibility(v.canScrollVertically(1) ? 0 : 4);
        }
    }
    
    private void setupButtons(final ViewGroup buttonPanel) {
        final int BIT_BUTTON_POSITIVE = 1;
        final int BIT_BUTTON_NEGATIVE = 2;
        final int BIT_BUTTON_NEUTRAL = 4;
        int whichButtons = 0;
        (this.mButtonPositive = (Button)buttonPanel.findViewById(16908313)).setOnClickListener(this.mButtonHandler);
        if (TextUtils.isEmpty(this.mButtonPositiveText) && this.mButtonPositiveIcon == null) {
            this.mButtonPositive.setVisibility(8);
        }
        else {
            this.mButtonPositive.setText(this.mButtonPositiveText);
            if (this.mButtonPositiveIcon != null) {
                this.mButtonPositiveIcon.setBounds(0, 0, this.mButtonIconDimen, this.mButtonIconDimen);
                this.mButtonPositive.setCompoundDrawables(this.mButtonPositiveIcon, (Drawable)null, (Drawable)null, (Drawable)null);
            }
            this.mButtonPositive.setVisibility(0);
            whichButtons |= BIT_BUTTON_POSITIVE;
        }
        (this.mButtonNegative = (Button)buttonPanel.findViewById(16908314)).setOnClickListener(this.mButtonHandler);
        if (TextUtils.isEmpty(this.mButtonNegativeText) && this.mButtonNegativeIcon == null) {
            this.mButtonNegative.setVisibility(8);
        }
        else {
            this.mButtonNegative.setText(this.mButtonNegativeText);
            if (this.mButtonNegativeIcon != null) {
                this.mButtonNegativeIcon.setBounds(0, 0, this.mButtonIconDimen, this.mButtonIconDimen);
                this.mButtonNegative.setCompoundDrawables(this.mButtonNegativeIcon, (Drawable)null, (Drawable)null, (Drawable)null);
            }
            this.mButtonNegative.setVisibility(0);
            whichButtons |= BIT_BUTTON_NEGATIVE;
        }
        (this.mButtonNeutral = (Button)buttonPanel.findViewById(16908315)).setOnClickListener(this.mButtonHandler);
        if (TextUtils.isEmpty(this.mButtonNeutralText) && this.mButtonNeutralIcon == null) {
            this.mButtonNeutral.setVisibility(8);
        }
        else {
            this.mButtonNeutral.setText(this.mButtonNeutralText);
            if (this.mButtonNeutralIcon != null) {
                this.mButtonNeutralIcon.setBounds(0, 0, this.mButtonIconDimen, this.mButtonIconDimen);
                this.mButtonNeutral.setCompoundDrawables(this.mButtonNeutralIcon, (Drawable)null, (Drawable)null, (Drawable)null);
            }
            this.mButtonNeutral.setVisibility(0);
            whichButtons |= BIT_BUTTON_NEUTRAL;
        }
        if (shouldCenterSingleButton(this.mContext)) {
            if (whichButtons == BIT_BUTTON_POSITIVE) {
                this.centerButton(this.mButtonPositive);
            }
            else if (whichButtons == BIT_BUTTON_NEGATIVE) {
                this.centerButton(this.mButtonNegative);
            }
            else if (whichButtons == BIT_BUTTON_NEUTRAL) {
                this.centerButton(this.mButtonNeutral);
            }
        }
        final boolean hasButtons = whichButtons != 0;
        if (!hasButtons) {
            buttonPanel.setVisibility(8);
        }
    }
    
    private void centerButton(final Button button) {
        final LinearLayout.LayoutParams params = (LinearLayout.LayoutParams)button.getLayoutParams();
        params.gravity = 1;
        params.weight = 0.5f;
        button.setLayoutParams((ViewGroup.LayoutParams)params);
    }
    
    private static final class ButtonHandler extends Handler
    {
        private static final int MSG_DISMISS_DIALOG = 1;
        private WeakReference<DialogInterface> mDialog;
        
        public ButtonHandler(final DialogInterface dialog) {
            this.mDialog = (WeakReference<DialogInterface>)new WeakReference((Object)dialog);
        }
        
        public void handleMessage(final Message msg) {
            switch (msg.what) {
                case -3:
                case -2:
                case -1: {
                    ((DialogInterface.OnClickListener)msg.obj).onClick((DialogInterface)this.mDialog.get(), msg.what);
                    break;
                }
                case 1: {
                    ((DialogInterface)msg.obj).dismiss();
                    break;
                }
            }
        }
    }
    
    public static class RecycleListView extends ListView
    {
        private final int mPaddingTopNoTitle;
        private final int mPaddingBottomNoButtons;
        
        public RecycleListView(final Context context) {
            this(context, null);
        }
        
        public RecycleListView(final Context context, final AttributeSet attrs) {
            super(context, attrs);
            final TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.RecycleListView);
            this.mPaddingBottomNoButtons = ta.getDimensionPixelOffset(R.styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.mPaddingTopNoTitle = ta.getDimensionPixelOffset(R.styleable.RecycleListView_paddingTopNoTitle, -1);
        }
        
        public void setHasDecor(final boolean hasTitle, final boolean hasButtons) {
            if (!hasButtons || !hasTitle) {
                final int paddingLeft = this.getPaddingLeft();
                final int paddingTop = hasTitle ? this.getPaddingTop() : this.mPaddingTopNoTitle;
                final int paddingRight = this.getPaddingRight();
                final int paddingBottom = hasButtons ? this.getPaddingBottom() : this.mPaddingBottomNoButtons;
                this.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            }
        }
    }
    
    public static class AlertParams
    {
        public final Context mContext;
        public final LayoutInflater mInflater;
        public int mIconId;
        public Drawable mIcon;
        public int mIconAttrId;
        public CharSequence mTitle;
        public View mCustomTitleView;
        public CharSequence mMessage;
        public CharSequence mPositiveButtonText;
        public Drawable mPositiveButtonIcon;
        public DialogInterface.OnClickListener mPositiveButtonListener;
        public CharSequence mNegativeButtonText;
        public Drawable mNegativeButtonIcon;
        public DialogInterface.OnClickListener mNegativeButtonListener;
        public CharSequence mNeutralButtonText;
        public Drawable mNeutralButtonIcon;
        public DialogInterface.OnClickListener mNeutralButtonListener;
        public boolean mCancelable;
        public DialogInterface.OnCancelListener mOnCancelListener;
        public DialogInterface.OnDismissListener mOnDismissListener;
        public DialogInterface.OnKeyListener mOnKeyListener;
        public CharSequence[] mItems;
        public ListAdapter mAdapter;
        public DialogInterface.OnClickListener mOnClickListener;
        public int mViewLayoutResId;
        public View mView;
        public int mViewSpacingLeft;
        public int mViewSpacingTop;
        public int mViewSpacingRight;
        public int mViewSpacingBottom;
        public boolean mViewSpacingSpecified;
        public boolean[] mCheckedItems;
        public boolean mIsMultiChoice;
        public boolean mIsSingleChoice;
        public int mCheckedItem;
        public DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
        public Cursor mCursor;
        public String mLabelColumn;
        public String mIsCheckedColumn;
        public boolean mForceInverseBackground;
        public AdapterView.OnItemSelectedListener mOnItemSelectedListener;
        public OnPrepareListViewListener mOnPrepareListViewListener;
        public boolean mRecycleOnMeasure;
        
        public AlertParams(final Context context) {
            this.mIconId = 0;
            this.mIconAttrId = 0;
            this.mViewSpacingSpecified = false;
            this.mCheckedItem = -1;
            this.mRecycleOnMeasure = true;
            this.mContext = context;
            this.mCancelable = true;
            this.mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
        }
        
        public void apply(final AlertController dialog) {
            if (this.mCustomTitleView != null) {
                dialog.setCustomTitle(this.mCustomTitleView);
            }
            else {
                if (this.mTitle != null) {
                    dialog.setTitle(this.mTitle);
                }
                if (this.mIcon != null) {
                    dialog.setIcon(this.mIcon);
                }
                if (this.mIconId != 0) {
                    dialog.setIcon(this.mIconId);
                }
                if (this.mIconAttrId != 0) {
                    dialog.setIcon(dialog.getIconAttributeResId(this.mIconAttrId));
                }
            }
            if (this.mMessage != null) {
                dialog.setMessage(this.mMessage);
            }
            if (this.mPositiveButtonText != null || this.mPositiveButtonIcon != null) {
                dialog.setButton(-1, this.mPositiveButtonText, this.mPositiveButtonListener, null, this.mPositiveButtonIcon);
            }
            if (this.mNegativeButtonText != null || this.mNegativeButtonIcon != null) {
                dialog.setButton(-2, this.mNegativeButtonText, this.mNegativeButtonListener, null, this.mNegativeButtonIcon);
            }
            if (this.mNeutralButtonText != null || this.mNeutralButtonIcon != null) {
                dialog.setButton(-3, this.mNeutralButtonText, this.mNeutralButtonListener, null, this.mNeutralButtonIcon);
            }
            if (this.mItems != null || this.mCursor != null || this.mAdapter != null) {
                this.createListView(dialog);
            }
            if (this.mView != null) {
                if (this.mViewSpacingSpecified) {
                    dialog.setView(this.mView, this.mViewSpacingLeft, this.mViewSpacingTop, this.mViewSpacingRight, this.mViewSpacingBottom);
                }
                else {
                    dialog.setView(this.mView);
                }
            }
            else if (this.mViewLayoutResId != 0) {
                dialog.setView(this.mViewLayoutResId);
            }
        }
        
        private void createListView(final AlertController dialog) {
            final RecycleListView listView = (RecycleListView)this.mInflater.inflate(dialog.mListLayout, (ViewGroup)null);
            ListAdapter adapter;
            if (this.mIsMultiChoice) {
                if (this.mCursor == null) {
                    adapter = (ListAdapter)new ArrayAdapter<CharSequence>(this.mContext, dialog.mMultiChoiceItemLayout, 16908308, this.mItems) {
                        public View getView(final int position, final View convertView, final ViewGroup parent) {
                            final View view = super.getView(position, convertView, parent);
                            if (AlertParams.this.mCheckedItems != null) {
                                final boolean isItemChecked = AlertParams.this.mCheckedItems[position];
                                if (isItemChecked) {
                                    listView.setItemChecked(position, true);
                                }
                            }
                            return view;
                        }
                    };
                }
                else {
                    adapter = (ListAdapter)new CursorAdapter(this.mContext, this.mCursor, false) {
                        private final int mLabelIndex;
                        private final int mIsCheckedIndex;
                        
                        {
                            final Cursor cursor = this.getCursor();
                            this.mLabelIndex = cursor.getColumnIndexOrThrow(AlertParams.this.mLabelColumn);
                            this.mIsCheckedIndex = cursor.getColumnIndexOrThrow(AlertParams.this.mIsCheckedColumn);
                        }
                        
                        public void bindView(final View view, final Context context, final Cursor cursor) {
                            final CheckedTextView text = (CheckedTextView)view.findViewById(16908308);
                            text.setText((CharSequence)cursor.getString(this.mLabelIndex));
                            listView.setItemChecked(cursor.getPosition(), cursor.getInt(this.mIsCheckedIndex) == 1);
                        }
                        
                        public View newView(final Context context, final Cursor cursor, final ViewGroup parent) {
                            return AlertParams.this.mInflater.inflate(dialog.mMultiChoiceItemLayout, parent, false);
                        }
                    };
                }
            }
            else {
                int layout;
                if (this.mIsSingleChoice) {
                    layout = dialog.mSingleChoiceItemLayout;
                }
                else {
                    layout = dialog.mListItemLayout;
                }
                if (this.mCursor != null) {
                    adapter = (ListAdapter)new SimpleCursorAdapter(this.mContext, layout, this.mCursor, new String[] { this.mLabelColumn }, new int[] { 16908308 });
                }
                else if (this.mAdapter != null) {
                    adapter = this.mAdapter;
                }
                else {
                    adapter = (ListAdapter)new CheckedItemAdapter(this.mContext, layout, 16908308, this.mItems);
                }
            }
            if (this.mOnPrepareListViewListener != null) {
                this.mOnPrepareListViewListener.onPrepareListView(listView);
            }
            dialog.mAdapter = adapter;
            dialog.mCheckedItem = this.mCheckedItem;
            if (this.mOnClickListener != null) {
                listView.setOnItemClickListener((AdapterView.OnItemClickListener)new AdapterView.OnItemClickListener() {
                    public void onItemClick(final AdapterView<?> parent, final View v, final int position, final long id) {
                        AlertParams.this.mOnClickListener.onClick((DialogInterface)dialog.mDialog, position);
                        if (!AlertParams.this.mIsSingleChoice) {
                            dialog.mDialog.dismiss();
                        }
                    }
                });
            }
            else if (this.mOnCheckboxClickListener != null) {
                listView.setOnItemClickListener((AdapterView.OnItemClickListener)new AdapterView.OnItemClickListener() {
                    public void onItemClick(final AdapterView<?> parent, final View v, final int position, final long id) {
                        if (AlertParams.this.mCheckedItems != null) {
                            AlertParams.this.mCheckedItems[position] = listView.isItemChecked(position);
                        }
                        AlertParams.this.mOnCheckboxClickListener.onClick((DialogInterface)dialog.mDialog, position, listView.isItemChecked(position));
                    }
                });
            }
            if (this.mOnItemSelectedListener != null) {
                listView.setOnItemSelectedListener(this.mOnItemSelectedListener);
            }
            if (this.mIsSingleChoice) {
                listView.setChoiceMode(1);
            }
            else if (this.mIsMultiChoice) {
                listView.setChoiceMode(2);
            }
            dialog.mListView = listView;
        }
        
        public interface OnPrepareListViewListener
        {
            void onPrepareListView(final ListView p0);
        }
    }
    
    private static class CheckedItemAdapter extends ArrayAdapter<CharSequence>
    {
        public CheckedItemAdapter(final Context context, final int resource, final int textViewResourceId, final CharSequence[] objects) {
            super(context, resource, textViewResourceId, (Object[])objects);
        }
        
        public boolean hasStableIds() {
            return true;
        }
        
        public long getItemId(final int position) {
            return position;
        }
    }
}
