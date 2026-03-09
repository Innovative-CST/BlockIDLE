package android.graphics.text;

public class LineBreaker
{
    public static final int BREAK_STRATEGY_BALANCED = 2;
    public static final int BREAK_STRATEGY_HIGH_QUALITY = 1;
    public static final int BREAK_STRATEGY_SIMPLE = 0;
    public static final int HYPHENATION_FREQUENCY_FULL = 2;
    public static final int HYPHENATION_FREQUENCY_NONE = 0;
    public static final int HYPHENATION_FREQUENCY_NORMAL = 1;
    public static final int JUSTIFICATION_MODE_INTER_CHARACTER = 2;
    public static final int JUSTIFICATION_MODE_INTER_WORD = 1;
    public static final int JUSTIFICATION_MODE_NONE = 0;
    
    LineBreaker() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Result computeLineBreaks(@NonNull final MeasuredText measuredPara, @NonNull final ParagraphConstraints constraints, final int lineNumber) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
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
        public Builder setIndents(@Nullable final int[] indents) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUseBoundsForWidth(final boolean useBoundsForWidth) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public LineBreaker build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class ParagraphConstraints
    {
        public ParagraphConstraints() {
            throw new RuntimeException("Stub!");
        }
        
        public void setWidth(final float width) {
            throw new RuntimeException("Stub!");
        }
        
        public void setIndent(final float firstWidth, final int firstWidthLineCount) {
            throw new RuntimeException("Stub!");
        }
        
        public void setTabStops(@Nullable final float[] tabStops, final float defaultTabStop) {
            throw new RuntimeException("Stub!");
        }
        
        public float getWidth() {
            throw new RuntimeException("Stub!");
        }
        
        public float getFirstWidth() {
            throw new RuntimeException("Stub!");
        }
        
        public int getFirstWidthLineCount() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public float[] getTabStops() {
            throw new RuntimeException("Stub!");
        }
        
        public float getDefaultTabStop() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class Result
    {
        Result() {
            throw new RuntimeException("Stub!");
        }
        
        public int getLineCount() {
            throw new RuntimeException("Stub!");
        }
        
        public int getLineBreakOffset(final int lineIndex) {
            throw new RuntimeException("Stub!");
        }
        
        public float getLineWidth(final int lineIndex) {
            throw new RuntimeException("Stub!");
        }
        
        public float getLineAscent(final int lineIndex) {
            throw new RuntimeException("Stub!");
        }
        
        public float getLineDescent(final int lineIndex) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean hasLineTab(final int lineIndex) {
            throw new RuntimeException("Stub!");
        }
        
        public int getStartLineHyphenEdit(final int lineIndex) {
            throw new RuntimeException("Stub!");
        }
        
        public int getEndLineHyphenEdit(final int lineIndex) {
            throw new RuntimeException("Stub!");
        }
    }
}
