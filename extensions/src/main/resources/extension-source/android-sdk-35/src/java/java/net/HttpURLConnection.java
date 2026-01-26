package java.net;

import java.io.IOException;
import java.io.InputStream;
import java.security.Permission;

public abstract class HttpURLConnection extends URLConnection {
	public static final int HTTP_ACCEPTED = 202;
	public static final int HTTP_BAD_GATEWAY = 502;
	public static final int HTTP_BAD_METHOD = 405;
	public static final int HTTP_BAD_REQUEST = 400;
	public static final int HTTP_CLIENT_TIMEOUT = 408;
	public static final int HTTP_CONFLICT = 409;
	public static final int HTTP_CREATED = 201;
	public static final int HTTP_ENTITY_TOO_LARGE = 413;
	public static final int HTTP_FORBIDDEN = 403;
	public static final int HTTP_GATEWAY_TIMEOUT = 504;
	public static final int HTTP_GONE = 410;
	public static final int HTTP_INTERNAL_ERROR = 500;
	public static final int HTTP_LENGTH_REQUIRED = 411;
	public static final int HTTP_MOVED_PERM = 301;
	public static final int HTTP_MOVED_TEMP = 302;
	public static final int HTTP_MULT_CHOICE = 300;
	public static final int HTTP_NOT_ACCEPTABLE = 406;
	public static final int HTTP_NOT_AUTHORITATIVE = 203;
	public static final int HTTP_NOT_FOUND = 404;
	public static final int HTTP_NOT_IMPLEMENTED = 501;
	public static final int HTTP_NOT_MODIFIED = 304;
	public static final int HTTP_NO_CONTENT = 204;
	public static final int HTTP_OK = 200;
	public static final int HTTP_PARTIAL = 206;
	public static final int HTTP_PAYMENT_REQUIRED = 402;
	public static final int HTTP_PRECON_FAILED = 412;
	public static final int HTTP_PROXY_AUTH = 407;
	public static final int HTTP_REQ_TOO_LONG = 414;
	public static final int HTTP_RESET = 205;
	public static final int HTTP_SEE_OTHER = 303;
	@Deprecated
	public static final int HTTP_SERVER_ERROR = 500;
	public static final int HTTP_UNAUTHORIZED = 401;
	public static final int HTTP_UNAVAILABLE = 503;
	public static final int HTTP_UNSUPPORTED_TYPE = 415;
	public static final int HTTP_USE_PROXY = 305;
	public static final int HTTP_VERSION = 505;
	protected int chunkLength;
	protected int fixedContentLength;
	protected long fixedContentLengthLong;
	protected boolean instanceFollowRedirects;
	protected String method;
	protected int responseCode;
	protected String responseMessage;

	protected HttpURLConnection(final URL u) {
		super(null);
		this.chunkLength = -1;
		this.fixedContentLength = -1;
		this.fixedContentLengthLong = -1L;
		this.method = "GET";
		this.responseCode = -1;
		throw new RuntimeException("Stub!");
	}

	@Override
	public String getHeaderFieldKey(final int n) {
		throw new RuntimeException("Stub!");
	}

	public void setFixedLengthStreamingMode(final int contentLength) {
		throw new RuntimeException("Stub!");
	}

	public void setFixedLengthStreamingMode(final long contentLength) {
		throw new RuntimeException("Stub!");
	}

	public void setChunkedStreamingMode(final int chunklen) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String getHeaderField(final int n) {
		throw new RuntimeException("Stub!");
	}

	public static void setFollowRedirects(final boolean set) {
		throw new RuntimeException("Stub!");
	}

	public static boolean getFollowRedirects() {
		throw new RuntimeException("Stub!");
	}

	public void setInstanceFollowRedirects(final boolean followRedirects) {
		throw new RuntimeException("Stub!");
	}

	public boolean getInstanceFollowRedirects() {
		throw new RuntimeException("Stub!");
	}

	public void setRequestMethod(final String method) throws ProtocolException {
		throw new RuntimeException("Stub!");
	}

	public String getRequestMethod() {
		throw new RuntimeException("Stub!");
	}

	public int getResponseCode() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public String getResponseMessage() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long getHeaderFieldDate(final String name, final long Default) {
		throw new RuntimeException("Stub!");
	}

	public abstract void disconnect();

	public abstract boolean usingProxy();

	@Override
	public Permission getPermission() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public InputStream getErrorStream() {
		throw new RuntimeException("Stub!");
	}
}
