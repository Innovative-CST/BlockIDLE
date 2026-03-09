package java.util;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public final class Scanner implements Iterator<String>, Closeable {
	public Scanner(final Readable source) {
		throw new RuntimeException("Stub!");
	}

	public Scanner(final InputStream source) {
		throw new RuntimeException("Stub!");
	}

	public Scanner(final InputStream source, final String charsetName) {
		throw new RuntimeException("Stub!");
	}

	public Scanner(final InputStream source, final Charset charset) {
		throw new RuntimeException("Stub!");
	}

	public Scanner(final File source) throws FileNotFoundException {
		throw new RuntimeException("Stub!");
	}

	public Scanner(final File source, final String charsetName) throws FileNotFoundException {
		throw new RuntimeException("Stub!");
	}

	public Scanner(final File source, final Charset charset) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Scanner(final Path source) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Scanner(final Path source, final String charsetName) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Scanner(final Path source, final Charset charset) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Scanner(final String source) {
		throw new RuntimeException("Stub!");
	}

	public Scanner(final ReadableByteChannel source) {
		throw new RuntimeException("Stub!");
	}

	public Scanner(final ReadableByteChannel source, final String charsetName) {
		throw new RuntimeException("Stub!");
	}

	public Scanner(final ReadableByteChannel source, final Charset charset) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() {
		throw new RuntimeException("Stub!");
	}

	public IOException ioException() {
		throw new RuntimeException("Stub!");
	}

	public Pattern delimiter() {
		throw new RuntimeException("Stub!");
	}

	public Scanner useDelimiter(final Pattern pattern) {
		throw new RuntimeException("Stub!");
	}

	public Scanner useDelimiter(final String pattern) {
		throw new RuntimeException("Stub!");
	}

	public Locale locale() {
		throw new RuntimeException("Stub!");
	}

	public Scanner useLocale(final Locale locale) {
		throw new RuntimeException("Stub!");
	}

	public int radix() {
		throw new RuntimeException("Stub!");
	}

	public Scanner useRadix(final int radix) {
		throw new RuntimeException("Stub!");
	}

	public MatchResult match() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean hasNext() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String next() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void remove() {
		throw new RuntimeException("Stub!");
	}

	public boolean hasNext(final String pattern) {
		throw new RuntimeException("Stub!");
	}

	public String next(final String pattern) {
		throw new RuntimeException("Stub!");
	}

	public boolean hasNext(final Pattern pattern) {
		throw new RuntimeException("Stub!");
	}

	public String next(final Pattern pattern) {
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextLine() {
		throw new RuntimeException("Stub!");
	}

	public String nextLine() {
		throw new RuntimeException("Stub!");
	}

	public String findInLine(final String pattern) {
		throw new RuntimeException("Stub!");
	}

	public String findInLine(final Pattern pattern) {
		throw new RuntimeException("Stub!");
	}

	public String findWithinHorizon(final String pattern, final int horizon) {
		throw new RuntimeException("Stub!");
	}

	public String findWithinHorizon(final Pattern pattern, final int horizon) {
		throw new RuntimeException("Stub!");
	}

	public Scanner skip(final Pattern pattern) {
		throw new RuntimeException("Stub!");
	}

	public Scanner skip(final String pattern) {
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextBoolean() {
		throw new RuntimeException("Stub!");
	}

	public boolean nextBoolean() {
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextByte() {
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextByte(final int radix) {
		throw new RuntimeException("Stub!");
	}

	public byte nextByte() {
		throw new RuntimeException("Stub!");
	}

	public byte nextByte(final int radix) {
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextShort() {
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextShort(final int radix) {
		throw new RuntimeException("Stub!");
	}

	public short nextShort() {
		throw new RuntimeException("Stub!");
	}

	public short nextShort(final int radix) {
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextInt() {
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextInt(final int radix) {
		throw new RuntimeException("Stub!");
	}

	public int nextInt() {
		throw new RuntimeException("Stub!");
	}

	public int nextInt(final int radix) {
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextLong() {
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextLong(final int radix) {
		throw new RuntimeException("Stub!");
	}

	public long nextLong() {
		throw new RuntimeException("Stub!");
	}

	public long nextLong(final int radix) {
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextFloat() {
		throw new RuntimeException("Stub!");
	}

	public float nextFloat() {
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextDouble() {
		throw new RuntimeException("Stub!");
	}

	public double nextDouble() {
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextBigInteger() {
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextBigInteger(final int radix) {
		throw new RuntimeException("Stub!");
	}

	public BigInteger nextBigInteger() {
		throw new RuntimeException("Stub!");
	}

	public BigInteger nextBigInteger(final int radix) {
		throw new RuntimeException("Stub!");
	}

	public boolean hasNextBigDecimal() {
		throw new RuntimeException("Stub!");
	}

	public BigDecimal nextBigDecimal() {
		throw new RuntimeException("Stub!");
	}

	public Scanner reset() {
		throw new RuntimeException("Stub!");
	}

	public Stream<String> tokens() {
		throw new RuntimeException("Stub!");
	}

	public Stream<MatchResult> findAll(final Pattern pattern) {
		throw new RuntimeException("Stub!");
	}

	public Stream<MatchResult> findAll(final String patString) {
		throw new RuntimeException("Stub!");
	}
}
