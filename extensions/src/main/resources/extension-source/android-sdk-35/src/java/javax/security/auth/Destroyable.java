package javax.security.auth;

public interface Destroyable
{
    default void destroy() throws DestroyFailedException {
        throw new RuntimeException("Stub!");
    }
    
    default boolean isDestroyed() {
        throw new RuntimeException("Stub!");
    }
}
