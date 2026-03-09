package android.webkit;

public abstract class ServiceWorkerWebSettings
{
    public ServiceWorkerWebSettings() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setCacheMode(final int p0);
    
    public abstract int getCacheMode();
    
    public abstract void setAllowContentAccess(final boolean p0);
    
    public abstract boolean getAllowContentAccess();
    
    public abstract void setAllowFileAccess(final boolean p0);
    
    public abstract boolean getAllowFileAccess();
    
    public abstract void setBlockNetworkLoads(final boolean p0);
    
    public abstract boolean getBlockNetworkLoads();
}
