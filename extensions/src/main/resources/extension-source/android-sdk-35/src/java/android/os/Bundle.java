package android.os;

import java.io.Serializable;
import android.util.SparseArray;
import java.util.ArrayList;
import android.util.SizeF;
import android.util.Size;

public final class Bundle extends BaseBundle implements Cloneable, Parcelable
{
    @NonNull
    public static final Creator<Bundle> CREATOR;
    public static final Bundle EMPTY;
    
    public Bundle() {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle(final ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle(final int capacity) {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle(final Bundle b) {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle(final PersistableBundle b) {
        throw new RuntimeException("Stub!");
    }
    
    public void setClassLoader(final ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }
    
    public ClassLoader getClassLoader() {
        throw new RuntimeException("Stub!");
    }
    
    public Object clone() {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle deepCopy() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void clear() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void remove(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public void putAll(final Bundle bundle) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasFileDescriptors() {
        throw new RuntimeException("Stub!");
    }
    
    public void putByte(@Nullable final String key, final byte value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putChar(@Nullable final String key, final char value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putShort(@Nullable final String key, final short value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putFloat(@Nullable final String key, final float value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putCharSequence(@Nullable final String key, @Nullable final CharSequence value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putParcelable(@Nullable final String key, @Nullable final Parcelable value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putSize(@Nullable final String key, @Nullable final Size value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putSizeF(@Nullable final String key, @Nullable final SizeF value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putParcelableArray(@Nullable final String key, @Nullable final Parcelable[] value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putParcelableArrayList(@Nullable final String key, @Nullable final ArrayList<? extends Parcelable> value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putSparseParcelableArray(@Nullable final String key, @Nullable final SparseArray<? extends Parcelable> value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putIntegerArrayList(@Nullable final String key, @Nullable final ArrayList<Integer> value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putStringArrayList(@Nullable final String key, @Nullable final ArrayList<String> value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putCharSequenceArrayList(@Nullable final String key, @Nullable final ArrayList<CharSequence> value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putSerializable(@Nullable final String key, @Nullable final Serializable value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putByteArray(@Nullable final String key, @Nullable final byte[] value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putShortArray(@Nullable final String key, @Nullable final short[] value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putCharArray(@Nullable final String key, @Nullable final char[] value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putFloatArray(@Nullable final String key, @Nullable final float[] value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putCharSequenceArray(@Nullable final String key, @Nullable final CharSequence[] value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putBundle(@Nullable final String key, @Nullable final Bundle value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putBinder(@Nullable final String key, @Nullable final IBinder value) {
        throw new RuntimeException("Stub!");
    }
    
    public byte getByte(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public Byte getByte(final String key, final byte defaultValue) {
        throw new RuntimeException("Stub!");
    }
    
    public char getChar(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public char getChar(final String key, final char defaultValue) {
        throw new RuntimeException("Stub!");
    }
    
    public short getShort(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public short getShort(final String key, final short defaultValue) {
        throw new RuntimeException("Stub!");
    }
    
    public float getFloat(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public float getFloat(final String key, final float defaultValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getCharSequence(@Nullable final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getCharSequence(@Nullable final String key, final CharSequence defaultValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Size getSize(@Nullable final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SizeF getSizeF(@Nullable final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle getBundle(@Nullable final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public <T extends Parcelable> T getParcelable(@Nullable final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T> T getParcelable(@Nullable final String key, @NonNull final Class<T> clazz) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public Parcelable[] getParcelableArray(@Nullable final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T> T[] getParcelableArray(@Nullable final String key, @NonNull final Class<T> clazz) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public <T extends Parcelable> ArrayList<T> getParcelableArrayList(@Nullable final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T> ArrayList<T> getParcelableArrayList(@Nullable final String key, @NonNull final Class<? extends T> clazz) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public <T extends Parcelable> SparseArray<T> getSparseParcelableArray(@Nullable final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T> SparseArray<T> getSparseParcelableArray(@Nullable final String key, @NonNull final Class<? extends T> clazz) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public Serializable getSerializable(@Nullable final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T extends Serializable> T getSerializable(@Nullable final String key, @NonNull final Class<T> clazz) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ArrayList<Integer> getIntegerArrayList(@Nullable final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ArrayList<String> getStringArrayList(@Nullable final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ArrayList<CharSequence> getCharSequenceArrayList(@Nullable final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getByteArray(@Nullable final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public short[] getShortArray(@Nullable final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public char[] getCharArray(@Nullable final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public float[] getFloatArray(@Nullable final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence[] getCharSequenceArray(@Nullable final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public IBinder getBinder(@Nullable final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void readFromParcel(final Parcel parcel) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
        EMPTY = null;
    }
}
