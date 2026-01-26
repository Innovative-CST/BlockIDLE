package androidx.appcompat.widget;

import androidx.annotation.UiThread;
import android.view.inputmethod.InputMethodManager;
import androidx.core.graphics.TypefaceCompat;
import android.graphics.Typeface;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.annotation.RequiresApi;
import android.view.textclassifier.TextClassifier;
import java.util.concurrent.ExecutionException;
import android.view.ActionMode;
import androidx.annotation.FloatRange;
import androidx.core.widget.TextViewCompat;
import android.os.Build;
import androidx.annotation.IntRange;
import androidx.annotation.Px;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.annotation.SuppressLint;
import android.text.InputFilter;
import android.graphics.PorterDuff;
import androidx.annotation.RestrictTo;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import androidx.core.text.PrecomputedTextCompat;
import java.util.concurrent.Future;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TintableCompoundDrawablesView;
import androidx.core.view.TintableBackgroundView;
import android.widget.TextView;

public class AppCompatTextView extends TextView implements TintableBackgroundView, TintableCompoundDrawablesView, AutoSizeableTextView, EmojiCompatConfigurationView
{
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private final AppCompatTextHelper mTextHelper;
    private final AppCompatTextClassifierHelper mTextClassifierHelper;
    @NonNull
    private AppCompatEmojiTextHelper mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    @Nullable
    private SuperCaller mSuperCaller;
    @Nullable
    private Future<PrecomputedTextCompat> mPrecomputedTextFuture;
    
    public AppCompatTextView(@NonNull final Context context) {
        this(context, null);
    }
    
    public AppCompatTextView(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, 16842884);
    }
    
    public AppCompatTextView(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(TintContextWrapper.wrap(context), attrs, defStyleAttr);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        ThemeUtils.checkAppCompatTheme((View)this, this.getContext());
        (this.mBackgroundTintHelper = new AppCompatBackgroundHelper((View)this)).loadFromAttributes(attrs, defStyleAttr);
        (this.mTextHelper = new AppCompatTextHelper(this)).loadFromAttributes(attrs, defStyleAttr);
        this.mTextHelper.applyCompoundDrawablesTints();
        this.mTextClassifierHelper = new AppCompatTextClassifierHelper(this);
        final AppCompatEmojiTextHelper emojiTextViewHelper = this.getEmojiTextViewHelper();
        emojiTextViewHelper.loadFromAttributes(attrs, defStyleAttr);
    }
    
    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new AppCompatEmojiTextHelper(this);
        }
        return this.mEmojiTextViewHelper;
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
    
    public void setTextAppearance(final Context context, final int resId) {
        super.setTextAppearance(context, resId);
        if (this.mTextHelper != null) {
            this.mTextHelper.onSetTextAppearance(context, resId);
        }
    }
    
    public void setFilters(@NonNull final InputFilter[] filters) {
        super.setFilters(this.getEmojiTextViewHelper().getFilters(filters));
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
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.applySupportBackgroundTint();
        }
        if (this.mTextHelper != null) {
            this.mTextHelper.applyCompoundDrawablesTints();
        }
    }
    
    protected void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (this.mTextHelper != null) {
            this.mTextHelper.onLayout(changed, left, top, right, bottom);
        }
    }
    
    public void setTextSize(final int unit, final float size) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            super.setTextSize(unit, size);
        }
        else if (this.mTextHelper != null) {
            this.mTextHelper.setTextSize(unit, size);
        }
    }
    
    protected void onTextChanged(final CharSequence text, final int start, final int lengthBefore, final int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        final boolean useHelper = this.mTextHelper != null && !ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE && this.mTextHelper.isAutoSizeEnabled();
        if (useHelper) {
            this.mTextHelper.autoSizeText();
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setAutoSizeTextTypeWithDefaults(final int autoSizeTextType) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            this.getSuperCaller().setAutoSizeTextTypeWithDefaults(autoSizeTextType);
        }
        else if (this.mTextHelper != null) {
            this.mTextHelper.setAutoSizeTextTypeWithDefaults(autoSizeTextType);
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setAutoSizeTextTypeUniformWithConfiguration(final int autoSizeMinTextSize, final int autoSizeMaxTextSize, final int autoSizeStepGranularity, final int unit) throws IllegalArgumentException {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            this.getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        }
        else if (this.mTextHelper != null) {
            this.mTextHelper.setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull final int[] presetSizes, final int unit) throws IllegalArgumentException {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            this.getSuperCaller().setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
        }
        else if (this.mTextHelper != null) {
            this.mTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    @SuppressLint({ "WrongConstant" })
    public int getAutoSizeTextType() {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return (this.getSuperCaller().getAutoSizeTextType() == 1) ? 1 : 0;
        }
        if (this.mTextHelper != null) {
            return this.mTextHelper.getAutoSizeTextType();
        }
        return 0;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public int getAutoSizeStepGranularity() {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return this.getSuperCaller().getAutoSizeStepGranularity();
        }
        if (this.mTextHelper != null) {
            return this.mTextHelper.getAutoSizeStepGranularity();
        }
        return -1;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public int getAutoSizeMinTextSize() {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return this.getSuperCaller().getAutoSizeMinTextSize();
        }
        if (this.mTextHelper != null) {
            return this.mTextHelper.getAutoSizeMinTextSize();
        }
        return -1;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public int getAutoSizeMaxTextSize() {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return this.getSuperCaller().getAutoSizeMaxTextSize();
        }
        if (this.mTextHelper != null) {
            return this.mTextHelper.getAutoSizeMaxTextSize();
        }
        return -1;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public int[] getAutoSizeTextAvailableSizes() {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return this.getSuperCaller().getAutoSizeTextAvailableSizes();
        }
        if (this.mTextHelper != null) {
            return this.mTextHelper.getAutoSizeTextAvailableSizes();
        }
        return new int[0];
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo outAttrs) {
        final InputConnection ic = super.onCreateInputConnection(outAttrs);
        this.mTextHelper.populateSurroundingTextIfNeeded(this, ic, outAttrs);
        return AppCompatHintHelper.onCreateInputConnection(ic, outAttrs, (View)this);
    }
    
    public void setFirstBaselineToTopHeight(@Px @IntRange(from = 0L) final int firstBaselineToTopHeight) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.getSuperCaller().setFirstBaselineToTopHeight(firstBaselineToTopHeight);
        }
        else {
            TextViewCompat.setFirstBaselineToTopHeight((TextView)this, firstBaselineToTopHeight);
        }
    }
    
    public void setLastBaselineToBottomHeight(@Px @IntRange(from = 0L) final int lastBaselineToBottomHeight) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.getSuperCaller().setLastBaselineToBottomHeight(lastBaselineToBottomHeight);
        }
        else {
            TextViewCompat.setLastBaselineToBottomHeight((TextView)this, lastBaselineToBottomHeight);
        }
    }
    
    public int getFirstBaselineToTopHeight() {
        return TextViewCompat.getFirstBaselineToTopHeight((TextView)this);
    }
    
    public int getLastBaselineToBottomHeight() {
        return TextViewCompat.getLastBaselineToBottomHeight((TextView)this);
    }
    
    public void setLineHeight(@Px @IntRange(from = 0L) final int lineHeight) {
        TextViewCompat.setLineHeight((TextView)this, lineHeight);
    }
    
    public void setLineHeight(final int unit, @FloatRange(from = 0.0) final float lineHeight) {
        if (Build.VERSION.SDK_INT >= 34) {
            this.getSuperCaller().setLineHeight(unit, lineHeight);
        }
        else {
            TextViewCompat.setLineHeight((TextView)this, unit, lineHeight);
        }
    }
    
    public void setCustomSelectionActionModeCallback(@Nullable final ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback((TextView)this, actionModeCallback));
    }
    
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }
    
    @NonNull
    public PrecomputedTextCompat.Params getTextMetricsParamsCompat() {
        return TextViewCompat.getTextMetricsParams((TextView)this);
    }
    
    public void setTextMetricsParamsCompat(@NonNull final PrecomputedTextCompat.Params params) {
        TextViewCompat.setTextMetricsParams((TextView)this, params);
    }
    
    public void setPrecomputedText(@NonNull final PrecomputedTextCompat precomputed) {
        TextViewCompat.setPrecomputedText((TextView)this, precomputed);
    }
    
    private void consumeTextFutureAndSetBlocking() {
        if (this.mPrecomputedTextFuture != null) {
            try {
                final Future<PrecomputedTextCompat> future = this.mPrecomputedTextFuture;
                this.mPrecomputedTextFuture = null;
                TextViewCompat.setPrecomputedText((TextView)this, (PrecomputedTextCompat)future.get());
            }
            catch (final InterruptedException | ExecutionException ex) {}
        }
    }
    
    public CharSequence getText() {
        this.consumeTextFutureAndSetBlocking();
        return super.getText();
    }
    
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable final TextClassifier textClassifier) {
        if (Build.VERSION.SDK_INT >= 28 || this.mTextClassifierHelper == null) {
            this.getSuperCaller().setTextClassifier(textClassifier);
            return;
        }
        this.mTextClassifierHelper.setTextClassifier(textClassifier);
    }
    
    @RequiresApi(api = 26)
    @NonNull
    public TextClassifier getTextClassifier() {
        if (Build.VERSION.SDK_INT >= 28 || this.mTextClassifierHelper == null) {
            return this.getSuperCaller().getTextClassifier();
        }
        return this.mTextClassifierHelper.getTextClassifier();
    }
    
    public void setTextFuture(@Nullable final Future<PrecomputedTextCompat> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            this.requestLayout();
        }
    }
    
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        this.consumeTextFutureAndSetBlocking();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
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
    
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable final Drawable left, @Nullable final Drawable top, @Nullable final Drawable right, @Nullable final Drawable bottom) {
        super.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        if (this.mTextHelper != null) {
            this.mTextHelper.onSetCompoundDrawables();
        }
    }
    
    public void setCompoundDrawablesWithIntrinsicBounds(final int left, final int top, final int right, final int bottom) {
        final Context context = this.getContext();
        this.setCompoundDrawablesWithIntrinsicBounds((left != 0) ? AppCompatResources.getDrawable(context, left) : null, (top != 0) ? AppCompatResources.getDrawable(context, top) : null, (right != 0) ? AppCompatResources.getDrawable(context, right) : null, (bottom != 0) ? AppCompatResources.getDrawable(context, bottom) : null);
        if (this.mTextHelper != null) {
            this.mTextHelper.onSetCompoundDrawables();
        }
    }
    
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable final Drawable start, @Nullable final Drawable top, @Nullable final Drawable end, @Nullable final Drawable bottom) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        if (this.mTextHelper != null) {
            this.mTextHelper.onSetCompoundDrawables();
        }
    }
    
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(final int start, final int top, final int end, final int bottom) {
        final Context context = this.getContext();
        this.setCompoundDrawablesRelativeWithIntrinsicBounds((start != 0) ? AppCompatResources.getDrawable(context, start) : null, (top != 0) ? AppCompatResources.getDrawable(context, top) : null, (end != 0) ? AppCompatResources.getDrawable(context, end) : null, (bottom != 0) ? AppCompatResources.getDrawable(context, bottom) : null);
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
    
    public void setTypeface(@Nullable final Typeface tf, final int style) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface finalTypeface = null;
        if (tf != null && style > 0) {
            finalTypeface = TypefaceCompat.create(this.getContext(), tf, style);
        }
        this.mIsSetTypefaceProcessing = true;
        try {
            super.setTypeface((finalTypeface != null) ? finalTypeface : tf, style);
        }
        finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33 && this.onCheckIsTextEditor()) {
            final InputMethodManager imm = (InputMethodManager)this.getContext().getSystemService("input_method");
            imm.isActive((View)this);
        }
    }
    
    @UiThread
    @RequiresApi(api = 26)
    SuperCaller getSuperCaller() {
        if (this.mSuperCaller == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.mSuperCaller = new SuperCallerApi34();
            }
            else if (Build.VERSION.SDK_INT >= 28) {
                this.mSuperCaller = new SuperCallerApi28();
            }
            else if (Build.VERSION.SDK_INT >= 26) {
                this.mSuperCaller = new SuperCallerApi26();
            }
        }
        return this.mSuperCaller;
    }
    
    static /* synthetic */ int access$001(final AppCompatTextView x0) {
        return x0.getAutoSizeMaxTextSize();
    }
    
    static /* synthetic */ int access$101(final AppCompatTextView x0) {
        return x0.getAutoSizeMinTextSize();
    }
    
    static /* synthetic */ int access$201(final AppCompatTextView x0) {
        return x0.getAutoSizeStepGranularity();
    }
    
    static /* synthetic */ int[] access$301(final AppCompatTextView x0) {
        return x0.getAutoSizeTextAvailableSizes();
    }
    
    static /* synthetic */ int access$401(final AppCompatTextView x0) {
        return x0.getAutoSizeTextType();
    }
    
    static /* synthetic */ TextClassifier access$501(final AppCompatTextView x0) {
        return x0.getTextClassifier();
    }
    
    static /* synthetic */ void access$601(final AppCompatTextView x0, final int x1, final int x2, final int x3, final int x4) {
        x0.setAutoSizeTextTypeUniformWithConfiguration(x1, x2, x3, x4);
    }
    
    static /* synthetic */ void access$701(final AppCompatTextView x0, final int[] x1, final int x2) {
        x0.setAutoSizeTextTypeUniformWithPresetSizes(x1, x2);
    }
    
    static /* synthetic */ void access$801(final AppCompatTextView x0, final int x1) {
        x0.setAutoSizeTextTypeWithDefaults(x1);
    }
    
    static /* synthetic */ void access$901(final AppCompatTextView x0, final TextClassifier x1) {
        x0.setTextClassifier(x1);
    }
    
    static /* synthetic */ void access$1001(final AppCompatTextView x0, final int x1) {
        x0.setFirstBaselineToTopHeight(x1);
    }
    
    static /* synthetic */ void access$1101(final AppCompatTextView x0, final int x1) {
        x0.setLastBaselineToBottomHeight(x1);
    }
    
    static /* synthetic */ void access$1201(final AppCompatTextView x0, final int x1, final float x2) {
        x0.setLineHeight(x1, x2);
    }
    
    @RequiresApi(api = 26)
    class SuperCallerApi26 implements SuperCaller
    {
        @Override
        public int getAutoSizeMaxTextSize() {
            return AppCompatTextView.access$001(AppCompatTextView.this);
        }
        
        @Override
        public int getAutoSizeMinTextSize() {
            return AppCompatTextView.access$101(AppCompatTextView.this);
        }
        
        @Override
        public int getAutoSizeStepGranularity() {
            return AppCompatTextView.access$201(AppCompatTextView.this);
        }
        
        @Override
        public int[] getAutoSizeTextAvailableSizes() {
            return AppCompatTextView.access$301(AppCompatTextView.this);
        }
        
        @Override
        public int getAutoSizeTextType() {
            return AppCompatTextView.access$401(AppCompatTextView.this);
        }
        
        @Override
        public TextClassifier getTextClassifier() {
            return AppCompatTextView.access$501(AppCompatTextView.this);
        }
        
        @Override
        public void setAutoSizeTextTypeUniformWithConfiguration(final int autoSizeMinTextSize, final int autoSizeMaxTextSize, final int autoSizeStepGranularity, final int unit) {
            AppCompatTextView.access$601(AppCompatTextView.this, autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        }
        
        @Override
        public void setAutoSizeTextTypeUniformWithPresetSizes(final int[] presetSizes, final int unit) {
            AppCompatTextView.access$701(AppCompatTextView.this, presetSizes, unit);
        }
        
        @Override
        public void setAutoSizeTextTypeWithDefaults(final int autoSizeTextType) {
            AppCompatTextView.access$801(AppCompatTextView.this, autoSizeTextType);
        }
        
        @Override
        public void setTextClassifier(@Nullable final TextClassifier textClassifier) {
            AppCompatTextView.access$901(AppCompatTextView.this, textClassifier);
        }
        
        @Override
        public void setFirstBaselineToTopHeight(final int firstBaselineToTopHeight) {
        }
        
        @Override
        public void setLastBaselineToBottomHeight(final int lastBaselineToBottomHeight) {
        }
        
        @Override
        public void setLineHeight(final int unit, final float lineHeight) {
        }
    }
    
    @RequiresApi(api = 28)
    class SuperCallerApi28 extends SuperCallerApi26
    {
        @Override
        public void setFirstBaselineToTopHeight(@Px final int firstBaselineToTopHeight) {
            AppCompatTextView.access$1001(AppCompatTextView.this, firstBaselineToTopHeight);
        }
        
        @Override
        public void setLastBaselineToBottomHeight(@Px final int lastBaselineToBottomHeight) {
            AppCompatTextView.access$1101(AppCompatTextView.this, lastBaselineToBottomHeight);
        }
    }
    
    @RequiresApi(api = 34)
    class SuperCallerApi34 extends SuperCallerApi28
    {
        @Override
        public void setLineHeight(final int unit, final float lineHeight) {
            AppCompatTextView.access$1201(AppCompatTextView.this, unit, lineHeight);
        }
    }
    
    private interface SuperCaller
    {
        int getAutoSizeMaxTextSize();
        
        int getAutoSizeMinTextSize();
        
        int getAutoSizeStepGranularity();
        
        int[] getAutoSizeTextAvailableSizes();
        
        int getAutoSizeTextType();
        
        TextClassifier getTextClassifier();
        
        void setAutoSizeTextTypeUniformWithConfiguration(final int p0, final int p1, final int p2, final int p3);
        
        void setAutoSizeTextTypeUniformWithPresetSizes(final int[] p0, final int p1);
        
        void setAutoSizeTextTypeWithDefaults(final int p0);
        
        void setTextClassifier(@Nullable final TextClassifier p0);
        
        void setFirstBaselineToTopHeight(@Px final int p0);
        
        void setLastBaselineToBottomHeight(@Px final int p0);
        
        void setLineHeight(final int p0, @FloatRange(from = 0.0) final float p1);
    }
}
