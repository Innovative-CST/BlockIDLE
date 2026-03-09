package android.webkit;

public abstract class SafeBrowsingResponse
{
    @Deprecated
    public SafeBrowsingResponse() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void showInterstitial(final boolean p0);
    
    public abstract void proceed(final boolean p0);
    
    public abstract void backToSafety(final boolean p0);
}
