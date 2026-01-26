package android.database;

import android.os.Parcel;
import android.os.Parcelable;
import android.database.sqlite.SQLiteClosable;

public class CursorWindow extends SQLiteClosable implements Parcelable
{
    @NonNull
    public static final Creator<CursorWindow> CREATOR;
    
    public CursorWindow(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public CursorWindow(final String name, final long windowSizeBytes) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public CursorWindow(final boolean localWindow) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public void clear() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStartPosition() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStartPosition(final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public int getNumRows() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setNumColumns(final int columnNum) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean allocRow() {
        throw new RuntimeException("Stub!");
    }
    
    public void freeLastRow() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isNull(final int row, final int column) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isBlob(final int row, final int column) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isLong(final int row, final int column) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isFloat(final int row, final int column) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isString(final int row, final int column) {
        throw new RuntimeException("Stub!");
    }
    
    public int getType(final int row, final int column) {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getBlob(final int row, final int column) {
        throw new RuntimeException("Stub!");
    }
    
    public String getString(final int row, final int column) {
        throw new RuntimeException("Stub!");
    }
    
    public void copyStringToBuffer(final int row, final int column, final CharArrayBuffer buffer) {
        throw new RuntimeException("Stub!");
    }
    
    public long getLong(final int row, final int column) {
        throw new RuntimeException("Stub!");
    }
    
    public double getDouble(final int row, final int column) {
        throw new RuntimeException("Stub!");
    }
    
    public short getShort(final int row, final int column) {
        throw new RuntimeException("Stub!");
    }
    
    public int getInt(final int row, final int column) {
        throw new RuntimeException("Stub!");
    }
    
    public float getFloat(final int row, final int column) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean putBlob(final byte[] value, final int row, final int column) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean putString(final String value, final int row, final int column) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean putLong(final long value, final int row, final int column) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean putDouble(final double value, final int row, final int column) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean putNull(final int row, final int column) {
        throw new RuntimeException("Stub!");
    }
    
    public static CursorWindow newFromParcel(final Parcel p) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onAllReferencesReleased() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
