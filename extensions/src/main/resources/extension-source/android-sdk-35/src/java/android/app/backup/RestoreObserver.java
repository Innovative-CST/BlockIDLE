package android.app.backup;

public abstract class RestoreObserver
{
    public RestoreObserver() {
        throw new RuntimeException("Stub!");
    }
    
    public void restoreStarting(final int numPackages) {
        throw new RuntimeException("Stub!");
    }
    
    public void onUpdate(final int nowBeingRestored, final String currentPackage) {
        throw new RuntimeException("Stub!");
    }
    
    public void restoreFinished(final int error) {
        throw new RuntimeException("Stub!");
    }
}
