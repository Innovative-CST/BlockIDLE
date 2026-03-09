package android.widget;

import android.text.TextWatcher;
import android.view.KeyEvent;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.content.Context;

@Deprecated
public class DialerFilter extends RelativeLayout
{
    @Deprecated
    public static final int DIGITS_AND_LETTERS = 1;
    @Deprecated
    public static final int DIGITS_AND_LETTERS_NO_DIGITS = 2;
    @Deprecated
    public static final int DIGITS_AND_LETTERS_NO_LETTERS = 3;
    @Deprecated
    public static final int DIGITS_ONLY = 4;
    @Deprecated
    public static final int LETTERS_ONLY = 5;
    
    @Deprecated
    public DialerFilter(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public DialerFilter(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onFinishInflate() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onFocusChanged(final boolean focused, final int direction, final Rect previouslyFocusedRect) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isQwertyKeyboard() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setMode(final int newMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public CharSequence getLetters() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public CharSequence getDigits() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public CharSequence getFilterText() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void append(final String text) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void clearText() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setLettersWatcher(final TextWatcher watcher) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDigitsWatcher(final TextWatcher watcher) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setFilterWatcher(final TextWatcher watcher) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void removeFilterWatcher(final TextWatcher watcher) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onModeChange(final int oldMode, final int newMode) {
        throw new RuntimeException("Stub!");
    }
}
