package java.nio.file.attribute;

import java.io.IOException;
import java.util.List;

public interface AclFileAttributeView extends FileOwnerAttributeView {
	String name();

	List<AclEntry> getAcl() throws IOException;

	void setAcl(final List<AclEntry> p0) throws IOException;
}
