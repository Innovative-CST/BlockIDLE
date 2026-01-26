package android.os;

public class RemoteCallbackList<E extends IInterface>
{
    public RemoteCallbackList() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean register(final E callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean register(final E callback, final Object cookie) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean unregister(final E callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void kill() {
        throw new RuntimeException("Stub!");
    }
    
    public void onCallbackDied(final E callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void onCallbackDied(final E callback, final Object cookie) {
        throw new RuntimeException("Stub!");
    }
    
    public int beginBroadcast() {
        throw new RuntimeException("Stub!");
    }
    
    public E getBroadcastItem(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public Object getBroadcastCookie(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void finishBroadcast() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRegisteredCallbackCount() {
        throw new RuntimeException("Stub!");
    }
    
    public E getRegisteredCallbackItem(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public Object getRegisteredCallbackCookie(final int index) {
        throw new RuntimeException("Stub!");
    }
}
