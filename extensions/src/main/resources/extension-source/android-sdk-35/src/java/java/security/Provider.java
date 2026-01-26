package java.security;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class Provider extends Properties {
	protected Provider(final String name, final double version, final String info) {
		throw new RuntimeException("Stub!");
	}

	public String getName() {
		throw new RuntimeException("Stub!");
	}

	public double getVersion() {
		throw new RuntimeException("Stub!");
	}

	public String getInfo() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void clear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void load(final InputStream inStream) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void putAll(final Map<?, ?> t) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized Set<Map.Entry<Object, Object>> entrySet() {
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
	public synchronized Object put(final Object key, final Object value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized Object putIfAbsent(final Object key, final Object value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized Object remove(final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized boolean remove(final Object key, final Object value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized boolean replace(final Object key, final Object oldValue, final Object newValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized Object replace(final Object key, final Object value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void replaceAll(final BiFunction<? super Object, ? super Object, ?> function) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized Object compute(final Object key,
			final BiFunction<? super Object, ? super Object, ?> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized Object computeIfAbsent(final Object key, final Function<? super Object, ?> mappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized Object computeIfPresent(final Object key,
			final BiFunction<? super Object, ? super Object, ?> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized Object merge(final Object key, final Object value,
			final BiFunction<? super Object, ? super Object, ?> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Object get(final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized Object getOrDefault(final Object key, final Object defaultValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void forEach(final BiConsumer<? super Object, ? super Object> action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Enumeration<Object> keys() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Enumeration<Object> elements() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String getProperty(final String key) {
		throw new RuntimeException("Stub!");
	}

	public synchronized Service getService(final String type, final String algorithm) {
		throw new RuntimeException("Stub!");
	}

	public synchronized Set<Service> getServices() {
		throw new RuntimeException("Stub!");
	}

	protected synchronized void putService(final Service s) {
		throw new RuntimeException("Stub!");
	}

	protected synchronized void removeService(final Service s) {
		throw new RuntimeException("Stub!");
	}

	public static class Service {
		public Service(final Provider provider, final String type, final String algorithm, final String className,
				final List<String> aliases, final Map<String, String> attributes) {
			throw new RuntimeException("Stub!");
		}

		public final String getType() {
			throw new RuntimeException("Stub!");
		}

		public final String getAlgorithm() {
			throw new RuntimeException("Stub!");
		}

		public final Provider getProvider() {
			throw new RuntimeException("Stub!");
		}

		public final String getClassName() {
			throw new RuntimeException("Stub!");
		}

		public final String getAttribute(final String name) {
			throw new RuntimeException("Stub!");
		}

		public Object newInstance(final Object constructorParameter) throws NoSuchAlgorithmException {
			throw new RuntimeException("Stub!");
		}

		public boolean supportsParameter(final Object parameter) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public String toString() {
			throw new RuntimeException("Stub!");
		}
	}
}
