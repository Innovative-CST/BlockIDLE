package java.util.concurrent;

import java.io.Serializable;
import java.util.Collection;

public class Semaphore implements Serializable {
	public Semaphore(final int permits) {
		throw new RuntimeException("Stub!");
	}

	public Semaphore(final int permits, final boolean fair) {
		throw new RuntimeException("Stub!");
	}

	public void acquire() throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public void acquireUninterruptibly() {
		throw new RuntimeException("Stub!");
	}

	public boolean tryAcquire() {
		throw new RuntimeException("Stub!");
	}

	public boolean tryAcquire(final long timeout, final TimeUnit unit) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public void release() {
		throw new RuntimeException("Stub!");
	}

	public void acquire(final int permits) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public void acquireUninterruptibly(final int permits) {
		throw new RuntimeException("Stub!");
	}

	public boolean tryAcquire(final int permits) {
		throw new RuntimeException("Stub!");
	}

	public boolean tryAcquire(final int permits, final long timeout, final TimeUnit unit) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public void release(final int permits) {
		throw new RuntimeException("Stub!");
	}

	public int availablePermits() {
		throw new RuntimeException("Stub!");
	}

	public int drainPermits() {
		throw new RuntimeException("Stub!");
	}

	protected void reducePermits(final int reduction) {
		throw new RuntimeException("Stub!");
	}

	public boolean isFair() {
		throw new RuntimeException("Stub!");
	}

	public final boolean hasQueuedThreads() {
		throw new RuntimeException("Stub!");
	}

	public final int getQueueLength() {
		throw new RuntimeException("Stub!");
	}

	protected Collection<Thread> getQueuedThreads() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
