package android.database;

public class MatrixCursor extends AbstractCursor
{
    public MatrixCursor(final String[] columnNames, final int initialCapacity) {
        throw new RuntimeException("Stub!");
    }
    
    public MatrixCursor(final String[] columnNames) {
        throw new RuntimeException("Stub!");
    }
    
    public RowBuilder newRow() {
        throw new RuntimeException("Stub!");
    }
    
    public void addRow(final Object[] columnValues) {
        throw new RuntimeException("Stub!");
    }
    
    public void addRow(final Iterable<?> columnValues) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String[] getColumnNames() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getString(final int column) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public short getShort(final int column) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getInt(final int column) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getLong(final int column) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public float getFloat(final int column) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public double getDouble(final int column) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public byte[] getBlob(final int column) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getType(final int column) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isNull(final int column) {
        throw new RuntimeException("Stub!");
    }
    
    public class RowBuilder
    {
        RowBuilder() {
            throw new RuntimeException("Stub!");
        }
        
        public RowBuilder add(final Object columnValue) {
            throw new RuntimeException("Stub!");
        }
        
        public RowBuilder add(final String columnName, final Object value) {
            throw new RuntimeException("Stub!");
        }
    }
}
