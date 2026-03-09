package android.view.inputmethod;

import android.os.Handler;
import java.util.function.Consumer;
import android.graphics.RectF;
import android.os.CancellationSignal;
import java.util.function.IntConsumer;
import java.util.concurrent.Executor;
import android.os.Bundle;
import android.view.KeyEvent;

public interface InputConnection
{
    public static final int CURSOR_UPDATE_FILTER_CHARACTER_BOUNDS = 8;
    public static final int CURSOR_UPDATE_FILTER_EDITOR_BOUNDS = 4;
    public static final int CURSOR_UPDATE_FILTER_INSERTION_MARKER = 16;
    public static final int CURSOR_UPDATE_FILTER_TEXT_APPEARANCE = 64;
    public static final int CURSOR_UPDATE_FILTER_VISIBLE_LINE_BOUNDS = 32;
    public static final int CURSOR_UPDATE_IMMEDIATE = 1;
    public static final int CURSOR_UPDATE_MONITOR = 2;
    public static final int GET_EXTRACTED_TEXT_MONITOR = 1;
    public static final int GET_TEXT_WITH_STYLES = 1;
    public static final int HANDWRITING_GESTURE_RESULT_CANCELLED = 4;
    public static final int HANDWRITING_GESTURE_RESULT_FAILED = 3;
    public static final int HANDWRITING_GESTURE_RESULT_FALLBACK = 5;
    public static final int HANDWRITING_GESTURE_RESULT_SUCCESS = 1;
    public static final int HANDWRITING_GESTURE_RESULT_UNKNOWN = 0;
    public static final int HANDWRITING_GESTURE_RESULT_UNSUPPORTED = 2;
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;
    
    @Nullable
    CharSequence getTextBeforeCursor(final int p0, final int p1);
    
    @Nullable
    CharSequence getTextAfterCursor(final int p0, final int p1);
    
    CharSequence getSelectedText(final int p0);
    
    @Nullable
    default SurroundingText getSurroundingText(final int beforeLength, final int afterLength, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    int getCursorCapsMode(final int p0);
    
    ExtractedText getExtractedText(final ExtractedTextRequest p0, final int p1);
    
    boolean deleteSurroundingText(final int p0, final int p1);
    
    boolean deleteSurroundingTextInCodePoints(final int p0, final int p1);
    
    boolean setComposingText(final CharSequence p0, final int p1);
    
    default boolean setComposingText(@NonNull final CharSequence text, final int newCursorPosition, @Nullable final TextAttribute textAttribute) {
        throw new RuntimeException("Stub!");
    }
    
    boolean setComposingRegion(final int p0, final int p1);
    
    default boolean setComposingRegion(final int start, final int end, @Nullable final TextAttribute textAttribute) {
        throw new RuntimeException("Stub!");
    }
    
    boolean finishComposingText();
    
    boolean commitText(final CharSequence p0, final int p1);
    
    default boolean commitText(@NonNull final CharSequence text, final int newCursorPosition, @Nullable final TextAttribute textAttribute) {
        throw new RuntimeException("Stub!");
    }
    
    boolean commitCompletion(final CompletionInfo p0);
    
    boolean commitCorrection(final CorrectionInfo p0);
    
    boolean setSelection(final int p0, final int p1);
    
    boolean performEditorAction(final int p0);
    
    boolean performContextMenuAction(final int p0);
    
    boolean beginBatchEdit();
    
    boolean endBatchEdit();
    
    boolean sendKeyEvent(final KeyEvent p0);
    
    boolean clearMetaKeyStates(final int p0);
    
    boolean reportFullscreenMode(final boolean p0);
    
    default boolean performSpellCheck() {
        throw new RuntimeException("Stub!");
    }
    
    boolean performPrivateCommand(final String p0, final Bundle p1);
    
    default void performHandwritingGesture(@NonNull final HandwritingGesture gesture, @Nullable final Executor executor, @Nullable final IntConsumer consumer) {
        throw new RuntimeException("Stub!");
    }
    
    default boolean previewHandwritingGesture(@NonNull final PreviewableHandwritingGesture gesture, @Nullable final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    boolean requestCursorUpdates(final int p0);
    
    default boolean requestCursorUpdates(final int cursorUpdateMode, final int cursorUpdateFilter) {
        throw new RuntimeException("Stub!");
    }
    
    default void requestTextBoundsInfo(@NonNull final RectF bounds, @NonNull final Executor executor, @NonNull final Consumer<TextBoundsInfoResult> consumer) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    Handler getHandler();
    
    void closeConnection();
    
    boolean commitContent(@NonNull final InputContentInfo p0, final int p1, @Nullable final Bundle p2);
    
    default boolean setImeConsumesInput(final boolean imeConsumesInput) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    default TextSnapshot takeSnapshot() {
        throw new RuntimeException("Stub!");
    }
    
    default boolean replaceText(final int start, final int end, @NonNull final CharSequence text, final int newCursorPosition, @Nullable final TextAttribute textAttribute) {
        throw new RuntimeException("Stub!");
    }
}
