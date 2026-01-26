package android.service.credentials;

import android.credentials.ClearCredentialStateException;
import android.credentials.CreateCredentialException;
import android.credentials.GetCredentialException;
import android.os.OutcomeReceiver;
import android.os.CancellationSignal;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class CredentialProviderService extends Service
{
    public static final String EXTRA_BEGIN_GET_CREDENTIAL_REQUEST = "android.service.credentials.extra.BEGIN_GET_CREDENTIAL_REQUEST";
    public static final String EXTRA_BEGIN_GET_CREDENTIAL_RESPONSE = "android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE";
    public static final String EXTRA_CREATE_CREDENTIAL_EXCEPTION = "android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION";
    public static final String EXTRA_CREATE_CREDENTIAL_REQUEST = "android.service.credentials.extra.CREATE_CREDENTIAL_REQUEST";
    public static final String EXTRA_CREATE_CREDENTIAL_RESPONSE = "android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE";
    public static final String EXTRA_GET_CREDENTIAL_EXCEPTION = "android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION";
    public static final String EXTRA_GET_CREDENTIAL_REQUEST = "android.service.credentials.extra.GET_CREDENTIAL_REQUEST";
    public static final String EXTRA_GET_CREDENTIAL_RESPONSE = "android.service.credentials.extra.GET_CREDENTIAL_RESPONSE";
    public static final String SERVICE_INTERFACE = "android.service.credentials.CredentialProviderService";
    public static final String SERVICE_META_DATA = "android.credentials.provider";
    
    public CredentialProviderService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onCreate() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public final IBinder onBind(@NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onBeginGetCredential(@NonNull final BeginGetCredentialRequest p0, @NonNull final CancellationSignal p1, @NonNull final OutcomeReceiver<BeginGetCredentialResponse, GetCredentialException> p2);
    
    public abstract void onBeginCreateCredential(@NonNull final BeginCreateCredentialRequest p0, @NonNull final CancellationSignal p1, @NonNull final OutcomeReceiver<BeginCreateCredentialResponse, CreateCredentialException> p2);
    
    public abstract void onClearCredentialState(@NonNull final ClearCredentialStateRequest p0, @NonNull final CancellationSignal p1, @NonNull final OutcomeReceiver<Void, ClearCredentialStateException> p2);
}
