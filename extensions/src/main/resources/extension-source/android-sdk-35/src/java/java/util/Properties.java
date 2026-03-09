package java.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Properties extends Hashtable<Object, Object> {
	protected volatile Properties defaults;

	public Properties() {
		throw new RuntimeException("Stub!");
	}

	public Properties(final int initialCapacity) {
		throw new RuntimeException("Stub!");
	}

	public Properties(final Properties defaults) {
		throw new RuntimeException("Stub!");
	}

	public synchronized Object setProperty(final String key, final String value) {
		throw new RuntimeException("Stub!");
	}

	public synchronized void load(final Reader reader) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public synchronized void load(final InputStream inStream) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void save(final OutputStream out, final String comments) {
		throw new RuntimeException("Stub!");
	}

	public void store(final Writer writer, final String comments) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void store(final OutputStream out, final String comments) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public synchronized void loadFromXML(final InputStream in) throws IOException, InvalidPropertiesFormatException {
		throw new RuntimeException("Stub!");
	}

	public void storeToXML(final OutputStream os, final String comment) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void storeToXML(final OutputStream os, final String comment, final String encoding) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void storeToXML(final OutputStream os, final String comment, final Charset charset) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public String getProperty(final String key) {
		throw new RuntimeException("Stub!");
	}

	public String getProperty(final String key, final String defaultValue) {
		throw new RuntimeException("Stub!");
	}

	public Enumeration<?> propertyNames() {
		throw new RuntimeException("Stub!");
	}

	public Set<String> stringPropertyNames() {
		throw new RuntimeException("Stub!");
	}

	public void list(final PrintStream out) {
		throw new RuntimeException("Stub!");
	}

	public void list(final PrintWriter out) {
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
	public Enumeration<Object> keys() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Enumeration<Object> elements() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean contains(final Object value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsValue(final Object value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsKey(final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Object get(final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized Object put(final Object key, final Object value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized Object remove(final Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void putAll(final Map<?, ?> t) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void clear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized String toString() {
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
	public Set<Map.Entry<Object, Object>> entrySet() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized boolean equals(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Object getOrDefault(final Object key, final Object defaultValue) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void forEach(final BiConsumer<? super Object, ? super Object> action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void replaceAll(final BiFunction<? super Object, ? super Object, ?> function) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized Object putIfAbsent(final Object key, final Object value) {
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
	public synchronized Object computeIfAbsent(final Object key, final Function<? super Object, ?> mappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized Object computeIfPresent(final Object key,
			final BiFunction<? super Object, ? super Object, ?> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized Object compute(final Object key,
			final BiFunction<? super Object, ? super Object, ?> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized Object merge(final Object key, final Object value,
			final BiFunction<? super Object, ? super Object, ?> remappingFunction) {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected void rehash() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized Object clone() {
		throw new RuntimeException("Stub!");
	}
}
