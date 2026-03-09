package android.provider;

import android.content.ContentResolver;
import android.net.Uri;

public final class SimPhonebookContract
{
    public static final String AUTHORITY = "com.android.simphonebook";
    @NonNull
    public static final Uri AUTHORITY_URI;
    
    SimPhonebookContract() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        AUTHORITY_URI = null;
    }
    
    public static final class ElementaryFiles
    {
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/sim-elementary-file";
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/sim-elementary-file";
        @NonNull
        public static final Uri CONTENT_URI;
        public static final int EF_ADN = 1;
        public static final int EF_FDN = 2;
        public static final int EF_SDN = 3;
        public static final String EF_TYPE = "ef_type";
        public static final int EF_UNKNOWN = 0;
        public static final String MAX_RECORDS = "max_records";
        public static final String NAME_MAX_LENGTH = "name_max_length";
        public static final String PHONE_NUMBER_MAX_LENGTH = "phone_number_max_length";
        public static final String RECORD_COUNT = "record_count";
        public static final String SLOT_INDEX = "slot_index";
        public static final String SUBSCRIPTION_ID = "subscription_id";
        
        ElementaryFiles() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static Uri getItemUri(final int subscriptionId, final int efType) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_URI = null;
        }
    }
    
    public static final class SimRecords
    {
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/sim-contact_v2";
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/sim-contact_v2";
        public static final String ELEMENTARY_FILE_TYPE = "elementary_file_type";
        public static final int ERROR_NAME_UNSUPPORTED = -1;
        public static final String NAME = "name";
        public static final String PHONE_NUMBER = "phone_number";
        public static final String RECORD_NUMBER = "record_number";
        public static final String SUBSCRIPTION_ID = "subscription_id";
        
        SimRecords() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static Uri getContentUri(final int subscriptionId, final int efType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static Uri getItemUri(final int subscriptionId, final int efType, final int recordNumber) {
            throw new RuntimeException("Stub!");
        }
        
        public static int getEncodedNameLength(@NonNull final ContentResolver resolver, @NonNull final String name) {
            throw new RuntimeException("Stub!");
        }
    }
}
