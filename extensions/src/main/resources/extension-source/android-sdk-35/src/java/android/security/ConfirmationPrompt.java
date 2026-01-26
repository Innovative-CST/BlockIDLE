package android.security;

import android.content.Context;
import java.util.concurrent.Executor;

public class ConfirmationPrompt
{
    ConfirmationPrompt() {
        throw new RuntimeException("Stub!");
    }
    
    public void presentPrompt(@NonNull final Executor executor, @NonNull final ConfirmationCallback callback) throws ConfirmationAlreadyPresentingException, ConfirmationNotAvailableException {
        throw new RuntimeException("Stub!");
    }
    
    public void cancelPrompt() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isSupported(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setPromptText(final CharSequence promptText) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setExtraData(final byte[] extraData) {
            throw new RuntimeException("Stub!");
        }
        
        public ConfirmationPrompt build() {
            throw new RuntimeException("Stub!");
        }
    }
}
