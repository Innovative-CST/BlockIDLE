package java.util.concurrent;

public class CyclicBarrier {
	public CyclicBarrier(final int parties, final Runnable barrierAction) {
		throw new RuntimeException("Stub!");
	}

	public CyclicBarrier(final int parties) {
		throw new RuntimeException("Stub!");
	}

	public int getParties() {
		throw new RuntimeException("Stub!");
	}

	public int await() throws BrokenBarrierException, InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public int await(final long timeout, final TimeUnit unit)
			throws BrokenBarrierException, InterruptedException, TimeoutException {
		throw new RuntimeException("Stub!");
	}

	public boolean isBroken() {
		throw new RuntimeException("Stub!");
	}

	public void reset() {
		throw new RuntimeException("Stub!");
	}

	public int getNumberWaiting() {
		throw new RuntimeException("Stub!");
	}
}
