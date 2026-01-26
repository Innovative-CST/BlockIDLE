package android.media;

import java.nio.ByteBuffer;
import java.io.FileDescriptor;
import java.io.IOException;

public final class MediaMuxer
{
    public MediaMuxer(@NonNull final String path, final int format) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public MediaMuxer(@NonNull final FileDescriptor fd, final int format) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void setOrientationHint(final int degrees) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLocation(final float latitude, final float longitude) {
        throw new RuntimeException("Stub!");
    }
    
    public void start() {
        throw new RuntimeException("Stub!");
    }
    
    public void stop() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public int addTrack(@NonNull final MediaFormat format) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeSampleData(final int trackIndex, @NonNull final ByteBuffer byteBuf, @NonNull final MediaCodec.BufferInfo bufferInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class OutputFormat
    {
        public static final int MUXER_OUTPUT_3GPP = 2;
        public static final int MUXER_OUTPUT_HEIF = 3;
        public static final int MUXER_OUTPUT_MPEG_4 = 0;
        public static final int MUXER_OUTPUT_OGG = 4;
        public static final int MUXER_OUTPUT_WEBM = 1;
        
        OutputFormat() {
            throw new RuntimeException("Stub!");
        }
    }
}
