package android.widget;

import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.media.MediaPlayer;
import android.media.MediaFormat;
import java.io.InputStream;
import android.media.AudioAttributes;
import java.util.Map;
import android.net.Uri;
import android.util.AttributeSet;
import android.content.Context;
import android.view.SurfaceView;

public class VideoView extends SurfaceView implements MediaController.MediaPlayerControl
{
    public VideoView(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public VideoView(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public VideoView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public VideoView(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public int resolveAdjustedSize(final int desiredSize, final int measureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    public void setVideoPath(final String path) {
        throw new RuntimeException("Stub!");
    }
    
    public void setVideoURI(final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    public void setVideoURI(final Uri uri, final Map<String, String> headers) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAudioFocusRequest(final int focusGain) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAudioAttributes(@NonNull final AudioAttributes attributes) {
        throw new RuntimeException("Stub!");
    }
    
    public void addSubtitleSource(final InputStream is, final MediaFormat format) {
        throw new RuntimeException("Stub!");
    }
    
    public void stopPlayback() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMediaController(final MediaController controller) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnPreparedListener(final MediaPlayer.OnPreparedListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnCompletionListener(final MediaPlayer.OnCompletionListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnErrorListener(final MediaPlayer.OnErrorListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnInfoListener(final MediaPlayer.OnInfoListener l) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onTouchEvent(final MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onTrackballEvent(final MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void start() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void pause() {
        throw new RuntimeException("Stub!");
    }
    
    public void suspend() {
        throw new RuntimeException("Stub!");
    }
    
    public void resume() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getDuration() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getCurrentPosition() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void seekTo(final int msec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isPlaying() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getBufferPercentage() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean canPause() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean canSeekBackward() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean canSeekForward() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getAudioSessionId() {
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
    public void draw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
}
