package android.net.sip;

import android.os.Message;
import android.content.Context;

@Deprecated
public class SipAudioCall
{
    @Deprecated
    public SipAudioCall(final Context context, final SipProfile localProfile) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setListener(final Listener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setListener(final Listener listener, final boolean callbackImmediately) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isInCall() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isOnHold() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public SipProfile getLocalProfile() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public SipProfile getPeerProfile() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getState() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void attachCall(final SipSession session, final String sessionDescription) throws SipException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void makeCall(final SipProfile peerProfile, final SipSession sipSession, final int timeout) throws SipException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void endCall() throws SipException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void holdCall(final int timeout) throws SipException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void answerCall(final int timeout) throws SipException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void continueCall(final int timeout) throws SipException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void toggleMute() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isMuted() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSpeakerMode(final boolean speakerMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void sendDtmf(final int code) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void sendDtmf(final int code, final Message result) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void startAudio() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static class Listener
    {
        @Deprecated
        public Listener() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onReadyToCall(final SipAudioCall call) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onCalling(final SipAudioCall call) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onRinging(final SipAudioCall call, final SipProfile caller) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onRingingBack(final SipAudioCall call) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onCallEstablished(final SipAudioCall call) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onCallEnded(final SipAudioCall call) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onCallBusy(final SipAudioCall call) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onCallHeld(final SipAudioCall call) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onError(final SipAudioCall call, final int errorCode, final String errorMessage) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onChanged(final SipAudioCall call) {
            throw new RuntimeException("Stub!");
        }
    }
}
