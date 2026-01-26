package android.media.audiofx;

public class BassBoost extends AudioEffect
{
    public static final int PARAM_STRENGTH = 1;
    public static final int PARAM_STRENGTH_SUPPORTED = 0;
    
    public BassBoost(final int priority, final int audioSession) throws IllegalArgumentException, IllegalStateException, RuntimeException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getStrengthSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStrength(final short strength) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    public short getRoundedStrength() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    public void setParameterListener(final OnParameterChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public Settings getProperties() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    public void setProperties(final Settings settings) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    public static class Settings
    {
        public short strength;
        
        public Settings() {
            throw new RuntimeException("Stub!");
        }
        
        public Settings(final String settings) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnParameterChangeListener
    {
        void onParameterChange(final BassBoost p0, final int p1, final int p2, final short p3);
    }
}
