package dalvik.system;

import java.io.IOException;
import java.util.Enumeration;
import java.net.URL;

public final class DelegateLastClassLoader extends PathClassLoader
{
    public DelegateLastClassLoader(final String dexPath, final ClassLoader parent) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
    
    public DelegateLastClassLoader(final String dexPath, final String librarySearchPath, final ClassLoader parent) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
    
    public DelegateLastClassLoader(@NonNull final String dexPath, @Nullable final String librarySearchPath, @Nullable final ClassLoader parent, final boolean delegateResourceLoading) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected Class<?> loadClass(final String name, final boolean resolve) throws ClassNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public URL getResource(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Enumeration<URL> getResources(final String name) throws IOException {
        throw new RuntimeException("Stub!");
    }
}
