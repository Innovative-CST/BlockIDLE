package java.util.logging;

import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

public class LogManager {
	public static final String LOGGING_MXBEAN_NAME = "java.util.logging:type=Logging";

	protected LogManager() {
		throw new RuntimeException("Stub!");
	}

	public static LogManager getLogManager() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void addPropertyChangeListener(final PropertyChangeListener l) throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void removePropertyChangeListener(final PropertyChangeListener l) throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	public boolean addLogger(final Logger logger) {
		throw new RuntimeException("Stub!");
	}

	public Logger getLogger(final String name) {
		throw new RuntimeException("Stub!");
	}

	public Enumeration<String> getLoggerNames() {
		throw new RuntimeException("Stub!");
	}

	public void readConfiguration() throws IOException, SecurityException {
		throw new RuntimeException("Stub!");
	}

	public void reset() throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	public void readConfiguration(final InputStream ins) throws IOException, SecurityException {
		throw new RuntimeException("Stub!");
	}

	public String getProperty(final String name) {
		throw new RuntimeException("Stub!");
	}

	public void checkAccess() throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	public static synchronized LoggingMXBean getLoggingMXBean() {
		throw new RuntimeException("Stub!");
	}
}
