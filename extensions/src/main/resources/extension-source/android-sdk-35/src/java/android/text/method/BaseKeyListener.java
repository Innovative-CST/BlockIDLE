package android.text.method;

import android.view.KeyEvent;
import android.text.Editable;
import android.view.View;

public abstract class BaseKeyListener extends MetaKeyKeyListener implements KeyListener
{
    public BaseKeyListener() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean backspace(final View view, final Editable content, final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean forwardDelete(final View view, final Editable content, final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyDown(final View view, final Editable content, final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyOther(final View view, final Editable content, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
}
