package java.io;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;

public class File implements Serializable, Comparable<File> {
	@RecentlyNonNull
	public static final String pathSeparator;
	public static final char pathSeparatorChar;
	@RecentlyNonNull
	public static final String separator;
	public static final char separatorChar;

	public File(@RecentlyNonNull final String pathname) {
		throw new RuntimeException("Stub!");
	}

	public File(@RecentlyNullable final String parent, @RecentlyNonNull final String child) {
		throw new RuntimeException("Stub!");
	}

	public File(@RecentlyNullable final File parent, @RecentlyNonNull final String child) {
		throw new RuntimeException("Stub!");
	}

	public File(@RecentlyNonNull final URI uri) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getName() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public String getParent() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public File getParentFile() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getPath() {
		throw new RuntimeException("Stub!");
	}

	public boolean isAbsolute() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getAbsolutePath() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public File getAbsoluteFile() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getCanonicalPath() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public File getCanonicalFile() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@RecentlyNonNull
	public URL toURL() throws MalformedURLException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public URI toURI() {
		throw new RuntimeException("Stub!");
	}

	public boolean canRead() {
		throw new RuntimeException("Stub!");
	}

	public boolean canWrite() {
		throw new RuntimeException("Stub!");
	}

	public boolean exists() {
		throw new RuntimeException("Stub!");
	}

	public boolean isDirectory() {
		throw new RuntimeException("Stub!");
	}

	public boolean isFile() {
		throw new RuntimeException("Stub!");
	}

	public boolean isHidden() {
		throw new RuntimeException("Stub!");
	}

	public long lastModified() {
		throw new RuntimeException("Stub!");
	}

	public long length() {
		throw new RuntimeException("Stub!");
	}

	public boolean createNewFile() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public boolean delete() {
		throw new RuntimeException("Stub!");
	}

	public void deleteOnExit() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public String[] list() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public String[] list(@RecentlyNullable final FilenameFilter filter) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public File[] listFiles() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public File[] listFiles(@RecentlyNullable final FilenameFilter filter) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public File[] listFiles(@RecentlyNullable final FileFilter filter) {
		throw new RuntimeException("Stub!");
	}

	public boolean mkdir() {
		throw new RuntimeException("Stub!");
	}

	public boolean mkdirs() {
		throw new RuntimeException("Stub!");
	}

	public boolean renameTo(@RecentlyNonNull final File dest) {
		throw new RuntimeException("Stub!");
	}

	public boolean setLastModified(final long time) {
		throw new RuntimeException("Stub!");
	}

	public boolean setReadOnly() {
		throw new RuntimeException("Stub!");
	}

	public boolean setWritable(final boolean writable, final boolean ownerOnly) {
		throw new RuntimeException("Stub!");
	}

	public boolean setWritable(final boolean writable) {
		throw new RuntimeException("Stub!");
	}

	public boolean setReadable(final boolean readable, final boolean ownerOnly) {
		throw new RuntimeException("Stub!");
	}

	public boolean setReadable(final boolean readable) {
		throw new RuntimeException("Stub!");
	}

	public boolean setExecutable(final boolean executable, final boolean ownerOnly) {
		throw new RuntimeException("Stub!");
	}

	public boolean setExecutable(final boolean executable) {
		throw new RuntimeException("Stub!");
	}

	public boolean canExecute() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static File[] listRoots() {
		throw new RuntimeException("Stub!");
	}

	public long getTotalSpace() {
		throw new RuntimeException("Stub!");
	}

	public long getFreeSpace() {
		throw new RuntimeException("Stub!");
	}

	public long getUsableSpace() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static File createTempFile(@RecentlyNonNull final String prefix, @RecentlyNullable final String suffix,
			@RecentlyNullable final File directory) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static File createTempFile(@RecentlyNonNull final String prefix, @RecentlyNullable final String suffix)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(@RecentlyNonNull final File pathname) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Path toPath() {
		throw new RuntimeException("Stub!");
	}

	static {
		pathSeparator = null;
		pathSeparatorChar = '\0';
		separator = null;
		separatorChar = '\0';
	}
}
