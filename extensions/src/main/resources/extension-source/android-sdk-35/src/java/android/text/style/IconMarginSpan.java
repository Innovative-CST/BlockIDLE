package android.text.style;

import android.text.Layout;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap;

public class IconMarginSpan implements LeadingMarginSpan, LineHeightSpan
{
    public IconMarginSpan(@NonNull final Bitmap bitmap) {
        throw new RuntimeException("Stub!");
    }
    
    public IconMarginSpan(@NonNull final Bitmap bitmap, final int pad) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getLeadingMargin(final boolean first) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void drawLeadingMargin(final Canvas c, final Paint p, final int x, final int dir, final int top, final int baseline, final int bottom, final CharSequence text, final int start, final int end, final boolean first, final Layout layout) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void chooseHeight(final CharSequence text, final int start, final int end, final int istartv, final int v, final Paint.FontMetricsInt fm) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bitmap getBitmap() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPadding() {
        throw new RuntimeException("Stub!");
    }
}
