package java.util.concurrent.locks;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class AbstractQueuedLongSynchronizer extends AbstractOwnableSynchronizer implements Serializable {
	protected AbstractQueuedLongSynchronizer() {
		throw new RuntimeException("Stub!");
	}

	protected final long getState() {
		throw new RuntimeException("Stub!");
	}

	protected final void setState(final long newState) {
		throw new RuntimeException("Stub!");
	}

	protected final boolean compareAndSetState(final long expect, final long update) {
		throw new RuntimeException("Stub!");
	}

	protected boolean tryAcquire(final long arg) {
		throw new RuntimeException("Stub!");
	}

	protected boolean tryRelease(final long arg) {
		throw new RuntimeException("Stub!");
	}

	protected long tryAcquireShared(final long arg) {
		throw new RuntimeException("Stub!");
	}

	protected boolean tryReleaseShared(final long arg) {
		throw new RuntimeException("Stub!");
	}

	protected boolean isHeldExclusively() {
		throw new RuntimeException("Stub!");
	}

	public final void acquire(final long arg) {
		throw new RuntimeException("Stub!");
	}

	public final void acquireInterruptibly(final long arg) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public final boolean tryAcquireNanos(final long arg, final long nanosTimeout) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public final boolean release(final long arg) {
		throw new RuntimeException("Stub!");
	}

	public final void acquireShared(final long arg) {
		throw new RuntimeException("Stub!");
	}

	public final void acquireSharedInterruptibly(final long arg) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public final boolean tryAcquireSharedNanos(final long arg, final long nanosTimeout) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public final boolean releaseShared(final long arg) {
		throw new RuntimeException("Stub!");
	}

	public final boolean hasQueuedThreads() {
		throw new RuntimeException("Stub!");
	}

	public final boolean hasContended() {
		throw new RuntimeException("Stub!");
	}

	public final Thread getFirstQueuedThread() {
		throw new RuntimeException("Stub!");
	}

	public final boolean isQueued(final Thread thread) {
		throw new RuntimeException("Stub!");
	}

	public final boolean hasQueuedPredecessors() {
		throw new RuntimeException("Stub!");
	}

	public final int getQueueLength() {
		throw new RuntimeException("Stub!");
	}

	public final Collection<Thread> getQueuedThreads() {
		throw new RuntimeException("Stub!");
	}

	public final Collection<Thread> getExclusiveQueuedThreads() {
		throw new RuntimeException("Stub!");
	}

	public final Collection<Thread> getSharedQueuedThreads() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public final boolean owns(final ConditionObject condition) {
		throw new RuntimeException("Stub!");
	}

	public final boolean hasWaiters(final ConditionObject condition) {
		throw new RuntimeException("Stub!");
	}

	public final int getWaitQueueLength(final ConditionObject condition) {
		throw new RuntimeException("Stub!");
	}

	public final Collection<Thread> getWaitingThreads(final ConditionObject condition) {
		throw new RuntimeException("Stub!");
	}

	public class ConditionObject implements Condition, Serializable {
		public ConditionObject() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public final void signal() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public final void signalAll() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public final void awaitUninterruptibly() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public final void await() throws InterruptedException {
			throw new RuntimeException("Stub!");
		}

		@Override
		public final long awaitNanos(final long nanosTimeout) throws InterruptedException {
			throw new RuntimeException("Stub!");
		}

		@Override
		public final boolean awaitUntil(final Date deadline) throws InterruptedException {
			throw new RuntimeException("Stub!");
		}

		@Override
		public final boolean await(final long time, final TimeUnit unit) throws InterruptedException {
			throw new RuntimeException("Stub!");
		}

		protected final boolean hasWaiters() {
			throw new RuntimeException("Stub!");
		}

		protected final int getWaitQueueLength() {
			throw new RuntimeException("Stub!");
		}

		protected final Collection<Thread> getWaitingThreads() {
			throw new RuntimeException("Stub!");
		}
	}
}
