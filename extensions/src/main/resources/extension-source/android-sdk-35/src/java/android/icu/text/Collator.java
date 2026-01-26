package android.icu.text;

import android.icu.util.VersionInfo;
import java.util.Locale;
import android.icu.util.ULocale;
import android.icu.util.Freezable;
import java.util.Comparator;

public abstract class Collator implements Comparator<Object>, Freezable<Collator>, Cloneable
{
    public static final int CANONICAL_DECOMPOSITION = 17;
    public static final int FULL_DECOMPOSITION = 15;
    public static final int IDENTICAL = 15;
    public static final int NO_DECOMPOSITION = 16;
    public static final int PRIMARY = 0;
    public static final int QUATERNARY = 3;
    public static final int SECONDARY = 1;
    public static final int TERTIARY = 2;
    
    protected Collator() {
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
    
    public void setStrength(final int newStrength) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDecomposition(final int decomposition) {
        throw new RuntimeException("Stub!");
    }
    
    public void setReorderCodes(final int... order) {
        throw new RuntimeException("Stub!");
    }
    
    public static final Collator getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public Object clone() throws CloneNotSupportedException {
        throw new RuntimeException("Stub!");
    }
    
    public static final Collator getInstance(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final Collator getInstance(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static Locale[] getAvailableLocales() {
        throw new RuntimeException("Stub!");
    }
    
    public static final ULocale[] getAvailableULocales() {
        throw new RuntimeException("Stub!");
    }
    
    public static final String[] getKeywords() {
        throw new RuntimeException("Stub!");
    }
    
    public static final String[] getKeywordValues(final String keyword) {
        throw new RuntimeException("Stub!");
    }
    
    public static final String[] getKeywordValuesForLocale(final String key, final ULocale locale, final boolean commonlyUsed) {
        throw new RuntimeException("Stub!");
    }
    
    public static final ULocale getFunctionalEquivalent(final String keyword, final ULocale locID, final boolean[] isAvailable) {
        throw new RuntimeException("Stub!");
    }
    
    public static final ULocale getFunctionalEquivalent(final String keyword, final ULocale locID) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayName(final Locale objectLocale, final Locale displayLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayName(final ULocale objectLocale, final ULocale displayLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayName(final Locale objectLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayName(final ULocale objectLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public int getStrength() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDecomposition() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean equals(final String source, final String target) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet getTailoredSet() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int compare(final String p0, final String p1);
    
    @Override
    public int compare(final Object source, final Object target) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract CollationKey getCollationKey(final String p0);
    
    public Collator setMaxVariable(final int group) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxVariable() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int getVariableTop();
    
    public abstract VersionInfo getVersion();
    
    public abstract VersionInfo getUCAVersion();
    
    public int[] getReorderCodes() {
        throw new RuntimeException("Stub!");
    }
    
    public static int[] getEquivalentReorderCodes(final int reorderCode) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isFrozen() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Collator freeze() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Collator cloneAsThawed() {
        throw new RuntimeException("Stub!");
    }
    
    public interface ReorderCodes
    {
        public static final int CURRENCY = 4099;
        public static final int DEFAULT = -1;
        public static final int DIGIT = 4100;
        public static final int FIRST = 4096;
        public static final int NONE = 103;
        public static final int OTHERS = 103;
        public static final int PUNCTUATION = 4097;
        public static final int SPACE = 4096;
        public static final int SYMBOL = 4098;
    }
}
