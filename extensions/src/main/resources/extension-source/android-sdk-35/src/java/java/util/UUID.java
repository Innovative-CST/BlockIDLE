package java.util;

import java.io.Serializable;

public final class UUID implements Serializable, Comparable<UUID> {
	public UUID(final long mostSigBits, final long leastSigBits) {
		throw new RuntimeException("Stub!");
	}

	public static UUID randomUUID() {
		throw new RuntimeException("Stub!");
	}

	public static UUID nameUUIDFromBytes(final byte[] name) {
		throw new RuntimeException("Stub!");
	}

	public static UUID fromString(final String name) {
		throw new RuntimeException("Stub!");
	}

	public long getLeastSignificantBits() {
		throw new RuntimeException("Stub!");
	}

	public long getMostSignificantBits() {
		throw new RuntimeException("Stub!");
	}

	public int version() {
		throw new RuntimeException("Stub!");
	}

	public int variant() {
		throw new RuntimeException("Stub!");
	}

	public long timestamp() {
		throw new RuntimeException("Stub!");
	}

	public int clockSequence() {
		throw new RuntimeException("Stub!");
	}

	public long node() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
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
	public int compareTo(final UUID val) {
		throw new RuntimeException("Stub!");
	}
}
