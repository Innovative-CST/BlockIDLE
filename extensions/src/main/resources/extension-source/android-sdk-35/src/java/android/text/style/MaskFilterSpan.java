package android.text.style;

import android.text.TextPaint;
import android.graphics.MaskFilter;

public class MaskFilterSpan extends CharacterStyle implements UpdateAppearance
{
    public MaskFilterSpan(final MaskFilter filter) {
        throw new RuntimeException("Stub!");
    }
    
    public MaskFilter getMaskFilter() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void updateDrawState(final TextPaint ds) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
