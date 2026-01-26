package android.inputmethodservice;

import android.graphics.Region;
import android.os.ResultReceiver;
import android.os.IBinder;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.view.KeyEvent;
import android.graphics.Rect;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.CompletionInfo;
import java.time.Duration;
import android.view.MotionEvent;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.View;
import android.view.inputmethod.InputMethodSubtype;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputBinding;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.content.res.Configuration;
import android.view.inputmethod.InlineSuggestionsResponse;
import android.view.inputmethod.InlineSuggestionsRequest;
import android.os.Bundle;

public class InputMethodService extends AbstractInputMethodService
{
    public static final int BACK_DISPOSITION_ADJUST_NOTHING = 3;
    public static final int BACK_DISPOSITION_DEFAULT = 0;
    @Deprecated
    public static final int BACK_DISPOSITION_WILL_DISMISS = 2;
    @Deprecated
    public static final int BACK_DISPOSITION_WILL_NOT_DISMISS = 1;
    
    public InputMethodService() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public InlineSuggestionsRequest onCreateInlineSuggestionsRequest(@NonNull final Bundle uiExtras) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onInlineSuggestionsResponse(@NonNull final InlineSuggestionsResponse response) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setTheme(final int theme) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean enableHardwareAcceleration() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onCreate() {
        throw new RuntimeException("Stub!");
    }
    
    public void onInitializeInterface() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onDestroy() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onConfigurationChanged(final Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public AbstractInputMethodImpl onCreateInputMethodInterface() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface() {
        throw new RuntimeException("Stub!");
    }
    
    public LayoutInflater getLayoutInflater() {
        throw new RuntimeException("Stub!");
    }
    
    public Dialog getWindow() {
        throw new RuntimeException("Stub!");
    }
    
    public void setBackDisposition(final int disposition) {
        throw new RuntimeException("Stub!");
    }
    
    public int getBackDisposition() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public InputBinding getCurrentInputBinding() {
        throw new RuntimeException("Stub!");
    }
    
    public InputConnection getCurrentInputConnection() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean switchToPreviousInputMethod() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean switchToNextInputMethod(final boolean onlyCurrentIme) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean shouldOfferSwitchingToNextInputMethod() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getCurrentInputStarted() {
        throw new RuntimeException("Stub!");
    }
    
    public EditorInfo getCurrentInputEditorInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public void updateFullscreenMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void onConfigureWindow(final Window win, final boolean isFullscreen, final boolean isCandidatesOnly) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFullscreenMode() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onEvaluateFullscreenMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setExtractViewShown(final boolean shown) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isExtractViewShown() {
        throw new RuntimeException("Stub!");
    }
    
    public void onComputeInsets(final Insets outInsets) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateInputViewShown() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isShowInputRequested() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInputViewShown() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onEvaluateInputViewShown() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCandidatesViewShown(final boolean shown) {
        throw new RuntimeException("Stub!");
    }
    
    public int getCandidatesHiddenVisibility() {
        throw new RuntimeException("Stub!");
    }
    
    public void showStatusIcon(final int iconResId) {
        throw new RuntimeException("Stub!");
    }
    
    public void hideStatusIcon() {
        throw new RuntimeException("Stub!");
    }
    
    public void switchInputMethod(final String id) {
        throw new RuntimeException("Stub!");
    }
    
    public final void switchInputMethod(final String id, final InputMethodSubtype subtype) {
        throw new RuntimeException("Stub!");
    }
    
    public void setExtractView(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCandidatesView(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInputView(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public View onCreateExtractTextView() {
        throw new RuntimeException("Stub!");
    }
    
    public View onCreateCandidatesView() {
        throw new RuntimeException("Stub!");
    }
    
    public View onCreateInputView() {
        throw new RuntimeException("Stub!");
    }
    
    public void onStartInputView(final EditorInfo editorInfo, final boolean restarting) {
        throw new RuntimeException("Stub!");
    }
    
    public void onFinishInputView(final boolean finishingInput) {
        throw new RuntimeException("Stub!");
    }
    
    public void onStartCandidatesView(final EditorInfo editorInfo, final boolean restarting) {
        throw new RuntimeException("Stub!");
    }
    
    public void onFinishCandidatesView(final boolean finishingInput) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPrepareStylusHandwriting() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onStartStylusHandwriting() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onStartConnectionlessStylusHandwriting(final int inputType, @Nullable final CursorAnchorInfo cursorAnchorInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public void onStylusHandwritingMotionEvent(@NonNull final MotionEvent motionEvent) {
        throw new RuntimeException("Stub!");
    }
    
    public void onFinishStylusHandwriting() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final Window getStylusHandwritingWindow() {
        throw new RuntimeException("Stub!");
    }
    
    public final void finishStylusHandwriting() {
        throw new RuntimeException("Stub!");
    }
    
    public final void finishConnectionlessStylusHandwriting(@Nullable final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setStylusHandwritingSessionTimeout(@NonNull final Duration duration) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static final Duration getStylusHandwritingIdleTimeoutMax() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final Duration getStylusHandwritingSessionTimeout() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onShowInputRequested(final int flags, final boolean configChange) {
        throw new RuntimeException("Stub!");
    }
    
    public void showWindow(final boolean showInput) {
        throw new RuntimeException("Stub!");
    }
    
    public void hideWindow() {
        throw new RuntimeException("Stub!");
    }
    
    public void onWindowShown() {
        throw new RuntimeException("Stub!");
    }
    
    public void onWindowHidden() {
        throw new RuntimeException("Stub!");
    }
    
    public void onBindInput() {
        throw new RuntimeException("Stub!");
    }
    
    public void onUnbindInput() {
        throw new RuntimeException("Stub!");
    }
    
    public void onStartInput(final EditorInfo attribute, final boolean restarting) {
        throw new RuntimeException("Stub!");
    }
    
    public void onFinishInput() {
        throw new RuntimeException("Stub!");
    }
    
    public void onDisplayCompletions(final CompletionInfo[] completions) {
        throw new RuntimeException("Stub!");
    }
    
    public void onUpdateExtractedText(final int token, final ExtractedText text) {
        throw new RuntimeException("Stub!");
    }
    
    public void onUpdateSelection(final int oldSelStart, final int oldSelEnd, final int newSelStart, final int newSelEnd, final int candidatesStart, final int candidatesEnd) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onViewClicked(final boolean focusChanged) {
        throw new RuntimeException("Stub!");
    }
    
    public void onUpdateEditorToolType(final int toolType) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onUpdateCursor(final Rect newCursor) {
        throw new RuntimeException("Stub!");
    }
    
    public void onUpdateCursorAnchorInfo(final CursorAnchorInfo cursorAnchorInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestHideSelf(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public final void requestShowSelf(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyLongPress(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyMultiple(final int keyCode, final int count, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onTrackballEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onGenericMotionEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void onAppPrivateCommand(final String action, final Bundle data) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendDownUpKeyEvents(final int keyEventCode) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean sendDefaultEditorAction(final boolean fromEnterKey) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendKeyChar(final char charCode) {
        throw new RuntimeException("Stub!");
    }
    
    public void onExtractedSelectionChanged(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public void onExtractedTextClicked() {
        throw new RuntimeException("Stub!");
    }
    
    public void onExtractedCursorMovement(final int dx, final int dy) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onExtractTextContextMenuItem(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getTextForImeAction(final int imeOptions) {
        throw new RuntimeException("Stub!");
    }
    
    public void onUpdateExtractingVisibility(final EditorInfo ei) {
        throw new RuntimeException("Stub!");
    }
    
    public void onUpdateExtractingViews(final EditorInfo ei) {
        throw new RuntimeException("Stub!");
    }
    
    public void onExtractingInputChanged(final EditorInfo ei) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onCurrentInputMethodSubtypeChanged(final InputMethodSubtype newSubtype) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getInputMethodWindowRecommendedHeight() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dump(final FileDescriptor fd, final PrintWriter fout, final String[] args) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object getSystemService(@RecentlyNonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public class InputMethodImpl extends AbstractInputMethodImpl
    {
        public InputMethodImpl() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void attachToken(final IBinder token) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void bindInput(final InputBinding binding) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void unbindInput() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void startInput(final InputConnection ic, final EditorInfo editorInfo) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void restartInput(final InputConnection ic, final EditorInfo editorInfo) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void hideSoftInput(final int flags, final ResultReceiver resultReceiver) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void showSoftInput(final int flags, final ResultReceiver resultReceiver) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void changeInputMethodSubtype(final InputMethodSubtype subtype) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public class InputMethodSessionImpl extends AbstractInputMethodSessionImpl
    {
        public InputMethodSessionImpl() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void finishInput() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void displayCompletions(final CompletionInfo[] completions) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void updateExtractedText(final int token, final ExtractedText text) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void updateSelection(final int oldSelStart, final int oldSelEnd, final int newSelStart, final int newSelEnd, final int candidatesStart, final int candidatesEnd) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void viewClicked(final boolean focusChanged) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void updateCursor(final Rect newCursor) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void appPrivateCommand(final String action, final Bundle data) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public void toggleSoftInput(final int showFlags, final int hideFlags) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void updateCursorAnchorInfo(final CursorAnchorInfo info) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Insets
    {
        public static final int TOUCHABLE_INSETS_CONTENT = 1;
        public static final int TOUCHABLE_INSETS_FRAME = 0;
        public static final int TOUCHABLE_INSETS_REGION = 3;
        public static final int TOUCHABLE_INSETS_VISIBLE = 2;
        public int contentTopInsets;
        public int touchableInsets;
        public final Region touchableRegion;
        public int visibleTopInsets;
        
        public Insets() {
            this.touchableRegion = null;
            throw new RuntimeException("Stub!");
        }
    }
}
