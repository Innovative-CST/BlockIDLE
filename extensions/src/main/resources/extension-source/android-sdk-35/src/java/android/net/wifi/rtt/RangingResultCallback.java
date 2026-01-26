package android.net.wifi.rtt;

import java.util.List;

public abstract class RangingResultCallback
{
    public static final int STATUS_CODE_FAIL = 1;
    public static final int STATUS_CODE_FAIL_RTT_NOT_AVAILABLE = 2;
    
    public RangingResultCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onRangingFailure(final int p0);
    
    public abstract void onRangingResults(@NonNull final List<RangingResult> p0);
}
