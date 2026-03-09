package android.net.ipsec.ike.exceptions;

public final class InvalidMajorVersionException extends IkeProtocolException
{
    public InvalidMajorVersionException(final byte version) {
        throw new RuntimeException("Stub!");
    }
    
    public byte getMajorVersion() {
        throw new RuntimeException("Stub!");
    }
}
