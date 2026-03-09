package android.accessibilityservice;

import java.io.IOException;
import android.hardware.usb.UsbDevice;
import java.util.concurrent.Executor;
import android.bluetooth.BluetoothDevice;

public interface BrailleDisplayController
{
    void connect(@NonNull final BluetoothDevice p0, @NonNull final BrailleDisplayCallback p1);
    
    void connect(@NonNull final BluetoothDevice p0, @NonNull final Executor p1, @NonNull final BrailleDisplayCallback p2);
    
    void connect(@NonNull final UsbDevice p0, @NonNull final BrailleDisplayCallback p1);
    
    void connect(@NonNull final UsbDevice p0, @NonNull final Executor p1, @NonNull final BrailleDisplayCallback p2);
    
    boolean isConnected();
    
    void write(@NonNull final byte[] p0) throws IOException;
    
    void disconnect();
    
    public interface BrailleDisplayCallback
    {
        public static final int FLAG_ERROR_BRAILLE_DISPLAY_NOT_FOUND = 2;
        public static final int FLAG_ERROR_CANNOT_ACCESS = 1;
        
        void onConnected(@NonNull final byte[] p0);
        
        void onConnectionFailed(final int p0);
        
        void onInput(@NonNull final byte[] p0);
        
        void onDisconnected();
    }
}
