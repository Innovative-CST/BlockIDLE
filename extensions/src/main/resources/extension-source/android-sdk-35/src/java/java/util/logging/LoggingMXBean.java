package java.util.logging;

import java.util.List;

public interface LoggingMXBean {
	List<String> getLoggerNames();

	String getLoggerLevel(final String p0);

	void setLoggerLevel(final String p0, final String p1);

	String getParentLoggerName(final String p0);
}
