package android.media.audiofx;

public class PresetReverb extends AudioEffect
{
    public static final int PARAM_PRESET = 0;
    public static final short PRESET_LARGEHALL = 5;
    public static final short PRESET_LARGEROOM = 3;
    public static final short PRESET_MEDIUMHALL = 4;
    public static final short PRESET_MEDIUMROOM = 2;
    public static final short PRESET_NONE = 0;
    public static final short PRESET_PLATE = 6;
    public static final short PRESET_SMALLROOM = 1;
    
    public PresetReverb(final int priority, final int audioSession) throws IllegalArgumentException, RuntimeException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    public void setPreset(final short preset) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    public short getPreset() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
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
        public short preset;
        
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
        void onParameterChange(final PresetReverb p0, final int p1, final int p2, final short p3);
    }
}
