package android.graphics;

public class Interpolator
{
    public Interpolator(final int valueCount) {
        throw new RuntimeException("Stub!");
    }
    
    public Interpolator(final int valueCount, final int frameCount) {
        throw new RuntimeException("Stub!");
    }
    
    public void reset(final int valueCount) {
        throw new RuntimeException("Stub!");
    }
    
    public void reset(final int valueCount, final int frameCount) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getKeyFrameCount() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getValueCount() {
        throw new RuntimeException("Stub!");
    }
    
    public void setKeyFrame(final int index, final int msec, final float[] values) {
        throw new RuntimeException("Stub!");
    }
    
    public void setKeyFrame(final int index, final int msec, final float[] values, final float[] blend) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRepeatMirror(final float repeatCount, final boolean mirror) {
        throw new RuntimeException("Stub!");
    }
    
    public Result timeToValues(final float[] values) {
        throw new RuntimeException("Stub!");
    }
    
    public Result timeToValues(final int msec, final float[] values) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public enum Result
    {
        NORMAL, 
        FREEZE_START, 
        FREEZE_END;
    }
}
