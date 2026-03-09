package java.util.prefs;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class Preferences {
	public static final int MAX_KEY_LENGTH = 80;
	public static final int MAX_NAME_LENGTH = 80;
	public static final int MAX_VALUE_LENGTH = 8192;

	protected Preferences() {
		throw new RuntimeException("Stub!");
	}

	public static Preferences userNodeForPackage(final Class<?> c) {
		throw new RuntimeException("Stub!");
	}

	public static Preferences systemNodeForPackage(final Class<?> c) {
		throw new RuntimeException("Stub!");
	}

	public static Preferences userRoot() {
		throw new RuntimeException("Stub!");
	}

	public static Preferences systemRoot() {
		throw new RuntimeException("Stub!");
	}

	public abstract void put(final String p0, final String p1);

	public abstract String get(final String p0, final String p1);

	public abstract void remove(final String p0);

	public abstract void clear() throws BackingStoreException;

	public abstract void putInt(final String p0, final int p1);

	public abstract int getInt(final String p0, final int p1);

	public abstract void putLong(final String p0, final long p1);

	public abstract long getLong(final String p0, final long p1);

	public abstract void putBoolean(final String p0, final boolean p1);

	public abstract boolean getBoolean(final String p0, final boolean p1);

	public abstract void putFloat(final String p0, final float p1);

	public abstract float getFloat(final String p0, final float p1);

	public abstract void putDouble(final String p0, final double p1);

	public abstract double getDouble(final String p0, final double p1);

	public abstract void putByteArray(final String p0, final byte[] p1);

	public abstract byte[] getByteArray(final String p0, final byte[] p1);

	public abstract String[] keys() throws BackingStoreException;

	public abstract String[] childrenNames() throws BackingStoreException;

	public abstract Preferences parent();

	public abstract Preferences node(final String p0);

	public abstract boolean nodeExists(final String p0) throws BackingStoreException;

	public abstract void removeNode() throws BackingStoreException;

	public abstract String name();

	public abstract String absolutePath();

	public abstract boolean isUserNode();

	@Override
	public abstract String toString();

	public abstract void flush() throws BackingStoreException;

	public abstract void sync() throws BackingStoreException;

	public abstract void addPreferenceChangeListener(final PreferenceChangeListener p0);

	public abstract void removePreferenceChangeListener(final PreferenceChangeListener p0);

	public abstract void addNodeChangeListener(final NodeChangeListener p0);

	public abstract void removeNodeChangeListener(final NodeChangeListener p0);

	public abstract void exportNode(final OutputStream p0) throws BackingStoreException, IOException;

	public abstract void exportSubtree(final OutputStream p0) throws BackingStoreException, IOException;

	public static void importPreferences(final InputStream is) throws IOException, InvalidPreferencesFormatException {
		throw new RuntimeException("Stub!");
	}
}
