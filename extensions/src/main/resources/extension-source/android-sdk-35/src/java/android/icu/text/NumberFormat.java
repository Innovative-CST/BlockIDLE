package android.icu.text;

import java.io.InvalidObjectException;
import java.text.Format;
import android.icu.util.Currency;
import android.icu.util.ULocale;
import java.util.Locale;
import java.text.ParseException;
import android.icu.util.CurrencyAmount;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParsePosition;
import java.text.FieldPosition;

public abstract class NumberFormat extends UFormat
{
    public static final int ACCOUNTINGCURRENCYSTYLE = 7;
    public static final int CASHCURRENCYSTYLE = 8;
    public static final int CURRENCYSTYLE = 1;
    public static final int FRACTION_FIELD = 1;
    public static final int INTEGERSTYLE = 4;
    public static final int INTEGER_FIELD = 0;
    public static final int ISOCURRENCYSTYLE = 5;
    public static final int NUMBERSTYLE = 0;
    public static final int PERCENTSTYLE = 2;
    public static final int PLURALCURRENCYSTYLE = 6;
    public static final int SCIENTIFICSTYLE = 3;
    public static final int STANDARDCURRENCYSTYLE = 9;
    
    public NumberFormat() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public StringBuffer format(final Object number, final StringBuffer toAppendTo, final FieldPosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final Object parseObject(final String source, final ParsePosition parsePosition) {
        throw new RuntimeException("Stub!");
    }
    
    public final String format(final double number) {
        throw new RuntimeException("Stub!");
    }
    
    public final String format(final long number) {
        throw new RuntimeException("Stub!");
    }
    
    public final String format(final BigInteger number) {
        throw new RuntimeException("Stub!");
    }
    
    public final String format(final BigDecimal number) {
        throw new RuntimeException("Stub!");
    }
    
    public final String format(final android.icu.math.BigDecimal number) {
        throw new RuntimeException("Stub!");
    }
    
    public final String format(final CurrencyAmount currAmt) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract StringBuffer format(final double p0, final StringBuffer p1, final FieldPosition p2);
    
    public abstract StringBuffer format(final long p0, final StringBuffer p1, final FieldPosition p2);
    
    public abstract StringBuffer format(final BigInteger p0, final StringBuffer p1, final FieldPosition p2);
    
    public abstract StringBuffer format(final BigDecimal p0, final StringBuffer p1, final FieldPosition p2);
    
    public abstract StringBuffer format(final android.icu.math.BigDecimal p0, final StringBuffer p1, final FieldPosition p2);
    
    public StringBuffer format(final CurrencyAmount currAmt, final StringBuffer toAppendTo, final FieldPosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Number parse(final String p0, final ParsePosition p1);
    
    public Number parse(final String text) throws ParseException {
        throw new RuntimeException("Stub!");
    }
    
    public CurrencyAmount parseCurrency(final CharSequence text, final ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isParseIntegerOnly() {
        throw new RuntimeException("Stub!");
    }
    
    public void setParseIntegerOnly(final boolean value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setParseStrict(final boolean value) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isParseStrict() {
        throw new RuntimeException("Stub!");
    }
    
    public void setContext(final DisplayContext context) {
        throw new RuntimeException("Stub!");
    }
    
    public DisplayContext getContext(final DisplayContext.Type type) {
        throw new RuntimeException("Stub!");
    }
    
    public static final NumberFormat getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static NumberFormat getInstance(final Locale inLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static NumberFormat getInstance(final ULocale inLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final NumberFormat getInstance(final int style) {
        throw new RuntimeException("Stub!");
    }
    
    public static NumberFormat getInstance(final Locale inLocale, final int style) {
        throw new RuntimeException("Stub!");
    }
    
    public static final NumberFormat getNumberInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static NumberFormat getNumberInstance(final Locale inLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static NumberFormat getNumberInstance(final ULocale inLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final NumberFormat getIntegerInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static NumberFormat getIntegerInstance(final Locale inLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static NumberFormat getIntegerInstance(final ULocale inLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final NumberFormat getCurrencyInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static NumberFormat getCurrencyInstance(final Locale inLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static NumberFormat getCurrencyInstance(final ULocale inLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final NumberFormat getPercentInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static NumberFormat getPercentInstance(final Locale inLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static NumberFormat getPercentInstance(final ULocale inLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static final NumberFormat getScientificInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static NumberFormat getScientificInstance(final Locale inLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static NumberFormat getScientificInstance(final ULocale inLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static Locale[] getAvailableLocales() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object clone() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isGroupingUsed() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGroupingUsed(final boolean newValue) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaximumIntegerDigits() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaximumIntegerDigits(final int newValue) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinimumIntegerDigits() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinimumIntegerDigits(final int newValue) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaximumFractionDigits() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaximumFractionDigits(final int newValue) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinimumFractionDigits() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinimumFractionDigits(final int newValue) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCurrency(final Currency theCurrency) {
        throw new RuntimeException("Stub!");
    }
    
    public Currency getCurrency() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRoundingMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRoundingMode(final int roundingMode) {
        throw new RuntimeException("Stub!");
    }
    
    public static NumberFormat getInstance(final ULocale desiredLocale, final int choice) {
        throw new RuntimeException("Stub!");
    }
    
    protected static String getPattern(final ULocale forLocale, final int choice) {
        throw new RuntimeException("Stub!");
    }
    
    public static class Field extends Format.Field
    {
        public static final Field APPROXIMATELY_SIGN;
        public static final Field COMPACT;
        public static final Field CURRENCY;
        public static final Field DECIMAL_SEPARATOR;
        public static final Field EXPONENT;
        public static final Field EXPONENT_SIGN;
        public static final Field EXPONENT_SYMBOL;
        public static final Field FRACTION;
        public static final Field GROUPING_SEPARATOR;
        public static final Field INTEGER;
        public static final Field MEASURE_UNIT;
        public static final Field PERCENT;
        public static final Field PERMILLE;
        public static final Field SIGN;
        
        protected Field(final String fieldName) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        @Override
        protected Object readResolve() throws InvalidObjectException {
            throw new RuntimeException("Stub!");
        }
        
        static {
            APPROXIMATELY_SIGN = null;
            COMPACT = null;
            CURRENCY = null;
            DECIMAL_SEPARATOR = null;
            EXPONENT = null;
            EXPONENT_SIGN = null;
            EXPONENT_SYMBOL = null;
            FRACTION = null;
            GROUPING_SEPARATOR = null;
            INTEGER = null;
            MEASURE_UNIT = null;
            PERCENT = null;
            PERMILLE = null;
            SIGN = null;
        }
    }
}
