package android.accessibilityservice;

import android.graphics.Path;

public final class GestureDescription
{
    GestureDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMaxStrokeCount() {
        throw new RuntimeException("Stub!");
    }
    
    public static long getMaxGestureDuration() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStrokeCount() {
        throw new RuntimeException("Stub!");
    }
    
    public StrokeDescription getStroke(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDisplayId() {
        throw new RuntimeException("Stub!");
    }
    
    public static class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder addStroke(@NonNull final StrokeDescription strokeDescription) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDisplayId(final int displayId) {
            throw new RuntimeException("Stub!");
        }
        
        public GestureDescription build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class StrokeDescription
    {
        public StrokeDescription(@NonNull final Path path, final long startTime, final long duration) {
            throw new RuntimeException("Stub!");
        }
        
        public StrokeDescription(@NonNull final Path path, final long startTime, final long duration, final boolean willContinue) {
            throw new RuntimeException("Stub!");
        }
        
        public Path getPath() {
            throw new RuntimeException("Stub!");
        }
        
        public long getStartTime() {
            throw new RuntimeException("Stub!");
        }
        
        public long getDuration() {
            throw new RuntimeException("Stub!");
        }
        
        public StrokeDescription continueStroke(final Path path, final long startTime, final long duration, final boolean willContinue) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean willContinue() {
            throw new RuntimeException("Stub!");
        }
    }
}
