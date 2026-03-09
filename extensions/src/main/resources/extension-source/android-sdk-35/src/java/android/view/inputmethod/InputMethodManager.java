package android.view.inputmethod;

import java.util.Map;
import android.view.KeyEvent;
import android.os.Bundle;
import java.util.function.Consumer;
import java.util.concurrent.Executor;
import android.os.ResultReceiver;
import android.view.View;
import android.os.IBinder;
import java.util.List;

public final class InputMethodManager
{
    public static final int HANDWRITING_DELEGATE_FLAG_HOME_DELEGATOR_ALLOWED = 1;
    public static final int HIDE_IMPLICIT_ONLY = 1;
    public static final int HIDE_NOT_ALWAYS = 2;
    public static final int RESULT_HIDDEN = 3;
    public static final int RESULT_SHOWN = 2;
    public static final int RESULT_UNCHANGED_HIDDEN = 1;
    public static final int RESULT_UNCHANGED_SHOWN = 0;
    @Deprecated
    public static final int SHOW_FORCED = 2;
    public static final int SHOW_IMPLICIT = 1;
    
    InputMethodManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<InputMethodInfo> getInputMethodList() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isStylusHandwritingAvailable() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isConnectionlessStylusHandwritingAvailable() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public InputMethodInfo getCurrentInputMethodInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<InputMethodInfo> getEnabledInputMethodList() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<InputMethodSubtype> getEnabledInputMethodSubtypeList(@Nullable final InputMethodInfo imi, final boolean allowsImplicitlyEnabledSubtypes) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void showStatusIcon(final IBinder imeToken, final String packageName, final int iconId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void hideStatusIcon(final IBinder imeToken) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFullscreenMode() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isActive(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isActive() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAcceptingText() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInputMethodSuppressingSpellChecker() {
        throw new RuntimeException("Stub!");
    }
    
    public void displayCompletions(final View view, final CompletionInfo[] completions) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateExtractedText(final View view, final int token, final ExtractedText text) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean showSoftInput(final View view, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean showSoftInput(final View view, final int flags, final ResultReceiver resultReceiver) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hideSoftInputFromWindow(final IBinder windowToken, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hideSoftInputFromWindow(final IBinder windowToken, final int flags, final ResultReceiver resultReceiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void startStylusHandwriting(@NonNull final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void startConnectionlessStylusHandwriting(@NonNull final View view, @Nullable final CursorAnchorInfo cursorAnchorInfo, @NonNull final Executor callbackExecutor, @NonNull final ConnectionlessHandwritingCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void startConnectionlessStylusHandwritingForDelegation(@NonNull final View delegatorView, @Nullable final CursorAnchorInfo cursorAnchorInfo, @NonNull final Executor callbackExecutor, @NonNull final ConnectionlessHandwritingCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void startConnectionlessStylusHandwritingForDelegation(@NonNull final View delegatorView, @Nullable final CursorAnchorInfo cursorAnchorInfo, @NonNull final String delegatePackageName, @NonNull final Executor callbackExecutor, @NonNull final ConnectionlessHandwritingCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void prepareStylusHandwritingDelegation(@NonNull final View delegatorView) {
        throw new RuntimeException("Stub!");
    }
    
    public void prepareStylusHandwritingDelegation(@NonNull final View delegatorView, @NonNull final String delegatePackageName) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean acceptStylusHandwritingDelegation(@NonNull final View delegateView) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean acceptStylusHandwritingDelegation(@NonNull final View delegateView, @NonNull final String delegatorPackageName) {
        throw new RuntimeException("Stub!");
    }
    
    public void acceptStylusHandwritingDelegation(@NonNull final View delegateView, @NonNull final String delegatorPackageName, @NonNull final Executor executor, @NonNull final Consumer<Boolean> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void acceptStylusHandwritingDelegation(@NonNull final View delegateView, @NonNull final String delegatorPackageName, final int flags, @NonNull final Executor executor, @NonNull final Consumer<Boolean> callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void toggleSoftInputFromWindow(final IBinder windowToken, final int showFlags, final int hideFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void toggleSoftInput(final int showFlags, final int hideFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public void restartInput(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void invalidateInput(@NonNull final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateSelection(final View view, final int selStart, final int selEnd, final int candidatesStart, final int candidatesEnd) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void viewClicked(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isWatchingCursor(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void updateCursor(final View view, final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateCursorAnchorInfo(final View view, final CursorAnchorInfo cursorAnchorInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendAppPrivateCommand(final View view, final String action, final Bundle data) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setInputMethod(final IBinder token, final String id) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setInputMethodAndSubtype(@NonNull final IBinder token, final String id, final InputMethodSubtype subtype) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void hideSoftInputFromInputMethod(final IBinder token, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void showSoftInputFromInputMethod(final IBinder token, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchKeyEventFromInputMethod(@Nullable final View targetView, @NonNull final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void showInputMethodPicker() {
        throw new RuntimeException("Stub!");
    }
    
    public void showInputMethodAndSubtypeEnabler(@Nullable final String imiId) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public InputMethodSubtype getCurrentInputMethodSubtype() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean setCurrentInputMethodSubtype(final InputMethodSubtype subtype) {
        throw new RuntimeException("Stub!");
    }
    
    public Map<InputMethodInfo, List<InputMethodSubtype>> getShortcutInputMethodsAndSubtypes() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean switchToLastInputMethod(final IBinder imeToken) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean switchToNextInputMethod(final IBinder imeToken, final boolean onlyCurrentIme) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean shouldOfferSwitchingToNextInputMethod(final IBinder imeToken) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setAdditionalInputMethodSubtypes(@NonNull final String imiId, @NonNull final InputMethodSubtype[] subtypes) {
        throw new RuntimeException("Stub!");
    }
    
    public void setExplicitlyEnabledInputMethodSubtypes(@NonNull final String imiId, @NonNull final int[] subtypeHashCodes) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public InputMethodSubtype getLastInputMethodSubtype() {
        throw new RuntimeException("Stub!");
    }
}
