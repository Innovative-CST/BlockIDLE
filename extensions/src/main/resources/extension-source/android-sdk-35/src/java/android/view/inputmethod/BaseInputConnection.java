package android.view.inputmethod;

import android.view.KeyEvent;
import android.os.Handler;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.view.View;

public class BaseInputConnection implements InputConnection
{
    public BaseInputConnection(@NonNull final View targetView, final boolean fullEditor) {
        throw new RuntimeException("Stub!");
    }
    
    public static final void removeComposingSpans(@NonNull final Spannable text) {
        throw new RuntimeException("Stub!");
    }
    
    public static void setComposingSpans(@NonNull final Spannable text) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getComposingSpanStart(@NonNull final Spannable text) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getComposingSpanEnd(@NonNull final Spannable text) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Editable getEditable() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean beginBatchEdit() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean endBatchEdit() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void closeConnection() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean clearMetaKeyStates(final int states) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean commitCompletion(final CompletionInfo text) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean commitCorrection(final CorrectionInfo correctionInfo) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean commitText(final CharSequence text, final int newCursorPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean deleteSurroundingText(final int beforeLength, final int afterLength) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean deleteSurroundingTextInCodePoints(final int beforeLength, final int afterLength) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean finishComposingText() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getCursorCapsMode(final int reqModes) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public ExtractedText getExtractedText(final ExtractedTextRequest request, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public CharSequence getTextBeforeCursor(final int length, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public CharSequence getSelectedText(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public CharSequence getTextAfterCursor(final int length, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public SurroundingText getSurroundingText(final int beforeLength, final int afterLength, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean performEditorAction(final int actionCode) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean performContextMenuAction(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean performPrivateCommand(final String action, final Bundle data) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean requestCursorUpdates(final int cursorUpdateMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public Handler getHandler() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean setComposingText(final CharSequence text, final int newCursorPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean setComposingRegion(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean setSelection(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean sendKeyEvent(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean reportFullscreenMode(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean replaceText(final int start, final int end, @NonNull final CharSequence text, final int newCursorPosition, @Nullable final TextAttribute textAttribute) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean commitContent(final InputContentInfo inputContentInfo, final int flags, final Bundle opts) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public TextSnapshot takeSnapshot() {
        throw new RuntimeException("Stub!");
    }
}
