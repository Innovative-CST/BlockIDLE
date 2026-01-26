package java.nio.channels;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;

public interface MulticastChannel extends NetworkChannel {
	void close() throws IOException;

	MembershipKey join(final InetAddress p0, final NetworkInterface p1) throws IOException;

	MembershipKey join(final InetAddress p0, final NetworkInterface p1, final InetAddress p2) throws IOException;
}
