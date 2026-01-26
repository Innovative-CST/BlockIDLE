package javax.net.ssl;

public interface HostnameVerifier
{
    boolean verify(final String p0, final SSLSession p1);
}
