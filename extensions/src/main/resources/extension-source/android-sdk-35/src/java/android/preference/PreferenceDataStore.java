package android.preference;

import java.util.Set;

@Deprecated
public interface PreferenceDataStore
{
    @Deprecated
    default void putString(final String key, @Nullable final String value) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    default void putStringSet(final String key, @Nullable final Set<String> values) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    default void putInt(final String key, final int value) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    default void putLong(final String key, final long value) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    default void putFloat(final String key, final float value) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    default void putBoolean(final String key, final boolean value) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    default String getString(final String key, @Nullable final String defValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    default Set<String> getStringSet(final String key, @Nullable final Set<String> defValues) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    default int getInt(final String key, final int defValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    default long getLong(final String key, final long defValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    default float getFloat(final String key, final float defValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    default boolean getBoolean(final String key, final boolean defValue) {
        throw new RuntimeException("Stub!");
    }
}
