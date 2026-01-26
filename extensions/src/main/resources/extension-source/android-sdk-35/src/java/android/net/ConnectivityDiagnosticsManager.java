package android.net;

import android.os.Parcel;
import android.os.PersistableBundle;
import android.os.Parcelable;
import java.util.concurrent.Executor;

public class ConnectivityDiagnosticsManager
{
    ConnectivityDiagnosticsManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerConnectivityDiagnosticsCallback(@NonNull final NetworkRequest request, @NonNull final Executor e, @NonNull final ConnectivityDiagnosticsCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterConnectivityDiagnosticsCallback(@NonNull final ConnectivityDiagnosticsCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class ConnectivityDiagnosticsCallback
    {
        public ConnectivityDiagnosticsCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onConnectivityReportAvailable(@NonNull final ConnectivityReport report) {
            throw new RuntimeException("Stub!");
        }
        
        public void onDataStallSuspected(@NonNull final DataStallReport report) {
            throw new RuntimeException("Stub!");
        }
        
        public void onNetworkConnectivityReported(@NonNull final Network network, final boolean hasConnectivity) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ConnectivityReport implements Parcelable
    {
        @NonNull
        public static final Creator<ConnectivityReport> CREATOR;
        public static final String KEY_NETWORK_PROBES_ATTEMPTED_BITMASK = "networkProbesAttempted";
        public static final String KEY_NETWORK_PROBES_SUCCEEDED_BITMASK = "networkProbesSucceeded";
        public static final String KEY_NETWORK_VALIDATION_RESULT = "networkValidationResult";
        public static final int NETWORK_PROBE_DNS = 4;
        public static final int NETWORK_PROBE_FALLBACK = 32;
        public static final int NETWORK_PROBE_HTTP = 8;
        public static final int NETWORK_PROBE_HTTPS = 16;
        public static final int NETWORK_PROBE_PRIVATE_DNS = 64;
        public static final int NETWORK_VALIDATION_RESULT_INVALID = 0;
        public static final int NETWORK_VALIDATION_RESULT_PARTIALLY_VALID = 2;
        public static final int NETWORK_VALIDATION_RESULT_SKIPPED = 3;
        public static final int NETWORK_VALIDATION_RESULT_VALID = 1;
        
        public ConnectivityReport(@NonNull final Network network, final long reportTimestamp, @NonNull final LinkProperties linkProperties, @NonNull final NetworkCapabilities networkCapabilities, @NonNull final PersistableBundle additionalInfo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Network getNetwork() {
            throw new RuntimeException("Stub!");
        }
        
        public long getReportTimestamp() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public LinkProperties getLinkProperties() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public NetworkCapabilities getNetworkCapabilities() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PersistableBundle getAdditionalInfo() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object o) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(@NonNull final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
    
    public static final class DataStallReport implements Parcelable
    {
        @NonNull
        public static final Creator<DataStallReport> CREATOR;
        public static final int DETECTION_METHOD_DNS_EVENTS = 1;
        public static final int DETECTION_METHOD_TCP_METRICS = 2;
        public static final String KEY_DNS_CONSECUTIVE_TIMEOUTS = "dnsConsecutiveTimeouts";
        public static final String KEY_TCP_METRICS_COLLECTION_PERIOD_MILLIS = "tcpMetricsCollectionPeriodMillis";
        public static final String KEY_TCP_PACKET_FAIL_RATE = "tcpPacketFailRate";
        
        public DataStallReport(@NonNull final Network network, final long reportTimestamp, final int detectionMethod, @NonNull final LinkProperties linkProperties, @NonNull final NetworkCapabilities networkCapabilities, @NonNull final PersistableBundle stallDetails) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Network getNetwork() {
            throw new RuntimeException("Stub!");
        }
        
        public long getReportTimestamp() {
            throw new RuntimeException("Stub!");
        }
        
        public int getDetectionMethod() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public LinkProperties getLinkProperties() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public NetworkCapabilities getNetworkCapabilities() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PersistableBundle getStallDetails() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object o) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(@NonNull final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
}
