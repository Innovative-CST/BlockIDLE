package android.speech;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.IBinder;
import android.content.Context;
import android.content.ContextParams;
import android.content.AttributionSource;
import android.content.Intent;
import android.app.Service;

public abstract class RecognitionService extends Service
{
    public static final String SERVICE_INTERFACE = "android.speech.RecognitionService";
    public static final String SERVICE_META_DATA = "android.speech";
    
    public RecognitionService() {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract void onStartListening(final Intent p0, final Callback p1);
    
    protected abstract void onCancel(final Callback p0);
    
    protected abstract void onStopListening(final Callback p0);
    
    public void onCheckRecognitionSupport(@NonNull final Intent recognizerIntent, @NonNull final SupportCallback supportCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void onCheckRecognitionSupport(@NonNull final Intent recognizerIntent, @NonNull final AttributionSource attributionSource, @NonNull final SupportCallback supportCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void onTriggerModelDownload(@NonNull final Intent recognizerIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public void onTriggerModelDownload(@NonNull final Intent recognizerIntent, @NonNull final AttributionSource attributionSource) {
        throw new RuntimeException("Stub!");
    }
    
    public void onTriggerModelDownload(@NonNull final Intent recognizerIntent, @NonNull final AttributionSource attributionSource, @NonNull final ModelDownloadListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Context createContext(@NonNull final ContextParams contextParams) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onDestroy() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxConcurrentSessionsCount() {
        throw new RuntimeException("Stub!");
    }
    
    public class Callback
    {
        Callback() {
            throw new RuntimeException("Stub!");
        }
        
        public void beginningOfSpeech() throws RemoteException {
            throw new RuntimeException("Stub!");
        }
        
        public void bufferReceived(final byte[] buffer) throws RemoteException {
            throw new RuntimeException("Stub!");
        }
        
        public void endOfSpeech() throws RemoteException {
            throw new RuntimeException("Stub!");
        }
        
        public void error(final int error) throws RemoteException {
            throw new RuntimeException("Stub!");
        }
        
        public void partialResults(final Bundle partialResults) throws RemoteException {
            throw new RuntimeException("Stub!");
        }
        
        public void readyForSpeech(final Bundle params) throws RemoteException {
            throw new RuntimeException("Stub!");
        }
        
        public void results(final Bundle results) throws RemoteException {
            throw new RuntimeException("Stub!");
        }
        
        public void rmsChanged(final float rmsdB) throws RemoteException {
            throw new RuntimeException("Stub!");
        }
        
        public void segmentResults(@NonNull final Bundle results) throws RemoteException {
            throw new RuntimeException("Stub!");
        }
        
        public void endOfSegmentedSession() throws RemoteException {
            throw new RuntimeException("Stub!");
        }
        
        public void languageDetection(@NonNull final Bundle results) {
            throw new RuntimeException("Stub!");
        }
        
        public int getCallingUid() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AttributionSource getCallingAttributionSource() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class SupportCallback
    {
        SupportCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onSupportResult(@NonNull final RecognitionSupport recognitionSupport) {
            throw new RuntimeException("Stub!");
        }
        
        public void onError(final int errorCode) {
            throw new RuntimeException("Stub!");
        }
    }
}
