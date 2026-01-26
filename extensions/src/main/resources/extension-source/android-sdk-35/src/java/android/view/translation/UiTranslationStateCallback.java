package android.view.translation;

import android.icu.util.ULocale;

public interface UiTranslationStateCallback
{
    default void onStarted(@NonNull final ULocale sourceLocale, @NonNull final ULocale targetLocale) {
        throw new RuntimeException("Stub!");
    }
    
    default void onStarted(@NonNull final ULocale sourceLocale, @NonNull final ULocale targetLocale, @NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    void onPaused();
    
    default void onPaused(@NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    default void onResumed(@NonNull final ULocale sourceLocale, @NonNull final ULocale targetLocale) {
        throw new RuntimeException("Stub!");
    }
    
    default void onResumed(@NonNull final ULocale sourceLocale, @NonNull final ULocale targetLocale, @NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    void onFinished();
    
    default void onFinished(@NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
}
