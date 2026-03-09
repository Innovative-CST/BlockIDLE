package android.provider;

import android.net.Uri;

public class SettingsSlicesContract
{
    public static final String AUTHORITY = "android.settings.slices";
    public static final Uri BASE_URI;
    public static final String KEY_AIRPLANE_MODE = "airplane_mode";
    public static final String KEY_BATTERY_SAVER = "battery_saver";
    public static final String KEY_BLUETOOTH = "bluetooth";
    public static final String KEY_LOCATION = "location";
    public static final String KEY_WIFI = "wifi";
    public static final String PATH_SETTING_ACTION = "action";
    public static final String PATH_SETTING_INTENT = "intent";
    
    SettingsSlicesContract() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        BASE_URI = null;
    }
}
