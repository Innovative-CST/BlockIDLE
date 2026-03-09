package android.os;

import java.nio.ByteBuffer;
import android.system.ErrnoException;
import java.io.Closeable;

public final class SharedMemory implements Parcelable, Closeable
{
    @NonNull
    public static final Creator<SharedMemory> CREATOR;
    
    SharedMemory() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static SharedMemory create(@Nullable final String name, final int size) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static SharedMemory fromFileDescriptor(@NonNull final ParcelFileDescriptor fd) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setProtect(final int prot) {
        throw new RuntimeException("Stub!");
    }
    
    public int getSize() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ByteBuffer mapReadWrite() throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ByteBuffer mapReadOnly() throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ByteBuffer map(final int prot, final int offset, final int length) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void unmap(@NonNull final ByteBuffer buffer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
