package javax.net.ssl;

import java.security.Principal;

public abstract class X509ExtendedKeyManager implements X509KeyManager
{
    protected X509ExtendedKeyManager() {
        throw new RuntimeException("Stub!");
    }
    
    public String chooseEngineClientAlias(final String[] keyType, final Principal[] issuers, final SSLEngine engine) {
        throw new RuntimeException("Stub!");
    }
    
    public String chooseEngineServerAlias(final String keyType, final Principal[] issuers, final SSLEngine engine) {
        throw new RuntimeException("Stub!");
    }
}
