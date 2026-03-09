package java.lang;

import java.util.Map;

public class Thread implements Runnable {
	public static final int MAX_PRIORITY = 10;
	public static final int MIN_PRIORITY = 1;
	public static final int NORM_PRIORITY = 5;

	public Thread() {
		throw new RuntimeException("Stub!");
	}

	public Thread(@RecentlyNullable final Runnable target) {
		throw new RuntimeException("Stub!");
	}

	public Thread(@RecentlyNullable final ThreadGroup group, @RecentlyNullable final Runnable target) {
		throw new RuntimeException("Stub!");
	}

	public Thread(@RecentlyNonNull final String name) {
		throw new RuntimeException("Stub!");
	}

	public Thread(@RecentlyNullable final ThreadGroup group, @RecentlyNonNull final String name) {
		throw new RuntimeException("Stub!");
	}

	public Thread(@RecentlyNullable final Runnable target, @RecentlyNonNull final String name) {
		throw new RuntimeException("Stub!");
	}

	public Thread(@RecentlyNullable final ThreadGroup group, @RecentlyNullable final Runnable target,
			@RecentlyNonNull final String name) {
		throw new RuntimeException("Stub!");
	}

	public Thread(@RecentlyNullable final ThreadGroup group, @RecentlyNullable final Runnable target,
			@RecentlyNonNull final String name, final long stackSize) {
		throw new RuntimeException("Stub!");
	}

	public Thread(@RecentlyNullable final ThreadGroup group, @RecentlyNullable final Runnable target,
			@RecentlyNonNull final String name, final long stackSize, final boolean inheritThreadLocals) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static native Thread currentThread();

	public static native void yield();

	public static void sleep(final long millis) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public static void sleep(final long millis, final int nanos) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public static void onSpinWait() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new RuntimeException("Stub!");
	}

	public synchronized void start() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void run() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public final void stop() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public final synchronized void stop(@RecentlyNullable final Throwable obj) {
		throw new RuntimeException("Stub!");
	}

	public void interrupt() {
		throw new RuntimeException("Stub!");
	}

	public static native boolean interrupted();

	public native boolean isInterrupted();

	@Deprecated
	public void destroy() {
		throw new RuntimeException("Stub!");
	}

	public final boolean isAlive() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public final void suspend() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public final void resume() {
		throw new RuntimeException("Stub!");
	}

	public final void setPriority(final int newPriority) {
		throw new RuntimeException("Stub!");
	}

	public final int getPriority() {
		throw new RuntimeException("Stub!");
	}

	public final synchronized void setName(@RecentlyNonNull final String name) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public final String getName() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public final ThreadGroup getThreadGroup() {
		throw new RuntimeException("Stub!");
	}

	public static int activeCount() {
		throw new RuntimeException("Stub!");
	}

	public static int enumerate(final Thread[] tarray) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public int countStackFrames() {
		throw new RuntimeException("Stub!");
	}

	public final void join(final long millis) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public final void join(final long millis, final int nanos) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public final void join() throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public static void dumpStack() {
		throw new RuntimeException("Stub!");
	}

	public final void setDaemon(final boolean on) {
		throw new RuntimeException("Stub!");
	}

	public final boolean isDaemon() {
		throw new RuntimeException("Stub!");
	}

	public final void checkAccess() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public ClassLoader getContextClassLoader() {
		throw new RuntimeException("Stub!");
	}

	public void setContextClassLoader(@RecentlyNullable final ClassLoader cl) {
		throw new RuntimeException("Stub!");
	}

	public static native boolean holdsLock(@RecentlyNonNull final Object p0);

	@RecentlyNonNull
	public StackTraceElement[] getStackTrace() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Map<Thread, StackTraceElement[]> getAllStackTraces() {
		throw new RuntimeException("Stub!");
	}

	public long getId() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public State getState() {
		throw new RuntimeException("Stub!");
	}

	public static void setDefaultUncaughtExceptionHandler(@RecentlyNullable final UncaughtExceptionHandler eh) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public static UncaughtExceptionHandler getDefaultUncaughtExceptionHandler() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public UncaughtExceptionHandler getUncaughtExceptionHandler() {
		throw new RuntimeException("Stub!");
	}

	public void setUncaughtExceptionHandler(@RecentlyNullable final UncaughtExceptionHandler eh) {
		throw new RuntimeException("Stub!");
	}

	public enum State {
		NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED;
	}

	@FunctionalInterface
	public interface UncaughtExceptionHandler {
		void uncaughtException(@RecentlyNonNull final Thread p0, @RecentlyNonNull final Throwable p1);
	}
}
