package android.text.style;

import android.text.TextPaint;
import android.view.View;

public abstract class ClickableSpan extends CharacterStyle implements UpdateAppearance
{
    public ClickableSpan() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onClick(@NonNull final View p0);
    
    @Override
    public void updateDrawState(@NonNull final TextPaint ds) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
