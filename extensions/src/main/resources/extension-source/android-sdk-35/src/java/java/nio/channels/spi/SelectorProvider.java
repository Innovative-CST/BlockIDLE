package java.nio.channels.spi;

import java.io.IOException;
import java.net.ProtocolFamily;
import java.nio.channels.Channel;
import java.nio.channels.DatagramChannel;
import java.nio.channels.Pipe;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public abstract class SelectorProvider {
	protected SelectorProvider() {
		throw new RuntimeException("Stub!");
	}

	public static SelectorProvider provider() {
		throw new RuntimeException("Stub!");
	}

	public abstract DatagramChannel openDatagramChannel() throws IOException;

	public abstract DatagramChannel openDatagramChannel(final ProtocolFamily p0) throws IOException;

	public abstract Pipe openPipe() throws IOException;

	public abstract AbstractSelector openSelector() throws IOException;

	public abstract ServerSocketChannel openServerSocketChannel() throws IOException;

	public abstract SocketChannel openSocketChannel() throws IOException;

	public Channel inheritedChannel() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
