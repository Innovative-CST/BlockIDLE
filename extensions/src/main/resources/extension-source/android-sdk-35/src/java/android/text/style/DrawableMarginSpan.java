package android.text.style;

import android.text.Layout;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

public class DrawableMarginSpan implements LeadingMarginSpan, LineHeightSpan
{
    public DrawableMarginSpan(@NonNull final Drawable drawable) {
        throw new RuntimeException("Stub!");
    }
    
    public DrawableMarginSpan(@NonNull final Drawable drawable, final int pad) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getLeadingMargin(final boolean first) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void drawLeadingMargin(@NonNull final Canvas c, @NonNull final Paint p, final int x, final int dir, final int top, final int baseline, final int bottom, @NonNull final CharSequence text, final int start, final int end, final boolean first, @NonNull final Layout layout) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void chooseHeight(@NonNull final CharSequence text, final int start, final int end, final int istartv, final int v, @NonNull final Paint.FontMetricsInt fm) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Drawable getDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPadding() {
        throw new RuntimeException("Stub!");
    }
}
