package android.hardware.usb;

import android.app.PendingIntent;
import android.os.ParcelFileDescriptor;
import java.util.HashMap;

public class UsbManager
{
    public static final String ACTION_USB_ACCESSORY_ATTACHED = "android.hardware.usb.action.USB_ACCESSORY_ATTACHED";
    public static final String ACTION_USB_ACCESSORY_DETACHED = "android.hardware.usb.action.USB_ACCESSORY_DETACHED";
    public static final String ACTION_USB_DEVICE_ATTACHED = "android.hardware.usb.action.USB_DEVICE_ATTACHED";
    public static final String ACTION_USB_DEVICE_DETACHED = "android.hardware.usb.action.USB_DEVICE_DETACHED";
    public static final String EXTRA_ACCESSORY = "accessory";
    public static final String EXTRA_DEVICE = "device";
    public static final String EXTRA_PERMISSION_GRANTED = "permission";
    
    UsbManager() {
        throw new RuntimeException("Stub!");
    }
    
    public HashMap<String, UsbDevice> getDeviceList() {
        throw new RuntimeException("Stub!");
    }
    
    public UsbDeviceConnection openDevice(final UsbDevice device) {
        throw new RuntimeException("Stub!");
    }
    
    public UsbAccessory[] getAccessoryList() {
        throw new RuntimeException("Stub!");
    }
    
    public ParcelFileDescriptor openAccessory(final UsbAccessory accessory) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasPermission(final UsbDevice device) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasPermission(final UsbAccessory accessory) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestPermission(final UsbDevice device, final PendingIntent pi) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestPermission(final UsbAccessory accessory, final PendingIntent pi) {
        throw new RuntimeException("Stub!");
    }
}
