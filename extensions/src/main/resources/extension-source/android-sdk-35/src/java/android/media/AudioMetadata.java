package android.media;

public final class AudioMetadata
{
    AudioMetadata() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static AudioMetadataMap createMap() {
        throw new RuntimeException("Stub!");
    }
    
    public static class Format
    {
        @NonNull
        public static final Key<Boolean> KEY_ATMOS_PRESENT;
        @NonNull
        public static final Key<Integer> KEY_AUDIO_ENCODING;
        @NonNull
        public static final Key<Integer> KEY_BIT_RATE;
        @NonNull
        public static final Key<Integer> KEY_BIT_WIDTH;
        @NonNull
        public static final Key<Integer> KEY_CHANNEL_MASK;
        @NonNull
        public static final Key<String> KEY_MIME;
        @NonNull
        public static final Key<Integer> KEY_PRESENTATION_CONTENT_CLASSIFIER;
        @NonNull
        public static final Key<Integer> KEY_PRESENTATION_ID;
        @NonNull
        public static final Key<String> KEY_PRESENTATION_LANGUAGE;
        @NonNull
        public static final Key<Integer> KEY_PROGRAM_ID;
        @NonNull
        public static final Key<Integer> KEY_SAMPLE_RATE;
        
        Format() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            KEY_ATMOS_PRESENT = null;
            KEY_AUDIO_ENCODING = null;
            KEY_BIT_RATE = null;
            KEY_BIT_WIDTH = null;
            KEY_CHANNEL_MASK = null;
            KEY_MIME = null;
            KEY_PRESENTATION_CONTENT_CLASSIFIER = null;
            KEY_PRESENTATION_ID = null;
            KEY_PRESENTATION_LANGUAGE = null;
            KEY_PROGRAM_ID = null;
            KEY_SAMPLE_RATE = null;
        }
    }
    
    public interface Key<T>
    {
        @NonNull
        String getName();
        
        @NonNull
        Class<T> getValueClass();
    }
}
