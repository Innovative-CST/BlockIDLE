package android.database.sqlite;

public abstract class SQLiteProgram extends SQLiteClosable
{
    SQLiteProgram() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final int getUniqueId() {
        throw new RuntimeException("Stub!");
    }
    
    public void bindNull(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void bindLong(final int index, final long value) {
        throw new RuntimeException("Stub!");
    }
    
    public void bindDouble(final int index, final double value) {
        throw new RuntimeException("Stub!");
    }
    
    public void bindString(final int index, final String value) {
        throw new RuntimeException("Stub!");
    }
    
    public void bindBlob(final int index, final byte[] value) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearBindings() {
        throw new RuntimeException("Stub!");
    }
    
    public void bindAllArgsAsStrings(final String[] bindArgs) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onAllReferencesReleased() {
        throw new RuntimeException("Stub!");
    }
}
