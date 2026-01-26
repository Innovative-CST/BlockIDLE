package java.util.concurrent.locks;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public interface Condition {
	void await() throws InterruptedException;

	void awaitUninterruptibly();

	long awaitNanos(final long p0) throws InterruptedException;

	boolean await(final long p0, final TimeUnit p1) throws InterruptedException;

	boolean awaitUntil(final Date p0) throws InterruptedException;

	void signal();

	void signalAll();
}
