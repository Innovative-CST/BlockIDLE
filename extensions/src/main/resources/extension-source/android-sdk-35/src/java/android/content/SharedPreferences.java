package android.content;

import java.util.Set;
import java.util.Map;

public interface SharedPreferences
{
    Map<String, ?> getAll();
    
    @Nullable
    String getString(final String p0, @Nullable final String p1);
    
    @Nullable
    Set<String> getStringSet(final String p0, @Nullable final Set<String> p1);
    
    int getInt(final String p0, final int p1);
    
    long getLong(final String p0, final long p1);
    
    float getFloat(final String p0, final float p1);
    
    boolean getBoolean(final String p0, final boolean p1);
    
    boolean contains(final String p0);
    
    Editor edit();
    
    void registerOnSharedPreferenceChangeListener(final OnSharedPreferenceChangeListener p0);
    
    void unregisterOnSharedPreferenceChangeListener(final OnSharedPreferenceChangeListener p0);
    
    public interface OnSharedPreferenceChangeListener
    {
        void onSharedPreferenceChanged(final SharedPreferences p0, @Nullable final String p1);
    }
    
    public interface Editor
    {
        Editor putString(final String p0, @Nullable final String p1);
        
        Editor putStringSet(final String p0, @Nullable final Set<String> p1);
        
        Editor putInt(final String p0, final int p1);
        
        Editor putLong(final String p0, final long p1);
        
        Editor putFloat(final String p0, final float p1);
        
        Editor putBoolean(final String p0, final boolean p1);
        
        Editor remove(final String p0);
        
        Editor clear();
        
        boolean commit();
        
        void apply();
    }
}
