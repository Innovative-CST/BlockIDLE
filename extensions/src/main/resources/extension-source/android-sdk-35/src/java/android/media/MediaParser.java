package android.media;

import android.util.Pair;
import android.media.metrics.LogSessionId;
import java.io.IOException;
import java.util.List;

public final class MediaParser
{
    public static final String PARAMETER_ADTS_ENABLE_CBR_SEEKING = "android.media.mediaparser.adts.enableCbrSeeking";
    public static final String PARAMETER_AMR_ENABLE_CBR_SEEKING = "android.media.mediaparser.amr.enableCbrSeeking";
    public static final String PARAMETER_FLAC_DISABLE_ID3 = "android.media.mediaparser.flac.disableId3";
    public static final String PARAMETER_MATROSKA_DISABLE_CUES_SEEKING = "android.media.mediaparser.matroska.disableCuesSeeking";
    public static final String PARAMETER_MP3_DISABLE_ID3 = "android.media.mediaparser.mp3.disableId3";
    public static final String PARAMETER_MP3_ENABLE_CBR_SEEKING = "android.media.mediaparser.mp3.enableCbrSeeking";
    public static final String PARAMETER_MP3_ENABLE_INDEX_SEEKING = "android.media.mediaparser.mp3.enableIndexSeeking";
    public static final String PARAMETER_MP4_IGNORE_EDIT_LISTS = "android.media.mediaparser.mp4.ignoreEditLists";
    public static final String PARAMETER_MP4_IGNORE_TFDT_BOX = "android.media.mediaparser.mp4.ignoreTfdtBox";
    public static final String PARAMETER_MP4_TREAT_VIDEO_FRAMES_AS_KEYFRAMES = "android.media.mediaparser.mp4.treatVideoFramesAsKeyframes";
    public static final String PARAMETER_TS_ALLOW_NON_IDR_AVC_KEYFRAMES = "android.media.mediaparser.ts.allowNonIdrAvcKeyframes";
    public static final String PARAMETER_TS_DETECT_ACCESS_UNITS = "android.media.mediaparser.ts.ignoreDetectAccessUnits";
    public static final String PARAMETER_TS_ENABLE_HDMV_DTS_AUDIO_STREAMS = "android.media.mediaparser.ts.enableHdmvDtsAudioStreams";
    public static final String PARAMETER_TS_IGNORE_AAC_STREAM = "android.media.mediaparser.ts.ignoreAacStream";
    public static final String PARAMETER_TS_IGNORE_AVC_STREAM = "android.media.mediaparser.ts.ignoreAvcStream";
    public static final String PARAMETER_TS_IGNORE_SPLICE_INFO_STREAM = "android.media.mediaparser.ts.ignoreSpliceInfoStream";
    public static final String PARAMETER_TS_MODE = "android.media.mediaparser.ts.mode";
    public static final String PARSER_NAME_AC3 = "android.media.mediaparser.Ac3Parser";
    public static final String PARSER_NAME_AC4 = "android.media.mediaparser.Ac4Parser";
    public static final String PARSER_NAME_ADTS = "android.media.mediaparser.AdtsParser";
    public static final String PARSER_NAME_AMR = "android.media.mediaparser.AmrParser";
    public static final String PARSER_NAME_FLAC = "android.media.mediaparser.FlacParser";
    public static final String PARSER_NAME_FLV = "android.media.mediaparser.FlvParser";
    public static final String PARSER_NAME_FMP4 = "android.media.mediaparser.FragmentedMp4Parser";
    public static final String PARSER_NAME_MATROSKA = "android.media.mediaparser.MatroskaParser";
    public static final String PARSER_NAME_MP3 = "android.media.mediaparser.Mp3Parser";
    public static final String PARSER_NAME_MP4 = "android.media.mediaparser.Mp4Parser";
    public static final String PARSER_NAME_OGG = "android.media.mediaparser.OggParser";
    public static final String PARSER_NAME_PS = "android.media.mediaparser.PsParser";
    public static final String PARSER_NAME_TS = "android.media.mediaparser.TsParser";
    public static final String PARSER_NAME_UNKNOWN = "android.media.mediaparser.UNKNOWN";
    public static final String PARSER_NAME_WAV = "android.media.mediaparser.WavParser";
    public static final int SAMPLE_FLAG_DECODE_ONLY = Integer.MIN_VALUE;
    public static final int SAMPLE_FLAG_ENCRYPTED = 1073741824;
    public static final int SAMPLE_FLAG_HAS_SUPPLEMENTAL_DATA = 268435456;
    public static final int SAMPLE_FLAG_KEY_FRAME = 1;
    public static final int SAMPLE_FLAG_LAST_SAMPLE = 536870912;
    
    MediaParser() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static MediaParser createByName(@NonNull final String name, @NonNull final OutputConsumer outputConsumer) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static MediaParser create(@NonNull final OutputConsumer outputConsumer, @NonNull final String... parserNames) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static List<String> getParserNames(@NonNull final MediaFormat mediaFormat) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public MediaParser setParameter(@NonNull final String parameterName, @NonNull final Object value) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean supportsParameter(@NonNull final String parameterName) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getParserName() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean advance(@NonNull final SeekableInputReader seekableInputReader) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void seek(@NonNull final SeekPoint seekPoint) {
        throw new RuntimeException("Stub!");
    }
    
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLogSessionId(@NonNull final LogSessionId logSessionId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LogSessionId getLogSessionId() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class ParsingException extends IOException
    {
        ParsingException() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class SeekMap
    {
        public static final int UNKNOWN_DURATION = Integer.MIN_VALUE;
        
        SeekMap() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isSeekable() {
            throw new RuntimeException("Stub!");
        }
        
        public long getDurationMicros() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Pair<SeekPoint, SeekPoint> getSeekPoints(final long timeMicros) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class SeekPoint
    {
        @NonNull
        public static final SeekPoint START;
        public final long position;
        public final long timeMicros;
        
        SeekPoint() {
            this.position = 0L;
            this.timeMicros = 0L;
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object obj) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            START = null;
        }
    }
    
    public static final class TrackData
    {
        @Nullable
        public final DrmInitData drmInitData;
        @NonNull
        public final MediaFormat mediaFormat;
        
        TrackData() {
            this.drmInitData = null;
            this.mediaFormat = null;
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class UnrecognizedInputFormatException extends IOException
    {
        UnrecognizedInputFormatException() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface SeekableInputReader extends InputReader
    {
        void seekToPosition(final long p0);
    }
    
    public interface InputReader
    {
        int read(@NonNull final byte[] p0, final int p1, final int p2) throws IOException;
        
        long getPosition();
        
        long getLength();
    }
    
    public interface OutputConsumer
    {
        void onSeekMapFound(@NonNull final SeekMap p0);
        
        void onTrackCountFound(final int p0);
        
        void onTrackDataFound(final int p0, @NonNull final TrackData p1);
        
        void onSampleDataFound(final int p0, @NonNull final InputReader p1) throws IOException;
        
        void onSampleCompleted(final int p0, final long p1, final int p2, final int p3, final int p4, @Nullable final MediaCodec.CryptoInfo p5);
    }
}
