package android.media.tv;

import android.os.Handler;
import java.util.List;

public final class TvInputManager
{
    public static final String ACTION_BLOCKED_RATINGS_CHANGED = "android.media.tv.action.BLOCKED_RATINGS_CHANGED";
    public static final String ACTION_PARENTAL_CONTROLS_ENABLED_CHANGED = "android.media.tv.action.PARENTAL_CONTROLS_ENABLED_CHANGED";
    public static final String ACTION_QUERY_CONTENT_RATING_SYSTEMS = "android.media.tv.action.QUERY_CONTENT_RATING_SYSTEMS";
    public static final String ACTION_SETUP_INPUTS = "android.media.tv.action.SETUP_INPUTS";
    public static final String ACTION_VIEW_RECORDING_SCHEDULES = "android.media.tv.action.VIEW_RECORDING_SCHEDULES";
    public static final int BROADCAST_INFO_STREAM_EVENT = 5;
    public static final int BROADCAST_INFO_TYPE_COMMAND = 7;
    public static final int BROADCAST_INFO_TYPE_DSMCC = 6;
    public static final int BROADCAST_INFO_TYPE_PES = 4;
    public static final int BROADCAST_INFO_TYPE_SECTION = 3;
    public static final int BROADCAST_INFO_TYPE_TABLE = 2;
    public static final int BROADCAST_INFO_TYPE_TIMELINE = 8;
    public static final int BROADCAST_INFO_TYPE_TS = 1;
    public static final int INPUT_STATE_CONNECTED = 0;
    public static final int INPUT_STATE_CONNECTED_STANDBY = 1;
    public static final int INPUT_STATE_DISCONNECTED = 2;
    public static final String META_DATA_CONTENT_RATING_SYSTEMS = "android.media.tv.metadata.CONTENT_RATING_SYSTEMS";
    public static final int RECORDING_ERROR_INSUFFICIENT_SPACE = 1;
    public static final int RECORDING_ERROR_RESOURCE_BUSY = 2;
    public static final int RECORDING_ERROR_UNKNOWN = 0;
    public static final int SIGNAL_STRENGTH_LOST = 1;
    public static final int SIGNAL_STRENGTH_STRONG = 3;
    public static final int SIGNAL_STRENGTH_WEAK = 2;
    public static final long TIME_SHIFT_INVALID_TIME = Long.MIN_VALUE;
    public static final int TIME_SHIFT_MODE_AUTO = 4;
    public static final int TIME_SHIFT_MODE_LOCAL = 2;
    public static final int TIME_SHIFT_MODE_NETWORK = 3;
    public static final int TIME_SHIFT_MODE_OFF = 1;
    public static final int TIME_SHIFT_STATUS_AVAILABLE = 3;
    public static final int TIME_SHIFT_STATUS_UNAVAILABLE = 2;
    public static final int TIME_SHIFT_STATUS_UNKNOWN = 0;
    public static final int TIME_SHIFT_STATUS_UNSUPPORTED = 1;
    public static final long TV_MESSAGE_GROUP_ID_NONE = -1L;
    public static final String TV_MESSAGE_KEY_GROUP_ID = "android.media.tv.TvInputManager.group_id";
    public static final String TV_MESSAGE_KEY_RAW_DATA = "android.media.tv.TvInputManager.raw_data";
    public static final String TV_MESSAGE_KEY_STREAM_ID = "android.media.tv.TvInputManager.stream_id";
    public static final String TV_MESSAGE_KEY_SUBTYPE = "android.media.tv.TvInputManager.subtype";
    public static final String TV_MESSAGE_SUBTYPE_CC_608E = "CTA 608-E";
    public static final String TV_MESSAGE_SUBTYPE_WATERMARKING_A335 = "ATSC A/335";
    public static final int TV_MESSAGE_TYPE_CLOSED_CAPTION = 2;
    public static final int TV_MESSAGE_TYPE_OTHER = 1000;
    public static final int TV_MESSAGE_TYPE_WATERMARK = 1;
    public static final int VIDEO_UNAVAILABLE_REASON_AUDIO_ONLY = 4;
    public static final int VIDEO_UNAVAILABLE_REASON_BUFFERING = 3;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_BLACKOUT = 16;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_CARD_INVALID = 15;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_CARD_MUTE = 14;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_INSUFFICIENT_OUTPUT_PROTECTION = 7;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_LICENSE_EXPIRED = 10;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_NEED_ACTIVATION = 11;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_NEED_PAIRING = 12;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_NO_CARD = 13;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_PVR_RECORDING_NOT_ALLOWED = 8;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_REBOOTING = 17;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_UNKNOWN = 18;
    public static final int VIDEO_UNAVAILABLE_REASON_INSUFFICIENT_RESOURCE = 6;
    public static final int VIDEO_UNAVAILABLE_REASON_NOT_CONNECTED = 5;
    public static final int VIDEO_UNAVAILABLE_REASON_TUNING = 1;
    public static final int VIDEO_UNAVAILABLE_REASON_UNKNOWN = 0;
    public static final int VIDEO_UNAVAILABLE_REASON_WEAK_SIGNAL = 2;
    
    TvInputManager() {
        throw new RuntimeException("Stub!");
    }
    
    public List<TvInputInfo> getTvInputList() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public TvInputInfo getTvInputInfo(@NonNull final String inputId) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateTvInputInfo(@NonNull final TvInputInfo inputInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public int getInputState(@NonNull final String inputId) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerCallback(@NonNull final TvInputCallback callback, @NonNull final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterCallback(@NonNull final TvInputCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isParentalControlsEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRatingBlocked(@NonNull final TvContentRating rating) {
        throw new RuntimeException("Stub!");
    }
    
    public List<TvContentRating> getBlockedRatings() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class TvInputCallback
    {
        public TvInputCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onInputStateChanged(final String inputId, final int state) {
            throw new RuntimeException("Stub!");
        }
        
        public void onInputAdded(final String inputId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onInputRemoved(final String inputId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onInputUpdated(final String inputId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTvInputInfoUpdated(final TvInputInfo inputInfo) {
            throw new RuntimeException("Stub!");
        }
    }
}
