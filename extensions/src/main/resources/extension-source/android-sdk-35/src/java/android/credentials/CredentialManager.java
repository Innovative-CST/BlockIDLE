package android.credentials;

import android.content.ComponentName;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;
import android.os.CancellationSignal;
import android.content.Context;

public final class CredentialManager
{
    CredentialManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void getCredential(@NonNull final Context context, @NonNull final GetCredentialRequest request, @Nullable final CancellationSignal cancellationSignal, @NonNull final Executor executor, @NonNull final OutcomeReceiver<GetCredentialResponse, GetCredentialException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void getCredential(@NonNull final Context context, @NonNull final PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, @Nullable final CancellationSignal cancellationSignal, @NonNull final Executor executor, @NonNull final OutcomeReceiver<GetCredentialResponse, GetCredentialException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void prepareGetCredential(@NonNull final GetCredentialRequest request, @Nullable final CancellationSignal cancellationSignal, @NonNull final Executor executor, @NonNull final OutcomeReceiver<PrepareGetCredentialResponse, GetCredentialException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void createCredential(@NonNull final Context context, @NonNull final CreateCredentialRequest request, @Nullable final CancellationSignal cancellationSignal, @NonNull final Executor executor, @NonNull final OutcomeReceiver<CreateCredentialResponse, CreateCredentialException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearCredentialState(@NonNull final ClearCredentialStateRequest request, @Nullable final CancellationSignal cancellationSignal, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Void, ClearCredentialStateException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEnabledCredentialProviderService(@NonNull final ComponentName componentName) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerCredentialDescription(@NonNull final RegisterCredentialDescriptionRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterCredentialDescription(@NonNull final UnregisterCredentialDescriptionRequest request) {
        throw new RuntimeException("Stub!");
    }
}
