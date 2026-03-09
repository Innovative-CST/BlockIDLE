package java.lang;

import java.io.File;
import java.io.IOException;

public class Runtime {
	Runtime() {
		throw new RuntimeException("Stub!");
	}

	public static Runtime getRuntime() {
		throw new RuntimeException("Stub!");
	}

	public void exit(final int status) {
		throw new RuntimeException("Stub!");
	}

	public void addShutdownHook(final Thread hook) {
		throw new RuntimeException("Stub!");
	}

	public boolean removeShutdownHook(final Thread hook) {
		throw new RuntimeException("Stub!");
	}

	public void halt(final int status) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public static void runFinalizersOnExit(final boolean value) {
		throw new RuntimeException("Stub!");
	}

	public Process exec(final String command) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Process exec(final String command, final String[] envp) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Process exec(final String command, final String[] envp, final File dir) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Process exec(final String[] cmdarray) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Process exec(final String[] cmdarray, final String[] envp) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Process exec(final String[] cmdarray, final String[] envp, final File dir) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public int availableProcessors() {
		throw new RuntimeException("Stub!");
	}

	public native long freeMemory();

	public native long totalMemory();

	public native long maxMemory();

	public void gc() {
		throw new RuntimeException("Stub!");
	}

	public void runFinalization() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void traceInstructions(final boolean on) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void traceMethodCalls(final boolean on) {
		throw new RuntimeException("Stub!");
	}

	public void load(final String filename) {
		throw new RuntimeException("Stub!");
	}

	public void loadLibrary(final String libname) {
		throw new RuntimeException("Stub!");
	}
}
