package androidx.appcompat.widget;

import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.graphics.PorterDuff;
import androidx.annotation.RestrictTo;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.annotation.DrawableRes;
import android.text.method.KeyListener;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import androidx.appcompat.R;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.core.widget.TintableCompoundDrawablesView;
import androidx.core.view.TintableBackgroundView;
import android.widget.MultiAutoCompleteTextView;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView
{
    private static final int[] TINT_ATTRS;
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private final AppCompatTextHelper mTextHelper;
    @NonNull
    private final AppCompatEmojiEditTextHelper mAppCompatEmojiEditTextHelper;
    
    public AppCompatMultiAutoCompleteTextView(@NonNull final Context context) {
        this(context, null);
    }
    
    public AppCompatMultiAutoCompleteTextView(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, R.attr.autoCompleteTextViewStyle);
    }
    
    public AppCompatMultiAutoCompleteTextView(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(TintContextWrapper.wrap(context), attrs, defStyleAttr);
        ThemeUtils.checkAppCompatTheme((View)this, this.getContext());
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(this.getContext(), attrs, AppCompatMultiAutoCompleteTextView.TINT_ATTRS, defStyleAttr, 0);
        if (a.hasValue(0)) {
            this.setDropDownBackgroundDrawable(a.getDrawable(0));
        }
        a.recycle();
        (this.mBackgroundTintHelper = new AppCompatBackgroundHelper((View)this)).loadFromAttributes(attrs, defStyleAttr);
        (this.mTextHelper = new AppCompatTextHelper((TextView)this)).loadFromAttributes(attrs, defStyleAttr);
        this.mTextHelper.applyCompoundDrawablesTints();
        (this.mAppCompatEmojiEditTextHelper = new AppCompatEmojiEditTextHelper((EditText)this)).loadFromAttributes(attrs, defStyleAttr);
        this.initEmojiKeyListener(this.mAppCompatEmojiEditTextHelper);
    }
    
    void initEmojiKeyListener(final AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper) {
        final KeyListener currentKeyListener = this.getKeyListener();
        if (appCompatEmojiEditTextHelper.isEmojiCapableKeyListener(currentKeyListener)) {
            final boolean wasFocusable = super.isFocusable();
            final boolean wasClickable = super.isClickable();
            final boolean wasLongClickable = super.isLongClickable();
            final int inputType = super.getInputType();
            final KeyListener wrappedKeyListener = appCompatEmojiEditTextHelper.getKeyListener(currentKeyListener);
            if (wrappedKeyListener == currentKeyListener) {
                return;
            }
            super.setKeyListener(wrappedKeyListener);
            super.setRawInputType(inputType);
            super.setFocusable(wasFocusable);
            super.setClickable(wasClickable);
            super.setLongClickable(wasLongClickable);
        }
    }
    
    public void setDropDownBackgroundResource(@DrawableRes final int resId) {
        this.setDropDownBackgroundDrawable(AppCompatResources.getDrawable(this.getContext(), resId));
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
        if (this.mTextHelper != null) {
            this.mTextHelper.applyCompoundDrawablesTints();
        }
    }
    
    public void setTextAppearance(final Context context, final int resId) {
        super.setTextAppearance(context, resId);
        if (this.mTextHelper != null) {
            this.mTextHelper.onSetTextAppearance(context, resId);
        }
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo outAttrs) {
        final InputConnection inputConnection = AppCompatHintHelper.onCreateInputConnection(super.onCreateInputConnection(outAttrs), outAttrs, (View)this);
        return this.mAppCompatEmojiEditTextHelper.onCreateInputConnection(inputConnection, outAttrs);
    }
    
    public void setKeyListener(@Nullable final KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.getKeyListener(keyListener));
    }
    
    public void setEmojiCompatEnabled(final boolean enabled) {
        this.mAppCompatEmojiEditTextHelper.setEnabled(enabled);
    }
    
    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.isEnabled();
    }
    
    public void setCompoundDrawables(@Nullable final Drawable left, @Nullable final Drawable top, @Nullable final Drawable right, @Nullable final Drawable bottom) {
        super.setCompoundDrawables(left, top, right, bottom);
        if (this.mTextHelper != null) {
            this.mTextHelper.onSetCompoundDrawables();
        }
    }
    
    public void setCompoundDrawablesRelative(@Nullable final Drawable start, @Nullable final Drawable top, @Nullable final Drawable end, @Nullable final Drawable bottom) {
        super.setCompoundDrawablesRelative(start, top, end, bottom);
        if (this.mTextHelper != null) {
            this.mTextHelper.onSetCompoundDrawables();
        }
    }
    
    @Nullable
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.getCompoundDrawableTintList();
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setSupportCompoundDrawablesTintList(@Nullable final ColorStateList tintList) {
        this.mTextHelper.setCompoundDrawableTintList(tintList);
        this.mTextHelper.applyCompoundDrawablesTints();
    }
    
    @Nullable
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.getCompoundDrawableTintMode();
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setSupportCompoundDrawablesTintMode(@Nullable final PorterDuff.Mode tintMode) {
        this.mTextHelper.setCompoundDrawableTintMode(tintMode);
        this.mTextHelper.applyCompoundDrawablesTints();
    }
    
    static {
        TINT_ATTRS = new int[] { 16843126 };
    }
}
