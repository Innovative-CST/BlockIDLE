package android.os;

import java.util.List;
import java.io.File;

public abstract class FileObserver
{
    public static final int ACCESS = 1;
    public static final int ALL_EVENTS = 4095;
    public static final int ATTRIB = 4;
    public static final int CLOSE_NOWRITE = 16;
    public static final int CLOSE_WRITE = 8;
    public static final int CREATE = 256;
    public static final int DELETE = 512;
    public static final int DELETE_SELF = 1024;
    public static final int MODIFY = 2;
    public static final int MOVED_FROM = 64;
    public static final int MOVED_TO = 128;
    public static final int MOVE_SELF = 2048;
    public static final int OPEN = 32;
    
    @Deprecated
    public FileObserver(final String path) {
        throw new RuntimeException("Stub!");
    }
    
    public FileObserver(@NonNull final File file) {
        throw new RuntimeException("Stub!");
    }
    
    public FileObserver(@NonNull final List<File> files) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public FileObserver(final String path, final int mask) {
        throw new RuntimeException("Stub!");
    }
    
    public FileObserver(@NonNull final File file, final int mask) {
        throw new RuntimeException("Stub!");
    }
    
    public FileObserver(@NonNull final List<File> files, final int mask) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    public void startWatching() {
        throw new RuntimeException("Stub!");
    }
    
    public void stopWatching() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onEvent(final int p0, @Nullable final String p1);
}
