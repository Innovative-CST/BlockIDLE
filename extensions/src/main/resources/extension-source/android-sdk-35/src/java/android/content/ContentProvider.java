package android.content;

import java.io.PrintWriter;
import java.io.FileDescriptor;
import java.util.ArrayList;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import java.io.FileNotFoundException;
import android.os.ParcelFileDescriptor;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.database.Cursor;
import android.net.Uri;
import android.content.res.Configuration;
import android.content.pm.PathPermission;

public abstract class ContentProvider implements ComponentCallbacks2
{
    public ContentProvider() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final Context getContext() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final Context requireContext() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final String getCallingPackage() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final AttributionSource getCallingAttributionSource() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final String getCallingAttributionTag() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final String getCallingPackageUnchecked() {
        throw new RuntimeException("Stub!");
    }
    
    public void onCallingPackageChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final CallingIdentity clearCallingIdentity() {
        throw new RuntimeException("Stub!");
    }
    
    public final void restoreCallingIdentity(@NonNull final CallingIdentity identity) {
        throw new RuntimeException("Stub!");
    }
    
    protected final void setReadPermission(@Nullable final String permission) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final String getReadPermission() {
        throw new RuntimeException("Stub!");
    }
    
    protected final void setWritePermission(@Nullable final String permission) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final String getWritePermission() {
        throw new RuntimeException("Stub!");
    }
    
    protected final void setPathPermissions(@Nullable final PathPermission[] permissions) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final PathPermission[] getPathPermissions() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract boolean onCreate();
    
    @Override
    public void onConfigurationChanged(final Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onLowMemory() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onTrimMemory(final int level) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public abstract Cursor query(@NonNull final Uri p0, @Nullable final String[] p1, @Nullable final String p2, @Nullable final String[] p3, @Nullable final String p4);
    
    @Nullable
    public Cursor query(@NonNull final Uri uri, @Nullable final String[] projection, @Nullable final String selection, @Nullable final String[] selectionArgs, @Nullable final String sortOrder, @Nullable final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Cursor query(@NonNull final Uri uri, @Nullable final String[] projection, @Nullable final Bundle queryArgs, @Nullable final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public abstract String getType(@NonNull final Uri p0);
    
    @Nullable
    public String getTypeAnonymous(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri canonicalize(@NonNull final Uri url) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri uncanonicalize(@NonNull final Uri url) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean refresh(final Uri uri, @Nullable final Bundle extras, @Nullable final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public abstract Uri insert(@NonNull final Uri p0, @Nullable final ContentValues p1);
    
    @Nullable
    public Uri insert(@NonNull final Uri uri, @Nullable final ContentValues values, @Nullable final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public int bulkInsert(@NonNull final Uri uri, @NonNull final ContentValues[] values) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int delete(@NonNull final Uri p0, @Nullable final String p1, @Nullable final String[] p2);
    
    public int delete(@NonNull final Uri uri, @Nullable final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int update(@NonNull final Uri p0, @Nullable final ContentValues p1, @Nullable final String p2, @Nullable final String[] p3);
    
    public int update(@NonNull final Uri uri, @Nullable final ContentValues values, @Nullable final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ParcelFileDescriptor openFile(@NonNull final Uri uri, @NonNull final String mode) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ParcelFileDescriptor openFile(@NonNull final Uri uri, @NonNull final String mode, @Nullable final CancellationSignal signal) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AssetFileDescriptor openAssetFile(@NonNull final Uri uri, @NonNull final String mode) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AssetFileDescriptor openAssetFile(@NonNull final Uri uri, @NonNull final String mode, @Nullable final CancellationSignal signal) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    protected final ParcelFileDescriptor openFileHelper(@NonNull final Uri uri, @NonNull final String mode) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String[] getStreamTypes(@NonNull final Uri uri, @NonNull final String mimeTypeFilter) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AssetFileDescriptor openTypedAssetFile(@NonNull final Uri uri, @NonNull final String mimeTypeFilter, @Nullable final Bundle opts) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AssetFileDescriptor openTypedAssetFile(@NonNull final Uri uri, @NonNull final String mimeTypeFilter, @Nullable final Bundle opts, @Nullable final CancellationSignal signal) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public <T> ParcelFileDescriptor openPipeHelper(@NonNull final Uri uri, @NonNull final String mimeType, @Nullable final Bundle opts, @Nullable final T args, @NonNull final PipeDataWriter<T> func) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean isTemporary() {
        throw new RuntimeException("Stub!");
    }
    
    public void attachInfo(final Context context, final ProviderInfo info) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ContentProviderResult[] applyBatch(@NonNull final String authority, @NonNull final ArrayList<ContentProviderOperation> operations) throws OperationApplicationException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ContentProviderResult[] applyBatch(@NonNull final ArrayList<ContentProviderOperation> operations) throws OperationApplicationException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle call(@NonNull final String authority, @NonNull final String method, @Nullable final String arg, @Nullable final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle call(@NonNull final String method, @Nullable final String arg, @Nullable final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public void shutdown() {
        throw new RuntimeException("Stub!");
    }
    
    public void dump(final FileDescriptor fd, final PrintWriter writer, final String[] args) {
        throw new RuntimeException("Stub!");
    }
    
    public final class CallingIdentity
    {
        CallingIdentity() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface PipeDataWriter<T>
    {
        void writeDataToPipe(@NonNull final ParcelFileDescriptor p0, @NonNull final Uri p1, @NonNull final String p2, @Nullable final Bundle p3, @Nullable final T p4);
    }
}
