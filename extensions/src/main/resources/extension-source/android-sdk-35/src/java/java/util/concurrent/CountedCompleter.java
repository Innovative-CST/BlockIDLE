package java.util.concurrent;

public abstract class CountedCompleter<T> extends ForkJoinTask<T> {
	protected CountedCompleter(final CountedCompleter<?> completer, final int initialPendingCount) {
		throw new RuntimeException("Stub!");
	}

	protected CountedCompleter(final CountedCompleter<?> completer) {
		throw new RuntimeException("Stub!");
	}

	protected CountedCompleter() {
		throw new RuntimeException("Stub!");
	}

	public abstract void compute();

	public void onCompletion(final CountedCompleter<?> caller) {
		throw new RuntimeException("Stub!");
	}

	public boolean onExceptionalCompletion(final Throwable ex, final CountedCompleter<?> caller) {
		throw new RuntimeException("Stub!");
	}

	public final CountedCompleter<?> getCompleter() {
		throw new RuntimeException("Stub!");
	}

	public final int getPendingCount() {
		throw new RuntimeException("Stub!");
	}

	public final void setPendingCount(final int count) {
		throw new RuntimeException("Stub!");
	}

	public final void addToPendingCount(final int delta) {
		throw new RuntimeException("Stub!");
	}

	public final boolean compareAndSetPendingCount(final int expected, final int count) {
		throw new RuntimeException("Stub!");
	}

	public final int decrementPendingCountUnlessZero() {
		throw new RuntimeException("Stub!");
	}

	public final CountedCompleter<?> getRoot() {
		throw new RuntimeException("Stub!");
	}

	public final void tryComplete() {
		throw new RuntimeException("Stub!");
	}

	public final void propagateCompletion() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void complete(final T rawResult) {
		throw new RuntimeException("Stub!");
	}

	public final CountedCompleter<?> firstComplete() {
		throw new RuntimeException("Stub!");
	}

	public final CountedCompleter<?> nextComplete() {
		throw new RuntimeException("Stub!");
	}

	public final void quietlyCompleteRoot() {
		throw new RuntimeException("Stub!");
	}

	public final void helpComplete(final int maxTasks) {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected final boolean exec() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public T getRawResult() {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected void setRawResult(final T t) {
		throw new RuntimeException("Stub!");
	}
}
