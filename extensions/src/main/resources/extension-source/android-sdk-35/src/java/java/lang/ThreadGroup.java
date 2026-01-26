package java.lang;

public class ThreadGroup implements Thread.UncaughtExceptionHandler {
	public ThreadGroup(final String name) {
		throw new RuntimeException("Stub!");
	}

	public ThreadGroup(final ThreadGroup parent, final String name) {
		throw new RuntimeException("Stub!");
	}

	public final String getName() {
		throw new RuntimeException("Stub!");
	}

	public final ThreadGroup getParent() {
		throw new RuntimeException("Stub!");
	}

	public final int getMaxPriority() {
		throw new RuntimeException("Stub!");
	}

	public final boolean isDaemon() {
		throw new RuntimeException("Stub!");
	}

	public synchronized boolean isDestroyed() {
		throw new RuntimeException("Stub!");
	}

	public final void setDaemon(final boolean daemon) {
		throw new RuntimeException("Stub!");
	}

	public final void setMaxPriority(final int pri) {
		throw new RuntimeException("Stub!");
	}

	public final boolean parentOf(final ThreadGroup g) {
		throw new RuntimeException("Stub!");
	}

	public final void checkAccess() {
		throw new RuntimeException("Stub!");
	}

	public int activeCount() {
		throw new RuntimeException("Stub!");
	}

	public int enumerate(final Thread[] list) {
		throw new RuntimeException("Stub!");
	}

	public int enumerate(final Thread[] list, final boolean recurse) {
		throw new RuntimeException("Stub!");
	}

	public int activeGroupCount() {
		throw new RuntimeException("Stub!");
	}

	public int enumerate(final ThreadGroup[] list) {
		throw new RuntimeException("Stub!");
	}

	public int enumerate(final ThreadGroup[] list, final boolean recurse) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public final void stop() {
		throw new RuntimeException("Stub!");
	}

	public final void interrupt() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public final void suspend() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public final void resume() {
		throw new RuntimeException("Stub!");
	}

	public final void destroy() {
		throw new RuntimeException("Stub!");
	}

	public void list() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void uncaughtException(final Thread t, final Throwable e) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public boolean allowThreadSuspension(final boolean b) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
