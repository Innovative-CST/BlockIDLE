package java.sql;

public interface Wrapper {
	<T> T unwrap(final Class<T> p0) throws SQLException;

	boolean isWrapperFor(final Class<?> p0) throws SQLException;
}
