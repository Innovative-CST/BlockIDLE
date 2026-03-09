package android.provider;

import android.content.ContentResolver;
import android.content.Context;

public class SearchRecentSuggestions
{
    public static final String[] QUERIES_PROJECTION_1LINE;
    public static final String[] QUERIES_PROJECTION_2LINE;
    public static final int QUERIES_PROJECTION_DATE_INDEX = 1;
    public static final int QUERIES_PROJECTION_DISPLAY1_INDEX = 3;
    public static final int QUERIES_PROJECTION_DISPLAY2_INDEX = 4;
    public static final int QUERIES_PROJECTION_QUERY_INDEX = 2;
    
    public SearchRecentSuggestions(final Context context, final String authority, final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public void saveRecentQuery(final String queryString, final String line2) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearHistory() {
        throw new RuntimeException("Stub!");
    }
    
    protected void truncateHistory(final ContentResolver cr, final int maxEntries) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        QUERIES_PROJECTION_1LINE = null;
        QUERIES_PROJECTION_2LINE = null;
    }
}
