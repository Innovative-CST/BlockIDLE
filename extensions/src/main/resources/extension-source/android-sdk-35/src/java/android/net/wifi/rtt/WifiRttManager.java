package android.net.wifi.rtt;

import android.os.Bundle;
import java.util.concurrent.Executor;

public class WifiRttManager
{
    public static final String ACTION_WIFI_RTT_STATE_CHANGED = "android.net.wifi.rtt.action.WIFI_RTT_STATE_CHANGED";
    public static final String CHARACTERISTICS_KEY_BOOLEAN_LCI = "key_lci";
    public static final String CHARACTERISTICS_KEY_BOOLEAN_LCR = "key_lcr";
    public static final String CHARACTERISTICS_KEY_BOOLEAN_NTB_INITIATOR = "key_ntb_initiator";
    public static final String CHARACTERISTICS_KEY_BOOLEAN_ONE_SIDED_RTT = "key_one_sided_rtt";
    public static final String CHARACTERISTICS_KEY_BOOLEAN_STA_RESPONDER = "key_sta_responder";
    
    WifiRttManager() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAvailable() {
        throw new RuntimeException("Stub!");
    }
    
    public void startRanging(@NonNull final RangingRequest request, @NonNull final Executor executor, @NonNull final RangingResultCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getRttCharacteristics() {
        throw new RuntimeException("Stub!");
    }
}
