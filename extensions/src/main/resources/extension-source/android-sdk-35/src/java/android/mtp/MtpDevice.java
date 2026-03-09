package android.mtp;

import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbDevice;

public final class MtpDevice
{
    public MtpDevice(@NonNull final UsbDevice device) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean open(@NonNull final UsbDeviceConnection connection) {
        throw new RuntimeException("Stub!");
    }
    
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getDeviceName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDeviceId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MtpDeviceInfo getDeviceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public int[] getStorageIds() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public int[] getObjectHandles(final int storageId, final int format, final int objectHandle) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getObject(final int objectHandle, final int objectSize) {
        throw new RuntimeException("Stub!");
    }
    
    public long getPartialObject(final int objectHandle, final long offset, final long size, @NonNull final byte[] buffer) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public long getPartialObject64(final int objectHandle, final long offset, final long size, @NonNull final byte[] buffer) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getThumbnail(final int objectHandle) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MtpStorageInfo getStorageInfo(final int storageId) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MtpObjectInfo getObjectInfo(final int objectHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean deleteObject(final int objectHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public long getParent(final int objectHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public long getStorageId(final int objectHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean importFile(final int objectHandle, @NonNull final String destPath) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean importFile(final int objectHandle, @NonNull final ParcelFileDescriptor descriptor) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean sendObject(final int objectHandle, final long size, @NonNull final ParcelFileDescriptor descriptor) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MtpObjectInfo sendObjectInfo(@NonNull final MtpObjectInfo info) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public MtpEvent readEvent(@Nullable final CancellationSignal signal) throws IOException {
        throw new RuntimeException("Stub!");
    }
}
