package android.speech.tts;

public interface SynthesisCallback
{
    int getMaxBufferSize();
    
    int start(final int p0, final int p1, final int p2);
    
    int audioAvailable(final byte[] p0, final int p1, final int p2);
    
    int done();
    
    void error();
    
    void error(final int p0);
    
    boolean hasStarted();
    
    boolean hasFinished();
    
    default void rangeStart(final int markerInFrames, final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
}
