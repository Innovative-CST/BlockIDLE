package android.text.method;

import android.text.Spannable;
import android.view.KeyEvent;

public class DialerKeyListener extends NumberKeyListener
{
    public static final char[] CHARACTERS;
    
    public DialerKeyListener() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected char[] getAcceptedChars() {
        throw new RuntimeException("Stub!");
    }
    
    public static DialerKeyListener getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getInputType() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int lookup(final KeyEvent event, final Spannable content) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CHARACTERS = null;
    }
}
