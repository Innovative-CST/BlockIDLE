package android.view.textservice;

import android.os.Bundle;
import java.util.Locale;

public class SpellCheckerSession
{
    public static final String SERVICE_META_DATA = "android.view.textservice.scs";
    
    SpellCheckerSession() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSessionDisconnected() {
        throw new RuntimeException("Stub!");
    }
    
    public SpellCheckerInfo getSpellChecker() {
        throw new RuntimeException("Stub!");
    }
    
    public void cancel() {
        throw new RuntimeException("Stub!");
    }
    
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    public void getSentenceSuggestions(final TextInfo[] textInfos, final int suggestionsLimit) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void getSuggestions(final TextInfo textInfo, final int suggestionsLimit) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void getSuggestions(final TextInfo[] textInfos, final int suggestionsLimit, final boolean sequentialWords) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public static class SpellCheckerSessionParams
    {
        SpellCheckerSessionParams() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Locale getLocale() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean shouldReferToSpellCheckerLanguageSettings() {
            throw new RuntimeException("Stub!");
        }
        
        public int getSupportedAttributes() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Bundle getExtras() {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Builder
        {
            public Builder() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public SpellCheckerSessionParams build() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setLocale(@Nullable final Locale locale) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setShouldReferToSpellCheckerLanguageSettings(final boolean shouldReferToSpellCheckerLanguageSettings) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setSupportedAttributes(final int supportedAttributes) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setExtras(@NonNull final Bundle extras) {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public interface SpellCheckerSessionListener
    {
        void onGetSuggestions(final SuggestionsInfo[] p0);
        
        void onGetSentenceSuggestions(final SentenceSuggestionsInfo[] p0);
    }
}
