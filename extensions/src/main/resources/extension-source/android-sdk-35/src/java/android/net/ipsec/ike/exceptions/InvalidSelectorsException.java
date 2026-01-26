package android.net.ipsec.ike.exceptions;

public final class InvalidSelectorsException extends IkeProtocolException
{
    public InvalidSelectorsException(final int spi, @NonNull final byte[] packetInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public int getIpSecSpi() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] getIpSecPacketInfo() {
        throw new RuntimeException("Stub!");
    }
}
