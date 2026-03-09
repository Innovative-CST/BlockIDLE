package java.io;

import java.nio.charset.Charset;

public class FileReader extends InputStreamReader {
	public FileReader(final String fileName) throws FileNotFoundException {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public FileReader(final File file) throws FileNotFoundException {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public FileReader(final FileDescriptor fd) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public FileReader(final String fileName, final Charset charset) throws IOException {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public FileReader(final File file, final Charset charset) throws IOException {
		super(null);
		throw new RuntimeException("Stub!");
	}
}
