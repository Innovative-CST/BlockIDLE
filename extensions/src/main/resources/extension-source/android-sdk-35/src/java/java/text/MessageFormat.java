package java.text;

import java.io.InvalidObjectException;
import java.util.Locale;

public class MessageFormat extends Format {
	public MessageFormat(final String pattern) {
		throw new RuntimeException("Stub!");
	}

	public MessageFormat(final String pattern, final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	public void setLocale(final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	public Locale getLocale() {
		throw new RuntimeException("Stub!");
	}

	public void applyPattern(final String pattern) {
		throw new RuntimeException("Stub!");
	}

	public String toPattern() {
		throw new RuntimeException("Stub!");
	}

	public void setFormatsByArgumentIndex(final Format[] newFormats) {
		throw new RuntimeException("Stub!");
	}

	public void setFormats(final Format[] newFormats) {
		throw new RuntimeException("Stub!");
	}

	public void setFormatByArgumentIndex(final int argumentIndex, final Format newFormat) {
		throw new RuntimeException("Stub!");
	}

	public void setFormat(final int formatElementIndex, final Format newFormat) {
		throw new RuntimeException("Stub!");
	}

	public Format[] getFormatsByArgumentIndex() {
		throw new RuntimeException("Stub!");
	}

	public Format[] getFormats() {
		throw new RuntimeException("Stub!");
	}

	public final StringBuffer format(final Object[] arguments, final StringBuffer result, final FieldPosition pos) {
		throw new RuntimeException("Stub!");
	}

	public static String format(final String pattern, final Object... arguments) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final StringBuffer format(final Object arguments, final StringBuffer result, final FieldPosition pos) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public AttributedCharacterIterator formatToCharacterIterator(final Object arguments) {
		throw new RuntimeException("Stub!");
	}

	public Object[] parse(final String source, final ParsePosition pos) {
		throw new RuntimeException("Stub!");
	}

	public Object[] parse(final String source) throws ParseException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Object parseObject(final String source, final ParsePosition pos) {
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

	public static class Field extends Format.Field {
		public static final Field ARGUMENT;

		protected Field(final String name) {
			super(null);
			throw new RuntimeException("Stub!");
		}

		@Override
		protected Object readResolve() throws InvalidObjectException {
			throw new RuntimeException("Stub!");
		}

		static {
			ARGUMENT = null;
		}
	}
}
