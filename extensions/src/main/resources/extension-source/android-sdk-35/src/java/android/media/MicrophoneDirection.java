package android.media;

public interface MicrophoneDirection
{
    public static final int MIC_DIRECTION_AWAY_FROM_USER = 2;
    public static final int MIC_DIRECTION_EXTERNAL = 3;
    public static final int MIC_DIRECTION_TOWARDS_USER = 1;
    public static final int MIC_DIRECTION_UNSPECIFIED = 0;
    
    boolean setPreferredMicrophoneDirection(final int p0);
    
    boolean setPreferredMicrophoneFieldDimension(final float p0);
}
