package android.speech;

import android.os.Bundle;

public interface RecognitionListener
{
    void onReadyForSpeech(final Bundle p0);
    
    void onBeginningOfSpeech();
    
    void onRmsChanged(final float p0);
    
    void onBufferReceived(final byte[] p0);
    
    void onEndOfSpeech();
    
    void onError(final int p0);
    
    void onResults(final Bundle p0);
    
    void onPartialResults(final Bundle p0);
    
    default void onSegmentResults(@NonNull final Bundle segmentResults) {
        throw new RuntimeException("Stub!");
    }
    
    default void onEndOfSegmentedSession() {
        throw new RuntimeException("Stub!");
    }
    
    default void onLanguageDetection(@NonNull final Bundle results) {
        throw new RuntimeException("Stub!");
    }
    
    void onEvent(final int p0, final Bundle p1);
}
