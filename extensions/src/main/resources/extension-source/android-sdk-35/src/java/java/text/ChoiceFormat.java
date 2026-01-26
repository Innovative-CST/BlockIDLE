package java.text;

public class ChoiceFormat extends NumberFormat {
	public ChoiceFormat(final String newPattern) {
		throw new RuntimeException("Stub!");
	}

	public ChoiceFormat(final double[] limits, final String[] formats) {
		throw new RuntimeException("Stub!");
	}

	public void applyPattern(final String newPattern) {
		throw new RuntimeException("Stub!");
	}

	public String toPattern() {
		throw new RuntimeException("Stub!");
	}

	public void setChoices(final double[] limits, final String[] formats) {
		throw new RuntimeException("Stub!");
	}

	public double[] getLimits() {
		throw new RuntimeException("Stub!");
	}

	public Object[] getFormats() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public StringBuffer format(final long number, final StringBuffer toAppendTo, final FieldPosition status) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public StringBuffer format(final double number, final StringBuffer toAppendTo, final FieldPosition status) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Number parse(final String text, final ParsePosition status) {
		throw new RuntimeException("Stub!");
	}

	public static final double nextDouble(final double d) {
		throw new RuntimeException("Stub!");
	}

	public static final double previousDouble(final double d) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Object clone() {
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

	public static double nextDouble(final double d, final boolean positive) {
		throw new RuntimeException("Stub!");
	}
}
