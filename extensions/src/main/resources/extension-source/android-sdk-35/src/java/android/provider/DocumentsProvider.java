package android.provider;

import android.content.ContentValues;
import android.net.Uri;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.os.ParcelFileDescriptor;
import android.os.CancellationSignal;
import android.database.Cursor;
import android.content.IntentSender;
import android.os.Bundle;
import java.io.FileNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.Context;
import android.content.ContentProvider;

public abstract class DocumentsProvider extends ContentProvider
{
    public DocumentsProvider() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void attachInfo(final Context context, final ProviderInfo info) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isChildDocument(final String parentDocumentId, final String documentId) {
        throw new RuntimeException("Stub!");
    }
    
    public String createDocument(final String parentDocumentId, final String mimeType, final String displayName) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public String renameDocument(final String documentId, final String displayName) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public void deleteDocument(final String documentId) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public String copyDocument(final String sourceDocumentId, final String targetParentDocumentId) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public String moveDocument(final String sourceDocumentId, final String sourceParentDocumentId, final String targetParentDocumentId) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public void removeDocument(final String documentId, final String parentDocumentId) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public DocumentsContract.Path findDocumentPath(@Nullable final String parentDocumentId, final String childDocumentId) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public IntentSender createWebLinkIntent(final String documentId, @Nullable final Bundle options) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Cursor queryRoots(final String[] p0) throws FileNotFoundException;
    
    public Cursor queryRecentDocuments(final String rootId, final String[] projection) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Cursor queryRecentDocuments(@NonNull final String rootId, @Nullable final String[] projection, @Nullable final Bundle queryArgs, @Nullable final CancellationSignal signal) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Cursor queryDocument(final String p0, final String[] p1) throws FileNotFoundException;
    
    public abstract Cursor queryChildDocuments(final String p0, final String[] p1, final String p2) throws FileNotFoundException;
    
    public Cursor queryChildDocuments(final String parentDocumentId, @Nullable final String[] projection, @Nullable final Bundle queryArgs) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public Cursor querySearchDocuments(final String rootId, final String query, final String[] projection) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Cursor querySearchDocuments(@NonNull final String rootId, @Nullable final String[] projection, @NonNull final Bundle queryArgs) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public void ejectRoot(final String rootId) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle getDocumentMetadata(@NonNull final String documentId) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public String getDocumentType(final String documentId) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract ParcelFileDescriptor openDocument(final String p0, final String p1, @Nullable final CancellationSignal p2) throws FileNotFoundException;
    
    public AssetFileDescriptor openDocumentThumbnail(final String documentId, final Point sizeHint, final CancellationSignal signal) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public AssetFileDescriptor openTypedDocument(final String documentId, final String mimeTypeFilter, final Bundle opts, final CancellationSignal signal) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final Cursor query(final Uri uri, final String[] projection, final String selection, final String[] selectionArgs, final String sortOrder) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Cursor query(final Uri uri, final String[] projection, final String selection, final String[] selectionArgs, final String sortOrder, final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final Cursor query(final Uri uri, final String[] projection, final Bundle queryArgs, final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final String getType(final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public final String getTypeAnonymous(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Uri canonicalize(final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final Uri insert(final Uri uri, final ContentValues values) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final int delete(final Uri uri, final String selection, final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final int update(final Uri uri, final ContentValues values, final String selection, final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Bundle call(final String method, final String arg, final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public final void revokeDocumentPermission(final String documentId) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final ParcelFileDescriptor openFile(final Uri uri, final String mode) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final ParcelFileDescriptor openFile(final Uri uri, final String mode, final CancellationSignal signal) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final AssetFileDescriptor openAssetFile(final Uri uri, final String mode) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final AssetFileDescriptor openAssetFile(final Uri uri, final String mode, final CancellationSignal signal) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final AssetFileDescriptor openTypedAssetFile(final Uri uri, final String mimeTypeFilter, final Bundle opts) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final AssetFileDescriptor openTypedAssetFile(final Uri uri, final String mimeTypeFilter, final Bundle opts, final CancellationSignal signal) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getDocumentStreamTypes(final String documentId, final String mimeTypeFilter) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String[] getStreamTypes(final Uri uri, final String mimeTypeFilter) {
        throw new RuntimeException("Stub!");
    }
}
