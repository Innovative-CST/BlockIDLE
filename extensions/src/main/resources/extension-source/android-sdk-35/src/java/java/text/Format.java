package java.text;

import java.io.Serializable;

public abstract class Format implements Serializable, Cloneable {
	protected Format() {
		throw new RuntimeException("Stub!");
	}

	public final String format(final Object obj) {
		throw new RuntimeException("Stub!");
	}

	public abstract StringBuffer format(final Object p0, final StringBuffer p1, final FieldPosition p2);

	public AttributedCharacterIterator formatToCharacterIterator(final Object obj) {
		throw new RuntimeException("Stub!");
	}

	public abstract Object parseObject(final String p0, final ParsePosition p1);

	public Object parseObject(final String source) throws ParseException {
		throw new RuntimeException("Stub!");
	}

	public Object clone() {
		throw new RuntimeException("Stub!");
	}

	public static class Field extends AttributedCharacterIterator.Attribute {
		protected Field(final String name) {
			super(null);
			throw new RuntimeException("Stub!");
		}
	}
}
