package android.database.sqlite;

import android.util.Pair;
import java.util.List;
import java.util.Locale;
import android.content.ContentValues;
import android.os.CancellationSignal;
import android.database.Cursor;
import android.database.SQLException;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import android.database.DatabaseErrorHandler;
import java.io.File;
import java.util.Map;

public final class SQLiteDatabase extends SQLiteClosable
{
    public static final int CONFLICT_ABORT = 2;
    public static final int CONFLICT_FAIL = 3;
    public static final int CONFLICT_IGNORE = 4;
    public static final int CONFLICT_NONE = 0;
    public static final int CONFLICT_REPLACE = 5;
    public static final int CONFLICT_ROLLBACK = 1;
    public static final int CREATE_IF_NECESSARY = 268435456;
    public static final int ENABLE_WRITE_AHEAD_LOGGING = 536870912;
    public static final String JOURNAL_MODE_DELETE = "DELETE";
    public static final String JOURNAL_MODE_MEMORY = "MEMORY";
    public static final String JOURNAL_MODE_OFF = "OFF";
    public static final String JOURNAL_MODE_PERSIST = "PERSIST";
    public static final String JOURNAL_MODE_TRUNCATE = "TRUNCATE";
    public static final String JOURNAL_MODE_WAL = "WAL";
    public static final int MAX_SQL_CACHE_SIZE = 100;
    public static final int NO_LOCALIZED_COLLATORS = 16;
    public static final int OPEN_READONLY = 1;
    public static final int OPEN_READWRITE = 0;
    public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
    public static final String SYNC_MODE_EXTRA = "EXTRA";
    public static final String SYNC_MODE_FULL = "FULL";
    public static final String SYNC_MODE_NORMAL = "NORMAL";
    public static final String SYNC_MODE_OFF = "OFF";
    
    SQLiteDatabase() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onAllReferencesReleased() {
        throw new RuntimeException("Stub!");
    }
    
    public static int releaseMemory() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setLockingEnabled(final boolean lockingEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void beginTransaction() {
        throw new RuntimeException("Stub!");
    }
    
    public void beginTransactionNonExclusive() {
        throw new RuntimeException("Stub!");
    }
    
    public void beginTransactionReadOnly() {
        throw new RuntimeException("Stub!");
    }
    
    public void beginTransactionWithListener(@Nullable final SQLiteTransactionListener transactionListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void beginTransactionWithListenerNonExclusive(@Nullable final SQLiteTransactionListener transactionListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void beginTransactionWithListenerReadOnly(@Nullable final SQLiteTransactionListener transactionListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void endTransaction() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTransactionSuccessful() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean inTransaction() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDbLockedByCurrentThread() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isDbLockedByOtherThreads() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean yieldIfContended() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean yieldIfContendedSafely() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean yieldIfContendedSafely(final long sleepAfterYieldDelay) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Map<String, String> getSyncedTables() {
        throw new RuntimeException("Stub!");
    }
    
    public static SQLiteDatabase openDatabase(@NonNull final String path, @Nullable final CursorFactory factory, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static SQLiteDatabase openDatabase(@NonNull final File path, @NonNull final OpenParams openParams) {
        throw new RuntimeException("Stub!");
    }
    
    public static SQLiteDatabase openDatabase(@NonNull final String path, @Nullable final CursorFactory factory, final int flags, @Nullable final DatabaseErrorHandler errorHandler) {
        throw new RuntimeException("Stub!");
    }
    
    public static SQLiteDatabase openOrCreateDatabase(@NonNull final File file, @Nullable final CursorFactory factory) {
        throw new RuntimeException("Stub!");
    }
    
    public static SQLiteDatabase openOrCreateDatabase(@NonNull final String path, @Nullable final CursorFactory factory) {
        throw new RuntimeException("Stub!");
    }
    
    public static SQLiteDatabase openOrCreateDatabase(@NonNull final String path, @Nullable final CursorFactory factory, @Nullable final DatabaseErrorHandler errorHandler) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean deleteDatabase(@NonNull final File file) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static SQLiteDatabase create(@Nullable final CursorFactory factory) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static SQLiteDatabase createInMemory(@NonNull final OpenParams openParams) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCustomScalarFunction(@NonNull final String functionName, @NonNull final UnaryOperator<String> scalarFunction) throws SQLiteException {
        throw new RuntimeException("Stub!");
    }
    
    public void setCustomAggregateFunction(@NonNull final String functionName, @NonNull final BinaryOperator<String> aggregateFunction) throws SQLiteException {
        throw new RuntimeException("Stub!");
    }
    
    public void execPerConnectionSQL(@NonNull final String sql, @Nullable final Object[] bindArgs) throws SQLException {
        throw new RuntimeException("Stub!");
    }
    
    public int getVersion() {
        throw new RuntimeException("Stub!");
    }
    
    public void setVersion(final int version) {
        throw new RuntimeException("Stub!");
    }
    
    public long getMaximumSize() {
        throw new RuntimeException("Stub!");
    }
    
    public long setMaximumSize(final long numBytes) {
        throw new RuntimeException("Stub!");
    }
    
    public long getPageSize() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPageSize(final long numBytes) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void markTableSyncable(final String table, final String deletedTable) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void markTableSyncable(final String table, final String foreignKey, final String updateTable) {
        throw new RuntimeException("Stub!");
    }
    
    public static String findEditTable(final String tables) {
        throw new RuntimeException("Stub!");
    }
    
    public SQLiteStatement compileStatement(final String sql) throws SQLException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Cursor query(final boolean distinct, @NonNull final String table, @Nullable final String[] columns, @Nullable final String selection, @Nullable final String[] selectionArgs, @Nullable final String groupBy, @Nullable final String having, @Nullable final String orderBy, @Nullable final String limit) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Cursor query(final boolean distinct, @NonNull final String table, @Nullable final String[] columns, @Nullable final String selection, @Nullable final String[] selectionArgs, @Nullable final String groupBy, @Nullable final String having, @Nullable final String orderBy, @Nullable final String limit, @Nullable final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Cursor queryWithFactory(@Nullable final CursorFactory cursorFactory, final boolean distinct, @NonNull final String table, @Nullable final String[] columns, @Nullable final String selection, @Nullable final String[] selectionArgs, @Nullable final String groupBy, @Nullable final String having, @Nullable final String orderBy, @Nullable final String limit) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Cursor queryWithFactory(@Nullable final CursorFactory cursorFactory, final boolean distinct, @NonNull final String table, @Nullable final String[] columns, @Nullable final String selection, @Nullable final String[] selectionArgs, @Nullable final String groupBy, @Nullable final String having, @Nullable final String orderBy, @Nullable final String limit, @Nullable final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Cursor query(@NonNull final String table, @Nullable final String[] columns, @Nullable final String selection, @Nullable final String[] selectionArgs, @Nullable final String groupBy, @Nullable final String having, @Nullable final String orderBy) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Cursor query(@NonNull final String table, @Nullable final String[] columns, @Nullable final String selection, @Nullable final String[] selectionArgs, @Nullable final String groupBy, @Nullable final String having, @Nullable final String orderBy, @Nullable final String limit) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Cursor rawQuery(@NonNull final String sql, @Nullable final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Cursor rawQuery(@NonNull final String sql, @Nullable final String[] selectionArgs, @Nullable final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Cursor rawQueryWithFactory(@Nullable final CursorFactory cursorFactory, @NonNull final String sql, @Nullable final String[] selectionArgs, @NonNull final String editTable) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Cursor rawQueryWithFactory(@Nullable final CursorFactory cursorFactory, @NonNull final String sql, @Nullable final String[] selectionArgs, @NonNull final String editTable, @Nullable final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    public long insert(@NonNull final String table, @Nullable final String nullColumnHack, @Nullable final ContentValues values) {
        throw new RuntimeException("Stub!");
    }
    
    public long insertOrThrow(@NonNull final String table, @Nullable final String nullColumnHack, @Nullable final ContentValues values) throws SQLException {
        throw new RuntimeException("Stub!");
    }
    
    public long replace(@NonNull final String table, @Nullable final String nullColumnHack, @Nullable final ContentValues initialValues) {
        throw new RuntimeException("Stub!");
    }
    
    public long replaceOrThrow(@NonNull final String table, @Nullable final String nullColumnHack, @Nullable final ContentValues initialValues) throws SQLException {
        throw new RuntimeException("Stub!");
    }
    
    public long insertWithOnConflict(@NonNull final String table, @Nullable final String nullColumnHack, @Nullable final ContentValues initialValues, final int conflictAlgorithm) {
        throw new RuntimeException("Stub!");
    }
    
    public int delete(@NonNull final String table, @Nullable final String whereClause, @Nullable final String[] whereArgs) {
        throw new RuntimeException("Stub!");
    }
    
    public int update(@NonNull final String table, @Nullable final ContentValues values, @Nullable final String whereClause, @Nullable final String[] whereArgs) {
        throw new RuntimeException("Stub!");
    }
    
    public int updateWithOnConflict(@NonNull final String table, @Nullable final ContentValues values, @Nullable final String whereClause, @Nullable final String[] whereArgs, final int conflictAlgorithm) {
        throw new RuntimeException("Stub!");
    }
    
    public void execSQL(final String sql) throws SQLException {
        throw new RuntimeException("Stub!");
    }
    
    public void execSQL(@NonNull final String sql, @NonNull final Object[] bindArgs) throws SQLException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SQLiteRawStatement createRawStatement(@NonNull final String sql) {
        throw new RuntimeException("Stub!");
    }
    
    public long getLastInsertRowId() {
        throw new RuntimeException("Stub!");
    }
    
    public long getLastChangedRowCount() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTotalChangedRowCount() {
        throw new RuntimeException("Stub!");
    }
    
    public void validateSql(@NonNull final String sql, @Nullable final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isReadOnly() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOpen() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean needUpgrade(final int newVersion) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPath() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLocale(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaxSqlCacheSize(final int cacheSize) {
        throw new RuntimeException("Stub!");
    }
    
    public void setForeignKeyConstraintsEnabled(final boolean enable) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean enableWriteAheadLogging() {
        throw new RuntimeException("Stub!");
    }
    
    public void disableWriteAheadLogging() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWriteAheadLoggingEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public List<Pair<String, String>> getAttachedDbs() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDatabaseIntegrityOk() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class OpenParams
    {
        OpenParams() {
            throw new RuntimeException("Stub!");
        }
        
        public int getLookasideSlotSize() {
            throw new RuntimeException("Stub!");
        }
        
        public int getLookasideSlotCount() {
            throw new RuntimeException("Stub!");
        }
        
        public int getOpenFlags() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public CursorFactory getCursorFactory() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public DatabaseErrorHandler getErrorHandler() {
            throw new RuntimeException("Stub!");
        }
        
        public long getIdleConnectionTimeout() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public String getJournalMode() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public String getSynchronousMode() {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Builder
        {
            public Builder() {
                throw new RuntimeException("Stub!");
            }
            
            public Builder(final OpenParams params) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setLookasideConfig(final int slotSize, final int slotCount) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setOpenFlags(final int openFlags) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder addOpenFlags(final int openFlags) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder removeOpenFlags(final int openFlags) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setCursorFactory(@Nullable final CursorFactory cursorFactory) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setErrorHandler(@Nullable final DatabaseErrorHandler errorHandler) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            @NonNull
            public Builder setIdleConnectionTimeout(final long idleConnectionTimeoutMs) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setJournalMode(@NonNull final String journalMode) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setSynchronousMode(@NonNull final String syncMode) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public OpenParams build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public interface CursorFactory
    {
        Cursor newCursor(final SQLiteDatabase p0, final SQLiteCursorDriver p1, final String p2, final SQLiteQuery p3);
    }
}
