package android.text.method;

import android.view.MotionEvent;
import android.view.KeyEvent;
import android.text.Spannable;
import android.widget.TextView;

public class ArrowKeyMovementMethod extends BaseMovementMethod implements MovementMethod
{
    public ArrowKeyMovementMethod() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean handleMovementKey(final TextView widget, final Spannable buffer, final int keyCode, final int movementMetaState, final KeyEvent event) {
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
    protected boolean up(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean down(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean pageUp(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean pageDown(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean top(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean bottom(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean lineStart(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean lineEnd(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean home(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean end(final TextView widget, final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean previousParagraph(@NonNull final TextView widget, @NonNull final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean nextParagraph(@NonNull final TextView widget, @NonNull final Spannable buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onTouchEvent(final TextView widget, final Spannable buffer, final MotionEvent event) {
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
    public void onTakeFocus(final TextView view, final Spannable text, final int dir) {
        throw new RuntimeException("Stub!");
    }
    
    public static MovementMethod getInstance() {
        throw new RuntimeException("Stub!");
    }
}
