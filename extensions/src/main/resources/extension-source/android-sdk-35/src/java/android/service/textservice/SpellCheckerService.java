package android.service.textservice;

import android.os.Bundle;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class SpellCheckerService extends Service
{
    public static final String SERVICE_INTERFACE = "android.service.textservice.SpellCheckerService";
    
    public SpellCheckerService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Session createSession();
    
    public abstract static class Session
    {
        public Session() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onCreate();
        
        public abstract SuggestionsInfo onGetSuggestions(final TextInfo p0, final int p1);
        
        public SuggestionsInfo[] onGetSuggestionsMultiple(final TextInfo[] textInfos, final int suggestionsLimit, final boolean sequentialWords) {
            throw new RuntimeException("Stub!");
        }
        
        public SentenceSuggestionsInfo[] onGetSentenceSuggestionsMultiple(final TextInfo[] textInfos, final int suggestionsLimit) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCancel() {
            throw new RuntimeException("Stub!");
        }
        
        public void onClose() {
            throw new RuntimeException("Stub!");
        }
        
        public String getLocale() {
            throw new RuntimeException("Stub!");
        }
        
        public Bundle getBundle() {
            throw new RuntimeException("Stub!");
        }
        
        public int getSupportedAttributes() {
            throw new RuntimeException("Stub!");
        }
    }
}
