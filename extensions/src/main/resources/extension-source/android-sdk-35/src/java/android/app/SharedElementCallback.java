package android.app;

import android.content.Context;
import android.os.Parcelable;
import android.graphics.RectF;
import android.graphics.Matrix;
import java.util.Map;
import android.view.View;
import java.util.List;

public abstract class SharedElementCallback
{
    public SharedElementCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public void onSharedElementStart(final List<String> sharedElementNames, final List<View> sharedElements, final List<View> sharedElementSnapshots) {
        throw new RuntimeException("Stub!");
    }
    
    public void onSharedElementEnd(final List<String> sharedElementNames, final List<View> sharedElements, final List<View> sharedElementSnapshots) {
        throw new RuntimeException("Stub!");
    }
    
    public void onRejectSharedElements(final List<View> rejectedSharedElements) {
        throw new RuntimeException("Stub!");
    }
    
    public void onMapSharedElements(final List<String> names, final Map<String, View> sharedElements) {
        throw new RuntimeException("Stub!");
    }
    
    public Parcelable onCaptureSharedElementSnapshot(final View sharedElement, final Matrix viewToGlobalMatrix, final RectF screenBounds) {
        throw new RuntimeException("Stub!");
    }
    
    public View onCreateSnapshotView(final Context context, final Parcelable snapshot) {
        throw new RuntimeException("Stub!");
    }
    
    public void onSharedElementsArrived(final List<String> sharedElementNames, final List<View> sharedElements, final OnSharedElementsReadyListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnSharedElementsReadyListener
    {
        void onSharedElementsReady();
    }
}
