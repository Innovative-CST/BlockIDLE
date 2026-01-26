package android.view.inputmethod;

import android.os.Handler;
import java.util.function.Consumer;
import android.graphics.RectF;
import android.os.CancellationSignal;
import java.util.function.IntConsumer;
import java.util.concurrent.Executor;
import android.os.Bundle;
import android.view.KeyEvent;

public class InputConnectionWrapper implements InputConnection
{
    public InputConnectionWrapper(final InputConnection target, final boolean mutable) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTarget(final InputConnection target) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public CharSequence getTextBeforeCursor(final int n, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public CharSequence getTextAfterCursor(final int n, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getSelectedText(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public SurroundingText getSurroundingText(final int beforeLength, final int afterLength, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getCursorCapsMode(final int reqModes) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ExtractedText getExtractedText(final ExtractedTextRequest request, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean deleteSurroundingTextInCodePoints(final int beforeLength, final int afterLength) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean deleteSurroundingText(final int beforeLength, final int afterLength) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean setComposingText(final CharSequence text, final int newCursorPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean setComposingText(@NonNull final CharSequence text, final int newCursorPosition, @Nullable final TextAttribute textAttribute) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean setComposingRegion(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean setComposingRegion(final int start, final int end, @Nullable final TextAttribute textAttribute) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean finishComposingText() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean commitText(final CharSequence text, final int newCursorPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean commitText(@NonNull final CharSequence text, final int newCursorPosition, @Nullable final TextAttribute textAttribute) {
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
    public boolean setSelection(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean performEditorAction(final int editorAction) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean performContextMenuAction(final int id) {
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
    public boolean sendKeyEvent(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean clearMetaKeyStates(final int states) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean reportFullscreenMode(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean performSpellCheck() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean performPrivateCommand(final String action, final Bundle data) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void performHandwritingGesture(@NonNull final HandwritingGesture gesture, @Nullable final Executor executor, @Nullable final IntConsumer consumer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean previewHandwritingGesture(@NonNull final PreviewableHandwritingGesture gesture, @Nullable final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean requestCursorUpdates(final int cursorUpdateMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean requestCursorUpdates(final int cursorUpdateMode, final int cursorUpdateFilter) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void requestTextBoundsInfo(@NonNull final RectF bounds, @NonNull final Executor executor, @NonNull final Consumer<TextBoundsInfoResult> consumer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Handler getHandler() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void closeConnection() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean commitContent(final InputContentInfo inputContentInfo, final int flags, final Bundle opts) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean setImeConsumesInput(final boolean imeConsumesInput) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public TextSnapshot takeSnapshot() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean replaceText(final int start, final int end, @NonNull final CharSequence text, final int newCursorPosition, @Nullable final TextAttribute textAttribute) {
        throw new RuntimeException("Stub!");
    }
}
