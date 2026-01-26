package android.hardware.lights;

import java.util.List;

public abstract class LightsManager
{
    LightsManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract List<Light> getLights();
    
    @NonNull
    public abstract LightState getLightState(@NonNull final Light p0);
    
    @NonNull
    public abstract LightsSession openSession();
    
    public abstract static class LightsSession implements AutoCloseable
    {
        LightsSession() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void requestLights(@NonNull final LightsRequest p0);
        
        @Override
        public abstract void close();
    }
}
