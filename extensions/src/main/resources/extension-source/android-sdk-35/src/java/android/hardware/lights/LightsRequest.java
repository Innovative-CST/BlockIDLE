package android.hardware.lights;

import java.util.Map;
import java.util.List;

public final class LightsRequest
{
    LightsRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Integer> getLights() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<LightState> getLightStates() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<Light, LightState> getLightsAndStates() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addLight(@NonNull final Light light, @NonNull final LightState state) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearLight(@NonNull final Light light) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public LightsRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
