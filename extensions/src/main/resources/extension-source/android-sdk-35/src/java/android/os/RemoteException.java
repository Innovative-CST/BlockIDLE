package android.os;

import android.util.AndroidException;

public class RemoteException extends AndroidException
{
    public RemoteException() {
        throw new RuntimeException("Stub!");
    }
    
    public RemoteException(final String message) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public RuntimeException rethrowAsRuntimeException() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public RuntimeException rethrowFromSystemServer() {
        throw new RuntimeException("Stub!");
    }
}
