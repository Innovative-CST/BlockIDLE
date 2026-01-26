package android.app;

import android.window.OnBackInvokedDispatcher;
import android.os.Message;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.Menu;
import android.view.accessibility.AccessibilityEvent;
import android.view.WindowManager;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.view.KeyEvent;
import android.view.Window;
import android.content.DialogInterface;

public class Dialog implements DialogInterface, Window.Callback, KeyEvent.Callback, View.OnCreateContextMenuListener
{
    public Dialog(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public Dialog(@NonNull final Context context, final int themeResId) {
        throw new RuntimeException("Stub!");
    }
    
    protected Dialog(@NonNull final Context context, final boolean cancelable, @Nullable final OnCancelListener cancelListener) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final Context getContext() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ActionBar getActionBar() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setOwnerActivity(@NonNull final Activity activity) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final Activity getOwnerActivity() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isShowing() {
        throw new RuntimeException("Stub!");
    }
    
    public void create() {
        throw new RuntimeException("Stub!");
    }
    
    public void show() {
        throw new RuntimeException("Stub!");
    }
    
    public void hide() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void dismiss() {
        throw new RuntimeException("Stub!");
    }
    
    protected void onCreate(final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onStart() {
        throw new RuntimeException("Stub!");
    }
    
    protected void onStop() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle onSaveInstanceState() {
        throw new RuntimeException("Stub!");
    }
    
    public void onRestoreInstanceState(@NonNull final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Window getWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public View getCurrentFocus() {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends View> T findViewById(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final <T extends View> T requireViewById(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    public void setContentView(final int layoutResID) {
        throw new RuntimeException("Stub!");
    }
    
    public void setContentView(@NonNull final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void setContentView(@NonNull final View view, @Nullable final ViewGroup.LayoutParams params) {
        throw new RuntimeException("Stub!");
    }
    
    public void addContentView(@NonNull final View view, @Nullable final ViewGroup.LayoutParams params) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTitle(@Nullable final CharSequence title) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTitle(final int titleId) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyDown(final int keyCode, @NonNull final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyLongPress(final int keyCode, @NonNull final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyUp(final int keyCode, @NonNull final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyMultiple(final int keyCode, final int repeatCount, @NonNull final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onBackPressed() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onKeyShortcut(final int keyCode, @NonNull final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onTouchEvent(@NonNull final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onTrackballEvent(@NonNull final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onGenericMotionEvent(@NonNull final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onWindowAttributesChanged(final WindowManager.LayoutParams params) {
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
    public boolean dispatchKeyEvent(@NonNull final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchKeyShortcutEvent(@NonNull final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchTouchEvent(@NonNull final MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchTrackballEvent(@NonNull final MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchGenericMotionEvent(@NonNull final MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchPopulateAccessibilityEvent(@NonNull final AccessibilityEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public View onCreatePanelView(final int featureId) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onCreatePanelMenu(final int featureId, @NonNull final Menu menu) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onPreparePanel(final int featureId, @Nullable final View view, @NonNull final Menu menu) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onMenuOpened(final int featureId, @NonNull final Menu menu) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onMenuItemSelected(final int featureId, @NonNull final MenuItem item) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onPanelClosed(final int featureId, @NonNull final Menu menu) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onCreateOptionsMenu(@NonNull final Menu menu) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onPrepareOptionsMenu(@NonNull final Menu menu) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onOptionsItemSelected(@NonNull final MenuItem item) {
        throw new RuntimeException("Stub!");
    }
    
    public void onOptionsMenuClosed(@NonNull final Menu menu) {
        throw new RuntimeException("Stub!");
    }
    
    public void openOptionsMenu() {
        throw new RuntimeException("Stub!");
    }
    
    public void closeOptionsMenu() {
        throw new RuntimeException("Stub!");
    }
    
    public void invalidateOptionsMenu() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onCreateContextMenu(final ContextMenu menu, final View v, final ContextMenu.ContextMenuInfo menuInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerForContextMenu(@NonNull final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterForContextMenu(@NonNull final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void openContextMenu(@NonNull final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onContextItemSelected(@NonNull final MenuItem item) {
        throw new RuntimeException("Stub!");
    }
    
    public void onContextMenuClosed(@NonNull final Menu menu) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onSearchRequested(@NonNull final SearchEvent searchEvent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onSearchRequested() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final SearchEvent getSearchEvent() {
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
    
    public void takeKeyEvents(final boolean get) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean requestWindowFeature(final int featureId) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setFeatureDrawableResource(final int featureId, final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setFeatureDrawableUri(final int featureId, @Nullable final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setFeatureDrawable(final int featureId, @Nullable final Drawable drawable) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setFeatureDrawableAlpha(final int featureId, final int alpha) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LayoutInflater getLayoutInflater() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCancelable(final boolean flag) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCanceledOnTouchOutside(final boolean cancel) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void cancel() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnCancelListener(@Nullable final OnCancelListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCancelMessage(@Nullable final Message msg) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnDismissListener(@Nullable final OnDismissListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnShowListener(@Nullable final OnShowListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDismissMessage(@Nullable final Message msg) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setVolumeControlStream(final int streamType) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getVolumeControlStream() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnKeyListener(@Nullable final DialogInterface.OnKeyListener onKeyListener) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public OnBackInvokedDispatcher getOnBackInvokedDispatcher() {
        throw new RuntimeException("Stub!");
    }
}
