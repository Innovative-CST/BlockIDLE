package android.database.sqlite;

import android.database.DatabaseErrorHandler;
import android.content.Context;

public abstract class SQLiteOpenHelper implements AutoCloseable
{
    public SQLiteOpenHelper(@Nullable final Context context, @Nullable final String name, @Nullable final SQLiteDatabase.CursorFactory factory, final int version) {
        throw new RuntimeException("Stub!");
    }
    
    public SQLiteOpenHelper(@Nullable final Context context, @Nullable final String name, @Nullable final SQLiteDatabase.CursorFactory factory, final int version, @Nullable final DatabaseErrorHandler errorHandler) {
        throw new RuntimeException("Stub!");
    }
    
    public SQLiteOpenHelper(@Nullable final Context context, @Nullable final String name, final int version, @NonNull final SQLiteDatabase.OpenParams openParams) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDatabaseName() {
        throw new RuntimeException("Stub!");
    }
    
    public void setWriteAheadLoggingEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLookasideConfig(final int slotSize, final int slotCount) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOpenParams(@NonNull final SQLiteDatabase.OpenParams openParams) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setIdleConnectionTimeout(final long idleConnectionTimeoutMs) {
        throw new RuntimeException("Stub!");
    }
    
    public SQLiteDatabase getWritableDatabase() {
        throw new RuntimeException("Stub!");
    }
    
    public SQLiteDatabase getReadableDatabase() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized void close() {
        throw new RuntimeException("Stub!");
    }
    
    public void onConfigure(final SQLiteDatabase db) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onCreate(final SQLiteDatabase p0);
    
    public abstract void onUpgrade(final SQLiteDatabase p0, final int p1, final int p2);
    
    public void onDowngrade(final SQLiteDatabase db, final int oldVersion, final int newVersion) {
        throw new RuntimeException("Stub!");
    }
    
    public void onOpen(final SQLiteDatabase db) {
        throw new RuntimeException("Stub!");
    }
}
