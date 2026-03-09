package android.text.method;

import android.text.Spannable;
import android.view.KeyEvent;
import android.text.Editable;
import android.view.View;
import android.text.SpanWatcher;

public class MultiTapKeyListener extends BaseKeyListener implements SpanWatcher
{
    public MultiTapKeyListener(final TextKeyListener.Capitalize cap, final boolean autotext) {
        throw new RuntimeException("Stub!");
    }
    
    public static MultiTapKeyListener getInstance(final boolean autotext, final TextKeyListener.Capitalize cap) {
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
    public void onSpanChanged(final Spannable buf, final Object what, final int s, final int e, final int start, final int stop) {
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
}
