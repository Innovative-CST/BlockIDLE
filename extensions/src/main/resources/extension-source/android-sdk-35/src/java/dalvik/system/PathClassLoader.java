package dalvik.system;

import java.io.File;

public class PathClassLoader extends BaseDexClassLoader
{
    public PathClassLoader(final String dexPath, final ClassLoader parent) {
        super(null, null, null, null);
        throw new RuntimeException("Stub!");
    }
    
    public PathClassLoader(final String dexPath, final String librarySearchPath, final ClassLoader parent) {
        super(null, null, null, null);
        throw new RuntimeException("Stub!");
    }
}
