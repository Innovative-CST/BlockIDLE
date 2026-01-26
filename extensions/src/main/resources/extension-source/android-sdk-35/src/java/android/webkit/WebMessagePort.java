package android.webkit;

import android.os.Handler;

public abstract class WebMessagePort
{
    WebMessagePort() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void postMessage(final WebMessage p0);
    
    public abstract void close();
    
    public abstract void setWebMessageCallback(final WebMessageCallback p0);
    
    public abstract void setWebMessageCallback(final WebMessageCallback p0, final Handler p1);
    
    public abstract static class WebMessageCallback
    {
        public WebMessageCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onMessage(final WebMessagePort port, final WebMessage message) {
            throw new RuntimeException("Stub!");
        }
    }
}
