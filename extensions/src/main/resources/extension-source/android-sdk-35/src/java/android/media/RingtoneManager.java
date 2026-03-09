package android.media;

import java.io.FileNotFoundException;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.database.Cursor;
import android.content.Context;
import android.app.Activity;

public class RingtoneManager
{
    public static final String ACTION_RINGTONE_PICKER = "android.intent.action.RINGTONE_PICKER";
    public static final String EXTRA_RINGTONE_DEFAULT_URI = "android.intent.extra.ringtone.DEFAULT_URI";
    public static final String EXTRA_RINGTONE_EXISTING_URI = "android.intent.extra.ringtone.EXISTING_URI";
    @Deprecated
    public static final String EXTRA_RINGTONE_INCLUDE_DRM = "android.intent.extra.ringtone.INCLUDE_DRM";
    public static final String EXTRA_RINGTONE_PICKED_URI = "android.intent.extra.ringtone.PICKED_URI";
    public static final String EXTRA_RINGTONE_SHOW_DEFAULT = "android.intent.extra.ringtone.SHOW_DEFAULT";
    public static final String EXTRA_RINGTONE_SHOW_SILENT = "android.intent.extra.ringtone.SHOW_SILENT";
    public static final String EXTRA_RINGTONE_TITLE = "android.intent.extra.ringtone.TITLE";
    public static final String EXTRA_RINGTONE_TYPE = "android.intent.extra.ringtone.TYPE";
    public static final int ID_COLUMN_INDEX = 0;
    public static final int TITLE_COLUMN_INDEX = 1;
    public static final int TYPE_ALARM = 4;
    public static final int TYPE_ALL = 7;
    public static final int TYPE_NOTIFICATION = 2;
    public static final int TYPE_RINGTONE = 1;
    public static final int URI_COLUMN_INDEX = 2;
    
    public RingtoneManager(final Activity activity) {
        throw new RuntimeException("Stub!");
    }
    
    public RingtoneManager(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public void setType(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public int inferStreamType() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStopPreviousRingtone(final boolean stopPreviousRingtone) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getStopPreviousRingtone() {
        throw new RuntimeException("Stub!");
    }
    
    public void stopPreviousRingtone() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getIncludeDrm() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setIncludeDrm(final boolean includeDrm) {
        throw new RuntimeException("Stub!");
    }
    
    public Cursor getCursor() {
        throw new RuntimeException("Stub!");
    }
    
    public Ringtone getRingtone(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    public Uri getRingtoneUri(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRingtonePosition(final Uri ringtoneUri) {
        throw new RuntimeException("Stub!");
    }
    
    public static Uri getValidRingtoneUri(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public static Ringtone getRingtone(final Context context, final Uri ringtoneUri) {
        throw new RuntimeException("Stub!");
    }
    
    public static Uri getActualDefaultRingtoneUri(final Context context, final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public static void setActualDefaultRingtoneUri(final Context context, final int type, final Uri ringtoneUri) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isDefault(final Uri ringtoneUri) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getDefaultType(final Uri defaultRingtoneUri) {
        throw new RuntimeException("Stub!");
    }
    
    public static Uri getDefaultUri(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static AssetFileDescriptor openDefaultRingtoneUri(@NonNull final Context context, @NonNull final Uri uri) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasHapticChannels(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean hasHapticChannels(@NonNull final Uri ringtoneUri) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean hasHapticChannels(@NonNull final Context context, @NonNull final Uri ringtoneUri) {
        throw new RuntimeException("Stub!");
    }
}
