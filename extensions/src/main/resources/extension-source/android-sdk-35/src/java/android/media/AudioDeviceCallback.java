package android.media;

public abstract class AudioDeviceCallback
{
    public AudioDeviceCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public void onAudioDevicesAdded(final AudioDeviceInfo[] addedDevices) {
        throw new RuntimeException("Stub!");
    }
    
    public void onAudioDevicesRemoved(final AudioDeviceInfo[] removedDevices) {
        throw new RuntimeException("Stub!");
    }
}
