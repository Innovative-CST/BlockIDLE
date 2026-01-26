package java.sql;

import java.util.Map;

public interface Struct {
	String getSQLTypeName() throws SQLException;

	Object[] getAttributes() throws SQLException;

	Object[] getAttributes(final Map<String, Class<?>> p0) throws SQLException;
}
