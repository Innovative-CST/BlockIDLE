package android.media.tv.interactive;

import android.media.tv.TvView;
import android.media.PlaybackParams;
import android.os.Bundle;
import android.media.tv.TvRecordingInfo;
import android.media.tv.TvTrackInfo;
import java.util.List;
import android.net.Uri;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.InputEvent;
import android.view.View;
import java.util.concurrent.Executor;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

public class TvInteractiveAppView extends ViewGroup
{
    public static final String BI_INTERACTIVE_APP_KEY_ALIAS = "alias";
    public static final String BI_INTERACTIVE_APP_KEY_CERTIFICATE = "certificate";
    public static final String BI_INTERACTIVE_APP_KEY_HTTP_ADDITIONAL_HEADERS = "http_additional_headers";
    public static final String BI_INTERACTIVE_APP_KEY_HTTP_USER_AGENT = "http_user_agent";
    public static final String BI_INTERACTIVE_APP_KEY_PRIVATE_KEY = "private_key";
    public static final String ERROR_KEY_METHOD_NAME = "method_name";
    
    public TvInteractiveAppView(@NonNull final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public TvInteractiveAppView(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public TvInteractiveAppView(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void setCallback(@NonNull final Executor executor, @NonNull final TvInteractiveAppCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public void onAttachedToWindow() {
        throw new RuntimeException("Stub!");
    }
    
    public void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    public void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    public void onVisibilityChanged(@NonNull final View changedView, final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean dispatchUnhandledInputEvent(@NonNull final InputEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onUnhandledInputEvent(@NonNull final InputEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnUnhandledInputEventListener(@NonNull final Executor executor, @NonNull final OnUnhandledInputEventListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public OnUnhandledInputEventListener getOnUnhandledInputEventListener() {
        throw new RuntimeException("Stub!");
    }
    
    public void clearOnUnhandledInputEventListener() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchKeyEvent(@RecentlyNonNull final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void prepareInteractiveApp(@NonNull final String iAppServiceId, final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public void startInteractiveApp() {
        throw new RuntimeException("Stub!");
    }
    
    public void stopInteractiveApp() {
        throw new RuntimeException("Stub!");
    }
    
    public void resetInteractiveApp() {
        throw new RuntimeException("Stub!");
    }
    
    public void sendCurrentVideoBounds(@NonNull final Rect bounds) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendCurrentChannelUri(@Nullable final Uri channelUri) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendCurrentChannelLcn(final int lcn) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendStreamVolume(final float volume) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendTrackInfoList(@Nullable final List<TvTrackInfo> tracks) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendCurrentTvInputId(@Nullable final String inputId) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendTimeShiftMode(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendAvailableSpeeds(@NonNull final float[] speeds) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendTvRecordingInfo(@Nullable final TvRecordingInfo recordingInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendTvRecordingInfoList(@NonNull final List<TvRecordingInfo> recordingInfoList) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyRecordingStarted(@NonNull final String recordingId, @Nullable final String requestId) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyRecordingStopped(@NonNull final String recordingId) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendSigningResult(@NonNull final String signingId, @NonNull final byte[] result) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyError(@NonNull final String errMsg, @NonNull final Bundle params) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyTimeShiftPlaybackParams(@NonNull final PlaybackParams params) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyTimeShiftStatusChanged(@NonNull final String inputId, final int status) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyTimeShiftStartPositionChanged(@NonNull final String inputId, final long timeMs) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyTimeShiftCurrentPositionChanged(@NonNull final String inputId, final long timeMs) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyRecordingScheduled(@NonNull final String recordingId, @Nullable final String requestId) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyTvMessage(@NonNull final int type, @NonNull final Bundle data) {
        throw new RuntimeException("Stub!");
    }
    
    public void createBiInteractiveApp(@NonNull final Uri biIAppUri, @Nullable final Bundle params) {
        throw new RuntimeException("Stub!");
    }
    
    public void destroyBiInteractiveApp(@NonNull final String biIAppId) {
        throw new RuntimeException("Stub!");
    }
    
    public int setTvView(@Nullable final TvView tvView) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTeletextAppEnabled(final boolean enable) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class TvInteractiveAppCallback
    {
        public TvInteractiveAppCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onPlaybackCommandRequest(@NonNull final String iAppServiceId, @NonNull final String cmdType, @NonNull final Bundle parameters) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTimeShiftCommandRequest(@NonNull final String iAppServiceId, @NonNull final String cmdType, @NonNull final Bundle parameters) {
            throw new RuntimeException("Stub!");
        }
        
        public void onStateChanged(@NonNull final String iAppServiceId, final int state, final int err) {
            throw new RuntimeException("Stub!");
        }
        
        public void onBiInteractiveAppCreated(@NonNull final String iAppServiceId, @NonNull final Uri biIAppUri, @Nullable final String biIAppId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTeletextAppStateChanged(@NonNull final String iAppServiceId, final int state) {
            throw new RuntimeException("Stub!");
        }
        
        public void onSetVideoBounds(@NonNull final String iAppServiceId, @NonNull final Rect rect) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRequestCurrentVideoBounds(@NonNull final String iAppServiceId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRequestCurrentChannelUri(@NonNull final String iAppServiceId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRequestCurrentChannelLcn(@NonNull final String iAppServiceId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRequestStreamVolume(@NonNull final String iAppServiceId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRequestTrackInfoList(@NonNull final String iAppServiceId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRequestCurrentTvInputId(@NonNull final String iAppServiceId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRequestTimeShiftMode(@NonNull final String iAppServiceId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRequestAvailableSpeeds(@NonNull final String iAppServiceId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRequestStartRecording(@NonNull final String iAppServiceId, @NonNull final String requestId, @Nullable final Uri programUri) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRequestStopRecording(@NonNull final String iAppServiceId, @NonNull final String recordingId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRequestScheduleRecording(@NonNull final String iAppServiceId, @NonNull final String requestId, @NonNull final String inputId, @NonNull final Uri channelUri, @NonNull final Uri programUri, @NonNull final Bundle params) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRequestScheduleRecording(@NonNull final String iAppServiceId, @NonNull final String requestId, @NonNull final String inputId, @NonNull final Uri channelUri, final long startTime, final long duration, final int repeatDays, @NonNull final Bundle params) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRequestSigning(@NonNull final String iAppServiceId, @NonNull final String signingId, @NonNull final String algorithm, @NonNull final String alias, @NonNull final byte[] data) {
            throw new RuntimeException("Stub!");
        }
        
        public void onSetTvRecordingInfo(@NonNull final String iAppServiceId, @NonNull final String recordingId, @NonNull final TvRecordingInfo recordingInfo) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRequestTvRecordingInfo(@NonNull final String iAppServiceId, @NonNull final String recordingId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRequestTvRecordingInfoList(@NonNull final String iAppServiceId, final int type) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnUnhandledInputEventListener
    {
        boolean onUnhandledInputEvent(@NonNull final InputEvent p0);
    }
}
