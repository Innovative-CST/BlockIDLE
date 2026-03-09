package java.util.concurrent.locks;

import java.io.Serializable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public class ReentrantLock implements Lock, Serializable {
	public ReentrantLock() {
		throw new RuntimeException("Stub!");
	}

	public ReentrantLock(final boolean fair) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void lock() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void lockInterruptibly() throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean tryLock() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean tryLock(final long timeout, final TimeUnit unit) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void unlock() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Condition newCondition() {
		throw new RuntimeException("Stub!");
	}

	public int getHoldCount() {
		throw new RuntimeException("Stub!");
	}

	public boolean isHeldByCurrentThread() {
		throw new RuntimeException("Stub!");
	}

	public boolean isLocked() {
		throw new RuntimeException("Stub!");
	}

	public final boolean isFair() {
		throw new RuntimeException("Stub!");
	}

	protected Thread getOwner() {
		throw new RuntimeException("Stub!");
	}

	public final boolean hasQueuedThreads() {
		throw new RuntimeException("Stub!");
	}

	public final boolean hasQueuedThread(final Thread thread) {
		throw new RuntimeException("Stub!");
	}

	public final int getQueueLength() {
		throw new RuntimeException("Stub!");
	}

	protected Collection<Thread> getQueuedThreads() {
		throw new RuntimeException("Stub!");
	}

	public boolean hasWaiters(final Condition condition) {
		throw new RuntimeException("Stub!");
	}

	public int getWaitQueueLength(final Condition condition) {
		throw new RuntimeException("Stub!");
	}

	protected Collection<Thread> getWaitingThreads(final Condition condition) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
