package android.database;

import android.os.Bundle;
import java.util.List;
import android.net.Uri;
import android.content.ContentResolver;
import java.io.Closeable;

public interface Cursor extends Closeable
{
    public static final int FIELD_TYPE_BLOB = 4;
    public static final int FIELD_TYPE_FLOAT = 2;
    public static final int FIELD_TYPE_INTEGER = 1;
    public static final int FIELD_TYPE_NULL = 0;
    public static final int FIELD_TYPE_STRING = 3;
    
    int getCount();
    
    int getPosition();
    
    boolean move(final int p0);
    
    boolean moveToPosition(final int p0);
    
    boolean moveToFirst();
    
    boolean moveToLast();
    
    boolean moveToNext();
    
    boolean moveToPrevious();
    
    boolean isFirst();
    
    boolean isLast();
    
    boolean isBeforeFirst();
    
    boolean isAfterLast();
    
    int getColumnIndex(final String p0);
    
    int getColumnIndexOrThrow(final String p0) throws IllegalArgumentException;
    
    String getColumnName(final int p0);
    
    String[] getColumnNames();
    
    int getColumnCount();
    
    byte[] getBlob(final int p0);
    
    String getString(final int p0);
    
    void copyStringToBuffer(final int p0, final CharArrayBuffer p1);
    
    short getShort(final int p0);
    
    int getInt(final int p0);
    
    long getLong(final int p0);
    
    float getFloat(final int p0);
    
    double getDouble(final int p0);
    
    int getType(final int p0);
    
    boolean isNull(final int p0);
    
    @Deprecated
    void deactivate();
    
    @Deprecated
    boolean requery();
    
    void close();
    
    boolean isClosed();
    
    void registerContentObserver(final ContentObserver p0);
    
    void unregisterContentObserver(final ContentObserver p0);
    
    void registerDataSetObserver(final DataSetObserver p0);
    
    void unregisterDataSetObserver(final DataSetObserver p0);
    
    void setNotificationUri(final ContentResolver p0, final Uri p1);
    
    default void setNotificationUris(@NonNull final ContentResolver cr, @NonNull final List<Uri> uris) {
        throw new RuntimeException("Stub!");
    }
    
    Uri getNotificationUri();
    
    @Nullable
    default List<Uri> getNotificationUris() {
        throw new RuntimeException("Stub!");
    }
    
    boolean getWantsAllOnMoveCalls();
    
    void setExtras(final Bundle p0);
    
    Bundle getExtras();
    
    Bundle respond(final Bundle p0);
}
