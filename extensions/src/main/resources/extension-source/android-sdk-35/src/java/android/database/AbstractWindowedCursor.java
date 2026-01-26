package android.database;

public abstract class AbstractWindowedCursor extends AbstractCursor
{
    protected CursorWindow mWindow;
    
    public AbstractWindowedCursor() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public byte[] getBlob(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getString(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void copyStringToBuffer(final int columnIndex, final CharArrayBuffer buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public short getShort(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getInt(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getLong(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public float getFloat(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public double getDouble(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isNull(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isBlob(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isString(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isLong(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isFloat(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getType(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void checkPosition() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CursorWindow getWindow() {
        throw new RuntimeException("Stub!");
    }
    
    public void setWindow(final CursorWindow window) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasWindow() {
        throw new RuntimeException("Stub!");
    }
}
