package android.os;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.Serializable;
import java.util.function.Function;
import java.util.function.IntFunction;
import android.util.SparseBooleanArray;
import android.util.SparseArray;
import java.util.List;
import android.util.SizeF;
import android.util.Size;
import android.util.ArrayMap;
import java.util.Map;
import java.io.FileDescriptor;

public final class Parcel
{
    public static final Parcelable.Creator<String> STRING_CREATOR;
    
    Parcel() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Parcel obtain() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Parcel obtain(@NonNull final IBinder binder) {
        throw new RuntimeException("Stub!");
    }
    
    public void recycle() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPropagateAllowBlocking() {
        throw new RuntimeException("Stub!");
    }
    
    public int dataSize() {
        throw new RuntimeException("Stub!");
    }
    
    public int dataAvail() {
        throw new RuntimeException("Stub!");
    }
    
    public int dataPosition() {
        throw new RuntimeException("Stub!");
    }
    
    public int dataCapacity() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSize(final int size) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataPosition(final int pos) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataCapacity(final int size) {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] marshall() {
        throw new RuntimeException("Stub!");
    }
    
    public void unmarshall(@NonNull final byte[] data, final int offset, final int length) {
        throw new RuntimeException("Stub!");
    }
    
    public void appendFrom(final Parcel parcel, final int offset, final int length) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasFileDescriptors() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasFileDescriptors(final int offset, final int length) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeInterfaceToken(@NonNull final String interfaceName) {
        throw new RuntimeException("Stub!");
    }
    
    public void enforceInterface(@NonNull final String interfaceName) {
        throw new RuntimeException("Stub!");
    }
    
    public void enforceNoDataAvail() {
        throw new RuntimeException("Stub!");
    }
    
    public void writeByteArray(@Nullable final byte[] b) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeByteArray(@Nullable final byte[] b, final int offset, final int len) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeBlob(@Nullable final byte[] b) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeBlob(@Nullable final byte[] b, final int offset, final int len) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeInt(final int val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeLong(final long val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeFloat(final float val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeDouble(final double val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeString(@Nullable final String val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeBoolean(final boolean val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeStrongBinder(final IBinder val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeStrongInterface(final IInterface val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeFileDescriptor(@NonNull final FileDescriptor val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeByte(final byte val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeMap(@Nullable final Map val) {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends Parcelable> void writeTypedArrayMap(@Nullable final ArrayMap<String, T> val, final int parcelableFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeBundle(@Nullable final Bundle val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writePersistableBundle(@Nullable final PersistableBundle val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeSize(@NonNull final Size val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeSizeF(@NonNull final SizeF val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeList(@Nullable final List val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeArray(@Nullable final Object[] val) {
        throw new RuntimeException("Stub!");
    }
    
    public <T> void writeSparseArray(@Nullable final SparseArray<T> val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeSparseBooleanArray(@Nullable final SparseBooleanArray val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeBooleanArray(@Nullable final boolean[] val) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public boolean[] createBooleanArray() {
        throw new RuntimeException("Stub!");
    }
    
    public void readBooleanArray(@NonNull final boolean[] val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeCharArray(@Nullable final char[] val) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public char[] createCharArray() {
        throw new RuntimeException("Stub!");
    }
    
    public void readCharArray(@NonNull final char[] val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeIntArray(@Nullable final int[] val) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public int[] createIntArray() {
        throw new RuntimeException("Stub!");
    }
    
    public void readIntArray(@NonNull final int[] val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeLongArray(@Nullable final long[] val) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public long[] createLongArray() {
        throw new RuntimeException("Stub!");
    }
    
    public void readLongArray(@NonNull final long[] val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeFloatArray(@Nullable final float[] val) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public float[] createFloatArray() {
        throw new RuntimeException("Stub!");
    }
    
    public void readFloatArray(@NonNull final float[] val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeDoubleArray(@Nullable final double[] val) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public double[] createDoubleArray() {
        throw new RuntimeException("Stub!");
    }
    
    public void readDoubleArray(@NonNull final double[] val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeStringArray(@Nullable final String[] val) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String[] createStringArray() {
        throw new RuntimeException("Stub!");
    }
    
    public void readStringArray(@NonNull final String[] val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeBinderArray(@Nullable final IBinder[] val) {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends IInterface> void writeInterfaceArray(@Nullable final T[] val) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public IBinder[] createBinderArray() {
        throw new RuntimeException("Stub!");
    }
    
    public void readBinderArray(@NonNull final IBinder[] val) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T extends IInterface> T[] createInterfaceArray(@NonNull final IntFunction<T[]> newArray, @NonNull final Function<IBinder, T> asInterface) {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends IInterface> void readInterfaceArray(@NonNull final T[] val, @NonNull final Function<IBinder, T> asInterface) {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends Parcelable> void writeTypedList(@Nullable final List<T> val) {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends Parcelable> void writeTypedSparseArray(@Nullable final SparseArray<T> val, final int parcelableFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends Parcelable> void writeTypedList(@Nullable final List<T> val, final int parcelableFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeStringList(@Nullable final List<String> val) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeBinderList(@Nullable final List<IBinder> val) {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends IInterface> void writeInterfaceList(@Nullable final List<T> val) {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends Parcelable> void writeParcelableList(@Nullable final List<T> val, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends Parcelable> void writeTypedArray(@Nullable final T[] val, final int parcelableFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends Parcelable> void writeTypedObject(@Nullable final T val, final int parcelableFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public <T> void writeFixedArray(@Nullable final T val, final int parcelableFlags, @NonNull final int... dimensions) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeValue(@Nullable final Object v) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeParcelable(@Nullable final Parcelable p, final int parcelableFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeParcelableCreator(@NonNull final Parcelable p) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeSerializable(@Nullable final Serializable s) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeException(@NonNull final Exception e) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeNoException() {
        throw new RuntimeException("Stub!");
    }
    
    public void readException() {
        throw new RuntimeException("Stub!");
    }
    
    public void readException(final int code, final String msg) {
        throw new RuntimeException("Stub!");
    }
    
    public int readInt() {
        throw new RuntimeException("Stub!");
    }
    
    public long readLong() {
        throw new RuntimeException("Stub!");
    }
    
    public float readFloat() {
        throw new RuntimeException("Stub!");
    }
    
    public double readDouble() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String readString() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean readBoolean() {
        throw new RuntimeException("Stub!");
    }
    
    public IBinder readStrongBinder() {
        throw new RuntimeException("Stub!");
    }
    
    public ParcelFileDescriptor readFileDescriptor() {
        throw new RuntimeException("Stub!");
    }
    
    public byte readByte() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void readMap(@NonNull final Map outVal, @Nullable final ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }
    
    public <K, V> void readMap(@NonNull final Map<? super K, ? super V> outVal, @Nullable final ClassLoader loader, @NonNull final Class<K> clazzKey, @NonNull final Class<V> clazzValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void readList(@NonNull final List outVal, @Nullable final ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }
    
    public <T> void readList(@NonNull final List<? super T> outVal, @Nullable final ClassLoader loader, @NonNull final Class<T> clazz) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public HashMap readHashMap(@Nullable final ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <K, V> HashMap<K, V> readHashMap(@Nullable final ClassLoader loader, @NonNull final Class<? extends K> clazzKey, @NonNull final Class<? extends V> clazzValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle readBundle() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle readBundle(@Nullable final ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PersistableBundle readPersistableBundle() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PersistableBundle readPersistableBundle(@Nullable final ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Size readSize() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SizeF readSizeF() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] createByteArray() {
        throw new RuntimeException("Stub!");
    }
    
    public void readByteArray(@NonNull final byte[] val) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] readBlob() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public ArrayList readArrayList(@Nullable final ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T> ArrayList<T> readArrayList(@Nullable final ClassLoader loader, @NonNull final Class<? extends T> clazz) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public Object[] readArray(@Nullable final ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T> T[] readArray(@Nullable final ClassLoader loader, @NonNull final Class<T> clazz) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public <T> SparseArray<T> readSparseArray(@Nullable final ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T> SparseArray<T> readSparseArray(@Nullable final ClassLoader loader, @NonNull final Class<? extends T> clazz) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SparseBooleanArray readSparseBooleanArray() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T> ArrayList<T> createTypedArrayList(@NonNull final Parcelable.Creator<T> c) {
        throw new RuntimeException("Stub!");
    }
    
    public <T> void readTypedList(@NonNull final List<T> list, @NonNull final Parcelable.Creator<T> c) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T extends Parcelable> SparseArray<T> createTypedSparseArray(@NonNull final Parcelable.Creator<T> creator) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T extends Parcelable> ArrayMap<String, T> createTypedArrayMap(@NonNull final Parcelable.Creator<T> creator) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ArrayList<String> createStringArrayList() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ArrayList<IBinder> createBinderArrayList() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T extends IInterface> ArrayList<T> createInterfaceArrayList(@NonNull final Function<IBinder, T> asInterface) {
        throw new RuntimeException("Stub!");
    }
    
    public void readStringList(@NonNull final List<String> list) {
        throw new RuntimeException("Stub!");
    }
    
    public void readBinderList(@NonNull final List<IBinder> list) {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends IInterface> void readInterfaceList(@NonNull final List<T> list, @NonNull final Function<IBinder, T> asInterface) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public <T extends Parcelable> List<T> readParcelableList(@NonNull final List<T> list, @Nullable final ClassLoader cl) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public <T> List<T> readParcelableList(@NonNull final List<T> list, @Nullable final ClassLoader cl, @NonNull final Class<? extends T> clazz) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T> T[] createTypedArray(@NonNull final Parcelable.Creator<T> c) {
        throw new RuntimeException("Stub!");
    }
    
    public <T> void readTypedArray(@NonNull final T[] val, @NonNull final Parcelable.Creator<T> c) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T> T readTypedObject(@NonNull final Parcelable.Creator<T> c) {
        throw new RuntimeException("Stub!");
    }
    
    public <T> void readFixedArray(@NonNull final T val) {
        throw new RuntimeException("Stub!");
    }
    
    public <T, S extends IInterface> void readFixedArray(@NonNull final T val, @NonNull final Function<IBinder, S> asInterface) {
        throw new RuntimeException("Stub!");
    }
    
    public <T, S extends Parcelable> void readFixedArray(@NonNull final T val, @NonNull final Parcelable.Creator<S> c) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T> T createFixedArray(@NonNull final Class<T> cls, @NonNull final int... dimensions) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T, S extends IInterface> T createFixedArray(@NonNull final Class<T> cls, @NonNull final Function<IBinder, S> asInterface, @NonNull final int... dimensions) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T, S extends Parcelable> T createFixedArray(@NonNull final Class<T> cls, @NonNull final Parcelable.Creator<S> c, @NonNull final int... dimensions) {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends Parcelable> void writeParcelableArray(@Nullable final T[] value, final int parcelableFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Object readValue(@Nullable final ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public <T extends Parcelable> T readParcelable(@Nullable final ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T> T readParcelable(@Nullable final ClassLoader loader, @NonNull final Class<T> clazz) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public Parcelable.Creator<?> readParcelableCreator(@Nullable final ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T> Parcelable.Creator<T> readParcelableCreator(@Nullable final ClassLoader loader, @NonNull final Class<T> clazz) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public Parcelable[] readParcelableArray(@Nullable final ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T> T[] readParcelableArray(@Nullable final ClassLoader loader, @NonNull final Class<T> clazz) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public Serializable readSerializable() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public <T> T readSerializable(@Nullable final ClassLoader loader, @NonNull final Class<T> clazz) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    static {
        STRING_CREATOR = null;
    }
}
