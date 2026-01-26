package android.telecom;

import android.os.Bundle;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;
import android.os.ParcelUuid;

public final class CallControl
{
    CallControl() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ParcelUuid getCallId() {
        throw new RuntimeException("Stub!");
    }
    
    public void setActive(@NonNull final Executor executor, @NonNull final OutcomeReceiver<Void, CallException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void answer(final int videoState, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Void, CallException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInactive(@NonNull final Executor executor, @NonNull final OutcomeReceiver<Void, CallException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void disconnect(@NonNull final DisconnectCause disconnectCause, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Void, CallException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void startCallStreaming(@NonNull final Executor executor, @NonNull final OutcomeReceiver<Void, CallException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestCallEndpointChange(@NonNull final CallEndpoint callEndpoint, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Void, CallException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestMuteState(final boolean isMuted, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Void, CallException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestVideoState(final int videoState, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Void, CallException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void sendEvent(@NonNull final String event, @NonNull final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
}
