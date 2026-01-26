package android.widget;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

public class MediaController extends FrameLayout
{
    public MediaController(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public MediaController(final Context context, final boolean useFastForward) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public MediaController(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void onFinishInflate() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMediaPlayer(final MediaPlayerControl player) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAnchorView(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void show() {
        throw new RuntimeException("Stub!");
    }
    
    public void show(final int timeout) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isShowing() {
        throw new RuntimeException("Stub!");
    }
    
    public void hide() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onTouchEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onTrackballEvent(final MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchKeyEvent(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPrevNextListeners(final OnClickListener next, final OnClickListener prev) {
        throw new RuntimeException("Stub!");
    }
    
    public interface MediaPlayerControl
    {
        void start();
        
        void pause();
        
        int getDuration();
        
        int getCurrentPosition();
        
        void seekTo(final int p0);
        
        boolean isPlaying();
        
        int getBufferPercentage();
        
        boolean canPause();
        
        boolean canSeekBackward();
        
        boolean canSeekForward();
        
        int getAudioSessionId();
    }
}
