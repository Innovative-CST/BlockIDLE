package android.media.tv.interactive;

import android.media.tv.AdRequest;
import android.media.tv.BroadcastInfoRequest;
import android.view.MotionEvent;
import android.media.tv.AdBuffer;
import android.media.tv.AdResponse;
import android.media.tv.BroadcastInfoResponse;
import android.media.tv.TvContentRating;
import android.view.View;
import android.view.Surface;
import android.media.PlaybackParams;
import android.media.tv.TvRecordingInfo;
import android.media.tv.TvTrackInfo;
import java.util.List;
import android.graphics.Rect;
import android.net.Uri;
import android.content.Context;
import android.view.KeyEvent;
import android.os.Bundle;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class TvInteractiveAppService extends Service
{
    public static final String COMMAND_PARAMETER_KEY_CHANGE_CHANNEL_QUIETLY = "command_change_channel_quietly";
    public static final String COMMAND_PARAMETER_KEY_CHANNEL_URI = "command_channel_uri";
    public static final String COMMAND_PARAMETER_KEY_INPUT_ID = "command_input_id";
    public static final String COMMAND_PARAMETER_KEY_PLAYBACK_PARAMS = "command_playback_params";
    public static final String COMMAND_PARAMETER_KEY_PROGRAM_URI = "command_program_uri";
    public static final String COMMAND_PARAMETER_KEY_STOP_MODE = "command_stop_mode";
    public static final String COMMAND_PARAMETER_KEY_TIME_POSITION = "command_time_position";
    public static final String COMMAND_PARAMETER_KEY_TIME_SHIFT_MODE = "command_time_shift_mode";
    public static final String COMMAND_PARAMETER_KEY_TRACK_ID = "command_track_id";
    public static final String COMMAND_PARAMETER_KEY_TRACK_TYPE = "command_track_type";
    public static final String COMMAND_PARAMETER_KEY_VOLUME = "command_volume";
    public static final int COMMAND_PARAMETER_VALUE_STOP_MODE_BLANK = 1;
    public static final int COMMAND_PARAMETER_VALUE_STOP_MODE_FREEZE = 2;
    public static final String PLAYBACK_COMMAND_TYPE_SELECT_TRACK = "select_track";
    public static final String PLAYBACK_COMMAND_TYPE_SET_STREAM_VOLUME = "set_stream_volume";
    public static final String PLAYBACK_COMMAND_TYPE_STOP = "stop";
    public static final String PLAYBACK_COMMAND_TYPE_TUNE = "tune";
    public static final String PLAYBACK_COMMAND_TYPE_TUNE_NEXT = "tune_next";
    public static final String PLAYBACK_COMMAND_TYPE_TUNE_PREV = "tune_previous";
    public static final String SERVICE_INTERFACE = "android.media.tv.interactive.TvInteractiveAppService";
    public static final String SERVICE_META_DATA = "android.media.tv.interactive.app";
    public static final String TIME_SHIFT_COMMAND_TYPE_PAUSE = "pause";
    public static final String TIME_SHIFT_COMMAND_TYPE_PLAY = "play";
    public static final String TIME_SHIFT_COMMAND_TYPE_RESUME = "resume";
    public static final String TIME_SHIFT_COMMAND_TYPE_SEEK_TO = "seek_to";
    public static final String TIME_SHIFT_COMMAND_TYPE_SET_MODE = "set_mode";
    public static final String TIME_SHIFT_COMMAND_TYPE_SET_PLAYBACK_PARAMS = "set_playback_params";
    
    public TvInteractiveAppService() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public final IBinder onBind(@NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void onRegisterAppLinkInfo(@NonNull final AppLinkInfo appLinkInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public void onUnregisterAppLinkInfo(@NonNull final AppLinkInfo appLinkInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public void onAppLinkCommand(@NonNull final Bundle command) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public abstract Session onCreateSession(@NonNull final String p0, final int p1);
    
    public final void notifyStateChanged(final int type, final int state, final int error) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class Session implements KeyEvent.Callback
    {
        public Session(@NonNull final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        public void setMediaViewEnabled(final boolean enable) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isMediaViewEnabled() {
            throw new RuntimeException("Stub!");
        }
        
        public void onStartInteractiveApp() {
            throw new RuntimeException("Stub!");
        }
        
        public void onStopInteractiveApp() {
            throw new RuntimeException("Stub!");
        }
        
        public void onResetInteractiveApp() {
            throw new RuntimeException("Stub!");
        }
        
        public void onCreateBiInteractiveAppRequest(@NonNull final Uri biIAppUri, @Nullable final Bundle params) {
            throw new RuntimeException("Stub!");
        }
        
        public void onDestroyBiInteractiveAppRequest(@NonNull final String biIAppId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onSetTeletextAppEnabled(final boolean enable) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCurrentVideoBounds(@NonNull final Rect bounds) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCurrentChannelUri(@Nullable final Uri channelUri) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCurrentChannelLcn(final int lcn) {
            throw new RuntimeException("Stub!");
        }
        
        public void onStreamVolume(final float volume) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTrackInfoList(@NonNull final List<TvTrackInfo> tracks) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCurrentTvInputId(@Nullable final String inputId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTimeShiftMode(final int mode) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAvailableSpeeds(@NonNull final float[] speeds) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTvRecordingInfo(@Nullable final TvRecordingInfo recordingInfo) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTvRecordingInfoList(@NonNull final List<TvRecordingInfo> recordingInfoList) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRecordingStarted(@NonNull final String recordingId, @Nullable final String requestId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRecordingStopped(@NonNull final String recordingId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRecordingConnectionFailed(@NonNull final String recordingId, @NonNull final String inputId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRecordingDisconnected(@NonNull final String recordingId, @NonNull final String inputId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRecordingTuned(@NonNull final String recordingId, @NonNull final Uri channelUri) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRecordingError(@NonNull final String recordingId, final int err) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRecordingScheduled(@NonNull final String recordingId, @Nullable final String requestId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onSigningResult(@NonNull final String signingId, @NonNull final byte[] result) {
            throw new RuntimeException("Stub!");
        }
        
        public void onError(@NonNull final String errMsg, @NonNull final Bundle params) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTimeShiftPlaybackParams(@NonNull final PlaybackParams params) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTimeShiftStatusChanged(@NonNull final String inputId, final int status) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTimeShiftStartPositionChanged(@NonNull final String inputId, final long timeMs) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTimeShiftCurrentPositionChanged(@NonNull final String inputId, final long timeMs) {
            throw new RuntimeException("Stub!");
        }
        
        public abstract boolean onSetSurface(@Nullable final Surface p0);
        
        public void onSurfaceChanged(final int format, final int width, final int height) {
            throw new RuntimeException("Stub!");
        }
        
        public void onMediaViewSizeChanged(final int width, final int height) {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public View onCreateMediaView() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onRelease();
        
        public void onTuned(@NonNull final Uri channelUri) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTrackSelected(final int type, @NonNull final String trackId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTracksChanged(@NonNull final List<TvTrackInfo> tracks) {
            throw new RuntimeException("Stub!");
        }
        
        public void onVideoAvailable() {
            throw new RuntimeException("Stub!");
        }
        
        public void onVideoUnavailable(final int reason) {
            throw new RuntimeException("Stub!");
        }
        
        public void onContentAllowed() {
            throw new RuntimeException("Stub!");
        }
        
        public void onContentBlocked(@NonNull final TvContentRating rating) {
            throw new RuntimeException("Stub!");
        }
        
        public void onSignalStrength(final int strength) {
            throw new RuntimeException("Stub!");
        }
        
        public void onBroadcastInfoResponse(@NonNull final BroadcastInfoResponse response) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAdResponse(@NonNull final AdResponse response) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAdBufferConsumed(@NonNull final AdBuffer buffer) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTvMessage(final int type, @NonNull final Bundle data) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean onKeyDown(final int keyCode, @NonNull final KeyEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean onKeyLongPress(final int keyCode, @NonNull final KeyEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean onKeyMultiple(final int keyCode, final int count, @NonNull final KeyEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean onKeyUp(final int keyCode, @NonNull final KeyEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean onTouchEvent(@NonNull final MotionEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean onTrackballEvent(@NonNull final MotionEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean onGenericMotionEvent(@NonNull final MotionEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        public void layoutSurface(final int left, final int top, final int right, final int bottom) {
            throw new RuntimeException("Stub!");
        }
        
        public void requestBroadcastInfo(@NonNull final BroadcastInfoRequest request) {
            throw new RuntimeException("Stub!");
        }
        
        public void removeBroadcastInfo(final int requestId) {
            throw new RuntimeException("Stub!");
        }
        
        public void sendPlaybackCommandRequest(@NonNull final String cmdType, @Nullable final Bundle parameters) {
            throw new RuntimeException("Stub!");
        }
        
        public void sendTimeShiftCommandRequest(@NonNull final String cmdType, @Nullable final Bundle parameters) {
            throw new RuntimeException("Stub!");
        }
        
        public void setVideoBounds(@NonNull final Rect rect) {
            throw new RuntimeException("Stub!");
        }
        
        public void requestCurrentVideoBounds() {
            throw new RuntimeException("Stub!");
        }
        
        public void requestCurrentChannelUri() {
            throw new RuntimeException("Stub!");
        }
        
        public void requestCurrentChannelLcn() {
            throw new RuntimeException("Stub!");
        }
        
        public void requestStreamVolume() {
            throw new RuntimeException("Stub!");
        }
        
        public void requestTrackInfoList() {
            throw new RuntimeException("Stub!");
        }
        
        public void requestCurrentTvInputId() {
            throw new RuntimeException("Stub!");
        }
        
        public void requestTimeShiftMode() {
            throw new RuntimeException("Stub!");
        }
        
        public void requestAvailableSpeeds() {
            throw new RuntimeException("Stub!");
        }
        
        public void requestStartRecording(@NonNull final String requestId, @Nullable final Uri programUri) {
            throw new RuntimeException("Stub!");
        }
        
        public void requestStopRecording(@NonNull final String recordingId) {
            throw new RuntimeException("Stub!");
        }
        
        public void requestScheduleRecording(@NonNull final String requestId, @NonNull final String inputId, @NonNull final Uri channelUri, @NonNull final Uri programUri, @NonNull final Bundle params) {
            throw new RuntimeException("Stub!");
        }
        
        public void requestScheduleRecording(@NonNull final String requestId, @NonNull final String inputId, @NonNull final Uri channelUri, final long startTime, final long duration, final int repeatDays, @NonNull final Bundle params) {
            throw new RuntimeException("Stub!");
        }
        
        public void setTvRecordingInfo(@NonNull final String recordingId, @NonNull final TvRecordingInfo recordingInfo) {
            throw new RuntimeException("Stub!");
        }
        
        public void requestTvRecordingInfo(@NonNull final String recordingId) {
            throw new RuntimeException("Stub!");
        }
        
        public void requestTvRecordingInfoList(final int type) {
            throw new RuntimeException("Stub!");
        }
        
        public void requestSigning(@NonNull final String signingId, @NonNull final String algorithm, @NonNull final String alias, @NonNull final byte[] data) {
            throw new RuntimeException("Stub!");
        }
        
        public void requestAd(@NonNull final AdRequest request) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifySessionStateChanged(final int state, final int err) {
            throw new RuntimeException("Stub!");
        }
        
        public final void notifyBiInteractiveAppCreated(@NonNull final Uri biIAppUri, @Nullable final String biIAppId) {
            throw new RuntimeException("Stub!");
        }
        
        public final void notifyTeletextAppStateChanged(final int state) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyAdBufferReady(@NonNull final AdBuffer buffer) {
            throw new RuntimeException("Stub!");
        }
    }
}
