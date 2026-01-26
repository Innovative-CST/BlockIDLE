package android.database.sqlite;

import android.database.CursorWindow;
import android.database.AbstractWindowedCursor;

public class SQLiteCursor extends AbstractWindowedCursor
{
    @Deprecated
    public SQLiteCursor(final SQLiteDatabase db, final SQLiteCursorDriver driver, final String editTable, final SQLiteQuery query) {
        throw new RuntimeException("Stub!");
    }
    
    public SQLiteCursor(final SQLiteCursorDriver driver, final String editTable, final SQLiteQuery query) {
        throw new RuntimeException("Stub!");
    }
    
    public SQLiteDatabase getDatabase() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onMove(final int oldPosition, final int newPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getColumnIndex(final String columnName) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String[] getColumnNames() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void deactivate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean requery() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setWindow(final CursorWindow window) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSelectionArguments(final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFillWindowForwardOnly(final boolean fillWindowForwardOnly) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
}
