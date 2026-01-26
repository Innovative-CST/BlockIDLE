package android.provider;

import android.net.Uri;

public class VoicemailContract
{
    public static final String ACTION_FETCH_VOICEMAIL = "android.intent.action.FETCH_VOICEMAIL";
    public static final String ACTION_NEW_VOICEMAIL = "android.intent.action.NEW_VOICEMAIL";
    public static final String ACTION_SYNC_VOICEMAIL = "android.provider.action.SYNC_VOICEMAIL";
    public static final String AUTHORITY = "com.android.voicemail";
    public static final String EXTRA_PHONE_ACCOUNT_HANDLE = "android.provider.extra.PHONE_ACCOUNT_HANDLE";
    public static final String EXTRA_SELF_CHANGE = "com.android.voicemail.extra.SELF_CHANGE";
    public static final String PARAM_KEY_SOURCE_PACKAGE = "source_package";
    
    VoicemailContract() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Status implements BaseColumns
    {
        public static final String CONFIGURATION_STATE = "configuration_state";
        public static final int CONFIGURATION_STATE_CAN_BE_CONFIGURED = 2;
        public static final int CONFIGURATION_STATE_CONFIGURING = 3;
        public static final int CONFIGURATION_STATE_DISABLED = 5;
        public static final int CONFIGURATION_STATE_FAILED = 4;
        public static final int CONFIGURATION_STATE_NOT_CONFIGURED = 1;
        public static final int CONFIGURATION_STATE_OK = 0;
        public static final Uri CONTENT_URI;
        public static final String DATA_CHANNEL_STATE = "data_channel_state";
        public static final int DATA_CHANNEL_STATE_BAD_CONFIGURATION = 3;
        public static final int DATA_CHANNEL_STATE_COMMUNICATION_ERROR = 4;
        public static final int DATA_CHANNEL_STATE_NO_CONNECTION = 1;
        public static final int DATA_CHANNEL_STATE_NO_CONNECTION_CELLULAR_REQUIRED = 2;
        public static final int DATA_CHANNEL_STATE_OK = 0;
        public static final int DATA_CHANNEL_STATE_SERVER_CONNECTION_ERROR = 6;
        public static final int DATA_CHANNEL_STATE_SERVER_ERROR = 5;
        public static final String DIR_TYPE = "vnd.android.cursor.dir/voicemail.source.status";
        public static final String ITEM_TYPE = "vnd.android.cursor.item/voicemail.source.status";
        public static final String NOTIFICATION_CHANNEL_STATE = "notification_channel_state";
        public static final int NOTIFICATION_CHANNEL_STATE_MESSAGE_WAITING = 2;
        public static final int NOTIFICATION_CHANNEL_STATE_NO_CONNECTION = 1;
        public static final int NOTIFICATION_CHANNEL_STATE_OK = 0;
        public static final String PHONE_ACCOUNT_COMPONENT_NAME = "phone_account_component_name";
        public static final String PHONE_ACCOUNT_ID = "phone_account_id";
        public static final String QUOTA_OCCUPIED = "quota_occupied";
        public static final String QUOTA_TOTAL = "quota_total";
        public static final int QUOTA_UNAVAILABLE = -1;
        public static final String SETTINGS_URI = "settings_uri";
        public static final String SOURCE_PACKAGE = "source_package";
        public static final String SOURCE_TYPE = "source_type";
        public static final String VOICEMAIL_ACCESS_URI = "voicemail_access_uri";
        
        Status() {
            throw new RuntimeException("Stub!");
        }
        
        public static Uri buildSourceUri(final String packageName) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_URI = null;
        }
    }
    
    public static final class Voicemails implements BaseColumns, OpenableColumns
    {
        public static final String ARCHIVED = "archived";
        public static final String BACKED_UP = "backed_up";
        public static final Uri CONTENT_URI;
        public static final String DATE = "date";
        public static final String DELETED = "deleted";
        public static final String DIRTY = "dirty";
        public static final int DIRTY_RETAIN = -1;
        public static final String DIR_TYPE = "vnd.android.cursor.dir/voicemails";
        public static final String DURATION = "duration";
        public static final String HAS_CONTENT = "has_content";
        public static final String IS_OMTP_VOICEMAIL = "is_omtp_voicemail";
        public static final String IS_READ = "is_read";
        public static final String ITEM_TYPE = "vnd.android.cursor.item/voicemail";
        public static final String LAST_MODIFIED = "last_modified";
        public static final String MIME_TYPE = "mime_type";
        public static final String NEW = "new";
        public static final String NUMBER = "number";
        public static final String PHONE_ACCOUNT_COMPONENT_NAME = "subscription_component_name";
        public static final String PHONE_ACCOUNT_ID = "subscription_id";
        public static final String RESTORED = "restored";
        public static final String SOURCE_DATA = "source_data";
        public static final String SOURCE_PACKAGE = "source_package";
        public static final String TRANSCRIPTION = "transcription";
        
        Voicemails() {
            throw new RuntimeException("Stub!");
        }
        
        public static Uri buildSourceUri(final String packageName) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_URI = null;
        }
    }
}
