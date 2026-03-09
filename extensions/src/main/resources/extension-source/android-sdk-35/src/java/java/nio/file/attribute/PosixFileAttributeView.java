package java.nio.file.attribute;

import java.io.IOException;
import java.util.Set;

public interface PosixFileAttributeView extends BasicFileAttributeView, FileOwnerAttributeView {
	String name();

	PosixFileAttributes readAttributes() throws IOException;

	void setPermissions(final Set<PosixFilePermission> p0) throws IOException;

	void setGroup(final GroupPrincipal p0) throws IOException;
}
