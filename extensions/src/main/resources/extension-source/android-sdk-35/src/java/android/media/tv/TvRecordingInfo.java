package android.media.tv;

import android.os.Parcel;
import java.util.List;
import android.net.Uri;
import android.os.Parcelable;

public final class TvRecordingInfo implements Parcelable
{
    @NonNull
    public static final Creator<TvRecordingInfo> CREATOR;
    public static final int FRIDAY = 32;
    public static final int MONDAY = 2;
    public static final int RECORDING_ALL = 3;
    public static final int RECORDING_IN_PROGRESS = 2;
    public static final int RECORDING_SCHEDULED = 1;
    public static final int SATURDAY = 64;
    public static final int SUNDAY = 1;
    public static final int THURSDAY = 16;
    public static final int TUESDAY = 4;
    public static final int WEDNESDAY = 8;
    
    public TvRecordingInfo(@NonNull final String recordingId, final long startPadding, final long endPadding, final int repeatDays, @NonNull final String name, @NonNull final String description, final long scheduledStartTime, final long scheduledDuration, @NonNull final Uri channelUri, @Nullable final Uri programUri, @NonNull final List<TvContentRating> contentRatings, @Nullable final Uri recordingUri, final long recordingStartTime, final long recordingDuration) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getRecordingId() {
        throw new RuntimeException("Stub!");
    }
    
    public long getStartPaddingMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public long getEndPaddingMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRepeatDays() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public void setName(@NonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDescription(@NonNull final String description) {
        throw new RuntimeException("Stub!");
    }
    
    public long getScheduledStartTimeMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public long getScheduledDurationMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getChannelUri() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri getProgramUri() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<TvContentRating> getContentRatings() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri getRecordingUri() {
        throw new RuntimeException("Stub!");
    }
    
    public long getRecordingStartTimeMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public long getRecordingDurationMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
