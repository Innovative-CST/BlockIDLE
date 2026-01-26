package android.text.method;

import android.graphics.Rect;
import android.view.View;

public abstract class ReplacementTransformationMethod implements TransformationMethod
{
    public ReplacementTransformationMethod() {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract char[] getOriginal();
    
    protected abstract char[] getReplacement();
    
    @Override
    public CharSequence getTransformation(final CharSequence source, final View v) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onFocusChanged(final View view, final CharSequence sourceText, final boolean focused, final int direction, final Rect previouslyFocusedRect) {
        throw new RuntimeException("Stub!");
    }
}
