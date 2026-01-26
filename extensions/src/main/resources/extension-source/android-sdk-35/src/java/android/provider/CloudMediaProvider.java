package android.provider;

import android.view.Surface;
import android.content.ContentValues;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import android.content.res.AssetFileDescriptor;
import android.os.CancellationSignal;
import android.graphics.Point;
import android.database.Cursor;
import android.os.Bundle;
import android.content.pm.ProviderInfo;
import android.content.Context;
import android.content.ContentProvider;

public abstract class CloudMediaProvider extends ContentProvider
{
    public CloudMediaProvider() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void attachInfo(@NonNull final Context context, @NonNull final ProviderInfo info) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract Bundle onGetMediaCollectionInfo(@NonNull final Bundle p0);
    
    @NonNull
    public abstract Cursor onQueryMedia(@NonNull final Bundle p0);
    
    @NonNull
    public abstract Cursor onQueryDeletedMedia(@NonNull final Bundle p0);
    
    @NonNull
    public Cursor onQueryAlbums(@NonNull final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract AssetFileDescriptor onOpenPreview(@NonNull final String p0, @NonNull final Point p1, @Nullable final Bundle p2, @Nullable final CancellationSignal p3) throws FileNotFoundException;
    
    @NonNull
    public abstract ParcelFileDescriptor onOpenMedia(@NonNull final String p0, @Nullable final Bundle p1, @Nullable final CancellationSignal p2) throws FileNotFoundException;
    
    @Nullable
    public CloudMediaSurfaceController onCreateCloudMediaSurfaceController(@NonNull final Bundle config, @NonNull final CloudMediaSurfaceStateChangedCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public final Bundle call(@NonNull final String method, @Nullable final String arg, @Nullable final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public final ParcelFileDescriptor openFile(@NonNull final Uri uri, @NonNull final String mode) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public final ParcelFileDescriptor openFile(@NonNull final Uri uri, @NonNull final String mode, @Nullable final CancellationSignal signal) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public final AssetFileDescriptor openTypedAssetFile(@NonNull final Uri uri, @NonNull final String mimeTypeFilter, @Nullable final Bundle opts) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public final AssetFileDescriptor openTypedAssetFile(@NonNull final Uri uri, @NonNull final String mimeTypeFilter, @Nullable final Bundle opts, @Nullable final CancellationSignal signal) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public final Cursor query(@NonNull final Uri uri, @Nullable final String[] projection, @Nullable final Bundle queryArgs, @Nullable final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public final String getType(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public final Uri canonicalize(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public final Cursor query(@NonNull final Uri uri, @Nullable final String[] projection, @Nullable final String selection, @Nullable final String[] selectionArgs, @Nullable final String sortOrder) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public final Cursor query(@NonNull final Uri uri, @Nullable final String[] projection, @Nullable final String selection, @Nullable final String[] selectionArgs, @Nullable final String sortOrder, @Nullable final CancellationSignal cancellationSignal) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public final Uri insert(@NonNull final Uri uri, @NonNull final ContentValues values) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final int delete(@NonNull final Uri uri, @Nullable final String selection, @Nullable final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final int update(@NonNull final Uri uri, @NonNull final ContentValues values, @Nullable final String selection, @Nullable final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class CloudMediaSurfaceController
    {
        public CloudMediaSurfaceController() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onPlayerCreate();
        
        public abstract void onPlayerRelease();
        
        public abstract void onSurfaceCreated(final int p0, @NonNull final Surface p1, @NonNull final String p2);
        
        public abstract void onSurfaceChanged(final int p0, final int p1, final int p2, final int p3);
        
        public abstract void onSurfaceDestroyed(final int p0);
        
        public abstract void onMediaPlay(final int p0);
        
        public abstract void onMediaPause(final int p0);
        
        public abstract void onMediaSeekTo(final int p0, final long p1);
        
        public abstract void onConfigChange(@NonNull final Bundle p0);
        
        public abstract void onDestroy();
    }
    
    public static final class CloudMediaSurfaceStateChangedCallback
    {
        public static final int PLAYBACK_STATE_BUFFERING = 1;
        public static final int PLAYBACK_STATE_COMPLETED = 5;
        public static final int PLAYBACK_STATE_ERROR_PERMANENT_FAILURE = 7;
        public static final int PLAYBACK_STATE_ERROR_RETRIABLE_FAILURE = 6;
        public static final int PLAYBACK_STATE_MEDIA_SIZE_CHANGED = 8;
        public static final int PLAYBACK_STATE_PAUSED = 4;
        public static final int PLAYBACK_STATE_READY = 2;
        public static final int PLAYBACK_STATE_STARTED = 3;
        
        CloudMediaSurfaceStateChangedCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void setPlaybackState(final int surfaceId, final int playbackState, @Nullable final Bundle playbackStateInfo) {
            throw new RuntimeException("Stub!");
        }
    }
}
