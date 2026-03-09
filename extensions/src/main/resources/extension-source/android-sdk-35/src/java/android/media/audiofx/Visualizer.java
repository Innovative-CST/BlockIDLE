package android.media.audiofx;

public class Visualizer
{
    public static final int ALREADY_EXISTS = -2;
    public static final int ERROR = -1;
    public static final int ERROR_BAD_VALUE = -4;
    public static final int ERROR_DEAD_OBJECT = -7;
    public static final int ERROR_INVALID_OPERATION = -5;
    public static final int ERROR_NO_INIT = -3;
    public static final int ERROR_NO_MEMORY = -6;
    public static final int MEASUREMENT_MODE_NONE = 0;
    public static final int MEASUREMENT_MODE_PEAK_RMS = 1;
    public static final int SCALING_MODE_AS_PLAYED = 1;
    public static final int SCALING_MODE_NORMALIZED = 0;
    public static final int STATE_ENABLED = 2;
    public static final int STATE_INITIALIZED = 1;
    public static final int STATE_UNINITIALIZED = 0;
    public static final int SUCCESS = 0;
    
    public Visualizer(final int audioSession) throws RuntimeException, UnsupportedOperationException {
        throw new RuntimeException("Stub!");
    }
    
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    public int setEnabled(final boolean enabled) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public static native int[] getCaptureSizeRange();
    
    public static native int getMaxCaptureRate();
    
    public int setCaptureSize(final int size) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public int getCaptureSize() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public int setScalingMode(final int mode) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public int getScalingMode() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public int setMeasurementMode(final int mode) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public int getMeasurementMode() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public int getSamplingRate() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public int getWaveForm(final byte[] waveform) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public int getFft(final byte[] fft) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public int getMeasurementPeakRms(final MeasurementPeakRms measurement) {
        throw new RuntimeException("Stub!");
    }
    
    public int setDataCaptureListener(@Nullable final OnDataCaptureListener listener, final int rate, final boolean waveform, final boolean fft) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class MeasurementPeakRms
    {
        public int mPeak;
        public int mRms;
        
        public MeasurementPeakRms() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnDataCaptureListener
    {
        void onWaveFormDataCapture(final Visualizer p0, final byte[] p1, final int p2);
        
        void onFftDataCapture(final Visualizer p0, final byte[] p1, final int p2);
    }
}
