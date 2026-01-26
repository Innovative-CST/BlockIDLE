package dalvik.system;

import java.io.File;
import java.nio.ByteBuffer;

public final class InMemoryDexClassLoader extends BaseDexClassLoader
{
    public InMemoryDexClassLoader(@NonNull final ByteBuffer[] dexBuffers, @Nullable final String librarySearchPath, @Nullable final ClassLoader parent) {
        super(null, null, null, null);
        throw new RuntimeException("Stub!");
    }
    
    public InMemoryDexClassLoader(@NonNull final ByteBuffer[] dexBuffers, @Nullable final ClassLoader parent) {
        super(null, null, null, null);
        throw new RuntimeException("Stub!");
    }
    
    public InMemoryDexClassLoader(@NonNull final ByteBuffer dexBuffer, @Nullable final ClassLoader parent) {
        super(null, null, null, null);
        throw new RuntimeException("Stub!");
    }
}
