package android.text.method;

import android.text.Spannable;
import android.view.KeyEvent;
import android.text.Editable;
import android.view.View;
import android.text.SpanWatcher;

public class TextKeyListener extends BaseKeyListener implements SpanWatcher
{
    public TextKeyListener(final Capitalize cap, final boolean autotext) {
        throw new RuntimeException("Stub!");
    }
    
    public static TextKeyListener getInstance(final boolean autotext, final Capitalize cap) {
        throw new RuntimeException("Stub!");
    }
    
    public static TextKeyListener getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean shouldCap(final Capitalize cap, final CharSequence cs, final int off) {
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
    
    @Override
    public boolean onKeyUp(final View view, final Editable content, final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyOther(final View view, final Editable content, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public static void clear(final Editable e) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onSpanAdded(final Spannable s, final Object what, final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onSpanRemoved(final Spannable s, final Object what, final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onSpanChanged(final Spannable s, final Object what, final int start, final int end, final int st, final int en) {
        throw new RuntimeException("Stub!");
    }
    
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    public enum Capitalize
    {
        NONE, 
        SENTENCES, 
        WORDS, 
        CHARACTERS;
    }
}
