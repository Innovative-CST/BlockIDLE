package android.net;

import android.content.Context;

public final class Proxy
{
    public static final String PROXY_CHANGE_ACTION = "android.intent.action.PROXY_CHANGE";
    
    public Proxy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static String getHost(final Context ctx) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getPort(final Context ctx) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static String getDefaultHost() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getDefaultPort() {
        throw new RuntimeException("Stub!");
    }
}
