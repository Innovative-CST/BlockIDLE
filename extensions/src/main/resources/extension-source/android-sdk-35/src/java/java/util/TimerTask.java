package java.util;

public abstract class TimerTask implements Runnable {
	protected TimerTask() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract void run();

	public boolean cancel() {
		throw new RuntimeException("Stub!");
	}

	public long scheduledExecutionTime() {
		throw new RuntimeException("Stub!");
	}
}
