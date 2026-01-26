package android.speech.tts;

public abstract class UtteranceProgressListener
{
    public UtteranceProgressListener() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onStart(final String p0);
    
    public abstract void onDone(final String p0);
    
    @Deprecated
    public abstract void onError(final String p0);
    
    public void onError(final String utteranceId, final int errorCode) {
        throw new RuntimeException("Stub!");
    }
    
    public void onStop(final String utteranceId, final boolean interrupted) {
        throw new RuntimeException("Stub!");
    }
    
    public void onBeginSynthesis(final String utteranceId, final int sampleRateInHz, final int audioFormat, final int channelCount) {
        throw new RuntimeException("Stub!");
    }
    
    public void onAudioAvailable(final String utteranceId, final byte[] audio) {
        throw new RuntimeException("Stub!");
    }
    
    public void onRangeStart(final String utteranceId, final int start, final int end, final int frame) {
        throw new RuntimeException("Stub!");
    }
}
