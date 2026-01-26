package android.os;

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class PersistableBundle extends BaseBundle implements Cloneable, Parcelable
{
    @NonNull
    public static final Creator<PersistableBundle> CREATOR;
    public static final PersistableBundle EMPTY;
    
    public PersistableBundle() {
        throw new RuntimeException("Stub!");
    }
    
    public PersistableBundle(final int capacity) {
        throw new RuntimeException("Stub!");
    }
    
    public PersistableBundle(final PersistableBundle b) {
        throw new RuntimeException("Stub!");
    }
    
    public Object clone() {
        throw new RuntimeException("Stub!");
    }
    
    public PersistableBundle deepCopy() {
        throw new RuntimeException("Stub!");
    }
    
    public void putPersistableBundle(@Nullable final String key, @Nullable final PersistableBundle value) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PersistableBundle getPersistableBundle(@Nullable final String key) {
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
    
    @Override
    public synchronized String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public void writeToStream(@NonNull final OutputStream outputStream) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static PersistableBundle readFromStream(@NonNull final InputStream inputStream) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
        EMPTY = null;
    }
}
