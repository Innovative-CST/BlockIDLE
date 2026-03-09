package java.nio.file.attribute;

import java.io.IOException;

public interface BasicFileAttributeView extends FileAttributeView {
	String name();

	BasicFileAttributes readAttributes() throws IOException;

	void setTimes(final FileTime p0, final FileTime p1, final FileTime p2) throws IOException;
}
