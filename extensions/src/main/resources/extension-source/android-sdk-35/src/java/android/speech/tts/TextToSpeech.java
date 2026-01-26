package android.speech.tts;

import java.util.List;
import android.os.ParcelFileDescriptor;
import android.media.AudioAttributes;
import java.util.Set;
import java.util.Locale;
import java.util.HashMap;
import android.os.Bundle;
import android.net.Uri;
import java.io.File;
import android.content.Context;

public class TextToSpeech
{
    public static final String ACTION_TTS_QUEUE_PROCESSING_COMPLETED = "android.speech.tts.TTS_QUEUE_PROCESSING_COMPLETED";
    public static final int ERROR = -1;
    public static final int ERROR_INVALID_REQUEST = -8;
    public static final int ERROR_NETWORK = -6;
    public static final int ERROR_NETWORK_TIMEOUT = -7;
    public static final int ERROR_NOT_INSTALLED_YET = -9;
    public static final int ERROR_OUTPUT = -5;
    public static final int ERROR_SERVICE = -4;
    public static final int ERROR_SYNTHESIS = -3;
    public static final int LANG_AVAILABLE = 0;
    public static final int LANG_COUNTRY_AVAILABLE = 1;
    public static final int LANG_COUNTRY_VAR_AVAILABLE = 2;
    public static final int LANG_MISSING_DATA = -1;
    public static final int LANG_NOT_SUPPORTED = -2;
    public static final int QUEUE_ADD = 1;
    public static final int QUEUE_FLUSH = 0;
    public static final int STOPPED = -2;
    public static final int SUCCESS = 0;
    
    public TextToSpeech(final Context context, final OnInitListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public TextToSpeech(final Context context, final OnInitListener listener, final String engine) {
        throw new RuntimeException("Stub!");
    }
    
    public void shutdown() {
        throw new RuntimeException("Stub!");
    }
    
    public int addSpeech(final String text, final String packagename, final int resourceId) {
        throw new RuntimeException("Stub!");
    }
    
    public int addSpeech(final CharSequence text, final String packagename, final int resourceId) {
        throw new RuntimeException("Stub!");
    }
    
    public int addSpeech(final String text, final String filename) {
        throw new RuntimeException("Stub!");
    }
    
    public int addSpeech(final CharSequence text, final File file) {
        throw new RuntimeException("Stub!");
    }
    
    public int addSpeech(@NonNull final CharSequence text, @NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    public int addEarcon(final String earcon, final String packagename, final int resourceId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int addEarcon(final String earcon, final String filename) {
        throw new RuntimeException("Stub!");
    }
    
    public int addEarcon(final String earcon, final File file) {
        throw new RuntimeException("Stub!");
    }
    
    public int addEarcon(@NonNull final String earcon, @NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    public int speak(final CharSequence text, final int queueMode, final Bundle params, final String utteranceId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int speak(final String text, final int queueMode, final HashMap<String, String> params) {
        throw new RuntimeException("Stub!");
    }
    
    public int playEarcon(final String earcon, final int queueMode, final Bundle params, final String utteranceId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int playEarcon(final String earcon, final int queueMode, final HashMap<String, String> params) {
        throw new RuntimeException("Stub!");
    }
    
    public int playSilentUtterance(final long durationInMs, final int queueMode, final String utteranceId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int playSilence(final long durationInMs, final int queueMode, final HashMap<String, String> params) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Set<String> getFeatures(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSpeaking() {
        throw new RuntimeException("Stub!");
    }
    
    public int stop() {
        throw new RuntimeException("Stub!");
    }
    
    public int setSpeechRate(final float speechRate) {
        throw new RuntimeException("Stub!");
    }
    
    public int setPitch(final float pitch) {
        throw new RuntimeException("Stub!");
    }
    
    public int setAudioAttributes(final AudioAttributes audioAttributes) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Locale getDefaultLanguage() {
        throw new RuntimeException("Stub!");
    }
    
    public int setLanguage(final Locale loc) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Locale getLanguage() {
        throw new RuntimeException("Stub!");
    }
    
    public Set<Locale> getAvailableLanguages() {
        throw new RuntimeException("Stub!");
    }
    
    public Set<Voice> getVoices() {
        throw new RuntimeException("Stub!");
    }
    
    public int setVoice(final Voice voice) {
        throw new RuntimeException("Stub!");
    }
    
    public Voice getVoice() {
        throw new RuntimeException("Stub!");
    }
    
    public Voice getDefaultVoice() {
        throw new RuntimeException("Stub!");
    }
    
    public int isLanguageAvailable(final Locale loc) {
        throw new RuntimeException("Stub!");
    }
    
    public int synthesizeToFile(@NonNull final CharSequence text, @NonNull final Bundle params, @NonNull final ParcelFileDescriptor fileDescriptor, @NonNull final String utteranceId) {
        throw new RuntimeException("Stub!");
    }
    
    public int synthesizeToFile(final CharSequence text, final Bundle params, final File file, final String utteranceId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int synthesizeToFile(final String text, final HashMap<String, String> params, final String filename) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int setOnUtteranceCompletedListener(final OnUtteranceCompletedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public int setOnUtteranceProgressListener(final UtteranceProgressListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int setEngineByPackageName(final String enginePackageName) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDefaultEngine() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean areDefaultsEnforced() {
        throw new RuntimeException("Stub!");
    }
    
    public List<EngineInfo> getEngines() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMaxSpeechInputLength() {
        throw new RuntimeException("Stub!");
    }
    
    public class Engine
    {
        public static final String ACTION_CHECK_TTS_DATA = "android.speech.tts.engine.CHECK_TTS_DATA";
        public static final String ACTION_GET_SAMPLE_TEXT = "android.speech.tts.engine.GET_SAMPLE_TEXT";
        public static final String ACTION_INSTALL_TTS_DATA = "android.speech.tts.engine.INSTALL_TTS_DATA";
        public static final String ACTION_TTS_DATA_INSTALLED = "android.speech.tts.engine.TTS_DATA_INSTALLED";
        @Deprecated
        public static final int CHECK_VOICE_DATA_BAD_DATA = -1;
        public static final int CHECK_VOICE_DATA_FAIL = 0;
        @Deprecated
        public static final int CHECK_VOICE_DATA_MISSING_DATA = -2;
        @Deprecated
        public static final int CHECK_VOICE_DATA_MISSING_VOLUME = -3;
        public static final int CHECK_VOICE_DATA_PASS = 1;
        public static final int DEFAULT_STREAM = 3;
        public static final String EXTRA_AVAILABLE_VOICES = "availableVoices";
        @Deprecated
        public static final String EXTRA_CHECK_VOICE_DATA_FOR = "checkVoiceDataFor";
        public static final String EXTRA_SAMPLE_TEXT = "sampleText";
        @Deprecated
        public static final String EXTRA_TTS_DATA_INSTALLED = "dataInstalled";
        public static final String EXTRA_UNAVAILABLE_VOICES = "unavailableVoices";
        @Deprecated
        public static final String EXTRA_VOICE_DATA_FILES = "dataFiles";
        @Deprecated
        public static final String EXTRA_VOICE_DATA_FILES_INFO = "dataFilesInfo";
        @Deprecated
        public static final String EXTRA_VOICE_DATA_ROOT_DIRECTORY = "dataRoot";
        public static final String INTENT_ACTION_TTS_SERVICE = "android.intent.action.TTS_SERVICE";
        @Deprecated
        public static final String KEY_FEATURE_EMBEDDED_SYNTHESIS = "embeddedTts";
        public static final String KEY_FEATURE_NETWORK_RETRIES_COUNT = "networkRetriesCount";
        @Deprecated
        public static final String KEY_FEATURE_NETWORK_SYNTHESIS = "networkTts";
        public static final String KEY_FEATURE_NETWORK_TIMEOUT_MS = "networkTimeoutMs";
        public static final String KEY_FEATURE_NOT_INSTALLED = "notInstalled";
        public static final String KEY_PARAM_PAN = "pan";
        public static final String KEY_PARAM_SESSION_ID = "sessionId";
        public static final String KEY_PARAM_STREAM = "streamType";
        public static final String KEY_PARAM_UTTERANCE_ID = "utteranceId";
        public static final String KEY_PARAM_VOLUME = "volume";
        public static final String SERVICE_META_DATA = "android.speech.tts";
        
        public Engine() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class EngineInfo
    {
        public int icon;
        public String label;
        public String name;
        
        public EngineInfo() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public interface OnUtteranceCompletedListener
    {
        @Deprecated
        void onUtteranceCompleted(final String p0);
    }
    
    public interface OnInitListener
    {
        void onInit(final int p0);
    }
}
