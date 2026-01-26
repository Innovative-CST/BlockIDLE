package java.sql;

import java.util.Map;

public interface Array {
	String getBaseTypeName() throws SQLException;

	int getBaseType() throws SQLException;

	Object getArray() throws SQLException;

	Object getArray(final Map<String, Class<?>> p0) throws SQLException;

	Object getArray(final long p0, final int p1) throws SQLException;

	Object getArray(final long p0, final int p1, final Map<String, Class<?>> p2) throws SQLException;

	ResultSet getResultSet() throws SQLException;

	ResultSet getResultSet(final Map<String, Class<?>> p0) throws SQLException;

	ResultSet getResultSet(final long p0, final int p1) throws SQLException;

	ResultSet getResultSet(final long p0, final int p1, final Map<String, Class<?>> p2) throws SQLException;

	void free() throws SQLException;
}
