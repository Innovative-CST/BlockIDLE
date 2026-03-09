package android.media.tv;

import android.os.Bundle;
import android.net.Uri;
import android.media.tv.interactive.TvInteractiveAppView;
import android.os.Handler;
import android.content.Context;

public class TvRecordingClient
{
    public TvRecordingClient(final Context context, final String tag, @NonNull final RecordingCallback callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTvInteractiveAppView(@Nullable final TvInteractiveAppView view, @Nullable final String recordingId) {
        throw new RuntimeException("Stub!");
    }
    
    public void tune(final String inputId, final Uri channelUri) {
        throw new RuntimeException("Stub!");
    }
    
    public void tune(final String inputId, final Uri channelUri, final Bundle params) {
        throw new RuntimeException("Stub!");
    }
    
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    public void startRecording(@Nullable final Uri programUri) {
        throw new RuntimeException("Stub!");
    }
    
    public void startRecording(@Nullable final Uri programUri, @NonNull final Bundle params) {
        throw new RuntimeException("Stub!");
    }
    
    public void stopRecording() {
        throw new RuntimeException("Stub!");
    }
    
    public void pauseRecording() {
        throw new RuntimeException("Stub!");
    }
    
    public void pauseRecording(@NonNull final Bundle params) {
        throw new RuntimeException("Stub!");
    }
    
    public void resumeRecording() {
        throw new RuntimeException("Stub!");
    }
    
    public void resumeRecording(@NonNull final Bundle params) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendAppPrivateCommand(@NonNull final String action, final Bundle data) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class RecordingCallback
    {
        public RecordingCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onConnectionFailed(final String inputId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onDisconnected(final String inputId) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTuned(final Uri channelUri) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRecordingStopped(final Uri recordedProgramUri) {
            throw new RuntimeException("Stub!");
        }
        
        public void onError(final int error) {
            throw new RuntimeException("Stub!");
        }
    }
}
