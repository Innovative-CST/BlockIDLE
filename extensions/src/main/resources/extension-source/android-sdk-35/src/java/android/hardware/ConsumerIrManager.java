package android.hardware;

public final class ConsumerIrManager
{
    ConsumerIrManager() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasIrEmitter() {
        throw new RuntimeException("Stub!");
    }
    
    public void transmit(final int carrierFrequency, final int[] pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public CarrierFrequencyRange[] getCarrierFrequencies() {
        throw new RuntimeException("Stub!");
    }
    
    public final class CarrierFrequencyRange
    {
        public CarrierFrequencyRange(final int min, final int max) {
            throw new RuntimeException("Stub!");
        }
        
        public int getMinFrequency() {
            throw new RuntimeException("Stub!");
        }
        
        public int getMaxFrequency() {
            throw new RuntimeException("Stub!");
        }
    }
}
