package android.text.method;

import android.graphics.Rect;
import android.text.Editable;
import android.view.View;
import android.text.TextWatcher;

public class PasswordTransformationMethod implements TransformationMethod, TextWatcher
{
    public PasswordTransformationMethod() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getTransformation(final CharSequence source, final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public static PasswordTransformationMethod getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void beforeTextChanged(final CharSequence s, final int start, final int count, final int after) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onTextChanged(final CharSequence s, final int start, final int before, final int count) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void afterTextChanged(final Editable s) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onFocusChanged(final View view, final CharSequence sourceText, final boolean focused, final int direction, final Rect previouslyFocusedRect) {
        throw new RuntimeException("Stub!");
    }
}
