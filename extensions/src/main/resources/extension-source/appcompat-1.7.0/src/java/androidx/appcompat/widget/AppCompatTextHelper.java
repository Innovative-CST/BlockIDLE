package androidx.appcompat.widget;

import java.util.Locale;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.inputmethod.EditorInfoCompat;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.RestrictTo;
import android.content.res.Resources;
import androidx.core.content.res.ResourcesCompat;
import java.lang.ref.WeakReference;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.content.Context;
import android.util.TypedValue;
import androidx.core.util.TypedValueCompat;
import android.graphics.PorterDuff;
import androidx.core.widget.TextViewCompat;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.appcompat.R;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import android.widget.TextView;

class AppCompatTextHelper
{
    private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int MONOSPACE = 3;
    @NonNull
    private final TextView mView;
    private TintInfo mDrawableLeftTint;
    private TintInfo mDrawableTopTint;
    private TintInfo mDrawableRightTint;
    private TintInfo mDrawableBottomTint;
    private TintInfo mDrawableStartTint;
    private TintInfo mDrawableEndTint;
    private TintInfo mDrawableTint;
    @NonNull
    private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private int mStyle;
    private int mFontWeight;
    private Typeface mFontTypeface;
    private boolean mAsyncFontPending;
    
    AppCompatTextHelper(@NonNull final TextView view) {
        this.mStyle = 0;
        this.mFontWeight = -1;
        this.mView = view;
        this.mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(this.mView);
    }
    
    @SuppressLint({ "NewApi" })
    void loadFromAttributes(@Nullable final AttributeSet attrs, final int defStyleAttr) {
        final Context context = this.mView.getContext();
        final AppCompatDrawableManager drawableManager = AppCompatDrawableManager.get();
        TintTypedArray a = TintTypedArray.obtainStyledAttributes(context, attrs, R.styleable.AppCompatTextHelper, defStyleAttr, 0);
        ViewCompat.saveAttributeDataForStyleable((View)this.mView, this.mView.getContext(), R.styleable.AppCompatTextHelper, attrs, a.getWrappedTypeArray(), defStyleAttr, 0);
        final int ap = a.getResourceId(R.styleable.AppCompatTextHelper_android_textAppearance, -1);
        if (a.hasValue(R.styleable.AppCompatTextHelper_android_drawableLeft)) {
            this.mDrawableLeftTint = createTintInfo(context, drawableManager, a.getResourceId(R.styleable.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a.hasValue(R.styleable.AppCompatTextHelper_android_drawableTop)) {
            this.mDrawableTopTint = createTintInfo(context, drawableManager, a.getResourceId(R.styleable.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a.hasValue(R.styleable.AppCompatTextHelper_android_drawableRight)) {
            this.mDrawableRightTint = createTintInfo(context, drawableManager, a.getResourceId(R.styleable.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a.hasValue(R.styleable.AppCompatTextHelper_android_drawableBottom)) {
            this.mDrawableBottomTint = createTintInfo(context, drawableManager, a.getResourceId(R.styleable.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (a.hasValue(R.styleable.AppCompatTextHelper_android_drawableStart)) {
            this.mDrawableStartTint = createTintInfo(context, drawableManager, a.getResourceId(R.styleable.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (a.hasValue(R.styleable.AppCompatTextHelper_android_drawableEnd)) {
            this.mDrawableEndTint = createTintInfo(context, drawableManager, a.getResourceId(R.styleable.AppCompatTextHelper_android_drawableEnd, 0));
        }
        a.recycle();
        final boolean hasPwdTm = this.mView.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean allCaps = false;
        boolean allCapsSet = false;
        ColorStateList textColor = null;
        ColorStateList textColorHint = null;
        ColorStateList textColorLink = null;
        String fontVariation = null;
        String localeListString = null;
        if (ap != -1) {
            a = TintTypedArray.obtainStyledAttributes(context, ap, R.styleable.TextAppearance);
            if (!hasPwdTm && a.hasValue(R.styleable.TextAppearance_textAllCaps)) {
                allCapsSet = true;
                allCaps = a.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
            }
            this.updateTypefaceAndStyle(context, a);
            if (Build.VERSION.SDK_INT < 23) {
                if (a.hasValue(R.styleable.TextAppearance_android_textColor)) {
                    textColor = a.getColorStateList(R.styleable.TextAppearance_android_textColor);
                }
                if (a.hasValue(R.styleable.TextAppearance_android_textColorHint)) {
                    textColorHint = a.getColorStateList(R.styleable.TextAppearance_android_textColorHint);
                }
                if (a.hasValue(R.styleable.TextAppearance_android_textColorLink)) {
                    textColorLink = a.getColorStateList(R.styleable.TextAppearance_android_textColorLink);
                }
            }
            if (a.hasValue(R.styleable.TextAppearance_textLocale)) {
                localeListString = a.getString(R.styleable.TextAppearance_textLocale);
            }
            if (Build.VERSION.SDK_INT >= 26 && a.hasValue(R.styleable.TextAppearance_fontVariationSettings)) {
                fontVariation = a.getString(R.styleable.TextAppearance_fontVariationSettings);
            }
            a.recycle();
        }
        a = TintTypedArray.obtainStyledAttributes(context, attrs, R.styleable.TextAppearance, defStyleAttr, 0);
        if (!hasPwdTm && a.hasValue(R.styleable.TextAppearance_textAllCaps)) {
            allCapsSet = true;
            allCaps = a.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a.hasValue(R.styleable.TextAppearance_android_textColor)) {
                textColor = a.getColorStateList(R.styleable.TextAppearance_android_textColor);
            }
            if (a.hasValue(R.styleable.TextAppearance_android_textColorHint)) {
                textColorHint = a.getColorStateList(R.styleable.TextAppearance_android_textColorHint);
            }
            if (a.hasValue(R.styleable.TextAppearance_android_textColorLink)) {
                textColorLink = a.getColorStateList(R.styleable.TextAppearance_android_textColorLink);
            }
        }
        if (a.hasValue(R.styleable.TextAppearance_textLocale)) {
            localeListString = a.getString(R.styleable.TextAppearance_textLocale);
        }
        if (Build.VERSION.SDK_INT >= 26 && a.hasValue(R.styleable.TextAppearance_fontVariationSettings)) {
            fontVariation = a.getString(R.styleable.TextAppearance_fontVariationSettings);
        }
        if (Build.VERSION.SDK_INT >= 28 && a.hasValue(R.styleable.TextAppearance_android_textSize) && a.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        this.updateTypefaceAndStyle(context, a);
        a.recycle();
        if (textColor != null) {
            this.mView.setTextColor(textColor);
        }
        if (textColorHint != null) {
            this.mView.setHintTextColor(textColorHint);
        }
        if (textColorLink != null) {
            this.mView.setLinkTextColor(textColorLink);
        }
        if (!hasPwdTm && allCapsSet) {
            this.setAllCaps(allCaps);
        }
        if (this.mFontTypeface != null) {
            if (this.mFontWeight == -1) {
                this.mView.setTypeface(this.mFontTypeface, this.mStyle);
            }
            else {
                this.mView.setTypeface(this.mFontTypeface);
            }
        }
        if (fontVariation != null) {
            Api26Impl.setFontVariationSettings(this.mView, fontVariation);
        }
        if (localeListString != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                Api24Impl.setTextLocales(this.mView, Api24Impl.forLanguageTags(localeListString));
            }
            else if (Build.VERSION.SDK_INT >= 21) {
                final String firstLanTag = localeListString.split(",")[0];
                this.mView.setTextLocale(Api21Impl.forLanguageTag(firstLanTag));
            }
        }
        this.mAutoSizeTextHelper.loadFromAttributes(attrs, defStyleAttr);
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE && this.mAutoSizeTextHelper.getAutoSizeTextType() != 0) {
            final int[] autoSizeTextSizesInPx = this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
            if (autoSizeTextSizesInPx.length > 0) {
                if (Api26Impl.getAutoSizeStepGranularity(this.mView) != -1.0f) {
                    Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(this.mView, this.mAutoSizeTextHelper.getAutoSizeMinTextSize(), this.mAutoSizeTextHelper.getAutoSizeMaxTextSize(), this.mAutoSizeTextHelper.getAutoSizeStepGranularity(), 0);
                }
                else {
                    Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(this.mView, autoSizeTextSizesInPx, 0);
                }
            }
        }
        a = TintTypedArray.obtainStyledAttributes(context, attrs, R.styleable.AppCompatTextView);
        Drawable drawableLeft = null;
        Drawable drawableTop = null;
        Drawable drawableRight = null;
        Drawable drawableBottom = null;
        Drawable drawableStart = null;
        Drawable drawableEnd = null;
        final int drawableLeftId = a.getResourceId(R.styleable.AppCompatTextView_drawableLeftCompat, -1);
        if (drawableLeftId != -1) {
            drawableLeft = drawableManager.getDrawable(context, drawableLeftId);
        }
        final int drawableTopId = a.getResourceId(R.styleable.AppCompatTextView_drawableTopCompat, -1);
        if (drawableTopId != -1) {
            drawableTop = drawableManager.getDrawable(context, drawableTopId);
        }
        final int drawableRightId = a.getResourceId(R.styleable.AppCompatTextView_drawableRightCompat, -1);
        if (drawableRightId != -1) {
            drawableRight = drawableManager.getDrawable(context, drawableRightId);
        }
        final int drawableBottomId = a.getResourceId(R.styleable.AppCompatTextView_drawableBottomCompat, -1);
        if (drawableBottomId != -1) {
            drawableBottom = drawableManager.getDrawable(context, drawableBottomId);
        }
        final int drawableStartId = a.getResourceId(R.styleable.AppCompatTextView_drawableStartCompat, -1);
        if (drawableStartId != -1) {
            drawableStart = drawableManager.getDrawable(context, drawableStartId);
        }
        final int drawableEndId = a.getResourceId(R.styleable.AppCompatTextView_drawableEndCompat, -1);
        if (drawableEndId != -1) {
            drawableEnd = drawableManager.getDrawable(context, drawableEndId);
        }
        this.setCompoundDrawables(drawableLeft, drawableTop, drawableRight, drawableBottom, drawableStart, drawableEnd);
        if (a.hasValue(R.styleable.AppCompatTextView_drawableTint)) {
            final ColorStateList tintList = a.getColorStateList(R.styleable.AppCompatTextView_drawableTint);
            TextViewCompat.setCompoundDrawableTintList(this.mView, tintList);
        }
        if (a.hasValue(R.styleable.AppCompatTextView_drawableTintMode)) {
            final PorterDuff.Mode tintMode = DrawableUtils.parseTintMode(a.getInt(R.styleable.AppCompatTextView_drawableTintMode, -1), (PorterDuff.Mode)null);
            TextViewCompat.setCompoundDrawableTintMode(this.mView, tintMode);
        }
        final int firstBaselineToTopHeight = a.getDimensionPixelSize(R.styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
        final int lastBaselineToBottomHeight = a.getDimensionPixelSize(R.styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
        float lineHeight = -1.0f;
        int lineHeightUnit = -1;
        if (a.hasValue(R.styleable.AppCompatTextView_lineHeight)) {
            final TypedValue peekValue = a.peekValue(R.styleable.AppCompatTextView_lineHeight);
            if (peekValue != null && peekValue.type == 5) {
                lineHeightUnit = TypedValueCompat.getUnitFromComplexDimension(peekValue.data);
                lineHeight = TypedValue.complexToFloat(peekValue.data);
            }
            else {
                lineHeight = (float)a.getDimensionPixelSize(R.styleable.AppCompatTextView_lineHeight, -1);
            }
        }
        a.recycle();
        if (firstBaselineToTopHeight != -1) {
            TextViewCompat.setFirstBaselineToTopHeight(this.mView, firstBaselineToTopHeight);
        }
        if (lastBaselineToBottomHeight != -1) {
            TextViewCompat.setLastBaselineToBottomHeight(this.mView, lastBaselineToBottomHeight);
        }
        if (lineHeight != -1.0f) {
            if (lineHeightUnit == -1) {
                TextViewCompat.setLineHeight(this.mView, (int)lineHeight);
            }
            else {
                TextViewCompat.setLineHeight(this.mView, lineHeightUnit, lineHeight);
            }
        }
    }
    
    private void updateTypefaceAndStyle(final Context context, final TintTypedArray a) {
        this.mStyle = a.getInt(R.styleable.TextAppearance_android_textStyle, this.mStyle);
        if (Build.VERSION.SDK_INT >= 28) {
            this.mFontWeight = a.getInt(R.styleable.TextAppearance_android_textFontWeight, -1);
            if (this.mFontWeight != -1) {
                this.mStyle = (0x0 | (this.mStyle & 0x2));
            }
        }
        if (a.hasValue(R.styleable.TextAppearance_android_fontFamily) || a.hasValue(R.styleable.TextAppearance_fontFamily)) {
            this.mFontTypeface = null;
            final int fontFamilyId = a.hasValue(R.styleable.TextAppearance_fontFamily) ? R.styleable.TextAppearance_fontFamily : R.styleable.TextAppearance_android_fontFamily;
            final int fontWeight = this.mFontWeight;
            final int style = this.mStyle;
            if (!context.isRestricted()) {
                final WeakReference<TextView> textViewWeak = (WeakReference<TextView>)new WeakReference((Object)this.mView);
                final ResourcesCompat.FontCallback replyCallback = new ResourcesCompat.FontCallback() {
                    public void onFontRetrieved(@NonNull Typeface typeface) {
                        if (Build.VERSION.SDK_INT >= 28 && fontWeight != -1) {
                            typeface = Api28Impl.create(typeface, fontWeight, (style & 0x2) != 0x0);
                        }
                        AppCompatTextHelper.this.onAsyncTypefaceReceived(textViewWeak, typeface);
                    }
                    
                    public void onFontRetrievalFailed(final int reason) {
                    }
                };
                try {
                    final Typeface typeface = a.getFont(fontFamilyId, this.mStyle, replyCallback);
                    if (typeface != null) {
                        if (Build.VERSION.SDK_INT >= 28 && this.mFontWeight != -1) {
                            this.mFontTypeface = Api28Impl.create(Typeface.create(typeface, 0), this.mFontWeight, (this.mStyle & 0x2) != 0x0);
                        }
                        else {
                            this.mFontTypeface = typeface;
                        }
                    }
                    this.mAsyncFontPending = (this.mFontTypeface == null);
                }
                catch (final UnsupportedOperationException | Resources.NotFoundException ex) {}
            }
            if (this.mFontTypeface == null) {
                final String fontFamilyName = a.getString(fontFamilyId);
                if (fontFamilyName != null) {
                    if (Build.VERSION.SDK_INT >= 28 && this.mFontWeight != -1) {
                        this.mFontTypeface = Api28Impl.create(Typeface.create(fontFamilyName, 0), this.mFontWeight, (this.mStyle & 0x2) != 0x0);
                    }
                    else {
                        this.mFontTypeface = Typeface.create(fontFamilyName, this.mStyle);
                    }
                }
            }
            return;
        }
        if (a.hasValue(R.styleable.TextAppearance_android_typeface)) {
            this.mAsyncFontPending = false;
            final int typefaceIndex = a.getInt(R.styleable.TextAppearance_android_typeface, 1);
            switch (typefaceIndex) {
                case 1: {
                    this.mFontTypeface = Typeface.SANS_SERIF;
                    break;
                }
                case 2: {
                    this.mFontTypeface = Typeface.SERIF;
                    break;
                }
                case 3: {
                    this.mFontTypeface = Typeface.MONOSPACE;
                    break;
                }
            }
        }
    }
    
    void onAsyncTypefaceReceived(final WeakReference<TextView> textViewWeak, final Typeface typeface) {
        if (this.mAsyncFontPending) {
            this.mFontTypeface = typeface;
            final TextView textView = (TextView)textViewWeak.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    final int style = this.mStyle;
                    textView.post((Runnable)new Runnable() {
                        public void run() {
                            textView.setTypeface(typeface, style);
                        }
                    });
                }
                else {
                    textView.setTypeface(typeface, this.mStyle);
                }
            }
        }
    }
    
    void onSetTextAppearance(final Context context, final int resId) {
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(context, resId, R.styleable.TextAppearance);
        if (a.hasValue(R.styleable.TextAppearance_textAllCaps)) {
            this.setAllCaps(a.getBoolean(R.styleable.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a.hasValue(R.styleable.TextAppearance_android_textColor)) {
                final ColorStateList textColor = a.getColorStateList(R.styleable.TextAppearance_android_textColor);
                if (textColor != null) {
                    this.mView.setTextColor(textColor);
                }
            }
            if (a.hasValue(R.styleable.TextAppearance_android_textColorLink)) {
                final ColorStateList textColorLink = a.getColorStateList(R.styleable.TextAppearance_android_textColorLink);
                if (textColorLink != null) {
                    this.mView.setLinkTextColor(textColorLink);
                }
            }
            if (a.hasValue(R.styleable.TextAppearance_android_textColorHint)) {
                final ColorStateList textColorHint = a.getColorStateList(R.styleable.TextAppearance_android_textColorHint);
                if (textColorHint != null) {
                    this.mView.setHintTextColor(textColorHint);
                }
            }
        }
        if (a.hasValue(R.styleable.TextAppearance_android_textSize) && a.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        this.updateTypefaceAndStyle(context, a);
        if (Build.VERSION.SDK_INT >= 26 && a.hasValue(R.styleable.TextAppearance_fontVariationSettings)) {
            final String fontVariation = a.getString(R.styleable.TextAppearance_fontVariationSettings);
            if (fontVariation != null) {
                Api26Impl.setFontVariationSettings(this.mView, fontVariation);
            }
        }
        a.recycle();
        if (this.mFontTypeface != null) {
            this.mView.setTypeface(this.mFontTypeface, this.mStyle);
        }
    }
    
    void setAllCaps(final boolean allCaps) {
        this.mView.setAllCaps(allCaps);
    }
    
    void onSetCompoundDrawables() {
        this.applyCompoundDrawablesTints();
    }
    
    void applyCompoundDrawablesTints() {
        if (this.mDrawableLeftTint != null || this.mDrawableTopTint != null || this.mDrawableRightTint != null || this.mDrawableBottomTint != null) {
            final Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
            this.applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
            this.applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
            this.applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
            this.applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
        }
        if (this.mDrawableStartTint != null || this.mDrawableEndTint != null) {
            final Drawable[] compoundDrawables = this.mView.getCompoundDrawablesRelative();
            this.applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableStartTint);
            this.applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableEndTint);
        }
    }
    
    private void applyCompoundDrawableTint(final Drawable drawable, final TintInfo info) {
        if (drawable != null && info != null) {
            AppCompatDrawableManager.tintDrawable(drawable, info, this.mView.getDrawableState());
        }
    }
    
    private static TintInfo createTintInfo(final Context context, final AppCompatDrawableManager drawableManager, final int drawableId) {
        final ColorStateList tintList = drawableManager.getTintList(context, drawableId);
        if (tintList != null) {
            final TintInfo tintInfo = new TintInfo();
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = tintList;
            return tintInfo;
        }
        return null;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        if (!ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            this.autoSizeText();
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    void setTextSize(final int unit, final float size) {
        if (!ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE && !this.isAutoSizeEnabled()) {
            this.setTextSizeInternal(unit, size);
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    void autoSizeText() {
        this.mAutoSizeTextHelper.autoSizeText();
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    boolean isAutoSizeEnabled() {
        return this.mAutoSizeTextHelper.isAutoSizeEnabled();
    }
    
    private void setTextSizeInternal(final int unit, final float size) {
        this.mAutoSizeTextHelper.setTextSizeInternal(unit, size);
    }
    
    void setAutoSizeTextTypeWithDefaults(final int autoSizeTextType) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(autoSizeTextType);
    }
    
    void setAutoSizeTextTypeUniformWithConfiguration(final int autoSizeMinTextSize, final int autoSizeMaxTextSize, final int autoSizeStepGranularity, final int unit) throws IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
    }
    
    void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull final int[] presetSizes, final int unit) throws IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
    }
    
    int getAutoSizeTextType() {
        return this.mAutoSizeTextHelper.getAutoSizeTextType();
    }
    
    int getAutoSizeStepGranularity() {
        return this.mAutoSizeTextHelper.getAutoSizeStepGranularity();
    }
    
    int getAutoSizeMinTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMinTextSize();
    }
    
    int getAutoSizeMaxTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMaxTextSize();
    }
    
    int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
    }
    
    @Nullable
    ColorStateList getCompoundDrawableTintList() {
        return (this.mDrawableTint != null) ? this.mDrawableTint.mTintList : null;
    }
    
    void setCompoundDrawableTintList(@Nullable final ColorStateList tintList) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        this.mDrawableTint.mTintList = tintList;
        this.mDrawableTint.mHasTintList = (tintList != null);
        this.setCompoundTints();
    }
    
    @Nullable
    PorterDuff.Mode getCompoundDrawableTintMode() {
        return (this.mDrawableTint != null) ? this.mDrawableTint.mTintMode : null;
    }
    
    void setCompoundDrawableTintMode(@Nullable final PorterDuff.Mode tintMode) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        this.mDrawableTint.mTintMode = tintMode;
        this.mDrawableTint.mHasTintMode = (tintMode != null);
        this.setCompoundTints();
    }
    
    private void setCompoundTints() {
        this.mDrawableLeftTint = this.mDrawableTint;
        this.mDrawableTopTint = this.mDrawableTint;
        this.mDrawableRightTint = this.mDrawableTint;
        this.mDrawableBottomTint = this.mDrawableTint;
        this.mDrawableStartTint = this.mDrawableTint;
        this.mDrawableEndTint = this.mDrawableTint;
    }
    
    private void setCompoundDrawables(final Drawable drawableLeft, final Drawable drawableTop, final Drawable drawableRight, final Drawable drawableBottom, final Drawable drawableStart, final Drawable drawableEnd) {
        if (drawableStart != null || drawableEnd != null) {
            final Drawable[] existingRel = this.mView.getCompoundDrawablesRelative();
            final Drawable start = (drawableStart != null) ? drawableStart : existingRel[0];
            final Drawable top = (drawableTop != null) ? drawableTop : existingRel[1];
            final Drawable end = (drawableEnd != null) ? drawableEnd : existingRel[2];
            this.mView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, (drawableBottom != null) ? drawableBottom : existingRel[3]);
        }
        else if (drawableLeft != null || drawableTop != null || drawableRight != null || drawableBottom != null) {
            final Drawable[] existingRel = this.mView.getCompoundDrawablesRelative();
            if (existingRel[0] != null || existingRel[2] != null) {
                final Drawable top2 = (drawableTop != null) ? drawableTop : existingRel[1];
                final Drawable bottom = (drawableBottom != null) ? drawableBottom : existingRel[3];
                this.mView.setCompoundDrawablesRelativeWithIntrinsicBounds(existingRel[0], top2, existingRel[2], bottom);
                return;
            }
            final Drawable[] existingAbs = this.mView.getCompoundDrawables();
            this.mView.setCompoundDrawablesWithIntrinsicBounds((drawableLeft != null) ? drawableLeft : existingAbs[0], (drawableTop != null) ? drawableTop : existingAbs[1], (drawableRight != null) ? drawableRight : existingAbs[2], (drawableBottom != null) ? drawableBottom : existingAbs[3]);
        }
    }
    
    void populateSurroundingTextIfNeeded(@NonNull final TextView textView, @Nullable final InputConnection inputConnection, @NonNull final EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
        }
    }
    
    @RequiresApi(26)
    static class Api26Impl
    {
        private Api26Impl() {
        }
        
        @DoNotInline
        static boolean setFontVariationSettings(final TextView textView, final String fontVariationSettings) {
            return textView.setFontVariationSettings(fontVariationSettings);
        }
        
        @DoNotInline
        static int getAutoSizeStepGranularity(final TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }
        
        @DoNotInline
        static void setAutoSizeTextTypeUniformWithConfiguration(final TextView textView, final int autoSizeMinTextSize, final int autoSizeMaxTextSize, final int autoSizeStepGranularity, final int unit) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        }
        
        @DoNotInline
        static void setAutoSizeTextTypeUniformWithPresetSizes(final TextView textView, final int[] presetSizes, final int unit) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
        }
    }
    
    @RequiresApi(24)
    static class Api24Impl
    {
        private Api24Impl() {
        }
        
        @DoNotInline
        static void setTextLocales(final TextView textView, final LocaleList locales) {
            textView.setTextLocales(locales);
        }
        
        @DoNotInline
        static LocaleList forLanguageTags(final String list) {
            return LocaleList.forLanguageTags(list);
        }
    }
    
    @RequiresApi(21)
    static class Api21Impl
    {
        private Api21Impl() {
        }
        
        @DoNotInline
        static Locale forLanguageTag(final String languageTag) {
            return Locale.forLanguageTag(languageTag);
        }
    }
    
    @RequiresApi(28)
    static class Api28Impl
    {
        private Api28Impl() {
        }
        
        @DoNotInline
        static Typeface create(final Typeface family, final int weight, final boolean italic) {
            return Typeface.create(family, weight, italic);
        }
    }
}
