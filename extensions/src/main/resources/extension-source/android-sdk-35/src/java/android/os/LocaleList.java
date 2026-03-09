package android.os;

import android.icu.util.ULocale;
import java.util.Locale;

public final class LocaleList implements Parcelable
{
    @NonNull
    public static final Creator<LocaleList> CREATOR;
    
    public LocaleList(@NonNull final Locale... list) {
        throw new RuntimeException("Stub!");
    }
    
    public Locale get(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEmpty() {
        throw new RuntimeException("Stub!");
    }
    
    public int size() {
        throw new RuntimeException("Stub!");
    }
    
    public int indexOf(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int parcelableFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String toLanguageTags() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static LocaleList getEmptyLocaleList() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static LocaleList forLanguageTags(@Nullable final String list) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isPseudoLocale(@Nullable final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean matchesLanguageAndScript(@NonNull final Locale supported, @NonNull final Locale desired) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Locale getFirstMatch(final String[] supportedLocales) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static LocaleList getDefault() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static LocaleList getAdjustedDefault() {
        throw new RuntimeException("Stub!");
    }
    
    public static void setDefault(@NonNull final LocaleList locales) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
