package android.media;

import java.util.List;

public final class EncoderProfiles
{
    EncoderProfiles() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDefaultDurationSeconds() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRecommendedFileFormat() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AudioProfile> getAudioProfiles() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<VideoProfile> getVideoProfiles() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class AudioProfile
    {
        AudioProfile() {
            throw new RuntimeException("Stub!");
        }
        
        public int getCodec() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getMediaType() {
            throw new RuntimeException("Stub!");
        }
        
        public int getBitrate() {
            throw new RuntimeException("Stub!");
        }
        
        public int getSampleRate() {
            throw new RuntimeException("Stub!");
        }
        
        public int getChannels() {
            throw new RuntimeException("Stub!");
        }
        
        public int getProfile() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class VideoProfile
    {
        public static final int HDR_DOLBY_VISION = 4;
        public static final int HDR_HDR10 = 2;
        public static final int HDR_HDR10PLUS = 3;
        public static final int HDR_HLG = 1;
        public static final int HDR_NONE = 0;
        public static final int YUV_420 = 0;
        public static final int YUV_422 = 1;
        public static final int YUV_444 = 2;
        
        VideoProfile() {
            throw new RuntimeException("Stub!");
        }
        
        public int getCodec() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getMediaType() {
            throw new RuntimeException("Stub!");
        }
        
        public int getBitrate() {
            throw new RuntimeException("Stub!");
        }
        
        public int getFrameRate() {
            throw new RuntimeException("Stub!");
        }
        
        public int getWidth() {
            throw new RuntimeException("Stub!");
        }
        
        public int getHeight() {
            throw new RuntimeException("Stub!");
        }
        
        public int getProfile() {
            throw new RuntimeException("Stub!");
        }
        
        public int getBitDepth() {
            throw new RuntimeException("Stub!");
        }
        
        public int getChromaSubsampling() {
            throw new RuntimeException("Stub!");
        }
        
        public int getHdrFormat() {
            throw new RuntimeException("Stub!");
        }
    }
}
