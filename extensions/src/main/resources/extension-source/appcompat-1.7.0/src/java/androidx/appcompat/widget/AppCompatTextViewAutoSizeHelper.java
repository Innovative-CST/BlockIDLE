package androidx.appcompat.widget;

import androidx.annotation.DoNotInline;
import android.text.TextDirectionHeuristics;
import android.text.TextDirectionHeuristic;
import androidx.annotation.RequiresApi;
import android.text.method.TransformationMethod;
import android.text.StaticLayout;
import android.text.Layout;
import androidx.annotation.VisibleForTesting;
import android.util.Log;
import android.content.res.Resources;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import androidx.annotation.RestrictTo;
import android.util.DisplayMetrics;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.appcompat.R;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.os.Build;
import android.content.Context;
import androidx.annotation.NonNull;
import android.widget.TextView;
import android.text.TextPaint;
import android.annotation.SuppressLint;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import android.graphics.RectF;

class AppCompatTextViewAutoSizeHelper
{
    private static final String TAG = "ACTVAutoSizeHelper";
    private static final RectF TEMP_RECTF;
    private static final int DEFAULT_AUTO_SIZE_MIN_TEXT_SIZE_IN_SP = 12;
    private static final int DEFAULT_AUTO_SIZE_MAX_TEXT_SIZE_IN_SP = 112;
    private static final int DEFAULT_AUTO_SIZE_GRANULARITY_IN_PX = 1;
    @SuppressLint({ "BanConcurrentHashMap" })
    private static ConcurrentHashMap<String, Method> sTextViewMethodByNameCache;
    static final float UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE = -1.0f;
    private static final int VERY_WIDE = 1048576;
    private int mAutoSizeTextType;
    private boolean mNeedsAutoSizeText;
    private float mAutoSizeStepGranularityInPx;
    private float mAutoSizeMinTextSizeInPx;
    private float mAutoSizeMaxTextSizeInPx;
    private int[] mAutoSizeTextSizesInPx;
    private boolean mHasPresetAutoSizeValues;
    private TextPaint mTempTextPaint;
    @NonNull
    private final TextView mTextView;
    private final Context mContext;
    private final Impl mImpl;
    
    AppCompatTextViewAutoSizeHelper(@NonNull final TextView textView) {
        this.mAutoSizeTextType = 0;
        this.mNeedsAutoSizeText = false;
        this.mAutoSizeStepGranularityInPx = -1.0f;
        this.mAutoSizeMinTextSizeInPx = -1.0f;
        this.mAutoSizeMaxTextSizeInPx = -1.0f;
        this.mAutoSizeTextSizesInPx = new int[0];
        this.mHasPresetAutoSizeValues = false;
        this.mTextView = textView;
        this.mContext = this.mTextView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.mImpl = new Impl29();
        }
        else if (Build.VERSION.SDK_INT >= 23) {
            this.mImpl = new Impl23();
        }
        else {
            this.mImpl = new Impl();
        }
    }
    
    void loadFromAttributes(@Nullable final AttributeSet attrs, final int defStyleAttr) {
        float autoSizeMinTextSizeInPx = -1.0f;
        float autoSizeMaxTextSizeInPx = -1.0f;
        float autoSizeStepGranularityInPx = -1.0f;
        final TypedArray a = this.mContext.obtainStyledAttributes(attrs, R.styleable.AppCompatTextView, defStyleAttr, 0);
        ViewCompat.saveAttributeDataForStyleable((View)this.mTextView, this.mTextView.getContext(), R.styleable.AppCompatTextView, attrs, a, defStyleAttr, 0);
        if (a.hasValue(R.styleable.AppCompatTextView_autoSizeTextType)) {
            this.mAutoSizeTextType = a.getInt(R.styleable.AppCompatTextView_autoSizeTextType, 0);
        }
        if (a.hasValue(R.styleable.AppCompatTextView_autoSizeStepGranularity)) {
            autoSizeStepGranularityInPx = a.getDimension(R.styleable.AppCompatTextView_autoSizeStepGranularity, -1.0f);
        }
        if (a.hasValue(R.styleable.AppCompatTextView_autoSizeMinTextSize)) {
            autoSizeMinTextSizeInPx = a.getDimension(R.styleable.AppCompatTextView_autoSizeMinTextSize, -1.0f);
        }
        if (a.hasValue(R.styleable.AppCompatTextView_autoSizeMaxTextSize)) {
            autoSizeMaxTextSizeInPx = a.getDimension(R.styleable.AppCompatTextView_autoSizeMaxTextSize, -1.0f);
        }
        if (a.hasValue(R.styleable.AppCompatTextView_autoSizePresetSizes)) {
            final int autoSizeStepSizeArrayResId = a.getResourceId(R.styleable.AppCompatTextView_autoSizePresetSizes, 0);
            if (autoSizeStepSizeArrayResId > 0) {
                final TypedArray autoSizePreDefTextSizes = a.getResources().obtainTypedArray(autoSizeStepSizeArrayResId);
                this.setupAutoSizeUniformPresetSizes(autoSizePreDefTextSizes);
                autoSizePreDefTextSizes.recycle();
            }
        }
        a.recycle();
        if (this.supportsAutoSizeText()) {
            if (this.mAutoSizeTextType == 1) {
                if (!this.mHasPresetAutoSizeValues) {
                    final DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
                    if (autoSizeMinTextSizeInPx == -1.0f) {
                        autoSizeMinTextSizeInPx = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (autoSizeMaxTextSizeInPx == -1.0f) {
                        autoSizeMaxTextSizeInPx = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (autoSizeStepGranularityInPx == -1.0f) {
                        autoSizeStepGranularityInPx = 1.0f;
                    }
                    this.validateAndSetAutoSizeTextTypeUniformConfiguration(autoSizeMinTextSizeInPx, autoSizeMaxTextSizeInPx, autoSizeStepGranularityInPx);
                }
                this.setupAutoSizeText();
            }
        }
        else {
            this.mAutoSizeTextType = 0;
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    void setAutoSizeTextTypeWithDefaults(final int autoSizeTextType) {
        if (this.supportsAutoSizeText()) {
            switch (autoSizeTextType) {
                case 0: {
                    this.clearAutoSizeConfiguration();
                    break;
                }
                case 1: {
                    final DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
                    final float autoSizeMinTextSizeInPx = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    final float autoSizeMaxTextSizeInPx = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    this.validateAndSetAutoSizeTextTypeUniformConfiguration(autoSizeMinTextSizeInPx, autoSizeMaxTextSizeInPx, 1.0f);
                    if (this.setupAutoSizeText()) {
                        this.autoSizeText();
                        break;
                    }
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown auto-size text type: " + autoSizeTextType);
                }
            }
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    void setAutoSizeTextTypeUniformWithConfiguration(final int autoSizeMinTextSize, final int autoSizeMaxTextSize, final int autoSizeStepGranularity, final int unit) throws IllegalArgumentException {
        if (this.supportsAutoSizeText()) {
            final DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
            final float autoSizeMinTextSizeInPx = TypedValue.applyDimension(unit, (float)autoSizeMinTextSize, displayMetrics);
            final float autoSizeMaxTextSizeInPx = TypedValue.applyDimension(unit, (float)autoSizeMaxTextSize, displayMetrics);
            final float autoSizeStepGranularityInPx = TypedValue.applyDimension(unit, (float)autoSizeStepGranularity, displayMetrics);
            this.validateAndSetAutoSizeTextTypeUniformConfiguration(autoSizeMinTextSizeInPx, autoSizeMaxTextSizeInPx, autoSizeStepGranularityInPx);
            if (this.setupAutoSizeText()) {
                this.autoSizeText();
            }
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull final int[] presetSizes, final int unit) throws IllegalArgumentException {
        if (this.supportsAutoSizeText()) {
            final int presetSizesLength = presetSizes.length;
            if (presetSizesLength > 0) {
                int[] presetSizesInPx = new int[presetSizesLength];
                if (unit == 0) {
                    presetSizesInPx = Arrays.copyOf(presetSizes, presetSizesLength);
                }
                else {
                    final DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
                    for (int i = 0; i < presetSizesLength; ++i) {
                        presetSizesInPx[i] = Math.round(TypedValue.applyDimension(unit, (float)presetSizes[i], displayMetrics));
                    }
                }
                this.mAutoSizeTextSizesInPx = this.cleanupAutoSizePresetSizes(presetSizesInPx);
                if (!this.setupAutoSizeUniformPresetSizesConfiguration()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(presetSizes));
                }
            }
            else {
                this.mHasPresetAutoSizeValues = false;
            }
            if (this.setupAutoSizeText()) {
                this.autoSizeText();
            }
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    int getAutoSizeTextType() {
        return this.mAutoSizeTextType;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    int getAutoSizeStepGranularity() {
        return Math.round(this.mAutoSizeStepGranularityInPx);
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    int getAutoSizeMinTextSize() {
        return Math.round(this.mAutoSizeMinTextSizeInPx);
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    int getAutoSizeMaxTextSize() {
        return Math.round(this.mAutoSizeMaxTextSizeInPx);
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextSizesInPx;
    }
    
    private void setupAutoSizeUniformPresetSizes(final TypedArray textSizes) {
        final int textSizesLength = textSizes.length();
        final int[] parsedSizes = new int[textSizesLength];
        if (textSizesLength > 0) {
            for (int i = 0; i < textSizesLength; ++i) {
                parsedSizes[i] = textSizes.getDimensionPixelSize(i, -1);
            }
            this.mAutoSizeTextSizesInPx = this.cleanupAutoSizePresetSizes(parsedSizes);
            this.setupAutoSizeUniformPresetSizesConfiguration();
        }
    }
    
    private boolean setupAutoSizeUniformPresetSizesConfiguration() {
        final int sizesLength = this.mAutoSizeTextSizesInPx.length;
        this.mHasPresetAutoSizeValues = (sizesLength > 0);
        if (this.mHasPresetAutoSizeValues) {
            this.mAutoSizeTextType = 1;
            this.mAutoSizeMinTextSizeInPx = (float)this.mAutoSizeTextSizesInPx[0];
            this.mAutoSizeMaxTextSizeInPx = (float)this.mAutoSizeTextSizesInPx[sizesLength - 1];
            this.mAutoSizeStepGranularityInPx = -1.0f;
        }
        return this.mHasPresetAutoSizeValues;
    }
    
    private int[] cleanupAutoSizePresetSizes(final int[] presetValues) {
        final int presetValuesLength = presetValues.length;
        if (presetValuesLength == 0) {
            return presetValues;
        }
        Arrays.sort(presetValues);
        final List<Integer> uniqueValidSizes = (List<Integer>)new ArrayList();
        for (final int currentPresetValue : presetValues) {
            if (currentPresetValue > 0 && Collections.binarySearch((List)uniqueValidSizes, (Object)currentPresetValue) < 0) {
                uniqueValidSizes.add((Object)currentPresetValue);
            }
        }
        if (presetValuesLength == uniqueValidSizes.size()) {
            return presetValues;
        }
        final int uniqueValidSizesLength = uniqueValidSizes.size();
        final int[] cleanedUpSizes = new int[uniqueValidSizesLength];
        for (int j = 0; j < uniqueValidSizesLength; ++j) {
            cleanedUpSizes[j] = (int)uniqueValidSizes.get(j);
        }
        return cleanedUpSizes;
    }
    
    private void validateAndSetAutoSizeTextTypeUniformConfiguration(final float autoSizeMinTextSizeInPx, final float autoSizeMaxTextSizeInPx, final float autoSizeStepGranularityInPx) throws IllegalArgumentException {
        if (autoSizeMinTextSizeInPx <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + autoSizeMinTextSizeInPx + "px) is less or equal to (0px)");
        }
        if (autoSizeMaxTextSizeInPx <= autoSizeMinTextSizeInPx) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + autoSizeMaxTextSizeInPx + "px) is less or equal to minimum auto-size text size (" + autoSizeMinTextSizeInPx + "px)");
        }
        if (autoSizeStepGranularityInPx <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + autoSizeStepGranularityInPx + "px) is less or equal to (0px)");
        }
        this.mAutoSizeTextType = 1;
        this.mAutoSizeMinTextSizeInPx = autoSizeMinTextSizeInPx;
        this.mAutoSizeMaxTextSizeInPx = autoSizeMaxTextSizeInPx;
        this.mAutoSizeStepGranularityInPx = autoSizeStepGranularityInPx;
        this.mHasPresetAutoSizeValues = false;
    }
    
    private boolean setupAutoSizeText() {
        if (this.supportsAutoSizeText() && this.mAutoSizeTextType == 1) {
            if (!this.mHasPresetAutoSizeValues || this.mAutoSizeTextSizesInPx.length == 0) {
                final int autoSizeValuesLength = (int)Math.floor((double)((this.mAutoSizeMaxTextSizeInPx - this.mAutoSizeMinTextSizeInPx) / this.mAutoSizeStepGranularityInPx)) + 1;
                final int[] autoSizeTextSizesInPx = new int[autoSizeValuesLength];
                for (int i = 0; i < autoSizeValuesLength; ++i) {
                    autoSizeTextSizesInPx[i] = Math.round(this.mAutoSizeMinTextSizeInPx + i * this.mAutoSizeStepGranularityInPx);
                }
                this.mAutoSizeTextSizesInPx = this.cleanupAutoSizePresetSizes(autoSizeTextSizesInPx);
            }
            this.mNeedsAutoSizeText = true;
        }
        else {
            this.mNeedsAutoSizeText = false;
        }
        return this.mNeedsAutoSizeText;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    void autoSizeText() {
        if (!this.isAutoSizeEnabled()) {
            return;
        }
        if (this.mNeedsAutoSizeText) {
            if (this.mTextView.getMeasuredHeight() <= 0 || this.mTextView.getMeasuredWidth() <= 0) {
                return;
            }
            final boolean horizontallyScrolling = this.mImpl.isHorizontallyScrollable(this.mTextView);
            final int availableWidth = horizontallyScrolling ? 1048576 : (this.mTextView.getMeasuredWidth() - this.mTextView.getTotalPaddingLeft() - this.mTextView.getTotalPaddingRight());
            final int availableHeight = this.mTextView.getHeight() - this.mTextView.getCompoundPaddingBottom() - this.mTextView.getCompoundPaddingTop();
            if (availableWidth <= 0 || availableHeight <= 0) {
                return;
            }
            synchronized (AppCompatTextViewAutoSizeHelper.TEMP_RECTF) {
                AppCompatTextViewAutoSizeHelper.TEMP_RECTF.setEmpty();
                AppCompatTextViewAutoSizeHelper.TEMP_RECTF.right = (float)availableWidth;
                AppCompatTextViewAutoSizeHelper.TEMP_RECTF.bottom = (float)availableHeight;
                final float optimalTextSize = (float)this.findLargestTextSizeWhichFits(AppCompatTextViewAutoSizeHelper.TEMP_RECTF);
                if (optimalTextSize != this.mTextView.getTextSize()) {
                    this.setTextSizeInternal(0, optimalTextSize);
                }
            }
        }
        this.mNeedsAutoSizeText = true;
    }
    
    private void clearAutoSizeConfiguration() {
        this.mAutoSizeTextType = 0;
        this.mAutoSizeMinTextSizeInPx = -1.0f;
        this.mAutoSizeMaxTextSizeInPx = -1.0f;
        this.mAutoSizeStepGranularityInPx = -1.0f;
        this.mAutoSizeTextSizesInPx = new int[0];
        this.mNeedsAutoSizeText = false;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    void setTextSizeInternal(final int unit, final float size) {
        final Resources res = (this.mContext == null) ? Resources.getSystem() : this.mContext.getResources();
        this.setRawTextSize(TypedValue.applyDimension(unit, size, res.getDisplayMetrics()));
    }
    
    @SuppressLint({ "BanUncheckedReflection" })
    private void setRawTextSize(final float size) {
        if (size != this.mTextView.getPaint().getTextSize()) {
            this.mTextView.getPaint().setTextSize(size);
            final boolean isInLayout = this.mTextView.isInLayout();
            if (this.mTextView.getLayout() != null) {
                this.mNeedsAutoSizeText = false;
                final String methodName = "nullLayouts";
                try {
                    final Method method = getTextViewMethod("nullLayouts");
                    if (method != null) {
                        method.invoke((Object)this.mTextView, new Object[0]);
                    }
                }
                catch (final Exception ex) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", (Throwable)ex);
                }
                if (!isInLayout) {
                    this.mTextView.requestLayout();
                }
                else {
                    this.mTextView.forceLayout();
                }
                this.mTextView.invalidate();
            }
        }
    }
    
    private int findLargestTextSizeWhichFits(final RectF availableSpace) {
        final int sizesCount = this.mAutoSizeTextSizesInPx.length;
        if (sizesCount == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int bestSizeIndex = 0;
        int lowIndex = bestSizeIndex + 1;
        int highIndex = sizesCount - 1;
        while (lowIndex <= highIndex) {
            final int sizeToTryIndex = (lowIndex + highIndex) / 2;
            if (this.suggestedSizeFitsInSpace(this.mAutoSizeTextSizesInPx[sizeToTryIndex], availableSpace)) {
                bestSizeIndex = lowIndex;
                lowIndex = sizeToTryIndex + 1;
            }
            else {
                highIndex = (bestSizeIndex = sizeToTryIndex - 1);
            }
        }
        return this.mAutoSizeTextSizesInPx[bestSizeIndex];
    }
    
    @VisibleForTesting
    void initTempTextPaint(final int suggestedSizeInPx) {
        if (this.mTempTextPaint == null) {
            this.mTempTextPaint = new TextPaint();
        }
        else {
            this.mTempTextPaint.reset();
        }
        this.mTempTextPaint.set(this.mTextView.getPaint());
        this.mTempTextPaint.setTextSize((float)suggestedSizeInPx);
    }
    
    @VisibleForTesting
    @NonNull
    StaticLayout createLayout(@NonNull final CharSequence text, @NonNull final Layout.Alignment alignment, final int availableWidth, final int maxLines) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.createStaticLayoutForMeasuring(text, alignment, availableWidth, maxLines, this.mTextView, this.mTempTextPaint, this.mImpl);
        }
        final float lineSpacingMultiplier = this.mTextView.getLineSpacingMultiplier();
        final float lineSpacingAdd = this.mTextView.getLineSpacingExtra();
        final boolean includePad = this.mTextView.getIncludeFontPadding();
        return new StaticLayout(text, this.mTempTextPaint, availableWidth, alignment, lineSpacingMultiplier, lineSpacingAdd, includePad);
    }
    
    private boolean suggestedSizeFitsInSpace(final int suggestedSizeInPx, final RectF availableSpace) {
        CharSequence text = this.mTextView.getText();
        final TransformationMethod transformationMethod = this.mTextView.getTransformationMethod();
        if (transformationMethod != null) {
            final CharSequence transformedText = transformationMethod.getTransformation(text, (View)this.mTextView);
            if (transformedText != null) {
                text = transformedText;
            }
        }
        final int maxLines = this.mTextView.getMaxLines();
        this.initTempTextPaint(suggestedSizeInPx);
        final Layout.Alignment alignment = invokeAndReturnWithDefault(this.mTextView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        final StaticLayout layout = this.createLayout(text, alignment, Math.round(availableSpace.right), maxLines);
        return (maxLines == -1 || (layout.getLineCount() <= maxLines && layout.getLineEnd(layout.getLineCount() - 1) == text.length())) && layout.getHeight() <= availableSpace.bottom;
    }
    
    @SuppressLint({ "BanUncheckedReflection" })
    static <T> T invokeAndReturnWithDefault(@NonNull final Object object, @NonNull final String methodName, @NonNull final T defaultValue) {
        T result = null;
        boolean exceptionThrown = false;
        try {
            final Method method = getTextViewMethod(methodName);
            result = (T)method.invoke(object, new Object[0]);
        }
        catch (final Exception ex) {
            exceptionThrown = true;
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + methodName + "() method", (Throwable)ex);
        }
        finally {
            if (result == null && exceptionThrown) {
                result = defaultValue;
            }
        }
        return result;
    }
    
    @Nullable
    private static Method getTextViewMethod(@NonNull final String methodName) {
        try {
            Method method = (Method)AppCompatTextViewAutoSizeHelper.sTextViewMethodByNameCache.get((Object)methodName);
            if (method == null) {
                method = TextView.class.getDeclaredMethod(methodName, (Class<?>[])new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    AppCompatTextViewAutoSizeHelper.sTextViewMethodByNameCache.put((Object)methodName, (Object)method);
                }
            }
            return method;
        }
        catch (final Exception ex) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + methodName + "() method", (Throwable)ex);
            return null;
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    boolean isAutoSizeEnabled() {
        return this.supportsAutoSizeText() && this.mAutoSizeTextType != 0;
    }
    
    private boolean supportsAutoSizeText() {
        return !(this.mTextView instanceof AppCompatEditText);
    }
    
    static {
        TEMP_RECTF = new RectF();
        AppCompatTextViewAutoSizeHelper.sTextViewMethodByNameCache = (ConcurrentHashMap<String, Method>)new ConcurrentHashMap();
    }
    
    private static class Impl
    {
        Impl() {
        }
        
        boolean isHorizontallyScrollable(final TextView textView) {
            return AppCompatTextViewAutoSizeHelper.invokeAndReturnWithDefault(textView, "getHorizontallyScrolling", false);
        }
        
        void computeAndSetTextDirection(final StaticLayout.Builder layoutBuilder, final TextView textView) {
        }
    }
    
    @RequiresApi(23)
    private static class Impl23 extends Impl
    {
        Impl23() {
        }
        
        @Override
        void computeAndSetTextDirection(final StaticLayout.Builder layoutBuilder, final TextView textView) {
            final TextDirectionHeuristic textDirectionHeuristic = AppCompatTextViewAutoSizeHelper.invokeAndReturnWithDefault(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
            layoutBuilder.setTextDirection(textDirectionHeuristic);
        }
    }
    
    @RequiresApi(29)
    private static class Impl29 extends Impl23
    {
        Impl29() {
        }
        
        @Override
        boolean isHorizontallyScrollable(final TextView textView) {
            return textView.isHorizontallyScrollable();
        }
        
        @Override
        void computeAndSetTextDirection(final StaticLayout.Builder layoutBuilder, final TextView textView) {
            layoutBuilder.setTextDirection(textView.getTextDirectionHeuristic());
        }
    }
    
    @RequiresApi(23)
    private static final class Api23Impl
    {
        @DoNotInline
        @NonNull
        static StaticLayout createStaticLayoutForMeasuring(@NonNull final CharSequence text, @NonNull final Layout.Alignment alignment, final int availableWidth, final int maxLines, @NonNull final TextView textView, @NonNull final TextPaint tempTextPaint, @NonNull final Impl impl) {
            final StaticLayout.Builder layoutBuilder = StaticLayout.Builder.obtain(text, 0, text.length(), tempTextPaint, availableWidth);
            layoutBuilder.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines((maxLines == -1) ? Integer.MAX_VALUE : maxLines);
            try {
                impl.computeAndSetTextDirection(layoutBuilder, textView);
            }
            catch (final ClassCastException e) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return layoutBuilder.build();
        }
    }
}
