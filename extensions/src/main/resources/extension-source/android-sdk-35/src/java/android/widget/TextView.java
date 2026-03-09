package android.widget;

import android.os.Parcel;
import android.view.translation.ViewTranslationRequest;
import java.util.function.Consumer;
import android.view.ContentInfo;
import android.text.TextDirectionHeuristic;
import android.view.DragEvent;
import android.view.textclassifier.TextClassifier;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillValue;
import java.util.ArrayList;
import android.view.ContextMenu;
import android.text.TextWatcher;
import android.text.TextUtils;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.MotionEvent;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.text.InputFilter;
import android.os.Bundle;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.text.Spannable;
import android.os.Parcelable;
import android.text.Highlights;
import android.text.style.URLSpan;
import android.text.TextPaint;
import android.text.PrecomputedText;
import android.graphics.Paint;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.Locale;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.method.TransformationMethod;
import android.text.method.KeyListener;
import android.text.Layout;
import android.text.Editable;
import android.view.ViewDebug;
import android.text.method.MovementMethod;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewTreeObserver;
import android.view.View;

@RemoteViews.RemoteView
public class TextView extends View implements ViewTreeObserver.OnPreDrawListener
{
    public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
    public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;
    public static final int FOCUSED_SEARCH_RESULT_INDEX_NONE = -1;
    
    public TextView(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public TextView(final Context context, @Nullable final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public TextView(final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public TextView(final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void setAutoSizeTextTypeWithDefaults(final int autoSizeTextType) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAutoSizeTextTypeUniformWithConfiguration(final int autoSizeMinTextSize, final int autoSizeMaxTextSize, final int autoSizeStepGranularity, final int unit) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull final int[] presetSizes, final int unit) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAutoSizeTextType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAutoSizeStepGranularity() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAutoSizeMinTextSize() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAutoSizeMaxTextSize() {
        throw new RuntimeException("Stub!");
    }
    
    public int[] getAutoSizeTextAvailableSizes() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTypeface(@Nullable final Typeface tf, final int style) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean getDefaultEditable() {
        throw new RuntimeException("Stub!");
    }
    
    protected MovementMethod getDefaultMovementMethod() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.CapturedViewProperty
    public CharSequence getText() {
        throw new RuntimeException("Stub!");
    }
    
    public int length() {
        throw new RuntimeException("Stub!");
    }
    
    public Editable getEditableText() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLineHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public final Layout getLayout() {
        throw new RuntimeException("Stub!");
    }
    
    public final KeyListener getKeyListener() {
        throw new RuntimeException("Stub!");
    }
    
    public void setKeyListener(final KeyListener input) {
        throw new RuntimeException("Stub!");
    }
    
    public final MovementMethod getMovementMethod() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setMovementMethod(final MovementMethod movement) {
        throw new RuntimeException("Stub!");
    }
    
    public final TransformationMethod getTransformationMethod() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setTransformationMethod(final TransformationMethod method) {
        throw new RuntimeException("Stub!");
    }
    
    public int getCompoundPaddingTop() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCompoundPaddingBottom() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCompoundPaddingLeft() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCompoundPaddingRight() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCompoundPaddingStart() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCompoundPaddingEnd() {
        throw new RuntimeException("Stub!");
    }
    
    public int getExtendedPaddingTop() {
        throw new RuntimeException("Stub!");
    }
    
    public int getExtendedPaddingBottom() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTotalPaddingLeft() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTotalPaddingRight() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTotalPaddingStart() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTotalPaddingEnd() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTotalPaddingTop() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTotalPaddingBottom() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCompoundDrawables(@Nullable final Drawable left, @Nullable final Drawable top, @Nullable final Drawable right, @Nullable final Drawable bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCompoundDrawablesWithIntrinsicBounds(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable final Drawable left, @Nullable final Drawable top, @Nullable final Drawable right, @Nullable final Drawable bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCompoundDrawablesRelative(@Nullable final Drawable start, @Nullable final Drawable top, @Nullable final Drawable end, @Nullable final Drawable bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(final int start, final int top, final int end, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable final Drawable start, @Nullable final Drawable top, @Nullable final Drawable end, @Nullable final Drawable bottom) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Drawable[] getCompoundDrawables() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Drawable[] getCompoundDrawablesRelative() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCompoundDrawablePadding(final int pad) {
        throw new RuntimeException("Stub!");
    }
    
    public int getCompoundDrawablePadding() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCompoundDrawableTintList(@Nullable final ColorStateList tint) {
        throw new RuntimeException("Stub!");
    }
    
    public ColorStateList getCompoundDrawableTintList() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCompoundDrawableTintMode(@Nullable final PorterDuff.Mode tintMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCompoundDrawableTintBlendMode(@Nullable final BlendMode blendMode) {
        throw new RuntimeException("Stub!");
    }
    
    public PorterDuff.Mode getCompoundDrawableTintMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BlendMode getCompoundDrawableTintBlendMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setPadding(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setPaddingRelative(final int start, final int top, final int end, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFirstBaselineToTopHeight(final int firstBaselineToTopHeight) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLastBaselineToBottomHeight(final int lastBaselineToBottomHeight) {
        throw new RuntimeException("Stub!");
    }
    
    public int getFirstBaselineToTopHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLastBaselineToBottomHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getAutoLinkMask() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextSelectHandle(@NonNull final Drawable textSelectHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextSelectHandle(final int textSelectHandle) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getTextSelectHandle() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextSelectHandleLeft(@NonNull final Drawable textSelectHandleLeft) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextSelectHandleLeft(final int textSelectHandleLeft) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getTextSelectHandleLeft() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextSelectHandleRight(@NonNull final Drawable textSelectHandleRight) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextSelectHandleRight(final int textSelectHandleRight) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getTextSelectHandleRight() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextCursorDrawable(@Nullable final Drawable textCursorDrawable) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextCursorDrawable(final int textCursorDrawable) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getTextCursorDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextAppearance(final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setTextAppearance(final Context context, final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Locale getTextLocale() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LocaleList getTextLocales() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextLocale(@NonNull final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextLocales(@NonNull final LocaleList locales) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onConfigurationChanged(final Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "text")
    public float getTextSize() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextSize(final float size) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextSize(final int unit, final float size) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTextSizeUnit() {
        throw new RuntimeException("Stub!");
    }
    
    public float getTextScaleX() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextScaleX(final float size) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTypeface(@Nullable final Typeface tf) {
        throw new RuntimeException("Stub!");
    }
    
    public Typeface getTypeface() {
        throw new RuntimeException("Stub!");
    }
    
    public void setElegantTextHeight(final boolean elegant) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFallbackLineSpacing(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void setUseBoundsForWidth(final boolean useBoundsForWidth) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getUseBoundsForWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public void setShiftDrawingOffsetForStartOverhang(final boolean shiftDrawingOffsetForStartOverhang) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getShiftDrawingOffsetForStartOverhang() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinimumFontMetrics(@Nullable final Paint.FontMetrics minimumFontMetrics) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Paint.FontMetrics getMinimumFontMetrics() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLocalePreferredLineHeightForMinimumUsed() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLocalePreferredLineHeightForMinimumUsed(final boolean flag) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFallbackLineSpacing() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isElegantTextHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public float getLetterSpacing() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLetterSpacing(final float letterSpacing) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getFontFeatureSettings() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getFontVariationSettings() {
        throw new RuntimeException("Stub!");
    }
    
    public void setBreakStrategy(final int breakStrategy) {
        throw new RuntimeException("Stub!");
    }
    
    public int getBreakStrategy() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHyphenationFrequency(final int hyphenationFrequency) {
        throw new RuntimeException("Stub!");
    }
    
    public int getHyphenationFrequency() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLineBreakStyle(final int lineBreakStyle) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLineBreakWordStyle(final int lineBreakWordStyle) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLineBreakStyle() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLineBreakWordStyle() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PrecomputedText.Params getTextMetricsParams() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextMetricsParams(@NonNull final PrecomputedText.Params params) {
        throw new RuntimeException("Stub!");
    }
    
    public void setJustificationMode(final int justificationMode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getJustificationMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFontFeatureSettings(@Nullable final String fontFeatureSettings) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setFontVariationSettings(@Nullable final String fontVariationSettings) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextColor(final ColorStateList colors) {
        throw new RuntimeException("Stub!");
    }
    
    public final ColorStateList getTextColors() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getCurrentTextColor() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHighlightColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public int getHighlightColor() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setShowSoftInputOnFocus(final boolean show) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean getShowSoftInputOnFocus() {
        throw new RuntimeException("Stub!");
    }
    
    public void setShadowLayer(final float radius, final float dx, final float dy, final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public float getShadowRadius() {
        throw new RuntimeException("Stub!");
    }
    
    public float getShadowDx() {
        throw new RuntimeException("Stub!");
    }
    
    public float getShadowDy() {
        throw new RuntimeException("Stub!");
    }
    
    public int getShadowColor() {
        throw new RuntimeException("Stub!");
    }
    
    public TextPaint getPaint() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setAutoLinkMask(final int mask) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setLinksClickable(final boolean whether) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean getLinksClickable() {
        throw new RuntimeException("Stub!");
    }
    
    public URLSpan[] getUrls() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setHintTextColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setHintTextColor(final ColorStateList colors) {
        throw new RuntimeException("Stub!");
    }
    
    public final ColorStateList getHintTextColors() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getCurrentHintTextColor() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setLinkTextColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setLinkTextColor(final ColorStateList colors) {
        throw new RuntimeException("Stub!");
    }
    
    public final ColorStateList getLinkTextColors() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGravity(final int gravity) {
        throw new RuntimeException("Stub!");
    }
    
    public int getGravity() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPaintFlags() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPaintFlags(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void setHorizontallyScrolling(final boolean whether) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isHorizontallyScrollable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinLines(final int minLines) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinLines() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinHeight(final int minPixels) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaxLines(final int maxLines) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxLines() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaxHeight(final int maxPixels) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLines(final int lines) {
        throw new RuntimeException("Stub!");
    }
    
    public void setHeight(final int pixels) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinEms(final int minEms) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinEms() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinWidth(final int minPixels) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaxEms(final int maxEms) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxEms() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaxWidth(final int maxPixels) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEms(final int ems) {
        throw new RuntimeException("Stub!");
    }
    
    public void setWidth(final int pixels) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLineSpacing(final float add, final float mult) {
        throw new RuntimeException("Stub!");
    }
    
    public float getLineSpacingMultiplier() {
        throw new RuntimeException("Stub!");
    }
    
    public float getLineSpacingExtra() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLineHeight(final int lineHeight) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLineHeight(final int unit, final float lineHeight) {
        throw new RuntimeException("Stub!");
    }
    
    public void setHighlights(@Nullable final Highlights highlights) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Highlights getHighlights() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSearchResultHighlights(@Nullable final int... ranges) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public int[] getSearchResultHighlights() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFocusedSearchResultIndex(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public int getFocusedSearchResultIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSearchResultHighlightColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public int getSearchResultHighlightColor() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFocusedSearchResultHighlightColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public int getFocusedSearchResultHighlightColor() {
        throw new RuntimeException("Stub!");
    }
    
    public final void append(final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
    
    public void append(final CharSequence text, final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void drawableStateChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void drawableHotspotChanged(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public Parcelable onSaveInstanceState() {
        throw new RuntimeException("Stub!");
    }
    
    public void onRestoreInstanceState(final Parcelable state) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFreezesText(final boolean freezesText) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getFreezesText() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setEditableFactory(final Editable.Factory factory) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setSpannableFactory(final Spannable.Factory factory) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setText(final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setTextKeepState(final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
    
    public void setText(final CharSequence text, final BufferType type) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setText(@NonNull final char[] text, final int start, final int len) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setTextKeepState(final CharSequence text, final BufferType type) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setText(final int resid) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setText(final int resid, final BufferType type) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setHint(final CharSequence hint) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setHint(final int resid) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.CapturedViewProperty
    public CharSequence getHint() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSingleLine() {
        throw new RuntimeException("Stub!");
    }
    
    public void setInputType(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRawInputType(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String[] getAutofillHints() {
        throw new RuntimeException("Stub!");
    }
    
    public int getInputType() {
        throw new RuntimeException("Stub!");
    }
    
    public void setImeOptions(final int imeOptions) {
        throw new RuntimeException("Stub!");
    }
    
    public int getImeOptions() {
        throw new RuntimeException("Stub!");
    }
    
    public void setImeActionLabel(final CharSequence label, final int actionId) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getImeActionLabel() {
        throw new RuntimeException("Stub!");
    }
    
    public int getImeActionId() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnEditorActionListener(final OnEditorActionListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public void onEditorAction(final int actionCode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPrivateImeOptions(final String type) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPrivateImeOptions() {
        throw new RuntimeException("Stub!");
    }
    
    public void setInputExtras(final int xmlResId) throws IOException, XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle getInputExtras(final boolean create) {
        throw new RuntimeException("Stub!");
    }
    
    public void setImeHintLocales(@Nullable final LocaleList hintLocales) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public LocaleList getImeHintLocales() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getError() {
        throw new RuntimeException("Stub!");
    }
    
    public void setError(final CharSequence error) {
        throw new RuntimeException("Stub!");
    }
    
    public void setError(final CharSequence error, final Drawable icon) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean setFrame(final int l, final int t, final int r, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFilters(final InputFilter[] filters) {
        throw new RuntimeException("Stub!");
    }
    
    public InputFilter[] getFilters() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onPreDraw() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onAttachedToWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onScreenStateChanged(final int screenState) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean isPaddingOffsetRequired() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int getLeftPaddingOffset() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int getTopPaddingOffset() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int getBottomPaddingOffset() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int getRightPaddingOffset() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean verifyDrawable(@NonNull final Drawable who) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void jumpDrawablesToCurrentState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void invalidateDrawable(@NonNull final Drawable drawable) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean hasOverlappingRendering() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTextSelectable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextIsSelectable(final boolean selectable) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int[] onCreateDrawableState(final int extraSpace) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDraw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void getFocusedRect(final Rect r) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLineCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLineBounds(final int line, final Rect bounds) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getBaseline() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public PointerIcon onResolvePointerIcon(final MotionEvent event, final int pointerIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyPreIme(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyMultiple(final int keyCode, final int repeatCount, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onCheckIsTextEditor() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public InputConnection onCreateInputConnection(final EditorInfo outAttrs) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean extractText(final ExtractedTextRequest request, final ExtractedText outText) {
        throw new RuntimeException("Stub!");
    }
    
    public void setExtractedText(final ExtractedText text) {
        throw new RuntimeException("Stub!");
    }
    
    public void onCommitCompletion(final CompletionInfo text) {
        throw new RuntimeException("Stub!");
    }
    
    public void onCommitCorrection(final CorrectionInfo info) {
        throw new RuntimeException("Stub!");
    }
    
    public void beginBatchEdit() {
        throw new RuntimeException("Stub!");
    }
    
    public void endBatchEdit() {
        throw new RuntimeException("Stub!");
    }
    
    public void onBeginBatchEdit() {
        throw new RuntimeException("Stub!");
    }
    
    public void onEndBatchEdit() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onPrivateIMECommand(final String action, final Bundle data) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIncludeFontPadding(final boolean includepad) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getIncludeFontPadding() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean bringPointIntoView(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean bringPointIntoView(final int offset, final boolean requestRectWithoutFocus) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean moveCursorToVisibleOffset() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void computeScroll() {
        throw new RuntimeException("Stub!");
    }
    
    public void debug(final int depth) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "text")
    public int getSelectionStart() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "text")
    public int getSelectionEnd() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasSelection() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSingleLine() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAllCaps(final boolean allCaps) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAllCaps() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSingleLine(final boolean singleLine) {
        throw new RuntimeException("Stub!");
    }
    
    public void setEllipsize(final TextUtils.TruncateAt where) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMarqueeRepeatLimit(final int marqueeLimit) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMarqueeRepeatLimit() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public TextUtils.TruncateAt getEllipsize() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSelectAllOnFocus(final boolean selectAllOnFocus) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCursorVisible(final boolean visible) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCursorVisible() {
        throw new RuntimeException("Stub!");
    }
    
    protected void onTextChanged(final CharSequence text, final int start, final int lengthBefore, final int lengthAfter) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onSelectionChanged(final int selStart, final int selEnd) {
        throw new RuntimeException("Stub!");
    }
    
    public void addTextChangedListener(final TextWatcher watcher) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeTextChangedListener(final TextWatcher watcher) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onFocusChanged(final boolean focused, final int direction, final Rect previouslyFocusedRect) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onWindowFocusChanged(final boolean hasWindowFocus) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onVisibilityChanged(final View changedView, final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onVisibilityAggregated(final boolean isVisible) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearComposingText() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setSelected(final boolean selected) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onTouchEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onGenericMotionEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onCreateContextMenu(final ContextMenu menu) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean showContextMenu() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean showContextMenu(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean didTouchFocusSelect() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void cancelLongPress() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onTrackballEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void setScroller(final Scroller s) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected float getLeftFadingEdgeStrength() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected float getRightFadingEdgeStrength() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int computeHorizontalScrollRange() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int computeVerticalScrollRange() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int computeVerticalScrollExtent() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void findViewsWithText(final ArrayList<View> outViews, final CharSequence searched, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyShortcut(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isAutoHandwritingEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void autofill(final AutofillValue value) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getAutofillType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public AutofillValue getAutofillValue() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addExtraDataToAccessibilityNodeInfo(final AccessibilityNodeInfo info, final String extraDataKey, final Bundle arguments) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void sendAccessibilityEventUnchecked(final AccessibilityEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInputMethodTarget() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onTextContextMenuItem(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean performLongClick() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onScrollChanged(final int horiz, final int vert, final int oldHoriz, final int oldVert) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSuggestionsEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode.Callback actionModeCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCustomInsertionActionModeCallback(final ActionMode.Callback actionModeCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public ActionMode.Callback getCustomInsertionActionModeCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextClassifier(@Nullable final TextClassifier textClassifier) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public TextClassifier getTextClassifier() {
        throw new RuntimeException("Stub!");
    }
    
    public int getOffsetForPosition(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onDragEvent(final DragEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onRtlPropertiesChanged(final int layoutDirection) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public TextDirectionHeuristic getTextDirectionHeuristic() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public ContentInfo onReceiveContent(@NonNull final ContentInfo payload) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onCreateViewTranslationRequest(@NonNull final int[] supportedFormats, @NonNull final Consumer<ViewTranslationRequest> requestsCollector) {
        throw new RuntimeException("Stub!");
    }
    
    public enum BufferType
    {
        NORMAL, 
        SPANNABLE, 
        EDITABLE;
    }
    
    public static class SavedState extends BaseSavedState
    {
        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR;
        
        SavedState() {
            super((Parcel)null);
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel out, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
    
    public interface OnEditorActionListener
    {
        boolean onEditorAction(final TextView p0, final int p1, final KeyEvent p2);
    }
}
