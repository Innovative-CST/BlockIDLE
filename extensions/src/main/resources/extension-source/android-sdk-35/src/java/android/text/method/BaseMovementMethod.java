package android.text.method;

import android.view.MotionEvent;
import android.view.KeyEvent;
import android.text.Spannable;
import android.widget.TextView;

public class BaseMovementMethod implements MovementMethod
{
    public BaseMovementMethod() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean canSelectArbitrarily() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void initialize(final TextView widget, final Spannable text) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyDown(final TextView widget, final Spannable text, final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyOther(final TextView widget, final Spannable text, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyUp(final TextView widget, final Spannable text, final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onTakeFocus(final TextView widget, final Spannable text, final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onTouchEvent(final TextView widget, final Spannable text, final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onTrackballEvent(final TextView widget, final Spannable text, final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onGenericMotionEvent(final TextView widget, final Spannable text, final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    protected int getMovementMetaState(final Spannable buffer, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean handleMovementKey(final TextView widget, final Spannable buffer, final int keyCode, final int movementMetaState, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean left(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean right(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean up(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean down(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean pageUp(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean pageDown(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean top(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean bottom(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean lineStart(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean lineEnd(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean home(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean end(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean previousParagraph(@NonNull final TextView widget, @NonNull final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean nextParagraph(@NonNull final TextView widget, @NonNull final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
}
