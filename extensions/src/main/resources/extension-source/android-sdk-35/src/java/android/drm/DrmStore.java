package android.drm;

@Deprecated
public class DrmStore
{
    @Deprecated
    public DrmStore() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static class Action
    {
        @Deprecated
        public static final int DEFAULT = 0;
        @Deprecated
        public static final int DISPLAY = 7;
        @Deprecated
        public static final int EXECUTE = 6;
        @Deprecated
        public static final int OUTPUT = 4;
        @Deprecated
        public static final int PLAY = 1;
        @Deprecated
        public static final int PREVIEW = 5;
        @Deprecated
        public static final int RINGTONE = 2;
        @Deprecated
        public static final int TRANSFER = 3;
        
        @Deprecated
        public Action() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static class DrmObjectType
    {
        @Deprecated
        public static final int CONTENT = 1;
        @Deprecated
        public static final int RIGHTS_OBJECT = 2;
        @Deprecated
        public static final int TRIGGER_OBJECT = 3;
        @Deprecated
        public static final int UNKNOWN = 0;
        
        @Deprecated
        public DrmObjectType() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static class Playback
    {
        @Deprecated
        public static final int PAUSE = 2;
        @Deprecated
        public static final int RESUME = 3;
        @Deprecated
        public static final int START = 0;
        @Deprecated
        public static final int STOP = 1;
        
        @Deprecated
        public Playback() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static class RightsStatus
    {
        @Deprecated
        public static final int RIGHTS_EXPIRED = 2;
        @Deprecated
        public static final int RIGHTS_INVALID = 1;
        @Deprecated
        public static final int RIGHTS_NOT_ACQUIRED = 3;
        @Deprecated
        public static final int RIGHTS_VALID = 0;
        
        @Deprecated
        public RightsStatus() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public interface ConstraintsColumns
    {
        @Deprecated
        public static final String EXTENDED_METADATA = "extended_metadata";
        @Deprecated
        public static final String LICENSE_AVAILABLE_TIME = "license_available_time";
        @Deprecated
        public static final String LICENSE_EXPIRY_TIME = "license_expiry_time";
        @Deprecated
        public static final String LICENSE_START_TIME = "license_start_time";
        @Deprecated
        public static final String MAX_REPEAT_COUNT = "max_repeat_count";
        @Deprecated
        public static final String REMAINING_REPEAT_COUNT = "remaining_repeat_count";
    }
}
