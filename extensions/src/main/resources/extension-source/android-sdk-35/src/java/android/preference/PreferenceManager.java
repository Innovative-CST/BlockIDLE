package android.preference;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.Context;

@Deprecated
public class PreferenceManager
{
    @Deprecated
    public static final String KEY_HAS_SET_DEFAULT_VALUES = "_has_set_default_values";
    @Deprecated
    public static final String METADATA_KEY_PREFERENCES = "android.preference";
    
    PreferenceManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPreferenceDataStore(final PreferenceDataStore dataStore) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public PreferenceDataStore getPreferenceDataStore() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public PreferenceScreen createPreferenceScreen(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getSharedPreferencesName() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSharedPreferencesName(final String sharedPreferencesName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getSharedPreferencesMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSharedPreferencesMode(final int sharedPreferencesMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setStorageDefault() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setStorageDeviceProtected() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isStorageDefault() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isStorageDeviceProtected() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public SharedPreferences getSharedPreferences() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static SharedPreferences getDefaultSharedPreferences(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static String getDefaultSharedPreferencesName(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public Preference findPreference(final CharSequence key) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void setDefaultValues(final Context context, final int resId, final boolean readAgain) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void setDefaultValues(final Context context, final String sharedPreferencesName, final int sharedPreferencesMode, final int resId, final boolean readAgain) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public interface OnActivityStopListener
    {
        @Deprecated
        void onActivityStop();
    }
    
    @Deprecated
    public interface OnActivityResultListener
    {
        @Deprecated
        boolean onActivityResult(final int p0, final int p1, final Intent p2);
    }
    
    @Deprecated
    public interface OnActivityDestroyListener
    {
        @Deprecated
        void onActivityDestroy();
    }
}
