package android.media;

import java.util.concurrent.Executor;

public interface AudioRecordingMonitor
{
    void registerAudioRecordingCallback(@NonNull final Executor p0, @NonNull final AudioManager.AudioRecordingCallback p1);
    
    void unregisterAudioRecordingCallback(@NonNull final AudioManager.AudioRecordingCallback p0);
    
    @Nullable
    AudioRecordingConfiguration getActiveRecordingConfiguration();
}
