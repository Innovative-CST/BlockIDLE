package java.net;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.SecureClassLoader;
import java.util.Enumeration;
import java.util.jar.Manifest;

public class URLClassLoader extends SecureClassLoader implements Closeable {
	public URLClassLoader(final URL[] urls, final ClassLoader parent) {
		throw new RuntimeException("Stub!");
	}

	public URLClassLoader(final URL[] urls) {
		throw new RuntimeException("Stub!");
	}

	public URLClassLoader(final URL[] urls, final ClassLoader parent, final URLStreamHandlerFactory factory) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public InputStream getResourceAsStream(final String name) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected void addURL(final URL url) {
		throw new RuntimeException("Stub!");
	}

	public URL[] getURLs() {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected Class<?> findClass(final String name) throws ClassNotFoundException {
		throw new RuntimeException("Stub!");
	}

	protected Package definePackage(final String name, final Manifest man, final URL url)
			throws IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}

	public URL findResource(final String name) {
		throw new RuntimeException("Stub!");
	}

	public Enumeration<URL> findResources(final String name) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected PermissionCollection getPermissions(final CodeSource codesource) {
		throw new RuntimeException("Stub!");
	}

	public static URLClassLoader newInstance(final URL[] urls, final ClassLoader parent) {
		throw new RuntimeException("Stub!");
	}

	public static URLClassLoader newInstance(final URL[] urls) {
		throw new RuntimeException("Stub!");
	}
}
