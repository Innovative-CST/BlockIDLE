package android.media;

import java.util.UUID;

public final class MediaCrypto
{
    public MediaCrypto(@NonNull final UUID uuid, @NonNull final byte[] sessionId) throws MediaCryptoException {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isCryptoSchemeSupported(@NonNull final UUID uuid) {
        throw new RuntimeException("Stub!");
    }
    
    public native boolean requiresSecureDecoderComponent(@NonNull final String p0);
    
    public native void setMediaDrmSession(@NonNull final byte[] p0) throws MediaCryptoException;
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    public native void release();
}
