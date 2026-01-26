package android.os;

import java.io.File;

public class Environment
{
    public static String DIRECTORY_ALARMS;
    public static String DIRECTORY_AUDIOBOOKS;
    public static String DIRECTORY_DCIM;
    public static String DIRECTORY_DOCUMENTS;
    public static String DIRECTORY_DOWNLOADS;
    public static String DIRECTORY_MOVIES;
    public static String DIRECTORY_MUSIC;
    public static String DIRECTORY_NOTIFICATIONS;
    public static String DIRECTORY_PICTURES;
    public static String DIRECTORY_PODCASTS;
    @NonNull
    public static String DIRECTORY_RECORDINGS;
    public static String DIRECTORY_RINGTONES;
    public static String DIRECTORY_SCREENSHOTS;
    public static final String MEDIA_BAD_REMOVAL = "bad_removal";
    public static final String MEDIA_CHECKING = "checking";
    public static final String MEDIA_EJECTING = "ejecting";
    public static final String MEDIA_MOUNTED = "mounted";
    public static final String MEDIA_MOUNTED_READ_ONLY = "mounted_ro";
    public static final String MEDIA_NOFS = "nofs";
    public static final String MEDIA_REMOVED = "removed";
    public static final String MEDIA_SHARED = "shared";
    public static final String MEDIA_UNKNOWN = "unknown";
    public static final String MEDIA_UNMOUNTABLE = "unmountable";
    public static final String MEDIA_UNMOUNTED = "unmounted";
    
    public Environment() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static File getRootDirectory() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static File getStorageDirectory() {
        throw new RuntimeException("Stub!");
    }
    
    public static File getDataDirectory() {
        throw new RuntimeException("Stub!");
    }
    
    public static File getExternalStorageDirectory() {
        throw new RuntimeException("Stub!");
    }
    
    public static File getExternalStoragePublicDirectory(final String type) {
        throw new RuntimeException("Stub!");
    }
    
    public static File getDownloadCacheDirectory() {
        throw new RuntimeException("Stub!");
    }
    
    public static String getExternalStorageState() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static String getStorageState(final File path) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getExternalStorageState(final File path) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isExternalStorageRemovable() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isExternalStorageRemovable(@NonNull final File path) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isExternalStorageEmulated() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isExternalStorageEmulated(@NonNull final File path) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isExternalStorageLegacy() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isExternalStorageLegacy(@NonNull final File path) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isExternalStorageManager() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isExternalStorageManager(@NonNull final File path) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        Environment.DIRECTORY_ALARMS = "Alarms";
        Environment.DIRECTORY_AUDIOBOOKS = "Audiobooks";
        Environment.DIRECTORY_DCIM = "DCIM";
        Environment.DIRECTORY_DOCUMENTS = "Documents";
        Environment.DIRECTORY_DOWNLOADS = "Download";
        Environment.DIRECTORY_MOVIES = "Movies";
        Environment.DIRECTORY_MUSIC = "Music";
        Environment.DIRECTORY_NOTIFICATIONS = "Notifications";
        Environment.DIRECTORY_PICTURES = "Pictures";
        Environment.DIRECTORY_PODCASTS = "Podcasts";
        Environment.DIRECTORY_RECORDINGS = "Recordings";
        Environment.DIRECTORY_RINGTONES = "Ringtones";
        Environment.DIRECTORY_SCREENSHOTS = "Screenshots";
    }
}
