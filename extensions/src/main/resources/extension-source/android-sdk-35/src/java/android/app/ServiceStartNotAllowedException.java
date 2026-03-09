package android.app;

public abstract class ServiceStartNotAllowedException extends IllegalStateException
{
    ServiceStartNotAllowedException() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized Throwable getCause() {
        throw new RuntimeException("Stub!");
    }
}
