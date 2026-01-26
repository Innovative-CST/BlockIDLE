package java.util;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.util.stream.IntStream;

public class BitSet implements Cloneable, Serializable {
	public BitSet() {
		throw new RuntimeException("Stub!");
	}

	public BitSet(final int nbits) {
		throw new RuntimeException("Stub!");
	}

	public static BitSet valueOf(final long[] longs) {
		throw new RuntimeException("Stub!");
	}

	public static BitSet valueOf(final LongBuffer lb) {
		throw new RuntimeException("Stub!");
	}

	public static BitSet valueOf(final byte[] bytes) {
		throw new RuntimeException("Stub!");
	}

	public static BitSet valueOf(final ByteBuffer bb) {
		throw new RuntimeException("Stub!");
	}

	public byte[] toByteArray() {
		throw new RuntimeException("Stub!");
	}

	public long[] toLongArray() {
		throw new RuntimeException("Stub!");
	}

	public void flip(final int bitIndex) {
		throw new RuntimeException("Stub!");
	}

	public void flip(final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public void set(final int bitIndex) {
		throw new RuntimeException("Stub!");
	}

	public void set(final int bitIndex, final boolean value) {
		throw new RuntimeException("Stub!");
	}

	public void set(final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public void set(final int fromIndex, final int toIndex, final boolean value) {
		throw new RuntimeException("Stub!");
	}

	public void clear(final int bitIndex) {
		throw new RuntimeException("Stub!");
	}

	public void clear(final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public void clear() {
		throw new RuntimeException("Stub!");
	}

	public boolean get(final int bitIndex) {
		throw new RuntimeException("Stub!");
	}

	public BitSet get(final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public int nextSetBit(final int fromIndex) {
		throw new RuntimeException("Stub!");
	}

	public int nextClearBit(final int fromIndex) {
		throw new RuntimeException("Stub!");
	}

	public int previousSetBit(final int fromIndex) {
		throw new RuntimeException("Stub!");
	}

	public int previousClearBit(final int fromIndex) {
		throw new RuntimeException("Stub!");
	}

	public int length() {
		throw new RuntimeException("Stub!");
	}

	public boolean isEmpty() {
		throw new RuntimeException("Stub!");
	}

	public boolean intersects(final BitSet set) {
		throw new RuntimeException("Stub!");
	}

	public int cardinality() {
		throw new RuntimeException("Stub!");
	}

	public void and(final BitSet set) {
		throw new RuntimeException("Stub!");
	}

	public void or(final BitSet set) {
		throw new RuntimeException("Stub!");
	}

	public void xor(final BitSet set) {
		throw new RuntimeException("Stub!");
	}

	public void andNot(final BitSet set) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	public int size() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object obj) {
		throw new RuntimeException("Stub!");
	}

	public Object clone() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public IntStream stream() {
		throw new RuntimeException("Stub!");
	}
}
