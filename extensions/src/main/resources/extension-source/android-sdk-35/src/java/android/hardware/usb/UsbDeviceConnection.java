package android.hardware.usb;

import java.util.concurrent.TimeoutException;

public class UsbDeviceConnection
{
    UsbDeviceConnection() {
        throw new RuntimeException("Stub!");
    }
    
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFileDescriptor() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getRawDescriptors() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean claimInterface(final UsbInterface intf, final boolean force) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean releaseInterface(final UsbInterface intf) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setInterface(final UsbInterface intf) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setConfiguration(final UsbConfiguration configuration) {
        throw new RuntimeException("Stub!");
    }
    
    public int controlTransfer(final int requestType, final int request, final int value, final int index, @Nullable final byte[] buffer, final int length, final int timeout) {
        throw new RuntimeException("Stub!");
    }
    
    public int controlTransfer(final int requestType, final int request, final int value, final int index, @Nullable final byte[] buffer, final int offset, final int length, final int timeout) {
        throw new RuntimeException("Stub!");
    }
    
    public int bulkTransfer(final UsbEndpoint endpoint, final byte[] buffer, final int length, final int timeout) {
        throw new RuntimeException("Stub!");
    }
    
    public int bulkTransfer(final UsbEndpoint endpoint, final byte[] buffer, final int offset, final int length, final int timeout) {
        throw new RuntimeException("Stub!");
    }
    
    public UsbRequest requestWait() {
        throw new RuntimeException("Stub!");
    }
    
    public UsbRequest requestWait(final long timeout) throws TimeoutException {
        throw new RuntimeException("Stub!");
    }
    
    public String getSerial() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
}
