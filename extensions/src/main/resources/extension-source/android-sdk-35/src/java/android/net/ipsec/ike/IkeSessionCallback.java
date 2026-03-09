package android.net.ipsec.ike;

import android.net.ipsec.ike.exceptions.IkeException;

public interface IkeSessionCallback
{
    void onOpened(@NonNull final IkeSessionConfiguration p0);
    
    void onClosed();
    
    default void onClosedWithException(@NonNull final IkeException exception) {
        throw new RuntimeException("Stub!");
    }
    
    default void onError(@NonNull final IkeException exception) {
        throw new RuntimeException("Stub!");
    }
}
