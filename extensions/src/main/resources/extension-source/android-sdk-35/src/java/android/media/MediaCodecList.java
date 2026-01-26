package android.media;

public final class MediaCodecList
{
    public static final int ALL_CODECS = 1;
    public static final int REGULAR_CODECS = 0;
    
    public MediaCodecList(final int kind) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getCodecCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static MediaCodecInfo getCodecInfoAt(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public MediaCodecInfo[] getCodecInfos() {
        throw new RuntimeException("Stub!");
    }
    
    public String findDecoderForFormat(final MediaFormat format) {
        throw new RuntimeException("Stub!");
    }
    
    public String findEncoderForFormat(final MediaFormat format) {
        throw new RuntimeException("Stub!");
    }
}
