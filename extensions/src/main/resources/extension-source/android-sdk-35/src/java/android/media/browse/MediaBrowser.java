package android.media.browse;

import java.util.List;
import android.os.Parcel;
import android.media.MediaDescription;
import android.os.Parcelable;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.content.ComponentName;
import android.content.Context;

public final class MediaBrowser
{
    public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";
    public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
    
    public MediaBrowser(final Context context, final ComponentName serviceComponent, final ConnectionCallback callback, final Bundle rootHints) {
        throw new RuntimeException("Stub!");
    }
    
    public void connect() {
        throw new RuntimeException("Stub!");
    }
    
    public void disconnect() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isConnected() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ComponentName getServiceComponent() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getRoot() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public MediaSession.Token getSessionToken() {
        throw new RuntimeException("Stub!");
    }
    
    public void subscribe(@NonNull final String parentId, @NonNull final SubscriptionCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void subscribe(@NonNull final String parentId, @NonNull final Bundle options, @NonNull final SubscriptionCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unsubscribe(@NonNull final String parentId) {
        throw new RuntimeException("Stub!");
    }
    
    public void unsubscribe(@NonNull final String parentId, @NonNull final SubscriptionCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getItem(@NonNull final String mediaId, @NonNull final ItemCallback cb) {
        throw new RuntimeException("Stub!");
    }
    
    public static class ConnectionCallback
    {
        public ConnectionCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onConnected() {
            throw new RuntimeException("Stub!");
        }
        
        public void onConnectionSuspended() {
            throw new RuntimeException("Stub!");
        }
        
        public void onConnectionFailed() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class ItemCallback
    {
        public ItemCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onItemLoaded(final MediaItem item) {
            throw new RuntimeException("Stub!");
        }
        
        public void onError(@NonNull final String mediaId) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class MediaItem implements Parcelable
    {
        @NonNull
        public static final Creator<MediaItem> CREATOR;
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        
        public MediaItem(@NonNull final MediaDescription description, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel out, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        public int getFlags() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isBrowsable() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isPlayable() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public MediaDescription getDescription() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public String getMediaId() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
    
    public abstract static class SubscriptionCallback
    {
        public SubscriptionCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onChildrenLoaded(@NonNull final String parentId, @NonNull final List<MediaItem> children) {
            throw new RuntimeException("Stub!");
        }
        
        public void onChildrenLoaded(@NonNull final String parentId, @NonNull final List<MediaItem> children, @NonNull final Bundle options) {
            throw new RuntimeException("Stub!");
        }
        
        public void onError(@NonNull final String parentId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onError(@NonNull final String parentId, @NonNull final Bundle options) {
            throw new RuntimeException("Stub!");
        }
    }
}
