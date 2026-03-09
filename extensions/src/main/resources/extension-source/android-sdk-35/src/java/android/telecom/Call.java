package android.telecom;

import java.io.IOException;
import android.os.Handler;
import android.os.Bundle;
import java.util.List;
import android.net.Uri;

public final class Call
{
    @Deprecated
    public static final String AVAILABLE_PHONE_ACCOUNTS = "selectPhoneAccountAccounts";
    public static final String EVENT_CLEAR_DIAGNOSTIC_MESSAGE = "android.telecom.event.CLEAR_DIAGNOSTIC_MESSAGE";
    public static final String EVENT_DISPLAY_DIAGNOSTIC_MESSAGE = "android.telecom.event.DISPLAY_DIAGNOSTIC_MESSAGE";
    public static final String EXTRA_ASSERTED_DISPLAY_NAME = "android.telecom.extra.ASSERTED_DISPLAY_NAME";
    public static final String EXTRA_DIAGNOSTIC_MESSAGE = "android.telecom.extra.DIAGNOSTIC_MESSAGE";
    public static final String EXTRA_DIAGNOSTIC_MESSAGE_ID = "android.telecom.extra.DIAGNOSTIC_MESSAGE_ID";
    public static final String EXTRA_IS_BUSINESS_CALL = "android.telecom.extra.IS_BUSINESS_CALL";
    public static final String EXTRA_IS_SUPPRESSED_BY_DO_NOT_DISTURB = "android.telecom.extra.IS_SUPPRESSED_BY_DO_NOT_DISTURB";
    public static final String EXTRA_LAST_EMERGENCY_CALLBACK_TIME_MILLIS = "android.telecom.extra.LAST_EMERGENCY_CALLBACK_TIME_MILLIS";
    public static final String EXTRA_SILENT_RINGING_REQUESTED = "android.telecom.extra.SILENT_RINGING_REQUESTED";
    public static final String EXTRA_SUGGESTED_PHONE_ACCOUNTS = "android.telecom.extra.SUGGESTED_PHONE_ACCOUNTS";
    public static final int REJECT_REASON_DECLINED = 1;
    public static final int REJECT_REASON_UNWANTED = 2;
    public static final int STATE_ACTIVE = 4;
    public static final int STATE_AUDIO_PROCESSING = 12;
    public static final int STATE_CONNECTING = 9;
    public static final int STATE_DIALING = 1;
    public static final int STATE_DISCONNECTED = 7;
    public static final int STATE_DISCONNECTING = 10;
    public static final int STATE_HOLDING = 3;
    public static final int STATE_NEW = 0;
    public static final int STATE_PULLING_CALL = 11;
    public static final int STATE_RINGING = 2;
    public static final int STATE_SELECT_PHONE_ACCOUNT = 8;
    public static final int STATE_SIMULATED_RINGING = 13;
    
    Call() {
        throw new RuntimeException("Stub!");
    }
    
    public String getRemainingPostDialSequence() {
        throw new RuntimeException("Stub!");
    }
    
    public void answer(final int videoState) {
        throw new RuntimeException("Stub!");
    }
    
    public void deflect(final Uri address) {
        throw new RuntimeException("Stub!");
    }
    
    public void reject(final boolean rejectWithMessage, final String textMessage) {
        throw new RuntimeException("Stub!");
    }
    
    public void reject(final int rejectReason) {
        throw new RuntimeException("Stub!");
    }
    
    public void disconnect() {
        throw new RuntimeException("Stub!");
    }
    
    public void hold() {
        throw new RuntimeException("Stub!");
    }
    
    public void unhold() {
        throw new RuntimeException("Stub!");
    }
    
    public void playDtmfTone(final char digit) {
        throw new RuntimeException("Stub!");
    }
    
    public void stopDtmfTone() {
        throw new RuntimeException("Stub!");
    }
    
    public void postDialContinue(final boolean proceed) {
        throw new RuntimeException("Stub!");
    }
    
    public void phoneAccountSelected(final PhoneAccountHandle accountHandle, final boolean setDefault) {
        throw new RuntimeException("Stub!");
    }
    
    public void conference(final Call callToConferenceWith) {
        throw new RuntimeException("Stub!");
    }
    
    public void splitFromConference() {
        throw new RuntimeException("Stub!");
    }
    
    public void mergeConference() {
        throw new RuntimeException("Stub!");
    }
    
    public void swapConference() {
        throw new RuntimeException("Stub!");
    }
    
    public void addConferenceParticipants(@NonNull final List<Uri> participants) {
        throw new RuntimeException("Stub!");
    }
    
    public void pullExternalCall() {
        throw new RuntimeException("Stub!");
    }
    
    public void sendCallEvent(final String event, final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendRttRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public void respondToRttRequest(final int id, final boolean accept) {
        throw new RuntimeException("Stub!");
    }
    
    public void handoverTo(final PhoneAccountHandle toHandle, final int videoState, final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public void stopRtt() {
        throw new RuntimeException("Stub!");
    }
    
    public void putExtras(final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeExtras(final List<String> keys) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeExtras(final String... keys) {
        throw new RuntimeException("Stub!");
    }
    
    public Call getParent() {
        throw new RuntimeException("Stub!");
    }
    
    public List<Call> getChildren() {
        throw new RuntimeException("Stub!");
    }
    
    public List<Call> getConferenceableCalls() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getState() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Call getGenericConferenceActiveChildCall() {
        throw new RuntimeException("Stub!");
    }
    
    public List<String> getCannedTextResponses() {
        throw new RuntimeException("Stub!");
    }
    
    public InCallService.VideoCall getVideoCall() {
        throw new RuntimeException("Stub!");
    }
    
    public Details getDetails() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public RttCall getRttCall() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRttActive() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerCallback(final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerCallback(final Callback callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterCallback(final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class Callback
    {
        public static final int HANDOVER_FAILURE_DEST_APP_REJECTED = 1;
        public static final int HANDOVER_FAILURE_NOT_SUPPORTED = 2;
        public static final int HANDOVER_FAILURE_ONGOING_EMERGENCY_CALL = 4;
        public static final int HANDOVER_FAILURE_UNKNOWN = 5;
        public static final int HANDOVER_FAILURE_USER_REJECTED = 3;
        
        public Callback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onStateChanged(final Call call, final int state) {
            throw new RuntimeException("Stub!");
        }
        
        public void onParentChanged(final Call call, final Call parent) {
            throw new RuntimeException("Stub!");
        }
        
        public void onChildrenChanged(final Call call, final List<Call> children) {
            throw new RuntimeException("Stub!");
        }
        
        public void onDetailsChanged(final Call call, final Details details) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCannedTextResponsesLoaded(final Call call, final List<String> cannedTextResponses) {
            throw new RuntimeException("Stub!");
        }
        
        public void onPostDialWait(final Call call, final String remainingPostDialSequence) {
            throw new RuntimeException("Stub!");
        }
        
        public void onVideoCallChanged(final Call call, final InCallService.VideoCall videoCall) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCallDestroyed(final Call call) {
            throw new RuntimeException("Stub!");
        }
        
        public void onConferenceableCallsChanged(final Call call, final List<Call> conferenceableCalls) {
            throw new RuntimeException("Stub!");
        }
        
        public void onConnectionEvent(final Call call, final String event, final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRttModeChanged(final Call call, final int mode) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRttStatusChanged(final Call call, final boolean enabled, final RttCall rttCall) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRttRequest(final Call call, final int id) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRttInitiationFailure(final Call call, final int reason) {
            throw new RuntimeException("Stub!");
        }
        
        public void onHandoverComplete(final Call call) {
            throw new RuntimeException("Stub!");
        }
        
        public void onHandoverFailed(final Call call, final int failureReason) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class Details
    {
        public static final int CAPABILITY_ADD_PARTICIPANT = 33554432;
        public static final int CAPABILITY_CANNOT_DOWNGRADE_VIDEO_TO_AUDIO = 4194304;
        public static final int CAPABILITY_CAN_PAUSE_VIDEO = 1048576;
        public static final int CAPABILITY_CAN_PULL_CALL = 8388608;
        public static final int CAPABILITY_DISCONNECT_FROM_CONFERENCE = 8192;
        public static final int CAPABILITY_HOLD = 1;
        public static final int CAPABILITY_MANAGE_CONFERENCE = 128;
        public static final int CAPABILITY_MERGE_CONFERENCE = 4;
        public static final int CAPABILITY_MUTE = 64;
        public static final int CAPABILITY_REMOTE_PARTY_SUPPORTS_RTT = 268435456;
        public static final int CAPABILITY_RESPOND_VIA_TEXT = 32;
        public static final int CAPABILITY_SEPARATE_FROM_CONFERENCE = 4096;
        public static final int CAPABILITY_SUPPORTS_VT_LOCAL_BIDIRECTIONAL = 768;
        public static final int CAPABILITY_SUPPORTS_VT_LOCAL_RX = 256;
        public static final int CAPABILITY_SUPPORTS_VT_LOCAL_TX = 512;
        public static final int CAPABILITY_SUPPORTS_VT_REMOTE_BIDIRECTIONAL = 3072;
        public static final int CAPABILITY_SUPPORTS_VT_REMOTE_RX = 1024;
        public static final int CAPABILITY_SUPPORTS_VT_REMOTE_TX = 2048;
        public static final int CAPABILITY_SUPPORT_DEFLECT = 16777216;
        public static final int CAPABILITY_SUPPORT_HOLD = 2;
        public static final int CAPABILITY_SWAP_CONFERENCE = 8;
        public static final int DIRECTION_INCOMING = 0;
        public static final int DIRECTION_OUTGOING = 1;
        public static final int DIRECTION_UNKNOWN = -1;
        public static final int PROPERTY_ASSISTED_DIALING = 512;
        public static final int PROPERTY_CONFERENCE = 1;
        public static final int PROPERTY_CROSS_SIM = 16384;
        public static final int PROPERTY_EMERGENCY_CALLBACK_MODE = 4;
        public static final int PROPERTY_ENTERPRISE_CALL = 32;
        public static final int PROPERTY_GENERIC_CONFERENCE = 2;
        public static final int PROPERTY_HAS_CDMA_VOICE_PRIVACY = 128;
        public static final int PROPERTY_HIGH_DEF_AUDIO = 16;
        public static final int PROPERTY_IS_ADHOC_CONFERENCE = 8192;
        public static final int PROPERTY_IS_EXTERNAL_CALL = 64;
        public static final int PROPERTY_IS_TRANSACTIONAL = 32768;
        public static final int PROPERTY_NETWORK_IDENTIFIED_EMERGENCY_CALL = 2048;
        public static final int PROPERTY_RTT = 1024;
        public static final int PROPERTY_SELF_MANAGED = 256;
        public static final int PROPERTY_VOIP_AUDIO_MODE = 4096;
        public static final int PROPERTY_WIFI = 8;
        
        Details() {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean can(final int capabilities, final int capability) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean can(final int capability) {
            throw new RuntimeException("Stub!");
        }
        
        public static String capabilitiesToString(final int capabilities) {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean hasProperty(final int properties, final int property) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean hasProperty(final int property) {
            throw new RuntimeException("Stub!");
        }
        
        public static String propertiesToString(final int properties) {
            throw new RuntimeException("Stub!");
        }
        
        public final int getState() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getId() {
            throw new RuntimeException("Stub!");
        }
        
        public Uri getHandle() {
            throw new RuntimeException("Stub!");
        }
        
        public int getHandlePresentation() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Uri getContactPhotoUri() {
            throw new RuntimeException("Stub!");
        }
        
        public String getCallerDisplayName() {
            throw new RuntimeException("Stub!");
        }
        
        public int getCallerDisplayNamePresentation() {
            throw new RuntimeException("Stub!");
        }
        
        public PhoneAccountHandle getAccountHandle() {
            throw new RuntimeException("Stub!");
        }
        
        public int getCallCapabilities() {
            throw new RuntimeException("Stub!");
        }
        
        public int getCallProperties() {
            throw new RuntimeException("Stub!");
        }
        
        public DisconnectCause getDisconnectCause() {
            throw new RuntimeException("Stub!");
        }
        
        public final long getConnectTimeMillis() {
            throw new RuntimeException("Stub!");
        }
        
        public GatewayInfo getGatewayInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public int getVideoState() {
            throw new RuntimeException("Stub!");
        }
        
        public StatusHints getStatusHints() {
            throw new RuntimeException("Stub!");
        }
        
        public Bundle getExtras() {
            throw new RuntimeException("Stub!");
        }
        
        public Bundle getIntentExtras() {
            throw new RuntimeException("Stub!");
        }
        
        public long getCreationTimeMillis() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public String getContactDisplayName() {
            throw new RuntimeException("Stub!");
        }
        
        public int getCallDirection() {
            throw new RuntimeException("Stub!");
        }
        
        public int getCallerNumberVerificationStatus() {
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
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class RttCall
    {
        public static final int RTT_MODE_FULL = 1;
        public static final int RTT_MODE_HCO = 2;
        public static final int RTT_MODE_VCO = 3;
        
        RttCall() {
            throw new RuntimeException("Stub!");
        }
        
        public int getRttAudioMode() {
            throw new RuntimeException("Stub!");
        }
        
        public void setRttMode(final int mode) {
            throw new RuntimeException("Stub!");
        }
        
        public void write(final String input) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        public String read() {
            throw new RuntimeException("Stub!");
        }
        
        public String readImmediately() throws IOException {
            throw new RuntimeException("Stub!");
        }
    }
}
