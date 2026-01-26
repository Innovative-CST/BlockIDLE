package java.util.prefs;

import java.io.IOException;
import java.io.OutputStream;

public abstract class AbstractPreferences extends Preferences {
	protected final Object lock;
	protected boolean newNode;

	protected AbstractPreferences(final AbstractPreferences parent, final String name) {
		this.lock = null;
		this.newNode = false;
		throw new RuntimeException("Stub!");
	}

	@Override
	public void put(final String key, final String value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String get(final String key, final String def) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void remove(final String key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void clear() throws BackingStoreException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void putInt(final String key, final int value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getInt(final String key, final int def) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void putLong(final String key, final long value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long getLong(final String key, final long def) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void putBoolean(final String key, final boolean value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean getBoolean(final String key, final boolean def) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void putFloat(final String key, final float value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public float getFloat(final String key, final float def) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void putDouble(final String key, final double value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public double getDouble(final String key, final double def) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void putByteArray(final String key, final byte[] value) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public byte[] getByteArray(final String key, final byte[] def) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String[] keys() throws BackingStoreException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String[] childrenNames() throws BackingStoreException {
		throw new RuntimeException("Stub!");
	}

	protected final AbstractPreferences[] cachedChildren() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Preferences parent() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Preferences node(final String path) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean nodeExists(final String path) throws BackingStoreException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void removeNode() throws BackingStoreException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String name() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String absolutePath() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isUserNode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void addPreferenceChangeListener(final PreferenceChangeListener pcl) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void removePreferenceChangeListener(final PreferenceChangeListener pcl) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void addNodeChangeListener(final NodeChangeListener ncl) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void removeNodeChangeListener(final NodeChangeListener ncl) {
		throw new RuntimeException("Stub!");
	}

	protected abstract void putSpi(final String p0, final String p1);

	protected abstract String getSpi(final String p0);

	protected abstract void removeSpi(final String p0);

	protected abstract void removeNodeSpi() throws BackingStoreException;

	protected abstract String[] keysSpi() throws BackingStoreException;

	protected abstract String[] childrenNamesSpi() throws BackingStoreException;

	protected AbstractPreferences getChild(final String nodeName) throws BackingStoreException {
		throw new RuntimeException("Stub!");
	}

	protected abstract AbstractPreferences childSpi(final String p0);

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void sync() throws BackingStoreException {
		throw new RuntimeException("Stub!");
	}

	protected abstract void syncSpi() throws BackingStoreException;

	@Override
	public void flush() throws BackingStoreException {
		throw new RuntimeException("Stub!");
	}

	protected abstract void flushSpi() throws BackingStoreException;

	protected boolean isRemoved() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void exportNode(final OutputStream os) throws BackingStoreException, IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void exportSubtree(final OutputStream os) throws BackingStoreException, IOException {
		throw new RuntimeException("Stub!");
	}
}
