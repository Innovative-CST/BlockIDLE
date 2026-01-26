package android.content;

import android.graphics.drawable.Icon;
import java.io.IOException;
import android.graphics.Bitmap;
import android.util.Size;
import android.accounts.Account;
import java.util.List;
import java.util.Collection;
import android.database.ContentObserver;
import android.os.RemoteException;
import java.util.ArrayList;
import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import java.io.OutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.database.Cursor;
import android.net.Uri;

public abstract class ContentResolver
{
    public static final String ANY_CURSOR_ITEM_TYPE = "vnd.android.cursor.item/*";
    public static final String CURSOR_DIR_BASE_TYPE = "vnd.android.cursor.dir";
    public static final String CURSOR_ITEM_BASE_TYPE = "vnd.android.cursor.item";
    public static final String EXTRA_HONORED_ARGS = "android.content.extra.HONORED_ARGS";
    public static final String EXTRA_REFRESH_SUPPORTED = "android.content.extra.REFRESH_SUPPORTED";
    public static final String EXTRA_SIZE = "android.content.extra.SIZE";
    public static final String EXTRA_TOTAL_COUNT = "android.content.extra.TOTAL_COUNT";
    public static final int NOTIFY_DELETE = 16;
    public static final int NOTIFY_INSERT = 4;
    public static final int NOTIFY_SKIP_NOTIFY_FOR_DESCENDANTS = 2;
    public static final int NOTIFY_SYNC_TO_NETWORK = 1;
    public static final int NOTIFY_UPDATE = 8;
    public static final String QUERY_ARG_GROUP_COLUMNS = "android:query-arg-group-columns";
    public static final String QUERY_ARG_LIMIT = "android:query-arg-limit";
    public static final String QUERY_ARG_OFFSET = "android:query-arg-offset";
    public static final String QUERY_ARG_SORT_COLLATION = "android:query-arg-sort-collation";
    public static final String QUERY_ARG_SORT_COLUMNS = "android:query-arg-sort-columns";
    public static final String QUERY_ARG_SORT_DIRECTION = "android:query-arg-sort-direction";
    public static final String QUERY_ARG_SORT_LOCALE = "android:query-arg-sort-locale";
    public static final String QUERY_ARG_SQL_GROUP_BY = "android:query-arg-sql-group-by";
    public static final String QUERY_ARG_SQL_HAVING = "android:query-arg-sql-having";
    public static final String QUERY_ARG_SQL_LIMIT = "android:query-arg-sql-limit";
    public static final String QUERY_ARG_SQL_SELECTION = "android:query-arg-sql-selection";
    public static final String QUERY_ARG_SQL_SELECTION_ARGS = "android:query-arg-sql-selection-args";
    public static final String QUERY_ARG_SQL_SORT_ORDER = "android:query-arg-sql-sort-order";
    public static final int QUERY_SORT_DIRECTION_ASCENDING = 0;
    public static final int QUERY_SORT_DIRECTION_DESCENDING = 1;
    public static final String SCHEME_ANDROID_RESOURCE = "android.resource";
    public static final String SCHEME_CONTENT = "content";
    public static final String SCHEME_FILE = "file";
    @Deprecated
    public static final String SYNC_EXTRAS_ACCOUNT = "account";
    public static final String SYNC_EXTRAS_DISCARD_LOCAL_DELETIONS = "discard_deletions";
    public static final String SYNC_EXTRAS_DO_NOT_RETRY = "do_not_retry";
    public static final String SYNC_EXTRAS_EXPEDITED = "expedited";
    @Deprecated
    public static final String SYNC_EXTRAS_FORCE = "force";
    public static final String SYNC_EXTRAS_IGNORE_BACKOFF = "ignore_backoff";
    public static final String SYNC_EXTRAS_IGNORE_SETTINGS = "ignore_settings";
    public static final String SYNC_EXTRAS_INITIALIZE = "initialize";
    public static final String SYNC_EXTRAS_MANUAL = "force";
    public static final String SYNC_EXTRAS_OVERRIDE_TOO_MANY_DELETIONS = "deletions_override";
    public static final String SYNC_EXTRAS_REQUIRE_CHARGING = "require_charging";
    public static final String SYNC_EXTRAS_SCHEDULE_AS_EXPEDITED_JOB = "schedule_as_expedited_job";
    public static final String SYNC_EXTRAS_UPLOAD = "upload";
    public static final int SYNC_OBSERVER_TYPE_ACTIVE = 4;
    public static final int SYNC_OBSERVER_TYPE_PENDING = 2;
    public static final int SYNC_OBSERVER_TYPE_SETTINGS = 1;
    
    public ContentResolver(@Nullable final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ContentResolver wrap(@NonNull final ContentProvider wrapped) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ContentResolver wrap(@NonNull final ContentProviderClient wrapped) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final String getType(@NonNull final Uri url) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String[] getStreamTypes(@NonNull final Uri url, @NonNull final String mimeTypeFilter) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final Cursor query(@NonNull final Uri uri, @Nullable final String[] projection, @Nullable final String selection, @Nullable final String[] selectionArgs, @Nullable final String sortOrder) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final Cursor query(@NonNull final Uri uri, @Nullable final String[] projection, @Nullable final String selection, @Nullable final String[] selectionArgs, @Nullable final String sortOrder, @Nullable final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final Cursor query(@NonNull final Uri uri, @Nullable final String[] projection, @Nullable final Bundle queryArgs, @Nullable final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final Uri canonicalize(@NonNull final Uri url) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final Uri uncanonicalize(@NonNull final Uri url) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean refresh(@NonNull final Uri url, @Nullable final Bundle extras, @Nullable final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final InputStream openInputStream(@NonNull final Uri uri) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final OutputStream openOutputStream(@NonNull final Uri uri) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final OutputStream openOutputStream(@NonNull final Uri uri, @NonNull final String mode) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final ParcelFileDescriptor openFile(@NonNull final Uri uri, @NonNull final String mode, @Nullable final CancellationSignal signal) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final ParcelFileDescriptor openFileDescriptor(@NonNull final Uri uri, @NonNull final String mode) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final ParcelFileDescriptor openFileDescriptor(@NonNull final Uri uri, @NonNull final String mode, @Nullable final CancellationSignal cancellationSignal) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final AssetFileDescriptor openAssetFile(@NonNull final Uri uri, @NonNull final String mode, @Nullable final CancellationSignal signal) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final AssetFileDescriptor openAssetFileDescriptor(@NonNull final Uri uri, @NonNull final String mode) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final AssetFileDescriptor openAssetFileDescriptor(@NonNull final Uri uri, @NonNull final String mode, @Nullable final CancellationSignal cancellationSignal) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final AssetFileDescriptor openTypedAssetFile(@NonNull final Uri uri, @NonNull final String mimeTypeFilter, @Nullable final Bundle opts, @Nullable final CancellationSignal signal) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final AssetFileDescriptor openTypedAssetFileDescriptor(@NonNull final Uri uri, @NonNull final String mimeType, @Nullable final Bundle opts) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final AssetFileDescriptor openTypedAssetFileDescriptor(@NonNull final Uri uri, @NonNull final String mimeType, @Nullable final Bundle opts, @Nullable final CancellationSignal cancellationSignal) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final Uri insert(@NonNull final Uri url, @Nullable final ContentValues values) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final Uri insert(@NonNull final Uri url, @Nullable final ContentValues values, @Nullable final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ContentProviderResult[] applyBatch(@NonNull final String authority, @NonNull final ArrayList<ContentProviderOperation> operations) throws OperationApplicationException, RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    public final int bulkInsert(@NonNull final Uri url, @NonNull final ContentValues[] values) {
        throw new RuntimeException("Stub!");
    }
    
    public final int delete(@NonNull final Uri url, @Nullable final String where, @Nullable final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    public final int delete(@NonNull final Uri url, @Nullable final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public final int update(@NonNull final Uri uri, @Nullable final ContentValues values, @Nullable final String where, @Nullable final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    public final int update(@NonNull final Uri uri, @Nullable final ContentValues values, @Nullable final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final Bundle call(@NonNull final Uri uri, @NonNull final String method, @Nullable final String arg, @Nullable final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final Bundle call(@NonNull final String authority, @NonNull final String method, @Nullable final String arg, @Nullable final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final ContentProviderClient acquireContentProviderClient(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final ContentProviderClient acquireContentProviderClient(@NonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final ContentProviderClient acquireUnstableContentProviderClient(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final ContentProviderClient acquireUnstableContentProviderClient(@NonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public final void registerContentObserver(@NonNull final Uri uri, final boolean notifyForDescendants, @NonNull final ContentObserver observer) {
        throw new RuntimeException("Stub!");
    }
    
    public final void unregisterContentObserver(@NonNull final ContentObserver observer) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyChange(@NonNull final Uri uri, @Nullable final ContentObserver observer) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void notifyChange(@NonNull final Uri uri, @Nullable final ContentObserver observer, final boolean syncToNetwork) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyChange(@NonNull final Uri uri, @Nullable final ContentObserver observer, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyChange(@NonNull final Collection<Uri> uris, @Nullable final ContentObserver observer, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void takePersistableUriPermission(@NonNull final Uri uri, final int modeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public void releasePersistableUriPermission(@NonNull final Uri uri, final int modeFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<UriPermission> getPersistedUriPermissions() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<UriPermission> getOutgoingPersistedUriPermissions() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void startSync(final Uri uri, final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public static void requestSync(final Account account, final String authority, final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public static void requestSync(final SyncRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public static void validateSyncExtrasBundle(final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void cancelSync(final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    public static void cancelSync(final Account account, final String authority) {
        throw new RuntimeException("Stub!");
    }
    
    public static SyncAdapterType[] getSyncAdapterTypes() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean getSyncAutomatically(final Account account, final String authority) {
        throw new RuntimeException("Stub!");
    }
    
    public static void setSyncAutomatically(final Account account, final String authority, final boolean sync) {
        throw new RuntimeException("Stub!");
    }
    
    public static void addPeriodicSync(final Account account, final String authority, final Bundle extras, final long pollFrequency) {
        throw new RuntimeException("Stub!");
    }
    
    public static void removePeriodicSync(final Account account, final String authority, final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public static void cancelSync(final SyncRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public static List<PeriodicSync> getPeriodicSyncs(final Account account, final String authority) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getIsSyncable(final Account account, final String authority) {
        throw new RuntimeException("Stub!");
    }
    
    public static void setIsSyncable(final Account account, final String authority, final int syncable) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean getMasterSyncAutomatically() {
        throw new RuntimeException("Stub!");
    }
    
    public static void setMasterSyncAutomatically(final boolean sync) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isSyncActive(final Account account, final String authority) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static SyncInfo getCurrentSync() {
        throw new RuntimeException("Stub!");
    }
    
    public static List<SyncInfo> getCurrentSyncs() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isSyncPending(final Account account, final String authority) {
        throw new RuntimeException("Stub!");
    }
    
    public static Object addStatusChangeListener(final int mask, final SyncStatusObserver callback) {
        throw new RuntimeException("Stub!");
    }
    
    public static void removeStatusChangeListener(final Object handle) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final MimeTypeInfo getTypeInfo(@NonNull final String mimeType) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bitmap loadThumbnail(@NonNull final Uri uri, @NonNull final Size size, @Nullable final CancellationSignal signal) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static final class MimeTypeInfo
    {
        MimeTypeInfo() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Icon getIcon() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public CharSequence getLabel() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public CharSequence getContentDescription() {
            throw new RuntimeException("Stub!");
        }
    }
}
