package android.database;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import java.io.PrintStream;
import android.database.sqlite.SQLiteProgram;
import android.content.OperationApplicationException;
import java.io.FileNotFoundException;
import android.os.Parcel;

public class DatabaseUtils
{
    public static final int STATEMENT_ABORT = 6;
    public static final int STATEMENT_ATTACH = 3;
    public static final int STATEMENT_BEGIN = 4;
    public static final int STATEMENT_COMMIT = 5;
    public static final int STATEMENT_DDL = 8;
    public static final int STATEMENT_OTHER = 99;
    public static final int STATEMENT_PRAGMA = 7;
    public static final int STATEMENT_SELECT = 1;
    public static final int STATEMENT_UNPREPARED = 9;
    public static final int STATEMENT_UPDATE = 2;
    
    public DatabaseUtils() {
        throw new RuntimeException("Stub!");
    }
    
    public static final void writeExceptionToParcel(final Parcel reply, final Exception e) {
        throw new RuntimeException("Stub!");
    }
    
    public static final void readExceptionFromParcel(final Parcel reply) {
        throw new RuntimeException("Stub!");
    }
    
    public static void readExceptionWithFileNotFoundExceptionFromParcel(final Parcel reply) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public static void readExceptionWithOperationApplicationExceptionFromParcel(final Parcel reply) throws OperationApplicationException {
        throw new RuntimeException("Stub!");
    }
    
    public static void bindObjectToProgram(final SQLiteProgram prog, final int index, final Object value) {
        throw new RuntimeException("Stub!");
    }
    
    public static void appendEscapedSQLString(final StringBuilder sb, final String sqlString) {
        throw new RuntimeException("Stub!");
    }
    
    public static String sqlEscapeString(final String value) {
        throw new RuntimeException("Stub!");
    }
    
    public static final void appendValueToSql(final StringBuilder sql, final Object value) {
        throw new RuntimeException("Stub!");
    }
    
    public static String concatenateWhere(final String a, final String b) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getCollationKey(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getHexCollationKey(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public static void dumpCursor(final Cursor cursor) {
        throw new RuntimeException("Stub!");
    }
    
    public static void dumpCursor(final Cursor cursor, final PrintStream stream) {
        throw new RuntimeException("Stub!");
    }
    
    public static void dumpCursor(final Cursor cursor, final StringBuilder sb) {
        throw new RuntimeException("Stub!");
    }
    
    public static String dumpCursorToString(final Cursor cursor) {
        throw new RuntimeException("Stub!");
    }
    
    public static void dumpCurrentRow(final Cursor cursor) {
        throw new RuntimeException("Stub!");
    }
    
    public static void dumpCurrentRow(final Cursor cursor, final PrintStream stream) {
        throw new RuntimeException("Stub!");
    }
    
    public static void dumpCurrentRow(final Cursor cursor, final StringBuilder sb) {
        throw new RuntimeException("Stub!");
    }
    
    public static String dumpCurrentRowToString(final Cursor cursor) {
        throw new RuntimeException("Stub!");
    }
    
    public static void cursorStringToContentValues(final Cursor cursor, final String field, final ContentValues values) {
        throw new RuntimeException("Stub!");
    }
    
    public static void cursorStringToInsertHelper(final Cursor cursor, final String field, final InsertHelper inserter, final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public static void cursorStringToContentValues(final Cursor cursor, final String field, final ContentValues values, final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public static void cursorIntToContentValues(final Cursor cursor, final String field, final ContentValues values) {
        throw new RuntimeException("Stub!");
    }
    
    public static void cursorIntToContentValues(final Cursor cursor, final String field, final ContentValues values, final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public static void cursorLongToContentValues(final Cursor cursor, final String field, final ContentValues values) {
        throw new RuntimeException("Stub!");
    }
    
    public static void cursorLongToContentValues(final Cursor cursor, final String field, final ContentValues values, final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public static void cursorDoubleToCursorValues(final Cursor cursor, final String field, final ContentValues values) {
        throw new RuntimeException("Stub!");
    }
    
    public static void cursorDoubleToContentValues(final Cursor cursor, final String field, final ContentValues values, final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public static void cursorRowToContentValues(final Cursor cursor, final ContentValues values) {
        throw new RuntimeException("Stub!");
    }
    
    public static long queryNumEntries(final SQLiteDatabase db, final String table) {
        throw new RuntimeException("Stub!");
    }
    
    public static long queryNumEntries(final SQLiteDatabase db, final String table, final String selection) {
        throw new RuntimeException("Stub!");
    }
    
    public static long queryNumEntries(final SQLiteDatabase db, final String table, final String selection, final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    public static long longForQuery(final SQLiteDatabase db, final String query, final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    public static long longForQuery(final SQLiteStatement prog, final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    public static String stringForQuery(final SQLiteDatabase db, final String query, final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    public static String stringForQuery(final SQLiteStatement prog, final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    public static ParcelFileDescriptor blobFileDescriptorForQuery(final SQLiteDatabase db, final String query, final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    public static ParcelFileDescriptor blobFileDescriptorForQuery(final SQLiteStatement prog, final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    public static void cursorStringToContentValuesIfPresent(final Cursor cursor, final ContentValues values, final String column) {
        throw new RuntimeException("Stub!");
    }
    
    public static void cursorLongToContentValuesIfPresent(final Cursor cursor, final ContentValues values, final String column) {
        throw new RuntimeException("Stub!");
    }
    
    public static void cursorShortToContentValuesIfPresent(final Cursor cursor, final ContentValues values, final String column) {
        throw new RuntimeException("Stub!");
    }
    
    public static void cursorIntToContentValuesIfPresent(final Cursor cursor, final ContentValues values, final String column) {
        throw new RuntimeException("Stub!");
    }
    
    public static void cursorFloatToContentValuesIfPresent(final Cursor cursor, final ContentValues values, final String column) {
        throw new RuntimeException("Stub!");
    }
    
    public static void cursorDoubleToContentValuesIfPresent(final Cursor cursor, final ContentValues values, final String column) {
        throw new RuntimeException("Stub!");
    }
    
    public static void createDbFromSqlStatements(final Context context, final String dbName, final int dbVersion, final String sqlStatements) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getSqlStatementType(final String sql) {
        throw new RuntimeException("Stub!");
    }
    
    public static String[] appendSelectionArgs(final String[] originalValues, final String[] newValues) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static class InsertHelper
    {
        @Deprecated
        public InsertHelper(final SQLiteDatabase db, final String tableName) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getColumnIndex(final String key) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void bind(final int index, final double value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void bind(final int index, final float value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void bind(final int index, final long value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void bind(final int index, final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void bind(final int index, final boolean value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void bindNull(final int index) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void bind(final int index, final byte[] value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void bind(final int index, final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public long insert(final ContentValues values) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public long execute() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void prepareForInsert() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void prepareForReplace() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public long replace(final ContentValues values) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void close() {
            throw new RuntimeException("Stub!");
        }
    }
}
