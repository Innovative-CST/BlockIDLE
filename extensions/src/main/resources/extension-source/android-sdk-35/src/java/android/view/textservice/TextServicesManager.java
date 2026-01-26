package android.view.textservice;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.Locale;
import android.os.Bundle;

public final class TextServicesManager
{
    TextServicesManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SpellCheckerSession newSpellCheckerSession(@Nullable final Bundle bundle, @Nullable final Locale locale, @NonNull final SpellCheckerSession.SpellCheckerSessionListener listener, final boolean referToSpellCheckerLanguageSettings) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SpellCheckerSession newSpellCheckerSession(@NonNull final SpellCheckerSession.SpellCheckerSessionParams params, @NonNull final Executor executor, @NonNull final SpellCheckerSession.SpellCheckerSessionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<SpellCheckerInfo> getEnabledSpellCheckerInfos() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SpellCheckerInfo getCurrentSpellCheckerInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSpellCheckerEnabled() {
        throw new RuntimeException("Stub!");
    }
}
