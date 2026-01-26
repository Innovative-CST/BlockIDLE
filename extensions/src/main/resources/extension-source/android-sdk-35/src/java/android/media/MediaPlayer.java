package android.media;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import android.os.PersistableBundle;
import android.os.Handler;
import java.io.FileDescriptor;
import android.content.res.AssetFileDescriptor;
import java.net.HttpCookie;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.content.Context;

public class MediaPlayer implements VolumeAutomation, AudioRouting
{
    public static final int MEDIA_ERROR_IO = -1004;
    public static final int MEDIA_ERROR_MALFORMED = -1007;
    public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
    public static final int MEDIA_ERROR_SERVER_DIED = 100;
    public static final int MEDIA_ERROR_TIMED_OUT = -110;
    public static final int MEDIA_ERROR_UNKNOWN = 1;
    public static final int MEDIA_ERROR_UNSUPPORTED = -1010;
    public static final int MEDIA_INFO_AUDIO_NOT_PLAYING = 804;
    public static final int MEDIA_INFO_BAD_INTERLEAVING = 800;
    public static final int MEDIA_INFO_BUFFERING_END = 702;
    public static final int MEDIA_INFO_BUFFERING_START = 701;
    public static final int MEDIA_INFO_METADATA_UPDATE = 802;
    public static final int MEDIA_INFO_NOT_SEEKABLE = 801;
    public static final int MEDIA_INFO_STARTED_AS_NEXT = 2;
    public static final int MEDIA_INFO_SUBTITLE_TIMED_OUT = 902;
    public static final int MEDIA_INFO_UNKNOWN = 1;
    public static final int MEDIA_INFO_UNSUPPORTED_SUBTITLE = 901;
    public static final int MEDIA_INFO_VIDEO_NOT_PLAYING = 805;
    public static final int MEDIA_INFO_VIDEO_RENDERING_START = 3;
    public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = 700;
    @Deprecated
    public static final String MEDIA_MIMETYPE_TEXT_SUBRIP = "application/x-subrip";
    public static final int PREPARE_DRM_STATUS_PREPARATION_ERROR = 3;
    public static final int PREPARE_DRM_STATUS_PROVISIONING_NETWORK_ERROR = 1;
    public static final int PREPARE_DRM_STATUS_PROVISIONING_SERVER_ERROR = 2;
    public static final int PREPARE_DRM_STATUS_SUCCESS = 0;
    public static final int SEEK_CLOSEST = 3;
    public static final int SEEK_CLOSEST_SYNC = 2;
    public static final int SEEK_NEXT_SYNC = 1;
    public static final int SEEK_PREVIOUS_SYNC = 0;
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = 1;
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = 2;
    
    public MediaPlayer() {
        throw new RuntimeException("Stub!");
    }
    
    public MediaPlayer(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDisplay(final SurfaceHolder sh) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSurface(final Surface surface) {
        throw new RuntimeException("Stub!");
    }
    
    public void setVideoScalingMode(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public static MediaPlayer create(final Context context, final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    public static MediaPlayer create(final Context context, final Uri uri, final SurfaceHolder holder) {
        throw new RuntimeException("Stub!");
    }
    
    public static MediaPlayer create(final Context context, final Uri uri, final SurfaceHolder holder, final AudioAttributes audioAttributes, final int audioSessionId) {
        throw new RuntimeException("Stub!");
    }
    
    public static MediaPlayer create(final Context context, final int resid) {
        throw new RuntimeException("Stub!");
    }
    
    public static MediaPlayer create(final Context context, final int resid, final AudioAttributes audioAttributes, final int audioSessionId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSource(@NonNull final Context context, @NonNull final Uri uri) throws IOException, IllegalArgumentException, IllegalStateException, SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSource(@NonNull final Context context, @NonNull final Uri uri, @Nullable final Map<String, String> headers, @Nullable final List<HttpCookie> cookies) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSource(@NonNull final Context context, @NonNull final Uri uri, @Nullable final Map<String, String> headers) throws IOException, IllegalArgumentException, IllegalStateException, SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSource(final String path) throws IOException, IllegalArgumentException, IllegalStateException, SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSource(@NonNull final AssetFileDescriptor afd) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSource(final FileDescriptor fd) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSource(final FileDescriptor fd, final long offset, final long length) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSource(final MediaDataSource dataSource) throws IllegalArgumentException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void prepare() throws IOException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void prepareAsync() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void start() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void stop() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void pause() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public VolumeShaper createVolumeShaper(@NonNull final VolumeShaper.Configuration configuration) {
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
    
    public void setWakeMode(final Context context, final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setScreenOnWhilePlaying(final boolean screenOn) {
        throw new RuntimeException("Stub!");
    }
    
    public native int getVideoWidth();
    
    public native int getVideoHeight();
    
    public PersistableBundle getMetrics() {
        throw new RuntimeException("Stub!");
    }
    
    public native boolean isPlaying();
    
    public native void setPlaybackParams(@NonNull final PlaybackParams p0);
    
    @NonNull
    public native PlaybackParams getPlaybackParams();
    
    public native void setSyncParams(@NonNull final SyncParams p0);
    
    @NonNull
    public native SyncParams getSyncParams();
    
    public void seekTo(final long msec, final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public void seekTo(final int msec) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MediaTimestamp getTimestamp() {
        throw new RuntimeException("Stub!");
    }
    
    public native int getCurrentPosition();
    
    public native int getDuration();
    
    public native void setNextMediaPlayer(final MediaPlayer p0);
    
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setAudioStreamType(final int streamtype) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAudioAttributes(final AudioAttributes attributes) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    public native void setLooping(final boolean p0);
    
    public native boolean isLooping();
    
    public void setVolume(final float leftVolume, final float rightVolume) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAudioSessionId(final int sessionId) throws IllegalArgumentException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public native int getAudioSessionId();
    
    public native void attachAuxEffect(final int p0);
    
    public void setAuxEffectSendLevel(final float level) {
        throw new RuntimeException("Stub!");
    }
    
    public TrackInfo[] getTrackInfo() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void addTimedTextSource(final String path, final String mimeType) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void addTimedTextSource(final Context context, final Uri uri, final String mimeType) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void addTimedTextSource(final FileDescriptor fd, final String mimeType) throws IllegalArgumentException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void addTimedTextSource(final FileDescriptor fd, final long offset, final long length, final String mime) throws IllegalArgumentException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public int getSelectedTrack(final int trackType) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void selectTrack(final int index) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void deselectTrack(final int index) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnPreparedListener(final OnPreparedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnCompletionListener(final OnCompletionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnBufferingUpdateListener(final OnBufferingUpdateListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnSeekCompleteListener(final OnSeekCompleteListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnVideoSizeChangedListener(final OnVideoSizeChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnTimedTextListener(final OnTimedTextListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnSubtitleDataListener(@NonNull final OnSubtitleDataListener listener, @NonNull final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnSubtitleDataListener(@NonNull final OnSubtitleDataListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearOnSubtitleDataListener() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnMediaTimeDiscontinuityListener(@NonNull final OnMediaTimeDiscontinuityListener listener, @NonNull final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnMediaTimeDiscontinuityListener(@NonNull final OnMediaTimeDiscontinuityListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearOnMediaTimeDiscontinuityListener() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnTimedMetaDataAvailableListener(final OnTimedMetaDataAvailableListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnErrorListener(final OnErrorListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnInfoListener(final OnInfoListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnDrmConfigHelper(final OnDrmConfigHelper listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnDrmInfoListener(final OnDrmInfoListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnDrmInfoListener(final OnDrmInfoListener listener, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnDrmPreparedListener(final OnDrmPreparedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnDrmPreparedListener(final OnDrmPreparedListener listener, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public DrmInfo getDrmInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public void prepareDrm(@NonNull final UUID uuid) throws ProvisioningNetworkErrorException, ProvisioningServerErrorException, ResourceBusyException, UnsupportedSchemeException {
        throw new RuntimeException("Stub!");
    }
    
    public void releaseDrm() throws NoDrmSchemeException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public MediaDrm.KeyRequest getKeyRequest(@Nullable final byte[] keySetId, @Nullable final byte[] initData, @Nullable final String mimeType, final int keyType, @Nullable final Map<String, String> optionalParameters) throws NoDrmSchemeException {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] provideKeyResponse(@Nullable final byte[] keySetId, @NonNull final byte[] response) throws DeniedByServerException, NoDrmSchemeException {
        throw new RuntimeException("Stub!");
    }
    
    public void restoreKeys(@NonNull final byte[] keySetId) throws NoDrmSchemeException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getDrmPropertyString(@NonNull final String propertyName) throws NoDrmSchemeException {
        throw new RuntimeException("Stub!");
    }
    
    public void setDrmPropertyString(@NonNull final String propertyName, @NonNull final String value) throws NoDrmSchemeException {
        throw new RuntimeException("Stub!");
    }
    
    public static final class DrmInfo
    {
        DrmInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public Map<UUID, byte[]> getPssh() {
            throw new RuntimeException("Stub!");
        }
        
        public UUID[] getSupportedSchemes() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class MetricsConstants
    {
        public static final String CODEC_AUDIO = "android.media.mediaplayer.audio.codec";
        public static final String CODEC_VIDEO = "android.media.mediaplayer.video.codec";
        public static final String DURATION = "android.media.mediaplayer.durationMs";
        public static final String ERRORS = "android.media.mediaplayer.err";
        public static final String ERROR_CODE = "android.media.mediaplayer.errcode";
        public static final String FRAMES = "android.media.mediaplayer.frames";
        public static final String FRAMES_DROPPED = "android.media.mediaplayer.dropped";
        public static final String HEIGHT = "android.media.mediaplayer.height";
        public static final String MIME_TYPE_AUDIO = "android.media.mediaplayer.audio.mime";
        public static final String MIME_TYPE_VIDEO = "android.media.mediaplayer.video.mime";
        public static final String PLAYING = "android.media.mediaplayer.playingMs";
        public static final String WIDTH = "android.media.mediaplayer.width";
        
        MetricsConstants() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class NoDrmSchemeException extends MediaDrmException
    {
        public NoDrmSchemeException(final String detailMessage) {
            super((String)null);
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ProvisioningNetworkErrorException extends MediaDrmException
    {
        public ProvisioningNetworkErrorException(final String detailMessage) {
            super((String)null);
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ProvisioningServerErrorException extends MediaDrmException
    {
        public ProvisioningServerErrorException(final String detailMessage) {
            super((String)null);
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class TrackInfo implements Parcelable
    {
        public static final int MEDIA_TRACK_TYPE_AUDIO = 2;
        public static final int MEDIA_TRACK_TYPE_METADATA = 5;
        public static final int MEDIA_TRACK_TYPE_SUBTITLE = 4;
        public static final int MEDIA_TRACK_TYPE_TIMEDTEXT = 3;
        public static final int MEDIA_TRACK_TYPE_UNKNOWN = 0;
        public static final int MEDIA_TRACK_TYPE_VIDEO = 1;
        
        TrackInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public int getTrackType() {
            throw new RuntimeException("Stub!");
        }
        
        public String getLanguage() {
            throw new RuntimeException("Stub!");
        }
        
        public MediaFormat getFormat() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnVideoSizeChangedListener
    {
        void onVideoSizeChanged(final MediaPlayer p0, final int p1, final int p2);
    }
    
    public interface OnTimedTextListener
    {
        void onTimedText(final MediaPlayer p0, final TimedText p1);
    }
    
    public interface OnTimedMetaDataAvailableListener
    {
        void onTimedMetaDataAvailable(final MediaPlayer p0, final TimedMetaData p1);
    }
    
    public interface OnSubtitleDataListener
    {
        void onSubtitleData(@NonNull final MediaPlayer p0, @NonNull final SubtitleData p1);
    }
    
    public interface OnSeekCompleteListener
    {
        void onSeekComplete(final MediaPlayer p0);
    }
    
    public interface OnPreparedListener
    {
        void onPrepared(final MediaPlayer p0);
    }
    
    public interface OnMediaTimeDiscontinuityListener
    {
        void onMediaTimeDiscontinuity(@NonNull final MediaPlayer p0, @NonNull final MediaTimestamp p1);
    }
    
    public interface OnInfoListener
    {
        boolean onInfo(final MediaPlayer p0, final int p1, final int p2);
    }
    
    public interface OnErrorListener
    {
        boolean onError(final MediaPlayer p0, final int p1, final int p2);
    }
    
    public interface OnDrmPreparedListener
    {
        void onDrmPrepared(final MediaPlayer p0, final int p1);
    }
    
    public interface OnDrmInfoListener
    {
        void onDrmInfo(final MediaPlayer p0, final DrmInfo p1);
    }
    
    public interface OnDrmConfigHelper
    {
        void onDrmConfig(final MediaPlayer p0);
    }
    
    public interface OnCompletionListener
    {
        void onCompletion(final MediaPlayer p0);
    }
    
    public interface OnBufferingUpdateListener
    {
        void onBufferingUpdate(final MediaPlayer p0, final int p1);
    }
}
