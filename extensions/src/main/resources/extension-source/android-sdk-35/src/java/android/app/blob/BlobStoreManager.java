package android.app.blob;

import java.util.function.Consumer;
import java.util.concurrent.Executor;
import java.io.Closeable;
import java.util.List;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

public class BlobStoreManager
{
    BlobStoreManager() {
        throw new RuntimeException("Stub!");
    }
    
    public long createSession(@NonNull final BlobHandle blobHandle) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Session openSession(final long sessionId) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void abandonSession(final long sessionId) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ParcelFileDescriptor openBlob(@NonNull final BlobHandle blobHandle) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void acquireLease(@NonNull final BlobHandle blobHandle, final int descriptionResId, final long leaseExpiryTimeMillis) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void acquireLease(@NonNull final BlobHandle blobHandle, @NonNull final CharSequence description, final long leaseExpiryTimeMillis) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void acquireLease(@NonNull final BlobHandle blobHandle, final int descriptionResId) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void acquireLease(@NonNull final BlobHandle blobHandle, @NonNull final CharSequence description) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void releaseLease(@NonNull final BlobHandle blobHandle) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public long getRemainingLeaseQuotaBytes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<BlobHandle> getLeasedBlobs() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static class Session implements Closeable
    {
        Session() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ParcelFileDescriptor openWrite(final long offsetBytes, final long lengthBytes) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ParcelFileDescriptor openRead() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        public long getSize() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void close() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        public void abandon() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        public void allowPackageAccess(@NonNull final String packageName, @NonNull final byte[] certificate) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isPackageAccessAllowed(@NonNull final String packageName, @NonNull final byte[] certificate) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        public void allowSameSignatureAccess() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isSameSignatureAccessAllowed() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        public void allowPublicAccess() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isPublicAccessAllowed() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        public void commit(@NonNull final Executor executor, @NonNull final Consumer<Integer> resultCallback) throws IOException {
            throw new RuntimeException("Stub!");
        }
    }
}
