package android.media.audiofx;

public class Equalizer extends AudioEffect
{
    public static final int PARAM_BAND_FREQ_RANGE = 4;
    public static final int PARAM_BAND_LEVEL = 2;
    public static final int PARAM_CENTER_FREQ = 3;
    public static final int PARAM_CURRENT_PRESET = 6;
    public static final int PARAM_GET_BAND = 5;
    public static final int PARAM_GET_NUM_OF_PRESETS = 7;
    public static final int PARAM_GET_PRESET_NAME = 8;
    public static final int PARAM_LEVEL_RANGE = 1;
    public static final int PARAM_NUM_BANDS = 0;
    public static final int PARAM_STRING_SIZE_MAX = 32;
    
    public Equalizer(final int priority, final int audioSession) throws IllegalArgumentException, IllegalStateException, RuntimeException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    public short getNumberOfBands() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    public short[] getBandLevelRange() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    public void setBandLevel(final short band, final short level) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    public short getBandLevel(final short band) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    public int getCenterFreq(final short band) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    public int[] getBandFreqRange(final short band) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    public short getBand(final int frequency) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    public short getCurrentPreset() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    public void usePreset(final short preset) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    public short getNumberOfPresets() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    public String getPresetName(final short preset) {
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
        public short[] bandLevels;
        public short curPreset;
        public short numBands;
        
        public Settings() {
            this.numBands = 0;
            throw new RuntimeException("Stub!");
        }
        
        public Settings(final String settings) {
            this.numBands = 0;
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnParameterChangeListener
    {
        void onParameterChange(final Equalizer p0, final int p1, final int p2, final int p3, final int p4);
    }
}
