package java.nio.channels;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;

public abstract class MembershipKey {
	protected MembershipKey() {
		throw new RuntimeException("Stub!");
	}

	public abstract boolean isValid();

	public abstract void drop();

	public abstract MembershipKey block(final InetAddress p0) throws IOException;

	public abstract MembershipKey unblock(final InetAddress p0);

	public abstract MulticastChannel channel();

	public abstract InetAddress group();

	public abstract NetworkInterface networkInterface();

	public abstract InetAddress sourceAddress();
}
