package dalvik.system;

import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.io.IOException;
import java.io.File;

public final class DexFile
{
    @Deprecated
    public DexFile(final File file) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public DexFile(final String fileName) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static DexFile loadDex(final String sourcePathName, final String outputPathName, final int flags) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void close() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Class loadClass(final String name, final ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Enumeration<String> entries() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static native boolean isDexOptNeeded(final String p0) throws FileNotFoundException, IOException;
    
    public static final class OptimizationInfo
    {
        OptimizationInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isVerified() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isOptimized() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isFullyCompiled() {
            throw new RuntimeException("Stub!");
        }
    }
}
