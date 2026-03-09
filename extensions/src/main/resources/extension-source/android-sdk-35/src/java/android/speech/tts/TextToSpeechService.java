package android.speech.tts;

import android.os.IBinder;
import android.content.Intent;
import java.util.List;
import java.util.Set;
import android.app.Service;

public abstract class TextToSpeechService extends Service
{
    public TextToSpeechService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onCreate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onDestroy() {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract int onIsLanguageAvailable(final String p0, final String p1, final String p2);
    
    protected abstract String[] onGetLanguage();
    
    protected abstract int onLoadLanguage(final String p0, final String p1, final String p2);
    
    protected abstract void onStop();
    
    protected abstract void onSynthesizeText(final SynthesisRequest p0, final SynthesisCallback p1);
    
    protected Set<String> onGetFeaturesForLanguage(final String lang, final String country, final String variant) {
        throw new RuntimeException("Stub!");
    }
    
    public List<Voice> onGetVoices() {
        throw new RuntimeException("Stub!");
    }
    
    public String onGetDefaultVoiceNameFor(final String lang, final String country, final String variant) {
        throw new RuntimeException("Stub!");
    }
    
    public int onLoadVoice(final String voiceName) {
        throw new RuntimeException("Stub!");
    }
    
    public int onIsValidVoiceName(final String voiceName) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
}
