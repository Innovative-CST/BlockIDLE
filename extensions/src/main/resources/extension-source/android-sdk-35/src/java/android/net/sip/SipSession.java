package android.net.sip;

@Deprecated
public final class SipSession
{
    SipSession() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getLocalIp() {
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
    public boolean isInCall() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getCallId() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setListener(final Listener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void register(final int duration) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void unregister() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void makeCall(final SipProfile callee, final String sessionDescription, final int timeout) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void answerCall(final String sessionDescription, final int timeout) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void endCall() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void changeCall(final String sessionDescription, final int timeout) {
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
        public void onCalling(final SipSession session) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onRinging(final SipSession session, final SipProfile caller, final String sessionDescription) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onRingingBack(final SipSession session) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onCallEstablished(final SipSession session, final String sessionDescription) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onCallEnded(final SipSession session) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onCallBusy(final SipSession session) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onError(final SipSession session, final int errorCode, final String errorMessage) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onCallChangeFailed(final SipSession session, final int errorCode, final String errorMessage) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onRegistering(final SipSession session) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onRegistrationDone(final SipSession session, final int duration) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onRegistrationFailed(final SipSession session, final int errorCode, final String errorMessage) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onRegistrationTimeout(final SipSession session) {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static class State
    {
        @Deprecated
        public static final int DEREGISTERING = 2;
        @Deprecated
        public static final int INCOMING_CALL = 3;
        @Deprecated
        public static final int INCOMING_CALL_ANSWERING = 4;
        @Deprecated
        public static final int IN_CALL = 8;
        @Deprecated
        public static final int NOT_DEFINED = 101;
        @Deprecated
        public static final int OUTGOING_CALL = 5;
        @Deprecated
        public static final int OUTGOING_CALL_CANCELING = 7;
        @Deprecated
        public static final int OUTGOING_CALL_RING_BACK = 6;
        @Deprecated
        public static final int PINGING = 9;
        @Deprecated
        public static final int READY_TO_CALL = 0;
        @Deprecated
        public static final int REGISTERING = 1;
        
        State() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public static String toString(final int state) {
            throw new RuntimeException("Stub!");
        }
    }
}
