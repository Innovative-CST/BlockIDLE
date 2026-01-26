package android.app;

import android.os.Bundle;
import android.view.Window;
import android.content.Intent;

@Deprecated
public class LocalActivityManager
{
    @Deprecated
    public LocalActivityManager(final Activity parent, final boolean singleMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Window startActivity(final String id, final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Window destroyActivity(final String id, final boolean finish) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Activity getCurrentActivity() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getCurrentId() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Activity getActivity(final String id) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchCreate(final Bundle state) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Bundle saveInstanceState() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchResume() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchPause(final boolean finishing) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchStop() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void removeAllActivities() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchDestroy(final boolean finishing) {
        throw new RuntimeException("Stub!");
    }
}
