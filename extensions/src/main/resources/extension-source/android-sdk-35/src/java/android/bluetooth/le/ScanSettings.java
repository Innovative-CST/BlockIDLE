package android.bluetooth.le;

import android.os.Parcel;
import android.os.Parcelable;

public final class ScanSettings implements Parcelable
{
    public static final long AUTO_BATCH_MIN_REPORT_DELAY_MILLIS = 600000L;
    public static final int CALLBACK_TYPE_ALL_MATCHES = 1;
    public static final int CALLBACK_TYPE_ALL_MATCHES_AUTO_BATCH = 8;
    public static final int CALLBACK_TYPE_FIRST_MATCH = 2;
    public static final int CALLBACK_TYPE_MATCH_LOST = 4;
    @NonNull
    public static final Creator<ScanSettings> CREATOR;
    public static final int MATCH_MODE_AGGRESSIVE = 1;
    public static final int MATCH_MODE_STICKY = 2;
    public static final int MATCH_NUM_FEW_ADVERTISEMENT = 2;
    public static final int MATCH_NUM_MAX_ADVERTISEMENT = 3;
    public static final int MATCH_NUM_ONE_ADVERTISEMENT = 1;
    public static final int PHY_LE_ALL_SUPPORTED = 255;
    public static final int SCAN_MODE_BALANCED = 1;
    public static final int SCAN_MODE_LOW_LATENCY = 2;
    public static final int SCAN_MODE_LOW_POWER = 0;
    public static final int SCAN_MODE_OPPORTUNISTIC = -1;
    
    ScanSettings() {
        throw new RuntimeException("Stub!");
    }
    
    public int getScanMode() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCallbackType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getScanResultType() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getLegacy() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPhy() {
        throw new RuntimeException("Stub!");
    }
    
    public long getReportDelayMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setScanMode(final int scanMode) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setCallbackType(final int callbackType) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setReportDelay(final long reportDelayMillis) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setNumOfMatches(final int numOfMatches) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setMatchMode(final int matchMode) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setLegacy(final boolean legacy) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setPhy(final int phy) {
            throw new RuntimeException("Stub!");
        }
        
        public ScanSettings build() {
            throw new RuntimeException("Stub!");
        }
    }
}
