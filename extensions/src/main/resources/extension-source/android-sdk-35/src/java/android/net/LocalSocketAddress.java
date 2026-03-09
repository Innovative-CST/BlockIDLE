package android.net;

public class LocalSocketAddress
{
    public LocalSocketAddress(final String name, final Namespace namespace) {
        throw new RuntimeException("Stub!");
    }
    
    public LocalSocketAddress(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public Namespace getNamespace() {
        throw new RuntimeException("Stub!");
    }
    
    public enum Namespace
    {
        ABSTRACT, 
        RESERVED, 
        FILESYSTEM;
    }
}
