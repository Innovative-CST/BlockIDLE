package android.provider;

import android.content.Context;
import android.net.Uri;

public class BlockedNumberContract
{
    public static final String AUTHORITY = "com.android.blockednumber";
    public static final Uri AUTHORITY_URI;
    
    BlockedNumberContract() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isBlocked(final Context context, final String phoneNumber) {
        throw new RuntimeException("Stub!");
    }
    
    public static int unblock(final Context context, final String phoneNumber) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean canCurrentUserBlockNumbers(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        AUTHORITY_URI = null;
    }
    
    public static class BlockedNumbers
    {
        public static final String COLUMN_E164_NUMBER = "e164_number";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_ORIGINAL_NUMBER = "original_number";
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/blocked_number";
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/blocked_number";
        public static final Uri CONTENT_URI;
        
        BlockedNumbers() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_URI = null;
        }
    }
}
