package java.lang;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

public abstract class Process {
	public Process() {
		throw new RuntimeException("Stub!");
	}

	public abstract OutputStream getOutputStream();

	public abstract InputStream getInputStream();

	public abstract InputStream getErrorStream();

	public abstract int waitFor() throws InterruptedException;

	public boolean waitFor(final long timeout, final TimeUnit unit) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public abstract int exitValue();

	public abstract void destroy();

	public Process destroyForcibly() {
		throw new RuntimeException("Stub!");
	}

	public boolean isAlive() {
		throw new RuntimeException("Stub!");
	}
}
