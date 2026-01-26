package javax.net.ssl;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.net.Socket;
import java.security.Principal;

public interface X509KeyManager extends KeyManager
{
    String[] getClientAliases(final String p0, final Principal[] p1);
    
    String chooseClientAlias(final String[] p0, final Principal[] p1, final Socket p2);
    
    String[] getServerAliases(final String p0, final Principal[] p1);
    
    String chooseServerAlias(final String p0, final Principal[] p1, final Socket p2);
    
    X509Certificate[] getCertificateChain(final String p0);
    
    PrivateKey getPrivateKey(final String p0);
}
