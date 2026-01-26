package java.sql;

import java.util.Map;

public interface Ref {
	String getBaseTypeName() throws SQLException;

	Object getObject(final Map<String, Class<?>> p0) throws SQLException;

	Object getObject() throws SQLException;

	void setObject(final Object p0) throws SQLException;
}
