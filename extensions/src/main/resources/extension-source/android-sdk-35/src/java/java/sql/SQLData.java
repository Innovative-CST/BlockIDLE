package java.sql;

public interface SQLData {
	String getSQLTypeName() throws SQLException;

	void readSQL(final SQLInput p0, final String p1) throws SQLException;

	void writeSQL(final SQLOutput p0) throws SQLException;
}
