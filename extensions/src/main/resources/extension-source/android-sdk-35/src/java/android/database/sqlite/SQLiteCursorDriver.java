package android.database.sqlite;

import android.database.Cursor;

public interface SQLiteCursorDriver
{
    Cursor query(final SQLiteDatabase.CursorFactory p0, final String[] p1);
    
    void cursorDeactivated();
    
    void cursorRequeried(final Cursor p0);
    
    void cursorClosed();
    
    void setBindArguments(final String[] p0);
}
