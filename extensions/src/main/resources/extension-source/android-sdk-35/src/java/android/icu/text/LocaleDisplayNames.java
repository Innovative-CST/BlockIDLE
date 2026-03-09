package android.icu.text;

import java.util.List;
import java.util.Comparator;
import java.util.Set;
import java.util.Locale;
import android.icu.util.ULocale;

public abstract class LocaleDisplayNames
{
    LocaleDisplayNames() {
        throw new RuntimeException("Stub!");
    }
    
    public static LocaleDisplayNames getInstance(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static LocaleDisplayNames getInstance(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static LocaleDisplayNames getInstance(final ULocale locale, final DialectHandling dialectHandling) {
        throw new RuntimeException("Stub!");
    }
    
    public static LocaleDisplayNames getInstance(final ULocale locale, final DisplayContext... contexts) {
        throw new RuntimeException("Stub!");
    }
    
    public static LocaleDisplayNames getInstance(final Locale locale, final DisplayContext... contexts) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract ULocale getLocale();
    
    public abstract DialectHandling getDialectHandling();
    
    public abstract DisplayContext getContext(final DisplayContext.Type p0);
    
    public abstract String localeDisplayName(final ULocale p0);
    
    public abstract String localeDisplayName(final Locale p0);
    
    public abstract String localeDisplayName(final String p0);
    
    public abstract String languageDisplayName(final String p0);
    
    public abstract String scriptDisplayName(final String p0);
    
    public abstract String scriptDisplayName(final int p0);
    
    public abstract String regionDisplayName(final String p0);
    
    public abstract String variantDisplayName(final String p0);
    
    public abstract String keyDisplayName(final String p0);
    
    public abstract String keyValueDisplayName(final String p0, final String p1);
    
    public List<UiListItem> getUiList(final Set<ULocale> localeSet, final boolean inSelf, final Comparator<Object> collator) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract List<UiListItem> getUiListCompareWholeItems(final Set<ULocale> p0, final Comparator<UiListItem> p1);
    
    public enum DialectHandling
    {
        STANDARD_NAMES, 
        DIALECT_NAMES;
    }
    
    public static class UiListItem
    {
        public final ULocale minimized;
        public final ULocale modified;
        public final String nameInDisplayLocale;
        public final String nameInSelf;
        
        public UiListItem(final ULocale minimized, final ULocale modified, final String nameInDisplayLocale, final String nameInSelf) {
            this.minimized = null;
            this.modified = null;
            this.nameInDisplayLocale = null;
            this.nameInSelf = null;
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object obj) {
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
        
        public static Comparator<UiListItem> getComparator(final Comparator<Object> comparator, final boolean inSelf) {
            throw new RuntimeException("Stub!");
        }
    }
}
