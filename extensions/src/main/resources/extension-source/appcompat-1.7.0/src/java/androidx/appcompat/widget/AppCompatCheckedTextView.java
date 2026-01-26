package androidx.appcompat.widget;

import androidx.core.widget.TextViewCompat;
import android.view.ActionMode;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.graphics.PorterDuff;
import androidx.annotation.RestrictTo;
import android.content.res.ColorStateList;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.annotation.DrawableRes;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.view.View;
import androidx.appcompat.R;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.core.widget.TintableCompoundDrawablesView;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCheckedTextView;
import android.widget.CheckedTextView;

public class AppCompatCheckedTextView extends CheckedTextView implements TintableCheckedTextView, TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView
{
    private final AppCompatCheckedTextViewHelper mCheckedHelper;
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private final AppCompatTextHelper mTextHelper;
    @NonNull
    private AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
    
    public AppCompatCheckedTextView(@NonNull final Context context) {
        this(context, null);
    }
    
    public AppCompatCheckedTextView(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, R.attr.checkedTextViewStyle);
    }
    
    public AppCompatCheckedTextView(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(TintContextWrapper.wrap(context), attrs, defStyleAttr);
        ThemeUtils.checkAppCompatTheme((View)this, this.getContext());
        (this.mTextHelper = new AppCompatTextHelper((TextView)this)).loadFromAttributes(attrs, defStyleAttr);
        this.mTextHelper.applyCompoundDrawablesTints();
        (this.mBackgroundTintHelper = new AppCompatBackgroundHelper((View)this)).loadFromAttributes(attrs, defStyleAttr);
        (this.mCheckedHelper = new AppCompatCheckedTextViewHelper(this)).loadFromAttributes(attrs, defStyleAttr);
        final AppCompatEmojiTextHelper emojiTextViewHelper = this.getEmojiTextViewHelper();
        emojiTextViewHelper.loadFromAttributes(attrs, defStyleAttr);
    }
    
    public void setCheckMarkDrawable(@Nullable final Drawable d) {
        super.setCheckMarkDrawable(d);
        if (this.mCheckedHelper != null) {
            this.mCheckedHelper.onSetCheckMarkDrawable();
        }
    }
    
    public void setCheckMarkDrawable(@DrawableRes final int resId) {
        this.setCheckMarkDrawable(AppCompatResources.getDrawable(this.getContext(), resId));
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setSupportCheckMarkTintList(@Nullable final ColorStateList tint) {
        if (this.mCheckedHelper != null) {
            this.mCheckedHelper.setSupportCheckMarkTintList(tint);
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    @Nullable
    public ColorStateList getSupportCheckMarkTintList() {
        return (this.mCheckedHelper != null) ? this.mCheckedHelper.getSupportCheckMarkTintList() : null;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setSupportCheckMarkTintMode(@Nullable final PorterDuff.Mode tintMode) {
        if (this.mCheckedHelper != null) {
            this.mCheckedHelper.setSupportCheckMarkTintMode(tintMode);
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    @Nullable
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        return (this.mCheckedHelper != null) ? this.mCheckedHelper.getSupportCheckMarkTintMode() : null;
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
    
    public void setBackgroundDrawable(@Nullable final Drawable background) {
        super.setBackgroundDrawable(background);
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.onSetBackgroundDrawable(background);
        }
    }
    
    public void setBackgroundResource(@DrawableRes final int resId) {
        super.setBackgroundResource(resId);
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.onSetBackgroundResource(resId);
        }
    }
    
    public void setTextAppearance(@NonNull final Context context, final int resId) {
        super.setTextAppearance(context, resId);
        if (this.mTextHelper != null) {
            this.mTextHelper.onSetTextAppearance(context, resId);
        }
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mTextHelper != null) {
            this.mTextHelper.applyCompoundDrawablesTints();
        }
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.applySupportBackgroundTint();
        }
        if (this.mCheckedHelper != null) {
            this.mCheckedHelper.applyCheckMarkTint();
        }
    }
    
    @Nullable
    public InputConnection onCreateInputConnection(@NonNull final EditorInfo outAttrs) {
        return AppCompatHintHelper.onCreateInputConnection(super.onCreateInputConnection(outAttrs), outAttrs, (View)this);
    }
    
    public void setCustomSelectionActionModeCallback(@Nullable final ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback((TextView)this, actionModeCallback));
    }
    
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }
    
    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new AppCompatEmojiTextHelper((TextView)this);
        }
        return this.mAppCompatEmojiTextHelper;
    }
    
    public void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        this.getEmojiTextViewHelper().setAllCaps(allCaps);
    }
    
    public void setEmojiCompatEnabled(final boolean enabled) {
        this.getEmojiTextViewHelper().setEnabled(enabled);
    }
    
    public boolean isEmojiCompatEnabled() {
        return this.getEmojiTextViewHelper().isEnabled();
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
}
