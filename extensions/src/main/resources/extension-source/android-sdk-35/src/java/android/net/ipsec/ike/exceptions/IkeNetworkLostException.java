package android.net.ipsec.ike.exceptions;

import android.net.Network;

public final class IkeNetworkLostException extends IkeNonProtocolException
{
    public IkeNetworkLostException(@NonNull final Network network) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Network getNetwork() {
        throw new RuntimeException("Stub!");
    }
}
