package androidx.appcompat.view;

import androidx.annotation.DoNotInline;
import android.view.KeyboardShortcutGroup;
import java.util.List;
import android.view.ActionMode;
import androidx.annotation.RequiresApi;
import android.view.SearchEvent;
import android.view.WindowManager;
import android.view.MenuItem;
import android.view.Menu;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.MotionEvent;
import android.view.KeyEvent;
import androidx.annotation.RestrictTo;
import android.view.Window;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class WindowCallbackWrapper implements Window.Callback
{
    final Window.Callback mWrapped;
    
    public WindowCallbackWrapper(final Window.Callback wrapped) {
        if (wrapped == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.mWrapped = wrapped;
    }
    
    public boolean dispatchKeyEvent(final KeyEvent event) {
        return this.mWrapped.dispatchKeyEvent(event);
    }
    
    public boolean dispatchKeyShortcutEvent(final KeyEvent event) {
        return this.mWrapped.dispatchKeyShortcutEvent(event);
    }
    
    public boolean dispatchTouchEvent(final MotionEvent event) {
        return this.mWrapped.dispatchTouchEvent(event);
    }
    
    public boolean dispatchTrackballEvent(final MotionEvent event) {
        return this.mWrapped.dispatchTrackballEvent(event);
    }
    
    public boolean dispatchGenericMotionEvent(final MotionEvent event) {
        return this.mWrapped.dispatchGenericMotionEvent(event);
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent event) {
        return this.mWrapped.dispatchPopulateAccessibilityEvent(event);
    }
    
    public View onCreatePanelView(final int featureId) {
        return this.mWrapped.onCreatePanelView(featureId);
    }
    
    public boolean onCreatePanelMenu(final int featureId, final Menu menu) {
        return this.mWrapped.onCreatePanelMenu(featureId, menu);
    }
    
    public boolean onPreparePanel(final int featureId, final View view, final Menu menu) {
        return this.mWrapped.onPreparePanel(featureId, view, menu);
    }
    
    public boolean onMenuOpened(final int featureId, final Menu menu) {
        return this.mWrapped.onMenuOpened(featureId, menu);
    }
    
    public boolean onMenuItemSelected(final int featureId, final MenuItem item) {
        return this.mWrapped.onMenuItemSelected(featureId, item);
    }
    
    public void onWindowAttributesChanged(final WindowManager.LayoutParams attrs) {
        this.mWrapped.onWindowAttributesChanged(attrs);
    }
    
    public void onContentChanged() {
        this.mWrapped.onContentChanged();
    }
    
    public void onWindowFocusChanged(final boolean hasFocus) {
        this.mWrapped.onWindowFocusChanged(hasFocus);
    }
    
    public void onAttachedToWindow() {
        this.mWrapped.onAttachedToWindow();
    }
    
    public void onDetachedFromWindow() {
        this.mWrapped.onDetachedFromWindow();
    }
    
    public void onPanelClosed(final int featureId, final Menu menu) {
        this.mWrapped.onPanelClosed(featureId, menu);
    }
    
    @RequiresApi(23)
    public boolean onSearchRequested(final SearchEvent searchEvent) {
        return Api23Impl.onSearchRequested(this.mWrapped, searchEvent);
    }
    
    public boolean onSearchRequested() {
        return this.mWrapped.onSearchRequested();
    }
    
    public ActionMode onWindowStartingActionMode(final ActionMode.Callback callback) {
        return this.mWrapped.onWindowStartingActionMode(callback);
    }
    
    @RequiresApi(23)
    public ActionMode onWindowStartingActionMode(final ActionMode.Callback callback, final int type) {
        return Api23Impl.onWindowStartingActionMode(this.mWrapped, callback, type);
    }
    
    public void onActionModeStarted(final ActionMode mode) {
        this.mWrapped.onActionModeStarted(mode);
    }
    
    public void onActionModeFinished(final ActionMode mode) {
        this.mWrapped.onActionModeFinished(mode);
    }
    
    @RequiresApi(24)
    public void onProvideKeyboardShortcuts(final List<KeyboardShortcutGroup> data, final Menu menu, final int deviceId) {
        Api24Impl.onProvideKeyboardShortcuts(this.mWrapped, data, menu, deviceId);
    }
    
    @RequiresApi(26)
    public void onPointerCaptureChanged(final boolean hasCapture) {
        Api26Impl.onPointerCaptureChanged(this.mWrapped, hasCapture);
    }
    
    public final Window.Callback getWrapped() {
        return this.mWrapped;
    }
    
    @RequiresApi(23)
    static class Api23Impl
    {
        private Api23Impl() {
        }
        
        @DoNotInline
        static boolean onSearchRequested(final Window.Callback callback, final SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }
        
        @DoNotInline
        static ActionMode onWindowStartingActionMode(final Window.Callback windowCallback, final ActionMode.Callback actionModeCallback, final int i) {
            return windowCallback.onWindowStartingActionMode(actionModeCallback, i);
        }
    }
    
    @RequiresApi(24)
    static class Api24Impl
    {
        private Api24Impl() {
        }
        
        @DoNotInline
        static void onProvideKeyboardShortcuts(final Window.Callback callback, final List<KeyboardShortcutGroup> data, final Menu menu, final int deviceId) {
            callback.onProvideKeyboardShortcuts((List)data, menu, deviceId);
        }
    }
    
    @RequiresApi(26)
    static class Api26Impl
    {
        private Api26Impl() {
        }
        
        @DoNotInline
        static void onPointerCaptureChanged(final Window.Callback callback, final boolean hasCapture) {
            callback.onPointerCaptureChanged(hasCapture);
        }
    }
}
