package java.text;

import java.math.RoundingMode;
import java.util.Currency;

public class DecimalFormat extends NumberFormat {
	public DecimalFormat() {
		throw new RuntimeException("Stub!");
	}

	public DecimalFormat(final String pattern) {
		throw new RuntimeException("Stub!");
	}

	public DecimalFormat(final String pattern, final DecimalFormatSymbols symbols) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final StringBuffer format(final Object number, final StringBuffer toAppendTo, final FieldPosition pos) {
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
	public AttributedCharacterIterator formatToCharacterIterator(final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Number parse(final String text, final ParsePosition pos) {
		throw new RuntimeException("Stub!");
	}

	public DecimalFormatSymbols getDecimalFormatSymbols() {
		throw new RuntimeException("Stub!");
	}

	public void setDecimalFormatSymbols(final DecimalFormatSymbols newSymbols) {
		throw new RuntimeException("Stub!");
	}

	public String getPositivePrefix() {
		throw new RuntimeException("Stub!");
	}

	public void setPositivePrefix(final String newValue) {
		throw new RuntimeException("Stub!");
	}

	public String getNegativePrefix() {
		throw new RuntimeException("Stub!");
	}

	public void setNegativePrefix(final String newValue) {
		throw new RuntimeException("Stub!");
	}

	public String getPositiveSuffix() {
		throw new RuntimeException("Stub!");
	}

	public void setPositiveSuffix(final String newValue) {
		throw new RuntimeException("Stub!");
	}

	public String getNegativeSuffix() {
		throw new RuntimeException("Stub!");
	}

	public void setNegativeSuffix(final String newValue) {
		throw new RuntimeException("Stub!");
	}

	public int getMultiplier() {
		throw new RuntimeException("Stub!");
	}

	public void setMultiplier(final int newValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void setGroupingUsed(final boolean newValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isGroupingUsed() {
		throw new RuntimeException("Stub!");
	}

	public int getGroupingSize() {
		throw new RuntimeException("Stub!");
	}

	public void setGroupingSize(final int newValue) {
		throw new RuntimeException("Stub!");
	}

	public boolean isDecimalSeparatorAlwaysShown() {
		throw new RuntimeException("Stub!");
	}

	public void setDecimalSeparatorAlwaysShown(final boolean newValue) {
		throw new RuntimeException("Stub!");
	}

	public boolean isParseBigDecimal() {
		throw new RuntimeException("Stub!");
	}

	public void setParseBigDecimal(final boolean newValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isParseIntegerOnly() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void setParseIntegerOnly(final boolean value) {
		throw new RuntimeException("Stub!");
	}

	@Override
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

	public String toPattern() {
		throw new RuntimeException("Stub!");
	}

	public String toLocalizedPattern() {
		throw new RuntimeException("Stub!");
	}

	public void applyPattern(final String pattern) {
		throw new RuntimeException("Stub!");
	}

	public void applyLocalizedPattern(final String pattern) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void setMaximumIntegerDigits(final int newValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void setMinimumIntegerDigits(final int newValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void setMaximumFractionDigits(final int newValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void setMinimumFractionDigits(final int newValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getMaximumIntegerDigits() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getMinimumIntegerDigits() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getMaximumFractionDigits() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getMinimumFractionDigits() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Currency getCurrency() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void setCurrency(final Currency currency) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public RoundingMode getRoundingMode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void setRoundingMode(final RoundingMode roundingMode) {
		throw new RuntimeException("Stub!");
	}
}
