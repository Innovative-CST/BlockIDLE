package android.media;

public final class SyncParams
{
    public static final int AUDIO_ADJUST_MODE_DEFAULT = 0;
    public static final int AUDIO_ADJUST_MODE_RESAMPLE = 2;
    public static final int AUDIO_ADJUST_MODE_STRETCH = 1;
    public static final int SYNC_SOURCE_AUDIO = 2;
    public static final int SYNC_SOURCE_DEFAULT = 0;
    public static final int SYNC_SOURCE_SYSTEM_CLOCK = 1;
    public static final int SYNC_SOURCE_VSYNC = 3;
    
    public SyncParams() {
        throw new RuntimeException("Stub!");
    }
    
    public SyncParams allowDefaults() {
        throw new RuntimeException("Stub!");
    }
    
    public SyncParams setAudioAdjustMode(final int audioAdjustMode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAudioAdjustMode() {
        throw new RuntimeException("Stub!");
    }
    
    public SyncParams setSyncSource(final int syncSource) {
        throw new RuntimeException("Stub!");
    }
    
    public int getSyncSource() {
        throw new RuntimeException("Stub!");
    }
    
    public SyncParams setTolerance(final float tolerance) {
        throw new RuntimeException("Stub!");
    }
    
    public float getTolerance() {
        throw new RuntimeException("Stub!");
    }
    
    public SyncParams setFrameRate(final float frameRate) {
        throw new RuntimeException("Stub!");
    }
    
    public float getFrameRate() {
        throw new RuntimeException("Stub!");
    }
}
