package android.text.method;

import android.view.MotionEvent;
import android.view.KeyEvent;
import android.text.Spannable;
import android.widget.TextView;

public class LinkMovementMethod extends ScrollingMovementMethod
{
    public LinkMovementMethod() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean canSelectArbitrarily() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean handleMovementKey(final TextView widget, final Spannable buffer, final int keyCode, final int movementMetaState, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean up(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean down(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean left(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean right(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onTouchEvent(final TextView widget, final Spannable buffer, final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void initialize(final TextView widget, final Spannable text) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onTakeFocus(final TextView view, final Spannable text, final int dir) {
        throw new RuntimeException("Stub!");
    }
    
    public static MovementMethod getInstance() {
        throw new RuntimeException("Stub!");
    }
}
