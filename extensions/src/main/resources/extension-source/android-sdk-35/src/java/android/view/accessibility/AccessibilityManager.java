package android.view.accessibility;

import java.util.concurrent.Executor;
import android.os.Handler;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.ServiceInfo;
import java.util.List;

public final class AccessibilityManager
{
    public static final int FLAG_CONTENT_CONTROLS = 4;
    public static final int FLAG_CONTENT_ICONS = 1;
    public static final int FLAG_CONTENT_TEXT = 2;
    
    AccessibilityManager() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTouchExplorationEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void sendAccessibilityEvent(final AccessibilityEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void interrupt() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public List<ServiceInfo> getAccessibilityServiceList() {
        throw new RuntimeException("Stub!");
    }
    
    public List<AccessibilityServiceInfo> getInstalledAccessibilityServiceList() {
        throw new RuntimeException("Stub!");
    }
    
    public List<AccessibilityServiceInfo> getEnabledAccessibilityServiceList(final int feedbackTypeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean addAccessibilityStateChangeListener(@NonNull final AccessibilityStateChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void addAccessibilityStateChangeListener(@NonNull final AccessibilityStateChangeListener listener, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeAccessibilityStateChangeListener(@NonNull final AccessibilityStateChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean addTouchExplorationStateChangeListener(@NonNull final TouchExplorationStateChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void addTouchExplorationStateChangeListener(@NonNull final TouchExplorationStateChangeListener listener, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeTouchExplorationStateChangeListener(@NonNull final TouchExplorationStateChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void addAccessibilityServicesStateChangeListener(@NonNull final Executor executor, @NonNull final AccessibilityServicesStateChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void addAccessibilityServicesStateChangeListener(@NonNull final AccessibilityServicesStateChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeAccessibilityServicesStateChangeListener(@NonNull final AccessibilityServicesStateChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRequestFromAccessibilityTool() {
        throw new RuntimeException("Stub!");
    }
    
    public void addAccessibilityRequestPreparer(final AccessibilityRequestPreparer preparer) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeAccessibilityRequestPreparer(final AccessibilityRequestPreparer preparer) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRecommendedTimeoutMillis(final int originalTimeout, final int uiContentFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAccessibilityFocusStrokeWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAccessibilityFocusColor() {
        throw new RuntimeException("Stub!");
    }
    
    public void addAudioDescriptionRequestedChangeListener(@NonNull final Executor executor, @NonNull final AudioDescriptionRequestedChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeAudioDescriptionRequestedChangeListener(@NonNull final AudioDescriptionRequestedChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAudioDescriptionRequested() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isAccessibilityButtonSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public interface TouchExplorationStateChangeListener
    {
        void onTouchExplorationStateChanged(final boolean p0);
    }
    
    public interface AudioDescriptionRequestedChangeListener
    {
        void onAudioDescriptionRequestedChanged(final boolean p0);
    }
    
    public interface AccessibilityStateChangeListener
    {
        void onAccessibilityStateChanged(final boolean p0);
    }
    
    public interface AccessibilityServicesStateChangeListener
    {
        void onAccessibilityServicesStateChanged(@NonNull final AccessibilityManager p0);
    }
}
