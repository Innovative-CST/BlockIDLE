package android.webkit;

public abstract class ServiceWorkerController
{
    @Deprecated
    public ServiceWorkerController() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ServiceWorkerController getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract ServiceWorkerWebSettings getServiceWorkerWebSettings();
    
    public abstract void setServiceWorkerClient(@Nullable final ServiceWorkerClient p0);
}
