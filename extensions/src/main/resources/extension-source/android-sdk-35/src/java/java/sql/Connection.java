package java.sql;

import java.util.Map;
import java.util.Properties;

public interface Connection extends Wrapper, AutoCloseable {
	int TRANSACTION_NONE = 0;
	int TRANSACTION_READ_COMMITTED = 2;
	int TRANSACTION_READ_UNCOMMITTED = 1;
	int TRANSACTION_REPEATABLE_READ = 4;
	int TRANSACTION_SERIALIZABLE = 8;

	Statement createStatement() throws SQLException;

	PreparedStatement prepareStatement(final String p0) throws SQLException;

	CallableStatement prepareCall(final String p0) throws SQLException;

	String nativeSQL(final String p0) throws SQLException;

	void setAutoCommit(final boolean p0) throws SQLException;

	boolean getAutoCommit() throws SQLException;

	void commit() throws SQLException;

	void rollback() throws SQLException;

	void close() throws SQLException;

	boolean isClosed() throws SQLException;

	DatabaseMetaData getMetaData() throws SQLException;

	void setReadOnly(final boolean p0) throws SQLException;

	boolean isReadOnly() throws SQLException;

	void setCatalog(final String p0) throws SQLException;

	String getCatalog() throws SQLException;

	void setTransactionIsolation(final int p0) throws SQLException;

	int getTransactionIsolation() throws SQLException;

	SQLWarning getWarnings() throws SQLException;

	void clearWarnings() throws SQLException;

	Statement createStatement(final int p0, final int p1) throws SQLException;

	PreparedStatement prepareStatement(final String p0, final int p1, final int p2) throws SQLException;

	CallableStatement prepareCall(final String p0, final int p1, final int p2) throws SQLException;

	Map<String, Class<?>> getTypeMap() throws SQLException;

	void setTypeMap(final Map<String, Class<?>> p0) throws SQLException;

	void setHoldability(final int p0) throws SQLException;

	int getHoldability() throws SQLException;

	Savepoint setSavepoint() throws SQLException;

	Savepoint setSavepoint(final String p0) throws SQLException;

	void rollback(final Savepoint p0) throws SQLException;

	void releaseSavepoint(final Savepoint p0) throws SQLException;

	Statement createStatement(final int p0, final int p1, final int p2) throws SQLException;

	PreparedStatement prepareStatement(final String p0, final int p1, final int p2, final int p3) throws SQLException;

	CallableStatement prepareCall(final String p0, final int p1, final int p2, final int p3) throws SQLException;

	PreparedStatement prepareStatement(final String p0, final int p1) throws SQLException;

	PreparedStatement prepareStatement(final String p0, final int[] p1) throws SQLException;

	PreparedStatement prepareStatement(final String p0, final String[] p1) throws SQLException;

	Clob createClob() throws SQLException;

	Blob createBlob() throws SQLException;

	NClob createNClob() throws SQLException;

	SQLXML createSQLXML() throws SQLException;

	boolean isValid(final int p0) throws SQLException;

	void setClientInfo(final String p0, final String p1) throws SQLClientInfoException;

	void setClientInfo(final Properties p0) throws SQLClientInfoException;

	String getClientInfo(final String p0) throws SQLException;

	Properties getClientInfo() throws SQLException;

	Array createArrayOf(final String p0, final Object[] p1) throws SQLException;

	Struct createStruct(final String p0, final Object[] p1) throws SQLException;
}
