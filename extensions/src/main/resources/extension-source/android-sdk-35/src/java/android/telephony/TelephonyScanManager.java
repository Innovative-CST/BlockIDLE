package android.telephony;

import java.util.List;

public final class TelephonyScanManager
{
    public TelephonyScanManager() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class NetworkScanCallback
    {
        public NetworkScanCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onResults(final List<CellInfo> results) {
            throw new RuntimeException("Stub!");
        }
        
        public void onComplete() {
            throw new RuntimeException("Stub!");
        }
        
        public void onError(final int error) {
            throw new RuntimeException("Stub!");
        }
    }
}
