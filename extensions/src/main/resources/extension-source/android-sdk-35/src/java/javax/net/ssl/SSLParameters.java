package javax.net.ssl;

import java.util.Collection;
import java.util.List;
import java.security.AlgorithmConstraints;

public class SSLParameters
{
    public SSLParameters() {
        throw new RuntimeException("Stub!");
    }
    
    public SSLParameters(final String[] cipherSuites) {
        throw new RuntimeException("Stub!");
    }
    
    public SSLParameters(final String[] cipherSuites, final String[] protocols) {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getCipherSuites() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCipherSuites(final String[] cipherSuites) {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getProtocols() {
        throw new RuntimeException("Stub!");
    }
    
    public void setProtocols(final String[] protocols) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getWantClientAuth() {
        throw new RuntimeException("Stub!");
    }
    
    public void setWantClientAuth(final boolean wantClientAuth) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getNeedClientAuth() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNeedClientAuth(final boolean needClientAuth) {
        throw new RuntimeException("Stub!");
    }
    
    public AlgorithmConstraints getAlgorithmConstraints() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAlgorithmConstraints(final AlgorithmConstraints constraints) {
        throw new RuntimeException("Stub!");
    }
    
    public String getEndpointIdentificationAlgorithm() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEndpointIdentificationAlgorithm(final String algorithm) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setServerNames(final List<SNIServerName> serverNames) {
        throw new RuntimeException("Stub!");
    }
    
    public final List<SNIServerName> getServerNames() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setSNIMatchers(final Collection<SNIMatcher> matchers) {
        throw new RuntimeException("Stub!");
    }
    
    public final Collection<SNIMatcher> getSNIMatchers() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setUseCipherSuitesOrder(final boolean honorOrder) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean getUseCipherSuitesOrder() {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getApplicationProtocols() {
        throw new RuntimeException("Stub!");
    }
    
    public void setApplicationProtocols(final String[] protocols) {
        throw new RuntimeException("Stub!");
    }
}
