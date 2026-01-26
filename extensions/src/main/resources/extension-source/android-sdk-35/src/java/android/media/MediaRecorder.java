package android.media;

import android.os.PersistableBundle;
import java.util.concurrent.Executor;
import java.util.List;
import android.os.Handler;
import java.io.IOException;
import java.io.File;
import java.io.FileDescriptor;
import android.view.Surface;
import android.hardware.Camera;
import android.media.metrics.LogSessionId;
import android.content.Context;

public class MediaRecorder implements AudioRouting, AudioRecordingMonitor, MicrophoneDirection
{
    public static final int MEDIA_ERROR_SERVER_DIED = 100;
    public static final int MEDIA_RECORDER_ERROR_UNKNOWN = 1;
    public static final int MEDIA_RECORDER_INFO_MAX_DURATION_REACHED = 800;
    public static final int MEDIA_RECORDER_INFO_MAX_FILESIZE_APPROACHING = 802;
    public static final int MEDIA_RECORDER_INFO_MAX_FILESIZE_REACHED = 801;
    public static final int MEDIA_RECORDER_INFO_NEXT_OUTPUT_FILE_STARTED = 803;
    public static final int MEDIA_RECORDER_INFO_UNKNOWN = 1;
    
    @Deprecated
    public MediaRecorder() {
        throw new RuntimeException("Stub!");
    }
    
    public MediaRecorder(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLogSessionId(@NonNull final LogSessionId id) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LogSessionId getLogSessionId() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public native void setCamera(final Camera p0);
    
    public native Surface getSurface();
    
    public void setInputSurface(@NonNull final Surface surface) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPreviewDisplay(final Surface sv) {
        throw new RuntimeException("Stub!");
    }
    
    public native void setAudioSource(final int p0) throws IllegalStateException;
    
    public static final int getAudioSourceMax() {
        throw new RuntimeException("Stub!");
    }
    
    public native void setPrivacySensitive(final boolean p0);
    
    public native boolean isPrivacySensitive();
    
    public native void setVideoSource(final int p0) throws IllegalStateException;
    
    public void setProfile(final CamcorderProfile profile) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAudioProfile(@NonNull final EncoderProfiles.AudioProfile profile) {
        throw new RuntimeException("Stub!");
    }
    
    public void setVideoProfile(@NonNull final EncoderProfiles.VideoProfile profile) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCaptureRate(final double fps) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOrientationHint(final int degrees) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLocation(final float latitude, final float longitude) {
        throw new RuntimeException("Stub!");
    }
    
    public native void setOutputFormat(final int p0) throws IllegalStateException;
    
    public native void setVideoSize(final int p0, final int p1) throws IllegalStateException;
    
    public native void setVideoFrameRate(final int p0) throws IllegalStateException;
    
    public native void setMaxDuration(final int p0) throws IllegalArgumentException;
    
    public native void setMaxFileSize(final long p0) throws IllegalArgumentException;
    
    public native void setAudioEncoder(final int p0) throws IllegalStateException;
    
    public native void setVideoEncoder(final int p0) throws IllegalStateException;
    
    public void setAudioSamplingRate(final int samplingRate) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAudioChannels(final int numChannels) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAudioEncodingBitRate(final int bitRate) {
        throw new RuntimeException("Stub!");
    }
    
    public void setVideoEncodingBitRate(final int bitRate) {
        throw new RuntimeException("Stub!");
    }
    
    public void setVideoEncodingProfileLevel(final int profile, final int level) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOutputFile(final FileDescriptor fd) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void setOutputFile(final File file) {
        throw new RuntimeException("Stub!");
    }
    
    public void setNextOutputFile(final FileDescriptor fd) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void setOutputFile(final String path) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void setNextOutputFile(final File file) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void prepare() throws IOException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public native void start() throws IllegalStateException;
    
    public native void stop() throws IllegalStateException;
    
    public native void pause() throws IllegalStateException;
    
    public native void resume() throws IllegalStateException;
    
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    public native int getMaxAmplitude() throws IllegalStateException;
    
    public void setOnErrorListener(final OnErrorListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnInfoListener(final OnInfoListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean setPreferredDevice(final AudioDeviceInfo deviceInfo) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public AudioDeviceInfo getPreferredDevice() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public AudioDeviceInfo getRoutedDevice() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addOnRoutingChangedListener(final OnRoutingChangedListener listener, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void removeOnRoutingChangedListener(final OnRoutingChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public List<MicrophoneInfo> getActiveMicrophones() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean setPreferredMicrophoneDirection(final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean setPreferredMicrophoneFieldDimension(final float zoom) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void registerAudioRecordingCallback(@NonNull final Executor executor, @NonNull final AudioManager.AudioRecordingCallback cb) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void unregisterAudioRecordingCallback(@NonNull final AudioManager.AudioRecordingCallback cb) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public AudioRecordingConfiguration getActiveRecordingConfiguration() {
        throw new RuntimeException("Stub!");
    }
    
    public native void release();
    
    public PersistableBundle getMetrics() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    public final class AudioEncoder
    {
        public static final int AAC = 3;
        public static final int AAC_ELD = 5;
        public static final int AMR_NB = 1;
        public static final int AMR_WB = 2;
        public static final int DEFAULT = 0;
        public static final int HE_AAC = 4;
        public static final int OPUS = 7;
        public static final int VORBIS = 6;
        
        AudioEncoder() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public final class AudioSource
    {
        public static final int CAMCORDER = 5;
        public static final int DEFAULT = 0;
        public static final int MIC = 1;
        public static final int REMOTE_SUBMIX = 8;
        public static final int UNPROCESSED = 9;
        public static final int VOICE_CALL = 4;
        public static final int VOICE_COMMUNICATION = 7;
        public static final int VOICE_DOWNLINK = 3;
        public static final int VOICE_PERFORMANCE = 10;
        public static final int VOICE_RECOGNITION = 6;
        public static final int VOICE_UPLINK = 2;
        
        AudioSource() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class MetricsConstants
    {
        public static final String AUDIO_BITRATE = "android.media.mediarecorder.audio-bitrate";
        public static final String AUDIO_CHANNELS = "android.media.mediarecorder.audio-channels";
        public static final String AUDIO_SAMPLERATE = "android.media.mediarecorder.audio-samplerate";
        public static final String AUDIO_TIMESCALE = "android.media.mediarecorder.audio-timescale";
        public static final String CAPTURE_FPS = "android.media.mediarecorder.capture-fps";
        public static final String CAPTURE_FPS_ENABLE = "android.media.mediarecorder.capture-fpsenable";
        public static final String FRAMERATE = "android.media.mediarecorder.frame-rate";
        public static final String HEIGHT = "android.media.mediarecorder.height";
        public static final String MOVIE_TIMESCALE = "android.media.mediarecorder.movie-timescale";
        public static final String ROTATION = "android.media.mediarecorder.rotation";
        public static final String VIDEO_BITRATE = "android.media.mediarecorder.video-bitrate";
        public static final String VIDEO_IFRAME_INTERVAL = "android.media.mediarecorder.video-iframe-interval";
        public static final String VIDEO_LEVEL = "android.media.mediarecorder.video-encoder-level";
        public static final String VIDEO_PROFILE = "android.media.mediarecorder.video-encoder-profile";
        public static final String VIDEO_TIMESCALE = "android.media.mediarecorder.video-timescale";
        public static final String WIDTH = "android.media.mediarecorder.width";
        
        MetricsConstants() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public final class OutputFormat
    {
        public static final int AAC_ADTS = 6;
        public static final int AMR_NB = 3;
        public static final int AMR_WB = 4;
        public static final int DEFAULT = 0;
        public static final int MPEG_2_TS = 8;
        public static final int MPEG_4 = 2;
        public static final int OGG = 11;
        @Deprecated
        public static final int RAW_AMR = 3;
        public static final int THREE_GPP = 1;
        public static final int WEBM = 9;
        
        OutputFormat() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public final class VideoEncoder
    {
        public static final int AV1 = 8;
        public static final int DEFAULT = 0;
        public static final int DOLBY_VISION = 7;
        public static final int H263 = 1;
        public static final int H264 = 2;
        public static final int HEVC = 5;
        public static final int MPEG_4_SP = 3;
        public static final int VP8 = 4;
        public static final int VP9 = 6;
        
        VideoEncoder() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public final class VideoSource
    {
        public static final int CAMERA = 1;
        public static final int DEFAULT = 0;
        public static final int SURFACE = 2;
        
        VideoSource() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnInfoListener
    {
        void onInfo(final MediaRecorder p0, final int p1, final int p2);
    }
    
    public interface OnErrorListener
    {
        void onError(final MediaRecorder p0, final int p1, final int p2);
    }
}
