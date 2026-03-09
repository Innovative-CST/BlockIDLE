package java.util.logging;

@FunctionalInterface
public interface Filter {
	boolean isLoggable(final LogRecord p0);
}
