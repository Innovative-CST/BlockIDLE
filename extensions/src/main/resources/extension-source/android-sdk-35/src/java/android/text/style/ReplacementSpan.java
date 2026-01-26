package android.text.style;

import android.text.TextPaint;
import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class ReplacementSpan extends MetricAffectingSpan
{
    public ReplacementSpan() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int getSize(@NonNull final Paint p0, final CharSequence p1, final int p2, final int p3, @Nullable final Paint.FontMetricsInt p4);
    
    public abstract void draw(@NonNull final Canvas p0, final CharSequence p1, final int p2, final int p3, final float p4, final int p5, final int p6, final int p7, @NonNull final Paint p8);
    
    @Nullable
    public CharSequence getContentDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public void setContentDescription(@Nullable final CharSequence contentDescription) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void updateMeasureState(final TextPaint p) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void updateDrawState(final TextPaint ds) {
        throw new RuntimeException("Stub!");
    }
}
