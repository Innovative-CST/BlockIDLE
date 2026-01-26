package android.net.sip;

@Deprecated
public interface SipRegistrationListener
{
    @Deprecated
    void onRegistering(final String p0);
    
    @Deprecated
    void onRegistrationDone(final String p0, final long p1);
    
    @Deprecated
    void onRegistrationFailed(final String p0, final int p1, final String p2);
}
