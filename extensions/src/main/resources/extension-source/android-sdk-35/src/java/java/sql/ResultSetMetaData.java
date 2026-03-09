package java.sql;

public interface ResultSetMetaData extends Wrapper {
	int columnNoNulls = 0;
	int columnNullable = 1;
	int columnNullableUnknown = 2;

	int getColumnCount() throws SQLException;

	boolean isAutoIncrement(final int p0) throws SQLException;

	boolean isCaseSensitive(final int p0) throws SQLException;

	boolean isSearchable(final int p0) throws SQLException;

	boolean isCurrency(final int p0) throws SQLException;

	int isNullable(final int p0) throws SQLException;

	boolean isSigned(final int p0) throws SQLException;

	int getColumnDisplaySize(final int p0) throws SQLException;

	String getColumnLabel(final int p0) throws SQLException;

	String getColumnName(final int p0) throws SQLException;

	String getSchemaName(final int p0) throws SQLException;

	int getPrecision(final int p0) throws SQLException;

	int getScale(final int p0) throws SQLException;

	String getTableName(final int p0) throws SQLException;

	String getCatalogName(final int p0) throws SQLException;

	int getColumnType(final int p0) throws SQLException;

	String getColumnTypeName(final int p0) throws SQLException;

	boolean isReadOnly(final int p0) throws SQLException;

	boolean isWritable(final int p0) throws SQLException;

	boolean isDefinitelyWritable(final int p0) throws SQLException;

	String getColumnClassName(final int p0) throws SQLException;
}
