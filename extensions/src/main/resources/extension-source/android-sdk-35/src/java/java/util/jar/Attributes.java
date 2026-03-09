package java.util.jar;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Attributes implements Map<Object, Object>, Cloneable {
	protected Map<Object, Object> map;

	public Attributes() {
		throw new RuntimeException("Stub!");
	}

	public Attributes(final int size) {
		throw new RuntimeException("Stub!");
	}

	public Attributes(final Attributes attr) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Object get(final Object name) {
		throw new RuntimeException("Stub!");
	}

	public String getValue(final String name) {
		throw new RuntimeException("Stub!");
	}

	public String getValue(final Name name) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Object put(final Object name, final Object value) {
		throw new RuntimeException("Stub!");
	}

	public String putValue(final String name, final String value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Object remove(final Object name) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsValue(final Object value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsKey(final Object name) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void putAll(final Map<?, ?> attr) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void clear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int size() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isEmpty() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Set<Object> keySet() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Collection<Object> values() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Set<Entry<Object, Object>> entrySet() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	public Object clone() {
		throw new RuntimeException("Stub!");
	}

	public static class Name {
		public static final Name CLASS_PATH;
		public static final Name CONTENT_TYPE;
		@Deprecated
		public static final Name EXTENSION_INSTALLATION;
		public static final Name EXTENSION_LIST;
		public static final Name EXTENSION_NAME;
		public static final Name IMPLEMENTATION_TITLE;
		@Deprecated
		public static final Name IMPLEMENTATION_URL;
		public static final Name IMPLEMENTATION_VENDOR;
		@Deprecated
		public static final Name IMPLEMENTATION_VENDOR_ID;
		public static final Name IMPLEMENTATION_VERSION;
		public static final Name MAIN_CLASS;
		public static final Name MANIFEST_VERSION;
		public static final Name SEALED;
		public static final Name SIGNATURE_VERSION;
		public static final Name SPECIFICATION_TITLE;
		public static final Name SPECIFICATION_VENDOR;
		public static final Name SPECIFICATION_VERSION;

		public Name(final String name) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public boolean equals(final Object o) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public int hashCode() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public String toString() {
			throw new RuntimeException("Stub!");
		}

		static {
			CLASS_PATH = null;
			CONTENT_TYPE = null;
			EXTENSION_INSTALLATION = null;
			EXTENSION_LIST = null;
			EXTENSION_NAME = null;
			IMPLEMENTATION_TITLE = null;
			IMPLEMENTATION_URL = null;
			IMPLEMENTATION_VENDOR = null;
			IMPLEMENTATION_VENDOR_ID = null;
			IMPLEMENTATION_VERSION = null;
			MAIN_CLASS = null;
			MANIFEST_VERSION = null;
			SEALED = null;
			SIGNATURE_VERSION = null;
			SPECIFICATION_TITLE = null;
			SPECIFICATION_VENDOR = null;
			SPECIFICATION_VERSION = null;
		}
	}
}
