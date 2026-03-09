package android.os.strictmode;

public abstract class Violation extends Throwable
{
    Violation() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized Throwable initCause(final Throwable cause) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setStackTrace(final StackTraceElement[] stackTrace) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized Throwable fillInStackTrace() {
        throw new RuntimeException("Stub!");
    }
}
