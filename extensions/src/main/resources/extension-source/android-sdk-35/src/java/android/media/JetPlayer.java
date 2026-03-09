package android.media;

import android.os.Handler;
import android.content.res.AssetFileDescriptor;

public class JetPlayer
{
    JetPlayer() {
        throw new RuntimeException("Stub!");
    }
    
    public static JetPlayer getJetPlayer() {
        throw new RuntimeException("Stub!");
    }
    
    public Object clone() throws CloneNotSupportedException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMaxTracks() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean loadJetFile(final String path) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean loadJetFile(final AssetFileDescriptor afd) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean closeJetFile() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean play() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean pause() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean queueJetSegment(final int segmentNum, final int libNum, final int repeatCount, final int transpose, final int muteFlags, final byte userID) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean queueJetSegmentMuteArray(final int segmentNum, final int libNum, final int repeatCount, final int transpose, final boolean[] muteArray, final byte userID) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setMuteFlags(final int muteFlags, final boolean sync) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setMuteArray(final boolean[] muteArray, final boolean sync) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setMuteFlag(final int trackId, final boolean muteFlag, final boolean sync) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean triggerClip(final int clipId) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean clearQueue() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEventListener(final OnJetEventListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setEventListener(final OnJetEventListener listener, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnJetEventListener
    {
        void onJetEvent(final JetPlayer p0, final short p1, final byte p2, final byte p3, final byte p4, final byte p5);
        
        void onJetUserIdUpdate(final JetPlayer p0, final int p1, final int p2);
        
        void onJetNumQueuedSegmentUpdate(final JetPlayer p0, final int p1);
        
        void onJetPauseUpdate(final JetPlayer p0, final int p1);
    }
}
