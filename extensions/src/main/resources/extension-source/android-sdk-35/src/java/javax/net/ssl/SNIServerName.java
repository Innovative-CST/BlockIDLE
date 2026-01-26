package javax.net.ssl;

public abstract class SNIServerName
{
    protected SNIServerName(final int type, final byte[] encoded) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public final byte[] getEncoded() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
