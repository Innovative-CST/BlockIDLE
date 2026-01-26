package android.view.translation;

import java.util.function.Consumer;
import java.util.concurrent.Executor;
import android.os.CancellationSignal;

public class Translator
{
    Translator() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public void translate(@NonNull final TranslationRequest request, @Nullable final CancellationSignal cancellationSignal, @NonNull final Executor executor, @NonNull final Consumer<TranslationResponse> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void destroy() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDestroyed() {
        throw new RuntimeException("Stub!");
    }
}
