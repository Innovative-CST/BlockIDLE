package android.app;

import android.os.LocaleList;

public class LocaleManager
{
    LocaleManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void setApplicationLocales(@NonNull final LocaleList locales) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LocaleList getApplicationLocales() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LocaleList getApplicationLocales(@NonNull final String appPackageName) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LocaleList getSystemLocales() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOverrideLocaleConfig(@Nullable final LocaleConfig localeConfig) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public LocaleConfig getOverrideLocaleConfig() {
        throw new RuntimeException("Stub!");
    }
}
