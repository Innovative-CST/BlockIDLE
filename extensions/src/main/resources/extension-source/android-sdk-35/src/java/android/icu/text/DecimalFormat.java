package android.icu.text;

import android.icu.util.Currency;
import java.math.MathContext;
import java.text.ParsePosition;
import android.icu.util.CurrencyAmount;
import java.text.AttributedCharacterIterator;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.FieldPosition;

public class DecimalFormat extends NumberFormat
{
    public static final int MINIMUM_GROUPING_DIGITS_AUTO = -2;
    public static final int MINIMUM_GROUPING_DIGITS_MIN2 = -3;
    public static final int PAD_AFTER_PREFIX = 1;
    public static final int PAD_AFTER_SUFFIX = 3;
    public static final int PAD_BEFORE_PREFIX = 0;
    public static final int PAD_BEFORE_SUFFIX = 2;
    
    public DecimalFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public DecimalFormat(final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public DecimalFormat(final String pattern, final DecimalFormatSymbols symbols) {
        throw new RuntimeException("Stub!");
    }
    
    public DecimalFormat(final String pattern, final DecimalFormatSymbols symbols, final CurrencyPluralInfo infoInput, final int style) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void applyPattern(final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void applyLocalizedPattern(final String localizedPattern) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object clone() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public StringBuffer format(final double number, final StringBuffer result, final FieldPosition fieldPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public StringBuffer format(final long number, final StringBuffer result, final FieldPosition fieldPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public StringBuffer format(final BigInteger number, final StringBuffer result, final FieldPosition fieldPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public StringBuffer format(final BigDecimal number, final StringBuffer result, final FieldPosition fieldPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public StringBuffer format(final android.icu.math.BigDecimal number, final StringBuffer result, final FieldPosition fieldPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public AttributedCharacterIterator formatToCharacterIterator(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public StringBuffer format(final CurrencyAmount currAmt, final StringBuffer result, final FieldPosition fieldPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Number parse(final String text, final ParsePosition parsePosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CurrencyAmount parseCurrency(final CharSequence text, final ParsePosition parsePosition) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized DecimalFormatSymbols getDecimalFormatSymbols() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setDecimalFormatSymbols(final DecimalFormatSymbols newSymbols) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized String getPositivePrefix() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setPositivePrefix(final String prefix) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized String getNegativePrefix() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setNegativePrefix(final String prefix) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized String getPositiveSuffix() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setPositiveSuffix(final String suffix) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized String getNegativeSuffix() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setNegativeSuffix(final String suffix) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized boolean isSignAlwaysShown() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setSignAlwaysShown(final boolean value) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized int getMultiplier() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setMultiplier(final int multiplier) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized BigDecimal getRoundingIncrement() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setRoundingIncrement(final BigDecimal increment) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setRoundingIncrement(final android.icu.math.BigDecimal increment) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setRoundingIncrement(final double increment) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized int getRoundingMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized void setRoundingMode(final int roundingMode) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized MathContext getMathContext() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setMathContext(final MathContext mathContext) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized android.icu.math.MathContext getMathContextICU() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setMathContextICU(final android.icu.math.MathContext mathContextICU) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized int getMinimumIntegerDigits() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized void setMinimumIntegerDigits(final int value) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized int getMaximumIntegerDigits() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized void setMaximumIntegerDigits(final int value) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized int getMinimumFractionDigits() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized void setMinimumFractionDigits(final int value) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized int getMaximumFractionDigits() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized void setMaximumFractionDigits(final int value) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized boolean areSignificantDigitsUsed() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setSignificantDigitsUsed(final boolean useSignificantDigits) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized int getMinimumSignificantDigits() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setMinimumSignificantDigits(final int value) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized int getMaximumSignificantDigits() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setMaximumSignificantDigits(final int value) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized int getFormatWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setFormatWidth(final int width) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized char getPadCharacter() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setPadCharacter(final char padChar) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized int getPadPosition() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setPadPosition(final int padPos) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized boolean isScientificNotation() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setScientificNotation(final boolean useScientific) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized byte getMinimumExponentDigits() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setMinimumExponentDigits(final byte minExpDig) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized boolean isExponentSignAlwaysShown() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setExponentSignAlwaysShown(final boolean expSignAlways) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized boolean isGroupingUsed() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized void setGroupingUsed(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized int getGroupingSize() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setGroupingSize(final int width) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized int getSecondaryGroupingSize() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setSecondaryGroupingSize(final int width) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized int getMinimumGroupingDigits() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setMinimumGroupingDigits(final int number) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized boolean isDecimalSeparatorAlwaysShown() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setDecimalSeparatorAlwaysShown(final boolean value) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized Currency getCurrency() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized void setCurrency(final Currency currency) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized Currency.CurrencyUsage getCurrencyUsage() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setCurrencyUsage(final Currency.CurrencyUsage usage) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized CurrencyPluralInfo getCurrencyPluralInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setCurrencyPluralInfo(final CurrencyPluralInfo newInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized boolean isParseBigDecimal() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setParseBigDecimal(final boolean value) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getParseMaxDigits() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setParseMaxDigits(final int maxDigits) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized boolean isParseStrict() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized void setParseStrict(final boolean parseStrict) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized boolean isParseIntegerOnly() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized void setParseIntegerOnly(final boolean parseIntegerOnly) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized boolean isDecimalPatternMatchRequired() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setDecimalPatternMatchRequired(final boolean value) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized boolean isParseNoExponent() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setParseNoExponent(final boolean value) {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized boolean isParseCaseSensitive() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized void setParseCaseSensitive(final boolean value) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized String toPattern() {
        throw new RuntimeException("Stub!");
    }
    
    public synchronized String toLocalizedPattern() {
        throw new RuntimeException("Stub!");
    }
}
