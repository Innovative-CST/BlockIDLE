package android.media;

import android.os.Handler;

public final class AudioFocusRequest
{
    AudioFocusRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AudioAttributes getAudioAttributes() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFocusGain() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean willPauseWhenDucked() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean acceptsDelayedFocusGain() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(final int focusGain) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final AudioFocusRequest requestToCopy) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFocusGain(final int focusGain) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setOnAudioFocusChangeListener(@NonNull final AudioManager.OnAudioFocusChangeListener listener) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setOnAudioFocusChangeListener(@NonNull final AudioManager.OnAudioFocusChangeListener listener, @NonNull final Handler handler) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAudioAttributes(@NonNull final AudioAttributes attributes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setWillPauseWhenDucked(final boolean pauseOnDuck) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAcceptsDelayedFocusGain(final boolean acceptsDelayedFocusGain) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setForceDucking(final boolean forceDucking) {
            throw new RuntimeException("Stub!");
        }
        
        public AudioFocusRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
