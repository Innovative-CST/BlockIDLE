package androidx.appcompat.widget;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.AbsListView;
import android.view.KeyEvent;
import android.widget.ListView;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.util.Log;
import android.os.Build;
import androidx.core.widget.PopupWindowCompat;
import androidx.annotation.RestrictTo;
import android.content.res.TypedArray;
import androidx.annotation.StyleRes;
import androidx.annotation.AttrRes;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.appcompat.R;
import androidx.annotation.NonNull;
import android.widget.PopupWindow;
import android.graphics.Rect;
import android.os.Handler;
import android.widget.AdapterView;
import android.graphics.drawable.Drawable;
import android.database.DataSetObserver;
import android.view.View;
import android.widget.ListAdapter;
import android.content.Context;
import java.lang.reflect.Method;
import androidx.appcompat.view.menu.ShowableListMenu;

public class ListPopupWindow implements ShowableListMenu
{
    private static final String TAG = "ListPopupWindow";
    private static final boolean DEBUG = false;
    static final int EXPAND_LIST_TIMEOUT = 250;
    private static Method sSetClipToWindowEnabledMethod;
    private static Method sGetMaxAvailableHeightMethod;
    private static Method sSetEpicenterBoundsMethod;
    private Context mContext;
    private ListAdapter mAdapter;
    DropDownListView mDropDownList;
    private int mDropDownHeight;
    private int mDropDownWidth;
    private int mDropDownHorizontalOffset;
    private int mDropDownVerticalOffset;
    private int mDropDownWindowLayoutType;
    private boolean mDropDownVerticalOffsetSet;
    private boolean mOverlapAnchor;
    private boolean mOverlapAnchorSet;
    private int mDropDownGravity;
    private boolean mDropDownAlwaysVisible;
    private boolean mForceIgnoreOutsideTouch;
    int mListItemExpandMaximum;
    private View mPromptView;
    private int mPromptPosition;
    private DataSetObserver mObserver;
    private View mDropDownAnchorView;
    private Drawable mDropDownListHighlight;
    private AdapterView.OnItemClickListener mItemClickListener;
    private AdapterView.OnItemSelectedListener mItemSelectedListener;
    final ResizePopupRunnable mResizePopupRunnable;
    private final PopupTouchInterceptor mTouchInterceptor;
    private final PopupScrollListener mScrollListener;
    private final ListSelectorHider mHideSelector;
    private Runnable mShowDropDownRunnable;
    final Handler mHandler;
    private final Rect mTempRect;
    private Rect mEpicenterBounds;
    private boolean mModal;
    PopupWindow mPopup;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    public static final int MATCH_PARENT = -1;
    public static final int WRAP_CONTENT = -2;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    
    public ListPopupWindow(@NonNull final Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }
    
    public ListPopupWindow(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, R.attr.listPopupWindowStyle);
    }
    
    public ListPopupWindow(@NonNull final Context context, @Nullable final AttributeSet attrs, @AttrRes final int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }
    
    public ListPopupWindow(@NonNull final Context context, @Nullable final AttributeSet attrs, @AttrRes final int defStyleAttr, @StyleRes final int defStyleRes) {
        this.mDropDownHeight = -2;
        this.mDropDownWidth = -2;
        this.mDropDownWindowLayoutType = 1002;
        this.mDropDownGravity = 0;
        this.mDropDownAlwaysVisible = false;
        this.mForceIgnoreOutsideTouch = false;
        this.mListItemExpandMaximum = Integer.MAX_VALUE;
        this.mPromptPosition = 0;
        this.mResizePopupRunnable = new ResizePopupRunnable();
        this.mTouchInterceptor = new PopupTouchInterceptor();
        this.mScrollListener = new PopupScrollListener();
        this.mHideSelector = new ListSelectorHider();
        this.mTempRect = new Rect();
        this.mContext = context;
        this.mHandler = new Handler(context.getMainLooper());
        final TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ListPopupWindow, defStyleAttr, defStyleRes);
        this.mDropDownHorizontalOffset = a.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.mDropDownVerticalOffset = a.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.mDropDownVerticalOffset != 0) {
            this.mDropDownVerticalOffsetSet = true;
        }
        a.recycle();
        (this.mPopup = new AppCompatPopupWindow(context, attrs, defStyleAttr, defStyleRes)).setInputMethodMode(1);
    }
    
    public void setAdapter(@Nullable final ListAdapter adapter) {
        if (this.mObserver == null) {
            this.mObserver = new PopupDataSetObserver();
        }
        else if (this.mAdapter != null) {
            this.mAdapter.unregisterDataSetObserver(this.mObserver);
        }
        if ((this.mAdapter = adapter) != null) {
            adapter.registerDataSetObserver(this.mObserver);
        }
        if (this.mDropDownList != null) {
            this.mDropDownList.setAdapter(this.mAdapter);
        }
    }
    
    public void setPromptPosition(final int position) {
        this.mPromptPosition = position;
    }
    
    public int getPromptPosition() {
        return this.mPromptPosition;
    }
    
    public void setModal(final boolean modal) {
        this.mModal = modal;
        this.mPopup.setFocusable(modal);
    }
    
    public boolean isModal() {
        return this.mModal;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setForceIgnoreOutsideTouch(final boolean forceIgnoreOutsideTouch) {
        this.mForceIgnoreOutsideTouch = forceIgnoreOutsideTouch;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setDropDownAlwaysVisible(final boolean dropDownAlwaysVisible) {
        this.mDropDownAlwaysVisible = dropDownAlwaysVisible;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public boolean isDropDownAlwaysVisible() {
        return this.mDropDownAlwaysVisible;
    }
    
    public void setSoftInputMode(final int mode) {
        this.mPopup.setSoftInputMode(mode);
    }
    
    public int getSoftInputMode() {
        return this.mPopup.getSoftInputMode();
    }
    
    public void setListSelector(final Drawable selector) {
        this.mDropDownListHighlight = selector;
    }
    
    @Nullable
    public Drawable getBackground() {
        return this.mPopup.getBackground();
    }
    
    public void setBackgroundDrawable(@Nullable final Drawable d) {
        this.mPopup.setBackgroundDrawable(d);
    }
    
    public void setAnimationStyle(@StyleRes final int animationStyle) {
        this.mPopup.setAnimationStyle(animationStyle);
    }
    
    @StyleRes
    public int getAnimationStyle() {
        return this.mPopup.getAnimationStyle();
    }
    
    @Nullable
    public View getAnchorView() {
        return this.mDropDownAnchorView;
    }
    
    public void setAnchorView(@Nullable final View anchor) {
        this.mDropDownAnchorView = anchor;
    }
    
    public int getHorizontalOffset() {
        return this.mDropDownHorizontalOffset;
    }
    
    public void setHorizontalOffset(final int offset) {
        this.mDropDownHorizontalOffset = offset;
    }
    
    public int getVerticalOffset() {
        if (!this.mDropDownVerticalOffsetSet) {
            return 0;
        }
        return this.mDropDownVerticalOffset;
    }
    
    public void setVerticalOffset(final int offset) {
        this.mDropDownVerticalOffset = offset;
        this.mDropDownVerticalOffsetSet = true;
    }
    
    public void setEpicenterBounds(@Nullable final Rect bounds) {
        this.mEpicenterBounds = ((bounds != null) ? new Rect(bounds) : null);
    }
    
    @Nullable
    public Rect getEpicenterBounds() {
        return (this.mEpicenterBounds != null) ? new Rect(this.mEpicenterBounds) : null;
    }
    
    public void setDropDownGravity(final int gravity) {
        this.mDropDownGravity = gravity;
    }
    
    public int getWidth() {
        return this.mDropDownWidth;
    }
    
    public void setWidth(final int width) {
        this.mDropDownWidth = width;
    }
    
    public void setContentWidth(final int width) {
        final Drawable popupBackground = this.mPopup.getBackground();
        if (popupBackground != null) {
            popupBackground.getPadding(this.mTempRect);
            this.mDropDownWidth = this.mTempRect.left + this.mTempRect.right + width;
        }
        else {
            this.setWidth(width);
        }
    }
    
    public int getHeight() {
        return this.mDropDownHeight;
    }
    
    public void setHeight(final int height) {
        if (height < 0 && -2 != height && -1 != height) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.mDropDownHeight = height;
    }
    
    public void setWindowLayoutType(final int layoutType) {
        this.mDropDownWindowLayoutType = layoutType;
    }
    
    public void setOnItemClickListener(@Nullable final AdapterView.OnItemClickListener clickListener) {
        this.mItemClickListener = clickListener;
    }
    
    public void setOnItemSelectedListener(@Nullable final AdapterView.OnItemSelectedListener selectedListener) {
        this.mItemSelectedListener = selectedListener;
    }
    
    public void setPromptView(@Nullable final View prompt) {
        final boolean showing = this.isShowing();
        if (showing) {
            this.removePromptView();
        }
        this.mPromptView = prompt;
        if (showing) {
            this.show();
        }
    }
    
    public void postShow() {
        this.mHandler.post(this.mShowDropDownRunnable);
    }
    
    @Override
    public void show() {
        final int height = this.buildDropDown();
        final boolean noInputMethod = this.isInputMethodNotNeeded();
        PopupWindowCompat.setWindowLayoutType(this.mPopup, this.mDropDownWindowLayoutType);
        if (this.mPopup.isShowing()) {
            if (!this.getAnchorView().isAttachedToWindow()) {
                return;
            }
            int widthSpec;
            if (this.mDropDownWidth == -1) {
                widthSpec = -1;
            }
            else if (this.mDropDownWidth == -2) {
                widthSpec = this.getAnchorView().getWidth();
            }
            else {
                widthSpec = this.mDropDownWidth;
            }
            int heightSpec;
            if (this.mDropDownHeight == -1) {
                heightSpec = (noInputMethod ? height : -1);
                if (noInputMethod) {
                    this.mPopup.setWidth((this.mDropDownWidth == -1) ? -1 : 0);
                    this.mPopup.setHeight(0);
                }
                else {
                    this.mPopup.setWidth((this.mDropDownWidth == -1) ? -1 : 0);
                    this.mPopup.setHeight(-1);
                }
            }
            else if (this.mDropDownHeight == -2) {
                heightSpec = height;
            }
            else {
                heightSpec = this.mDropDownHeight;
            }
            this.mPopup.setOutsideTouchable(!this.mForceIgnoreOutsideTouch && !this.mDropDownAlwaysVisible);
            this.mPopup.update(this.getAnchorView(), this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, (widthSpec < 0) ? -1 : widthSpec, (heightSpec < 0) ? -1 : heightSpec);
        }
        else {
            int widthSpec;
            if (this.mDropDownWidth == -1) {
                widthSpec = -1;
            }
            else if (this.mDropDownWidth == -2) {
                widthSpec = this.getAnchorView().getWidth();
            }
            else {
                widthSpec = this.mDropDownWidth;
            }
            int heightSpec;
            if (this.mDropDownHeight == -1) {
                heightSpec = -1;
            }
            else if (this.mDropDownHeight == -2) {
                heightSpec = height;
            }
            else {
                heightSpec = this.mDropDownHeight;
            }
            this.mPopup.setWidth(widthSpec);
            this.mPopup.setHeight(heightSpec);
            this.setPopupClipToScreenEnabled(true);
            this.mPopup.setOutsideTouchable(!this.mForceIgnoreOutsideTouch && !this.mDropDownAlwaysVisible);
            this.mPopup.setTouchInterceptor((View.OnTouchListener)this.mTouchInterceptor);
            if (this.mOverlapAnchorSet) {
                PopupWindowCompat.setOverlapAnchor(this.mPopup, this.mOverlapAnchor);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                if (ListPopupWindow.sSetEpicenterBoundsMethod != null) {
                    try {
                        ListPopupWindow.sSetEpicenterBoundsMethod.invoke((Object)this.mPopup, new Object[] { this.mEpicenterBounds });
                    }
                    catch (final Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", (Throwable)e);
                    }
                }
            }
            else {
                Api29Impl.setEpicenterBounds(this.mPopup, this.mEpicenterBounds);
            }
            PopupWindowCompat.showAsDropDown(this.mPopup, this.getAnchorView(), this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, this.mDropDownGravity);
            this.mDropDownList.setSelection(-1);
            if (!this.mModal || this.mDropDownList.isInTouchMode()) {
                this.clearListSelection();
            }
            if (!this.mModal) {
                this.mHandler.post((Runnable)this.mHideSelector);
            }
        }
    }
    
    @Override
    public void dismiss() {
        this.mPopup.dismiss();
        this.removePromptView();
        this.mPopup.setContentView((View)null);
        this.mDropDownList = null;
        this.mHandler.removeCallbacks((Runnable)this.mResizePopupRunnable);
    }
    
    public void setOnDismissListener(@Nullable final PopupWindow.OnDismissListener listener) {
        this.mPopup.setOnDismissListener(listener);
    }
    
    private void removePromptView() {
        if (this.mPromptView != null) {
            final ViewParent parent = this.mPromptView.getParent();
            if (parent instanceof ViewGroup) {
                final ViewGroup group = (ViewGroup)parent;
                group.removeView(this.mPromptView);
            }
        }
    }
    
    public void setInputMethodMode(final int mode) {
        this.mPopup.setInputMethodMode(mode);
    }
    
    public int getInputMethodMode() {
        return this.mPopup.getInputMethodMode();
    }
    
    public void setSelection(final int position) {
        final DropDownListView list = this.mDropDownList;
        if (this.isShowing() && list != null) {
            list.setListSelectionHidden(false);
            list.setSelection(position);
            if (list.getChoiceMode() != 0) {
                list.setItemChecked(position, true);
            }
        }
    }
    
    public void clearListSelection() {
        final DropDownListView list = this.mDropDownList;
        if (list != null) {
            list.setListSelectionHidden(true);
            list.requestLayout();
        }
    }
    
    @Override
    public boolean isShowing() {
        return this.mPopup.isShowing();
    }
    
    public boolean isInputMethodNotNeeded() {
        return this.mPopup.getInputMethodMode() == 2;
    }
    
    public boolean performItemClick(final int position) {
        if (this.isShowing()) {
            if (this.mItemClickListener != null) {
                final DropDownListView list = this.mDropDownList;
                final View child = list.getChildAt(position - list.getFirstVisiblePosition());
                final ListAdapter adapter = list.getAdapter();
                this.mItemClickListener.onItemClick((AdapterView)list, child, position, adapter.getItemId(position));
            }
            return true;
        }
        return false;
    }
    
    @Nullable
    public Object getSelectedItem() {
        if (!this.isShowing()) {
            return null;
        }
        return this.mDropDownList.getSelectedItem();
    }
    
    public int getSelectedItemPosition() {
        if (!this.isShowing()) {
            return -1;
        }
        return this.mDropDownList.getSelectedItemPosition();
    }
    
    public long getSelectedItemId() {
        if (!this.isShowing()) {
            return Long.MIN_VALUE;
        }
        return this.mDropDownList.getSelectedItemId();
    }
    
    @Nullable
    public View getSelectedView() {
        if (!this.isShowing()) {
            return null;
        }
        return this.mDropDownList.getSelectedView();
    }
    
    @Nullable
    @Override
    public ListView getListView() {
        return this.mDropDownList;
    }
    
    @NonNull
    DropDownListView createDropDownListView(final Context context, final boolean hijackFocus) {
        return new DropDownListView(context, hijackFocus);
    }
    
    void setListItemExpandMax(final int max) {
        this.mListItemExpandMaximum = max;
    }
    
    public boolean onKeyDown(final int keyCode, @NonNull final KeyEvent event) {
        if (this.isShowing() && keyCode != 62 && (this.mDropDownList.getSelectedItemPosition() >= 0 || !isConfirmKey(keyCode))) {
            final int curIndex = this.mDropDownList.getSelectedItemPosition();
            final boolean below = !this.mPopup.isAboveAnchor();
            final ListAdapter adapter = this.mAdapter;
            int firstItem = Integer.MAX_VALUE;
            int lastItem = Integer.MIN_VALUE;
            if (adapter != null) {
                final boolean allEnabled = adapter.areAllItemsEnabled();
                firstItem = (allEnabled ? 0 : this.mDropDownList.lookForSelectablePosition(0, true));
                lastItem = (allEnabled ? (adapter.getCount() - 1) : this.mDropDownList.lookForSelectablePosition(adapter.getCount() - 1, false));
            }
            if ((below && keyCode == 19 && curIndex <= firstItem) || (!below && keyCode == 20 && curIndex >= lastItem)) {
                this.clearListSelection();
                this.mPopup.setInputMethodMode(1);
                this.show();
                return true;
            }
            this.mDropDownList.setListSelectionHidden(false);
            final boolean consumed = this.mDropDownList.onKeyDown(keyCode, event);
            if (consumed) {
                this.mPopup.setInputMethodMode(2);
                this.mDropDownList.requestFocusFromTouch();
                this.show();
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 23:
                    case 66: {
                        return true;
                    }
                }
            }
            else if (below && keyCode == 20) {
                if (curIndex == lastItem) {
                    return true;
                }
            }
            else if (!below && keyCode == 19 && curIndex == firstItem) {
                return true;
            }
        }
        return false;
    }
    
    public boolean onKeyUp(final int keyCode, @NonNull final KeyEvent event) {
        if (this.isShowing() && this.mDropDownList.getSelectedItemPosition() >= 0) {
            final boolean consumed = this.mDropDownList.onKeyUp(keyCode, event);
            if (consumed && isConfirmKey(keyCode)) {
                this.dismiss();
            }
            return consumed;
        }
        return false;
    }
    
    public boolean onKeyPreIme(final int keyCode, @NonNull final KeyEvent event) {
        if (keyCode == 4 && this.isShowing()) {
            final View anchorView = this.mDropDownAnchorView;
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                final KeyEvent.DispatcherState state = anchorView.getKeyDispatcherState();
                if (state != null) {
                    state.startTracking(event, (Object)this);
                }
                return true;
            }
            if (event.getAction() == 1) {
                final KeyEvent.DispatcherState state = anchorView.getKeyDispatcherState();
                if (state != null) {
                    state.handleUpEvent(event);
                }
                if (event.isTracking() && !event.isCanceled()) {
                    this.dismiss();
                    return true;
                }
            }
        }
        return false;
    }
    
    public View.OnTouchListener createDragToOpenListener(final View src) {
        return (View.OnTouchListener)new ForwardingListener(src) {
            @Override
            public ListPopupWindow getPopup() {
                return ListPopupWindow.this;
            }
        };
    }
    
    private int buildDropDown() {
        int otherHeights = 0;
        if (this.mDropDownList == null) {
            final Context context = this.mContext;
            this.mShowDropDownRunnable = (Runnable)new Runnable() {
                public void run() {
                    final View view = ListPopupWindow.this.getAnchorView();
                    if (view != null && view.getWindowToken() != null) {
                        ListPopupWindow.this.show();
                    }
                }
            };
            this.mDropDownList = this.createDropDownListView(context, !this.mModal);
            if (this.mDropDownListHighlight != null) {
                this.mDropDownList.setSelector(this.mDropDownListHighlight);
            }
            this.mDropDownList.setAdapter(this.mAdapter);
            this.mDropDownList.setOnItemClickListener(this.mItemClickListener);
            this.mDropDownList.setFocusable(true);
            this.mDropDownList.setFocusableInTouchMode(true);
            this.mDropDownList.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(final AdapterView<?> parent, final View view, final int position, final long id) {
                    if (position != -1) {
                        final DropDownListView dropDownList = ListPopupWindow.this.mDropDownList;
                        if (dropDownList != null) {
                            dropDownList.setListSelectionHidden(false);
                        }
                    }
                }
                
                public void onNothingSelected(final AdapterView<?> parent) {
                }
            });
            this.mDropDownList.setOnScrollListener((AbsListView.OnScrollListener)this.mScrollListener);
            if (this.mItemSelectedListener != null) {
                this.mDropDownList.setOnItemSelectedListener(this.mItemSelectedListener);
            }
            ViewGroup dropDownView = (ViewGroup)this.mDropDownList;
            final View hintView = this.mPromptView;
            if (hintView != null) {
                final LinearLayout hintContainer = new LinearLayout(context);
                hintContainer.setOrientation(1);
                LinearLayout.LayoutParams hintParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                switch (this.mPromptPosition) {
                    case 1: {
                        hintContainer.addView((View)dropDownView, (ViewGroup.LayoutParams)hintParams);
                        hintContainer.addView(hintView);
                        break;
                    }
                    case 0: {
                        hintContainer.addView(hintView);
                        hintContainer.addView((View)dropDownView, (ViewGroup.LayoutParams)hintParams);
                        break;
                    }
                    default: {
                        Log.e("ListPopupWindow", "Invalid hint position " + this.mPromptPosition);
                        break;
                    }
                }
                int widthMode;
                int widthSize;
                if (this.mDropDownWidth >= 0) {
                    widthMode = Integer.MIN_VALUE;
                    widthSize = this.mDropDownWidth;
                }
                else {
                    widthMode = 0;
                    widthSize = 0;
                }
                final int widthSpec = View.MeasureSpec.makeMeasureSpec(widthSize, widthMode);
                final int heightSpec = 0;
                hintView.measure(widthSpec, 0);
                hintParams = (LinearLayout.LayoutParams)hintView.getLayoutParams();
                otherHeights = hintView.getMeasuredHeight() + hintParams.topMargin + hintParams.bottomMargin;
                dropDownView = (ViewGroup)hintContainer;
            }
            this.mPopup.setContentView((View)dropDownView);
        }
        else {
            final ViewGroup dropDownView = (ViewGroup)this.mPopup.getContentView();
            final View view = this.mPromptView;
            if (view != null) {
                final LinearLayout.LayoutParams hintParams2 = (LinearLayout.LayoutParams)view.getLayoutParams();
                otherHeights = view.getMeasuredHeight() + hintParams2.topMargin + hintParams2.bottomMargin;
            }
        }
        final Drawable background = this.mPopup.getBackground();
        int padding;
        if (background != null) {
            background.getPadding(this.mTempRect);
            padding = this.mTempRect.top + this.mTempRect.bottom;
            if (!this.mDropDownVerticalOffsetSet) {
                this.mDropDownVerticalOffset = -this.mTempRect.top;
            }
        }
        else {
            this.mTempRect.setEmpty();
            padding = 0;
        }
        final boolean ignoreBottomDecorations = this.mPopup.getInputMethodMode() == 2;
        final int maxHeight = this.getMaxAvailableHeight(this.getAnchorView(), this.mDropDownVerticalOffset, ignoreBottomDecorations);
        if (this.mDropDownAlwaysVisible || this.mDropDownHeight == -1) {
            return maxHeight + padding;
        }
        int childWidthSpec = 0;
        switch (this.mDropDownWidth) {
            case -2: {
                childWidthSpec = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.mTempRect.left + this.mTempRect.right), Integer.MIN_VALUE);
                break;
            }
            case -1: {
                childWidthSpec = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.mTempRect.left + this.mTempRect.right), 1073741824);
                break;
            }
            default: {
                childWidthSpec = View.MeasureSpec.makeMeasureSpec(this.mDropDownWidth, 1073741824);
                break;
            }
        }
        final int listContent = this.mDropDownList.measureHeightOfChildrenCompat(childWidthSpec, 0, -1, maxHeight - otherHeights, -1);
        if (listContent > 0) {
            final int listPadding = this.mDropDownList.getPaddingTop() + this.mDropDownList.getPaddingBottom();
            otherHeights += padding + listPadding;
        }
        return listContent + otherHeights;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setOverlapAnchor(final boolean overlapAnchor) {
        this.mOverlapAnchorSet = true;
        this.mOverlapAnchor = overlapAnchor;
    }
    
    private static boolean isConfirmKey(final int keyCode) {
        return keyCode == 66 || keyCode == 23;
    }
    
    private void setPopupClipToScreenEnabled(final boolean clip) {
        if (Build.VERSION.SDK_INT <= 28) {
            if (ListPopupWindow.sSetClipToWindowEnabledMethod != null) {
                try {
                    ListPopupWindow.sSetClipToWindowEnabledMethod.invoke((Object)this.mPopup, new Object[] { clip });
                }
                catch (final Exception e) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        }
        else {
            Api29Impl.setIsClippedToScreen(this.mPopup, clip);
        }
    }
    
    private int getMaxAvailableHeight(final View anchor, final int yOffset, final boolean ignoreBottomDecorations) {
        if (Build.VERSION.SDK_INT <= 23) {
            if (ListPopupWindow.sGetMaxAvailableHeightMethod != null) {
                try {
                    return (int)ListPopupWindow.sGetMaxAvailableHeightMethod.invoke((Object)this.mPopup, new Object[] { anchor, yOffset, ignoreBottomDecorations });
                }
                catch (final Exception e) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.mPopup.getMaxAvailableHeight(anchor, yOffset);
        }
        return Api24Impl.getMaxAvailableHeight(this.mPopup, anchor, yOffset, ignoreBottomDecorations);
    }
    
    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                ListPopupWindow.sSetClipToWindowEnabledMethod = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            }
            catch (final NoSuchMethodException e) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                ListPopupWindow.sSetEpicenterBoundsMethod = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            }
            catch (final NoSuchMethodException e) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                ListPopupWindow.sGetMaxAvailableHeightMethod = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            }
            catch (final NoSuchMethodException e) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }
    
    private class PopupDataSetObserver extends DataSetObserver
    {
        PopupDataSetObserver() {
        }
        
        public void onChanged() {
            if (ListPopupWindow.this.isShowing()) {
                ListPopupWindow.this.show();
            }
        }
        
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }
    
    private class ListSelectorHider implements Runnable
    {
        ListSelectorHider() {
        }
        
        public void run() {
            ListPopupWindow.this.clearListSelection();
        }
    }
    
    private class ResizePopupRunnable implements Runnable
    {
        ResizePopupRunnable() {
        }
        
        public void run() {
            if (ListPopupWindow.this.mDropDownList != null && ListPopupWindow.this.mDropDownList.isAttachedToWindow() && ListPopupWindow.this.mDropDownList.getCount() > ListPopupWindow.this.mDropDownList.getChildCount() && ListPopupWindow.this.mDropDownList.getChildCount() <= ListPopupWindow.this.mListItemExpandMaximum) {
                ListPopupWindow.this.mPopup.setInputMethodMode(2);
                ListPopupWindow.this.show();
            }
        }
    }
    
    private class PopupTouchInterceptor implements View.OnTouchListener
    {
        PopupTouchInterceptor() {
        }
        
        public boolean onTouch(final View v, final MotionEvent event) {
            final int action = event.getAction();
            final int x = (int)event.getX();
            final int y = (int)event.getY();
            if (action == 0 && ListPopupWindow.this.mPopup != null && ListPopupWindow.this.mPopup.isShowing() && x >= 0 && x < ListPopupWindow.this.mPopup.getWidth() && y >= 0 && y < ListPopupWindow.this.mPopup.getHeight()) {
                ListPopupWindow.this.mHandler.postDelayed((Runnable)ListPopupWindow.this.mResizePopupRunnable, 250L);
            }
            else if (action == 1) {
                ListPopupWindow.this.mHandler.removeCallbacks((Runnable)ListPopupWindow.this.mResizePopupRunnable);
            }
            return false;
        }
    }
    
    private class PopupScrollListener implements AbsListView.OnScrollListener
    {
        PopupScrollListener() {
        }
        
        public void onScroll(final AbsListView view, final int firstVisibleItem, final int visibleItemCount, final int totalItemCount) {
        }
        
        public void onScrollStateChanged(final AbsListView view, final int scrollState) {
            if (scrollState == 1 && !ListPopupWindow.this.isInputMethodNotNeeded() && ListPopupWindow.this.mPopup.getContentView() != null) {
                ListPopupWindow.this.mHandler.removeCallbacks((Runnable)ListPopupWindow.this.mResizePopupRunnable);
                ListPopupWindow.this.mResizePopupRunnable.run();
            }
        }
    }
    
    @RequiresApi(29)
    static class Api29Impl
    {
        private Api29Impl() {
        }
        
        @DoNotInline
        static void setEpicenterBounds(final PopupWindow popupWindow, final Rect bounds) {
            popupWindow.setEpicenterBounds(bounds);
        }
        
        @DoNotInline
        static void setIsClippedToScreen(final PopupWindow popupWindow, final boolean enabled) {
            popupWindow.setIsClippedToScreen(enabled);
        }
    }
    
    @RequiresApi(24)
    static class Api24Impl
    {
        private Api24Impl() {
        }
        
        @DoNotInline
        static int getMaxAvailableHeight(final PopupWindow popupWindow, final View anchor, final int yOffset, final boolean ignoreBottomDecorations) {
            return popupWindow.getMaxAvailableHeight(anchor, yOffset, ignoreBottomDecorations);
        }
    }
}
