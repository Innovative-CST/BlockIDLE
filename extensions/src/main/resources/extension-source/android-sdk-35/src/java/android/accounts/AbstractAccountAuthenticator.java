package android.accounts;

import android.os.Bundle;
import android.os.IBinder;
import android.content.Context;

public abstract class AbstractAccountAuthenticator
{
    public static final String KEY_CUSTOM_TOKEN_EXPIRY = "android.accounts.expiry";
    
    public AbstractAccountAuthenticator(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public final IBinder getIBinder() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Bundle editProperties(final AccountAuthenticatorResponse p0, final String p1);
    
    public abstract Bundle addAccount(final AccountAuthenticatorResponse p0, final String p1, final String p2, final String[] p3, final Bundle p4) throws NetworkErrorException;
    
    public abstract Bundle confirmCredentials(final AccountAuthenticatorResponse p0, final Account p1, final Bundle p2) throws NetworkErrorException;
    
    public abstract Bundle getAuthToken(final AccountAuthenticatorResponse p0, final Account p1, final String p2, final Bundle p3) throws NetworkErrorException;
    
    public abstract String getAuthTokenLabel(final String p0);
    
    public abstract Bundle updateCredentials(final AccountAuthenticatorResponse p0, final Account p1, final String p2, final Bundle p3) throws NetworkErrorException;
    
    public abstract Bundle hasFeatures(final AccountAuthenticatorResponse p0, final Account p1, final String[] p2) throws NetworkErrorException;
    
    public Bundle getAccountRemovalAllowed(final AccountAuthenticatorResponse response, final Account account) throws NetworkErrorException {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle getAccountCredentialsForCloning(final AccountAuthenticatorResponse response, final Account account) throws NetworkErrorException {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle addAccountFromCredentials(final AccountAuthenticatorResponse response, final Account account, final Bundle accountCredentials) throws NetworkErrorException {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle startAddAccountSession(final AccountAuthenticatorResponse response, final String accountType, final String authTokenType, final String[] requiredFeatures, final Bundle options) throws NetworkErrorException {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle startUpdateCredentialsSession(final AccountAuthenticatorResponse response, final Account account, final String authTokenType, final Bundle options) throws NetworkErrorException {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle finishSession(final AccountAuthenticatorResponse response, final String accountType, final Bundle sessionBundle) throws NetworkErrorException {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle isCredentialsUpdateSuggested(final AccountAuthenticatorResponse response, final Account account, final String statusToken) throws NetworkErrorException {
        throw new RuntimeException("Stub!");
    }
}
