package java.util.jar;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

public class Manifest implements Cloneable {
	public Manifest() {
		throw new RuntimeException("Stub!");
	}

	public Manifest(final InputStream is) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Manifest(final Manifest man) {
		throw new RuntimeException("Stub!");
	}

	public Attributes getMainAttributes() {
		throw new RuntimeException("Stub!");
	}

	public Map<String, Attributes> getEntries() {
		throw new RuntimeException("Stub!");
	}

	public Attributes getAttributes(final String name) {
		throw new RuntimeException("Stub!");
	}

	public void clear() {
		throw new RuntimeException("Stub!");
	}

	public void write(final OutputStream out) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void read(final InputStream is) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	public Object clone() {
		throw new RuntimeException("Stub!");
	}
}
