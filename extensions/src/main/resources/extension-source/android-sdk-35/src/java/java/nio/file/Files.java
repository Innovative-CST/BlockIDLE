package java.nio.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public final class Files {
	Files() {
		throw new RuntimeException("Stub!");
	}

	public static InputStream newInputStream(final Path path, final OpenOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static OutputStream newOutputStream(final Path path, final OpenOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static SeekableByteChannel newByteChannel(final Path path, final Set<? extends OpenOption> options,
			final FileAttribute<?>... attrs) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static SeekableByteChannel newByteChannel(final Path path, final OpenOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static DirectoryStream<Path> newDirectoryStream(final Path dir) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static DirectoryStream<Path> newDirectoryStream(final Path dir, final String glob) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static DirectoryStream<Path> newDirectoryStream(final Path dir,
			final DirectoryStream.Filter<? super Path> filter) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path createFile(final Path path, final FileAttribute<?>... attrs) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path createDirectory(final Path dir, final FileAttribute<?>... attrs) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path createDirectories(final Path dir, final FileAttribute<?>... attrs) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path createTempFile(final Path dir, final String prefix, final String suffix,
			final FileAttribute<?>... attrs) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path createTempFile(final String prefix, final String suffix, final FileAttribute<?>... attrs)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path createTempDirectory(final Path dir, final String prefix, final FileAttribute<?>... attrs)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path createTempDirectory(final String prefix, final FileAttribute<?>... attrs) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path createSymbolicLink(final Path link, final Path target, final FileAttribute<?>... attrs)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path createLink(final Path link, final Path existing) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static void delete(final Path path) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static boolean deleteIfExists(final Path path) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path copy(final Path source, final Path target, final CopyOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path move(final Path source, final Path target, final CopyOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path readSymbolicLink(final Path link) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static FileStore getFileStore(final Path path) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static boolean isSameFile(final Path path, final Path path2) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static boolean isHidden(final Path path) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static String probeContentType(final Path path) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static <V extends FileAttributeView> V getFileAttributeView(final Path path, final Class<V> type,
			final LinkOption... options) {
		throw new RuntimeException("Stub!");
	}

	public static <A extends BasicFileAttributes> A readAttributes(final Path path, final Class<A> type,
			final LinkOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path setAttribute(final Path path, final String attribute, final Object value,
			final LinkOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Object getAttribute(final Path path, final String attribute, final LinkOption... options)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Map<String, Object> readAttributes(final Path path, final String attributes,
			final LinkOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Set<PosixFilePermission> getPosixFilePermissions(final Path path, final LinkOption... options)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path setPosixFilePermissions(final Path path, final Set<PosixFilePermission> perms)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static UserPrincipal getOwner(final Path path, final LinkOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path setOwner(final Path path, final UserPrincipal owner) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static boolean isSymbolicLink(final Path path) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isDirectory(final Path path, final LinkOption... options) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isRegularFile(final Path path, final LinkOption... options) {
		throw new RuntimeException("Stub!");
	}

	public static FileTime getLastModifiedTime(final Path path, final LinkOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path setLastModifiedTime(final Path path, final FileTime time) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static long size(final Path path) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static boolean exists(final Path path, final LinkOption... options) {
		throw new RuntimeException("Stub!");
	}

	public static boolean notExists(final Path path, final LinkOption... options) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isReadable(final Path path) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isWritable(final Path path) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isExecutable(final Path path) {
		throw new RuntimeException("Stub!");
	}

	public static Path walkFileTree(final Path start, final Set<FileVisitOption> options, final int maxDepth,
			final FileVisitor<? super Path> visitor) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path walkFileTree(final Path start, final FileVisitor<? super Path> visitor) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static BufferedReader newBufferedReader(final Path path, final Charset cs) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static BufferedReader newBufferedReader(final Path path) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static BufferedWriter newBufferedWriter(final Path path, final Charset cs, final OpenOption... options)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static BufferedWriter newBufferedWriter(final Path path, final OpenOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static long copy(final InputStream in, final Path target, final CopyOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static long copy(final Path source, final OutputStream out) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static byte[] readAllBytes(final Path path) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static List<String> readAllLines(final Path path, final Charset cs) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static List<String> readAllLines(final Path path) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path write(final Path path, final byte[] bytes, final OpenOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path write(final Path path, final Iterable<? extends CharSequence> lines, final Charset cs,
			final OpenOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Path write(final Path path, final Iterable<? extends CharSequence> lines, final OpenOption... options)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Stream<Path> list(final Path dir) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Stream<Path> walk(final Path start, final int maxDepth, final FileVisitOption... options)
			throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Stream<Path> walk(final Path start, final FileVisitOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Stream<Path> find(final Path start, final int maxDepth,
			final BiPredicate<Path, BasicFileAttributes> matcher, final FileVisitOption... options) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Stream<String> lines(final Path path, final Charset cs) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static Stream<String> lines(final Path path) throws IOException {
		throw new RuntimeException("Stub!");
	}
}
