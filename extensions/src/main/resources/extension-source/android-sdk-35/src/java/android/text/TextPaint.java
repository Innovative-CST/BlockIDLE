package android.text;

import android.graphics.Paint;

public class TextPaint extends Paint
{
    public int baselineShift;
    public int bgColor;
    public float density;
    public int[] drawableState;
    public int linkColor;
    public int underlineColor;
    public float underlineThickness;
    
    public TextPaint() {
        this.density = 1.0f;
        this.underlineColor = 0;
        throw new RuntimeException("Stub!");
    }
    
    public TextPaint(final int flags) {
        this.density = 1.0f;
        this.underlineColor = 0;
        throw new RuntimeException("Stub!");
    }
    
    public TextPaint(final Paint p) {
        this.density = 1.0f;
        this.underlineColor = 0;
        throw new RuntimeException("Stub!");
    }
    
    public void set(final TextPaint tp) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public float getUnderlineThickness() {
        throw new RuntimeException("Stub!");
    }
}
