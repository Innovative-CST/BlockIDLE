package java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Permission;
import java.util.List;
import java.util.Map;

public abstract class URLConnection {
	protected boolean allowUserInteraction;
	protected boolean connected;
	protected boolean doInput;
	protected boolean doOutput;
	protected long ifModifiedSince;
	protected URL url;
	protected boolean useCaches;

	protected URLConnection(final URL url) {
		this.connected = false;
		this.doInput = true;
		this.doOutput = false;
		this.ifModifiedSince = 0L;
		throw new RuntimeException("Stub!");
	}

	public static synchronized FileNameMap getFileNameMap() {
		throw new RuntimeException("Stub!");
	}

	public static void setFileNameMap(final FileNameMap map) {
		throw new RuntimeException("Stub!");
	}

	public abstract void connect() throws IOException;

	public void setConnectTimeout(final int timeout) {
		throw new RuntimeException("Stub!");
	}

	public int getConnectTimeout() {
		throw new RuntimeException("Stub!");
	}

	public void setReadTimeout(final int timeout) {
		throw new RuntimeException("Stub!");
	}

	public int getReadTimeout() {
		throw new RuntimeException("Stub!");
	}

	public URL getURL() {
		throw new RuntimeException("Stub!");
	}

	public int getContentLength() {
		throw new RuntimeException("Stub!");
	}

	public long getContentLengthLong() {
		throw new RuntimeException("Stub!");
	}

	public String getContentType() {
		throw new RuntimeException("Stub!");
	}

	public String getContentEncoding() {
		throw new RuntimeException("Stub!");
	}

	public long getExpiration() {
		throw new RuntimeException("Stub!");
	}

	public long getDate() {
		throw new RuntimeException("Stub!");
	}

	public long getLastModified() {
		throw new RuntimeException("Stub!");
	}

	public String getHeaderField(final String name) {
		throw new RuntimeException("Stub!");
	}

	public Map<String, List<String>> getHeaderFields() {
		throw new RuntimeException("Stub!");
	}

	public int getHeaderFieldInt(final String name, final int Default) {
		throw new RuntimeException("Stub!");
	}

	public long getHeaderFieldLong(final String name, final long Default) {
		throw new RuntimeException("Stub!");
	}

	public long getHeaderFieldDate(final String name, final long Default) {
		throw new RuntimeException("Stub!");
	}

	public String getHeaderFieldKey(final int n) {
		throw new RuntimeException("Stub!");
	}

	public String getHeaderField(final int n) {
		throw new RuntimeException("Stub!");
	}

	public Object getContent() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Object getContent(final Class[] classes) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public Permission getPermission() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public InputStream getInputStream() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public OutputStream getOutputStream() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public void setDoInput(final boolean doinput) {
		throw new RuntimeException("Stub!");
	}

	public boolean getDoInput() {
		throw new RuntimeException("Stub!");
	}

	public void setDoOutput(final boolean dooutput) {
		throw new RuntimeException("Stub!");
	}

	public boolean getDoOutput() {
		throw new RuntimeException("Stub!");
	}

	public void setAllowUserInteraction(final boolean allowuserinteraction) {
		throw new RuntimeException("Stub!");
	}

	public boolean getAllowUserInteraction() {
		throw new RuntimeException("Stub!");
	}

	public static void setDefaultAllowUserInteraction(final boolean defaultallowuserinteraction) {
		throw new RuntimeException("Stub!");
	}

	public static boolean getDefaultAllowUserInteraction() {
		throw new RuntimeException("Stub!");
	}

	public void setUseCaches(final boolean usecaches) {
		throw new RuntimeException("Stub!");
	}

	public boolean getUseCaches() {
		throw new RuntimeException("Stub!");
	}

	public void setIfModifiedSince(final long ifmodifiedsince) {
		throw new RuntimeException("Stub!");
	}

	public long getIfModifiedSince() {
		throw new RuntimeException("Stub!");
	}

	public boolean getDefaultUseCaches() {
		throw new RuntimeException("Stub!");
	}

	public void setDefaultUseCaches(final boolean defaultusecaches) {
		throw new RuntimeException("Stub!");
	}

	public void setRequestProperty(final String key, final String value) {
		throw new RuntimeException("Stub!");
	}

	public void addRequestProperty(final String key, final String value) {
		throw new RuntimeException("Stub!");
	}

	public String getRequestProperty(final String key) {
		throw new RuntimeException("Stub!");
	}

	public Map<String, List<String>> getRequestProperties() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public static void setDefaultRequestProperty(final String key, final String value) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public static String getDefaultRequestProperty(final String key) {
		throw new RuntimeException("Stub!");
	}

	public static synchronized void setContentHandlerFactory(final ContentHandlerFactory fac) {
		throw new RuntimeException("Stub!");
	}

	public static String guessContentTypeFromName(final String fname) {
		throw new RuntimeException("Stub!");
	}

	public static String guessContentTypeFromStream(final InputStream is) throws IOException {
		throw new RuntimeException("Stub!");
	}
}
