package android.app;

import android.os.ParcelFileDescriptor;
import android.os.UserHandle;
import android.view.WindowAnimationFrameStats;
import android.view.WindowContentFrameStats;
import android.view.Window;
import android.graphics.Bitmap;
import java.util.concurrent.TimeoutException;
import android.view.accessibility.AccessibilityEvent;
import android.view.InputEvent;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityWindowInfo;
import java.util.List;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityNodeInfo;

public final class UiAutomation
{
    public static final int FLAG_DONT_SUPPRESS_ACCESSIBILITY_SERVICES = 1;
    public static final int FLAG_DONT_USE_ACCESSIBILITY = 2;
    public static final int ROTATION_FREEZE_0 = 0;
    public static final int ROTATION_FREEZE_180 = 2;
    public static final int ROTATION_FREEZE_270 = 3;
    public static final int ROTATION_FREEZE_90 = 1;
    public static final int ROTATION_FREEZE_CURRENT = -1;
    public static final int ROTATION_UNFREEZE = -2;
    
    UiAutomation() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnAccessibilityEventListener(final OnAccessibilityEventListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean clearCache() {
        throw new RuntimeException("Stub!");
    }
    
    public void adoptShellPermissionIdentity() {
        throw new RuntimeException("Stub!");
    }
    
    public void adoptShellPermissionIdentity(@Nullable final String... permissions) {
        throw new RuntimeException("Stub!");
    }
    
    public void dropShellPermissionIdentity() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean performGlobalAction(final int action) {
        throw new RuntimeException("Stub!");
    }
    
    public AccessibilityNodeInfo findFocus(final int focus) {
        throw new RuntimeException("Stub!");
    }
    
    public AccessibilityServiceInfo getServiceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public void setServiceInfo(final AccessibilityServiceInfo info) {
        throw new RuntimeException("Stub!");
    }
    
    public List<AccessibilityWindowInfo> getWindows() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SparseArray<List<AccessibilityWindowInfo>> getWindowsOnAllDisplays() {
        throw new RuntimeException("Stub!");
    }
    
    public AccessibilityNodeInfo getRootInActiveWindow() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean injectInputEvent(final InputEvent event, final boolean sync) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAnimationScale(final float scale) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setRotation(final int rotation) {
        throw new RuntimeException("Stub!");
    }
    
    public AccessibilityEvent executeAndWaitForEvent(final Runnable command, final AccessibilityEventFilter filter, final long timeoutMillis) throws TimeoutException {
        throw new RuntimeException("Stub!");
    }
    
    public void waitForIdle(final long idleTimeoutMillis, final long globalTimeoutMillis) throws TimeoutException {
        throw new RuntimeException("Stub!");
    }
    
    public Bitmap takeScreenshot() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bitmap takeScreenshot(@NonNull final Window window) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRunAsMonkey(final boolean enable) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean clearWindowContentFrameStats(final int windowId) {
        throw new RuntimeException("Stub!");
    }
    
    public WindowContentFrameStats getWindowContentFrameStats(final int windowId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void clearWindowAnimationFrameStats() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public WindowAnimationFrameStats getWindowAnimationFrameStats() {
        throw new RuntimeException("Stub!");
    }
    
    public void grantRuntimePermission(final String packageName, final String permission) {
        throw new RuntimeException("Stub!");
    }
    
    public void grantRuntimePermissionAsUser(final String packageName, final String permission, final UserHandle userHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public void revokeRuntimePermission(final String packageName, final String permission) {
        throw new RuntimeException("Stub!");
    }
    
    public void revokeRuntimePermissionAsUser(final String packageName, final String permission, final UserHandle userHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public ParcelFileDescriptor executeShellCommand(final String command) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ParcelFileDescriptor[] executeShellCommandRw(@NonNull final String command) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ParcelFileDescriptor[] executeShellCommandRwe(@NonNull final String command) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnAccessibilityEventListener
    {
        void onAccessibilityEvent(final AccessibilityEvent p0);
    }
    
    public interface AccessibilityEventFilter
    {
        boolean accept(final AccessibilityEvent p0);
    }
}
