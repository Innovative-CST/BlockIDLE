package android.database.sqlite;

import java.io.Closeable;

public final class SQLiteRawStatement implements Closeable
{
    public static final int SQLITE_DATA_TYPE_BLOB = 4;
    public static final int SQLITE_DATA_TYPE_FLOAT = 2;
    public static final int SQLITE_DATA_TYPE_INTEGER = 1;
    public static final int SQLITE_DATA_TYPE_NULL = 5;
    public static final int SQLITE_DATA_TYPE_TEXT = 3;
    
    SQLiteRawStatement() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOpen() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean step() {
        throw new RuntimeException("Stub!");
    }
    
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    public void clearBindings() {
        throw new RuntimeException("Stub!");
    }
    
    public int getParameterCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getParameterIndex(@NonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getParameterName(final int parameterIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public void bindBlob(final int parameterIndex, @NonNull final byte[] value) {
        throw new RuntimeException("Stub!");
    }
    
    public void bindBlob(final int parameterIndex, @NonNull final byte[] value, final int offset, final int length) {
        throw new RuntimeException("Stub!");
    }
    
    public void bindDouble(final int parameterIndex, final double value) {
        throw new RuntimeException("Stub!");
    }
    
    public void bindInt(final int parameterIndex, final int value) {
        throw new RuntimeException("Stub!");
    }
    
    public void bindLong(final int parameterIndex, final long value) {
        throw new RuntimeException("Stub!");
    }
    
    public void bindNull(final int parameterIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public void bindText(final int parameterIndex, @NonNull final String value) {
        throw new RuntimeException("Stub!");
    }
    
    public int getResultColumnCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getColumnType(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getColumnName(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public int getColumnLength(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getColumnBlob(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public int readColumnBlob(final int columnIndex, @NonNull final byte[] buffer, final int offset, final int length, final int srcOffset) {
        throw new RuntimeException("Stub!");
    }
    
    public double getColumnDouble(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public int getColumnInt(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public long getColumnLong(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getColumnText(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
