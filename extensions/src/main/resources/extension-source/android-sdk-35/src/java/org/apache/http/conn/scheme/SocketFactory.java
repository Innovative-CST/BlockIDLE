package org.apache.http.conn.scheme;

import java.net.UnknownHostException;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.params.HttpParams;
import java.net.InetAddress;
import java.io.IOException;
import java.net.Socket;

@Deprecated
public interface SocketFactory
{
    @Deprecated
    Socket createSocket() throws IOException;
    
    @Deprecated
    Socket connectSocket(final Socket p0, final String p1, final int p2, final InetAddress p3, final int p4, final HttpParams p5) throws ConnectTimeoutException, IOException, UnknownHostException;
    
    @Deprecated
    boolean isSecure(final Socket p0) throws IllegalArgumentException;
}
