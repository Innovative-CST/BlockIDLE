package java.lang;

public class Object {
	public Object() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public final Class<?> getClass() {
		throw new RuntimeException("Stub!");
	}

	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	public boolean equals(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	protected Object clone() throws CloneNotSupportedException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public final native void notify();

	public final native void notifyAll();

	public final void wait(final long timeoutMillis) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public final native void wait(final long p0, final int p1) throws InterruptedException;

	public final void wait() throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	protected void finalize() throws Throwable {
		throw new RuntimeException("Stub!");
	}
}
