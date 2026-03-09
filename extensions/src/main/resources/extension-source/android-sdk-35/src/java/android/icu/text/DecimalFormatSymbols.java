package android.icu.text;

import android.icu.util.Currency;
import android.icu.util.ULocale;
import java.util.Locale;
import java.io.Serializable;

public class DecimalFormatSymbols implements Cloneable, Serializable
{
    public static final int CURRENCY_SPC_CURRENCY_MATCH = 0;
    public static final int CURRENCY_SPC_INSERT = 2;
    public static final int CURRENCY_SPC_SURROUNDING_MATCH = 1;
    
    public DecimalFormatSymbols() {
        throw new RuntimeException("Stub!");
    }
    
    public DecimalFormatSymbols(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public DecimalFormatSymbols(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static DecimalFormatSymbols getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static DecimalFormatSymbols getInstance(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static DecimalFormatSymbols getInstance(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static DecimalFormatSymbols forNumberingSystem(final Locale locale, final NumberingSystem ns) {
        throw new RuntimeException("Stub!");
    }
    
    public static DecimalFormatSymbols forNumberingSystem(final ULocale locale, final NumberingSystem ns) {
        throw new RuntimeException("Stub!");
    }
    
    public static Locale[] getAvailableLocales() {
        throw new RuntimeException("Stub!");
    }
    
    public static ULocale[] getAvailableULocales() {
        throw new RuntimeException("Stub!");
    }
    
    public char getZeroDigit() {
        throw new RuntimeException("Stub!");
    }
    
    public char[] getDigits() {
        throw new RuntimeException("Stub!");
    }
    
    public void setZeroDigit(final char zeroDigit) {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getDigitStrings() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDigitStrings(final String[] digitStrings) {
        throw new RuntimeException("Stub!");
    }
    
    public char getSignificantDigit() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSignificantDigit(final char sigDigit) {
        throw new RuntimeException("Stub!");
    }
    
    public char getGroupingSeparator() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGroupingSeparator(final char groupingSeparator) {
        throw new RuntimeException("Stub!");
    }
    
    public String getGroupingSeparatorString() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGroupingSeparatorString(final String groupingSeparatorString) {
        throw new RuntimeException("Stub!");
    }
    
    public char getDecimalSeparator() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDecimalSeparator(final char decimalSeparator) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDecimalSeparatorString() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDecimalSeparatorString(final String decimalSeparatorString) {
        throw new RuntimeException("Stub!");
    }
    
    public char getPerMill() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPerMill(final char perMill) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPerMillString() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPerMillString(final String perMillString) {
        throw new RuntimeException("Stub!");
    }
    
    public char getPercent() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPercent(final char percent) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPercentString() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPercentString(final String percentString) {
        throw new RuntimeException("Stub!");
    }
    
    public char getDigit() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDigit(final char digit) {
        throw new RuntimeException("Stub!");
    }
    
    public char getPatternSeparator() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPatternSeparator(final char patternSeparator) {
        throw new RuntimeException("Stub!");
    }
    
    public String getInfinity() {
        throw new RuntimeException("Stub!");
    }
    
    public void setInfinity(final String infinity) {
        throw new RuntimeException("Stub!");
    }
    
    public String getNaN() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNaN(final String NaN) {
        throw new RuntimeException("Stub!");
    }
    
    public char getMinusSign() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinusSign(final char minusSign) {
        throw new RuntimeException("Stub!");
    }
    
    public String getMinusSignString() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinusSignString(final String minusSignString) {
        throw new RuntimeException("Stub!");
    }
    
    public char getPlusSign() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPlusSign(final char plus) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPlusSignString() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPlusSignString(final String plusSignString) {
        throw new RuntimeException("Stub!");
    }
    
    public String getCurrencySymbol() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCurrencySymbol(final String currency) {
        throw new RuntimeException("Stub!");
    }
    
    public String getInternationalCurrencySymbol() {
        throw new RuntimeException("Stub!");
    }
    
    public void setInternationalCurrencySymbol(final String currency) {
        throw new RuntimeException("Stub!");
    }
    
    public Currency getCurrency() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCurrency(final Currency currency) {
        throw new RuntimeException("Stub!");
    }
    
    public char getMonetaryDecimalSeparator() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMonetaryDecimalSeparator(final char sep) {
        throw new RuntimeException("Stub!");
    }
    
    public String getMonetaryDecimalSeparatorString() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMonetaryDecimalSeparatorString(final String sep) {
        throw new RuntimeException("Stub!");
    }
    
    public char getMonetaryGroupingSeparator() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMonetaryGroupingSeparator(final char sep) {
        throw new RuntimeException("Stub!");
    }
    
    public String getMonetaryGroupingSeparatorString() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMonetaryGroupingSeparatorString(final String sep) {
        throw new RuntimeException("Stub!");
    }
    
    public String getExponentMultiplicationSign() {
        throw new RuntimeException("Stub!");
    }
    
    public void setExponentMultiplicationSign(final String exponentMultiplicationSign) {
        throw new RuntimeException("Stub!");
    }
    
    public String getExponentSeparator() {
        throw new RuntimeException("Stub!");
    }
    
    public void setExponentSeparator(final String exp) {
        throw new RuntimeException("Stub!");
    }
    
    public char getPadEscape() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPadEscape(final char c) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPatternForCurrencySpacing(final int itemType, final boolean beforeCurrency) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPatternForCurrencySpacing(final int itemType, final boolean beforeCurrency, final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public Locale getLocale() {
        throw new RuntimeException("Stub!");
    }
    
    public ULocale getULocale() {
        throw new RuntimeException("Stub!");
    }
    
    public Object clone() {
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
}
