package java.sql;

public interface ParameterMetaData extends Wrapper {
	int parameterModeIn = 1;
	int parameterModeInOut = 2;
	int parameterModeOut = 4;
	int parameterModeUnknown = 0;
	int parameterNoNulls = 0;
	int parameterNullable = 1;
	int parameterNullableUnknown = 2;

	int getParameterCount() throws SQLException;

	int isNullable(final int p0) throws SQLException;

	boolean isSigned(final int p0) throws SQLException;

	int getPrecision(final int p0) throws SQLException;

	int getScale(final int p0) throws SQLException;

	int getParameterType(final int p0) throws SQLException;

	String getParameterTypeName(final int p0) throws SQLException;

	String getParameterClassName(final int p0) throws SQLException;

	int getParameterMode(final int p0) throws SQLException;
}
