package android.text.method;

import android.view.KeyEvent;
import android.text.Editable;
import android.view.View;

public interface KeyListener
{
    int getInputType();
    
    boolean onKeyDown(final View p0, final Editable p1, final int p2, final KeyEvent p3);
    
    boolean onKeyUp(final View p0, final Editable p1, final int p2, final KeyEvent p3);
    
    boolean onKeyOther(final View p0, final Editable p1, final KeyEvent p2);
    
    void clearMetaKeyState(final View p0, final Editable p1, final int p2);
}
