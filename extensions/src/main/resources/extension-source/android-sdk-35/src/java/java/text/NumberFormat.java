package java.text;

import java.io.InvalidObjectException;
import java.math.RoundingMode;
import java.util.Currency;
import java.util.Locale;

public abstract class NumberFormat extends Format {
	public static final int FRACTION_FIELD = 1;
	public static final int INTEGER_FIELD = 0;

	protected NumberFormat() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public StringBuffer format(@RecentlyNonNull final Object number, @RecentlyNonNull final StringBuffer toAppendTo,
			@RecentlyNonNull final FieldPosition pos) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public final Object parseObject(@RecentlyNonNull final String source, @RecentlyNonNull final ParsePosition pos) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public final String format(final double number) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public final String format(final long number) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public abstract StringBuffer format(final double p0, @RecentlyNonNull final StringBuffer p1,
			@RecentlyNonNull final FieldPosition p2);

	@RecentlyNonNull
	public abstract StringBuffer format(final long p0, @RecentlyNonNull final StringBuffer p1,
			@RecentlyNonNull final FieldPosition p2);

	@RecentlyNullable
	public abstract Number parse(@RecentlyNonNull final String p0, @RecentlyNonNull final ParsePosition p1);

	@RecentlyNullable
	public Number parse(@RecentlyNonNull final String source) throws ParseException {
		throw new RuntimeException("Stub!");
	}

	public boolean isParseIntegerOnly() {
		throw new RuntimeException("Stub!");
	}

	public void setParseIntegerOnly(final boolean value) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final NumberFormat getInstance() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static NumberFormat getInstance(@RecentlyNonNull final Locale inLocale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final NumberFormat getNumberInstance() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static NumberFormat getNumberInstance(@RecentlyNonNull final Locale inLocale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final NumberFormat getIntegerInstance() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static NumberFormat getIntegerInstance(@RecentlyNonNull final Locale inLocale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final NumberFormat getCurrencyInstance() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static NumberFormat getCurrencyInstance(@RecentlyNonNull final Locale inLocale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final NumberFormat getPercentInstance() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static NumberFormat getPercentInstance(@RecentlyNonNull final Locale inLocale) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Locale[] getAvailableLocales() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
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

	@RecentlyNullable
	public Currency getCurrency() {
		throw new RuntimeException("Stub!");
	}

	public void setCurrency(@RecentlyNonNull final Currency currency) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public RoundingMode getRoundingMode() {
		throw new RuntimeException("Stub!");
	}

	public void setRoundingMode(@RecentlyNullable final RoundingMode roundingMode) {
		throw new RuntimeException("Stub!");
	}

	public static class Field extends Format.Field {
		@RecentlyNonNull
		public static final Field CURRENCY;
		@RecentlyNonNull
		public static final Field DECIMAL_SEPARATOR;
		@RecentlyNonNull
		public static final Field EXPONENT;
		@RecentlyNonNull
		public static final Field EXPONENT_SIGN;
		@RecentlyNonNull
		public static final Field EXPONENT_SYMBOL;
		@RecentlyNonNull
		public static final Field FRACTION;
		@RecentlyNonNull
		public static final Field GROUPING_SEPARATOR;
		@RecentlyNonNull
		public static final Field INTEGER;
		@RecentlyNonNull
		public static final Field PERCENT;
		@RecentlyNonNull
		public static final Field PERMILLE;
		@RecentlyNonNull
		public static final Field SIGN;

		protected Field(@RecentlyNonNull final String name) {
			super(null);
			throw new RuntimeException("Stub!");
		}

		@RecentlyNonNull
		@Override
		protected Object readResolve() throws InvalidObjectException {
			throw new RuntimeException("Stub!");
		}

		static {
			CURRENCY = null;
			DECIMAL_SEPARATOR = null;
			EXPONENT = null;
			EXPONENT_SIGN = null;
			EXPONENT_SYMBOL = null;
			FRACTION = null;
			GROUPING_SEPARATOR = null;
			INTEGER = null;
			PERCENT = null;
			PERMILLE = null;
			SIGN = null;
		}
	}
}
