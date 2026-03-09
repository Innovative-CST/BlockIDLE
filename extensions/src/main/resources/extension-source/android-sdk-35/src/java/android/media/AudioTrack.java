package android.media;

import android.content.Context;
import android.media.metrics.LogSessionId;
import java.util.concurrent.Executor;
import java.nio.ByteBuffer;
import android.os.Handler;
import android.os.PersistableBundle;

public class AudioTrack implements AudioRouting, VolumeAutomation
{
    public static final int DUAL_MONO_MODE_LL = 2;
    public static final int DUAL_MONO_MODE_LR = 1;
    public static final int DUAL_MONO_MODE_OFF = 0;
    public static final int DUAL_MONO_MODE_RR = 3;
    public static final int ENCAPSULATION_METADATA_TYPE_DVB_AD_DESCRIPTOR = 2;
    public static final int ENCAPSULATION_METADATA_TYPE_FRAMEWORK_TUNER = 1;
    public static final int ENCAPSULATION_METADATA_TYPE_SUPPLEMENTARY_AUDIO_PLACEMENT = 3;
    public static final int ENCAPSULATION_MODE_ELEMENTARY_STREAM = 1;
    public static final int ENCAPSULATION_MODE_NONE = 0;
    public static final int ERROR = -1;
    public static final int ERROR_BAD_VALUE = -2;
    public static final int ERROR_DEAD_OBJECT = -6;
    public static final int ERROR_INVALID_OPERATION = -3;
    public static final int MODE_STATIC = 0;
    public static final int MODE_STREAM = 1;
    public static final int PERFORMANCE_MODE_LOW_LATENCY = 1;
    public static final int PERFORMANCE_MODE_NONE = 0;
    public static final int PERFORMANCE_MODE_POWER_SAVING = 2;
    public static final int PLAYSTATE_PAUSED = 2;
    public static final int PLAYSTATE_PLAYING = 3;
    public static final int PLAYSTATE_STOPPED = 1;
    public static final int STATE_INITIALIZED = 1;
    public static final int STATE_NO_STATIC_DATA = 2;
    public static final int STATE_UNINITIALIZED = 0;
    public static final int SUCCESS = 0;
    public static final int SUPPLEMENTARY_AUDIO_PLACEMENT_LEFT = 1;
    public static final int SUPPLEMENTARY_AUDIO_PLACEMENT_NORMAL = 0;
    public static final int SUPPLEMENTARY_AUDIO_PLACEMENT_RIGHT = 2;
    public static final int WRITE_BLOCKING = 0;
    public static final int WRITE_NON_BLOCKING = 1;
    
    @Deprecated
    public AudioTrack(final int streamType, final int sampleRateInHz, final int channelConfig, final int audioFormat, final int bufferSizeInBytes, final int mode) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public AudioTrack(final int streamType, final int sampleRateInHz, final int channelConfig, final int audioFormat, final int bufferSizeInBytes, final int mode, final int sessionId) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    public AudioTrack(final AudioAttributes attributes, final AudioFormat format, final int bufferSizeInBytes, final int mode, final int sessionId) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    public void setOffloadDelayPadding(final int delayInFrames, final int paddingInFrames) {
        throw new RuntimeException("Stub!");
    }
    
    public int getOffloadDelay() {
        throw new RuntimeException("Stub!");
    }
    
    public int getOffloadPadding() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOffloadEndOfStream() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOffloadedPlayback() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static boolean isDirectPlaybackSupported(@NonNull final AudioFormat format, @NonNull final AudioAttributes attributes) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setAudioDescriptionMixLeveldB(final float level) {
        throw new RuntimeException("Stub!");
    }
    
    public float getAudioDescriptionMixLeveldB() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setDualMonoMode(final int dualMonoMode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDualMonoMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    public static float getMinVolume() {
        throw new RuntimeException("Stub!");
    }
    
    public static float getMaxVolume() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSampleRate() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPlaybackRate() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PlaybackParams getPlaybackParams() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AudioAttributes getAudioAttributes() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAudioFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStreamType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getChannelConfiguration() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AudioFormat getFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public int getChannelCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getState() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPlayState() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBufferSizeInFrames() {
        throw new RuntimeException("Stub!");
    }
    
    public int setBufferSizeInFrames(final int bufferSizeInFrames) {
        throw new RuntimeException("Stub!");
    }
    
    public int getBufferCapacityInFrames() {
        throw new RuntimeException("Stub!");
    }
    
    public int setStartThresholdInFrames(final int startThresholdInFrames) {
        throw new RuntimeException("Stub!");
    }
    
    public int getStartThresholdInFrames() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected int getNativeFrameCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNotificationMarkerPosition() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPositionNotificationPeriod() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPlaybackHeadPosition() {
        throw new RuntimeException("Stub!");
    }
    
    public int getUnderrunCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPerformanceMode() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getNativeOutputSampleRate(final int streamType) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMinBufferSize(final int sampleRateInHz, final int channelConfig, final int audioFormat) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAudioSessionId() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getTimestamp(final AudioTimestamp timestamp) {
        throw new RuntimeException("Stub!");
    }
    
    public PersistableBundle getMetrics() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPlaybackPositionUpdateListener(final OnPlaybackPositionUpdateListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPlaybackPositionUpdateListener(final OnPlaybackPositionUpdateListener listener, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int setStereoVolume(final float leftGain, final float rightGain) {
        throw new RuntimeException("Stub!");
    }
    
    public int setVolume(final float gain) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public VolumeShaper createVolumeShaper(@NonNull final VolumeShaper.Configuration configuration) {
        throw new RuntimeException("Stub!");
    }
    
    public int setPlaybackRate(final int sampleRateInHz) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPlaybackParams(@NonNull final PlaybackParams params) {
        throw new RuntimeException("Stub!");
    }
    
    public int setNotificationMarkerPosition(final int markerInFrames) {
        throw new RuntimeException("Stub!");
    }
    
    public int setPositionNotificationPeriod(final int periodInFrames) {
        throw new RuntimeException("Stub!");
    }
    
    public int setPlaybackHeadPosition(final int positionInFrames) {
        throw new RuntimeException("Stub!");
    }
    
    public int setLoopPoints(final int startInFrames, final int endInFrames, final int loopCount) {
        throw new RuntimeException("Stub!");
    }
    
    public int setPresentation(@NonNull final AudioPresentation presentation) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void setState(final int state) {
        throw new RuntimeException("Stub!");
    }
    
    public void play() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void stop() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void pause() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void flush() {
        throw new RuntimeException("Stub!");
    }
    
    public int write(@NonNull final byte[] audioData, final int offsetInBytes, final int sizeInBytes) {
        throw new RuntimeException("Stub!");
    }
    
    public int write(@NonNull final byte[] audioData, final int offsetInBytes, final int sizeInBytes, final int writeMode) {
        throw new RuntimeException("Stub!");
    }
    
    public int write(@NonNull final short[] audioData, final int offsetInShorts, final int sizeInShorts) {
        throw new RuntimeException("Stub!");
    }
    
    public int write(@NonNull final short[] audioData, final int offsetInShorts, final int sizeInShorts, final int writeMode) {
        throw new RuntimeException("Stub!");
    }
    
    public int write(@NonNull final float[] audioData, final int offsetInFloats, final int sizeInFloats, final int writeMode) {
        throw new RuntimeException("Stub!");
    }
    
    public int write(@NonNull final ByteBuffer audioData, final int sizeInBytes, final int writeMode) {
        throw new RuntimeException("Stub!");
    }
    
    public int write(@NonNull final ByteBuffer audioData, final int sizeInBytes, final int writeMode, final long timestamp) {
        throw new RuntimeException("Stub!");
    }
    
    public int reloadStaticData() {
        throw new RuntimeException("Stub!");
    }
    
    public int attachAuxEffect(final int effectId) {
        throw new RuntimeException("Stub!");
    }
    
    public int setAuxEffectSendLevel(final float level) {
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
    public void addOnRoutingChangedListener(final AudioRouting.OnRoutingChangedListener listener, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void removeOnRoutingChangedListener(final AudioRouting.OnRoutingChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void addOnRoutingChangedListener(final OnRoutingChangedListener listener, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void removeOnRoutingChangedListener(final OnRoutingChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnCodecFormatChangedListener(@NonNull final Executor executor, @NonNull final OnCodecFormatChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnCodecFormatChangedListener(@NonNull final OnCodecFormatChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerStreamEventCallback(@NonNull final Executor executor, @NonNull final StreamEventCallback eventCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterStreamEventCallback(@NonNull final StreamEventCallback eventCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLogSessionId(@NonNull final LogSessionId logSessionId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LogSessionId getLogSessionId() {
        throw new RuntimeException("Stub!");
    }
    
    public static class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setContext(@NonNull final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAudioAttributes(@NonNull final AudioAttributes attributes) throws IllegalArgumentException {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAudioFormat(@NonNull final AudioFormat format) throws IllegalArgumentException {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBufferSizeInBytes(final int bufferSizeInBytes) throws IllegalArgumentException {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEncapsulationMode(final int encapsulationMode) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTransferMode(final int mode) throws IllegalArgumentException {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSessionId(final int sessionId) throws IllegalArgumentException {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPerformanceMode(final int performanceMode) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setOffloadedPlayback(final boolean offload) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AudioTrack build() throws UnsupportedOperationException {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class MetricsConstants
    {
        @Deprecated
        public static final String CHANNELMASK = "android.media.audiorecord.channelmask";
        public static final String CONTENTTYPE = "android.media.audiotrack.type";
        @Deprecated
        public static final String SAMPLERATE = "android.media.audiorecord.samplerate";
        public static final String STREAMTYPE = "android.media.audiotrack.streamtype";
        public static final String USAGE = "android.media.audiotrack.usage";
        
        MetricsConstants() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public interface OnRoutingChangedListener extends AudioRouting.OnRoutingChangedListener
    {
        @Deprecated
        void onRoutingChanged(final AudioTrack p0);
        
        @Deprecated
        default void onRoutingChanged(final AudioRouting router) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class StreamEventCallback
    {
        public StreamEventCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onTearDown(@NonNull final AudioTrack track) {
            throw new RuntimeException("Stub!");
        }
        
        public void onPresentationEnded(@NonNull final AudioTrack track) {
            throw new RuntimeException("Stub!");
        }
        
        public void onDataRequest(@NonNull final AudioTrack track, final int sizeInFrames) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnPlaybackPositionUpdateListener
    {
        void onMarkerReached(final AudioTrack p0);
        
        void onPeriodicNotification(final AudioTrack p0);
    }
    
    public interface OnCodecFormatChangedListener
    {
        void onCodecFormatChanged(@NonNull final AudioTrack p0, @Nullable final AudioMetadataReadMap p1);
    }
}
