package java.util.concurrent;

public abstract class RecursiveAction extends ForkJoinTask<Void> {
	public RecursiveAction() {
		throw new RuntimeException("Stub!");
	}

	protected abstract void compute();

	@Override
	public final Void getRawResult() {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected final void setRawResult(final Void mustBeNull) {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected final boolean exec() {
		throw new RuntimeException("Stub!");
	}
}
