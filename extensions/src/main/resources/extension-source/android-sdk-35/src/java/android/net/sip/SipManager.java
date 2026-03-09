package android.net.sip;

import android.content.Intent;
import android.app.PendingIntent;
import android.content.Context;

@Deprecated
public class SipManager
{
    @Deprecated
    public static final String EXTRA_CALL_ID = "android:sipCallID";
    @Deprecated
    public static final String EXTRA_OFFER_SD = "android:sipOfferSD";
    @Deprecated
    public static final int INCOMING_CALL_RESULT_CODE = 101;
    
    SipManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static SipManager newInstance(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static boolean isApiSupported(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static boolean isVoipSupported(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static boolean isSipWifiOnly(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void open(final SipProfile localProfile) throws SipException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void open(final SipProfile localProfile, final PendingIntent incomingCallPendingIntent, final SipRegistrationListener listener) throws SipException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setRegistrationListener(final String localProfileUri, final SipRegistrationListener listener) throws SipException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void close(final String localProfileUri) throws SipException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isOpened(final String localProfileUri) throws SipException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isRegistered(final String localProfileUri) throws SipException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public SipAudioCall makeAudioCall(final SipProfile localProfile, final SipProfile peerProfile, final SipAudioCall.Listener listener, final int timeout) throws SipException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public SipAudioCall makeAudioCall(final String localProfileUri, final String peerProfileUri, final SipAudioCall.Listener listener, final int timeout) throws SipException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public SipAudioCall takeAudioCall(final Intent incomingCallIntent, final SipAudioCall.Listener listener) throws SipException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static boolean isIncomingCallIntent(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static String getCallId(final Intent incomingCallIntent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static String getOfferSessionDescription(final Intent incomingCallIntent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void register(final SipProfile localProfile, final int expiryTime, final SipRegistrationListener listener) throws SipException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void unregister(final SipProfile localProfile, final SipRegistrationListener listener) throws SipException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public SipSession getSessionFor(final Intent incomingCallIntent) throws SipException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public SipSession createSipSession(final SipProfile localProfile, final SipSession.Listener listener) throws SipException {
        throw new RuntimeException("Stub!");
    }
}
