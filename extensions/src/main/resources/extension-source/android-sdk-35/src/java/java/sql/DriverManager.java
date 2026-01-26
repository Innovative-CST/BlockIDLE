package java.sql;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Properties;

public class DriverManager {
	DriverManager() {
		throw new RuntimeException("Stub!");
	}

	public static PrintWriter getLogWriter() {
		throw new RuntimeException("Stub!");
	}

	public static void setLogWriter(final PrintWriter out) {
		throw new RuntimeException("Stub!");
	}

	public static Connection getConnection(final String url, final Properties info) throws SQLException {
		throw new RuntimeException("Stub!");
	}

	public static Connection getConnection(final String url, final String user, final String password)
			throws SQLException {
		throw new RuntimeException("Stub!");
	}

	public static Connection getConnection(final String url) throws SQLException {
		throw new RuntimeException("Stub!");
	}

	public static Driver getDriver(final String url) throws SQLException {
		throw new RuntimeException("Stub!");
	}

	public static synchronized void registerDriver(final Driver driver) throws SQLException {
		throw new RuntimeException("Stub!");
	}

	public static synchronized void deregisterDriver(final Driver driver) throws SQLException {
		throw new RuntimeException("Stub!");
	}

	public static Enumeration<Driver> getDrivers() {
		throw new RuntimeException("Stub!");
	}

	public static void setLoginTimeout(final int seconds) {
		throw new RuntimeException("Stub!");
	}

	public static int getLoginTimeout() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public static void setLogStream(final PrintStream out) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public static PrintStream getLogStream() {
		throw new RuntimeException("Stub!");
	}

	public static void println(final String message) {
		throw new RuntimeException("Stub!");
	}
}
