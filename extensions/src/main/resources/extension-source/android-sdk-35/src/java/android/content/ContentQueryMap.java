package android.content;

import java.util.Map;
import android.os.Handler;
import android.database.Cursor;
import java.util.Observable;

public class ContentQueryMap extends Observable
{
    public ContentQueryMap(final Cursor cursor, final String columnNameOfKey, final boolean keepUpdated, final Handler handlerForUpdateNotifications) {
        throw new RuntimeException("Stub!");
    }
    
    public void setKeepUpdated(final boolean keepUpdated) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized ContentValues getValues(final String rowName) {
        throw new RuntimeException("Stub!");
    }
    
    public void requery() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized Map<String, ContentValues> getRows() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
}
