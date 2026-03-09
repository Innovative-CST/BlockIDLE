package java.nio.file.attribute;

import java.io.IOException;

public interface DosFileAttributeView extends BasicFileAttributeView {
	String name();

	DosFileAttributes readAttributes() throws IOException;

	void setReadOnly(final boolean p0) throws IOException;

	void setHidden(final boolean p0) throws IOException;

	void setSystem(final boolean p0) throws IOException;

	void setArchive(final boolean p0) throws IOException;
}
