package java.sql;

public interface RowId {
	boolean equals(final Object p0);

	byte[] getBytes();

	String toString();

	int hashCode();
}
