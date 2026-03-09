package android.media;

import android.os.Bundle;
import java.util.concurrent.Executor;

public class LoudnessCodecController implements AutoCloseable
{
    LoudnessCodecController() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static LoudnessCodecController create(final int sessionId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static LoudnessCodecController create(final int sessionId, @NonNull final Executor executor, @NonNull final OnLoudnessCodecUpdateListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean addMediaCodec(@NonNull final MediaCodec mediaCodec) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeMediaCodec(@NonNull final MediaCodec mediaCodec) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getLoudnessCodecParams(@NonNull final MediaCodec mediaCodec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnLoudnessCodecUpdateListener
    {
        @NonNull
        default Bundle onLoudnessCodecUpdate(@NonNull final MediaCodec mediaCodec, @NonNull final Bundle codecValues) {
            throw new RuntimeException("Stub!");
        }
    }
}
