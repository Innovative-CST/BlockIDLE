package java.security;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
public interface Certificate {
	@Deprecated
	Principal getGuarantor();

	@Deprecated
	Principal getPrincipal();

	@Deprecated
	PublicKey getPublicKey();

	@Deprecated
	void encode(final OutputStream p0) throws IOException, KeyException;

	@Deprecated
	void decode(final InputStream p0) throws IOException, KeyException;

	@Deprecated
	String getFormat();

	@Deprecated
	String toString(final boolean p0);
}
