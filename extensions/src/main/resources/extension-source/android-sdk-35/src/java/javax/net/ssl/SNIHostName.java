package javax.net.ssl;

public final class SNIHostName extends SNIServerName
{
    public SNIHostName(final String hostname) {
        super(0, null);
        throw new RuntimeException("Stub!");
    }
    
    public SNIHostName(final byte[] encoded) {
        super(0, null);
        throw new RuntimeException("Stub!");
    }
    
    public String getAsciiName() {
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
    
    public static SNIMatcher createSNIMatcher(final String regex) {
        throw new RuntimeException("Stub!");
    }
}
