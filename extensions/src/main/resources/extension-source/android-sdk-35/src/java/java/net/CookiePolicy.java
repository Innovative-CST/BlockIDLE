package java.net;

public interface CookiePolicy {
	CookiePolicy ACCEPT_ALL = null;
	CookiePolicy ACCEPT_NONE = null;
	CookiePolicy ACCEPT_ORIGINAL_SERVER = null;

	boolean shouldAccept(final URI p0, final HttpCookie p1);
}
