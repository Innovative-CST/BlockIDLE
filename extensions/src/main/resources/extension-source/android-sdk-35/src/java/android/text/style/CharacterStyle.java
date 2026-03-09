package android.text.style;

import android.text.TextPaint;

public abstract class CharacterStyle
{
    public CharacterStyle() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void updateDrawState(final TextPaint p0);
    
    public static CharacterStyle wrap(final CharacterStyle cs) {
        throw new RuntimeException("Stub!");
    }
    
    public CharacterStyle getUnderlying() {
        throw new RuntimeException("Stub!");
    }
}
