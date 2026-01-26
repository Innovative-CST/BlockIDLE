package android.view.accessibility;

public interface AccessibilityEventSource
{
    void sendAccessibilityEvent(final int p0);
    
    void sendAccessibilityEventUnchecked(final AccessibilityEvent p0);
}
