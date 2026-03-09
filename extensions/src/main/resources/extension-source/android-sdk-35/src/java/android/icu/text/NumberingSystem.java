package android.icu.text;

import android.icu.util.ULocale;
import java.util.Locale;

public class NumberingSystem
{
    public static final NumberingSystem LATIN;
    
    public NumberingSystem() {
        throw new RuntimeException("Stub!");
    }
    
    public static NumberingSystem getInstance(final int radix_in, final boolean isAlgorithmic_in, final String desc_in) {
        throw new RuntimeException("Stub!");
    }
    
    public static NumberingSystem getInstance(final Locale inLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static NumberingSystem getInstance(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static NumberingSystem getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static NumberingSystem getInstanceByName(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public static String[] getAvailableNames() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isValidDigitString(final String str) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRadix() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAlgorithmic() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        LATIN = null;
    }
}
