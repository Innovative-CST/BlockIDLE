package java.util.concurrent;

public interface RejectedExecutionHandler {
	void rejectedExecution(final Runnable p0, final ThreadPoolExecutor p1);
}
