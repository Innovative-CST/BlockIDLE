package android.bluetooth;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class BluetoothLeAudioCodecStatus implements Parcelable
{
    @NonNull
    public static final Creator<BluetoothLeAudioCodecStatus> CREATOR;
    public static final String EXTRA_LE_AUDIO_CODEC_STATUS = "android.bluetooth.extra.LE_AUDIO_CODEC_STATUS";
    
    public BluetoothLeAudioCodecStatus(@Nullable final BluetoothLeAudioCodecConfig inputCodecConfig, @Nullable final BluetoothLeAudioCodecConfig outputCodecConfig, @NonNull final List<BluetoothLeAudioCodecConfig> inputCodecsLocalCapabilities, @NonNull final List<BluetoothLeAudioCodecConfig> outputCodecsLocalCapabilities, @NonNull final List<BluetoothLeAudioCodecConfig> inputCodecsSelectableCapabilities, @NonNull final List<BluetoothLeAudioCodecConfig> outputCodecsSelectableCapabilities) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInputCodecConfigSelectable(@Nullable final BluetoothLeAudioCodecConfig codecConfig) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOutputCodecConfigSelectable(@Nullable final BluetoothLeAudioCodecConfig codecConfig) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BluetoothLeAudioCodecConfig getInputCodecConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BluetoothLeAudioCodecConfig getOutputCodecConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<BluetoothLeAudioCodecConfig> getInputCodecLocalCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<BluetoothLeAudioCodecConfig> getOutputCodecLocalCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<BluetoothLeAudioCodecConfig> getInputCodecSelectableCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<BluetoothLeAudioCodecConfig> getOutputCodecSelectableCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
