package android.graphics.text;

import android.graphics.Paint;
import android.graphics.Rect;

public class MeasuredText
{
    MeasuredText() {
        throw new RuntimeException("Stub!");
    }
    
    public float getWidth(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public void getBounds(final int start, final int end, @NonNull final Rect rect) {
        throw new RuntimeException("Stub!");
    }
    
    public void getFontMetricsInt(final int start, final int end, @NonNull final Paint.FontMetricsInt outMetrics) {
        throw new RuntimeException("Stub!");
    }
    
    public float getCharWidthAt(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public static final int HYPHENATION_MODE_FAST = 2;
        public static final int HYPHENATION_MODE_NONE = 0;
        public static final int HYPHENATION_MODE_NORMAL = 1;
        
        public Builder(@NonNull final char[] text) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final MeasuredText text) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder appendStyleRun(@NonNull final Paint paint, final int length, final boolean isRtl) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder appendStyleRun(@NonNull final Paint paint, @Nullable final LineBreakConfig lineBreakConfig, final int length, final boolean isRtl) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder appendReplacementRun(@NonNull final Paint paint, final int length, final float width) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setComputeHyphenation(final boolean computeHyphenation) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setComputeHyphenation(final int mode) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setComputeLayout(final boolean computeLayout) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public MeasuredText build() {
            throw new RuntimeException("Stub!");
        }
    }
}
