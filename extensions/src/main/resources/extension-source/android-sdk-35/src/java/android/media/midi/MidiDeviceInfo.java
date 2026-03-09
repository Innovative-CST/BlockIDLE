package android.media.midi;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable;

public final class MidiDeviceInfo implements Parcelable
{
    @NonNull
    public static final Creator<MidiDeviceInfo> CREATOR;
    public static final String PROPERTY_BLUETOOTH_DEVICE = "bluetooth_device";
    public static final String PROPERTY_MANUFACTURER = "manufacturer";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_PRODUCT = "product";
    public static final String PROPERTY_SERIAL_NUMBER = "serial_number";
    public static final String PROPERTY_USB_DEVICE = "usb_device";
    public static final String PROPERTY_VERSION = "version";
    public static final int PROTOCOL_UMP_MIDI_1_0_UP_TO_128_BITS = 3;
    public static final int PROTOCOL_UMP_MIDI_1_0_UP_TO_128_BITS_AND_JRTS = 4;
    public static final int PROTOCOL_UMP_MIDI_1_0_UP_TO_64_BITS = 1;
    public static final int PROTOCOL_UMP_MIDI_1_0_UP_TO_64_BITS_AND_JRTS = 2;
    public static final int PROTOCOL_UMP_MIDI_2_0 = 17;
    public static final int PROTOCOL_UMP_MIDI_2_0_AND_JRTS = 18;
    public static final int PROTOCOL_UMP_USE_MIDI_CI = 0;
    public static final int PROTOCOL_UNKNOWN = -1;
    public static final int TYPE_BLUETOOTH = 3;
    public static final int TYPE_USB = 1;
    public static final int TYPE_VIRTUAL = 2;
    
    MidiDeviceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getInputPortCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getOutputPortCount() {
        throw new RuntimeException("Stub!");
    }
    
    public PortInfo[] getPorts() {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle getProperties() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPrivate() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDefaultProtocol() {
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
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class PortInfo
    {
        public static final int TYPE_INPUT = 1;
        public static final int TYPE_OUTPUT = 2;
        
        PortInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public int getType() {
            throw new RuntimeException("Stub!");
        }
        
        public int getPortNumber() {
            throw new RuntimeException("Stub!");
        }
        
        public String getName() {
            throw new RuntimeException("Stub!");
        }
    }
}
