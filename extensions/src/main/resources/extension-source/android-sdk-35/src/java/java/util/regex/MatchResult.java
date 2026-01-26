package java.util.regex;

public interface MatchResult {
	int start();

	int start(final int p0);

	int end();

	int end(final int p0);

	String group();

	String group(final int p0);

	int groupCount();
}
