package java.lang;

import java.io.Serializable;

public abstract class Number implements Serializable {
	public Number() {
		throw new RuntimeException("Stub!");
	}

	public abstract int intValue();

	public abstract long longValue();

	public abstract float floatValue();

	public abstract double doubleValue();

	public byte byteValue() {
		throw new RuntimeException("Stub!");
	}

	public short shortValue() {
		throw new RuntimeException("Stub!");
	}
}
