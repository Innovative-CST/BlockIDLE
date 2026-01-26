package android.content.res;

import java.io.IOException;
import java.io.InputStream;

public final class AssetManager implements AutoCloseable
{
    public static final int ACCESS_BUFFER = 3;
    public static final int ACCESS_RANDOM = 1;
    public static final int ACCESS_STREAMING = 2;
    public static final int ACCESS_UNKNOWN = 0;
    
    AssetManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public InputStream open(@NonNull final String fileName) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public InputStream open(@NonNull final String fileName, final int accessMode) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AssetFileDescriptor openFd(@NonNull final String fileName) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String[] list(@NonNull final String path) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AssetFileDescriptor openNonAssetFd(@NonNull final String fileName) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AssetFileDescriptor openNonAssetFd(final int cookie, @NonNull final String fileName) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public XmlResourceParser openXmlResourceParser(@NonNull final String fileName) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public XmlResourceParser openXmlResourceParser(final int cookie, @NonNull final String fileName) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getLocales() {
        throw new RuntimeException("Stub!");
    }
    
    public final class AssetInputStream extends InputStream
    {
        AssetInputStream() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int read() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int read(@RecentlyNonNull final byte[] b) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int read(@RecentlyNonNull final byte[] b, final int off, final int len) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public long skip(final long n) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int available() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean markSupported() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void mark(final int readlimit) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void reset() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void close() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        protected void finalize() throws Throwable {
            throw new RuntimeException("Stub!");
        }
    }
}
