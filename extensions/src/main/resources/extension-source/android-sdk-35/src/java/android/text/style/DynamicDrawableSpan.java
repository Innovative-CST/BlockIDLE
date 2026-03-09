package android.text.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public abstract class DynamicDrawableSpan extends ReplacementSpan
{
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    protected final int mVerticalAlignment;
    
    public DynamicDrawableSpan() {
        this.mVerticalAlignment = 0;
        throw new RuntimeException("Stub!");
    }
    
    protected DynamicDrawableSpan(final int verticalAlignment) {
        this.mVerticalAlignment = 0;
        throw new RuntimeException("Stub!");
    }
    
    public int getVerticalAlignment() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Drawable getDrawable();
    
    @Override
    public int getSize(@NonNull final Paint paint, final CharSequence text, final int start, final int end, @Nullable final Paint.FontMetricsInt fm) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void draw(@NonNull final Canvas canvas, final CharSequence text, final int start, final int end, final float x, final int top, final int y, final int bottom, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
