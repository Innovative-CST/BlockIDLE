package java.util.concurrent;

public abstract class RecursiveTask<V> extends ForkJoinTask<V> {
	public RecursiveTask() {
		throw new RuntimeException("Stub!");
	}

	protected abstract V compute();

	@Override
	public final V getRawResult() {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected final void setRawResult(final V value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected final boolean exec() {
		throw new RuntimeException("Stub!");
	}
}
