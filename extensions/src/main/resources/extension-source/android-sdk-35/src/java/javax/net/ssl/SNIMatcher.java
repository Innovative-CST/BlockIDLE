package javax.net.ssl;

public abstract class SNIMatcher
{
    protected SNIMatcher(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract boolean matches(final SNIServerName p0);
}
