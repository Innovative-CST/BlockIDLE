package androidx.appcompat.widget;

import androidx.core.view.ContentInfoCompat;
import android.view.DragEvent;
import android.view.textclassifier.TextClassifier;
import androidx.annotation.RequiresApi;
import androidx.annotation.UiThread;
import android.view.inputmethod.InputMethodManager;
import androidx.core.widget.TextViewCompat;
import android.view.ActionMode;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.ViewCompat;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.graphics.PorterDuff;
import androidx.annotation.RestrictTo;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.widget.TextView;
import android.view.View;
import androidx.appcompat.R;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.core.widget.TextViewOnReceiveContentListener;
import androidx.core.widget.TintableCompoundDrawablesView;
import androidx.core.view.OnReceiveContentViewBehavior;
import androidx.core.view.TintableBackgroundView;
import android.widget.EditText;

public class AppCompatEditText extends EditText implements TintableBackgroundView, OnReceiveContentViewBehavior, EmojiCompatConfigurationView, TintableCompoundDrawablesView
{
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private final AppCompatTextHelper mTextHelper;
    private final AppCompatTextClassifierHelper mTextClassifierHelper;
    private final TextViewOnReceiveContentListener mDefaultOnReceiveContentListener;
    @NonNull
    private final AppCompatEmojiEditTextHelper mAppCompatEmojiEditTextHelper;
    @Nullable
    private SuperCaller mSuperCaller;
    
    public AppCompatEditText(@NonNull final Context context) {
        this(context, null);
    }
    
    public AppCompatEditText(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, R.attr.editTextStyle);
    }
    
    public AppCompatEditText(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(TintContextWrapper.wrap(context), attrs, defStyleAttr);
        ThemeUtils.checkAppCompatTheme((View)this, this.getContext());
        (this.mBackgroundTintHelper = new AppCompatBackgroundHelper((View)this)).loadFromAttributes(attrs, defStyleAttr);
        (this.mTextHelper = new AppCompatTextHelper((TextView)this)).loadFromAttributes(attrs, defStyleAttr);
        this.mTextHelper.applyCompoundDrawablesTints();
        this.mTextClassifierHelper = new AppCompatTextClassifierHelper((TextView)this);
        this.mDefaultOnReceiveContentListener = new TextViewOnReceiveContentListener();
        (this.mAppCompatEmojiEditTextHelper = new AppCompatEmojiEditTextHelper(this)).loadFromAttributes(attrs, defStyleAttr);
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
    
    @Nullable
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
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
    
    @Nullable
    public InputConnection onCreateInputConnection(@NonNull final EditorInfo outAttrs) {
        InputConnection ic = super.onCreateInputConnection(outAttrs);
        this.mTextHelper.populateSurroundingTextIfNeeded((TextView)this, ic, outAttrs);
        ic = AppCompatHintHelper.onCreateInputConnection(ic, outAttrs, (View)this);
        if (ic != null && Build.VERSION.SDK_INT <= 30) {
            final String[] mimeTypes = ViewCompat.getOnReceiveContentMimeTypes((View)this);
            if (mimeTypes != null) {
                EditorInfoCompat.setContentMimeTypes(outAttrs, mimeTypes);
                ic = InputConnectionCompat.createWrapper((View)this, ic, outAttrs);
            }
        }
        return this.mAppCompatEmojiEditTextHelper.onCreateInputConnection(ic, outAttrs);
    }
    
    public void setCustomSelectionActionModeCallback(@Nullable final ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback((TextView)this, actionModeCallback));
    }
    
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33) {
            final InputMethodManager imm = (InputMethodManager)this.getContext().getSystemService("input_method");
            imm.isActive((View)this);
        }
    }
    
    @UiThread
    @NonNull
    @RequiresApi(26)
    private SuperCaller getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new SuperCaller();
        }
        return this.mSuperCaller;
    }
    
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable final TextClassifier textClassifier) {
        if (Build.VERSION.SDK_INT >= 28 || this.mTextClassifierHelper == null) {
            this.getSuperCaller().setTextClassifier(textClassifier);
            return;
        }
        this.mTextClassifierHelper.setTextClassifier(textClassifier);
    }
    
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        if (Build.VERSION.SDK_INT >= 28 || this.mTextClassifierHelper == null) {
            return this.getSuperCaller().getTextClassifier();
        }
        return this.mTextClassifierHelper.getTextClassifier();
    }
    
    public boolean onDragEvent(final DragEvent event) {
        return AppCompatReceiveContentHelper.maybeHandleDragEventViaPerformReceiveContent((View)this, event) || super.onDragEvent(event);
    }
    
    public boolean onTextContextMenuItem(final int id) {
        return AppCompatReceiveContentHelper.maybeHandleMenuActionViaPerformReceiveContent((TextView)this, id) || super.onTextContextMenuItem(id);
    }
    
    @Nullable
    public ContentInfoCompat onReceiveContent(@NonNull final ContentInfoCompat payload) {
        return this.mDefaultOnReceiveContentListener.onReceiveContent((View)this, payload);
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
    
    static /* synthetic */ TextClassifier access$001(final AppCompatEditText x0) {
        return x0.getTextClassifier();
    }
    
    static /* synthetic */ void access$101(final AppCompatEditText x0, final TextClassifier x1) {
        x0.setTextClassifier(x1);
    }
    
    @RequiresApi(api = 26)
    class SuperCaller
    {
        @Nullable
        public TextClassifier getTextClassifier() {
            return AppCompatEditText.access$001(AppCompatEditText.this);
        }
        
        public void setTextClassifier(final TextClassifier textClassifier) {
            AppCompatEditText.access$101(AppCompatEditText.this, textClassifier);
        }
    }
}
