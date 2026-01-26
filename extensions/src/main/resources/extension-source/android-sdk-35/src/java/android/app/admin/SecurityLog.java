package android.app.admin;

import android.os.Parcel;
import android.os.Parcelable;

public class SecurityLog
{
    public static final int LEVEL_ERROR = 3;
    public static final int LEVEL_INFO = 1;
    public static final int LEVEL_WARNING = 2;
    public static final int TAG_ADB_SHELL_CMD = 210002;
    public static final int TAG_ADB_SHELL_INTERACTIVE = 210001;
    public static final int TAG_APP_PROCESS_START = 210005;
    public static final int TAG_BACKUP_SERVICE_TOGGLED = 210044;
    public static final int TAG_BLUETOOTH_CONNECTION = 210039;
    public static final int TAG_BLUETOOTH_DISCONNECTION = 210040;
    public static final int TAG_CAMERA_POLICY_SET = 210034;
    public static final int TAG_CERT_AUTHORITY_INSTALLED = 210029;
    public static final int TAG_CERT_AUTHORITY_REMOVED = 210030;
    public static final int TAG_CERT_VALIDATION_FAILURE = 210033;
    public static final int TAG_CRYPTO_SELF_TEST_COMPLETED = 210031;
    public static final int TAG_KEYGUARD_DISABLED_FEATURES_SET = 210021;
    public static final int TAG_KEYGUARD_DISMISSED = 210006;
    public static final int TAG_KEYGUARD_DISMISS_AUTH_ATTEMPT = 210007;
    public static final int TAG_KEYGUARD_SECURED = 210008;
    public static final int TAG_KEY_DESTRUCTION = 210026;
    public static final int TAG_KEY_GENERATED = 210024;
    public static final int TAG_KEY_IMPORT = 210025;
    public static final int TAG_KEY_INTEGRITY_VIOLATION = 210032;
    public static final int TAG_LOGGING_STARTED = 210011;
    public static final int TAG_LOGGING_STOPPED = 210012;
    public static final int TAG_LOG_BUFFER_SIZE_CRITICAL = 210015;
    public static final int TAG_MAX_PASSWORD_ATTEMPTS_SET = 210020;
    public static final int TAG_MAX_SCREEN_LOCK_TIMEOUT_SET = 210019;
    public static final int TAG_MEDIA_MOUNT = 210013;
    public static final int TAG_MEDIA_UNMOUNT = 210014;
    public static final int TAG_OS_SHUTDOWN = 210010;
    public static final int TAG_OS_STARTUP = 210009;
    public static final int TAG_PACKAGE_INSTALLED = 210041;
    public static final int TAG_PACKAGE_UNINSTALLED = 210043;
    public static final int TAG_PACKAGE_UPDATED = 210042;
    public static final int TAG_PASSWORD_CHANGED = 210036;
    public static final int TAG_PASSWORD_COMPLEXITY_REQUIRED = 210035;
    public static final int TAG_PASSWORD_COMPLEXITY_SET = 210017;
    public static final int TAG_PASSWORD_EXPIRATION_SET = 210016;
    public static final int TAG_PASSWORD_HISTORY_LENGTH_SET = 210018;
    public static final int TAG_REMOTE_LOCK = 210022;
    public static final int TAG_SYNC_RECV_FILE = 210003;
    public static final int TAG_SYNC_SEND_FILE = 210004;
    public static final int TAG_USER_RESTRICTION_ADDED = 210027;
    public static final int TAG_USER_RESTRICTION_REMOVED = 210028;
    public static final int TAG_WIFI_CONNECTION = 210037;
    public static final int TAG_WIFI_DISCONNECTION = 210038;
    public static final int TAG_WIPE_FAILURE = 210023;
    
    public SecurityLog() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class SecurityEvent implements Parcelable
    {
        @NonNull
        public static final Creator<SecurityEvent> CREATOR;
        
        SecurityEvent() {
            throw new RuntimeException("Stub!");
        }
        
        public long getTimeNanos() {
            throw new RuntimeException("Stub!");
        }
        
        public int getTag() {
            throw new RuntimeException("Stub!");
        }
        
        public Object getData() {
            throw new RuntimeException("Stub!");
        }
        
        public long getId() {
            throw new RuntimeException("Stub!");
        }
        
        public int getLogLevel() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object o) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
}
