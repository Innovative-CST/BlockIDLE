package androidx.appcompat.app;

import java.util.Set;
import java.util.Locale;
import java.util.LinkedHashSet;
import android.os.LocaleList;
import androidx.core.os.LocaleListCompat;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
final class LocaleOverlayHelper
{
    private LocaleOverlayHelper() {
    }
    
    static LocaleListCompat combineLocalesIfOverlayExists(final LocaleListCompat overlayLocales, final LocaleListCompat baseLocales) {
        if (overlayLocales == null || overlayLocales.isEmpty()) {
            return LocaleListCompat.getEmptyLocaleList();
        }
        return combineLocales(overlayLocales, baseLocales);
    }
    
    static LocaleListCompat combineLocalesIfOverlayExists(final LocaleList overlayLocales, final LocaleList baseLocales) {
        if (overlayLocales == null || overlayLocales.isEmpty()) {
            return LocaleListCompat.getEmptyLocaleList();
        }
        return combineLocales(LocaleListCompat.wrap(overlayLocales), LocaleListCompat.wrap(baseLocales));
    }
    
    private static LocaleListCompat combineLocales(final LocaleListCompat overlayLocales, final LocaleListCompat baseLocales) {
        final Set<Locale> combinedLocales = (Set<Locale>)new LinkedHashSet();
        for (int i = 0; i < overlayLocales.size() + baseLocales.size(); ++i) {
            Locale currLocale;
            if (i < overlayLocales.size()) {
                currLocale = overlayLocales.get(i);
            }
            else {
                currLocale = baseLocales.get(i - overlayLocales.size());
            }
            if (currLocale != null) {
                combinedLocales.add((Object)currLocale);
            }
        }
        return LocaleListCompat.create((Locale[])combinedLocales.toArray((Object[])new Locale[combinedLocales.size()]));
    }
}
