package android.app;

import android.os.Parcel;
import java.util.Locale;
import android.os.LocaleList;
import android.content.Context;
import android.os.Parcelable;

public class LocaleConfig implements Parcelable
{
    @NonNull
    public static final Creator<LocaleConfig> CREATOR;
    public static final int STATUS_NOT_SPECIFIED = 1;
    public static final int STATUS_PARSING_FAILED = 2;
    public static final int STATUS_SUCCESS = 0;
    public static final String TAG_LOCALE = "locale";
    public static final String TAG_LOCALE_CONFIG = "locale-config";
    
    public LocaleConfig(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public LocaleConfig(@NonNull final LocaleList locales) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static LocaleConfig fromContextIgnoringOverride(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public LocaleList getSupportedLocales() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Locale getDefaultLocale() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStatus() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
