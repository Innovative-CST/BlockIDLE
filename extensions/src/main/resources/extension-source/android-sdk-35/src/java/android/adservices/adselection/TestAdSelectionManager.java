package android.adservices.adselection;

import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;

public class TestAdSelectionManager
{
    TestAdSelectionManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void overrideAdSelectionConfigRemoteInfo(@NonNull final AddAdSelectionOverrideRequest request, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Object, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeAdSelectionConfigRemoteInfoOverride(@NonNull final RemoveAdSelectionOverrideRequest request, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Object, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void resetAllAdSelectionConfigRemoteOverrides(@NonNull final Executor executor, @NonNull final OutcomeReceiver<Object, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void overrideAdSelectionFromOutcomesConfigRemoteInfo(@NonNull final AddAdSelectionFromOutcomesOverrideRequest request, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Object, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeAdSelectionFromOutcomesConfigRemoteInfoOverride(@NonNull final RemoveAdSelectionFromOutcomesOverrideRequest request, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Object, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void resetAllAdSelectionFromOutcomesConfigRemoteOverrides(@NonNull final Executor executor, @NonNull final OutcomeReceiver<Object, Exception> receiver) {
        throw new RuntimeException("Stub!");
    }
}
