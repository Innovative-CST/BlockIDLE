package android.view.accessibility;

import java.util.List;
import android.os.Bundle;

public abstract class AccessibilityNodeProvider
{
    public static final int HOST_VIEW_ID = -1;
    
    public AccessibilityNodeProvider() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AccessibilityNodeInfo createAccessibilityNodeInfo(final int virtualViewId) {
        throw new RuntimeException("Stub!");
    }
    
    public void addExtraDataToAccessibilityNodeInfo(final int virtualViewId, final AccessibilityNodeInfo info, final String extraDataKey, final Bundle arguments) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean performAction(final int virtualViewId, final int action, @Nullable final Bundle arguments) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(final String text, final int virtualViewId) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AccessibilityNodeInfo findFocus(final int focus) {
        throw new RuntimeException("Stub!");
    }
}
