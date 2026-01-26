package android.media;

import java.util.Set;
import android.os.Parcel;
import android.graphics.Bitmap;
import android.os.Parcelable;

public final class MediaMetadata implements Parcelable
{
    @NonNull
    public static final Creator<MediaMetadata> CREATOR;
    public static final String METADATA_KEY_ALBUM = "android.media.metadata.ALBUM";
    public static final String METADATA_KEY_ALBUM_ART = "android.media.metadata.ALBUM_ART";
    public static final String METADATA_KEY_ALBUM_ARTIST = "android.media.metadata.ALBUM_ARTIST";
    public static final String METADATA_KEY_ALBUM_ART_URI = "android.media.metadata.ALBUM_ART_URI";
    public static final String METADATA_KEY_ART = "android.media.metadata.ART";
    public static final String METADATA_KEY_ARTIST = "android.media.metadata.ARTIST";
    public static final String METADATA_KEY_ART_URI = "android.media.metadata.ART_URI";
    public static final String METADATA_KEY_AUTHOR = "android.media.metadata.AUTHOR";
    public static final String METADATA_KEY_BT_FOLDER_TYPE = "android.media.metadata.BT_FOLDER_TYPE";
    public static final String METADATA_KEY_COMPILATION = "android.media.metadata.COMPILATION";
    public static final String METADATA_KEY_COMPOSER = "android.media.metadata.COMPOSER";
    public static final String METADATA_KEY_DATE = "android.media.metadata.DATE";
    public static final String METADATA_KEY_DISC_NUMBER = "android.media.metadata.DISC_NUMBER";
    public static final String METADATA_KEY_DISPLAY_DESCRIPTION = "android.media.metadata.DISPLAY_DESCRIPTION";
    public static final String METADATA_KEY_DISPLAY_ICON = "android.media.metadata.DISPLAY_ICON";
    public static final String METADATA_KEY_DISPLAY_ICON_URI = "android.media.metadata.DISPLAY_ICON_URI";
    public static final String METADATA_KEY_DISPLAY_SUBTITLE = "android.media.metadata.DISPLAY_SUBTITLE";
    public static final String METADATA_KEY_DISPLAY_TITLE = "android.media.metadata.DISPLAY_TITLE";
    public static final String METADATA_KEY_DURATION = "android.media.metadata.DURATION";
    public static final String METADATA_KEY_GENRE = "android.media.metadata.GENRE";
    public static final String METADATA_KEY_MEDIA_ID = "android.media.metadata.MEDIA_ID";
    public static final String METADATA_KEY_MEDIA_URI = "android.media.metadata.MEDIA_URI";
    public static final String METADATA_KEY_NUM_TRACKS = "android.media.metadata.NUM_TRACKS";
    public static final String METADATA_KEY_RATING = "android.media.metadata.RATING";
    public static final String METADATA_KEY_TITLE = "android.media.metadata.TITLE";
    public static final String METADATA_KEY_TRACK_NUMBER = "android.media.metadata.TRACK_NUMBER";
    public static final String METADATA_KEY_USER_RATING = "android.media.metadata.USER_RATING";
    public static final String METADATA_KEY_WRITER = "android.media.metadata.WRITER";
    public static final String METADATA_KEY_YEAR = "android.media.metadata.YEAR";
    
    MediaMetadata() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean containsKey(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getText(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public String getString(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public long getLong(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public Rating getRating(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public Bitmap getBitmap(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public int getBitmapDimensionLimit() {
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
    
    public int size() {
        throw new RuntimeException("Stub!");
    }
    
    public Set<String> keySet() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public MediaDescription getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(final MediaMetadata source) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder putText(final String key, final CharSequence value) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder putString(final String key, final String value) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder putLong(final String key, final long value) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder putRating(final String key, final Rating value) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder putBitmap(final String key, final Bitmap value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBitmapDimensionLimit(final int bitmapDimensionLimit) {
            throw new RuntimeException("Stub!");
        }
        
        public MediaMetadata build() {
            throw new RuntimeException("Stub!");
        }
    }
}
