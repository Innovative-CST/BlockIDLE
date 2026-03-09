package android.app.slice;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.database.Cursor;
import android.content.ContentValues;
import android.app.PendingIntent;
import android.content.Intent;
import java.util.Collection;
import java.util.Set;
import android.net.Uri;
import android.content.pm.ProviderInfo;
import android.content.Context;
import android.content.ContentProvider;

@Deprecated
public abstract class SliceProvider extends ContentProvider
{
    @Deprecated
    public static final String SLICE_TYPE = "vnd.android.slice";
    
    @Deprecated
    public SliceProvider(@NonNull final String... autoGrantPermissions) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public SliceProvider() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void attachInfo(final Context context, final ProviderInfo info) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Slice onBindSlice(final Uri sliceUri, final Set<SliceSpec> supportedSpecs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onSlicePinned(final Uri sliceUri) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onSliceUnpinned(final Uri sliceUri) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public Collection<Uri> onGetSliceDescendants(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public Uri onMapIntentToUri(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public PendingIntent onCreatePermissionRequest(final Uri sliceUri) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final int update(final Uri uri, final ContentValues values, final String selection, final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final int delete(final Uri uri, final String selection, final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final Cursor query(final Uri uri, final String[] projection, final String selection, final String[] selectionArgs, final String sortOrder) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final Cursor query(final Uri uri, final String[] projection, final String selection, final String[] selectionArgs, final String sortOrder, final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final Cursor query(final Uri uri, final String[] projection, final Bundle queryArgs, final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final Uri insert(final Uri uri, final ContentValues values) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final String getType(final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public Bundle call(final String method, final String arg, final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
}
