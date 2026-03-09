package android.database;

public interface CrossProcessCursor extends Cursor
{
    CursorWindow getWindow();
    
    void fillWindow(final int p0, final CursorWindow p1);
    
    boolean onMove(final int p0, final int p1);
}
