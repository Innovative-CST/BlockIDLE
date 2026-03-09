package java.io;

@FunctionalInterface
public interface FileFilter {
	boolean accept(final File p0);
}
