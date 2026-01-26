package java.security.cert;

import java.io.IOException;
import java.io.OutputStream;

public interface Extension {
	String getId();

	boolean isCritical();

	byte[] getValue();

	void encode(final OutputStream p0) throws IOException;
}
