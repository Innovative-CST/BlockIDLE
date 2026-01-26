package android.media;

import java.util.concurrent.Executor;
import android.content.Context;
import android.os.Bundle;

public class MediaController2 implements AutoCloseable
{
    MediaController2() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Session2Token getConnectedToken() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPlaybackActive() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Object sendSessionCommand(@NonNull final Session2Command command, @Nullable final Bundle args) {
        throw new RuntimeException("Stub!");
    }
    
    public void cancelSessionCommand(@NonNull final Object token) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Context context, @NonNull final Session2Token token) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setConnectionHints(@NonNull final Bundle connectionHints) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setControllerCallback(@NonNull final Executor executor, @NonNull final ControllerCallback callback) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public MediaController2 build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class ControllerCallback
    {
        public ControllerCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onConnected(@NonNull final MediaController2 controller, @NonNull final Session2CommandGroup allowedCommands) {
            throw new RuntimeException("Stub!");
        }
        
        public void onDisconnected(@NonNull final MediaController2 controller) {
            throw new RuntimeException("Stub!");
        }
        
        public void onPlaybackActiveChanged(@NonNull final MediaController2 controller, final boolean playbackActive) {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Session2Command.Result onSessionCommand(@NonNull final MediaController2 controller, @NonNull final Session2Command command, @Nullable final Bundle args) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCommandResult(@NonNull final MediaController2 controller, @NonNull final Object token, @NonNull final Session2Command command, @NonNull final Session2Command.Result result) {
            throw new RuntimeException("Stub!");
        }
    }
}
