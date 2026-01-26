package javax.net.ssl;

import java.util.List;

public abstract class ExtendedSSLSession implements SSLSession
{
    public ExtendedSSLSession() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract String[] getLocalSupportedSignatureAlgorithms();
    
    public abstract String[] getPeerSupportedSignatureAlgorithms();
    
    public List<SNIServerName> getRequestedServerNames() {
        throw new RuntimeException("Stub!");
    }
}
