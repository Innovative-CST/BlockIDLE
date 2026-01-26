package android.webkit;

public abstract class WebResourceError
{
    WebResourceError() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int getErrorCode();
    
    public abstract CharSequence getDescription();
}
