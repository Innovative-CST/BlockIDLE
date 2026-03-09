package java.nio.file;

@FunctionalInterface
public interface PathMatcher {
	boolean matches(final Path p0);
}
