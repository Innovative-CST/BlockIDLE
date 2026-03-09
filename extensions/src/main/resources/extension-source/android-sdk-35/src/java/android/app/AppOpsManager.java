package android.app;

import java.util.concurrent.Executor;

public class AppOpsManager
{
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_FOREGROUND = 4;
    public static final int MODE_IGNORED = 1;
    public static final String OPSTR_ADD_VOICEMAIL = "android:add_voicemail";
    public static final String OPSTR_ANSWER_PHONE_CALLS = "android:answer_phone_calls";
    public static final String OPSTR_BODY_SENSORS = "android:body_sensors";
    public static final String OPSTR_CALL_PHONE = "android:call_phone";
    public static final String OPSTR_CAMERA = "android:camera";
    public static final String OPSTR_COARSE_LOCATION = "android:coarse_location";
    public static final String OPSTR_FINE_LOCATION = "android:fine_location";
    public static final String OPSTR_GET_USAGE_STATS = "android:get_usage_stats";
    public static final String OPSTR_MOCK_LOCATION = "android:mock_location";
    public static final String OPSTR_MONITOR_HIGH_POWER_LOCATION = "android:monitor_location_high_power";
    public static final String OPSTR_MONITOR_LOCATION = "android:monitor_location";
    public static final String OPSTR_PICTURE_IN_PICTURE = "android:picture_in_picture";
    public static final String OPSTR_PROCESS_OUTGOING_CALLS = "android:process_outgoing_calls";
    public static final String OPSTR_READ_CALENDAR = "android:read_calendar";
    public static final String OPSTR_READ_CALL_LOG = "android:read_call_log";
    public static final String OPSTR_READ_CELL_BROADCASTS = "android:read_cell_broadcasts";
    public static final String OPSTR_READ_CONTACTS = "android:read_contacts";
    public static final String OPSTR_READ_EXTERNAL_STORAGE = "android:read_external_storage";
    public static final String OPSTR_READ_PHONE_NUMBERS = "android:read_phone_numbers";
    public static final String OPSTR_READ_PHONE_STATE = "android:read_phone_state";
    public static final String OPSTR_READ_SMS = "android:read_sms";
    public static final String OPSTR_RECEIVE_MMS = "android:receive_mms";
    public static final String OPSTR_RECEIVE_SMS = "android:receive_sms";
    public static final String OPSTR_RECEIVE_WAP_PUSH = "android:receive_wap_push";
    public static final String OPSTR_RECORD_AUDIO = "android:record_audio";
    public static final String OPSTR_SEND_SMS = "android:send_sms";
    public static final String OPSTR_SYSTEM_ALERT_WINDOW = "android:system_alert_window";
    public static final String OPSTR_USE_FINGERPRINT = "android:use_fingerprint";
    public static final String OPSTR_USE_SIP = "android:use_sip";
    public static final String OPSTR_WRITE_CALENDAR = "android:write_calendar";
    public static final String OPSTR_WRITE_CALL_LOG = "android:write_call_log";
    public static final String OPSTR_WRITE_CONTACTS = "android:write_contacts";
    public static final String OPSTR_WRITE_EXTERNAL_STORAGE = "android:write_external_storage";
    public static final String OPSTR_WRITE_SETTINGS = "android:write_settings";
    public static final int WATCH_FOREGROUND_CHANGES = 1;
    
    AppOpsManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static String permissionToOp(@NonNull final String permission) {
        throw new RuntimeException("Stub!");
    }
    
    public void startWatchingMode(@NonNull final String op, @Nullable final String packageName, @NonNull final OnOpChangedListener callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void startWatchingMode(@NonNull final String op, @Nullable final String packageName, final int flags, @NonNull final OnOpChangedListener callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void stopWatchingMode(@NonNull final OnOpChangedListener callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void startWatchingActive(@NonNull final String[] ops, @NonNull final Executor executor, @NonNull final OnOpActiveChangedListener callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void stopWatchingActive(@NonNull final OnOpActiveChangedListener callback) {
        throw new RuntimeException("Stub!");
    }
    
    public int unsafeCheckOp(@NonNull final String op, final int uid, @NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int checkOp(@NonNull final String op, final int uid, @NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public int unsafeCheckOpNoThrow(@NonNull final String op, final int uid, @NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int checkOpNoThrow(@NonNull final String op, final int uid, @NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public int unsafeCheckOpRaw(@NonNull final String op, final int uid, @NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public int unsafeCheckOpRawNoThrow(@NonNull final String op, final int uid, @NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int noteOp(@NonNull final String op, final int uid, @NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public int noteOp(@NonNull final String op, final int uid, @Nullable final String packageName, @Nullable final String attributionTag, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int noteOpNoThrow(@NonNull final String op, final int uid, @NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public int noteOpNoThrow(@NonNull final String op, final int uid, @NonNull final String packageName, @Nullable final String attributionTag, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int noteProxyOp(@NonNull final String op, @NonNull final String proxiedPackageName) {
        throw new RuntimeException("Stub!");
    }
    
    public int noteProxyOp(@NonNull final String op, @Nullable final String proxiedPackageName, final int proxiedUid, @Nullable final String proxiedAttributionTag, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int noteProxyOpNoThrow(@NonNull final String op, @NonNull final String proxiedPackageName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int noteProxyOpNoThrow(@NonNull final String op, @Nullable final String proxiedPackageName, final int proxiedUid) {
        throw new RuntimeException("Stub!");
    }
    
    public int noteProxyOpNoThrow(@NonNull final String op, @Nullable final String proxiedPackageName, final int proxiedUid, @Nullable final String proxiedAttributionTag, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void checkPackage(final int uid, @NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int startOp(@NonNull final String op, final int uid, @NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public int startOp(@NonNull final String op, final int uid, @Nullable final String packageName, @Nullable final String attributionTag, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int startOpNoThrow(@NonNull final String op, final int uid, @NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public int startOpNoThrow(@NonNull final String op, final int uid, @NonNull final String packageName, @Nullable final String attributionTag, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    public int startProxyOp(@NonNull final String op, final int proxiedUid, @NonNull final String proxiedPackageName, @Nullable final String proxiedAttributionTag, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    public int startProxyOpNoThrow(@NonNull final String op, final int proxiedUid, @NonNull final String proxiedPackageName, @Nullable final String proxiedAttributionTag, @Nullable final String message) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void finishOp(@NonNull final String op, final int uid, @NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public void finishOp(@NonNull final String op, final int uid, @NonNull final String packageName, @Nullable final String attributionTag) {
        throw new RuntimeException("Stub!");
    }
    
    public void finishProxyOp(@NonNull final String op, final int proxiedUid, @NonNull final String proxiedPackageName, @Nullable final String proxiedAttributionTag) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOpActive(@NonNull final String op, final int uid, @NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnOpNotedCallback(@Nullable final Executor asyncExecutor, @Nullable final OnOpNotedCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnOpActiveChangedListener
    {
        void onOpActiveChanged(@NonNull final String p0, final int p1, @NonNull final String p2, final boolean p3);
        
        default void onOpActiveChanged(@NonNull final String op, final int uid, @NonNull final String packageName, @Nullable final String attributionTag, final int virtualDeviceId, final boolean active, final int attributionFlags, final int attributionChainId) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnOpChangedListener
    {
        void onOpChanged(final String p0, final String p1);
        
        default void onOpChanged(@NonNull final String op, @NonNull final String packageName, final int userId, @NonNull final String persistentDeviceId) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class OnOpNotedCallback
    {
        public OnOpNotedCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onNoted(@NonNull final SyncNotedAppOp p0);
        
        public abstract void onSelfNoted(@NonNull final SyncNotedAppOp p0);
        
        public abstract void onAsyncNoted(@NonNull final AsyncNotedAppOp p0);
    }
}
