package java.lang;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.ProtectionDomain;
import java.util.Enumeration;

public abstract class ClassLoader {
	protected ClassLoader(final ClassLoader parent) {
		throw new RuntimeException("Stub!");
	}

	protected ClassLoader() {
		throw new RuntimeException("Stub!");
	}

	public Class<?> loadClass(final String name) throws ClassNotFoundException {
		throw new RuntimeException("Stub!");
	}

	protected Class<?> loadClass(final String name, final boolean resolve) throws ClassNotFoundException {
		throw new RuntimeException("Stub!");
	}

	protected Class<?> findClass(final String name) throws ClassNotFoundException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	protected final Class<?> defineClass(final byte[] b, final int off, final int len) throws ClassFormatError {
		throw new RuntimeException("Stub!");
	}

	protected final Class<?> defineClass(final String name, final byte[] b, final int off, final int len)
			throws ClassFormatError {
		throw new RuntimeException("Stub!");
	}

	protected final Class<?> defineClass(final String name, final byte[] b, final int off, final int len,
			final ProtectionDomain protectionDomain) throws ClassFormatError {
		throw new RuntimeException("Stub!");
	}

	protected final Class<?> defineClass(final String name, final ByteBuffer b, final ProtectionDomain protectionDomain)
			throws ClassFormatError {
		throw new RuntimeException("Stub!");
	}

	protected final void resolveClass(final Class<?> c) {
		throw new RuntimeException("Stub!");
	}

	protected final Class<?> findSystemClass(final String name) throws ClassNotFoundException {
		throw new RuntimeException("Stub!");
	}

	protected final Class<?> findLoadedClass(final String name) {
		throw new RuntimeException("Stub!");
	}

	protected final void setSigners(final Class<?> c, final Object[] signers) {
		throw new RuntimeException("Stub!");
	}

	public URL getResource(final String name) {
		throw new RuntimeException("Stub!");
	}

	public Enumeration<URL> getResources(final String name) throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected URL findResource(final String name) {
		throw new RuntimeException("Stub!");
	}

	protected Enumeration<URL> findResources(final String name) throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected static boolean registerAsParallelCapable() {
		throw new RuntimeException("Stub!");
	}

	public static URL getSystemResource(final String name) {
		throw new RuntimeException("Stub!");
	}

	public static Enumeration<URL> getSystemResources(final String name) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public InputStream getResourceAsStream(final String name) {
		throw new RuntimeException("Stub!");
	}

	public static InputStream getSystemResourceAsStream(final String name) {
		throw new RuntimeException("Stub!");
	}

	public final ClassLoader getParent() {
		throw new RuntimeException("Stub!");
	}

	public static ClassLoader getSystemClassLoader() {
		throw new RuntimeException("Stub!");
	}

	protected Package definePackage(final String name, final String specTitle, final String specVersion,
			final String specVendor, final String implTitle, final String implVersion, final String implVendor,
			final URL sealBase) throws IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	protected Package getPackage(final String name) {
		throw new RuntimeException("Stub!");
	}

	protected Package[] getPackages() {
		throw new RuntimeException("Stub!");
	}

	protected String findLibrary(final String libname) {
		throw new RuntimeException("Stub!");
	}

	public void setDefaultAssertionStatus(final boolean enabled) {
		throw new RuntimeException("Stub!");
	}

	public void setPackageAssertionStatus(final String packageName, final boolean enabled) {
		throw new RuntimeException("Stub!");
	}

	public void setClassAssertionStatus(final String className, final boolean enabled) {
		throw new RuntimeException("Stub!");
	}

	public void clearAssertionStatus() {
		throw new RuntimeException("Stub!");
	}
}
