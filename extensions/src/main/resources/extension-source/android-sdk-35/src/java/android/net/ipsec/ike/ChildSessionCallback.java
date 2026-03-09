package android.net.ipsec.ike;

import android.net.IpSecTransform;
import android.net.ipsec.ike.exceptions.IkeException;

public interface ChildSessionCallback
{
    void onOpened(@NonNull final ChildSessionConfiguration p0);
    
    void onClosed();
    
    default void onClosedWithException(@NonNull final IkeException exception) {
        throw new RuntimeException("Stub!");
    }
    
    void onIpSecTransformCreated(@NonNull final IpSecTransform p0, final int p1);
    
    void onIpSecTransformDeleted(@NonNull final IpSecTransform p0, final int p1);
}
