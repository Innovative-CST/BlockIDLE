package android.provider;

import android.content.res.Configuration;
import android.util.AndroidException;
import android.content.ContentResolver;
import android.net.Uri;
import android.content.Context;

public final class Settings
{
    public static final String ACTION_ACCESSIBILITY_SETTINGS = "android.settings.ACCESSIBILITY_SETTINGS";
    public static final String ACTION_ADD_ACCOUNT = "android.settings.ADD_ACCOUNT_SETTINGS";
    public static final String ACTION_ADVANCED_MEMORY_PROTECTION_SETTINGS = "android.settings.ADVANCED_MEMORY_PROTECTION_SETTINGS";
    public static final String ACTION_AIRPLANE_MODE_SETTINGS = "android.settings.AIRPLANE_MODE_SETTINGS";
    public static final String ACTION_ALL_APPS_NOTIFICATION_SETTINGS = "android.settings.ALL_APPS_NOTIFICATION_SETTINGS";
    public static final String ACTION_APN_SETTINGS = "android.settings.APN_SETTINGS";
    public static final String ACTION_APPLICATION_DETAILS_SETTINGS = "android.settings.APPLICATION_DETAILS_SETTINGS";
    public static final String ACTION_APPLICATION_DEVELOPMENT_SETTINGS = "android.settings.APPLICATION_DEVELOPMENT_SETTINGS";
    public static final String ACTION_APPLICATION_SETTINGS = "android.settings.APPLICATION_SETTINGS";
    public static final String ACTION_APP_LOCALE_SETTINGS = "android.settings.APP_LOCALE_SETTINGS";
    public static final String ACTION_APP_NOTIFICATION_BUBBLE_SETTINGS = "android.settings.APP_NOTIFICATION_BUBBLE_SETTINGS";
    public static final String ACTION_APP_NOTIFICATION_SETTINGS = "android.settings.APP_NOTIFICATION_SETTINGS";
    public static final String ACTION_APP_OPEN_BY_DEFAULT_SETTINGS = "android.settings.APP_OPEN_BY_DEFAULT_SETTINGS";
    public static final String ACTION_APP_SEARCH_SETTINGS = "android.settings.APP_SEARCH_SETTINGS";
    public static final String ACTION_APP_USAGE_SETTINGS = "android.settings.action.APP_USAGE_SETTINGS";
    public static final String ACTION_AUTOMATIC_ZEN_RULE_SETTINGS = "android.settings.AUTOMATIC_ZEN_RULE_SETTINGS";
    public static final String ACTION_AUTO_ROTATE_SETTINGS = "android.settings.AUTO_ROTATE_SETTINGS";
    public static final String ACTION_BATTERY_SAVER_SETTINGS = "android.settings.BATTERY_SAVER_SETTINGS";
    public static final String ACTION_BIOMETRIC_ENROLL = "android.settings.BIOMETRIC_ENROLL";
    public static final String ACTION_BLUETOOTH_SETTINGS = "android.settings.BLUETOOTH_SETTINGS";
    public static final String ACTION_CAPTIONING_SETTINGS = "android.settings.CAPTIONING_SETTINGS";
    public static final String ACTION_CAST_SETTINGS = "android.settings.CAST_SETTINGS";
    public static final String ACTION_CHANNEL_NOTIFICATION_SETTINGS = "android.settings.CHANNEL_NOTIFICATION_SETTINGS";
    public static final String ACTION_CONDITION_PROVIDER_SETTINGS = "android.settings.ACTION_CONDITION_PROVIDER_SETTINGS";
    public static final String ACTION_CREDENTIAL_PROVIDER = "android.settings.CREDENTIAL_PROVIDER";
    public static final String ACTION_DATA_ROAMING_SETTINGS = "android.settings.DATA_ROAMING_SETTINGS";
    public static final String ACTION_DATA_USAGE_SETTINGS = "android.settings.DATA_USAGE_SETTINGS";
    public static final String ACTION_DATE_SETTINGS = "android.settings.DATE_SETTINGS";
    public static final String ACTION_DEVICE_INFO_SETTINGS = "android.settings.DEVICE_INFO_SETTINGS";
    public static final String ACTION_DISPLAY_SETTINGS = "android.settings.DISPLAY_SETTINGS";
    public static final String ACTION_DREAM_SETTINGS = "android.settings.DREAM_SETTINGS";
    @Deprecated
    public static final String ACTION_FINGERPRINT_ENROLL = "android.settings.FINGERPRINT_ENROLL";
    public static final String ACTION_HARD_KEYBOARD_SETTINGS = "android.settings.HARD_KEYBOARD_SETTINGS";
    public static final String ACTION_HOME_SETTINGS = "android.settings.HOME_SETTINGS";
    public static final String ACTION_IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS = "android.settings.IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS";
    public static final String ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS = "android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS";
    public static final String ACTION_INPUT_METHOD_SETTINGS = "android.settings.INPUT_METHOD_SETTINGS";
    public static final String ACTION_INPUT_METHOD_SUBTYPE_SETTINGS = "android.settings.INPUT_METHOD_SUBTYPE_SETTINGS";
    public static final String ACTION_INTERNAL_STORAGE_SETTINGS = "android.settings.INTERNAL_STORAGE_SETTINGS";
    public static final String ACTION_LOCALE_SETTINGS = "android.settings.LOCALE_SETTINGS";
    public static final String ACTION_LOCATION_SOURCE_SETTINGS = "android.settings.LOCATION_SOURCE_SETTINGS";
    public static final String ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS = "android.settings.MANAGE_ALL_APPLICATIONS_SETTINGS";
    public static final String ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION = "android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION";
    public static final String ACTION_MANAGE_ALL_SIM_PROFILES_SETTINGS = "android.settings.MANAGE_ALL_SIM_PROFILES_SETTINGS";
    public static final String ACTION_MANAGE_APPLICATIONS_SETTINGS = "android.settings.MANAGE_APPLICATIONS_SETTINGS";
    public static final String ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION = "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION";
    public static final String ACTION_MANAGE_APP_USE_FULL_SCREEN_INTENT = "android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT";
    public static final String ACTION_MANAGE_DEFAULT_APPS_SETTINGS = "android.settings.MANAGE_DEFAULT_APPS_SETTINGS";
    public static final String ACTION_MANAGE_OVERLAY_PERMISSION = "android.settings.action.MANAGE_OVERLAY_PERMISSION";
    public static final String ACTION_MANAGE_SUPERVISOR_RESTRICTED_SETTING = "android.settings.MANAGE_SUPERVISOR_RESTRICTED_SETTING";
    public static final String ACTION_MANAGE_UNKNOWN_APP_SOURCES = "android.settings.MANAGE_UNKNOWN_APP_SOURCES";
    public static final String ACTION_MANAGE_WRITE_SETTINGS = "android.settings.action.MANAGE_WRITE_SETTINGS";
    public static final String ACTION_MEMORY_CARD_SETTINGS = "android.settings.MEMORY_CARD_SETTINGS";
    public static final String ACTION_NETWORK_OPERATOR_SETTINGS = "android.settings.NETWORK_OPERATOR_SETTINGS";
    public static final String ACTION_NFCSHARING_SETTINGS = "android.settings.NFCSHARING_SETTINGS";
    public static final String ACTION_NFC_PAYMENT_SETTINGS = "android.settings.NFC_PAYMENT_SETTINGS";
    public static final String ACTION_NFC_SETTINGS = "android.settings.NFC_SETTINGS";
    public static final String ACTION_NIGHT_DISPLAY_SETTINGS = "android.settings.NIGHT_DISPLAY_SETTINGS";
    public static final String ACTION_NOTIFICATION_ASSISTANT_SETTINGS = "android.settings.NOTIFICATION_ASSISTANT_SETTINGS";
    public static final String ACTION_NOTIFICATION_LISTENER_DETAIL_SETTINGS = "android.settings.NOTIFICATION_LISTENER_DETAIL_SETTINGS";
    public static final String ACTION_NOTIFICATION_LISTENER_SETTINGS = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS";
    public static final String ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS = "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS";
    public static final String ACTION_PRINT_SETTINGS = "android.settings.ACTION_PRINT_SETTINGS";
    public static final String ACTION_PRIVACY_SETTINGS = "android.settings.PRIVACY_SETTINGS";
    public static final String ACTION_PROCESS_WIFI_EASY_CONNECT_URI = "android.settings.PROCESS_WIFI_EASY_CONNECT_URI";
    public static final String ACTION_QUICK_ACCESS_WALLET_SETTINGS = "android.settings.QUICK_ACCESS_WALLET_SETTINGS";
    public static final String ACTION_QUICK_LAUNCH_SETTINGS = "android.settings.QUICK_LAUNCH_SETTINGS";
    public static final String ACTION_REGIONAL_PREFERENCES_SETTINGS = "android.settings.REGIONAL_PREFERENCES_SETTINGS";
    public static final String ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
    public static final String ACTION_REQUEST_MANAGE_MEDIA = "android.settings.REQUEST_MANAGE_MEDIA";
    public static final String ACTION_REQUEST_MEDIA_ROUTING_CONTROL = "android.settings.REQUEST_MEDIA_ROUTING_CONTROL";
    public static final String ACTION_REQUEST_SCHEDULE_EXACT_ALARM = "android.settings.REQUEST_SCHEDULE_EXACT_ALARM";
    public static final String ACTION_REQUEST_SET_AUTOFILL_SERVICE = "android.settings.REQUEST_SET_AUTOFILL_SERVICE";
    public static final String ACTION_SATELLITE_SETTING = "android.settings.SATELLITE_SETTING";
    public static final String ACTION_SEARCH_SETTINGS = "android.search.action.SEARCH_SETTINGS";
    public static final String ACTION_SECURITY_SETTINGS = "android.settings.SECURITY_SETTINGS";
    public static final String ACTION_SETTINGS = "android.settings.SETTINGS";
    public static final String ACTION_SETTINGS_EMBED_DEEP_LINK_ACTIVITY = "android.settings.SETTINGS_EMBED_DEEP_LINK_ACTIVITY";
    public static final String ACTION_SHOW_REGULATORY_INFO = "android.settings.SHOW_REGULATORY_INFO";
    public static final String ACTION_SHOW_WORK_POLICY_INFO = "android.settings.SHOW_WORK_POLICY_INFO";
    public static final String ACTION_SOUND_SETTINGS = "android.settings.SOUND_SETTINGS";
    @Deprecated
    public static final String ACTION_STORAGE_VOLUME_ACCESS_SETTINGS = "android.settings.STORAGE_VOLUME_ACCESS_SETTINGS";
    public static final String ACTION_SYNC_SETTINGS = "android.settings.SYNC_SETTINGS";
    public static final String ACTION_USAGE_ACCESS_SETTINGS = "android.settings.USAGE_ACCESS_SETTINGS";
    public static final String ACTION_USER_DICTIONARY_SETTINGS = "android.settings.USER_DICTIONARY_SETTINGS";
    public static final String ACTION_VOICE_CONTROL_AIRPLANE_MODE = "android.settings.VOICE_CONTROL_AIRPLANE_MODE";
    public static final String ACTION_VOICE_CONTROL_BATTERY_SAVER_MODE = "android.settings.VOICE_CONTROL_BATTERY_SAVER_MODE";
    public static final String ACTION_VOICE_CONTROL_DO_NOT_DISTURB_MODE = "android.settings.VOICE_CONTROL_DO_NOT_DISTURB_MODE";
    public static final String ACTION_VOICE_INPUT_SETTINGS = "android.settings.VOICE_INPUT_SETTINGS";
    public static final String ACTION_VPN_SETTINGS = "android.settings.VPN_SETTINGS";
    public static final String ACTION_VR_LISTENER_SETTINGS = "android.settings.VR_LISTENER_SETTINGS";
    public static final String ACTION_WEBVIEW_SETTINGS = "android.settings.WEBVIEW_SETTINGS";
    public static final String ACTION_WIFI_ADD_NETWORKS = "android.settings.WIFI_ADD_NETWORKS";
    public static final String ACTION_WIFI_IP_SETTINGS = "android.settings.WIFI_IP_SETTINGS";
    public static final String ACTION_WIFI_SETTINGS = "android.settings.WIFI_SETTINGS";
    public static final String ACTION_WIRELESS_SETTINGS = "android.settings.WIRELESS_SETTINGS";
    public static final String ACTION_ZEN_MODE_PRIORITY_SETTINGS = "android.settings.ZEN_MODE_PRIORITY_SETTINGS";
    public static final int ADD_WIFI_RESULT_ADD_OR_UPDATE_FAILED = 1;
    public static final int ADD_WIFI_RESULT_ALREADY_EXISTS = 2;
    public static final int ADD_WIFI_RESULT_SUCCESS = 0;
    public static final String AUTHORITY = "settings";
    public static final String EXTRA_ACCOUNT_TYPES = "account_types";
    public static final String EXTRA_AIRPLANE_MODE_ENABLED = "airplane_mode_enabled";
    public static final String EXTRA_APP_PACKAGE = "android.provider.extra.APP_PACKAGE";
    public static final String EXTRA_AUTHORITIES = "authorities";
    public static final String EXTRA_AUTOMATIC_ZEN_RULE_ID = "android.provider.extra.AUTOMATIC_ZEN_RULE_ID";
    public static final String EXTRA_BATTERY_SAVER_MODE_ENABLED = "android.settings.extra.battery_saver_mode_enabled";
    public static final String EXTRA_BIOMETRIC_AUTHENTICATORS_ALLOWED = "android.provider.extra.BIOMETRIC_AUTHENTICATORS_ALLOWED";
    public static final String EXTRA_CHANNEL_FILTER_LIST = "android.provider.extra.CHANNEL_FILTER_LIST";
    public static final String EXTRA_CHANNEL_ID = "android.provider.extra.CHANNEL_ID";
    public static final String EXTRA_CONVERSATION_ID = "android.provider.extra.CONVERSATION_ID";
    public static final String EXTRA_DO_NOT_DISTURB_MODE_ENABLED = "android.settings.extra.do_not_disturb_mode_enabled";
    public static final String EXTRA_DO_NOT_DISTURB_MODE_MINUTES = "android.settings.extra.do_not_disturb_mode_minutes";
    public static final String EXTRA_EASY_CONNECT_ATTEMPTED_SSID = "android.provider.extra.EASY_CONNECT_ATTEMPTED_SSID";
    public static final String EXTRA_EASY_CONNECT_BAND_LIST = "android.provider.extra.EASY_CONNECT_BAND_LIST";
    public static final String EXTRA_EASY_CONNECT_CHANNEL_LIST = "android.provider.extra.EASY_CONNECT_CHANNEL_LIST";
    public static final String EXTRA_EASY_CONNECT_ERROR_CODE = "android.provider.extra.EASY_CONNECT_ERROR_CODE";
    public static final String EXTRA_INPUT_METHOD_ID = "input_method_id";
    public static final String EXTRA_NOTIFICATION_LISTENER_COMPONENT_NAME = "android.provider.extra.NOTIFICATION_LISTENER_COMPONENT_NAME";
    public static final String EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_HIGHLIGHT_MENU_KEY = "android.provider.extra.SETTINGS_EMBEDDED_DEEP_LINK_HIGHLIGHT_MENU_KEY";
    public static final String EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_INTENT_URI = "android.provider.extra.SETTINGS_EMBEDDED_DEEP_LINK_INTENT_URI";
    public static final String EXTRA_SUB_ID = "android.provider.extra.SUB_ID";
    public static final String EXTRA_SUPERVISOR_RESTRICTED_SETTING_KEY = "android.provider.extra.SUPERVISOR_RESTRICTED_SETTING_KEY";
    public static final String EXTRA_WIFI_NETWORK_LIST = "android.provider.extra.WIFI_NETWORK_LIST";
    public static final String EXTRA_WIFI_NETWORK_RESULT_LIST = "android.provider.extra.WIFI_NETWORK_RESULT_LIST";
    public static final String INTENT_CATEGORY_USAGE_ACCESS_CONFIG = "android.intent.category.USAGE_ACCESS_CONFIG";
    public static final String METADATA_USAGE_ACCESS_REASON = "android.settings.metadata.USAGE_ACCESS_REASON";
    public static final int SUPERVISOR_VERIFICATION_SETTING_BIOMETRICS = 1;
    public static final int SUPERVISOR_VERIFICATION_SETTING_UNKNOWN = 0;
    
    public Settings() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean canDrawOverlays(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Global extends NameValueTable
    {
        public static final String ADB_ENABLED = "adb_enabled";
        public static final String AIRPLANE_MODE_ON = "airplane_mode_on";
        public static final String AIRPLANE_MODE_RADIOS = "airplane_mode_radios";
        public static final String ALWAYS_FINISH_ACTIVITIES = "always_finish_activities";
        public static final String ANIMATOR_DURATION_SCALE = "animator_duration_scale";
        @Deprecated
        public static final String APPLY_RAMPING_RINGER = "apply_ramping_ringer";
        public static final String AUTO_TIME = "auto_time";
        public static final String AUTO_TIME_ZONE = "auto_time_zone";
        public static final String BLUETOOTH_ON = "bluetooth_on";
        public static final String BOOT_COUNT = "boot_count";
        public static final String CONTACT_METADATA_SYNC_ENABLED = "contact_metadata_sync_enabled";
        public static final Uri CONTENT_URI;
        public static final String DATA_ROAMING = "data_roaming";
        public static final String DEBUG_APP = "debug_app";
        public static final String DEVELOPMENT_SETTINGS_ENABLED = "development_settings_enabled";
        public static final String DEVICE_NAME = "device_name";
        public static final String DEVICE_PROVISIONED = "device_provisioned";
        public static final String HTTP_PROXY = "http_proxy";
        @Deprecated
        public static final String INSTALL_NON_MARKET_APPS = "install_non_market_apps";
        public static final String MODE_RINGER = "mode_ringer";
        public static final String NETWORK_PREFERENCE = "network_preference";
        public static final String RADIO_BLUETOOTH = "bluetooth";
        public static final String RADIO_CELL = "cell";
        public static final String RADIO_NFC = "nfc";
        public static final String RADIO_WIFI = "wifi";
        public static final String SECURE_FRP_MODE = "secure_frp_mode";
        @Deprecated
        public static final String SHOW_PROCESSES = "show_processes";
        public static final String STAY_ON_WHILE_PLUGGED_IN = "stay_on_while_plugged_in";
        public static final String TRANSITION_ANIMATION_SCALE = "transition_animation_scale";
        public static final String USB_MASS_STORAGE_ENABLED = "usb_mass_storage_enabled";
        public static final String USE_GOOGLE_MAIL = "use_google_mail";
        public static final String WAIT_FOR_DEBUGGER = "wait_for_debugger";
        public static final String WIFI_DEVICE_OWNER_CONFIGS_LOCKDOWN = "wifi_device_owner_configs_lockdown";
        public static final String WIFI_MAX_DHCP_RETRY_COUNT = "wifi_max_dhcp_retry_count";
        public static final String WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS = "wifi_mobile_data_transition_wakelock_timeout_ms";
        @Deprecated
        public static final String WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON = "wifi_networks_available_notification_on";
        @Deprecated
        public static final String WIFI_NETWORKS_AVAILABLE_REPEAT_DELAY = "wifi_networks_available_repeat_delay";
        @Deprecated
        public static final String WIFI_NUM_OPEN_NETWORKS_KEPT = "wifi_num_open_networks_kept";
        public static final String WIFI_ON = "wifi_on";
        @Deprecated
        public static final String WIFI_SLEEP_POLICY = "wifi_sleep_policy";
        @Deprecated
        public static final int WIFI_SLEEP_POLICY_DEFAULT = 0;
        @Deprecated
        public static final int WIFI_SLEEP_POLICY_NEVER = 2;
        @Deprecated
        public static final int WIFI_SLEEP_POLICY_NEVER_WHILE_PLUGGED = 1;
        public static final String WIFI_WATCHDOG_ON = "wifi_watchdog_on";
        public static final String WINDOW_ANIMATION_SCALE = "window_animation_scale";
        
        public Global() {
            throw new RuntimeException("Stub!");
        }
        
        public static String getString(final ContentResolver resolver, final String name) {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean putString(final ContentResolver resolver, final String name, final String value) {
            throw new RuntimeException("Stub!");
        }
        
        public static Uri getUriFor(final String name) {
            throw new RuntimeException("Stub!");
        }
        
        public static int getInt(final ContentResolver cr, final String name, final int def) {
            throw new RuntimeException("Stub!");
        }
        
        public static int getInt(final ContentResolver cr, final String name) throws SettingNotFoundException {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean putInt(final ContentResolver cr, final String name, final int value) {
            throw new RuntimeException("Stub!");
        }
        
        public static long getLong(final ContentResolver cr, final String name, final long def) {
            throw new RuntimeException("Stub!");
        }
        
        public static long getLong(final ContentResolver cr, final String name) throws SettingNotFoundException {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean putLong(final ContentResolver cr, final String name, final long value) {
            throw new RuntimeException("Stub!");
        }
        
        public static float getFloat(final ContentResolver cr, final String name, final float def) {
            throw new RuntimeException("Stub!");
        }
        
        public static float getFloat(final ContentResolver cr, final String name) throws SettingNotFoundException {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean putFloat(final ContentResolver cr, final String name, final float value) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_URI = null;
        }
    }
    
    public static class NameValueTable implements BaseColumns
    {
        public static final String NAME = "name";
        public static final String VALUE = "value";
        
        public NameValueTable() {
            throw new RuntimeException("Stub!");
        }
        
        protected static boolean putString(final ContentResolver resolver, final Uri uri, final String name, final String value) {
            throw new RuntimeException("Stub!");
        }
        
        public static Uri getUriFor(final Uri uri, final String name) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Panel
    {
        public static final String ACTION_INTERNET_CONNECTIVITY = "android.settings.panel.action.INTERNET_CONNECTIVITY";
        public static final String ACTION_NFC = "android.settings.panel.action.NFC";
        public static final String ACTION_VOLUME = "android.settings.panel.action.VOLUME";
        public static final String ACTION_WIFI = "android.settings.panel.action.WIFI";
        
        Panel() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Secure extends NameValueTable
    {
        public static final String ACCESSIBILITY_DISPLAY_INVERSION_ENABLED = "accessibility_display_inversion_enabled";
        public static final String ACCESSIBILITY_ENABLED = "accessibility_enabled";
        @Deprecated
        public static final String ACCESSIBILITY_SPEAK_PASSWORD = "speak_password";
        @Deprecated
        public static final String ADB_ENABLED = "adb_enabled";
        public static final String ALLOWED_GEOLOCATION_ORIGINS = "allowed_geolocation_origins";
        @Deprecated
        public static final String ALLOW_MOCK_LOCATION = "mock_location";
        public static final String ANDROID_ID = "android_id";
        @Deprecated
        public static final String BACKGROUND_DATA = "background_data";
        @Deprecated
        public static final String BLUETOOTH_ON = "bluetooth_on";
        public static final Uri CONTENT_URI;
        @Deprecated
        public static final String DATA_ROAMING = "data_roaming";
        public static final String DEFAULT_INPUT_METHOD = "default_input_method";
        @Deprecated
        public static final String DEVELOPMENT_SETTINGS_ENABLED = "development_settings_enabled";
        @Deprecated
        public static final String DEVICE_PROVISIONED = "device_provisioned";
        public static final String ENABLED_ACCESSIBILITY_SERVICES = "enabled_accessibility_services";
        public static final String ENABLED_INPUT_METHODS = "enabled_input_methods";
        @Deprecated
        public static final String HTTP_PROXY = "http_proxy";
        public static final String INPUT_METHOD_SELECTOR_VISIBILITY = "input_method_selector_visibility";
        @Deprecated
        public static final String INSTALL_NON_MARKET_APPS = "install_non_market_apps";
        @Deprecated
        public static final String LOCATION_MODE = "location_mode";
        @Deprecated
        public static final int LOCATION_MODE_BATTERY_SAVING = 2;
        @Deprecated
        public static final int LOCATION_MODE_HIGH_ACCURACY = 3;
        public static final int LOCATION_MODE_OFF = 0;
        @Deprecated
        public static final int LOCATION_MODE_SENSORS_ONLY = 1;
        @Deprecated
        public static final String LOCATION_PROVIDERS_ALLOWED = "location_providers_allowed";
        @Deprecated
        public static final String LOCK_PATTERN_ENABLED = "lock_pattern_autolock";
        @Deprecated
        public static final String LOCK_PATTERN_TACTILE_FEEDBACK_ENABLED = "lock_pattern_tactile_feedback_enabled";
        @Deprecated
        public static final String LOCK_PATTERN_VISIBLE = "lock_pattern_visible_pattern";
        @Deprecated
        public static final String LOGGING_ID = "logging_id";
        @Deprecated
        public static final String NETWORK_PREFERENCE = "network_preference";
        public static final String PARENTAL_CONTROL_ENABLED = "parental_control_enabled";
        public static final String PARENTAL_CONTROL_LAST_UPDATE = "parental_control_last_update";
        public static final String PARENTAL_CONTROL_REDIRECT_URL = "parental_control_redirect_url";
        public static final String RTT_CALLING_MODE = "rtt_calling_mode";
        @Deprecated
        public static final String SECURE_FRP_MODE = "secure_frp_mode";
        public static final String SELECTED_INPUT_METHOD_SUBTYPE = "selected_input_method_subtype";
        public static final String SETTINGS_CLASSNAME = "settings_classname";
        public static final String SKIP_FIRST_USE_HINTS = "skip_first_use_hints";
        public static final String TOUCH_EXPLORATION_ENABLED = "touch_exploration_enabled";
        @Deprecated
        public static final String TTS_DEFAULT_COUNTRY = "tts_default_country";
        @Deprecated
        public static final String TTS_DEFAULT_LANG = "tts_default_lang";
        public static final String TTS_DEFAULT_PITCH = "tts_default_pitch";
        public static final String TTS_DEFAULT_RATE = "tts_default_rate";
        public static final String TTS_DEFAULT_SYNTH = "tts_default_synth";
        @Deprecated
        public static final String TTS_DEFAULT_VARIANT = "tts_default_variant";
        public static final String TTS_ENABLED_PLUGINS = "tts_enabled_plugins";
        @Deprecated
        public static final String TTS_USE_DEFAULTS = "tts_use_defaults";
        @Deprecated
        public static final String USB_MASS_STORAGE_ENABLED = "usb_mass_storage_enabled";
        @Deprecated
        public static final String USE_GOOGLE_MAIL = "use_google_mail";
        @Deprecated
        public static final String WIFI_MAX_DHCP_RETRY_COUNT = "wifi_max_dhcp_retry_count";
        @Deprecated
        public static final String WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS = "wifi_mobile_data_transition_wakelock_timeout_ms";
        @Deprecated
        public static final String WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON = "wifi_networks_available_notification_on";
        @Deprecated
        public static final String WIFI_NETWORKS_AVAILABLE_REPEAT_DELAY = "wifi_networks_available_repeat_delay";
        @Deprecated
        public static final String WIFI_NUM_OPEN_NETWORKS_KEPT = "wifi_num_open_networks_kept";
        @Deprecated
        public static final String WIFI_ON = "wifi_on";
        @Deprecated
        public static final String WIFI_WATCHDOG_ACCEPTABLE_PACKET_LOSS_PERCENTAGE = "wifi_watchdog_acceptable_packet_loss_percentage";
        @Deprecated
        public static final String WIFI_WATCHDOG_AP_COUNT = "wifi_watchdog_ap_count";
        @Deprecated
        public static final String WIFI_WATCHDOG_BACKGROUND_CHECK_DELAY_MS = "wifi_watchdog_background_check_delay_ms";
        @Deprecated
        public static final String WIFI_WATCHDOG_BACKGROUND_CHECK_ENABLED = "wifi_watchdog_background_check_enabled";
        @Deprecated
        public static final String WIFI_WATCHDOG_BACKGROUND_CHECK_TIMEOUT_MS = "wifi_watchdog_background_check_timeout_ms";
        @Deprecated
        public static final String WIFI_WATCHDOG_INITIAL_IGNORED_PING_COUNT = "wifi_watchdog_initial_ignored_ping_count";
        @Deprecated
        public static final String WIFI_WATCHDOG_MAX_AP_CHECKS = "wifi_watchdog_max_ap_checks";
        @Deprecated
        public static final String WIFI_WATCHDOG_ON = "wifi_watchdog_on";
        @Deprecated
        public static final String WIFI_WATCHDOG_PING_COUNT = "wifi_watchdog_ping_count";
        @Deprecated
        public static final String WIFI_WATCHDOG_PING_DELAY_MS = "wifi_watchdog_ping_delay_ms";
        @Deprecated
        public static final String WIFI_WATCHDOG_PING_TIMEOUT_MS = "wifi_watchdog_ping_timeout_ms";
        @Deprecated
        public static final String WIFI_WATCHDOG_WATCH_LIST = "wifi_watchdog_watch_list";
        
        public Secure() {
            throw new RuntimeException("Stub!");
        }
        
        public static String getString(final ContentResolver resolver, final String name) {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean putString(final ContentResolver resolver, final String name, final String value) {
            throw new RuntimeException("Stub!");
        }
        
        public static Uri getUriFor(final String name) {
            throw new RuntimeException("Stub!");
        }
        
        public static int getInt(final ContentResolver cr, final String name, final int def) {
            throw new RuntimeException("Stub!");
        }
        
        public static int getInt(final ContentResolver cr, final String name) throws SettingNotFoundException {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean putInt(final ContentResolver cr, final String name, final int value) {
            throw new RuntimeException("Stub!");
        }
        
        public static long getLong(final ContentResolver cr, final String name, final long def) {
            throw new RuntimeException("Stub!");
        }
        
        public static long getLong(final ContentResolver cr, final String name) throws SettingNotFoundException {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean putLong(final ContentResolver cr, final String name, final long value) {
            throw new RuntimeException("Stub!");
        }
        
        public static float getFloat(final ContentResolver cr, final String name, final float def) {
            throw new RuntimeException("Stub!");
        }
        
        public static float getFloat(final ContentResolver cr, final String name) throws SettingNotFoundException {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean putFloat(final ContentResolver cr, final String name, final float value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public static boolean isLocationProviderEnabled(final ContentResolver cr, final String provider) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public static void setLocationProviderEnabled(final ContentResolver cr, final String provider, final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_URI = null;
        }
    }
    
    public static class SettingNotFoundException extends AndroidException
    {
        public SettingNotFoundException(final String msg) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class System extends NameValueTable
    {
        public static final String ACCELEROMETER_ROTATION = "accelerometer_rotation";
        @Deprecated
        public static final String ADB_ENABLED = "adb_enabled";
        @Deprecated
        public static final String AIRPLANE_MODE_ON = "airplane_mode_on";
        @Deprecated
        public static final String AIRPLANE_MODE_RADIOS = "airplane_mode_radios";
        public static final String ALARM_ALERT = "alarm_alert";
        @Deprecated
        public static final String ALWAYS_FINISH_ACTIVITIES = "always_finish_activities";
        @Deprecated
        public static final String ANDROID_ID = "android_id";
        @Deprecated
        public static final String ANIMATOR_DURATION_SCALE = "animator_duration_scale";
        @Deprecated
        public static final String AUTO_TIME = "auto_time";
        @Deprecated
        public static final String AUTO_TIME_ZONE = "auto_time_zone";
        public static final String BLUETOOTH_DISCOVERABILITY = "bluetooth_discoverability";
        public static final String BLUETOOTH_DISCOVERABILITY_TIMEOUT = "bluetooth_discoverability_timeout";
        @Deprecated
        public static final String BLUETOOTH_ON = "bluetooth_on";
        public static final Uri CONTENT_URI;
        @Deprecated
        public static final String DATA_ROAMING = "data_roaming";
        @Deprecated
        public static final String DATE_FORMAT = "date_format";
        @Deprecated
        public static final String DEBUG_APP = "debug_app";
        public static final Uri DEFAULT_ALARM_ALERT_URI;
        public static final Uri DEFAULT_NOTIFICATION_URI;
        public static final Uri DEFAULT_RINGTONE_URI;
        @Deprecated
        public static final String DEVICE_PROVISIONED = "device_provisioned";
        @Deprecated
        public static final String DIM_SCREEN = "dim_screen";
        public static final String DTMF_TONE_TYPE_WHEN_DIALING = "dtmf_tone_type";
        public static final String DTMF_TONE_WHEN_DIALING = "dtmf_tone";
        public static final String END_BUTTON_BEHAVIOR = "end_button_behavior";
        public static final String FONT_SCALE = "font_scale";
        @Deprecated
        public static final String HAPTIC_FEEDBACK_ENABLED = "haptic_feedback_enabled";
        @Deprecated
        public static final String HTTP_PROXY = "http_proxy";
        @Deprecated
        public static final String INSTALL_NON_MARKET_APPS = "install_non_market_apps";
        @Deprecated
        public static final String LOCATION_PROVIDERS_ALLOWED = "location_providers_allowed";
        @Deprecated
        public static final String LOCK_PATTERN_ENABLED = "lock_pattern_autolock";
        @Deprecated
        public static final String LOCK_PATTERN_TACTILE_FEEDBACK_ENABLED = "lock_pattern_tactile_feedback_enabled";
        @Deprecated
        public static final String LOCK_PATTERN_VISIBLE = "lock_pattern_visible_pattern";
        @Deprecated
        public static final String LOGGING_ID = "logging_id";
        @Deprecated
        public static final String MODE_RINGER = "mode_ringer";
        public static final String MODE_RINGER_STREAMS_AFFECTED = "mode_ringer_streams_affected";
        public static final String MUTE_STREAMS_AFFECTED = "mute_streams_affected";
        @Deprecated
        public static final String NETWORK_PREFERENCE = "network_preference";
        @Deprecated
        public static final String NEXT_ALARM_FORMATTED = "next_alarm_formatted";
        public static final String NOTIFICATION_SOUND = "notification_sound";
        @Deprecated
        public static final String PARENTAL_CONTROL_ENABLED = "parental_control_enabled";
        @Deprecated
        public static final String PARENTAL_CONTROL_LAST_UPDATE = "parental_control_last_update";
        @Deprecated
        public static final String PARENTAL_CONTROL_REDIRECT_URL = "parental_control_redirect_url";
        @Deprecated
        public static final String RADIO_BLUETOOTH = "bluetooth";
        @Deprecated
        public static final String RADIO_CELL = "cell";
        @Deprecated
        public static final String RADIO_NFC = "nfc";
        @Deprecated
        public static final String RADIO_WIFI = "wifi";
        public static final String RINGTONE = "ringtone";
        public static final String SCREEN_BRIGHTNESS = "screen_brightness";
        public static final String SCREEN_BRIGHTNESS_MODE = "screen_brightness_mode";
        public static final int SCREEN_BRIGHTNESS_MODE_AUTOMATIC = 1;
        public static final int SCREEN_BRIGHTNESS_MODE_MANUAL = 0;
        public static final String SCREEN_OFF_TIMEOUT = "screen_off_timeout";
        @Deprecated
        public static final String SETTINGS_CLASSNAME = "settings_classname";
        public static final String SETUP_WIZARD_HAS_RUN = "setup_wizard_has_run";
        public static final String SHOW_GTALK_SERVICE_STATUS = "SHOW_GTALK_SERVICE_STATUS";
        @Deprecated
        public static final String SHOW_PROCESSES = "show_processes";
        @Deprecated
        public static final String SHOW_WEB_SUGGESTIONS = "show_web_suggestions";
        public static final String SOUND_EFFECTS_ENABLED = "sound_effects_enabled";
        @Deprecated
        public static final String STAY_ON_WHILE_PLUGGED_IN = "stay_on_while_plugged_in";
        public static final String TEXT_AUTO_CAPS = "auto_caps";
        public static final String TEXT_AUTO_PUNCTUATE = "auto_punctuate";
        public static final String TEXT_AUTO_REPLACE = "auto_replace";
        public static final String TEXT_SHOW_PASSWORD = "show_password";
        public static final String TIME_12_24 = "time_12_24";
        @Deprecated
        public static final String TRANSITION_ANIMATION_SCALE = "transition_animation_scale";
        @Deprecated
        public static final String USB_MASS_STORAGE_ENABLED = "usb_mass_storage_enabled";
        public static final String USER_ROTATION = "user_rotation";
        @Deprecated
        public static final String USE_GOOGLE_MAIL = "use_google_mail";
        public static final String VIBRATE_ON = "vibrate_on";
        @Deprecated
        public static final String VIBRATE_WHEN_RINGING = "vibrate_when_ringing";
        @Deprecated
        public static final String WAIT_FOR_DEBUGGER = "wait_for_debugger";
        @Deprecated
        public static final String WALLPAPER_ACTIVITY = "wallpaper_activity";
        @Deprecated
        public static final String WIFI_MAX_DHCP_RETRY_COUNT = "wifi_max_dhcp_retry_count";
        @Deprecated
        public static final String WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS = "wifi_mobile_data_transition_wakelock_timeout_ms";
        @Deprecated
        public static final String WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON = "wifi_networks_available_notification_on";
        @Deprecated
        public static final String WIFI_NETWORKS_AVAILABLE_REPEAT_DELAY = "wifi_networks_available_repeat_delay";
        @Deprecated
        public static final String WIFI_NUM_OPEN_NETWORKS_KEPT = "wifi_num_open_networks_kept";
        @Deprecated
        public static final String WIFI_ON = "wifi_on";
        @Deprecated
        public static final String WIFI_SLEEP_POLICY = "wifi_sleep_policy";
        @Deprecated
        public static final int WIFI_SLEEP_POLICY_DEFAULT = 0;
        @Deprecated
        public static final int WIFI_SLEEP_POLICY_NEVER = 2;
        @Deprecated
        public static final int WIFI_SLEEP_POLICY_NEVER_WHILE_PLUGGED = 1;
        @Deprecated
        public static final String WIFI_STATIC_DNS1 = "wifi_static_dns1";
        @Deprecated
        public static final String WIFI_STATIC_DNS2 = "wifi_static_dns2";
        @Deprecated
        public static final String WIFI_STATIC_GATEWAY = "wifi_static_gateway";
        @Deprecated
        public static final String WIFI_STATIC_IP = "wifi_static_ip";
        @Deprecated
        public static final String WIFI_STATIC_NETMASK = "wifi_static_netmask";
        @Deprecated
        public static final String WIFI_USE_STATIC_IP = "wifi_use_static_ip";
        @Deprecated
        public static final String WIFI_WATCHDOG_ACCEPTABLE_PACKET_LOSS_PERCENTAGE = "wifi_watchdog_acceptable_packet_loss_percentage";
        @Deprecated
        public static final String WIFI_WATCHDOG_AP_COUNT = "wifi_watchdog_ap_count";
        @Deprecated
        public static final String WIFI_WATCHDOG_BACKGROUND_CHECK_DELAY_MS = "wifi_watchdog_background_check_delay_ms";
        @Deprecated
        public static final String WIFI_WATCHDOG_BACKGROUND_CHECK_ENABLED = "wifi_watchdog_background_check_enabled";
        @Deprecated
        public static final String WIFI_WATCHDOG_BACKGROUND_CHECK_TIMEOUT_MS = "wifi_watchdog_background_check_timeout_ms";
        @Deprecated
        public static final String WIFI_WATCHDOG_INITIAL_IGNORED_PING_COUNT = "wifi_watchdog_initial_ignored_ping_count";
        @Deprecated
        public static final String WIFI_WATCHDOG_MAX_AP_CHECKS = "wifi_watchdog_max_ap_checks";
        @Deprecated
        public static final String WIFI_WATCHDOG_ON = "wifi_watchdog_on";
        @Deprecated
        public static final String WIFI_WATCHDOG_PING_COUNT = "wifi_watchdog_ping_count";
        @Deprecated
        public static final String WIFI_WATCHDOG_PING_DELAY_MS = "wifi_watchdog_ping_delay_ms";
        @Deprecated
        public static final String WIFI_WATCHDOG_PING_TIMEOUT_MS = "wifi_watchdog_ping_timeout_ms";
        @Deprecated
        public static final String WINDOW_ANIMATION_SCALE = "window_animation_scale";
        
        public System() {
            throw new RuntimeException("Stub!");
        }
        
        public static String getString(final ContentResolver resolver, final String name) {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean putString(final ContentResolver resolver, final String name, final String value) {
            throw new RuntimeException("Stub!");
        }
        
        public static Uri getUriFor(final String name) {
            throw new RuntimeException("Stub!");
        }
        
        public static int getInt(final ContentResolver cr, final String name, final int def) {
            throw new RuntimeException("Stub!");
        }
        
        public static int getInt(final ContentResolver cr, final String name) throws SettingNotFoundException {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean putInt(final ContentResolver cr, final String name, final int value) {
            throw new RuntimeException("Stub!");
        }
        
        public static long getLong(final ContentResolver cr, final String name, final long def) {
            throw new RuntimeException("Stub!");
        }
        
        public static long getLong(final ContentResolver cr, final String name) throws SettingNotFoundException {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean putLong(final ContentResolver cr, final String name, final long value) {
            throw new RuntimeException("Stub!");
        }
        
        public static float getFloat(final ContentResolver cr, final String name, final float def) {
            throw new RuntimeException("Stub!");
        }
        
        public static float getFloat(final ContentResolver cr, final String name) throws SettingNotFoundException {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean putFloat(final ContentResolver cr, final String name, final float value) {
            throw new RuntimeException("Stub!");
        }
        
        public static void getConfiguration(final ContentResolver cr, final Configuration outConfig) {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean putConfiguration(final ContentResolver cr, final Configuration config) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public static boolean getShowGTalkServiceStatus(final ContentResolver cr) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public static void setShowGTalkServiceStatus(final ContentResolver cr, final boolean flag) {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean canWrite(final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CONTENT_URI = null;
            DEFAULT_ALARM_ALERT_URI = null;
            DEFAULT_NOTIFICATION_URI = null;
            DEFAULT_RINGTONE_URI = null;
        }
    }
}
