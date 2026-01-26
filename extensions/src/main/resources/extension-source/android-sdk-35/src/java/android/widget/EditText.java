package android.widget;

import android.view.KeyEvent;
import android.text.TextUtils;
import android.text.Editable;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.content.Context;

public class EditText extends TextView
{
    public EditText(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public EditText(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public EditText(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public EditText(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean getFreezesText() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean getDefaultEditable() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected MovementMethod getDefaultMovementMethod() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Editable getText() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setText(final CharSequence text, final BufferType type) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSelection(final int start, final int stop) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSelection(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void selectAll() {
        throw new RuntimeException("Stub!");
    }
    
    public void extendSelection(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setEllipsize(final TextUtils.TruncateAt ellipsis) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyShortcut(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onTextContextMenuItem(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    public void setStyleShortcutsEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isStyleShortcutEnabled() {
        throw new RuntimeException("Stub!");
    }
}
