package java.io;

@FunctionalInterface
public interface FilenameFilter {
	boolean accept(final File p0, final String p1);
}
