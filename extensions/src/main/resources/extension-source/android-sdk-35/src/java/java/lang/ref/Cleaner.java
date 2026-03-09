package java.lang.ref;

import java.util.concurrent.ThreadFactory;

public final class Cleaner {
	Cleaner() {
		throw new RuntimeException("Stub!");
	}

	public static Cleaner create() {
		throw new RuntimeException("Stub!");
	}

	public static Cleaner create(final ThreadFactory threadFactory) {
		throw new RuntimeException("Stub!");
	}

	public Cleanable register(final Object obj, final Runnable action) {
		throw new RuntimeException("Stub!");
	}

	public interface Cleanable {
		void clean();
	}
}
