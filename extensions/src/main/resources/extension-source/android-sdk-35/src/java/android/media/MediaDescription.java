package android.media;

import android.os.Parcel;
import android.os.Bundle;
import android.net.Uri;
import android.graphics.Bitmap;
import android.os.Parcelable;

public class MediaDescription implements Parcelable
{
    public static final long BT_FOLDER_TYPE_ALBUMS = 2L;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3L;
    public static final long BT_FOLDER_TYPE_GENRES = 4L;
    public static final long BT_FOLDER_TYPE_MIXED = 0L;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5L;
    public static final long BT_FOLDER_TYPE_TITLES = 1L;
    public static final long BT_FOLDER_TYPE_YEARS = 6L;
    @NonNull
    public static final Creator<MediaDescription> CREATOR;
    public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    
    MediaDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getMediaId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getTitle() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getSubtitle() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bitmap getIconBitmap() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri getIconUri() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri getMediaUri() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setMediaId(@Nullable final String mediaId) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setTitle(@Nullable final CharSequence title) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setSubtitle(@Nullable final CharSequence subtitle) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setDescription(@Nullable final CharSequence description) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setIconBitmap(@Nullable final Bitmap icon) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setIconUri(@Nullable final Uri iconUri) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setExtras(@Nullable final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setMediaUri(@Nullable final Uri mediaUri) {
            throw new RuntimeException("Stub!");
        }
        
        public MediaDescription build() {
            throw new RuntimeException("Stub!");
        }
    }
}
