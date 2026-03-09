package android.provider;

import java.util.Locale;
import android.content.Context;
import android.net.Uri;

public class UserDictionary
{
    public static final String AUTHORITY = "user_dictionary";
    public static final Uri CONTENT_URI;
    
    public UserDictionary() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CONTENT_URI = null;
    }
    
    public static class Words implements BaseColumns
    {
        public static final String APP_ID = "appid";
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.google.userword";
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.google.userword";
        public static final Uri CONTENT_URI;
        public static final String DEFAULT_SORT_ORDER = "frequency DESC";
        public static final String FREQUENCY = "frequency";
        public static final String LOCALE = "locale";
        @Deprecated
        public static final int LOCALE_TYPE_ALL = 0;
        @Deprecated
        public static final int LOCALE_TYPE_CURRENT = 1;
        public static final String SHORTCUT = "shortcut";
        public static final String WORD = "word";
        public static final String _ID = "_id";
        
        public Words() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public static void addWord(final Context context, final String word, final int frequency, final int localeType) {
            throw new RuntimeException("Stub!");
        }
        
        public static void addWord(final Context context, final String word, final int frequency, final String shortcut, final Locale locale) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_URI = null;
        }
    }
}
