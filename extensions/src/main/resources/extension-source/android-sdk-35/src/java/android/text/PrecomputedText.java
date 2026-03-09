package android.text;

import android.graphics.text.LineBreakConfig;
import android.graphics.Paint;
import android.graphics.Rect;

public class PrecomputedText implements Spannable
{
    PrecomputedText() {
        throw new RuntimeException("Stub!");
    }
    
    public static PrecomputedText create(@NonNull final CharSequence text, @NonNull final Params params) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Params getParams() {
        throw new RuntimeException("Stub!");
    }
    
    public int getParagraphCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getParagraphStart(final int paraIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public int getParagraphEnd(final int paraIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public float getWidth(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public void getBounds(final int start, final int end, @NonNull final Rect bounds) {
        throw new RuntimeException("Stub!");
    }
    
    public void getFontMetricsInt(final int start, final int end, @NonNull final Paint.FontMetricsInt outMetrics) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setSpan(final Object what, final int start, final int end, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void removeSpan(final Object what) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public <T> T[] getSpans(final int start, final int end, final Class<T> type) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getSpanStart(final Object tag) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getSpanEnd(final Object tag) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getSpanFlags(final Object tag) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int nextSpanTransition(final int start, final int limit, final Class type) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int length() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public char charAt(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence subSequence(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Params
    {
        Params() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TextPaint getTextPaint() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TextDirectionHeuristic getTextDirection() {
            throw new RuntimeException("Stub!");
        }
        
        public int getBreakStrategy() {
            throw new RuntimeException("Stub!");
        }
        
        public int getHyphenationFrequency() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public LineBreakConfig getLineBreakConfig() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object o) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        public static class Builder
        {
            public Builder(@NonNull final TextPaint paint) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder(@NonNull final Params params) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setBreakStrategy(final int strategy) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setHyphenationFrequency(final int frequency) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setTextDirection(@NonNull final TextDirectionHeuristic textDir) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setLineBreakConfig(@NonNull final LineBreakConfig lineBreakConfig) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Params build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
