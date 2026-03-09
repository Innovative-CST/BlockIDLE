package android.bluetooth.le;

import android.app.PendingIntent;
import java.util.List;

public final class BluetoothLeScanner
{
    public static final String EXTRA_CALLBACK_TYPE = "android.bluetooth.le.extra.CALLBACK_TYPE";
    public static final String EXTRA_ERROR_CODE = "android.bluetooth.le.extra.ERROR_CODE";
    public static final String EXTRA_LIST_SCAN_RESULT = "android.bluetooth.le.extra.LIST_SCAN_RESULT";
    
    BluetoothLeScanner() {
        throw new RuntimeException("Stub!");
    }
    
    public void startScan(final ScanCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void startScan(final List<ScanFilter> filters, final ScanSettings settings, final ScanCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public int startScan(@Nullable final List<ScanFilter> filters, @Nullable final ScanSettings settings, @NonNull final PendingIntent callbackIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public void stopScan(final ScanCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void stopScan(final PendingIntent callbackIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public void flushPendingScanResults(final ScanCallback callback) {
        throw new RuntimeException("Stub!");
    }
}
