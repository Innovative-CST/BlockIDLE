package android.media;

import android.os.PersistableBundle;
import android.media.metrics.LogSessionId;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.List;
import java.io.FileDescriptor;
import android.content.res.AssetFileDescriptor;
import java.util.Map;
import android.net.Uri;
import android.content.Context;
import java.io.IOException;

public final class MediaExtractor
{
    public static final int SAMPLE_FLAG_ENCRYPTED = 2;
    public static final int SAMPLE_FLAG_PARTIAL_FRAME = 4;
    public static final int SAMPLE_FLAG_SYNC = 1;
    public static final int SEEK_TO_CLOSEST_SYNC = 2;
    public static final int SEEK_TO_NEXT_SYNC = 1;
    public static final int SEEK_TO_PREVIOUS_SYNC = 0;
    
    public MediaExtractor() {
        throw new RuntimeException("Stub!");
    }
    
    public native void setDataSource(@NonNull final MediaDataSource p0) throws IOException;
    
    public void setDataSource(@NonNull final Context context, @NonNull final Uri uri, @Nullable final Map<String, String> headers) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSource(@NonNull final String path, @Nullable final Map<String, String> headers) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSource(@NonNull final String path) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSource(@NonNull final AssetFileDescriptor afd) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSource(@NonNull final FileDescriptor fd) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public native void setDataSource(@NonNull final FileDescriptor p0, final long p1, final long p2) throws IOException;
    
    @Deprecated
    public void setMediaCas(@NonNull final MediaCas mediaCas) {
        throw new RuntimeException("Stub!");
    }
    
    public CasInfo getCasInfo(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    public native void release();
    
    public native int getTrackCount();
    
    public DrmInitData getDrmInitData() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AudioPresentation> getAudioPresentations(final int trackIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Map<UUID, byte[]> getPsshInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public MediaFormat getTrackFormat(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public native void selectTrack(final int p0);
    
    public native void unselectTrack(final int p0);
    
    public native void seekTo(final long p0, final int p1);
    
    public native boolean advance();
    
    public native int readSampleData(@NonNull final ByteBuffer p0, final int p1);
    
    public native int getSampleTrackIndex();
    
    public native long getSampleTime();
    
    public native long getSampleSize();
    
    public native int getSampleFlags();
    
    public native boolean getSampleCryptoInfo(@NonNull final MediaCodec.CryptoInfo p0);
    
    public native long getCachedDuration();
    
    public native boolean hasCacheReachedEndOfStream();
    
    public void setLogSessionId(@NonNull final LogSessionId logSessionId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LogSessionId getLogSessionId() {
        throw new RuntimeException("Stub!");
    }
    
    public PersistableBundle getMetrics() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class CasInfo
    {
        CasInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public int getSystemId() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public byte[] getPrivateData() {
            throw new RuntimeException("Stub!");
        }
        
        public MediaCas.Session getSession() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class MetricsConstants
    {
        public static final String FORMAT = "android.media.mediaextractor.fmt";
        public static final String MIME_TYPE = "android.media.mediaextractor.mime";
        public static final String TRACKS = "android.media.mediaextractor.ntrk";
        
        MetricsConstants() {
            throw new RuntimeException("Stub!");
        }
    }
}
