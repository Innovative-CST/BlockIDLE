package android.text.method;

import android.text.Spannable;
import android.view.KeyEvent;
import android.text.Editable;
import android.view.View;

public class QwertyKeyListener extends BaseKeyListener
{
    public QwertyKeyListener(final TextKeyListener.Capitalize cap, final boolean autoText) {
        throw new RuntimeException("Stub!");
    }
    
    public static QwertyKeyListener getInstance(final boolean autoText, final TextKeyListener.Capitalize cap) {
        throw new RuntimeException("Stub!");
    }
    
    public static QwertyKeyListener getInstanceForFullKeyboard() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getInputType() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyDown(final View view, final Editable content, final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public static void markAsReplaced(final Spannable content, final int start, final int end, final String original) {
        throw new RuntimeException("Stub!");
    }
}
