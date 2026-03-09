package android.database.sqlite;

import java.util.Set;
import android.content.ContentValues;
import android.os.CancellationSignal;
import android.database.Cursor;
import java.util.regex.Pattern;
import java.util.Collection;
import java.util.Map;

public class SQLiteQueryBuilder
{
    public SQLiteQueryBuilder() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDistinct(final boolean distinct) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDistinct() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getTables() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTables(@Nullable final String inTables) {
        throw new RuntimeException("Stub!");
    }
    
    public void appendWhere(@NonNull final CharSequence inWhere) {
        throw new RuntimeException("Stub!");
    }
    
    public void appendWhereEscapeString(@NonNull final String inWhere) {
        throw new RuntimeException("Stub!");
    }
    
    public void appendWhereStandalone(@NonNull final CharSequence inWhere) {
        throw new RuntimeException("Stub!");
    }
    
    public void setProjectionMap(@Nullable final Map<String, String> columnMap) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Map<String, String> getProjectionMap() {
        throw new RuntimeException("Stub!");
    }
    
    public void setProjectionGreylist(@Nullable final Collection<Pattern> projectionGreylist) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Collection<Pattern> getProjectionGreylist() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCursorFactory(@Nullable final SQLiteDatabase.CursorFactory factory) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SQLiteDatabase.CursorFactory getCursorFactory() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStrict(final boolean strict) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isStrict() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStrictColumns(final boolean strictColumns) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isStrictColumns() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStrictGrammar(final boolean strictGrammar) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isStrictGrammar() {
        throw new RuntimeException("Stub!");
    }
    
    public static String buildQueryString(final boolean distinct, final String tables, final String[] columns, final String where, final String groupBy, final String having, final String orderBy, final String limit) {
        throw new RuntimeException("Stub!");
    }
    
    public static void appendColumns(final StringBuilder s, final String[] columns) {
        throw new RuntimeException("Stub!");
    }
    
    public Cursor query(final SQLiteDatabase db, final String[] projectionIn, final String selection, final String[] selectionArgs, final String groupBy, final String having, final String sortOrder) {
        throw new RuntimeException("Stub!");
    }
    
    public Cursor query(final SQLiteDatabase db, final String[] projectionIn, final String selection, final String[] selectionArgs, final String groupBy, final String having, final String sortOrder, final String limit) {
        throw new RuntimeException("Stub!");
    }
    
    public Cursor query(final SQLiteDatabase db, final String[] projectionIn, final String selection, final String[] selectionArgs, final String groupBy, final String having, final String sortOrder, final String limit, final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    public long insert(@NonNull final SQLiteDatabase db, @NonNull final ContentValues values) {
        throw new RuntimeException("Stub!");
    }
    
    public int update(@NonNull final SQLiteDatabase db, @NonNull final ContentValues values, @Nullable final String selection, @Nullable final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    public int delete(@NonNull final SQLiteDatabase db, @Nullable final String selection, @Nullable final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    public String buildQuery(final String[] projectionIn, final String selection, final String groupBy, final String having, final String sortOrder, final String limit) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String buildQuery(final String[] projectionIn, final String selection, final String[] selectionArgs, final String groupBy, final String having, final String sortOrder, final String limit) {
        throw new RuntimeException("Stub!");
    }
    
    public String buildUnionSubQuery(final String typeDiscriminatorColumn, final String[] unionColumns, final Set<String> columnsPresentInTable, final int computedColumnsOffset, final String typeDiscriminatorValue, final String selection, final String groupBy, final String having) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String buildUnionSubQuery(final String typeDiscriminatorColumn, final String[] unionColumns, final Set<String> columnsPresentInTable, final int computedColumnsOffset, final String typeDiscriminatorValue, final String selection, final String[] selectionArgs, final String groupBy, final String having) {
        throw new RuntimeException("Stub!");
    }
    
    public String buildUnionQuery(final String[] subQueries, final String sortOrder, final String limit) {
        throw new RuntimeException("Stub!");
    }
}
