package android.accessibilityservice;

import android.view.KeyEvent;
import android.view.inputmethod.SurroundingText;
import android.view.inputmethod.TextAttribute;
import android.view.inputmethod.EditorInfo;

public class InputMethod
{
    public InputMethod(@NonNull final AccessibilityService service) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final AccessibilityInputConnection getCurrentInputConnection() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean getCurrentInputStarted() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final EditorInfo getCurrentInputEditorInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public void onStartInput(@NonNull final EditorInfo attribute, final boolean restarting) {
        throw new RuntimeException("Stub!");
    }
    
    public void onFinishInput() {
        throw new RuntimeException("Stub!");
    }
    
    public void onUpdateSelection(final int oldSelStart, final int oldSelEnd, final int newSelStart, final int newSelEnd, final int candidatesStart, final int candidatesEnd) {
        throw new RuntimeException("Stub!");
    }
    
    public final class AccessibilityInputConnection
    {
        AccessibilityInputConnection() {
            throw new RuntimeException("Stub!");
        }
        
        public void commitText(@NonNull final CharSequence text, final int newCursorPosition, @Nullable final TextAttribute textAttribute) {
            throw new RuntimeException("Stub!");
        }
        
        public void setSelection(final int start, final int end) {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public SurroundingText getSurroundingText(final int beforeLength, final int afterLength, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        public void deleteSurroundingText(final int beforeLength, final int afterLength) {
            throw new RuntimeException("Stub!");
        }
        
        public void sendKeyEvent(@NonNull final KeyEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        public void performEditorAction(final int editorAction) {
            throw new RuntimeException("Stub!");
        }
        
        public void performContextMenuAction(final int id) {
            throw new RuntimeException("Stub!");
        }
        
        public int getCursorCapsMode(final int reqModes) {
            throw new RuntimeException("Stub!");
        }
        
        public void clearMetaKeyStates(final int states) {
            throw new RuntimeException("Stub!");
        }
    }
}
