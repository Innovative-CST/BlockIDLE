package android.database;

public class CrossProcessCursorWrapper extends CursorWrapper implements CrossProcessCursor
{
    public CrossProcessCursorWrapper(final Cursor cursor) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void fillWindow(final int position, final CursorWindow window) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CursorWindow getWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onMove(final int oldPosition, final int newPosition) {
        throw new RuntimeException("Stub!");
    }
}
