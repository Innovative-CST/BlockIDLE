package android.telephony;

import android.telephony.emergency.EmergencyNumber;
import java.util.Map;
import android.telephony.ims.ImsReasonInfo;
import java.util.List;

public class TelephonyCallback
{
    public TelephonyCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public interface UserMobileDataStateListener
    {
        void onUserMobileDataStateChanged(final boolean p0);
    }
    
    public interface SignalStrengthsListener
    {
        void onSignalStrengthsChanged(@NonNull final SignalStrength p0);
    }
    
    public interface ServiceStateListener
    {
        void onServiceStateChanged(@NonNull final ServiceState p0);
    }
    
    public interface RegistrationFailedListener
    {
        void onRegistrationFailed(@NonNull final CellIdentity p0, @NonNull final String p1, final int p2, final int p3, final int p4);
    }
    
    public interface PreciseDataConnectionStateListener
    {
        void onPreciseDataConnectionStateChanged(@NonNull final PreciseDataConnectionState p0);
    }
    
    public interface PhysicalChannelConfigListener
    {
        void onPhysicalChannelConfigChanged(@NonNull final List<PhysicalChannelConfig> p0);
    }
    
    public interface MessageWaitingIndicatorListener
    {
        void onMessageWaitingIndicatorChanged(final boolean p0);
    }
    
    public interface ImsCallDisconnectCauseListener
    {
        void onImsCallDisconnectCauseChanged(@NonNull final ImsReasonInfo p0);
    }
    
    public interface EmergencyNumberListListener
    {
        void onEmergencyNumberListChanged(@NonNull final Map<Integer, List<EmergencyNumber>> p0);
    }
    
    public interface DisplayInfoListener
    {
        void onDisplayInfoChanged(@NonNull final TelephonyDisplayInfo p0);
    }
    
    public interface DataConnectionStateListener
    {
        void onDataConnectionStateChanged(final int p0, final int p1);
    }
    
    public interface DataActivityListener
    {
        void onDataActivity(final int p0);
    }
    
    public interface DataActivationStateListener
    {
        void onDataActivationStateChanged(final int p0);
    }
    
    public interface CellLocationListener
    {
        void onCellLocationChanged(@NonNull final CellLocation p0);
    }
    
    public interface CellInfoListener
    {
        void onCellInfoChanged(@NonNull final List<CellInfo> p0);
    }
    
    public interface CarrierNetworkListener
    {
        void onCarrierNetworkChange(final boolean p0);
    }
    
    public interface CallStateListener
    {
        void onCallStateChanged(final int p0);
    }
    
    public interface CallForwardingIndicatorListener
    {
        void onCallForwardingIndicatorChanged(final boolean p0);
    }
    
    public interface CallDisconnectCauseListener
    {
        void onCallDisconnectCauseChanged(final int p0, final int p1);
    }
    
    public interface BarringInfoListener
    {
        void onBarringInfoChanged(@NonNull final BarringInfo p0);
    }
    
    public interface ActiveDataSubscriptionIdListener
    {
        void onActiveDataSubscriptionIdChanged(final int p0);
    }
}
