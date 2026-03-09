package android.service.dreams;

import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.os.IBinder;
import android.content.Intent;
import android.view.ViewGroup;
import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.WindowManager;
import android.view.MenuItem;
import android.view.Menu;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.MotionEvent;
import android.view.KeyEvent;
import android.view.Window;
import android.app.Service;

public class DreamService extends Service implements Window.Callback
{
    public static final String DREAM_META_DATA = "android.service.dream";
    public static final String SERVICE_INTERFACE = "android.service.dreams.DreamService";
    
    public DreamService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchKeyEvent(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchKeyShortcutEvent(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchTouchEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchTrackballEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchGenericMotionEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public View onCreatePanelView(final int featureId) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onCreatePanelMenu(final int featureId, final Menu menu) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onPreparePanel(final int featureId, final View view, final Menu menu) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onMenuOpened(final int featureId, final Menu menu) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onMenuItemSelected(final int featureId, final MenuItem item) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onWindowAttributesChanged(final WindowManager.LayoutParams attrs) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onContentChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onWindowFocusChanged(final boolean hasFocus) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onAttachedToWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onPanelClosed(final int featureId, final Menu menu) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onSearchRequested(final SearchEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onSearchRequested() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ActionMode onWindowStartingActionMode(final ActionMode.Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ActionMode onWindowStartingActionMode(final ActionMode.Callback callback, final int type) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onActionModeStarted(final ActionMode mode) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onActionModeFinished(final ActionMode mode) {
        throw new RuntimeException("Stub!");
    }
    
    public WindowManager getWindowManager() {
        throw new RuntimeException("Stub!");
    }
    
    public Window getWindow() {
        throw new RuntimeException("Stub!");
    }
    
    public void setContentView(final int layoutResID) {
        throw new RuntimeException("Stub!");
    }
    
    public void setContentView(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void setContentView(final View view, final ViewGroup.LayoutParams params) {
        throw new RuntimeException("Stub!");
    }
    
    public void addContentView(final View view, final ViewGroup.LayoutParams params) {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends View> T findViewById(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final <T extends View> T requireViewById(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInteractive(final boolean interactive) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInteractive() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFullscreen(final boolean fullscreen) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFullscreen() {
        throw new RuntimeException("Stub!");
    }
    
    public void setScreenBright(final boolean screenBright) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isScreenBright() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onCreate() {
        throw new RuntimeException("Stub!");
    }
    
    public void onDreamingStarted() {
        throw new RuntimeException("Stub!");
    }
    
    public void onDreamingStopped() {
        throw new RuntimeException("Stub!");
    }
    
    public void onWakeUp() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onUnbind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public final void finish() {
        throw new RuntimeException("Stub!");
    }
    
    public final void wakeUp() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onDestroy() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dump(final FileDescriptor fd, final PrintWriter pw, final String[] args) {
        throw new RuntimeException("Stub!");
    }
}
