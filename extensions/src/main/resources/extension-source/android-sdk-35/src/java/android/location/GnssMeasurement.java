package android.location;

import android.os.Parcel;
import android.os.Parcelable;

public final class GnssMeasurement implements Parcelable
{
    public static final int ADR_STATE_CYCLE_SLIP = 4;
    public static final int ADR_STATE_HALF_CYCLE_REPORTED = 16;
    public static final int ADR_STATE_HALF_CYCLE_RESOLVED = 8;
    public static final int ADR_STATE_RESET = 2;
    public static final int ADR_STATE_UNKNOWN = 0;
    public static final int ADR_STATE_VALID = 1;
    @NonNull
    public static final Creator<GnssMeasurement> CREATOR;
    public static final int MULTIPATH_INDICATOR_DETECTED = 1;
    public static final int MULTIPATH_INDICATOR_NOT_DETECTED = 2;
    public static final int MULTIPATH_INDICATOR_UNKNOWN = 0;
    public static final int STATE_2ND_CODE_LOCK = 65536;
    public static final int STATE_BDS_D2_BIT_SYNC = 256;
    public static final int STATE_BDS_D2_SUBFRAME_SYNC = 512;
    public static final int STATE_BIT_SYNC = 2;
    public static final int STATE_CODE_LOCK = 1;
    public static final int STATE_GAL_E1BC_CODE_LOCK = 1024;
    public static final int STATE_GAL_E1B_PAGE_SYNC = 4096;
    public static final int STATE_GAL_E1C_2ND_CODE_LOCK = 2048;
    public static final int STATE_GLO_STRING_SYNC = 64;
    public static final int STATE_GLO_TOD_DECODED = 128;
    public static final int STATE_GLO_TOD_KNOWN = 32768;
    public static final int STATE_MSEC_AMBIGUOUS = 16;
    public static final int STATE_SBAS_SYNC = 8192;
    public static final int STATE_SUBFRAME_SYNC = 4;
    public static final int STATE_SYMBOL_SYNC = 32;
    public static final int STATE_TOW_DECODED = 8;
    public static final int STATE_TOW_KNOWN = 16384;
    public static final int STATE_UNKNOWN = 0;
    
    GnssMeasurement() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSvid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getConstellationType() {
        throw new RuntimeException("Stub!");
    }
    
    public double getTimeOffsetNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public int getState() {
        throw new RuntimeException("Stub!");
    }
    
    public long getReceivedSvTimeNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public long getReceivedSvTimeUncertaintyNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public double getCn0DbHz() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasBasebandCn0DbHz() {
        throw new RuntimeException("Stub!");
    }
    
    public double getBasebandCn0DbHz() {
        throw new RuntimeException("Stub!");
    }
    
    public double getPseudorangeRateMetersPerSecond() {
        throw new RuntimeException("Stub!");
    }
    
    public double getPseudorangeRateUncertaintyMetersPerSecond() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAccumulatedDeltaRangeState() {
        throw new RuntimeException("Stub!");
    }
    
    public double getAccumulatedDeltaRangeMeters() {
        throw new RuntimeException("Stub!");
    }
    
    public double getAccumulatedDeltaRangeUncertaintyMeters() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasCarrierFrequencyHz() {
        throw new RuntimeException("Stub!");
    }
    
    public float getCarrierFrequencyHz() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean hasCarrierCycles() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public long getCarrierCycles() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean hasCarrierPhase() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public double getCarrierPhase() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean hasCarrierPhaseUncertainty() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public double getCarrierPhaseUncertainty() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMultipathIndicator() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasSnrInDb() {
        throw new RuntimeException("Stub!");
    }
    
    public double getSnrInDb() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean hasAutomaticGainControlLevelDb() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public double getAutomaticGainControlLevelDb() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasCodeType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getCodeType() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasFullInterSignalBiasNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public double getFullInterSignalBiasNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasFullInterSignalBiasUncertaintyNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public double getFullInterSignalBiasUncertaintyNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasSatelliteInterSignalBiasNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public double getSatelliteInterSignalBiasNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasSatelliteInterSignalBiasUncertaintyNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public double getSatelliteInterSignalBiasUncertaintyNanos() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
