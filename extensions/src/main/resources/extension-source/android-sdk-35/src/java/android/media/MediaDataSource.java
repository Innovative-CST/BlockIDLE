package android.media;

import java.io.IOException;
import java.io.Closeable;

public abstract class MediaDataSource implements Closeable
{
    public MediaDataSource() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int readAt(final long p0, final byte[] p1, final int p2, final int p3) throws IOException;
    
    public abstract long getSize() throws IOException;
}
