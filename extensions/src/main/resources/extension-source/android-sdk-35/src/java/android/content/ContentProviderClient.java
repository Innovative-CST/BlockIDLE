package android.content;

import java.util.ArrayList;
import android.content.res.AssetFileDescriptor;
import java.io.FileNotFoundException;
import android.os.ParcelFileDescriptor;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.database.Cursor;
import android.net.Uri;

public class ContentProviderClient implements AutoCloseable
{
    ContentProviderClient() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Cursor query(@NonNull final Uri url, @Nullable final String[] projection, @Nullable final String selection, @Nullable final String[] selectionArgs, @Nullable final String sortOrder) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Cursor query(@NonNull final Uri uri, @Nullable final String[] projection, @Nullable final String selection, @Nullable final String[] selectionArgs, @Nullable final String sortOrder, @Nullable final CancellationSignal cancellationSignal) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Cursor query(@NonNull final Uri uri, @Nullable final String[] projection, final Bundle queryArgs, @Nullable final CancellationSignal cancellationSignal) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getType(@NonNull final Uri url) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String[] getStreamTypes(@NonNull final Uri url, @NonNull final String mimeTypeFilter) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final Uri canonicalize(@NonNull final Uri url) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final Uri uncanonicalize(@NonNull final Uri url) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean refresh(final Uri url, @Nullable final Bundle extras, @Nullable final CancellationSignal cancellationSignal) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri insert(@NonNull final Uri url, @Nullable final ContentValues initialValues) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri insert(@NonNull final Uri url, @Nullable final ContentValues initialValues, @Nullable final Bundle extras) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    public int bulkInsert(@NonNull final Uri url, @NonNull final ContentValues[] initialValues) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    public int delete(@NonNull final Uri url, @Nullable final String selection, @Nullable final String[] selectionArgs) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    public int delete(@NonNull final Uri url, @Nullable final Bundle extras) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    public int update(@NonNull final Uri url, @Nullable final ContentValues values, @Nullable final String selection, @Nullable final String[] selectionArgs) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    public int update(@NonNull final Uri url, @Nullable final ContentValues values, @Nullable final Bundle extras) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ParcelFileDescriptor openFile(@NonNull final Uri url, @NonNull final String mode) throws FileNotFoundException, RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ParcelFileDescriptor openFile(@NonNull final Uri url, @NonNull final String mode, @Nullable final CancellationSignal signal) throws FileNotFoundException, RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AssetFileDescriptor openAssetFile(@NonNull final Uri url, @NonNull final String mode) throws FileNotFoundException, RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AssetFileDescriptor openAssetFile(@NonNull final Uri url, @NonNull final String mode, @Nullable final CancellationSignal signal) throws FileNotFoundException, RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final AssetFileDescriptor openTypedAssetFileDescriptor(@NonNull final Uri uri, @NonNull final String mimeType, @Nullable final Bundle opts) throws FileNotFoundException, RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final AssetFileDescriptor openTypedAssetFileDescriptor(@NonNull final Uri uri, @NonNull final String mimeType, @Nullable final Bundle opts, @Nullable final CancellationSignal signal) throws FileNotFoundException, RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final AssetFileDescriptor openTypedAssetFile(@NonNull final Uri uri, @NonNull final String mimeTypeFilter, @Nullable final Bundle opts, @Nullable final CancellationSignal signal) throws FileNotFoundException, RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ContentProviderResult[] applyBatch(@NonNull final ArrayList<ContentProviderOperation> operations) throws OperationApplicationException, RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ContentProviderResult[] applyBatch(@NonNull final String authority, @NonNull final ArrayList<ContentProviderOperation> operations) throws OperationApplicationException, RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle call(@NonNull final String method, @Nullable final String arg, @Nullable final Bundle extras) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle call(@NonNull final String authority, @NonNull final String method, @Nullable final String arg, @Nullable final Bundle extras) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean release() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ContentProvider getLocalContentProvider() {
        throw new RuntimeException("Stub!");
    }
}
