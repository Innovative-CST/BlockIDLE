package android.content;

import android.database.Cursor;
import android.net.Uri;

public class SearchRecentSuggestionsProvider extends ContentProvider
{
    public static final int DATABASE_MODE_2LINES = 2;
    public static final int DATABASE_MODE_QUERIES = 1;
    
    public SearchRecentSuggestionsProvider() {
        throw new RuntimeException("Stub!");
    }
    
    protected void setupSuggestions(final String authority, final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int delete(final Uri uri, final String selection, final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getType(final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Uri insert(final Uri uri, final ContentValues values) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onCreate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Cursor query(final Uri uri, final String[] projection, final String selection, final String[] selectionArgs, final String sortOrder) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int update(final Uri uri, final ContentValues values, final String selection, final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
}
