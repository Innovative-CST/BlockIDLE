package android.database;

import java.util.Iterator;

public final class CursorJoiner implements Iterator<Result>, Iterable<Result>
{
    public CursorJoiner(final Cursor cursorLeft, final String[] columnNamesLeft, final Cursor cursorRight, final String[] columnNamesRight) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Iterator<Result> iterator() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean hasNext() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Result next() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void remove() {
        throw new RuntimeException("Stub!");
    }
    
    public enum Result
    {
        RIGHT, 
        LEFT, 
        BOTH;
    }
}
