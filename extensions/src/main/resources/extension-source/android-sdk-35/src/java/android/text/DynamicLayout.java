package android.text;

import android.graphics.Paint;
import android.graphics.text.LineBreakConfig;

public class DynamicLayout extends Layout
{
    @Deprecated
    public DynamicLayout(@NonNull final CharSequence base, @NonNull final TextPaint paint, final int width, @NonNull final Alignment align, final float spacingmult, final float spacingadd, final boolean includepad) {
        super(null, null, 0, null, 0.0f, 0.0f);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public DynamicLayout(@NonNull final CharSequence base, @NonNull final CharSequence display, @NonNull final TextPaint paint, final int width, @NonNull final Alignment align, final float spacingmult, final float spacingadd, final boolean includepad) {
        super(null, null, 0, null, 0.0f, 0.0f);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public DynamicLayout(@NonNull final CharSequence base, @NonNull final CharSequence display, @NonNull final TextPaint paint, final int width, @NonNull final Alignment align, final float spacingmult, final float spacingadd, final boolean includepad, @Nullable final TextUtils.TruncateAt ellipsize, final int ellipsizedWidth) {
        super(null, null, 0, null, 0.0f, 0.0f);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getLineCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getLineTop(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getLineDescent(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getLineStart(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean getLineContainsTab(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getParagraphDirection(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final Directions getLineDirections(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getTopPadding() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getBottomPadding() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getEllipsizedWidth() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getEllipsisStart(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getEllipsisCount(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public LineBreakConfig getLineBreakConfig() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static Builder obtain(@NonNull final CharSequence base, @NonNull final TextPaint paint, final int width) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDisplayText(@NonNull final CharSequence display) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAlignment(@NonNull final Alignment alignment) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTextDirection(@NonNull final TextDirectionHeuristic textDir) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLineSpacing(final float spacingAdd, final float spacingMult) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIncludePad(final boolean includePad) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUseLineSpacingFromFallbacks(final boolean useLineSpacingFromFallbacks) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEllipsizedWidth(final int ellipsizedWidth) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setEllipsize(@Nullable final TextUtils.TruncateAt ellipsize) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBreakStrategy(final int breakStrategy) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHyphenationFrequency(final int hyphenationFrequency) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setJustificationMode(final int justificationMode) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLineBreakConfig(@NonNull final LineBreakConfig lineBreakConfig) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUseBoundsForWidth(final boolean useBoundsForWidth) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setShiftDrawingOffsetForStartOverhang(final boolean shiftDrawingOffsetForStartOverhang) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMinimumFontMetrics(@Nullable final Paint.FontMetrics minimumFontMetrics) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public DynamicLayout build() {
            throw new RuntimeException("Stub!");
        }
    }
}
