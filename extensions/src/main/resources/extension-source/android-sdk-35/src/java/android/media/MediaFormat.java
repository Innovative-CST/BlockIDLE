package android.media;

import java.util.List;
import android.graphics.Rect;
import java.util.Set;
import java.nio.ByteBuffer;

public final class MediaFormat
{
    public static final int COLOR_RANGE_FULL = 1;
    public static final int COLOR_RANGE_LIMITED = 2;
    public static final int COLOR_STANDARD_BT2020 = 6;
    public static final int COLOR_STANDARD_BT601_NTSC = 4;
    public static final int COLOR_STANDARD_BT601_PAL = 2;
    public static final int COLOR_STANDARD_BT709 = 1;
    public static final int COLOR_TRANSFER_HLG = 7;
    public static final int COLOR_TRANSFER_LINEAR = 1;
    public static final int COLOR_TRANSFER_SDR_VIDEO = 3;
    public static final int COLOR_TRANSFER_ST2084 = 6;
    public static final String KEY_AAC_DRC_ALBUM_MODE = "aac-drc-album-mode";
    public static final String KEY_AAC_DRC_ATTENUATION_FACTOR = "aac-drc-cut-level";
    public static final String KEY_AAC_DRC_BOOST_FACTOR = "aac-drc-boost-level";
    public static final String KEY_AAC_DRC_EFFECT_TYPE = "aac-drc-effect-type";
    public static final String KEY_AAC_DRC_HEAVY_COMPRESSION = "aac-drc-heavy-compression";
    public static final String KEY_AAC_DRC_OUTPUT_LOUDNESS = "aac-drc-output-loudness";
    public static final String KEY_AAC_DRC_TARGET_REFERENCE_LEVEL = "aac-target-ref-level";
    public static final String KEY_AAC_ENCODED_TARGET_LEVEL = "aac-encoded-target-level";
    @Deprecated
    public static final String KEY_AAC_MAX_OUTPUT_CHANNEL_COUNT = "aac-max-output-channel_count";
    public static final String KEY_AAC_PROFILE = "aac-profile";
    public static final String KEY_AAC_SBR_MODE = "aac-sbr-mode";
    public static final String KEY_ALLOW_FRAME_DROP = "allow-frame-drop";
    public static final String KEY_AUDIO_SESSION_ID = "audio-session-id";
    public static final String KEY_BITRATE_MODE = "bitrate-mode";
    public static final String KEY_BIT_RATE = "bitrate";
    public static final String KEY_BUFFER_BATCH_MAX_OUTPUT_SIZE = "buffer-batch-max-output-size";
    public static final String KEY_BUFFER_BATCH_THRESHOLD_OUTPUT_SIZE = "buffer-batch-threshold-output-size";
    public static final String KEY_CAPTION_SERVICE_NUMBER = "caption-service-number";
    public static final String KEY_CAPTURE_RATE = "capture-rate";
    public static final String KEY_CHANNEL_COUNT = "channel-count";
    public static final String KEY_CHANNEL_MASK = "channel-mask";
    public static final String KEY_CODECS_STRING = "codecs-string";
    public static final String KEY_COLOR_FORMAT = "color-format";
    public static final String KEY_COLOR_RANGE = "color-range";
    public static final String KEY_COLOR_STANDARD = "color-standard";
    public static final String KEY_COLOR_TRANSFER = "color-transfer";
    public static final String KEY_COLOR_TRANSFER_REQUEST = "color-transfer-request";
    public static final String KEY_COMPLEXITY = "complexity";
    public static final String KEY_CREATE_INPUT_SURFACE_SUSPENDED = "create-input-buffers-suspended";
    public static final String KEY_CROP_BOTTOM = "crop-bottom";
    public static final String KEY_CROP_LEFT = "crop-left";
    public static final String KEY_CROP_RIGHT = "crop-right";
    public static final String KEY_CROP_TOP = "crop-top";
    public static final String KEY_DURATION = "durationUs";
    public static final String KEY_ENCODER_DELAY = "encoder-delay";
    public static final String KEY_ENCODER_PADDING = "encoder-padding";
    public static final String KEY_FLAC_COMPRESSION_LEVEL = "flac-compression-level";
    public static final String KEY_FRAME_RATE = "frame-rate";
    public static final String KEY_GRID_COLUMNS = "grid-cols";
    public static final String KEY_GRID_ROWS = "grid-rows";
    public static final String KEY_HAPTIC_CHANNEL_COUNT = "haptic-channel-count";
    public static final String KEY_HARDWARE_AV_SYNC_ID = "hw-av-sync-id";
    public static final String KEY_HDR10_PLUS_INFO = "hdr10-plus-info";
    public static final String KEY_HDR_STATIC_INFO = "hdr-static-info";
    public static final String KEY_HEIGHT = "height";
    public static final String KEY_IMPORTANCE = "importance";
    public static final String KEY_INTRA_REFRESH_PERIOD = "intra-refresh-period";
    public static final String KEY_IS_ADTS = "is-adts";
    public static final String KEY_IS_AUTOSELECT = "is-autoselect";
    public static final String KEY_IS_DEFAULT = "is-default";
    public static final String KEY_IS_FORCED_SUBTITLE = "is-forced-subtitle";
    public static final String KEY_I_FRAME_INTERVAL = "i-frame-interval";
    public static final String KEY_LANGUAGE = "language";
    public static final String KEY_LATENCY = "latency";
    public static final String KEY_LEVEL = "level";
    public static final String KEY_LOW_LATENCY = "low-latency";
    public static final String KEY_MAX_B_FRAMES = "max-bframes";
    public static final String KEY_MAX_FPS_TO_ENCODER = "max-fps-to-encoder";
    public static final String KEY_MAX_HEIGHT = "max-height";
    public static final String KEY_MAX_INPUT_SIZE = "max-input-size";
    public static final String KEY_MAX_OUTPUT_CHANNEL_COUNT = "max-output-channel-count";
    public static final String KEY_MAX_PTS_GAP_TO_ENCODER = "max-pts-gap-to-encoder";
    public static final String KEY_MAX_WIDTH = "max-width";
    public static final String KEY_MIME = "mime";
    public static final String KEY_MPEGH_COMPATIBLE_SETS = "mpegh-compatible-sets";
    public static final String KEY_MPEGH_PROFILE_LEVEL_INDICATION = "mpegh-profile-level-indication";
    public static final String KEY_MPEGH_REFERENCE_CHANNEL_LAYOUT = "mpegh-reference-channel-layout";
    public static final String KEY_OPERATING_RATE = "operating-rate";
    public static final String KEY_OUTPUT_REORDER_DEPTH = "output-reorder-depth";
    public static final String KEY_PCM_ENCODING = "pcm-encoding";
    public static final String KEY_PICTURE_TYPE = "picture-type";
    public static final String KEY_PIXEL_ASPECT_RATIO_HEIGHT = "sar-height";
    public static final String KEY_PIXEL_ASPECT_RATIO_WIDTH = "sar-width";
    public static final String KEY_PREPEND_HEADER_TO_SYNC_FRAMES = "prepend-sps-pps-to-idr-frames";
    public static final String KEY_PRIORITY = "priority";
    public static final String KEY_PROFILE = "profile";
    public static final String KEY_PUSH_BLANK_BUFFERS_ON_STOP = "push-blank-buffers-on-shutdown";
    public static final String KEY_QUALITY = "quality";
    public static final String KEY_REPEAT_PREVIOUS_FRAME_AFTER = "repeat-previous-frame-after";
    public static final String KEY_ROTATION = "rotation-degrees";
    public static final String KEY_SAMPLE_RATE = "sample-rate";
    public static final String KEY_SLICE_HEIGHT = "slice-height";
    public static final String KEY_SLOW_MOTION_MARKERS = "slow-motion-markers";
    public static final String KEY_STRIDE = "stride";
    public static final String KEY_TEMPORAL_LAYERING = "ts-schema";
    public static final String KEY_TILE_HEIGHT = "tile-height";
    public static final String KEY_TILE_WIDTH = "tile-width";
    public static final String KEY_TRACK_ID = "track-id";
    public static final String KEY_VIDEO_ENCODING_STATISTICS_LEVEL = "video-encoding-statistics-level";
    public static final String KEY_VIDEO_QP_AVERAGE = "video-qp-average";
    public static final String KEY_VIDEO_QP_B_MAX = "video-qp-b-max";
    public static final String KEY_VIDEO_QP_B_MIN = "video-qp-b-min";
    public static final String KEY_VIDEO_QP_I_MAX = "video-qp-i-max";
    public static final String KEY_VIDEO_QP_I_MIN = "video-qp-i-min";
    public static final String KEY_VIDEO_QP_MAX = "video-qp-max";
    public static final String KEY_VIDEO_QP_MIN = "video-qp-min";
    public static final String KEY_VIDEO_QP_P_MAX = "video-qp-p-max";
    public static final String KEY_VIDEO_QP_P_MIN = "video-qp-p-min";
    public static final String KEY_WIDTH = "width";
    public static final String LOG_SESSION_ID = "log-session-id";
    public static final String MIMETYPE_AUDIO_AAC = "audio/mp4a-latm";
    public static final String MIMETYPE_AUDIO_AAC_ELD = "audio/mp4a.40.39";
    public static final String MIMETYPE_AUDIO_AAC_HE_V1 = "audio/mp4a.40.05";
    public static final String MIMETYPE_AUDIO_AAC_HE_V2 = "audio/mp4a.40.29";
    public static final String MIMETYPE_AUDIO_AAC_LC = "audio/mp4a.40.02";
    public static final String MIMETYPE_AUDIO_AAC_XHE = "audio/mp4a.40.42";
    public static final String MIMETYPE_AUDIO_AC3 = "audio/ac3";
    public static final String MIMETYPE_AUDIO_AC4 = "audio/ac4";
    public static final String MIMETYPE_AUDIO_AMR_NB = "audio/3gpp";
    public static final String MIMETYPE_AUDIO_AMR_WB = "audio/amr-wb";
    public static final String MIMETYPE_AUDIO_DOLBY_MAT = "audio/vnd.dolby.mat";
    public static final String MIMETYPE_AUDIO_DOLBY_TRUEHD = "audio/vnd.dolby.mlp";
    public static final String MIMETYPE_AUDIO_DRA = "audio/vnd.dra";
    public static final String MIMETYPE_AUDIO_DTS = "audio/vnd.dts";
    public static final String MIMETYPE_AUDIO_DTS_HD = "audio/vnd.dts.hd";
    public static final String MIMETYPE_AUDIO_DTS_UHD = "audio/vnd.dts.uhd";
    public static final String MIMETYPE_AUDIO_EAC3 = "audio/eac3";
    public static final String MIMETYPE_AUDIO_EAC3_JOC = "audio/eac3-joc";
    public static final String MIMETYPE_AUDIO_FLAC = "audio/flac";
    public static final String MIMETYPE_AUDIO_G711_ALAW = "audio/g711-alaw";
    public static final String MIMETYPE_AUDIO_G711_MLAW = "audio/g711-mlaw";
    public static final String MIMETYPE_AUDIO_IEC61937 = "audio/x-iec61937";
    public static final String MIMETYPE_AUDIO_MPEG = "audio/mpeg";
    public static final String MIMETYPE_AUDIO_MPEGH_BL_L3 = "audio/mhm1.03";
    public static final String MIMETYPE_AUDIO_MPEGH_BL_L4 = "audio/mhm1.04";
    public static final String MIMETYPE_AUDIO_MPEGH_LC_L3 = "audio/mhm1.0d";
    public static final String MIMETYPE_AUDIO_MPEGH_LC_L4 = "audio/mhm1.0e";
    public static final String MIMETYPE_AUDIO_MPEGH_MHA1 = "audio/mha1";
    public static final String MIMETYPE_AUDIO_MPEGH_MHM1 = "audio/mhm1";
    public static final String MIMETYPE_AUDIO_MSGSM = "audio/gsm";
    public static final String MIMETYPE_AUDIO_OPUS = "audio/opus";
    public static final String MIMETYPE_AUDIO_QCELP = "audio/qcelp";
    public static final String MIMETYPE_AUDIO_RAW = "audio/raw";
    public static final String MIMETYPE_AUDIO_SCRAMBLED = "audio/scrambled";
    public static final String MIMETYPE_AUDIO_VORBIS = "audio/vorbis";
    public static final String MIMETYPE_IMAGE_ANDROID_HEIC = "image/vnd.android.heic";
    public static final String MIMETYPE_IMAGE_AVIF = "image/avif";
    public static final String MIMETYPE_TEXT_CEA_608 = "text/cea-608";
    public static final String MIMETYPE_TEXT_CEA_708 = "text/cea-708";
    public static final String MIMETYPE_TEXT_SUBRIP = "application/x-subrip";
    public static final String MIMETYPE_TEXT_VTT = "text/vtt";
    public static final String MIMETYPE_VIDEO_AV1 = "video/av01";
    public static final String MIMETYPE_VIDEO_AVC = "video/avc";
    public static final String MIMETYPE_VIDEO_DOLBY_VISION = "video/dolby-vision";
    public static final String MIMETYPE_VIDEO_H263 = "video/3gpp";
    public static final String MIMETYPE_VIDEO_HEVC = "video/hevc";
    public static final String MIMETYPE_VIDEO_MPEG2 = "video/mpeg2";
    public static final String MIMETYPE_VIDEO_MPEG4 = "video/mp4v-es";
    public static final String MIMETYPE_VIDEO_RAW = "video/raw";
    public static final String MIMETYPE_VIDEO_SCRAMBLED = "video/scrambled";
    public static final String MIMETYPE_VIDEO_VP8 = "video/x-vnd.on2.vp8";
    public static final String MIMETYPE_VIDEO_VP9 = "video/x-vnd.on2.vp9";
    public static final int PICTURE_TYPE_B = 3;
    public static final int PICTURE_TYPE_I = 1;
    public static final int PICTURE_TYPE_P = 2;
    public static final int PICTURE_TYPE_UNKNOWN = 0;
    public static final int TYPE_BYTE_BUFFER = 5;
    public static final int TYPE_FLOAT = 3;
    public static final int TYPE_INTEGER = 1;
    public static final int TYPE_LONG = 2;
    public static final int TYPE_NULL = 0;
    public static final int TYPE_STRING = 4;
    public static final int VIDEO_ENCODING_STATISTICS_LEVEL_1 = 1;
    public static final int VIDEO_ENCODING_STATISTICS_LEVEL_NONE = 0;
    
    public MediaFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public MediaFormat(@NonNull final MediaFormat other) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean containsKey(@NonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean containsFeature(@NonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public int getValueTypeForKey(@NonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Number getNumber(@NonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Number getNumber(@NonNull final String name, @NonNull final Number defaultValue) {
        throw new RuntimeException("Stub!");
    }
    
    public int getInteger(@NonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public int getInteger(@NonNull final String name, final int defaultValue) {
        throw new RuntimeException("Stub!");
    }
    
    public long getLong(@NonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public long getLong(@NonNull final String name, final long defaultValue) {
        throw new RuntimeException("Stub!");
    }
    
    public float getFloat(@NonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public float getFloat(@NonNull final String name, final float defaultValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getString(@NonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getString(@NonNull final String name, @NonNull final String defaultValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ByteBuffer getByteBuffer(@NonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ByteBuffer getByteBuffer(@NonNull final String name, @NonNull final ByteBuffer defaultValue) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getFeatureEnabled(@NonNull final String feature) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInteger(@NonNull final String name, final int value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLong(@NonNull final String name, final long value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFloat(@NonNull final String name, final float value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setString(@NonNull final String name, @Nullable final String value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setByteBuffer(@NonNull final String name, @Nullable final ByteBuffer bytes) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeKey(@NonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeFeature(@NonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getKeys() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getFeatures() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFeatureEnabled(@NonNull final String feature, final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static MediaFormat createAudioFormat(@NonNull final String mime, final int sampleRate, final int channelCount) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static MediaFormat createSubtitleFormat(@NonNull final String mime, final String language) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static MediaFormat createVideoFormat(@NonNull final String mime, final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class QpOffsetRect
    {
        public QpOffsetRect(@NonNull final Rect contour, final int qpOffset) {
            throw new RuntimeException("Stub!");
        }
        
        public void set(@NonNull final Rect contour, final int qpOffset) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String flattenToString() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static String flattenToString(@NonNull final List<QpOffsetRect> qpOffsetRects) {
            throw new RuntimeException("Stub!");
        }
    }
}
