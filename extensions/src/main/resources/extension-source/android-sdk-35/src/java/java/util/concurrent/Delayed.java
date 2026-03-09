package java.util.concurrent;

public interface Delayed extends Comparable<Delayed> {
	long getDelay(final TimeUnit p0);
}
