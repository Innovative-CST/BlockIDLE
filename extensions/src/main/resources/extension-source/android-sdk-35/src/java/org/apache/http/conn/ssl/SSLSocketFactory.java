package org.apache.http.conn.ssl;

import java.net.UnknownHostException;
import org.apache.http.params.HttpParams;
import java.net.InetAddress;
import java.io.IOException;
import java.net.Socket;
import java.security.UnrecoverableKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.KeyStoreException;
import java.security.KeyManagementException;
import org.apache.http.conn.scheme.HostNameResolver;
import java.security.SecureRandom;
import java.security.KeyStore;
import org.apache.http.conn.scheme.LayeredSocketFactory;

@Deprecated
public class SSLSocketFactory implements LayeredSocketFactory
{
    @Deprecated
    public static final X509HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER;
    @Deprecated
    public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
    @Deprecated
    public static final String SSL = "SSL";
    @Deprecated
    public static final String SSLV2 = "SSLv2";
    @Deprecated
    public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER;
    @Deprecated
    public static final String TLS = "TLS";
    
    @Deprecated
    public SSLSocketFactory(final String algorithm, final KeyStore keystore, final String keystorePassword, final KeyStore truststore, final SecureRandom random, final HostNameResolver nameResolver) throws KeyManagementException, KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public SSLSocketFactory(final KeyStore keystore, final String keystorePassword, final KeyStore truststore) throws KeyManagementException, KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public SSLSocketFactory(final KeyStore keystore, final String keystorePassword) throws KeyManagementException, KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public SSLSocketFactory(final KeyStore truststore) throws KeyManagementException, KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static SSLSocketFactory getSocketFactory() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public Socket createSocket() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public Socket connectSocket(final Socket sock, final String host, final int port, final InetAddress localAddress, final int localPort, final HttpParams params) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean isSecure(final Socket sock) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public Socket createSocket(final Socket socket, final String host, final int port, final boolean autoClose) throws IOException, UnknownHostException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setHostnameVerifier(final X509HostnameVerifier hostnameVerifier) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public X509HostnameVerifier getHostnameVerifier() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        ALLOW_ALL_HOSTNAME_VERIFIER = null;
        BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = null;
        STRICT_HOSTNAME_VERIFIER = null;
    }
}
