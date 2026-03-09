package android.media;

import android.util.Pair;
import java.util.List;

public final class MicrophoneInfo
{
    public static final int CHANNEL_MAPPING_DIRECT = 1;
    public static final int CHANNEL_MAPPING_PROCESSED = 2;
    public static final int DIRECTIONALITY_BI_DIRECTIONAL = 2;
    public static final int DIRECTIONALITY_CARDIOID = 3;
    public static final int DIRECTIONALITY_HYPER_CARDIOID = 4;
    public static final int DIRECTIONALITY_OMNI = 1;
    public static final int DIRECTIONALITY_SUPER_CARDIOID = 5;
    public static final int DIRECTIONALITY_UNKNOWN = 0;
    public static final int GROUP_UNKNOWN = -1;
    public static final int INDEX_IN_THE_GROUP_UNKNOWN = -1;
    public static final int LOCATION_MAINBODY = 1;
    public static final int LOCATION_MAINBODY_MOVABLE = 2;
    public static final int LOCATION_PERIPHERAL = 3;
    public static final int LOCATION_UNKNOWN = 0;
    public static final Coordinate3F ORIENTATION_UNKNOWN;
    public static final Coordinate3F POSITION_UNKNOWN;
    public static final float SENSITIVITY_UNKNOWN = -3.4028235E38f;
    public static final float SPL_UNKNOWN = -3.4028235E38f;
    
    MicrophoneInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public int getId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLocation() {
        throw new RuntimeException("Stub!");
    }
    
    public int getGroup() {
        throw new RuntimeException("Stub!");
    }
    
    public int getIndexInTheGroup() {
        throw new RuntimeException("Stub!");
    }
    
    public Coordinate3F getPosition() {
        throw new RuntimeException("Stub!");
    }
    
    public Coordinate3F getOrientation() {
        throw new RuntimeException("Stub!");
    }
    
    public List<Pair<Float, Float>> getFrequencyResponse() {
        throw new RuntimeException("Stub!");
    }
    
    public List<Pair<Integer, Integer>> getChannelMapping() {
        throw new RuntimeException("Stub!");
    }
    
    public float getSensitivity() {
        throw new RuntimeException("Stub!");
    }
    
    public float getMaxSpl() {
        throw new RuntimeException("Stub!");
    }
    
    public float getMinSpl() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDirectionality() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        ORIENTATION_UNKNOWN = null;
        POSITION_UNKNOWN = null;
    }
    
    public static final class Coordinate3F
    {
        public final float x;
        public final float y;
        public final float z;
        
        Coordinate3F() {
            this.x = 0.0f;
            this.y = 0.0f;
            this.z = 0.0f;
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object obj) {
            throw new RuntimeException("Stub!");
        }
    }
}
