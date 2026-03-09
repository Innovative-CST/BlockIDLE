package android.media;

public abstract class VolumeProvider
{
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;
    
    public VolumeProvider(final int volumeControl, final int maxVolume, final int currentVolume) {
        throw new RuntimeException("Stub!");
    }
    
    public VolumeProvider(final int volumeControl, final int maxVolume, final int currentVolume, @Nullable final String volumeControlId) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getVolumeControl() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getMaxVolume() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getCurrentVolume() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setCurrentVolume(final int currentVolume) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final String getVolumeControlId() {
        throw new RuntimeException("Stub!");
    }
    
    public void onSetVolumeTo(final int volume) {
        throw new RuntimeException("Stub!");
    }
    
    public void onAdjustVolume(final int direction) {
        throw new RuntimeException("Stub!");
    }
}
