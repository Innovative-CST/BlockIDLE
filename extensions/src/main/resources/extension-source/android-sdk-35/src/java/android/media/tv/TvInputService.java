package android.media.tv;

import android.view.MotionEvent;
import android.media.PlaybackParams;
import android.view.View;
import android.media.AudioPresentation;
import java.util.List;
import android.view.KeyEvent;
import android.os.Bundle;
import android.net.Uri;
import android.view.Surface;
import android.content.Context;
import android.content.AttributionSource;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class TvInputService extends Service
{
    public static final int PRIORITY_HINT_USE_CASE_TYPE_BACKGROUND = 100;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_LIVE = 400;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_PLAYBACK = 300;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_RECORD = 500;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_SCAN = 200;
    public static final String SERVICE_INTERFACE = "android.media.tv.TvInputService";
    public static final String SERVICE_META_DATA = "android.media.tv.input";
    
    public TvInputService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public abstract Session onCreateSession(@NonNull final String p0);
    
    @Nullable
    public RecordingSession onCreateRecordingSession(@NonNull final String inputId) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Session onCreateSession(@NonNull final String inputId, @NonNull final String sessionId) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Session onCreateSession(@NonNull final String inputId, @NonNull final String sessionId, @NonNull final AttributionSource tvAppAttributionSource) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public RecordingSession onCreateRecordingSession(@NonNull final String inputId, @NonNull final String sessionId) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class HardwareSession extends Session
    {
        public HardwareSession(final Context context) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public abstract String getHardwareInputId();
        
        @Override
        public final boolean onSetSurface(final Surface surface) {
            throw new RuntimeException("Stub!");
        }
        
        public void onHardwareVideoAvailable() {
            throw new RuntimeException("Stub!");
        }
        
        public void onHardwareVideoUnavailable(final int reason) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class RecordingSession
    {
        public RecordingSession(final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyTuned(final Uri channelUri) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyRecordingStopped(final Uri recordedProgramUri) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyError(final int error) {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onTune(final Uri p0);
        
        public void onTune(final Uri channelUri, final Bundle params) {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onStartRecording(@Nullable final Uri p0);
        
        public void onStartRecording(@Nullable final Uri programUri, @NonNull final Bundle params) {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onStopRecording();
        
        public void onPauseRecording(@NonNull final Bundle params) {
            throw new RuntimeException("Stub!");
        }
        
        public void onResumeRecording(@NonNull final Bundle params) {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onRelease();
        
        public void onAppPrivateCommand(@NonNull final String action, final Bundle data) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class Session implements KeyEvent.Callback
    {
        public Session(final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        public void setOverlayViewEnabled(final boolean enable) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyChannelRetuned(final Uri channelUri) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyTuned(@NonNull final Uri channelUri) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyTracksChanged(final List<TvTrackInfo> tracks) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyTrackSelected(final int type, final String trackId) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyVideoAvailable() {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyVideoUnavailable(final int reason) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyAudioPresentationChanged(@NonNull final List<AudioPresentation> audioPresentations) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyAudioPresentationSelected(final int presentationId, final int programId) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyContentAllowed() {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyContentBlocked(@NonNull final TvContentRating rating) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyTimeShiftStatusChanged(final int status) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyBroadcastInfoResponse(@NonNull final BroadcastInfoResponse response) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyAdResponse(@NonNull final AdResponse response) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyAdBufferConsumed(@NonNull final AdBuffer buffer) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyTvMessage(final int type, @NonNull final Bundle data) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyAitInfoUpdated(@NonNull final AitInfo aitInfo) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyTimeShiftMode(final int mode) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyAvailableSpeeds(@NonNull final float[] speeds) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifySignalStrength(final int strength) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyCueingMessageAvailability(final boolean available) {
            throw new RuntimeException("Stub!");
        }
        
        public void layoutSurface(final int left, final int top, final int right, final int bottom) {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onRelease();
        
        public abstract boolean onSetSurface(@Nullable final Surface p0);
        
        public void onSurfaceChanged(final int format, final int width, final int height) {
            throw new RuntimeException("Stub!");
        }
        
        public void onOverlayViewSizeChanged(final int width, final int height) {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onSetStreamVolume(final float p0);
        
        public void onRequestBroadcastInfo(@NonNull final BroadcastInfoRequest request) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRemoveBroadcastInfo(final int requestId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRequestAd(@NonNull final AdRequest request) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAdBufferReady(@NonNull final AdBuffer buffer) {
            throw new RuntimeException("Stub!");
        }
        
        public abstract boolean onTune(final Uri p0);
        
        public boolean onTune(final Uri channelUri, final Bundle params) {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onSetCaptionEnabled(final boolean p0);
        
        public void onUnblockContent(final TvContentRating unblockedRating) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean onSelectTrack(final int type, @Nullable final String trackId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onSetInteractiveAppNotificationEnabled(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean onSelectAudioPresentation(final int presentationId, final int programId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAppPrivateCommand(@NonNull final String action, final Bundle data) {
            throw new RuntimeException("Stub!");
        }
        
        public View onCreateOverlayView() {
            throw new RuntimeException("Stub!");
        }
        
        public void onSetTvMessageEnabled(final int type, final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTvMessage(final int type, @NonNull final Bundle data) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTimeShiftPlay(final Uri recordedProgramUri) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTimeShiftPause() {
            throw new RuntimeException("Stub!");
        }
        
        public void onTimeShiftResume() {
            throw new RuntimeException("Stub!");
        }
        
        public void onTimeShiftSeekTo(final long timeMs) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTimeShiftSetPlaybackParams(final PlaybackParams params) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTimeShiftSetMode(final int mode) {
            throw new RuntimeException("Stub!");
        }
        
        public long onTimeShiftGetStartPosition() {
            throw new RuntimeException("Stub!");
        }
        
        public long onTimeShiftGetCurrentPosition() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean onKeyDown(final int keyCode, final KeyEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean onKeyLongPress(final int keyCode, final KeyEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean onKeyMultiple(final int keyCode, final int count, final KeyEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean onKeyUp(final int keyCode, final KeyEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean onTouchEvent(final MotionEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean onTrackballEvent(final MotionEvent event) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean onGenericMotionEvent(final MotionEvent event) {
            throw new RuntimeException("Stub!");
        }
    }
}
