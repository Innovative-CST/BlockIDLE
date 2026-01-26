package java.util.regex;

import java.util.function.Function;
import java.util.stream.Stream;

public final class Matcher implements MatchResult {
	Matcher() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Pattern pattern() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public MatchResult toMatchResult() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Matcher usePattern(@RecentlyNonNull final Pattern newPattern) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Matcher reset() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Matcher reset(@RecentlyNonNull final CharSequence input) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int start() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int start(final int group) {
		throw new RuntimeException("Stub!");
	}

	public int start(@RecentlyNonNull final String name) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int end() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int end(final int group) {
		throw new RuntimeException("Stub!");
	}

	public int end(@RecentlyNonNull final String name) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String group() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public String group(final int group) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public String group(@RecentlyNonNull final String name) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int groupCount() {
		throw new RuntimeException("Stub!");
	}

	public boolean matches() {
		throw new RuntimeException("Stub!");
	}

	public boolean find() {
		throw new RuntimeException("Stub!");
	}

	public boolean find(final int start) {
		throw new RuntimeException("Stub!");
	}

	public boolean lookingAt() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String quoteReplacement(@RecentlyNonNull final String s) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Matcher appendReplacement(@RecentlyNonNull final StringBuffer sb,
			@RecentlyNonNull final String replacement) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Matcher appendReplacement(@RecentlyNonNull final StringBuilder sb,
			@RecentlyNonNull final String replacement) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuffer appendTail(@RecentlyNonNull final StringBuffer sb) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public StringBuilder appendTail(@RecentlyNonNull final StringBuilder sb) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String replaceAll(@RecentlyNonNull final String replacement) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String replaceAll(@RecentlyNonNull final Function<MatchResult, String> replacer) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Stream<MatchResult> results() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String replaceFirst(@RecentlyNonNull final String replacement) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String replaceFirst(@RecentlyNonNull final Function<MatchResult, String> replacer) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Matcher region(final int start, final int end) {
		throw new RuntimeException("Stub!");
	}

	public int regionStart() {
		throw new RuntimeException("Stub!");
	}

	public int regionEnd() {
		throw new RuntimeException("Stub!");
	}

	public boolean hasTransparentBounds() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Matcher useTransparentBounds(final boolean b) {
		throw new RuntimeException("Stub!");
	}

	public boolean hasAnchoringBounds() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Matcher useAnchoringBounds(final boolean b) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public boolean hitEnd() {
		throw new RuntimeException("Stub!");
	}

	public boolean requireEnd() {
		throw new RuntimeException("Stub!");
	}
}
