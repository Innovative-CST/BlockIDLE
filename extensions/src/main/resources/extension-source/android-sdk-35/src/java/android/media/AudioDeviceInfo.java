package android.media;

import java.util.List;

public final class AudioDeviceInfo
{
    public static final int TYPE_AUX_LINE = 19;
    public static final int TYPE_BLE_BROADCAST = 30;
    public static final int TYPE_BLE_HEADSET = 26;
    public static final int TYPE_BLE_SPEAKER = 27;
    public static final int TYPE_BLUETOOTH_A2DP = 8;
    public static final int TYPE_BLUETOOTH_SCO = 7;
    public static final int TYPE_BUILTIN_EARPIECE = 1;
    public static final int TYPE_BUILTIN_MIC = 15;
    public static final int TYPE_BUILTIN_SPEAKER = 2;
    public static final int TYPE_BUILTIN_SPEAKER_SAFE = 24;
    public static final int TYPE_BUS = 21;
    public static final int TYPE_DOCK = 13;
    public static final int TYPE_DOCK_ANALOG = 31;
    public static final int TYPE_FM = 14;
    public static final int TYPE_FM_TUNER = 16;
    public static final int TYPE_HDMI = 9;
    public static final int TYPE_HDMI_ARC = 10;
    public static final int TYPE_HDMI_EARC = 29;
    public static final int TYPE_HEARING_AID = 23;
    public static final int TYPE_IP = 20;
    public static final int TYPE_LINE_ANALOG = 5;
    public static final int TYPE_LINE_DIGITAL = 6;
    public static final int TYPE_REMOTE_SUBMIX = 25;
    public static final int TYPE_TELEPHONY = 18;
    public static final int TYPE_TV_TUNER = 17;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_USB_ACCESSORY = 12;
    public static final int TYPE_USB_DEVICE = 11;
    public static final int TYPE_USB_HEADSET = 22;
    public static final int TYPE_WIRED_HEADPHONES = 4;
    public static final int TYPE_WIRED_HEADSET = 3;
    
    AudioDeviceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    public int getId() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getProductName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSource() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSink() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getSampleRates() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getChannelMasks() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getChannelIndexMasks() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getChannelCounts() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getEncodings() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AudioProfile> getAudioProfiles() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AudioDescriptor> getAudioDescriptors() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getEncapsulationModes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getEncapsulationMetadataTypes() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
}
