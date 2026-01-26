package java.lang;

import java.io.IOException;

public interface Appendable {
	@RecentlyNonNull
	Appendable append(@RecentlyNullable final CharSequence p0) throws IOException;

	@RecentlyNonNull
	Appendable append(@RecentlyNullable final CharSequence p0, final int p1, final int p2) throws IOException;

	@RecentlyNonNull
	Appendable append(final char p0) throws IOException;
}
