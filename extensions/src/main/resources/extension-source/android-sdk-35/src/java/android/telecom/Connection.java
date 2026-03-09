package android.telecom;

import android.view.Surface;
import java.io.IOException;
import android.location.Location;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;
import android.bluetooth.BluetoothDevice;
import java.util.List;
import android.os.Bundle;
import android.net.Uri;

public abstract class Connection extends Conferenceable
{
    public static final int AUDIO_CODEC_AMR = 1;
    public static final int AUDIO_CODEC_AMR_WB = 2;
    public static final int AUDIO_CODEC_EVRC = 4;
    public static final int AUDIO_CODEC_EVRC_B = 5;
    public static final int AUDIO_CODEC_EVRC_NW = 7;
    public static final int AUDIO_CODEC_EVRC_WB = 6;
    public static final int AUDIO_CODEC_EVS_FB = 20;
    public static final int AUDIO_CODEC_EVS_NB = 17;
    public static final int AUDIO_CODEC_EVS_SWB = 19;
    public static final int AUDIO_CODEC_EVS_WB = 18;
    public static final int AUDIO_CODEC_G711A = 13;
    public static final int AUDIO_CODEC_G711AB = 15;
    public static final int AUDIO_CODEC_G711U = 11;
    public static final int AUDIO_CODEC_G722 = 14;
    public static final int AUDIO_CODEC_G723 = 12;
    public static final int AUDIO_CODEC_G729 = 16;
    public static final int AUDIO_CODEC_GSM_EFR = 8;
    public static final int AUDIO_CODEC_GSM_FR = 9;
    public static final int AUDIO_CODEC_GSM_HR = 10;
    public static final int AUDIO_CODEC_NONE = 0;
    public static final int AUDIO_CODEC_QCELP13K = 3;
    public static final int CAPABILITY_ADD_PARTICIPANT = 67108864;
    public static final int CAPABILITY_CANNOT_DOWNGRADE_VIDEO_TO_AUDIO = 8388608;
    public static final int CAPABILITY_CAN_PAUSE_VIDEO = 1048576;
    public static final int CAPABILITY_CAN_PULL_CALL = 16777216;
    public static final int CAPABILITY_CAN_SEND_RESPONSE_VIA_CONNECTION = 4194304;
    @Deprecated
    public static final int CAPABILITY_CAN_UPGRADE_TO_VIDEO = 524288;
    public static final int CAPABILITY_DISCONNECT_FROM_CONFERENCE = 8192;
    public static final int CAPABILITY_HOLD = 1;
    public static final int CAPABILITY_MANAGE_CONFERENCE = 128;
    public static final int CAPABILITY_MERGE_CONFERENCE = 4;
    public static final int CAPABILITY_MUTE = 64;
    public static final int CAPABILITY_REMOTE_PARTY_SUPPORTS_RTT = 536870912;
    public static final int CAPABILITY_RESPOND_VIA_TEXT = 32;
    public static final int CAPABILITY_SEPARATE_FROM_CONFERENCE = 4096;
    public static final int CAPABILITY_SUPPORTS_VT_LOCAL_BIDIRECTIONAL = 768;
    public static final int CAPABILITY_SUPPORTS_VT_LOCAL_RX = 256;
    public static final int CAPABILITY_SUPPORTS_VT_LOCAL_TX = 512;
    public static final int CAPABILITY_SUPPORTS_VT_REMOTE_BIDIRECTIONAL = 3072;
    public static final int CAPABILITY_SUPPORTS_VT_REMOTE_RX = 1024;
    public static final int CAPABILITY_SUPPORTS_VT_REMOTE_TX = 2048;
    public static final int CAPABILITY_SUPPORT_DEFLECT = 33554432;
    public static final int CAPABILITY_SUPPORT_HOLD = 2;
    public static final int CAPABILITY_SWAP_CONFERENCE = 8;
    public static final String EVENT_CALL_HOLD_FAILED = "android.telecom.event.CALL_HOLD_FAILED";
    public static final String EVENT_CALL_MERGE_FAILED = "android.telecom.event.CALL_MERGE_FAILED";
    public static final String EVENT_CALL_PULL_FAILED = "android.telecom.event.CALL_PULL_FAILED";
    public static final String EVENT_CALL_REMOTELY_HELD = "android.telecom.event.CALL_REMOTELY_HELD";
    public static final String EVENT_CALL_REMOTELY_UNHELD = "android.telecom.event.CALL_REMOTELY_UNHELD";
    public static final String EVENT_CALL_SWITCH_FAILED = "android.telecom.event.CALL_SWITCH_FAILED";
    public static final String EVENT_MERGE_COMPLETE = "android.telecom.event.MERGE_COMPLETE";
    public static final String EVENT_MERGE_START = "android.telecom.event.MERGE_START";
    public static final String EVENT_ON_HOLD_TONE_END = "android.telecom.event.ON_HOLD_TONE_END";
    public static final String EVENT_ON_HOLD_TONE_START = "android.telecom.event.ON_HOLD_TONE_START";
    public static final String EVENT_RTT_AUDIO_INDICATION_CHANGED = "android.telecom.event.RTT_AUDIO_INDICATION_CHANGED";
    public static final String EXTRA_ANSWERING_DROPS_FG_CALL = "android.telecom.extra.ANSWERING_DROPS_FG_CALL";
    public static final String EXTRA_ANSWERING_DROPS_FG_CALL_APP_NAME = "android.telecom.extra.ANSWERING_DROPS_FG_CALL_APP_NAME";
    public static final String EXTRA_AUDIO_CODEC = "android.telecom.extra.AUDIO_CODEC";
    public static final String EXTRA_AUDIO_CODEC_BANDWIDTH_KHZ = "android.telecom.extra.AUDIO_CODEC_BANDWIDTH_KHZ";
    public static final String EXTRA_AUDIO_CODEC_BITRATE_KBPS = "android.telecom.extra.AUDIO_CODEC_BITRATE_KBPS";
    public static final String EXTRA_CALL_SUBJECT = "android.telecom.extra.CALL_SUBJECT";
    public static final String EXTRA_CHILD_ADDRESS = "android.telecom.extra.CHILD_ADDRESS";
    public static final String EXTRA_IS_RTT_AUDIO_PRESENT = "android.telecom.extra.IS_RTT_AUDIO_PRESENT";
    public static final String EXTRA_LAST_FORWARDED_NUMBER = "android.telecom.extra.LAST_FORWARDED_NUMBER";
    public static final String EXTRA_LAST_KNOWN_CELL_IDENTITY = "android.telecom.extra.LAST_KNOWN_CELL_IDENTITY";
    public static final String EXTRA_SIP_INVITE = "android.telecom.extra.SIP_INVITE";
    public static final int PROPERTY_ASSISTED_DIALING = 512;
    public static final int PROPERTY_CROSS_SIM = 8192;
    public static final int PROPERTY_HAS_CDMA_VOICE_PRIVACY = 32;
    public static final int PROPERTY_HIGH_DEF_AUDIO = 4;
    public static final int PROPERTY_IS_ADHOC_CONFERENCE = 4096;
    public static final int PROPERTY_IS_EXTERNAL_CALL = 16;
    public static final int PROPERTY_IS_RTT = 256;
    public static final int PROPERTY_NETWORK_IDENTIFIED_EMERGENCY_CALL = 1024;
    public static final int PROPERTY_SELF_MANAGED = 128;
    public static final int PROPERTY_WIFI = 8;
    public static final int STATE_ACTIVE = 4;
    public static final int STATE_DIALING = 3;
    public static final int STATE_DISCONNECTED = 6;
    public static final int STATE_HOLDING = 5;
    public static final int STATE_INITIALIZING = 0;
    public static final int STATE_NEW = 1;
    public static final int STATE_PULLING_CALL = 7;
    public static final int STATE_RINGING = 2;
    public static final int VERIFICATION_STATUS_FAILED = 2;
    public static final int VERIFICATION_STATUS_NOT_VERIFIED = 0;
    public static final int VERIFICATION_STATUS_PASSED = 1;
    
    public Connection() {
        throw new RuntimeException("Stub!");
    }
    
    public static String capabilitiesToString(final int capabilities) {
        throw new RuntimeException("Stub!");
    }
    
    public static String propertiesToString(final int properties) {
        throw new RuntimeException("Stub!");
    }
    
    public final Uri getAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getAddressPresentation() {
        throw new RuntimeException("Stub!");
    }
    
    public final String getCallerDisplayName() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getCallerDisplayNamePresentation() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getState() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getVideoState() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final CallAudioState getCallAudioState() {
        throw new RuntimeException("Stub!");
    }
    
    public final Conference getConference() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isRingbackRequested() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean getAudioModeIsVoip() {
        throw new RuntimeException("Stub!");
    }
    
    public final StatusHints getStatusHints() {
        throw new RuntimeException("Stub!");
    }
    
    public final Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    public final DisconnectCause getDisconnectCause() {
        throw new RuntimeException("Stub!");
    }
    
    public static String stateToString(final int state) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getConnectionCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getConnectionProperties() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setAddress(final Uri address, final int presentation) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setCallerDisplayName(final String callerDisplayName, final int presentation) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setVideoState(final int videoState) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setActive() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setRinging() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setInitializing() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setInitialized() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setDialing() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setPulling() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setOnHold() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setVideoProvider(final VideoProvider videoProvider) {
        throw new RuntimeException("Stub!");
    }
    
    public final VideoProvider getVideoProvider() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setDisconnected(final DisconnectCause disconnectCause) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setPostDialWait(final String remaining) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setNextPostDialChar(final char nextChar) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setRingbackRequested(final boolean ringback) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setConnectionCapabilities(final int connectionCapabilities) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setConnectionProperties(final int connectionProperties) {
        throw new RuntimeException("Stub!");
    }
    
    public final void destroy() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setAudioModeIsVoip(final boolean isVoip) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setStatusHints(final StatusHints statusHints) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setConferenceableConnections(final List<Connection> conferenceableConnections) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setConferenceables(final List<Conferenceable> conferenceables) {
        throw new RuntimeException("Stub!");
    }
    
    public final List<Conferenceable> getConferenceables() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setExtras(@Nullable final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public final void putExtras(@NonNull final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public final void removeExtras(final List<String> keys) {
        throw new RuntimeException("Stub!");
    }
    
    public final void removeExtras(final String... keys) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void setAudioRoute(final int route) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void requestBluetoothAudio(@NonNull final BluetoothDevice bluetoothDevice) {
        throw new RuntimeException("Stub!");
    }
    
    public final void requestCallEndpointChange(@NonNull final CallEndpoint endpoint, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Void, CallEndpointException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final CallEndpoint getCurrentCallEndpoint() {
        throw new RuntimeException("Stub!");
    }
    
    public final void sendRttInitiationSuccess() {
        throw new RuntimeException("Stub!");
    }
    
    public final void sendRttInitiationFailure(final int reason) {
        throw new RuntimeException("Stub!");
    }
    
    public final void sendRttSessionRemotelyTerminated() {
        throw new RuntimeException("Stub!");
    }
    
    public final void sendRemoteRttRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public final void queryLocationForEmergency(final long timeoutMillis, @NonNull final String provider, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Location, QueryLocationException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onCallAudioStateChanged(final CallAudioState state) {
        throw new RuntimeException("Stub!");
    }
    
    public void onCallEndpointChanged(@NonNull final CallEndpoint callEndpoint) {
        throw new RuntimeException("Stub!");
    }
    
    public void onAvailableCallEndpointsChanged(@NonNull final List<CallEndpoint> availableEndpoints) {
        throw new RuntimeException("Stub!");
    }
    
    public void onMuteStateChanged(final boolean isMuted) {
        throw new RuntimeException("Stub!");
    }
    
    public void onUsingAlternativeUi(final boolean isUsingAlternativeUi) {
        throw new RuntimeException("Stub!");
    }
    
    public void onTrackedByNonUiService(final boolean isTracked) {
        throw new RuntimeException("Stub!");
    }
    
    public void onStateChanged(final int state) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPlayDtmfTone(final char c) {
        throw new RuntimeException("Stub!");
    }
    
    public void onStopDtmfTone() {
        throw new RuntimeException("Stub!");
    }
    
    public void onDisconnect() {
        throw new RuntimeException("Stub!");
    }
    
    public void onSeparate() {
        throw new RuntimeException("Stub!");
    }
    
    public void onAddConferenceParticipants(@NonNull final List<Uri> participants) {
        throw new RuntimeException("Stub!");
    }
    
    public void onAbort() {
        throw new RuntimeException("Stub!");
    }
    
    public void onHold() {
        throw new RuntimeException("Stub!");
    }
    
    public void onUnhold() {
        throw new RuntimeException("Stub!");
    }
    
    public void onAnswer(final int videoState) {
        throw new RuntimeException("Stub!");
    }
    
    public void onAnswer() {
        throw new RuntimeException("Stub!");
    }
    
    public void onDeflect(final Uri address) {
        throw new RuntimeException("Stub!");
    }
    
    public void onReject() {
        throw new RuntimeException("Stub!");
    }
    
    public void onReject(final int rejectReason) {
        throw new RuntimeException("Stub!");
    }
    
    public void onReject(final String replyMessage) {
        throw new RuntimeException("Stub!");
    }
    
    public void onSilence() {
        throw new RuntimeException("Stub!");
    }
    
    public void onPostDialContinue(final boolean proceed) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPullExternalCall() {
        throw new RuntimeException("Stub!");
    }
    
    public void onCallEvent(final String event, final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public void onHandoverComplete() {
        throw new RuntimeException("Stub!");
    }
    
    public void onExtrasChanged(final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public void onShowIncomingCallUi() {
        throw new RuntimeException("Stub!");
    }
    
    public void onStartRtt(@NonNull final RttTextStream rttTextStream) {
        throw new RuntimeException("Stub!");
    }
    
    public void onStopRtt() {
        throw new RuntimeException("Stub!");
    }
    
    public void handleRttUpgradeResponse(@Nullable final RttTextStream rttTextStream) {
        throw new RuntimeException("Stub!");
    }
    
    public static Connection createFailedConnection(final DisconnectCause disconnectCause) {
        throw new RuntimeException("Stub!");
    }
    
    public static Connection createCanceledConnection() {
        throw new RuntimeException("Stub!");
    }
    
    public final void notifyConferenceMergeFailed() {
        throw new RuntimeException("Stub!");
    }
    
    public void sendConnectionEvent(final String event, final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getCallerNumberVerificationStatus() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setCallerNumberVerificationStatus(final int callerNumberVerificationStatus) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class RttModifyStatus
    {
        public static final int SESSION_MODIFY_REQUEST_FAIL = 2;
        public static final int SESSION_MODIFY_REQUEST_INVALID = 3;
        public static final int SESSION_MODIFY_REQUEST_REJECTED_BY_REMOTE = 5;
        public static final int SESSION_MODIFY_REQUEST_SUCCESS = 1;
        public static final int SESSION_MODIFY_REQUEST_TIMED_OUT = 4;
        
        RttModifyStatus() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class RttTextStream
    {
        RttTextStream() {
            throw new RuntimeException("Stub!");
        }
        
        public void write(final String input) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        public String read() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        public String readImmediately() throws IOException {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class VideoProvider
    {
        public static final int SESSION_EVENT_CAMERA_FAILURE = 5;
        public static final int SESSION_EVENT_CAMERA_PERMISSION_ERROR = 7;
        public static final int SESSION_EVENT_CAMERA_READY = 6;
        public static final int SESSION_EVENT_RX_PAUSE = 1;
        public static final int SESSION_EVENT_RX_RESUME = 2;
        public static final int SESSION_EVENT_TX_START = 3;
        public static final int SESSION_EVENT_TX_STOP = 4;
        public static final int SESSION_MODIFY_REQUEST_FAIL = 2;
        public static final int SESSION_MODIFY_REQUEST_INVALID = 3;
        public static final int SESSION_MODIFY_REQUEST_REJECTED_BY_REMOTE = 5;
        public static final int SESSION_MODIFY_REQUEST_SUCCESS = 1;
        public static final int SESSION_MODIFY_REQUEST_TIMED_OUT = 4;
        
        public VideoProvider() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onSetCamera(final String p0);
        
        public abstract void onSetPreviewSurface(final Surface p0);
        
        public abstract void onSetDisplaySurface(final Surface p0);
        
        public abstract void onSetDeviceOrientation(final int p0);
        
        public abstract void onSetZoom(final float p0);
        
        public abstract void onSendSessionModifyRequest(final VideoProfile p0, final VideoProfile p1);
        
        public abstract void onSendSessionModifyResponse(final VideoProfile p0);
        
        public abstract void onRequestCameraCapabilities();
        
        public abstract void onRequestConnectionDataUsage();
        
        public abstract void onSetPauseImage(final Uri p0);
        
        public void receiveSessionModifyRequest(final VideoProfile videoProfile) {
            throw new RuntimeException("Stub!");
        }
        
        public void receiveSessionModifyResponse(final int status, final VideoProfile requestedProfile, final VideoProfile responseProfile) {
            throw new RuntimeException("Stub!");
        }
        
        public void handleCallSessionEvent(final int event) {
            throw new RuntimeException("Stub!");
        }
        
        public void changePeerDimensions(final int width, final int height) {
            throw new RuntimeException("Stub!");
        }
        
        public void setCallDataUsage(final long dataUsage) {
            throw new RuntimeException("Stub!");
        }
        
        public void changeCameraCapabilities(final VideoProfile.CameraCapabilities cameraCapabilities) {
            throw new RuntimeException("Stub!");
        }
        
        public void changeVideoQuality(final int videoQuality) {
            throw new RuntimeException("Stub!");
        }
    }
}
