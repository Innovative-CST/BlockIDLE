package java.net;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

public abstract class JarURLConnection extends URLConnection {
	protected URLConnection jarFileURLConnection;

	protected JarURLConnection(final URL url) throws MalformedURLException {
		super(null);
		throw new RuntimeException("Stub!");
	}

	public URL getJarFileURL() {
		throw new RuntimeException("Stub!");
	}

	public String getEntryName() {
		throw new RuntimeException("Stub!");
	}

	public abstract JarFile getJarFile() throws IOException;

	public Manifest getManifest() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public JarEntry getJarEntry() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Attributes getAttributes() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Attributes getMainAttributes() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Certificate[] getCertificates() throws IOException {
		throw new RuntimeException("Stub!");
	}
}
