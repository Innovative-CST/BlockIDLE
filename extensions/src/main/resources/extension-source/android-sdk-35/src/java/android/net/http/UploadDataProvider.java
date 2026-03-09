package android.net.http;

import java.nio.ByteBuffer;
import java.io.IOException;
import java.io.Closeable;

public abstract class UploadDataProvider implements Closeable
{
    public UploadDataProvider() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract long getLength() throws IOException;
    
    public abstract void read(@NonNull final UploadDataSink p0, @NonNull final ByteBuffer p1) throws IOException;
    
    public abstract void rewind(@NonNull final UploadDataSink p0) throws IOException;
    
    @Override
    public void close() throws IOException {
        throw new RuntimeException("Stub!");
    }
}
