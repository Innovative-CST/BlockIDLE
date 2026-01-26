package java.sql;

import java.util.Properties;

public interface Driver {
	Connection connect(final String p0, final Properties p1) throws SQLException;

	boolean acceptsURL(final String p0) throws SQLException;

	DriverPropertyInfo[] getPropertyInfo(final String p0, final Properties p1) throws SQLException;

	int getMajorVersion();

	int getMinorVersion();

	boolean jdbcCompliant();
}
