package dalvik.system;

import java.io.File;

public class DexClassLoader extends BaseDexClassLoader
{
    public DexClassLoader(final String dexPath, final String optimizedDirectory, final String librarySearchPath, final ClassLoader parent) {
        super(null, null, null, null);
        throw new RuntimeException("Stub!");
    }
}
