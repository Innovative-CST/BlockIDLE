package java.nio.channels;

import java.io.IOException;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.nio.channels.spi.SelectorProvider;

public abstract class Pipe {
	protected Pipe() {
		throw new RuntimeException("Stub!");
	}

	public abstract SourceChannel source();

	public abstract SinkChannel sink();

	public static Pipe open() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public abstract static class SinkChannel extends AbstractSelectableChannel
			implements WritableByteChannel, GatheringByteChannel {
		protected SinkChannel(final SelectorProvider provider) {
			super(null);
			throw new RuntimeException("Stub!");
		}

		@Override
		public final int validOps() {
			throw new RuntimeException("Stub!");
		}
	}

	public abstract static class SourceChannel extends AbstractSelectableChannel
			implements ReadableByteChannel, ScatteringByteChannel {
		protected SourceChannel(final SelectorProvider provider) {
			super(null);
			throw new RuntimeException("Stub!");
		}

		@Override
		public final int validOps() {
			throw new RuntimeException("Stub!");
		}
	}
}
