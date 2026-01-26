package android.database;

import android.os.Handler;
import android.os.Bundle;
import java.util.List;
import android.net.Uri;
import android.content.ContentResolver;

public abstract class AbstractCursor implements CrossProcessCursor
{
    @Deprecated
    protected boolean mClosed;
    @Deprecated
    protected ContentResolver mContentResolver;
    @Deprecated
    protected int mPos;
    
    public AbstractCursor() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public abstract int getCount();
    
    @Override
    public abstract String[] getColumnNames();
    
    @Override
    public abstract String getString(final int p0);
    
    @Override
    public abstract short getShort(final int p0);
    
    @Override
    public abstract int getInt(final int p0);
    
    @Override
    public abstract long getLong(final int p0);
    
    @Override
    public abstract float getFloat(final int p0);
    
    @Override
    public abstract double getDouble(final int p0);
    
    @Override
    public abstract boolean isNull(final int p0);
    
    @Override
    public int getType(final int column) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public byte[] getBlob(final int column) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CursorWindow getWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getColumnCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void deactivate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean requery() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isClosed() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onMove(final int oldPosition, final int newPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void copyStringToBuffer(final int columnIndex, final CharArrayBuffer buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final int getPosition() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final boolean moveToPosition(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void fillWindow(final int position, final CursorWindow window) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final boolean move(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final boolean moveToFirst() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final boolean moveToLast() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final boolean moveToNext() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final boolean moveToPrevious() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final boolean isFirst() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final boolean isLast() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final boolean isBeforeFirst() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final boolean isAfterLast() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getColumnIndex(final String columnName) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getColumnIndexOrThrow(final String columnName) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getColumnName(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void registerContentObserver(final ContentObserver observer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void unregisterContentObserver(final ContentObserver observer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void registerDataSetObserver(final DataSetObserver observer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void unregisterDataSetObserver(final DataSetObserver observer) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onChange(final boolean selfChange) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setNotificationUri(final ContentResolver cr, final Uri notifyUri) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setNotificationUris(@NonNull final ContentResolver cr, @NonNull final List<Uri> notifyUris) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Uri getNotificationUri() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public List<Uri> getNotificationUris() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean getWantsAllOnMoveCalls() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setExtras(final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Bundle respond(final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected boolean isFieldUpdated(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected Object getUpdatedField(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    protected void checkPosition() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    protected static class SelfContentObserver extends ContentObserver
    {
        public SelfContentObserver(final AbstractCursor cursor) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean deliverSelfNotifications() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void onChange(final boolean selfChange) {
            throw new RuntimeException("Stub!");
        }
    }
}
