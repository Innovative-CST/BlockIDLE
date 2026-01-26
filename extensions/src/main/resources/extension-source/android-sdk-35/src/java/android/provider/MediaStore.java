package android.provider;

import android.util.Size;
import android.graphics.BitmapFactory;
import java.io.FileNotFoundException;
import android.graphics.Bitmap;
import android.database.Cursor;
import java.util.List;
import java.util.Set;
import android.app.PendingIntent;
import java.util.Collection;
import android.content.ContentResolver;
import java.io.IOException;
import android.os.ParcelFileDescriptor;
import android.content.Context;
import android.net.Uri;

public final class MediaStore
{
    public static final String ACCESS_MEDIA_OWNER_PACKAGE_NAME_PERMISSION = "com.android.providers.media.permission.ACCESS_MEDIA_OWNER_PACKAGE_NAME";
    public static final String ACTION_IMAGE_CAPTURE = "android.media.action.IMAGE_CAPTURE";
    public static final String ACTION_IMAGE_CAPTURE_SECURE = "android.media.action.IMAGE_CAPTURE_SECURE";
    public static final String ACTION_PICK_IMAGES = "android.provider.action.PICK_IMAGES";
    public static final String ACTION_PICK_IMAGES_SETTINGS = "android.provider.action.PICK_IMAGES_SETTINGS";
    public static final String ACTION_REVIEW = "android.provider.action.REVIEW";
    public static final String ACTION_REVIEW_SECURE = "android.provider.action.REVIEW_SECURE";
    public static final String ACTION_VIDEO_CAPTURE = "android.media.action.VIDEO_CAPTURE";
    public static final String AUTHORITY = "media";
    @NonNull
    public static final Uri AUTHORITY_URI;
    public static final String EXTRA_ACCEPT_ORIGINAL_MEDIA_FORMAT = "android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT";
    public static final String EXTRA_BRIGHTNESS = "android.provider.extra.BRIGHTNESS";
    public static final String EXTRA_DURATION_LIMIT = "android.intent.extra.durationLimit";
    public static final String EXTRA_FINISH_ON_COMPLETION = "android.intent.extra.finishOnCompletion";
    public static final String EXTRA_FULL_SCREEN = "android.intent.extra.fullScreen";
    public static final String EXTRA_MEDIA_ALBUM = "android.intent.extra.album";
    public static final String EXTRA_MEDIA_ARTIST = "android.intent.extra.artist";
    public static final String EXTRA_MEDIA_CAPABILITIES = "android.provider.extra.MEDIA_CAPABILITIES";
    public static final String EXTRA_MEDIA_CAPABILITIES_UID = "android.provider.extra.MEDIA_CAPABILITIES_UID";
    public static final String EXTRA_MEDIA_FOCUS = "android.intent.extra.focus";
    public static final String EXTRA_MEDIA_GENRE = "android.intent.extra.genre";
    @Deprecated
    public static final String EXTRA_MEDIA_PLAYLIST = "android.intent.extra.playlist";
    public static final String EXTRA_MEDIA_RADIO_CHANNEL = "android.intent.extra.radio_channel";
    public static final String EXTRA_MEDIA_TITLE = "android.intent.extra.title";
    public static final String EXTRA_OUTPUT = "output";
    public static final String EXTRA_PICK_IMAGES_ACCENT_COLOR = "android.provider.extra.PICK_IMAGES_ACCENT_COLOR";
    public static final String EXTRA_PICK_IMAGES_IN_ORDER = "android.provider.extra.PICK_IMAGES_IN_ORDER";
    public static final String EXTRA_PICK_IMAGES_LAUNCH_TAB = "android.provider.extra.PICK_IMAGES_LAUNCH_TAB";
    public static final String EXTRA_PICK_IMAGES_MAX = "android.provider.extra.PICK_IMAGES_MAX";
    public static final String EXTRA_SCREEN_ORIENTATION = "android.intent.extra.screenOrientation";
    public static final String EXTRA_SHOW_ACTION_ICONS = "android.intent.extra.showActionIcons";
    public static final String EXTRA_SIZE_LIMIT = "android.intent.extra.sizeLimit";
    public static final String EXTRA_VIDEO_QUALITY = "android.intent.extra.videoQuality";
    public static final String INTENT_ACTION_MEDIA_PLAY_FROM_SEARCH = "android.media.action.MEDIA_PLAY_FROM_SEARCH";
    public static final String INTENT_ACTION_MEDIA_SEARCH = "android.intent.action.MEDIA_SEARCH";
    @Deprecated
    public static final String INTENT_ACTION_MUSIC_PLAYER = "android.intent.action.MUSIC_PLAYER";
    public static final String INTENT_ACTION_STILL_IMAGE_CAMERA = "android.media.action.STILL_IMAGE_CAMERA";
    public static final String INTENT_ACTION_STILL_IMAGE_CAMERA_SECURE = "android.media.action.STILL_IMAGE_CAMERA_SECURE";
    public static final String INTENT_ACTION_TEXT_OPEN_FROM_SEARCH = "android.media.action.TEXT_OPEN_FROM_SEARCH";
    public static final String INTENT_ACTION_VIDEO_CAMERA = "android.media.action.VIDEO_CAMERA";
    public static final String INTENT_ACTION_VIDEO_PLAY_FROM_SEARCH = "android.media.action.VIDEO_PLAY_FROM_SEARCH";
    public static final int MATCH_DEFAULT = 0;
    public static final int MATCH_EXCLUDE = 2;
    public static final int MATCH_INCLUDE = 1;
    public static final int MATCH_ONLY = 3;
    public static final String MEDIA_IGNORE_FILENAME = ".nomedia";
    public static final String MEDIA_SCANNER_VOLUME = "volume";
    public static final String META_DATA_REVIEW_GALLERY_PREWARM_SERVICE = "android.media.review_gallery_prewarm_service";
    public static final String META_DATA_STILL_IMAGE_CAMERA_PREWARM_SERVICE = "android.media.still_image_camera_preview_service";
    public static final int PICK_IMAGES_TAB_ALBUMS = 0;
    public static final int PICK_IMAGES_TAB_IMAGES = 1;
    public static final String QUERY_ARG_INCLUDE_RECENTLY_UNMOUNTED_VOLUMES = "android:query-arg-recently-unmounted-volumes";
    public static final String QUERY_ARG_LATEST_SELECTION_ONLY = "android:query-arg-latest-selection-only";
    public static final String QUERY_ARG_MATCH_FAVORITE = "android:query-arg-match-favorite";
    public static final String QUERY_ARG_MATCH_PENDING = "android:query-arg-match-pending";
    public static final String QUERY_ARG_MATCH_TRASHED = "android:query-arg-match-trashed";
    public static final String QUERY_ARG_RELATED_URI = "android:query-arg-related-uri";
    public static final String UNKNOWN_STRING = "<unknown>";
    public static final String VOLUME_EXTERNAL = "external";
    public static final String VOLUME_EXTERNAL_PRIMARY = "external_primary";
    public static final String VOLUME_INTERNAL = "internal";
    
    public MediaStore() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getPickImagesMaxLimit() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public static Uri setIncludePending(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Uri setRequireOriginal(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean getRequireOriginal(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ParcelFileDescriptor getOriginalMediaFormatFileDescriptor(@NonNull final Context context, @NonNull final ParcelFileDescriptor fileDescriptor) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static PendingIntent createWriteRequest(@NonNull final ContentResolver resolver, @NonNull final Collection<Uri> uris) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static PendingIntent createTrashRequest(@NonNull final ContentResolver resolver, @NonNull final Collection<Uri> uris, final boolean value) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static PendingIntent createFavoriteRequest(@NonNull final ContentResolver resolver, @NonNull final Collection<Uri> uris, final boolean value) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static PendingIntent createDeleteRequest(@NonNull final ContentResolver resolver, @NonNull final Collection<Uri> uris) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Set<String> getExternalVolumeNames(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Set<String> getRecentExternalVolumeNames(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static String getVolumeName(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    public static Uri getMediaScannerUri() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static String getVersion(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static String getVersion(@NonNull final Context context, @NonNull final String volumeName) {
        throw new RuntimeException("Stub!");
    }
    
    public static long getGeneration(@NonNull final Context context, @NonNull final String volumeName) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static Uri getDocumentUri(@NonNull final Context context, @NonNull final Uri mediaUri) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static Uri getMediaUri(@NonNull final Context context, @NonNull final Uri documentUri) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isCurrentSystemGallery(@NonNull final ContentResolver resolver, final int uid, @NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static Uri getRedactedUri(@NonNull final ContentResolver resolver, @NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static List<Uri> getRedactedUri(@NonNull final ContentResolver resolver, @NonNull final List<Uri> uris) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean canManageMedia(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isCurrentCloudMediaProviderAuthority(@NonNull final ContentResolver resolver, @NonNull final String authority) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isSupportedCloudMediaProviderAuthority(@NonNull final ContentResolver resolver, @NonNull final String authority) {
        throw new RuntimeException("Stub!");
    }
    
    public static void notifyCloudMediaChangedEvent(@NonNull final ContentResolver resolver, @NonNull final String authority, @NonNull final String currentMediaCollectionId) throws SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    static {
        AUTHORITY_URI = null;
    }
    
    public static final class Audio
    {
        public Audio() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Nullable
        public static String keyFor(@Nullable final String name) {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Albums implements BaseColumns, AlbumColumns
        {
            public static final String CONTENT_TYPE = "vnd.android.cursor.dir/albums";
            public static final String DEFAULT_SORT_ORDER = "album_key";
            public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/album";
            public static final Uri EXTERNAL_CONTENT_URI;
            public static final Uri INTERNAL_CONTENT_URI;
            
            public Albums() {
                throw new RuntimeException("Stub!");
            }
            
            public static Uri getContentUri(final String volumeName) {
                throw new RuntimeException("Stub!");
            }
            
            static {
                EXTERNAL_CONTENT_URI = null;
                INTERNAL_CONTENT_URI = null;
            }
        }
        
        public static final class Artists implements BaseColumns, ArtistColumns
        {
            public static final String CONTENT_TYPE = "vnd.android.cursor.dir/artists";
            public static final String DEFAULT_SORT_ORDER = "artist_key";
            public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/artist";
            public static final Uri EXTERNAL_CONTENT_URI;
            public static final Uri INTERNAL_CONTENT_URI;
            
            public Artists() {
                throw new RuntimeException("Stub!");
            }
            
            public static Uri getContentUri(final String volumeName) {
                throw new RuntimeException("Stub!");
            }
            
            static {
                EXTERNAL_CONTENT_URI = null;
                INTERNAL_CONTENT_URI = null;
            }
            
            public static final class Albums implements BaseColumns, AlbumColumns
            {
                public Albums() {
                    throw new RuntimeException("Stub!");
                }
                
                public static Uri getContentUri(final String volumeName, final long artistId) {
                    throw new RuntimeException("Stub!");
                }
            }
        }
        
        public static final class Genres implements BaseColumns, GenresColumns
        {
            public static final String CONTENT_TYPE = "vnd.android.cursor.dir/genre";
            public static final String DEFAULT_SORT_ORDER = "name";
            public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/genre";
            public static final Uri EXTERNAL_CONTENT_URI;
            public static final Uri INTERNAL_CONTENT_URI;
            
            public Genres() {
                throw new RuntimeException("Stub!");
            }
            
            public static Uri getContentUri(final String volumeName) {
                throw new RuntimeException("Stub!");
            }
            
            public static Uri getContentUriForAudioId(final String volumeName, final int audioId) {
                throw new RuntimeException("Stub!");
            }
            
            static {
                EXTERNAL_CONTENT_URI = null;
                INTERNAL_CONTENT_URI = null;
            }
            
            public static final class Members implements AudioColumns
            {
                public static final String AUDIO_ID = "audio_id";
                public static final String CONTENT_DIRECTORY = "members";
                public static final String DEFAULT_SORT_ORDER = "title_key";
                public static final String GENRE_ID = "genre_id";
                
                public Members() {
                    throw new RuntimeException("Stub!");
                }
                
                public static Uri getContentUri(final String volumeName, final long genreId) {
                    throw new RuntimeException("Stub!");
                }
            }
        }
        
        public static final class Media implements AudioColumns
        {
            public static final String CONTENT_TYPE = "vnd.android.cursor.dir/audio";
            public static final String DEFAULT_SORT_ORDER = "title_key";
            public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/audio";
            public static final Uri EXTERNAL_CONTENT_URI;
            public static final String EXTRA_MAX_BYTES = "android.provider.MediaStore.extra.MAX_BYTES";
            public static final Uri INTERNAL_CONTENT_URI;
            public static final String RECORD_SOUND_ACTION = "android.provider.MediaStore.RECORD_SOUND";
            
            public Media() {
                throw new RuntimeException("Stub!");
            }
            
            public static Uri getContentUri(final String volumeName) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public static Uri getContentUri(@NonNull final String volumeName, final long id) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            @Nullable
            public static Uri getContentUriForPath(@NonNull final String path) {
                throw new RuntimeException("Stub!");
            }
            
            static {
                EXTERNAL_CONTENT_URI = null;
                INTERNAL_CONTENT_URI = null;
            }
        }
        
        @Deprecated
        public static final class Playlists implements BaseColumns, PlaylistsColumns
        {
            @Deprecated
            public static final String CONTENT_TYPE = "vnd.android.cursor.dir/playlist";
            @Deprecated
            public static final String DEFAULT_SORT_ORDER = "name";
            @Deprecated
            public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/playlist";
            @Deprecated
            public static final Uri EXTERNAL_CONTENT_URI;
            @Deprecated
            public static final Uri INTERNAL_CONTENT_URI;
            
            @Deprecated
            public Playlists() {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static Uri getContentUri(final String volumeName) {
                throw new RuntimeException("Stub!");
            }
            
            static {
                EXTERNAL_CONTENT_URI = null;
                INTERNAL_CONTENT_URI = null;
            }
            
            @Deprecated
            public static final class Members implements AudioColumns
            {
                @Deprecated
                public static final String AUDIO_ID = "audio_id";
                @Deprecated
                public static final String CONTENT_DIRECTORY = "members";
                @Deprecated
                public static final String DEFAULT_SORT_ORDER = "play_order";
                @Deprecated
                public static final String PLAYLIST_ID = "playlist_id";
                @Deprecated
                public static final String PLAY_ORDER = "play_order";
                @Deprecated
                public static final String _ID = "_id";
                
                @Deprecated
                public Members() {
                    throw new RuntimeException("Stub!");
                }
                
                @Deprecated
                public static Uri getContentUri(final String volumeName, final long playlistId) {
                    throw new RuntimeException("Stub!");
                }
                
                @Deprecated
                public static boolean moveItem(final ContentResolver res, final long playlistId, final int from, final int to) {
                    throw new RuntimeException("Stub!");
                }
            }
        }
        
        public static final class Radio
        {
            public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/radio";
            
            Radio() {
                throw new RuntimeException("Stub!");
            }
        }
        
        @Deprecated
        public interface PlaylistsColumns extends MediaColumns
        {
            @Deprecated
            public static final String DATA = "_data";
            @Deprecated
            public static final String DATE_ADDED = "date_added";
            @Deprecated
            public static final String DATE_MODIFIED = "date_modified";
            @Deprecated
            public static final String NAME = "name";
        }
        
        public interface AudioColumns extends MediaColumns
        {
            public static final String ALBUM_ID = "album_id";
            @Deprecated
            public static final String ALBUM_KEY = "album_key";
            public static final String ARTIST_ID = "artist_id";
            @Deprecated
            public static final String ARTIST_KEY = "artist_key";
            public static final String BOOKMARK = "bookmark";
            public static final String GENRE = "genre";
            public static final String GENRE_ID = "genre_id";
            @Deprecated
            public static final String GENRE_KEY = "genre_key";
            public static final String IS_ALARM = "is_alarm";
            public static final String IS_AUDIOBOOK = "is_audiobook";
            public static final String IS_MUSIC = "is_music";
            public static final String IS_NOTIFICATION = "is_notification";
            public static final String IS_PODCAST = "is_podcast";
            public static final String IS_RECORDING = "is_recording";
            public static final String IS_RINGTONE = "is_ringtone";
            @Deprecated
            public static final String TITLE_KEY = "title_key";
            public static final String TITLE_RESOURCE_URI = "title_resource_uri";
            public static final String TRACK = "track";
            public static final String YEAR = "year";
        }
        
        public interface GenresColumns
        {
            public static final String NAME = "name";
        }
        
        public interface ArtistColumns
        {
            public static final String ARTIST = "artist";
            @Deprecated
            public static final String ARTIST_KEY = "artist_key";
            public static final String NUMBER_OF_ALBUMS = "number_of_albums";
            public static final String NUMBER_OF_TRACKS = "number_of_tracks";
        }
        
        public interface AlbumColumns
        {
            public static final String ALBUM = "album";
            @Deprecated
            public static final String ALBUM_ART = "album_art";
            public static final String ALBUM_ID = "album_id";
            @Deprecated
            public static final String ALBUM_KEY = "album_key";
            public static final String ARTIST = "artist";
            public static final String ARTIST_ID = "artist_id";
            @Deprecated
            public static final String ARTIST_KEY = "artist_key";
            public static final String FIRST_YEAR = "minyear";
            public static final String LAST_YEAR = "maxyear";
            public static final String NUMBER_OF_SONGS = "numsongs";
            public static final String NUMBER_OF_SONGS_FOR_ARTIST = "numsongs_by_artist";
        }
    }
    
    public static final class Downloads implements DownloadColumns
    {
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/download";
        @NonNull
        public static final Uri EXTERNAL_CONTENT_URI;
        @NonNull
        public static final Uri INTERNAL_CONTENT_URI;
        
        Downloads() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static Uri getContentUri(@NonNull final String volumeName) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static Uri getContentUri(@NonNull final String volumeName, final long id) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            EXTERNAL_CONTENT_URI = null;
            INTERNAL_CONTENT_URI = null;
        }
    }
    
    public static final class Files
    {
        public Files() {
            throw new RuntimeException("Stub!");
        }
        
        public static Uri getContentUri(final String volumeName) {
            throw new RuntimeException("Stub!");
        }
        
        public static Uri getContentUri(final String volumeName, final long rowId) {
            throw new RuntimeException("Stub!");
        }
        
        public interface FileColumns extends MediaColumns
        {
            public static final String MEDIA_TYPE = "media_type";
            public static final int MEDIA_TYPE_AUDIO = 2;
            public static final int MEDIA_TYPE_DOCUMENT = 6;
            public static final int MEDIA_TYPE_IMAGE = 1;
            public static final int MEDIA_TYPE_NONE = 0;
            @Deprecated
            public static final int MEDIA_TYPE_PLAYLIST = 4;
            public static final int MEDIA_TYPE_SUBTITLE = 5;
            public static final int MEDIA_TYPE_VIDEO = 3;
            public static final String MIME_TYPE = "mime_type";
            public static final String PARENT = "parent";
        }
    }
    
    public static final class Images
    {
        public Images() {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Media implements ImageColumns
        {
            public static final String CONTENT_TYPE = "vnd.android.cursor.dir/image";
            public static final String DEFAULT_SORT_ORDER = "bucket_display_name";
            public static final Uri EXTERNAL_CONTENT_URI;
            public static final Uri INTERNAL_CONTENT_URI;
            
            public Media() {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static Cursor query(final ContentResolver cr, final Uri uri, final String[] projection) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static Cursor query(final ContentResolver cr, final Uri uri, final String[] projection, final String where, final String orderBy) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static Cursor query(final ContentResolver cr, final Uri uri, final String[] projection, final String selection, final String[] selectionArgs, final String orderBy) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static Bitmap getBitmap(final ContentResolver cr, final Uri url) throws FileNotFoundException, IOException {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static String insertImage(final ContentResolver cr, final String imagePath, final String name, final String description) throws FileNotFoundException {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static String insertImage(final ContentResolver cr, final Bitmap source, final String title, final String description) {
                throw new RuntimeException("Stub!");
            }
            
            public static Uri getContentUri(final String volumeName) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public static Uri getContentUri(@NonNull final String volumeName, final long id) {
                throw new RuntimeException("Stub!");
            }
            
            static {
                EXTERNAL_CONTENT_URI = null;
                INTERNAL_CONTENT_URI = null;
            }
        }
        
        @Deprecated
        public static class Thumbnails implements BaseColumns
        {
            @Deprecated
            public static final String DATA = "_data";
            @Deprecated
            public static final String DEFAULT_SORT_ORDER = "image_id ASC";
            @Deprecated
            public static final Uri EXTERNAL_CONTENT_URI;
            @Deprecated
            public static final int FULL_SCREEN_KIND = 2;
            @Deprecated
            public static final String HEIGHT = "height";
            @Deprecated
            public static final String IMAGE_ID = "image_id";
            @Deprecated
            public static final Uri INTERNAL_CONTENT_URI;
            @Deprecated
            public static final String KIND = "kind";
            @Deprecated
            public static final int MICRO_KIND = 3;
            @Deprecated
            public static final int MINI_KIND = 1;
            @Deprecated
            public static final String THUMB_DATA = "thumb_data";
            @Deprecated
            public static final String WIDTH = "width";
            
            @Deprecated
            public Thumbnails() {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static final Cursor query(final ContentResolver cr, final Uri uri, final String[] projection) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static final Cursor queryMiniThumbnails(final ContentResolver cr, final Uri uri, final int kind, final String[] projection) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static final Cursor queryMiniThumbnail(final ContentResolver cr, final long origId, final int kind, final String[] projection) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static void cancelThumbnailRequest(final ContentResolver cr, final long origId) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static Bitmap getThumbnail(final ContentResolver cr, final long imageId, final int kind, final BitmapFactory.Options options) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static void cancelThumbnailRequest(final ContentResolver cr, final long origId, final long groupId) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static Bitmap getThumbnail(final ContentResolver cr, final long imageId, final long groupId, final int kind, final BitmapFactory.Options options) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static Uri getContentUri(final String volumeName) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            @NonNull
            public static Size getKindSize(final int kind) {
                throw new RuntimeException("Stub!");
            }
            
            static {
                EXTERNAL_CONTENT_URI = null;
                INTERNAL_CONTENT_URI = null;
            }
        }
        
        public interface ImageColumns extends MediaColumns
        {
            public static final String DESCRIPTION = "description";
            public static final String EXPOSURE_TIME = "exposure_time";
            public static final String F_NUMBER = "f_number";
            public static final String ISO = "iso";
            public static final String IS_PRIVATE = "isprivate";
            @Deprecated
            public static final String LATITUDE = "latitude";
            @Deprecated
            public static final String LONGITUDE = "longitude";
            @Deprecated
            public static final String MINI_THUMB_MAGIC = "mini_thumb_magic";
            @Deprecated
            public static final String PICASA_ID = "picasa_id";
            public static final String SCENE_CAPTURE_TYPE = "scene_capture_type";
        }
    }
    
    public static class PickerMediaColumns
    {
        public static final String DATA = "_data";
        public static final String DATE_TAKEN = "datetaken";
        public static final String DISPLAY_NAME = "_display_name";
        public static final String DURATION_MILLIS = "duration";
        public static final String HEIGHT = "height";
        public static final String MIME_TYPE = "mime_type";
        public static final String ORIENTATION = "orientation";
        public static final String SIZE = "_size";
        public static final String WIDTH = "width";
        
        PickerMediaColumns() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Video
    {
        public static final String DEFAULT_SORT_ORDER = "_display_name";
        
        public Video() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public static Cursor query(final ContentResolver cr, final Uri uri, final String[] projection) {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Media implements VideoColumns
        {
            public static final String CONTENT_TYPE = "vnd.android.cursor.dir/video";
            public static final String DEFAULT_SORT_ORDER = "title";
            public static final Uri EXTERNAL_CONTENT_URI;
            public static final Uri INTERNAL_CONTENT_URI;
            
            public Media() {
                throw new RuntimeException("Stub!");
            }
            
            public static Uri getContentUri(final String volumeName) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public static Uri getContentUri(@NonNull final String volumeName, final long id) {
                throw new RuntimeException("Stub!");
            }
            
            static {
                EXTERNAL_CONTENT_URI = null;
                INTERNAL_CONTENT_URI = null;
            }
        }
        
        @Deprecated
        public static class Thumbnails implements BaseColumns
        {
            @Deprecated
            public static final String DATA = "_data";
            @Deprecated
            public static final String DEFAULT_SORT_ORDER = "video_id ASC";
            @Deprecated
            public static final Uri EXTERNAL_CONTENT_URI;
            @Deprecated
            public static final int FULL_SCREEN_KIND = 2;
            @Deprecated
            public static final String HEIGHT = "height";
            @Deprecated
            public static final Uri INTERNAL_CONTENT_URI;
            @Deprecated
            public static final String KIND = "kind";
            @Deprecated
            public static final int MICRO_KIND = 3;
            @Deprecated
            public static final int MINI_KIND = 1;
            @Deprecated
            public static final String VIDEO_ID = "video_id";
            @Deprecated
            public static final String WIDTH = "width";
            
            @Deprecated
            public Thumbnails() {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static void cancelThumbnailRequest(final ContentResolver cr, final long origId) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static Bitmap getThumbnail(final ContentResolver cr, final long videoId, final int kind, final BitmapFactory.Options options) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static void cancelThumbnailRequest(final ContentResolver cr, final long videoId, final long groupId) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static Bitmap getThumbnail(final ContentResolver cr, final long videoId, final long groupId, final int kind, final BitmapFactory.Options options) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            public static Uri getContentUri(final String volumeName) {
                throw new RuntimeException("Stub!");
            }
            
            @Deprecated
            @NonNull
            public static Size getKindSize(final int kind) {
                throw new RuntimeException("Stub!");
            }
            
            static {
                EXTERNAL_CONTENT_URI = null;
                INTERNAL_CONTENT_URI = null;
            }
        }
        
        public interface VideoColumns extends MediaColumns
        {
            public static final String BOOKMARK = "bookmark";
            public static final String CATEGORY = "category";
            public static final String COLOR_RANGE = "color_range";
            public static final String COLOR_STANDARD = "color_standard";
            public static final String COLOR_TRANSFER = "color_transfer";
            public static final String DESCRIPTION = "description";
            public static final String IS_PRIVATE = "isprivate";
            public static final String LANGUAGE = "language";
            @Deprecated
            public static final String LATITUDE = "latitude";
            @Deprecated
            public static final String LONGITUDE = "longitude";
            @Deprecated
            public static final String MINI_THUMB_MAGIC = "mini_thumb_magic";
            public static final String TAGS = "tags";
        }
    }
    
    public interface MediaColumns extends BaseColumns
    {
        public static final String ALBUM = "album";
        public static final String ALBUM_ARTIST = "album_artist";
        public static final String ARTIST = "artist";
        public static final String AUTHOR = "author";
        public static final String BITRATE = "bitrate";
        public static final String BUCKET_DISPLAY_NAME = "bucket_display_name";
        public static final String BUCKET_ID = "bucket_id";
        public static final String CAPTURE_FRAMERATE = "capture_framerate";
        public static final String CD_TRACK_NUMBER = "cd_track_number";
        public static final String COMPILATION = "compilation";
        public static final String COMPOSER = "composer";
        public static final String DATA = "_data";
        public static final String DATE_ADDED = "date_added";
        public static final String DATE_EXPIRES = "date_expires";
        public static final String DATE_MODIFIED = "date_modified";
        public static final String DATE_TAKEN = "datetaken";
        public static final String DISC_NUMBER = "disc_number";
        public static final String DISPLAY_NAME = "_display_name";
        public static final String DOCUMENT_ID = "document_id";
        public static final String DURATION = "duration";
        public static final String GENERATION_ADDED = "generation_added";
        public static final String GENERATION_MODIFIED = "generation_modified";
        public static final String GENRE = "genre";
        public static final String HEIGHT = "height";
        public static final String INSTANCE_ID = "instance_id";
        public static final String IS_DOWNLOAD = "is_download";
        public static final String IS_DRM = "is_drm";
        public static final String IS_FAVORITE = "is_favorite";
        public static final String IS_PENDING = "is_pending";
        public static final String IS_TRASHED = "is_trashed";
        public static final String MIME_TYPE = "mime_type";
        public static final String NUM_TRACKS = "num_tracks";
        public static final String ORIENTATION = "orientation";
        public static final String ORIGINAL_DOCUMENT_ID = "original_document_id";
        public static final String OWNER_PACKAGE_NAME = "owner_package_name";
        public static final String RELATIVE_PATH = "relative_path";
        public static final String RESOLUTION = "resolution";
        public static final String SIZE = "_size";
        public static final String TITLE = "title";
        public static final String VOLUME_NAME = "volume_name";
        public static final String WIDTH = "width";
        public static final String WRITER = "writer";
        public static final String XMP = "xmp";
        public static final String YEAR = "year";
    }
    
    public interface DownloadColumns extends MediaColumns
    {
        public static final String DOWNLOAD_URI = "download_uri";
        public static final String REFERER_URI = "referer_uri";
    }
}
