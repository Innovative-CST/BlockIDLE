package android.net.rtp;

@Deprecated
public class AudioCodec
{
    @Deprecated
    public static final AudioCodec AMR;
    @Deprecated
    public static final AudioCodec GSM;
    @Deprecated
    public static final AudioCodec GSM_EFR;
    @Deprecated
    public static final AudioCodec PCMA;
    @Deprecated
    public static final AudioCodec PCMU;
    @Deprecated
    public final String fmtp;
    @Deprecated
    public final String rtpmap;
    @Deprecated
    public final int type;
    
    AudioCodec() {
        this.fmtp = null;
        this.rtpmap = null;
        this.type = 0;
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static AudioCodec[] getCodecs() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static AudioCodec getCodec(final int type, final String rtpmap, final String fmtp) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        AMR = null;
        GSM = null;
        GSM_EFR = null;
        PCMA = null;
        PCMU = null;
    }
}
