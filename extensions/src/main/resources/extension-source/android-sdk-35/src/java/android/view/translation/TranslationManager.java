package android.view.translation;

import android.app.PendingIntent;
import java.util.Set;
import java.util.function.Consumer;
import java.util.concurrent.Executor;

public final class TranslationManager
{
    TranslationManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void createOnDeviceTranslator(@NonNull final TranslationContext translationContext, @NonNull final Executor executor, @NonNull final Consumer<Translator> callback) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<TranslationCapability> getOnDeviceTranslationCapabilities(final int sourceFormat, final int targetFormat) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnDeviceTranslationCapabilityUpdateListener(@NonNull final Executor executor, @NonNull final Consumer<TranslationCapability> capabilityListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnDeviceTranslationCapabilityUpdateListener(@NonNull final Consumer<TranslationCapability> capabilityListener) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PendingIntent getOnDeviceTranslationSettingsActivityIntent() {
        throw new RuntimeException("Stub!");
    }
}
