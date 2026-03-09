package android.text;

import android.graphics.text.LineBreakConfig;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.List;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Canvas;

public abstract class Layout
{
    public static final int BREAK_STRATEGY_BALANCED = 2;
    public static final int BREAK_STRATEGY_HIGH_QUALITY = 1;
    public static final int BREAK_STRATEGY_SIMPLE = 0;
    public static final float DEFAULT_LINESPACING_ADDITION = 0.0f;
    public static final float DEFAULT_LINESPACING_MULTIPLIER = 1.0f;
    public static final int DIR_LEFT_TO_RIGHT = 1;
    public static final int DIR_RIGHT_TO_LEFT = -1;
    public static final int HYPHENATION_FREQUENCY_FULL = 2;
    public static final int HYPHENATION_FREQUENCY_FULL_FAST = 4;
    public static final int HYPHENATION_FREQUENCY_NONE = 0;
    public static final int HYPHENATION_FREQUENCY_NORMAL = 1;
    public static final int HYPHENATION_FREQUENCY_NORMAL_FAST = 3;
    @NonNull
    public static final TextInclusionStrategy INCLUSION_STRATEGY_ANY_OVERLAP;
    @NonNull
    public static final TextInclusionStrategy INCLUSION_STRATEGY_CONTAINS_ALL;
    @NonNull
    public static final TextInclusionStrategy INCLUSION_STRATEGY_CONTAINS_CENTER;
    public static final int JUSTIFICATION_MODE_INTER_CHARACTER = 2;
    public static final int JUSTIFICATION_MODE_INTER_WORD = 1;
    public static final int JUSTIFICATION_MODE_NONE = 0;
    
    protected Layout(final CharSequence text, final TextPaint paint, final int width, final Alignment align, final float spacingMult, final float spacingAdd) {
        throw new RuntimeException("Stub!");
    }
    
    public static float getDesiredWidth(final CharSequence source, final TextPaint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public static float getDesiredWidth(final CharSequence source, final int start, final int end, final TextPaint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void draw(final Canvas c) {
        throw new RuntimeException("Stub!");
    }
    
    public void draw(final Canvas canvas, final Path selectionHighlight, final Paint selectionHighlightPaint, final int cursorOffsetVertical) {
        throw new RuntimeException("Stub!");
    }
    
    public void draw(@NonNull final Canvas canvas, @Nullable final List<Path> highlightPaths, @Nullable final List<Paint> highlightPaints, @Nullable final Path selectionPath, @Nullable final Paint selectionPaint, final int cursorOffsetVertical) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawText(@NonNull final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawBackground(@NonNull final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    public final void increaseWidthTo(final int wid) {
        throw new RuntimeException("Stub!");
    }
    
    public int getHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int getLineCount();
    
    @NonNull
    public RectF computeDrawingBoundingBox() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLineBounds(final int line, final Rect bounds) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int getLineTop(final int p0);
    
    public abstract int getLineDescent(final int p0);
    
    public abstract int getLineStart(final int p0);
    
    public abstract int getParagraphDirection(final int p0);
    
    public abstract boolean getLineContainsTab(final int p0);
    
    public abstract Directions getLineDirections(final int p0);
    
    public abstract int getTopPadding();
    
    public abstract int getBottomPadding();
    
    public boolean isRtlCharAt(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public float getPrimaryHorizontal(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public float getSecondaryHorizontal(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public void fillCharacterBounds(final int start, final int end, @NonNull final float[] bounds, final int boundsStart) {
        throw new RuntimeException("Stub!");
    }
    
    public float getLineLeft(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    public float getLineRight(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    public float getLineMax(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    public float getLineWidth(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLineLetterSpacingUnitCount(final int line, final boolean includeTrailingWhitespace) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLineForVertical(final int vertical) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLineForOffset(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public int getOffsetForHorizontal(final int line, final float horiz) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public int[] getRangeForRect(@NonNull final RectF area, @NonNull final SegmentFinder segmentFinder, @NonNull final TextInclusionStrategy inclusionStrategy) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getLineEnd(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLineVisibleEnd(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getLineBottom(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLineBottom(final int line, final boolean includeLineSpacing) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getLineBaseline(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getLineAscent(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    public int getOffsetToLeftOf(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public int getOffsetToRightOf(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public void getCursorPath(final int point, final Path dest, final CharSequence editingBuffer) {
        throw new RuntimeException("Stub!");
    }
    
    public void getSelectionPath(final int start, final int end, final Path dest) {
        throw new RuntimeException("Stub!");
    }
    
    public final Alignment getParagraphAlignment(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getParagraphLeft(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getParagraphRight(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    protected final boolean isSpanned() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int getEllipsisStart(final int p0);
    
    public abstract int getEllipsisCount(final int p0);
    
    @NonNull
    public final CharSequence getText() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final TextPaint getPaint() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getWidth() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final Alignment getAlignment() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final TextDirectionHeuristic getTextDirectionHeuristic() {
        throw new RuntimeException("Stub!");
    }
    
    public final float getSpacingMultiplier() {
        throw new RuntimeException("Stub!");
    }
    
    public final float getLineSpacingMultiplier() {
        throw new RuntimeException("Stub!");
    }
    
    public final float getSpacingAdd() {
        throw new RuntimeException("Stub!");
    }
    
    public final float getLineSpacingAmount() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isFontPaddingIncluded() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFallbackLineSpacingEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEllipsizedWidth() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final TextUtils.TruncateAt getEllipsize() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getMaxLines() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getBreakStrategy() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getHyphenationFrequency() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final int[] getLeftIndents() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final int[] getRightIndents() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getJustificationMode() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LineBreakConfig getLineBreakConfig() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getUseBoundsForWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getShiftDrawingOffsetForStartOverhang() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Paint.FontMetrics getMinimumFontMetrics() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        INCLUSION_STRATEGY_ANY_OVERLAP = null;
        INCLUSION_STRATEGY_CONTAINS_ALL = null;
        INCLUSION_STRATEGY_CONTAINS_CENTER = null;
    }
    
    public enum Alignment
    {
        ALIGN_NORMAL, 
        ALIGN_OPPOSITE, 
        ALIGN_CENTER;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final CharSequence text, final int start, final int end, @NonNull final TextPaint paint, final int width) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAlignment(@NonNull final Alignment alignment) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTextDirectionHeuristic(@NonNull final TextDirectionHeuristic textDirection) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLineSpacingAmount(final float amount) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLineSpacingMultiplier(final float multiplier) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFontPaddingIncluded(final boolean includeFontPadding) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFallbackLineSpacingEnabled(final boolean fallbackLineSpacing) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEllipsizedWidth(final int ellipsizeWidth) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEllipsize(@Nullable final TextUtils.TruncateAt ellipsize) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMaxLines(final int maxLines) {
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
        public Builder setLeftIndents(@Nullable final int[] leftIndents) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRightIndents(@Nullable final int[] rightIndents) {
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
        public Layout build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class Directions
    {
        Directions() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @FunctionalInterface
    public interface TextInclusionStrategy
    {
        boolean isSegmentInside(@NonNull final RectF p0, @NonNull final RectF p1);
    }
}
