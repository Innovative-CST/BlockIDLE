package java.util.concurrent.locks;

import java.util.concurrent.TimeUnit;

public interface Lock {
	void lock();

	void lockInterruptibly() throws InterruptedException;

	boolean tryLock();

	boolean tryLock(final long p0, final TimeUnit p1) throws InterruptedException;

	void unlock();

	Condition newCondition();
}
