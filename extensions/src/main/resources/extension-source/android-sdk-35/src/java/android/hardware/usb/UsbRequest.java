package android.hardware.usb;

import java.nio.ByteBuffer;

public class UsbRequest
{
    public UsbRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean initialize(final UsbDeviceConnection connection, final UsbEndpoint endpoint) {
        throw new RuntimeException("Stub!");
    }
    
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public UsbEndpoint getEndpoint() {
        throw new RuntimeException("Stub!");
    }
    
    public Object getClientData() {
        throw new RuntimeException("Stub!");
    }
    
    public void setClientData(final Object data) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean queue(final ByteBuffer buffer, final int length) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean queue(@Nullable final ByteBuffer buffer) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean cancel() {
        throw new RuntimeException("Stub!");
    }
}
