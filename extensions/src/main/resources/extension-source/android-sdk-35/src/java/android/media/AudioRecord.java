package android.media;

import android.content.Context;
import android.media.metrics.LogSessionId;
import java.util.concurrent.Executor;
import java.io.IOException;
import java.util.List;
import android.os.Handler;
import android.os.PersistableBundle;
import java.nio.ByteBuffer;

public class AudioRecord implements AudioRouting, MicrophoneDirection, AudioRecordingMonitor
{
    public static final int ERROR = -1;
    public static final int ERROR_BAD_VALUE = -2;
    public static final int ERROR_DEAD_OBJECT = -6;
    public static final int ERROR_INVALID_OPERATION = -3;
    public static final int READ_BLOCKING = 0;
    public static final int READ_NON_BLOCKING = 1;
    public static final int RECORDSTATE_RECORDING = 3;
    public static final int RECORDSTATE_STOPPED = 1;
    public static final int STATE_INITIALIZED = 1;
    public static final int STATE_UNINITIALIZED = 0;
    public static final int SUCCESS = 0;
    
    public AudioRecord(final int audioSource, final int sampleRateInHz, final int channelConfig, final int audioFormat, final int bufferSizeInBytes) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSampleRate() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAudioSource() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAudioFormat() {
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
    
    public int getRecordingState() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBufferSizeInFrames() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNotificationMarkerPosition() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPositionNotificationPeriod() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTimestamp(@NonNull final AudioTimestamp outTimestamp, final int timebase) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMinBufferSize(final int sampleRateInHz, final int channelConfig, final int audioFormat) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAudioSessionId() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPrivacySensitive() {
        throw new RuntimeException("Stub!");
    }
    
    public void startRecording() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void startRecording(final MediaSyncEvent syncEvent) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void stop() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public int read(@NonNull final byte[] audioData, final int offsetInBytes, final int sizeInBytes) {
        throw new RuntimeException("Stub!");
    }
    
    public int read(@NonNull final byte[] audioData, final int offsetInBytes, final int sizeInBytes, final int readMode) {
        throw new RuntimeException("Stub!");
    }
    
    public int read(@NonNull final short[] audioData, final int offsetInShorts, final int sizeInShorts) {
        throw new RuntimeException("Stub!");
    }
    
    public int read(@NonNull final short[] audioData, final int offsetInShorts, final int sizeInShorts, final int readMode) {
        throw new RuntimeException("Stub!");
    }
    
    public int read(@NonNull final float[] audioData, final int offsetInFloats, final int sizeInFloats, final int readMode) {
        throw new RuntimeException("Stub!");
    }
    
    public int read(@NonNull final ByteBuffer audioBuffer, final int sizeInBytes) {
        throw new RuntimeException("Stub!");
    }
    
    public int read(@NonNull final ByteBuffer audioBuffer, final int sizeInBytes, final int readMode) {
        throw new RuntimeException("Stub!");
    }
    
    public PersistableBundle getMetrics() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRecordPositionUpdateListener(final OnRecordPositionUpdateListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRecordPositionUpdateListener(final OnRecordPositionUpdateListener listener, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public int setNotificationMarkerPosition(final int markerInFrames) {
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
    
    public int setPositionNotificationPeriod(final int periodInFrames) {
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
    
    public List<MicrophoneInfo> getActiveMicrophones() throws IOException {
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
    
    @Override
    public boolean setPreferredMicrophoneDirection(final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean setPreferredMicrophoneFieldDimension(final float zoom) {
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
        
        public Builder setAudioSource(final int source) throws IllegalArgumentException {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setContext(@NonNull final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setAudioFormat(@NonNull final AudioFormat format) throws IllegalArgumentException {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setBufferSizeInBytes(final int bufferSizeInBytes) throws IllegalArgumentException {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAudioPlaybackCaptureConfig(@NonNull final AudioPlaybackCaptureConfiguration config) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPrivacySensitive(final boolean privacySensitive) {
            throw new RuntimeException("Stub!");
        }
        
        public AudioRecord build() throws UnsupportedOperationException {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class MetricsConstants
    {
        public static final String CHANNELS = "android.media.audiorecord.channels";
        public static final String ENCODING = "android.media.audiorecord.encoding";
        @Deprecated
        public static final String LATENCY = "android.media.audiorecord.latency";
        public static final String SAMPLERATE = "android.media.audiorecord.samplerate";
        public static final String SOURCE = "android.media.audiorecord.source";
        
        MetricsConstants() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public interface OnRoutingChangedListener extends AudioRouting.OnRoutingChangedListener
    {
        @Deprecated
        void onRoutingChanged(final AudioRecord p0);
        
        @Deprecated
        default void onRoutingChanged(final AudioRouting router) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnRecordPositionUpdateListener
    {
        void onMarkerReached(final AudioRecord p0);
        
        void onPeriodicNotification(final AudioRecord p0);
    }
}
