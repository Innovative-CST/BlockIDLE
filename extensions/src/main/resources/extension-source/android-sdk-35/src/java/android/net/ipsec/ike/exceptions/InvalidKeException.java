package android.net.ipsec.ike.exceptions;

public final class InvalidKeException extends IkeProtocolException
{
    public InvalidKeException(final int dhGroup) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDhGroup() {
        throw new RuntimeException("Stub!");
    }
}
