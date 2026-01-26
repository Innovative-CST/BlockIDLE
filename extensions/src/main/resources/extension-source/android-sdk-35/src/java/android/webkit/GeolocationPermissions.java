package android.webkit;

import java.util.Set;

public class GeolocationPermissions
{
    GeolocationPermissions() {
        throw new RuntimeException("Stub!");
    }
    
    public static GeolocationPermissions getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public void getOrigins(final ValueCallback<Set<String>> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getAllowed(final String origin, final ValueCallback<Boolean> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void clear(final String origin) {
        throw new RuntimeException("Stub!");
    }
    
    public void allow(final String origin) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearAll() {
        throw new RuntimeException("Stub!");
    }
    
    public interface Callback
    {
        void invoke(final String p0, final boolean p1, final boolean p2);
    }
}
