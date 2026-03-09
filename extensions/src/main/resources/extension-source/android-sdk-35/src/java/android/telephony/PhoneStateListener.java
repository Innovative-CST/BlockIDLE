package android.telephony;

import android.telephony.emergency.EmergencyNumber;
import java.util.Map;
import android.telephony.ims.ImsReasonInfo;
import java.util.List;
import java.util.concurrent.Executor;

@Deprecated
public class PhoneStateListener
{
    @Deprecated
    public static final int LISTEN_ACTIVE_DATA_SUBSCRIPTION_ID_CHANGE = 4194304;
    @Deprecated
    public static final int LISTEN_BARRING_INFO = Integer.MIN_VALUE;
    @Deprecated
    public static final int LISTEN_CALL_DISCONNECT_CAUSES = 33554432;
    @Deprecated
    public static final int LISTEN_CALL_FORWARDING_INDICATOR = 8;
    @Deprecated
    public static final int LISTEN_CALL_STATE = 32;
    @Deprecated
    public static final int LISTEN_CELL_INFO = 1024;
    @Deprecated
    public static final int LISTEN_CELL_LOCATION = 16;
    @Deprecated
    public static final int LISTEN_DATA_ACTIVITY = 128;
    @Deprecated
    public static final int LISTEN_DATA_CONNECTION_STATE = 64;
    @Deprecated
    public static final int LISTEN_DISPLAY_INFO_CHANGED = 1048576;
    @Deprecated
    public static final int LISTEN_EMERGENCY_NUMBER_LIST = 16777216;
    @Deprecated
    public static final int LISTEN_IMS_CALL_DISCONNECT_CAUSES = 134217728;
    @Deprecated
    public static final int LISTEN_MESSAGE_WAITING_INDICATOR = 4;
    @Deprecated
    public static final int LISTEN_NONE = 0;
    @Deprecated
    public static final int LISTEN_PRECISE_DATA_CONNECTION_STATE = 4096;
    @Deprecated
    public static final int LISTEN_REGISTRATION_FAILURE = 1073741824;
    @Deprecated
    public static final int LISTEN_SERVICE_STATE = 1;
    @Deprecated
    public static final int LISTEN_SIGNAL_STRENGTH = 2;
    @Deprecated
    public static final int LISTEN_SIGNAL_STRENGTHS = 256;
    @Deprecated
    public static final int LISTEN_USER_MOBILE_DATA_STATE = 524288;
    
    @Deprecated
    public PhoneStateListener() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public PhoneStateListener(@NonNull final Executor executor) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onServiceStateChanged(final ServiceState serviceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onSignalStrengthChanged(final int asu) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onMessageWaitingIndicatorChanged(final boolean mwi) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onCallForwardingIndicatorChanged(final boolean cfi) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onCellLocationChanged(final CellLocation location) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onCallStateChanged(final int state, final String phoneNumber) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onDataConnectionStateChanged(final int state) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onDataConnectionStateChanged(final int state, final int networkType) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onDataActivity(final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onSignalStrengthsChanged(final SignalStrength signalStrength) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onCellInfoChanged(final List<CellInfo> cellInfo) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onCallDisconnectCauseChanged(final int disconnectCause, final int preciseDisconnectCause) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onImsCallDisconnectCauseChanged(@NonNull final ImsReasonInfo imsReasonInfo) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onPreciseDataConnectionStateChanged(@NonNull final PreciseDataConnectionState dataConnectionState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onUserMobileDataStateChanged(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onDisplayInfoChanged(@NonNull final TelephonyDisplayInfo telephonyDisplayInfo) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onEmergencyNumberListChanged(@NonNull final Map<Integer, List<EmergencyNumber>> emergencyNumberList) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onActiveDataSubscriptionIdChanged(final int subId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onRegistrationFailed(@NonNull final CellIdentity cellIdentity, @NonNull final String chosenPlmn, final int domain, final int causeCode, final int additionalCauseCode) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onBarringInfoChanged(@NonNull final BarringInfo barringInfo) {
        throw new RuntimeException("Stub!");
    }
}
