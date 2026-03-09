package android.net.wifi.rtt;

import android.os.Parcel;
import android.net.wifi.aware.PeerHandle;
import android.net.MacAddress;
import android.os.Parcelable;

public final class RangingResult implements Parcelable
{
    @NonNull
    public static final Creator<RangingResult> CREATOR;
    public static final int STATUS_FAIL = 1;
    public static final int STATUS_RESPONDER_DOES_NOT_SUPPORT_IEEE80211MC = 2;
    public static final int STATUS_SUCCESS = 0;
    public static final int UNSPECIFIED = -1;
    
    RangingResult() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStatus() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MacAddress getMacAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PeerHandle getPeerHandle() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDistanceMm() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDistanceStdDevMm() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRssi() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNumAttemptedMeasurements() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNumSuccessfulMeasurements() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ResponderLocation getUnverifiedResponderLocation() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] getLci() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] getLcr() {
        throw new RuntimeException("Stub!");
    }
    
    public long getRangingTimestampMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean is80211mcMeasurement() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean is80211azNtbMeasurement() {
        throw new RuntimeException("Stub!");
    }
    
    public long getMinTimeBetweenNtbMeasurementsMicros() {
        throw new RuntimeException("Stub!");
    }
    
    public long getMaxTimeBetweenNtbMeasurementsMicros() {
        throw new RuntimeException("Stub!");
    }
    
    public int get80211azResponderTxLtfRepetitionsCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int get80211azInitiatorTxLtfRepetitionsCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int get80211azNumberOfTxSpatialStreams() {
        throw new RuntimeException("Stub!");
    }
    
    public int get80211azNumberOfRxSpatialStreams() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMeasurementChannelFrequencyMHz() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMeasurementBandwidth() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
        
        @NonNull
        public Builder setStatus(final int status) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMacAddress(@Nullable final MacAddress macAddress) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPeerHandle(@Nullable final PeerHandle peerHandle) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDistanceMm(final int distanceMm) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDistanceStdDevMm(final int distanceStdDevMm) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRssi(final int rssi) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNumAttemptedMeasurements(final int numAttemptedMeasurements) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNumSuccessfulMeasurements(final int numSuccessfulMeasurements) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLci(@Nullable final byte[] lci) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLcr(@Nullable final byte[] lcr) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUnverifiedResponderLocation(@Nullable final ResponderLocation responderLocation) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRangingTimestampMillis(final long timestamp) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder set80211mcMeasurement(final boolean is80211mcMeasurement) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMeasurementChannelFrequencyMHz(final int frequencyMHz) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMeasurementBandwidth(final int measurementBandwidth) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder set80211azNtbMeasurement(final boolean is80211azNtbMeasurement) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMinTimeBetweenNtbMeasurementsMicros(final long ntbMinMeasurementTime) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMaxTimeBetweenNtbMeasurementsMicros(final long ntbMaxMeasurementTime) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder set80211azInitiatorTxLtfRepetitionsCount(final int i2rTxLtfRepetitions) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder set80211azResponderTxLtfRepetitionsCount(final int r2iTxLtfRepetitions) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder set80211azNumberOfTxSpatialStreams(final int numTxSpatialStreams) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder set80211azNumberOfRxSpatialStreams(final int numRxSpatialStreams) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public RangingResult build() {
            throw new RuntimeException("Stub!");
        }
    }
}
