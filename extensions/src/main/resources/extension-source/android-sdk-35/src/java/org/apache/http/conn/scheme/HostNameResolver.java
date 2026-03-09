package org.apache.http.conn.scheme;

import java.io.IOException;
import java.net.InetAddress;

@Deprecated
public interface HostNameResolver
{
    @Deprecated
    InetAddress resolve(final String p0) throws IOException;
}
