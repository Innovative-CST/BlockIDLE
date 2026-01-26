package java.util.concurrent;

public class Phaser {
	public Phaser() {
		throw new RuntimeException("Stub!");
	}

	public Phaser(final int parties) {
		throw new RuntimeException("Stub!");
	}

	public Phaser(final Phaser parent) {
		throw new RuntimeException("Stub!");
	}

	public Phaser(final Phaser parent, final int parties) {
		throw new RuntimeException("Stub!");
	}

	public int register() {
		throw new RuntimeException("Stub!");
	}

	public int bulkRegister(final int parties) {
		throw new RuntimeException("Stub!");
	}

	public int arrive() {
		throw new RuntimeException("Stub!");
	}

	public int arriveAndDeregister() {
		throw new RuntimeException("Stub!");
	}

	public int arriveAndAwaitAdvance() {
		throw new RuntimeException("Stub!");
	}

	public int awaitAdvance(final int phase) {
		throw new RuntimeException("Stub!");
	}

	public int awaitAdvanceInterruptibly(final int phase) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public int awaitAdvanceInterruptibly(final int phase, final long timeout, final TimeUnit unit)
			throws InterruptedException, TimeoutException {
		throw new RuntimeException("Stub!");
	}

	public void forceTermination() {
		throw new RuntimeException("Stub!");
	}

	public final int getPhase() {
		throw new RuntimeException("Stub!");
	}

	public int getRegisteredParties() {
		throw new RuntimeException("Stub!");
	}

	public int getArrivedParties() {
		throw new RuntimeException("Stub!");
	}

	public int getUnarrivedParties() {
		throw new RuntimeException("Stub!");
	}

	public Phaser getParent() {
		throw new RuntimeException("Stub!");
	}

	public Phaser getRoot() {
		throw new RuntimeException("Stub!");
	}

	public boolean isTerminated() {
		throw new RuntimeException("Stub!");
	}

	protected boolean onAdvance(final int phase, final int registeredParties) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
