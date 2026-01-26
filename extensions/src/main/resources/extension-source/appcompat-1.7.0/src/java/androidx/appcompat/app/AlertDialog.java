package androidx.appcompat.app;

import android.widget.AdapterView;
import android.database.Cursor;
import android.widget.ListAdapter;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.os.Bundle;
import android.graphics.drawable.Drawable;
import android.os.Message;
import androidx.annotation.RestrictTo;
import android.view.View;
import android.widget.ListView;
import android.widget.Button;
import androidx.appcompat.R;
import android.util.TypedValue;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.annotation.NonNull;
import android.content.Context;
import android.content.DialogInterface;

public class AlertDialog extends AppCompatDialog implements DialogInterface
{
    final AlertController mAlert;
    static final int LAYOUT_HINT_NONE = 0;
    static final int LAYOUT_HINT_SIDE = 1;
    
    protected AlertDialog(@NonNull final Context context) {
        this(context, 0);
    }
    
    protected AlertDialog(@NonNull final Context context, @StyleRes final int themeResId) {
        super(context, resolveDialogTheme(context, themeResId));
        this.mAlert = new AlertController(this.getContext(), this, this.getWindow());
    }
    
    protected AlertDialog(@NonNull final Context context, final boolean cancelable, @Nullable final DialogInterface.OnCancelListener cancelListener) {
        this(context, 0);
        this.setCancelable(cancelable);
        this.setOnCancelListener(cancelListener);
    }
    
    static int resolveDialogTheme(@NonNull final Context context, @StyleRes final int resid) {
        if ((resid >>> 24 & 0xFF) >= 1) {
            return resid;
        }
        final TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, outValue, true);
        return outValue.resourceId;
    }
    
    public Button getButton(final int whichButton) {
        return this.mAlert.getButton(whichButton);
    }
    
    public ListView getListView() {
        return this.mAlert.getListView();
    }
    
    @Override
    public void setTitle(final CharSequence title) {
        super.setTitle(title);
        this.mAlert.setTitle(title);
    }
    
    public void setCustomTitle(final View customTitleView) {
        this.mAlert.setCustomTitle(customTitleView);
    }
    
    public void setMessage(final CharSequence message) {
        this.mAlert.setMessage(message);
    }
    
    public void setView(final View view) {
        this.mAlert.setView(view);
    }
    
    public void setView(final View view, final int viewSpacingLeft, final int viewSpacingTop, final int viewSpacingRight, final int viewSpacingBottom) {
        this.mAlert.setView(view, viewSpacingLeft, viewSpacingTop, viewSpacingRight, viewSpacingBottom);
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    void setButtonPanelLayoutHint(final int layoutHint) {
        this.mAlert.setButtonPanelLayoutHint(layoutHint);
    }
    
    public void setButton(final int whichButton, final CharSequence text, final Message msg) {
        this.mAlert.setButton(whichButton, text, null, msg, null);
    }
    
    public void setButton(final int whichButton, final CharSequence text, final DialogInterface.OnClickListener listener) {
        this.mAlert.setButton(whichButton, text, listener, null, null);
    }
    
    public void setButton(final int whichButton, final CharSequence text, final Drawable icon, final DialogInterface.OnClickListener listener) {
        this.mAlert.setButton(whichButton, text, listener, null, icon);
    }
    
    public void setIcon(final int resId) {
        this.mAlert.setIcon(resId);
    }
    
    public void setIcon(final Drawable icon) {
        this.mAlert.setIcon(icon);
    }
    
    public void setIconAttribute(final int attrId) {
        final TypedValue out = new TypedValue();
        this.getContext().getTheme().resolveAttribute(attrId, out, true);
        this.mAlert.setIcon(out.resourceId);
    }
    
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mAlert.installContent();
    }
    
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        return this.mAlert.onKeyDown(keyCode, event) || super.onKeyDown(keyCode, event);
    }
    
    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        return this.mAlert.onKeyUp(keyCode, event) || super.onKeyUp(keyCode, event);
    }
    
    public static class Builder
    {
        private final AlertController.AlertParams P;
        private final int mTheme;
        
        public Builder(@NonNull final Context context) {
            this(context, AlertDialog.resolveDialogTheme(context, 0));
        }
        
        public Builder(@NonNull final Context context, @StyleRes final int themeResId) {
            this.P = new AlertController.AlertParams((Context)new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, themeResId)));
            this.mTheme = themeResId;
        }
        
        @NonNull
        public Context getContext() {
            return this.P.mContext;
        }
        
        public Builder setTitle(@StringRes final int titleId) {
            this.P.mTitle = this.P.mContext.getText(titleId);
            return this;
        }
        
        public Builder setTitle(@Nullable final CharSequence title) {
            this.P.mTitle = title;
            return this;
        }
        
        public Builder setCustomTitle(@Nullable final View customTitleView) {
            this.P.mCustomTitleView = customTitleView;
            return this;
        }
        
        public Builder setMessage(@StringRes final int messageId) {
            this.P.mMessage = this.P.mContext.getText(messageId);
            return this;
        }
        
        public Builder setMessage(@Nullable final CharSequence message) {
            this.P.mMessage = message;
            return this;
        }
        
        public Builder setIcon(@DrawableRes final int iconId) {
            this.P.mIconId = iconId;
            return this;
        }
        
        public Builder setIcon(@Nullable final Drawable icon) {
            this.P.mIcon = icon;
            return this;
        }
        
        public Builder setIconAttribute(@AttrRes final int attrId) {
            final TypedValue out = new TypedValue();
            this.P.mContext.getTheme().resolveAttribute(attrId, out, true);
            this.P.mIconId = out.resourceId;
            return this;
        }
        
        public Builder setPositiveButton(@StringRes final int textId, final DialogInterface.OnClickListener listener) {
            this.P.mPositiveButtonText = this.P.mContext.getText(textId);
            this.P.mPositiveButtonListener = listener;
            return this;
        }
        
        public Builder setPositiveButton(final CharSequence text, final DialogInterface.OnClickListener listener) {
            this.P.mPositiveButtonText = text;
            this.P.mPositiveButtonListener = listener;
            return this;
        }
        
        public Builder setPositiveButtonIcon(final Drawable icon) {
            this.P.mPositiveButtonIcon = icon;
            return this;
        }
        
        public Builder setNegativeButton(@StringRes final int textId, final DialogInterface.OnClickListener listener) {
            this.P.mNegativeButtonText = this.P.mContext.getText(textId);
            this.P.mNegativeButtonListener = listener;
            return this;
        }
        
        public Builder setNegativeButton(final CharSequence text, final DialogInterface.OnClickListener listener) {
            this.P.mNegativeButtonText = text;
            this.P.mNegativeButtonListener = listener;
            return this;
        }
        
        public Builder setNegativeButtonIcon(final Drawable icon) {
            this.P.mNegativeButtonIcon = icon;
            return this;
        }
        
        public Builder setNeutralButton(@StringRes final int textId, final DialogInterface.OnClickListener listener) {
            this.P.mNeutralButtonText = this.P.mContext.getText(textId);
            this.P.mNeutralButtonListener = listener;
            return this;
        }
        
        public Builder setNeutralButton(final CharSequence text, final DialogInterface.OnClickListener listener) {
            this.P.mNeutralButtonText = text;
            this.P.mNeutralButtonListener = listener;
            return this;
        }
        
        public Builder setNeutralButtonIcon(final Drawable icon) {
            this.P.mNeutralButtonIcon = icon;
            return this;
        }
        
        public Builder setCancelable(final boolean cancelable) {
            this.P.mCancelable = cancelable;
            return this;
        }
        
        public Builder setOnCancelListener(final DialogInterface.OnCancelListener onCancelListener) {
            this.P.mOnCancelListener = onCancelListener;
            return this;
        }
        
        public Builder setOnDismissListener(final DialogInterface.OnDismissListener onDismissListener) {
            this.P.mOnDismissListener = onDismissListener;
            return this;
        }
        
        public Builder setOnKeyListener(final DialogInterface.OnKeyListener onKeyListener) {
            this.P.mOnKeyListener = onKeyListener;
            return this;
        }
        
        public Builder setItems(@ArrayRes final int itemsId, final DialogInterface.OnClickListener listener) {
            this.P.mItems = this.P.mContext.getResources().getTextArray(itemsId);
            this.P.mOnClickListener = listener;
            return this;
        }
        
        public Builder setItems(final CharSequence[] items, final DialogInterface.OnClickListener listener) {
            this.P.mItems = items;
            this.P.mOnClickListener = listener;
            return this;
        }
        
        public Builder setAdapter(final ListAdapter adapter, final DialogInterface.OnClickListener listener) {
            this.P.mAdapter = adapter;
            this.P.mOnClickListener = listener;
            return this;
        }
        
        public Builder setCursor(final Cursor cursor, final DialogInterface.OnClickListener listener, final String labelColumn) {
            this.P.mCursor = cursor;
            this.P.mLabelColumn = labelColumn;
            this.P.mOnClickListener = listener;
            return this;
        }
        
        public Builder setMultiChoiceItems(@ArrayRes final int itemsId, final boolean[] checkedItems, final DialogInterface.OnMultiChoiceClickListener listener) {
            this.P.mItems = this.P.mContext.getResources().getTextArray(itemsId);
            this.P.mOnCheckboxClickListener = listener;
            this.P.mCheckedItems = checkedItems;
            this.P.mIsMultiChoice = true;
            return this;
        }
        
        public Builder setMultiChoiceItems(final CharSequence[] items, final boolean[] checkedItems, final DialogInterface.OnMultiChoiceClickListener listener) {
            this.P.mItems = items;
            this.P.mOnCheckboxClickListener = listener;
            this.P.mCheckedItems = checkedItems;
            this.P.mIsMultiChoice = true;
            return this;
        }
        
        public Builder setMultiChoiceItems(final Cursor cursor, final String isCheckedColumn, final String labelColumn, final DialogInterface.OnMultiChoiceClickListener listener) {
            this.P.mCursor = cursor;
            this.P.mOnCheckboxClickListener = listener;
            this.P.mIsCheckedColumn = isCheckedColumn;
            this.P.mLabelColumn = labelColumn;
            this.P.mIsMultiChoice = true;
            return this;
        }
        
        public Builder setSingleChoiceItems(@ArrayRes final int itemsId, final int checkedItem, final DialogInterface.OnClickListener listener) {
            this.P.mItems = this.P.mContext.getResources().getTextArray(itemsId);
            this.P.mOnClickListener = listener;
            this.P.mCheckedItem = checkedItem;
            this.P.mIsSingleChoice = true;
            return this;
        }
        
        public Builder setSingleChoiceItems(final Cursor cursor, final int checkedItem, final String labelColumn, final DialogInterface.OnClickListener listener) {
            this.P.mCursor = cursor;
            this.P.mOnClickListener = listener;
            this.P.mCheckedItem = checkedItem;
            this.P.mLabelColumn = labelColumn;
            this.P.mIsSingleChoice = true;
            return this;
        }
        
        public Builder setSingleChoiceItems(final CharSequence[] items, final int checkedItem, final DialogInterface.OnClickListener listener) {
            this.P.mItems = items;
            this.P.mOnClickListener = listener;
            this.P.mCheckedItem = checkedItem;
            this.P.mIsSingleChoice = true;
            return this;
        }
        
        public Builder setSingleChoiceItems(final ListAdapter adapter, final int checkedItem, final DialogInterface.OnClickListener listener) {
            this.P.mAdapter = adapter;
            this.P.mOnClickListener = listener;
            this.P.mCheckedItem = checkedItem;
            this.P.mIsSingleChoice = true;
            return this;
        }
        
        public Builder setOnItemSelectedListener(final AdapterView.OnItemSelectedListener listener) {
            this.P.mOnItemSelectedListener = listener;
            return this;
        }
        
        public Builder setView(final int layoutResId) {
            this.P.mView = null;
            this.P.mViewLayoutResId = layoutResId;
            this.P.mViewSpacingSpecified = false;
            return this;
        }
        
        public Builder setView(final View view) {
            this.P.mView = view;
            this.P.mViewLayoutResId = 0;
            this.P.mViewSpacingSpecified = false;
            return this;
        }
        
        @Deprecated
        @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
        public Builder setView(final View view, final int viewSpacingLeft, final int viewSpacingTop, final int viewSpacingRight, final int viewSpacingBottom) {
            this.P.mView = view;
            this.P.mViewLayoutResId = 0;
            this.P.mViewSpacingSpecified = true;
            this.P.mViewSpacingLeft = viewSpacingLeft;
            this.P.mViewSpacingTop = viewSpacingTop;
            this.P.mViewSpacingRight = viewSpacingRight;
            this.P.mViewSpacingBottom = viewSpacingBottom;
            return this;
        }
        
        @Deprecated
        public Builder setInverseBackgroundForced(final boolean useInverseBackground) {
            this.P.mForceInverseBackground = useInverseBackground;
            return this;
        }
        
        @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
        public Builder setRecycleOnMeasureEnabled(final boolean enabled) {
            this.P.mRecycleOnMeasure = enabled;
            return this;
        }
        
        @NonNull
        public AlertDialog create() {
            final AlertDialog dialog = new AlertDialog(this.P.mContext, this.mTheme);
            this.P.apply(dialog.mAlert);
            dialog.setCancelable(this.P.mCancelable);
            if (this.P.mCancelable) {
                dialog.setCanceledOnTouchOutside(true);
            }
            dialog.setOnCancelListener(this.P.mOnCancelListener);
            dialog.setOnDismissListener(this.P.mOnDismissListener);
            if (this.P.mOnKeyListener != null) {
                dialog.setOnKeyListener(this.P.mOnKeyListener);
            }
            return dialog;
        }
        
        public AlertDialog show() {
            final AlertDialog dialog = this.create();
            dialog.show();
            return dialog;
        }
    }
}
