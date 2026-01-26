package android.database;

import java.util.List;
import android.net.Uri;
import android.content.ContentResolver;
import android.os.Bundle;

public class CursorWrapper implements Cursor
{
    public CursorWrapper(final Cursor cursor) {
        throw new RuntimeException("Stub!");
    }
    
    public Cursor getWrappedCursor() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isClosed() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void deactivate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean moveToFirst() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getColumnCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getColumnIndex(final String columnName) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getColumnIndexOrThrow(final String columnName) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getColumnName(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String[] getColumnNames() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public double getDouble(final int columnIndex) {
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
    public float getFloat(final int columnIndex) {
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
    public short getShort(final int columnIndex) {
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
    public byte[] getBlob(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean getWantsAllOnMoveCalls() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isAfterLast() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isBeforeFirst() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isFirst() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isLast() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getType(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isNull(final int columnIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean moveToLast() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean move(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean moveToPosition(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean moveToNext() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getPosition() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean moveToPrevious() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void registerContentObserver(final ContentObserver observer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void registerDataSetObserver(final DataSetObserver observer) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean requery() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Bundle respond(final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setNotificationUri(final ContentResolver cr, final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setNotificationUris(final ContentResolver cr, final List<Uri> uris) {
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
    public void unregisterContentObserver(final ContentObserver observer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void unregisterDataSetObserver(final DataSetObserver observer) {
        throw new RuntimeException("Stub!");
    }
}
