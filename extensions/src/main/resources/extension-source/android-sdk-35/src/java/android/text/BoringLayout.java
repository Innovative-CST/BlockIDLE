package android.text;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Canvas;
import android.graphics.RectF;

public class BoringLayout extends Layout implements TextUtils.EllipsizeCallback
{
    public BoringLayout(final CharSequence source, final TextPaint paint, final int outerwidth, final Alignment align, final float spacingMult, final float spacingAdd, final Metrics metrics, final boolean includePad) {
        super(null, null, 0, null, 0.0f, 0.0f);
        throw new RuntimeException("Stub!");
    }
    
    public BoringLayout(final CharSequence source, final TextPaint paint, final int outerWidth, final Alignment align, final float spacingMult, final float spacingAdd, final Metrics metrics, final boolean includePad, final TextUtils.TruncateAt ellipsize, final int ellipsizedWidth) {
        super(null, null, 0, null, 0.0f, 0.0f);
        throw new RuntimeException("Stub!");
    }
    
    public BoringLayout(@NonNull final CharSequence source, @NonNull final TextPaint paint, final int outerWidth, @NonNull final Alignment align, final float spacingMult, final float spacingAdd, @NonNull final Metrics metrics, final boolean includePad, @Nullable final TextUtils.TruncateAt ellipsize, final int ellipsizedWidth, final boolean useFallbackLineSpacing) {
        super(null, null, 0, null, 0.0f, 0.0f);
        throw new RuntimeException("Stub!");
    }
    
    public static BoringLayout make(final CharSequence source, final TextPaint paint, final int outerWidth, final Alignment align, final float spacingMult, final float spacingAdd, final Metrics metrics, final boolean includePad) {
        throw new RuntimeException("Stub!");
    }
    
    public static BoringLayout make(final CharSequence source, final TextPaint paint, final int outerWidth, final Alignment align, final float spacingmult, final float spacingadd, final Metrics metrics, final boolean includePad, final TextUtils.TruncateAt ellipsize, final int ellipsizedWidth) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static BoringLayout make(@NonNull final CharSequence source, @NonNull final TextPaint paint, final int outerWidth, @NonNull final Alignment align, @NonNull final Metrics metrics, final boolean includePad, @Nullable final TextUtils.TruncateAt ellipsize, final int ellipsizedWidth, final boolean useFallbackLineSpacing) {
        throw new RuntimeException("Stub!");
    }
    
    public BoringLayout replaceOrMake(final CharSequence source, final TextPaint paint, final int outerwidth, final Alignment align, final float spacingMult, final float spacingAdd, final Metrics metrics, final boolean includePad) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public BoringLayout replaceOrMake(@NonNull final CharSequence source, @NonNull final TextPaint paint, final int outerWidth, @NonNull final Alignment align, @NonNull final Metrics metrics, final boolean includePad, @Nullable final TextUtils.TruncateAt ellipsize, final int ellipsizedWidth, final boolean useFallbackLineSpacing) {
        throw new RuntimeException("Stub!");
    }
    
    public BoringLayout replaceOrMake(final CharSequence source, final TextPaint paint, final int outerWidth, final Alignment align, final float spacingMult, final float spacingAdd, final Metrics metrics, final boolean includePad, final TextUtils.TruncateAt ellipsize, final int ellipsizedWidth) {
        throw new RuntimeException("Stub!");
    }
    
    public static Metrics isBoring(final CharSequence text, final TextPaint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public static Metrics isBoring(final CharSequence text, final TextPaint paint, final Metrics metrics) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static Metrics isBoring(@NonNull final CharSequence text, @NonNull final TextPaint paint, @NonNull final TextDirectionHeuristic textDir, final boolean useFallbackLineSpacing, @Nullable final Metrics metrics) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getHeight() {
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
    public int getParagraphDirection(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean getLineContainsTab(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public float getLineMax(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public float getLineWidth(final int line) {
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
    public int getEllipsisCount(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getEllipsisStart(final int line) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getEllipsizedWidth() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isFallbackLineSpacingEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public RectF computeDrawingBoundingBox() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void draw(final Canvas c, final Path highlight, final Paint highlightpaint, final int cursorOffset) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void ellipsized(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public static class Metrics extends Paint.FontMetricsInt
    {
        public int width;
        
        public Metrics() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public RectF getDrawingBoundingBox() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
