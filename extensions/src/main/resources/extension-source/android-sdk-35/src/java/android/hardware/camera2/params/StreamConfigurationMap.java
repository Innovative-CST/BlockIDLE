package android.hardware.camera2.params;

import android.util.Range;
import android.view.Surface;
import android.util.Size;

public final class StreamConfigurationMap
{
    StreamConfigurationMap() {
        throw new RuntimeException("Stub!");
    }
    
    public int[] getOutputFormats() {
        throw new RuntimeException("Stub!");
    }
    
    public int[] getValidOutputFormatsForInput(final int inputFormat) {
        throw new RuntimeException("Stub!");
    }
    
    public int[] getInputFormats() {
        throw new RuntimeException("Stub!");
    }
    
    public Size[] getInputSizes(final int format) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOutputSupportedFor(final int format) {
        throw new RuntimeException("Stub!");
    }
    
    public static <T> boolean isOutputSupportedFor(final Class<T> klass) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOutputSupportedFor(final Surface surface) {
        throw new RuntimeException("Stub!");
    }
    
    public <T> Size[] getOutputSizes(final Class<T> klass) {
        throw new RuntimeException("Stub!");
    }
    
    public Size[] getOutputSizes(final int format) {
        throw new RuntimeException("Stub!");
    }
    
    public Size[] getHighSpeedVideoSizes() {
        throw new RuntimeException("Stub!");
    }
    
    public Range<Integer>[] getHighSpeedVideoFpsRangesFor(final Size size) {
        throw new RuntimeException("Stub!");
    }
    
    public Range<Integer>[] getHighSpeedVideoFpsRanges() {
        throw new RuntimeException("Stub!");
    }
    
    public Size[] getHighSpeedVideoSizesFor(final Range<Integer> fpsRange) {
        throw new RuntimeException("Stub!");
    }
    
    public Size[] getHighResolutionOutputSizes(final int format) {
        throw new RuntimeException("Stub!");
    }
    
    public long getOutputMinFrameDuration(final int format, final Size size) {
        throw new RuntimeException("Stub!");
    }
    
    public <T> long getOutputMinFrameDuration(final Class<T> klass, final Size size) {
        throw new RuntimeException("Stub!");
    }
    
    public long getOutputStallDuration(final int format, final Size size) {
        throw new RuntimeException("Stub!");
    }
    
    public <T> long getOutputStallDuration(final Class<T> klass, final Size size) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
