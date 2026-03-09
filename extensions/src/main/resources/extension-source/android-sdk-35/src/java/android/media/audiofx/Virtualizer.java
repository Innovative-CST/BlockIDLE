package android.media.audiofx;

@Deprecated
public class Virtualizer extends AudioEffect
{
    @Deprecated
    public static final int PARAM_STRENGTH = 1;
    @Deprecated
    public static final int PARAM_STRENGTH_SUPPORTED = 0;
    @Deprecated
    public static final int VIRTUALIZATION_MODE_AUTO = 1;
    @Deprecated
    public static final int VIRTUALIZATION_MODE_BINAURAL = 2;
    @Deprecated
    public static final int VIRTUALIZATION_MODE_OFF = 0;
    @Deprecated
    public static final int VIRTUALIZATION_MODE_TRANSAURAL = 3;
    
    @Deprecated
    public Virtualizer(final int priority, final int audioSession) throws IllegalArgumentException, IllegalStateException, RuntimeException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getStrengthSupported() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setStrength(final short strength) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public short getRoundedStrength() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean canVirtualize(final int inputChannelMask, final int virtualizationMode) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getSpeakerAngles(final int inputChannelMask, final int virtualizationMode, final int[] angles) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean forceVirtualizationMode(final int virtualizationMode) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getVirtualizationMode() throws IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setParameterListener(final OnParameterChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Settings getProperties() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setProperties(final Settings settings) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static class Settings
    {
        @Deprecated
        public short strength;
        
        @Deprecated
        public Settings() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Settings(final String settings) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public interface OnParameterChangeListener
    {
        @Deprecated
        void onParameterChange(final Virtualizer p0, final int p1, final int p2, final short p3);
    }
}
