package android.text;

import android.graphics.text.PositionedGlyphs;

public class TextShaper
{
    TextShaper() {
        throw new RuntimeException("Stub!");
    }
    
    public static void shapeText(@NonNull final CharSequence text, final int start, final int count, @NonNull final TextDirectionHeuristic dir, @NonNull final TextPaint paint, @NonNull final GlyphsConsumer consumer) {
        throw new RuntimeException("Stub!");
    }
    
    public interface GlyphsConsumer
    {
        void accept(final int p0, final int p1, @NonNull final PositionedGlyphs p2, @NonNull final TextPaint p3);
    }
}
