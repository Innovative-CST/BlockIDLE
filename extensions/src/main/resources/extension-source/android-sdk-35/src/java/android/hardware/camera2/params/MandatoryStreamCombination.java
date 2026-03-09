package android.hardware.camera2.params;

import android.util.Size;
import java.util.List;

public final class MandatoryStreamCombination
{
    MandatoryStreamCombination() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isReprocessable() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<MandatoryStreamInformation> getStreamsInformation() {
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
    
    public static final class MandatoryStreamInformation
    {
        MandatoryStreamInformation() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isInput() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isUltraHighResolution() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isMaximumSize() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean is10BitCapable() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public List<Size> getAvailableSizes() {
            throw new RuntimeException("Stub!");
        }
        
        public int getFormat() {
            throw new RuntimeException("Stub!");
        }
        
        public int get10BitFormat() {
            throw new RuntimeException("Stub!");
        }
        
        public long getStreamUseCase() {
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
    }
}
