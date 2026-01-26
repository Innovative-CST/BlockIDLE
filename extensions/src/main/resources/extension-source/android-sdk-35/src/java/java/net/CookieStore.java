package java.net;

import java.util.List;

public interface CookieStore {
	void add(final URI p0, final HttpCookie p1);

	List<HttpCookie> get(final URI p0);

	List<HttpCookie> getCookies();

	List<URI> getURIs();

	boolean remove(final URI p0, final HttpCookie p1);

	boolean removeAll();
}
