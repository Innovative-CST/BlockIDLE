package androidx.appcompat.widget;

import androidx.annotation.DoNotInline;
import androidx.core.util.ObjectsCompat;
import androidx.annotation.RequiresApi;
import android.widget.PopupWindow;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;
import android.database.DataSetObserver;
import android.widget.ThemedSpinnerAdapter;
import android.os.Build;
import android.os.Parcel;
import android.widget.Adapter;
import android.view.ViewTreeObserver;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import android.view.ViewGroup;
import android.graphics.PorterDuff;
import androidx.annotation.RestrictTo;
import android.content.res.ColorStateList;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.annotation.DrawableRes;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.widget.ArrayAdapter;
import androidx.appcompat.view.menu.ShowableListMenu;
import android.util.Log;
import androidx.appcompat.view.ContextThemeWrapper;
import android.view.View;
import android.content.res.Resources;
import androidx.annotation.Nullable;
import androidx.appcompat.R;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.graphics.Rect;
import android.widget.SpinnerAdapter;
import android.content.Context;
import androidx.annotation.StyleableRes;
import android.annotation.SuppressLint;
import androidx.core.view.TintableBackgroundView;
import android.widget.Spinner;

public class AppCompatSpinner extends Spinner implements TintableBackgroundView
{
    @SuppressLint({ "ResourceType" })
    @StyleableRes
    private static final int[] ATTRS_ANDROID_SPINNERMODE;
    private static final int MAX_ITEMS_MEASURED = 15;
    private static final String TAG = "AppCompatSpinner";
    private static final int MODE_DIALOG = 0;
    private static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private final Context mPopupContext;
    private ForwardingListener mForwardingListener;
    private SpinnerAdapter mTempAdapter;
    private final boolean mPopupSet;
    private SpinnerPopup mPopup;
    int mDropDownWidth;
    final Rect mTempRect;
    
    public AppCompatSpinner(@NonNull final Context context) {
        this(context, null);
    }
    
    public AppCompatSpinner(@NonNull final Context context, final int mode) {
        this(context, null, R.attr.spinnerStyle, mode);
    }
    
    public AppCompatSpinner(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, R.attr.spinnerStyle);
    }
    
    public AppCompatSpinner(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        this(context, attrs, defStyleAttr, -1);
    }
    
    public AppCompatSpinner(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr, final int mode) {
        this(context, attrs, defStyleAttr, mode, null);
    }
    
    public AppCompatSpinner(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr, int mode, final Resources.Theme popupTheme) {
        super(context, attrs, defStyleAttr);
        this.mTempRect = new Rect();
        ThemeUtils.checkAppCompatTheme((View)this, this.getContext());
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(context, attrs, R.styleable.Spinner, defStyleAttr, 0);
        this.mBackgroundTintHelper = new AppCompatBackgroundHelper((View)this);
        if (popupTheme != null) {
            this.mPopupContext = (Context)new ContextThemeWrapper(context, popupTheme);
        }
        else {
            final int popupThemeResId = a.getResourceId(R.styleable.Spinner_popupTheme, 0);
            if (popupThemeResId != 0) {
                this.mPopupContext = (Context)new ContextThemeWrapper(context, popupThemeResId);
            }
            else {
                this.mPopupContext = context;
            }
        }
        if (mode == -1) {
            TypedArray aa = null;
            try {
                aa = context.obtainStyledAttributes(attrs, AppCompatSpinner.ATTRS_ANDROID_SPINNERMODE, defStyleAttr, 0);
                if (aa.hasValue(0)) {
                    mode = aa.getInt(0, 0);
                }
            }
            catch (final Exception e) {
                Log.i("AppCompatSpinner", "Could not read android:spinnerMode", (Throwable)e);
            }
            finally {
                if (aa != null) {
                    aa.recycle();
                }
            }
        }
        switch (mode) {
            case 0: {
                (this.mPopup = new DialogPopup()).setPromptText((CharSequence)a.getString(R.styleable.Spinner_android_prompt));
                break;
            }
            case 1: {
                final DropdownPopup popup = new DropdownPopup(this.mPopupContext, attrs, defStyleAttr);
                final TintTypedArray pa = TintTypedArray.obtainStyledAttributes(this.mPopupContext, attrs, R.styleable.Spinner, defStyleAttr, 0);
                this.mDropDownWidth = pa.getLayoutDimension(R.styleable.Spinner_android_dropDownWidth, -2);
                popup.setBackgroundDrawable(pa.getDrawable(R.styleable.Spinner_android_popupBackground));
                popup.setPromptText((CharSequence)a.getString(R.styleable.Spinner_android_prompt));
                pa.recycle();
                this.mPopup = popup;
                this.mForwardingListener = new ForwardingListener(this) {
                    @Override
                    public ShowableListMenu getPopup() {
                        return popup;
                    }
                    
                    public boolean onForwardingStarted() {
                        if (!AppCompatSpinner.this.getInternalPopup().isShowing()) {
                            AppCompatSpinner.this.showPopup();
                        }
                        return true;
                    }
                };
                break;
            }
        }
        final CharSequence[] entries = a.getTextArray(R.styleable.Spinner_android_entries);
        if (entries != null) {
            final ArrayAdapter<CharSequence> adapter = (ArrayAdapter<CharSequence>)new ArrayAdapter(context, 17367048, (Object[])entries);
            adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
            this.setAdapter((SpinnerAdapter)adapter);
        }
        a.recycle();
        this.mPopupSet = true;
        if (this.mTempAdapter != null) {
            this.setAdapter(this.mTempAdapter);
            this.mTempAdapter = null;
        }
        this.mBackgroundTintHelper.loadFromAttributes(attrs, defStyleAttr);
    }
    
    public Context getPopupContext() {
        return this.mPopupContext;
    }
    
    public void setPopupBackgroundDrawable(final Drawable background) {
        if (this.mPopup != null) {
            this.mPopup.setBackgroundDrawable(background);
        }
        else {
            super.setPopupBackgroundDrawable(background);
        }
    }
    
    public void setPopupBackgroundResource(@DrawableRes final int resId) {
        this.setPopupBackgroundDrawable(AppCompatResources.getDrawable(this.getPopupContext(), resId));
    }
    
    public Drawable getPopupBackground() {
        if (this.mPopup != null) {
            return this.mPopup.getBackground();
        }
        return super.getPopupBackground();
    }
    
    public void setDropDownVerticalOffset(final int pixels) {
        if (this.mPopup != null) {
            this.mPopup.setVerticalOffset(pixels);
        }
        else {
            super.setDropDownVerticalOffset(pixels);
        }
    }
    
    public int getDropDownVerticalOffset() {
        if (this.mPopup != null) {
            return this.mPopup.getVerticalOffset();
        }
        return super.getDropDownVerticalOffset();
    }
    
    public void setDropDownHorizontalOffset(final int pixels) {
        if (this.mPopup != null) {
            this.mPopup.setHorizontalOriginalOffset(pixels);
            this.mPopup.setHorizontalOffset(pixels);
        }
        else {
            super.setDropDownHorizontalOffset(pixels);
        }
    }
    
    public int getDropDownHorizontalOffset() {
        if (this.mPopup != null) {
            return this.mPopup.getHorizontalOffset();
        }
        return super.getDropDownHorizontalOffset();
    }
    
    public void setDropDownWidth(final int pixels) {
        if (this.mPopup != null) {
            this.mDropDownWidth = pixels;
        }
        else {
            super.setDropDownWidth(pixels);
        }
    }
    
    public int getDropDownWidth() {
        if (this.mPopup != null) {
            return this.mDropDownWidth;
        }
        return super.getDropDownWidth();
    }
    
    public void setAdapter(final SpinnerAdapter adapter) {
        if (!this.mPopupSet) {
            this.mTempAdapter = adapter;
            return;
        }
        super.setAdapter(adapter);
        if (this.mPopup != null) {
            final Context popupContext = (this.mPopupContext == null) ? this.getContext() : this.mPopupContext;
            this.mPopup.setAdapter((ListAdapter)new DropDownAdapter(adapter, popupContext.getTheme()));
        }
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mPopup != null && this.mPopup.isShowing()) {
            this.mPopup.dismiss();
        }
    }
    
    public boolean onTouchEvent(final MotionEvent event) {
        return (this.mForwardingListener != null && this.mForwardingListener.onTouch((View)this, event)) || super.onTouchEvent(event);
    }
    
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.mPopup != null && View.MeasureSpec.getMode(widthMeasureSpec) == Integer.MIN_VALUE) {
            final int measuredWidth = this.getMeasuredWidth();
            this.setMeasuredDimension(Math.min(Math.max(measuredWidth, this.compatMeasureContentWidth(this.getAdapter(), this.getBackground())), View.MeasureSpec.getSize(widthMeasureSpec)), this.getMeasuredHeight());
        }
    }
    
    public boolean performClick() {
        if (this.mPopup != null) {
            if (!this.mPopup.isShowing()) {
                this.showPopup();
            }
            return true;
        }
        return super.performClick();
    }
    
    public void setPrompt(final CharSequence prompt) {
        if (this.mPopup != null) {
            this.mPopup.setPromptText(prompt);
        }
        else {
            super.setPrompt(prompt);
        }
    }
    
    public CharSequence getPrompt() {
        return (this.mPopup != null) ? this.mPopup.getHintText() : super.getPrompt();
    }
    
    public void setBackgroundResource(@DrawableRes final int resId) {
        super.setBackgroundResource(resId);
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.onSetBackgroundResource(resId);
        }
    }
    
    public void setBackgroundDrawable(@Nullable final Drawable background) {
        super.setBackgroundDrawable(background);
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.onSetBackgroundDrawable(background);
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setSupportBackgroundTintList(@Nullable final ColorStateList tint) {
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.setSupportBackgroundTintList(tint);
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return (this.mBackgroundTintHelper != null) ? this.mBackgroundTintHelper.getSupportBackgroundTintList() : null;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setSupportBackgroundTintMode(@Nullable final PorterDuff.Mode tintMode) {
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.setSupportBackgroundTintMode(tintMode);
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return (this.mBackgroundTintHelper != null) ? this.mBackgroundTintHelper.getSupportBackgroundTintMode() : null;
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.applySupportBackgroundTint();
        }
    }
    
    int compatMeasureContentWidth(final SpinnerAdapter adapter, final Drawable background) {
        if (adapter == null) {
            return 0;
        }
        int width = 0;
        View itemView = null;
        int itemType = 0;
        final int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
        final int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
        int start = Math.max(0, this.getSelectedItemPosition());
        final int end = Math.min(adapter.getCount(), start + 15);
        final int count = end - start;
        int i;
        for (start = (i = Math.max(0, start - (15 - count))); i < end; ++i) {
            final int positionType = adapter.getItemViewType(i);
            if (positionType != itemType) {
                itemType = positionType;
                itemView = null;
            }
            itemView = adapter.getView(i, itemView, (ViewGroup)this);
            if (itemView.getLayoutParams() == null) {
                itemView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            itemView.measure(widthMeasureSpec, heightMeasureSpec);
            width = Math.max(width, itemView.getMeasuredWidth());
        }
        if (background != null) {
            background.getPadding(this.mTempRect);
            width += this.mTempRect.left + this.mTempRect.right;
        }
        return width;
    }
    
    @VisibleForTesting
    final SpinnerPopup getInternalPopup() {
        return this.mPopup;
    }
    
    void showPopup() {
        this.mPopup.show(this.getTextDirection(), this.getTextAlignment());
    }
    
    public Parcelable onSaveInstanceState() {
        final SavedState ss = new SavedState(super.onSaveInstanceState());
        ss.mShowDropdown = (this.mPopup != null && this.mPopup.isShowing());
        return (Parcelable)ss;
    }
    
    public void onRestoreInstanceState(final Parcelable state) {
        final SavedState ss = (SavedState)state;
        super.onRestoreInstanceState(ss.getSuperState());
        if (ss.mShowDropdown) {
            final ViewTreeObserver vto = this.getViewTreeObserver();
            if (vto != null) {
                final ViewTreeObserver.OnGlobalLayoutListener listener = (ViewTreeObserver.OnGlobalLayoutListener)new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        if (!AppCompatSpinner.this.getInternalPopup().isShowing()) {
                            AppCompatSpinner.this.showPopup();
                        }
                        final ViewTreeObserver vto = AppCompatSpinner.this.getViewTreeObserver();
                        if (vto != null) {
                            vto.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                        }
                    }
                };
                vto.addOnGlobalLayoutListener(listener);
            }
        }
    }
    
    static {
        ATTRS_ANDROID_SPINNERMODE = new int[] { 16843505 };
    }
    
    static class SavedState extends View.BaseSavedState
    {
        boolean mShowDropdown;
        public static final Parcelable.Creator<SavedState> CREATOR;
        
        SavedState(final Parcelable superState) {
            super(superState);
        }
        
        SavedState(final Parcel in) {
            super(in);
            this.mShowDropdown = (in.readByte() != 0);
        }
        
        public void writeToParcel(final Parcel out, final int flags) {
            super.writeToParcel(out, flags);
            out.writeByte((byte)(byte)(this.mShowDropdown ? 1 : 0));
        }
        
        static {
            CREATOR = (Parcelable.Creator)new Parcelable.Creator<SavedState>() {
                public SavedState createFromParcel(final Parcel in) {
                    return new SavedState(in);
                }
                
                public SavedState[] newArray(final int size) {
                    return new SavedState[size];
                }
            };
        }
    }
    
    private static class DropDownAdapter implements ListAdapter, SpinnerAdapter
    {
        private SpinnerAdapter mAdapter;
        private ListAdapter mListAdapter;
        
        public DropDownAdapter(@Nullable final SpinnerAdapter adapter, @Nullable final Resources.Theme dropDownTheme) {
            this.mAdapter = adapter;
            if (adapter instanceof ListAdapter) {
                this.mListAdapter = (ListAdapter)adapter;
            }
            if (dropDownTheme != null) {
                if (Build.VERSION.SDK_INT >= 23 && adapter instanceof ThemedSpinnerAdapter) {
                    final ThemedSpinnerAdapter themedAdapter = (ThemedSpinnerAdapter)adapter;
                    Api23Impl.setDropDownViewTheme(themedAdapter, dropDownTheme);
                }
                else if (adapter instanceof androidx.appcompat.widget.ThemedSpinnerAdapter) {
                    final androidx.appcompat.widget.ThemedSpinnerAdapter themedAdapter2 = (androidx.appcompat.widget.ThemedSpinnerAdapter)adapter;
                    if (themedAdapter2.getDropDownViewTheme() == null) {
                        themedAdapter2.setDropDownViewTheme(dropDownTheme);
                    }
                }
            }
        }
        
        public int getCount() {
            return (this.mAdapter == null) ? 0 : this.mAdapter.getCount();
        }
        
        public Object getItem(final int position) {
            return (this.mAdapter == null) ? null : this.mAdapter.getItem(position);
        }
        
        public long getItemId(final int position) {
            return (this.mAdapter == null) ? -1L : this.mAdapter.getItemId(position);
        }
        
        public View getView(final int position, final View convertView, final ViewGroup parent) {
            return this.getDropDownView(position, convertView, parent);
        }
        
        public View getDropDownView(final int position, final View convertView, final ViewGroup parent) {
            return (this.mAdapter == null) ? null : this.mAdapter.getDropDownView(position, convertView, parent);
        }
        
        public boolean hasStableIds() {
            return this.mAdapter != null && this.mAdapter.hasStableIds();
        }
        
        public void registerDataSetObserver(final DataSetObserver observer) {
            if (this.mAdapter != null) {
                this.mAdapter.registerDataSetObserver(observer);
            }
        }
        
        public void unregisterDataSetObserver(final DataSetObserver observer) {
            if (this.mAdapter != null) {
                this.mAdapter.unregisterDataSetObserver(observer);
            }
        }
        
        public boolean areAllItemsEnabled() {
            final ListAdapter adapter = this.mListAdapter;
            return adapter == null || adapter.areAllItemsEnabled();
        }
        
        public boolean isEnabled(final int position) {
            final ListAdapter adapter = this.mListAdapter;
            return adapter == null || adapter.isEnabled(position);
        }
        
        public int getItemViewType(final int position) {
            return 0;
        }
        
        public int getViewTypeCount() {
            return 1;
        }
        
        public boolean isEmpty() {
            return this.getCount() == 0;
        }
    }
    
    @VisibleForTesting
    class DialogPopup implements SpinnerPopup, DialogInterface.OnClickListener
    {
        @VisibleForTesting
        AlertDialog mPopup;
        private ListAdapter mListAdapter;
        private CharSequence mPrompt;
        
        @Override
        public void dismiss() {
            if (this.mPopup != null) {
                this.mPopup.dismiss();
                this.mPopup = null;
            }
        }
        
        @Override
        public boolean isShowing() {
            return this.mPopup != null && this.mPopup.isShowing();
        }
        
        @Override
        public void setAdapter(final ListAdapter adapter) {
            this.mListAdapter = adapter;
        }
        
        @Override
        public void setPromptText(final CharSequence hintText) {
            this.mPrompt = hintText;
        }
        
        @Override
        public CharSequence getHintText() {
            return this.mPrompt;
        }
        
        @Override
        public void show(final int textDirection, final int textAlignment) {
            if (this.mListAdapter == null) {
                return;
            }
            final AlertDialog.Builder builder = new AlertDialog.Builder(AppCompatSpinner.this.getPopupContext());
            if (this.mPrompt != null) {
                builder.setTitle(this.mPrompt);
            }
            this.mPopup = builder.setSingleChoiceItems(this.mListAdapter, AppCompatSpinner.this.getSelectedItemPosition(), (DialogInterface.OnClickListener)this).create();
            final ListView listView = this.mPopup.getListView();
            listView.setTextDirection(textDirection);
            listView.setTextAlignment(textAlignment);
            this.mPopup.show();
        }
        
        public void onClick(final DialogInterface dialog, final int which) {
            AppCompatSpinner.this.setSelection(which);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick((View)null, which, this.mListAdapter.getItemId(which));
            }
            this.dismiss();
        }
        
        @Override
        public void setBackgroundDrawable(final Drawable bg) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
        
        @Override
        public void setVerticalOffset(final int px) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }
        
        @Override
        public void setHorizontalOffset(final int px) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }
        
        @Override
        public Drawable getBackground() {
            return null;
        }
        
        @Override
        public int getVerticalOffset() {
            return 0;
        }
        
        @Override
        public int getHorizontalOffset() {
            return 0;
        }
        
        @Override
        public void setHorizontalOriginalOffset(final int px) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
        
        @Override
        public int getHorizontalOriginalOffset() {
            return 0;
        }
    }
    
    @VisibleForTesting
    class DropdownPopup extends ListPopupWindow implements SpinnerPopup
    {
        private CharSequence mHintText;
        ListAdapter mAdapter;
        private final Rect mVisibleRect;
        private int mOriginalHorizontalOffset;
        
        public DropdownPopup(final Context context, final AttributeSet attrs, final int defStyleAttr) {
            super(context, attrs, defStyleAttr);
            this.mVisibleRect = new Rect();
            this.setAnchorView((View)AppCompatSpinner.this);
            this.setModal(true);
            this.setPromptPosition(0);
            this.setOnItemClickListener((AdapterView.OnItemClickListener)new AdapterView.OnItemClickListener() {
                public void onItemClick(final AdapterView<?> parent, final View v, final int position, final long id) {
                    AppCompatSpinner.this.setSelection(position);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        AppCompatSpinner.this.performItemClick(v, position, DropdownPopup.this.mAdapter.getItemId(position));
                    }
                    DropdownPopup.this.dismiss();
                }
            });
        }
        
        @Override
        public void setAdapter(final ListAdapter adapter) {
            super.setAdapter(adapter);
            this.mAdapter = adapter;
        }
        
        @Override
        public CharSequence getHintText() {
            return this.mHintText;
        }
        
        @Override
        public void setPromptText(final CharSequence hintText) {
            this.mHintText = hintText;
        }
        
        void computeContentWidth() {
            final Drawable background = this.getBackground();
            int hOffset = 0;
            if (background != null) {
                background.getPadding(AppCompatSpinner.this.mTempRect);
                hOffset = (ViewUtils.isLayoutRtl((View)AppCompatSpinner.this) ? AppCompatSpinner.this.mTempRect.right : (-AppCompatSpinner.this.mTempRect.left));
            }
            else {
                final Rect mTempRect = AppCompatSpinner.this.mTempRect;
                final Rect mTempRect2 = AppCompatSpinner.this.mTempRect;
                final int n = 0;
                mTempRect2.right = n;
                mTempRect.left = n;
            }
            final int spinnerPaddingLeft = AppCompatSpinner.this.getPaddingLeft();
            final int spinnerPaddingRight = AppCompatSpinner.this.getPaddingRight();
            final int spinnerWidth = AppCompatSpinner.this.getWidth();
            if (AppCompatSpinner.this.mDropDownWidth == -2) {
                int contentWidth = AppCompatSpinner.this.compatMeasureContentWidth((SpinnerAdapter)this.mAdapter, this.getBackground());
                final int contentWidthLimit = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.this.mTempRect.left - AppCompatSpinner.this.mTempRect.right;
                if (contentWidth > contentWidthLimit) {
                    contentWidth = contentWidthLimit;
                }
                this.setContentWidth(Math.max(contentWidth, spinnerWidth - spinnerPaddingLeft - spinnerPaddingRight));
            }
            else if (AppCompatSpinner.this.mDropDownWidth == -1) {
                this.setContentWidth(spinnerWidth - spinnerPaddingLeft - spinnerPaddingRight);
            }
            else {
                this.setContentWidth(AppCompatSpinner.this.mDropDownWidth);
            }
            if (ViewUtils.isLayoutRtl((View)AppCompatSpinner.this)) {
                hOffset += spinnerWidth - spinnerPaddingRight - this.getWidth() - this.getHorizontalOriginalOffset();
            }
            else {
                hOffset += spinnerPaddingLeft + this.getHorizontalOriginalOffset();
            }
            this.setHorizontalOffset(hOffset);
        }
        
        @Override
        public void show(final int textDirection, final int textAlignment) {
            final boolean wasShowing = this.isShowing();
            this.computeContentWidth();
            this.setInputMethodMode(2);
            super.show();
            final ListView listView = this.getListView();
            listView.setChoiceMode(1);
            listView.setTextDirection(textDirection);
            listView.setTextAlignment(textAlignment);
            this.setSelection(AppCompatSpinner.this.getSelectedItemPosition());
            if (wasShowing) {
                return;
            }
            final ViewTreeObserver vto = AppCompatSpinner.this.getViewTreeObserver();
            if (vto != null) {
                final ViewTreeObserver.OnGlobalLayoutListener layoutListener = (ViewTreeObserver.OnGlobalLayoutListener)new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        if (!DropdownPopup.this.isVisibleToUser((View)AppCompatSpinner.this)) {
                            DropdownPopup.this.dismiss();
                        }
                        else {
                            DropdownPopup.this.computeContentWidth();
                            ListPopupWindow.this.show();
                        }
                    }
                };
                vto.addOnGlobalLayoutListener(layoutListener);
                this.setOnDismissListener((PopupWindow.OnDismissListener)new PopupWindow.OnDismissListener() {
                    public void onDismiss() {
                        final ViewTreeObserver vto = AppCompatSpinner.this.getViewTreeObserver();
                        if (vto != null) {
                            vto.removeGlobalOnLayoutListener(layoutListener);
                        }
                    }
                });
            }
        }
        
        boolean isVisibleToUser(final View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.mVisibleRect);
        }
        
        @Override
        public void setHorizontalOriginalOffset(final int px) {
            this.mOriginalHorizontalOffset = px;
        }
        
        @Override
        public int getHorizontalOriginalOffset() {
            return this.mOriginalHorizontalOffset;
        }
    }
    
    @RequiresApi(23)
    private static final class Api23Impl
    {
        @DoNotInline
        static void setDropDownViewTheme(@NonNull final ThemedSpinnerAdapter themedSpinnerAdapter, @Nullable final Resources.Theme theme) {
            if (!ObjectsCompat.equals((Object)themedSpinnerAdapter.getDropDownViewTheme(), (Object)theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }
    
    @VisibleForTesting
    interface SpinnerPopup
    {
        void setAdapter(final ListAdapter p0);
        
        void show(final int p0, final int p1);
        
        void dismiss();
        
        boolean isShowing();
        
        void setPromptText(final CharSequence p0);
        
        CharSequence getHintText();
        
        void setBackgroundDrawable(final Drawable p0);
        
        void setVerticalOffset(final int p0);
        
        void setHorizontalOffset(final int p0);
        
        void setHorizontalOriginalOffset(final int p0);
        
        int getHorizontalOriginalOffset();
        
        Drawable getBackground();
        
        int getVerticalOffset();
        
        int getHorizontalOffset();
    }
}
