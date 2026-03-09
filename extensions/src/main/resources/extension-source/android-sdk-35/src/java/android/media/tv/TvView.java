package android.media.tv;

import android.view.View;
import android.graphics.Canvas;
import android.graphics.Region;
import android.view.MotionEvent;
import android.view.KeyEvent;
import android.view.InputEvent;
import android.media.PlaybackParams;
import android.media.AudioPresentation;
import java.util.List;
import android.os.Bundle;
import android.net.Uri;
import android.content.AttributionSource;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

public class TvView extends ViewGroup
{
    public TvView(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public TvView(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public TvView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void setCallback(@Nullable final TvInputCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void setZOrderMediaOverlay(final boolean isMediaOverlay) {
        throw new RuntimeException("Stub!");
    }
    
    public void setZOrderOnTop(final boolean onTop) {
        throw new RuntimeException("Stub!");
    }
    
    public void setStreamVolume(final float volume) {
        throw new RuntimeException("Stub!");
    }
    
    public void overrideTvAppAttributionSource(@NonNull final AttributionSource tvAppAttributionSource) {
        throw new RuntimeException("Stub!");
    }
    
    public void tune(@NonNull final String inputId, final Uri channelUri) {
        throw new RuntimeException("Stub!");
    }
    
    public void tune(final String inputId, final Uri channelUri, final Bundle params) {
        throw new RuntimeException("Stub!");
    }
    
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCaptionEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void selectAudioPresentation(final int presentationId, final int programId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AudioPresentation> getAudioPresentations() {
        throw new RuntimeException("Stub!");
    }
    
    public void selectTrack(final int type, final String trackId) {
        throw new RuntimeException("Stub!");
    }
    
    public List<TvTrackInfo> getTracks(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public String getSelectedTrack(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInteractiveAppNotificationEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void timeShiftPlay(final String inputId, final Uri recordedProgramUri) {
        throw new RuntimeException("Stub!");
    }
    
    public void timeShiftPause() {
        throw new RuntimeException("Stub!");
    }
    
    public void timeShiftResume() {
        throw new RuntimeException("Stub!");
    }
    
    public void timeShiftSeekTo(final long timeMs) {
        throw new RuntimeException("Stub!");
    }
    
    public void timeShiftSetPlaybackParams(@NonNull final PlaybackParams params) {
        throw new RuntimeException("Stub!");
    }
    
    public void timeShiftSetMode(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTimeShiftPositionCallback(@Nullable final TimeShiftPositionCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendAppPrivateCommand(@NonNull final String action, final Bundle data) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean dispatchUnhandledInputEvent(final InputEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onUnhandledInputEvent(final InputEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnUnhandledInputEventListener(final OnUnhandledInputEventListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTvMessageEnabled(final int type, final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchKeyEvent(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchTouchEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchTrackballEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchGenericMotionEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void dispatchWindowFocusChanged(final boolean hasFocus) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onAttachedToWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean gatherTransparentRegion(final Region region) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void draw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dispatchDraw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onVisibilityChanged(final View changedView, final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class TimeShiftPositionCallback
    {
        public TimeShiftPositionCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onTimeShiftStartPositionChanged(final String inputId, final long timeMs) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTimeShiftCurrentPositionChanged(final String inputId, final long timeMs) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class TvInputCallback
    {
        public TvInputCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onConnectionFailed(final String inputId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onDisconnected(final String inputId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onChannelRetuned(final String inputId, final Uri channelUri) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAudioPresentationsChanged(@NonNull final String inputId, @NonNull final List<AudioPresentation> audioPresentations) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAudioPresentationSelected(@NonNull final String inputId, final int presentationId, final int programId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTracksChanged(final String inputId, final List<TvTrackInfo> tracks) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTrackSelected(final String inputId, final int type, final String trackId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onVideoSizeChanged(final String inputId, final int width, final int height) {
            throw new RuntimeException("Stub!");
        }
        
        public void onVideoAvailable(final String inputId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onVideoUnavailable(final String inputId, final int reason) {
            throw new RuntimeException("Stub!");
        }
        
        public void onContentAllowed(final String inputId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onContentBlocked(final String inputId, final TvContentRating rating) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTimeShiftStatusChanged(final String inputId, final int status) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAitInfoUpdated(@NonNull final String inputId, @NonNull final AitInfo aitInfo) {
            throw new RuntimeException("Stub!");
        }
        
        public void onSignalStrengthUpdated(@NonNull final String inputId, final int strength) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCueingMessageAvailability(@NonNull final String inputId, final boolean available) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTimeShiftMode(@NonNull final String inputId, final int mode) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAvailableSpeeds(@NonNull final String inputId, @NonNull final float[] speeds) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTuned(@NonNull final String inputId, @NonNull final Uri channelUri) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTvMessage(@NonNull final String inputId, final int type, @NonNull final Bundle data) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnUnhandledInputEventListener
    {
        boolean onUnhandledInputEvent(final InputEvent p0);
    }
}
