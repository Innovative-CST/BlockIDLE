package android.media;

import java.nio.ByteBuffer;

public final class MediaDescrambler implements AutoCloseable
{
    public static final byte SCRAMBLE_CONTROL_EVEN_KEY = 2;
    public static final byte SCRAMBLE_CONTROL_ODD_KEY = 3;
    public static final byte SCRAMBLE_CONTROL_RESERVED = 1;
    public static final byte SCRAMBLE_CONTROL_UNSCRAMBLED = 0;
    public static final byte SCRAMBLE_FLAG_PES_HEADER = 1;
    
    public MediaDescrambler(final int CA_system_id) throws MediaCasException.UnsupportedCasException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean requiresSecureDecoderComponent(@NonNull final String mime) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMediaCasSession(@NonNull final MediaCas.Session session) {
        throw new RuntimeException("Stub!");
    }
    
    public int descramble(@NonNull final ByteBuffer srcBuf, @NonNull final ByteBuffer dstBuf, @NonNull final MediaCodec.CryptoInfo cryptoInfo) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
}
