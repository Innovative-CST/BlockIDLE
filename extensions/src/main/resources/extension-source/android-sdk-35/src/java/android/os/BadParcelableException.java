package android.os;

import android.util.AndroidRuntimeException;

public class BadParcelableException extends AndroidRuntimeException
{
    public BadParcelableException(final String msg) {
        throw new RuntimeException("Stub!");
    }
    
    public BadParcelableException(final Exception cause) {
        throw new RuntimeException("Stub!");
    }
}
