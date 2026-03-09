package android.text.style;

import android.text.TextPaint;

public abstract class MetricAffectingSpan extends CharacterStyle implements UpdateLayout
{
    public MetricAffectingSpan() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void updateMeasureState(@NonNull final TextPaint p0);
    
    @Override
    public MetricAffectingSpan getUnderlying() {
        throw new RuntimeException("Stub!");
    }
}
