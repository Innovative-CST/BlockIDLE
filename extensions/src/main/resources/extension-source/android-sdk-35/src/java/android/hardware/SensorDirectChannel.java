package android.hardware;

import java.nio.channels.Channel;

public final class SensorDirectChannel implements Channel
{
    public static final int RATE_FAST = 2;
    public static final int RATE_NORMAL = 1;
    public static final int RATE_STOP = 0;
    public static final int RATE_VERY_FAST = 3;
    public static final int TYPE_HARDWARE_BUFFER = 2;
    public static final int TYPE_MEMORY_FILE = 1;
    
    SensorDirectChannel() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isOpen() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    public int configure(final Sensor sensor, final int rateLevel) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
}
