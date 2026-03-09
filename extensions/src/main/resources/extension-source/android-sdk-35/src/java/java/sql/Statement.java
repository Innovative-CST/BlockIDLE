package java.sql;

public interface Statement extends Wrapper, AutoCloseable {
	int CLOSE_ALL_RESULTS = 3;
	int CLOSE_CURRENT_RESULT = 1;
	int EXECUTE_FAILED = -3;
	int KEEP_CURRENT_RESULT = 2;
	int NO_GENERATED_KEYS = 2;
	int RETURN_GENERATED_KEYS = 1;
	int SUCCESS_NO_INFO = -2;

	ResultSet executeQuery(final String p0) throws SQLException;

	int executeUpdate(final String p0) throws SQLException;

	void close() throws SQLException;

	int getMaxFieldSize() throws SQLException;

	void setMaxFieldSize(final int p0) throws SQLException;

	int getMaxRows() throws SQLException;

	void setMaxRows(final int p0) throws SQLException;

	void setEscapeProcessing(final boolean p0) throws SQLException;

	int getQueryTimeout() throws SQLException;

	void setQueryTimeout(final int p0) throws SQLException;

	void cancel() throws SQLException;

	SQLWarning getWarnings() throws SQLException;

	void clearWarnings() throws SQLException;

	void setCursorName(final String p0) throws SQLException;

	boolean execute(final String p0) throws SQLException;

	ResultSet getResultSet() throws SQLException;

	int getUpdateCount() throws SQLException;

	boolean getMoreResults() throws SQLException;

	void setFetchDirection(final int p0) throws SQLException;

	int getFetchDirection() throws SQLException;

	void setFetchSize(final int p0) throws SQLException;

	int getFetchSize() throws SQLException;

	int getResultSetConcurrency() throws SQLException;

	int getResultSetType() throws SQLException;

	void addBatch(final String p0) throws SQLException;

	void clearBatch() throws SQLException;

	int[] executeBatch() throws SQLException;

	Connection getConnection() throws SQLException;

	boolean getMoreResults(final int p0) throws SQLException;

	ResultSet getGeneratedKeys() throws SQLException;

	int executeUpdate(final String p0, final int p1) throws SQLException;

	int executeUpdate(final String p0, final int[] p1) throws SQLException;

	int executeUpdate(final String p0, final String[] p1) throws SQLException;

	boolean execute(final String p0, final int p1) throws SQLException;

	boolean execute(final String p0, final int[] p1) throws SQLException;

	boolean execute(final String p0, final String[] p1) throws SQLException;

	int getResultSetHoldability() throws SQLException;

	boolean isClosed() throws SQLException;

	void setPoolable(final boolean p0) throws SQLException;

	boolean isPoolable() throws SQLException;
}
