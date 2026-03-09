package java.lang;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class ProcessBuilder {
	public ProcessBuilder(final List<String> command) {
		throw new RuntimeException("Stub!");
	}

	public ProcessBuilder(final String... command) {
		throw new RuntimeException("Stub!");
	}

	public ProcessBuilder command(final List<String> command) {
		throw new RuntimeException("Stub!");
	}

	public ProcessBuilder command(final String... command) {
		throw new RuntimeException("Stub!");
	}

	public List<String> command() {
		throw new RuntimeException("Stub!");
	}

	public Map<String, String> environment() {
		throw new RuntimeException("Stub!");
	}

	public File directory() {
		throw new RuntimeException("Stub!");
	}

	public ProcessBuilder directory(final File directory) {
		throw new RuntimeException("Stub!");
	}

	public ProcessBuilder redirectInput(final Redirect source) {
		throw new RuntimeException("Stub!");
	}

	public ProcessBuilder redirectOutput(final Redirect destination) {
		throw new RuntimeException("Stub!");
	}

	public ProcessBuilder redirectError(final Redirect destination) {
		throw new RuntimeException("Stub!");
	}

	public ProcessBuilder redirectInput(final File file) {
		throw new RuntimeException("Stub!");
	}

	public ProcessBuilder redirectOutput(final File file) {
		throw new RuntimeException("Stub!");
	}

	public ProcessBuilder redirectError(final File file) {
		throw new RuntimeException("Stub!");
	}

	public Redirect redirectInput() {
		throw new RuntimeException("Stub!");
	}

	public Redirect redirectOutput() {
		throw new RuntimeException("Stub!");
	}

	public Redirect redirectError() {
		throw new RuntimeException("Stub!");
	}

	public ProcessBuilder inheritIO() {
		throw new RuntimeException("Stub!");
	}

	public boolean redirectErrorStream() {
		throw new RuntimeException("Stub!");
	}

	public ProcessBuilder redirectErrorStream(final boolean redirectErrorStream) {
		throw new RuntimeException("Stub!");
	}

	public Process start() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public abstract static class Redirect {
		public static final Redirect INHERIT;
		public static final Redirect PIPE;

		Redirect() {
			throw new RuntimeException("Stub!");
		}

		public abstract Type type();

		public File file() {
			throw new RuntimeException("Stub!");
		}

		public static Redirect from(final File file) {
			throw new RuntimeException("Stub!");
		}

		public static Redirect to(final File file) {
			throw new RuntimeException("Stub!");
		}

		public static Redirect appendTo(final File file) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public boolean equals(final Object obj) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public int hashCode() {
			throw new RuntimeException("Stub!");
		}

		static {
			INHERIT = null;
			PIPE = null;
		}

		public enum Type {
			PIPE, INHERIT, READ, WRITE, APPEND;
		}
	}
}
