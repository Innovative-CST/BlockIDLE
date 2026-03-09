package android.bluetooth;

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Closeable;

public final class BluetoothSocket implements Closeable
{
    public static final int TYPE_L2CAP = 3;
    public static final int TYPE_RFCOMM = 1;
    public static final int TYPE_SCO = 2;
    
    BluetoothSocket() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public BluetoothDevice getRemoteDevice() {
        throw new RuntimeException("Stub!");
    }
    
    public InputStream getInputStream() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public OutputStream getOutputStream() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isConnected() {
        throw new RuntimeException("Stub!");
    }
    
    public void connect() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxTransmitPacketSize() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxReceivePacketSize() {
        throw new RuntimeException("Stub!");
    }
    
    public int getConnectionType() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
