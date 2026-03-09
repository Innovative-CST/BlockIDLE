package android.speech;

import java.util.concurrent.Executor;
import android.content.Intent;
import android.content.ComponentName;
import android.content.Context;

public class SpeechRecognizer
{
    public static final String CONFIDENCE_SCORES = "confidence_scores";
    public static final String DETECTED_LANGUAGE = "detected_language";
    public static final int ERROR_AUDIO = 3;
    public static final int ERROR_CANNOT_CHECK_SUPPORT = 14;
    public static final int ERROR_CANNOT_LISTEN_TO_DOWNLOAD_EVENTS = 15;
    public static final int ERROR_CLIENT = 5;
    public static final int ERROR_INSUFFICIENT_PERMISSIONS = 9;
    public static final int ERROR_LANGUAGE_NOT_SUPPORTED = 12;
    public static final int ERROR_LANGUAGE_UNAVAILABLE = 13;
    public static final int ERROR_NETWORK = 2;
    public static final int ERROR_NETWORK_TIMEOUT = 1;
    public static final int ERROR_NO_MATCH = 7;
    public static final int ERROR_RECOGNIZER_BUSY = 8;
    public static final int ERROR_SERVER = 4;
    public static final int ERROR_SERVER_DISCONNECTED = 11;
    public static final int ERROR_SPEECH_TIMEOUT = 6;
    public static final int ERROR_TOO_MANY_REQUESTS = 10;
    public static final String LANGUAGE_DETECTION_CONFIDENCE_LEVEL = "language_detection_confidence_level";
    public static final int LANGUAGE_DETECTION_CONFIDENCE_LEVEL_CONFIDENT = 2;
    public static final int LANGUAGE_DETECTION_CONFIDENCE_LEVEL_HIGHLY_CONFIDENT = 3;
    public static final int LANGUAGE_DETECTION_CONFIDENCE_LEVEL_NOT_CONFIDENT = 1;
    public static final int LANGUAGE_DETECTION_CONFIDENCE_LEVEL_UNKNOWN = 0;
    public static final String LANGUAGE_SWITCH_RESULT = "language_switch_result";
    public static final int LANGUAGE_SWITCH_RESULT_FAILED = 2;
    public static final int LANGUAGE_SWITCH_RESULT_NOT_ATTEMPTED = 0;
    public static final int LANGUAGE_SWITCH_RESULT_SKIPPED_NO_MODEL = 3;
    public static final int LANGUAGE_SWITCH_RESULT_SUCCEEDED = 1;
    public static final String RECOGNITION_PARTS = "recognition_parts";
    public static final String RESULTS_ALTERNATIVES = "results_alternatives";
    public static final String RESULTS_RECOGNITION = "results_recognition";
    public static final String TOP_LOCALE_ALTERNATIVES = "top_locale_alternatives";
    
    SpeechRecognizer() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isRecognitionAvailable(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isOnDeviceRecognitionAvailable(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public static SpeechRecognizer createSpeechRecognizer(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public static SpeechRecognizer createSpeechRecognizer(final Context context, final ComponentName serviceComponent) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static SpeechRecognizer createOnDeviceSpeechRecognizer(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRecognitionListener(final RecognitionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void startListening(final Intent recognizerIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public void stopListening() {
        throw new RuntimeException("Stub!");
    }
    
    public void cancel() {
        throw new RuntimeException("Stub!");
    }
    
    public void checkRecognitionSupport(@NonNull final Intent recognizerIntent, @NonNull final Executor executor, @NonNull final RecognitionSupportCallback supportListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void triggerModelDownload(@NonNull final Intent recognizerIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public void triggerModelDownload(@NonNull final Intent recognizerIntent, @NonNull final Executor executor, @NonNull final ModelDownloadListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void destroy() {
        throw new RuntimeException("Stub!");
    }
}
