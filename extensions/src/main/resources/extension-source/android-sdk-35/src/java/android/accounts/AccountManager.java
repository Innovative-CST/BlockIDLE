package android.accounts;

import java.util.List;
import android.content.Intent;
import java.util.ArrayList;
import java.io.IOException;
import android.app.Activity;
import java.util.Map;
import android.os.Bundle;
import android.os.Handler;
import android.content.Context;

public class AccountManager
{
    public static final String ACTION_ACCOUNT_REMOVED = "android.accounts.action.ACCOUNT_REMOVED";
    public static final String ACTION_AUTHENTICATOR_INTENT = "android.accounts.AccountAuthenticator";
    public static final String AUTHENTICATOR_ATTRIBUTES_NAME = "account-authenticator";
    public static final String AUTHENTICATOR_META_DATA_NAME = "android.accounts.AccountAuthenticator";
    public static final int ERROR_CODE_BAD_ARGUMENTS = 7;
    public static final int ERROR_CODE_BAD_AUTHENTICATION = 9;
    public static final int ERROR_CODE_BAD_REQUEST = 8;
    public static final int ERROR_CODE_CANCELED = 4;
    public static final int ERROR_CODE_INVALID_RESPONSE = 5;
    public static final int ERROR_CODE_NETWORK_ERROR = 3;
    public static final int ERROR_CODE_REMOTE_EXCEPTION = 1;
    public static final int ERROR_CODE_UNSUPPORTED_OPERATION = 6;
    public static final String KEY_ACCOUNTS = "accounts";
    public static final String KEY_ACCOUNT_AUTHENTICATOR_RESPONSE = "accountAuthenticatorResponse";
    public static final String KEY_ACCOUNT_MANAGER_RESPONSE = "accountManagerResponse";
    public static final String KEY_ACCOUNT_NAME = "authAccount";
    public static final String KEY_ACCOUNT_SESSION_BUNDLE = "accountSessionBundle";
    public static final String KEY_ACCOUNT_STATUS_TOKEN = "accountStatusToken";
    public static final String KEY_ACCOUNT_TYPE = "accountType";
    public static final String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
    public static final String KEY_AUTHENTICATOR_TYPES = "authenticator_types";
    public static final String KEY_AUTHTOKEN = "authtoken";
    public static final String KEY_AUTH_FAILED_MESSAGE = "authFailedMessage";
    public static final String KEY_AUTH_TOKEN_LABEL = "authTokenLabelKey";
    public static final String KEY_BOOLEAN_RESULT = "booleanResult";
    public static final String KEY_CALLER_PID = "callerPid";
    public static final String KEY_CALLER_UID = "callerUid";
    public static final String KEY_ERROR_CODE = "errorCode";
    public static final String KEY_ERROR_MESSAGE = "errorMessage";
    public static final String KEY_INTENT = "intent";
    public static final String KEY_LAST_AUTHENTICATED_TIME = "lastAuthenticatedTime";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_USERDATA = "userdata";
    @Deprecated
    public static final String LOGIN_ACCOUNTS_CHANGED_ACTION = "android.accounts.LOGIN_ACCOUNTS_CHANGED";
    public static final String PACKAGE_NAME_KEY_LEGACY_NOT_VISIBLE = "android:accounts:key_legacy_not_visible";
    public static final String PACKAGE_NAME_KEY_LEGACY_VISIBLE = "android:accounts:key_legacy_visible";
    public static final int VISIBILITY_NOT_VISIBLE = 3;
    public static final int VISIBILITY_UNDEFINED = 0;
    public static final int VISIBILITY_USER_MANAGED_NOT_VISIBLE = 4;
    public static final int VISIBILITY_USER_MANAGED_VISIBLE = 2;
    public static final int VISIBILITY_VISIBLE = 1;
    
    AccountManager() {
        throw new RuntimeException("Stub!");
    }
    
    public static AccountManager get(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPassword(final Account account) {
        throw new RuntimeException("Stub!");
    }
    
    public String getUserData(final Account account, final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public AuthenticatorDescription[] getAuthenticatorTypes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Account[] getAccounts() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Account[] getAccountsByTypeForPackage(final String type, final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Account[] getAccountsByType(final String type) {
        throw new RuntimeException("Stub!");
    }
    
    public AccountManagerFuture<Boolean> hasFeatures(final Account account, final String[] features, final AccountManagerCallback<Boolean> callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public AccountManagerFuture<Account[]> getAccountsByTypeAndFeatures(final String type, final String[] features, final AccountManagerCallback<Account[]> callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean addAccountExplicitly(final Account account, final String password, final Bundle userdata) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean addAccountExplicitly(final Account account, final String password, final Bundle extras, final Map<String, Integer> visibility) {
        throw new RuntimeException("Stub!");
    }
    
    public Map<String, Integer> getPackagesAndVisibilityForAccount(final Account account) {
        throw new RuntimeException("Stub!");
    }
    
    public Map<Account, Integer> getAccountsAndVisibilityForPackage(final String packageName, final String accountType) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setAccountVisibility(final Account account, final String packageName, final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAccountVisibility(final Account account, final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean notifyAccountAuthenticated(final Account account) {
        throw new RuntimeException("Stub!");
    }
    
    public AccountManagerFuture<Account> renameAccount(final Account account, final String newName, final AccountManagerCallback<Account> callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPreviousName(final Account account) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public AccountManagerFuture<Boolean> removeAccount(final Account account, final AccountManagerCallback<Boolean> callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public AccountManagerFuture<Bundle> removeAccount(final Account account, final Activity activity, final AccountManagerCallback<Bundle> callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeAccountExplicitly(final Account account) {
        throw new RuntimeException("Stub!");
    }
    
    public void invalidateAuthToken(final String accountType, final String authToken) {
        throw new RuntimeException("Stub!");
    }
    
    public String peekAuthToken(final Account account, final String authTokenType) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPassword(final Account account, final String password) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearPassword(final Account account) {
        throw new RuntimeException("Stub!");
    }
    
    public void setUserData(final Account account, final String key, final String value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAuthToken(final Account account, final String authTokenType, final String authToken) {
        throw new RuntimeException("Stub!");
    }
    
    public String blockingGetAuthToken(final Account account, final String authTokenType, final boolean notifyAuthFailure) throws AuthenticatorException, IOException, OperationCanceledException {
        throw new RuntimeException("Stub!");
    }
    
    public AccountManagerFuture<Bundle> getAuthToken(final Account account, final String authTokenType, final Bundle options, final Activity activity, final AccountManagerCallback<Bundle> callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public AccountManagerFuture<Bundle> getAuthToken(final Account account, final String authTokenType, final boolean notifyAuthFailure, final AccountManagerCallback<Bundle> callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public AccountManagerFuture<Bundle> getAuthToken(final Account account, final String authTokenType, final Bundle options, final boolean notifyAuthFailure, final AccountManagerCallback<Bundle> callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public AccountManagerFuture<Bundle> addAccount(final String accountType, final String authTokenType, final String[] requiredFeatures, final Bundle addAccountOptions, final Activity activity, final AccountManagerCallback<Bundle> callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public AccountManagerFuture<Bundle> confirmCredentials(final Account account, final Bundle options, final Activity activity, final AccountManagerCallback<Bundle> callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public AccountManagerFuture<Bundle> updateCredentials(final Account account, final String authTokenType, final Bundle options, final Activity activity, final AccountManagerCallback<Bundle> callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public AccountManagerFuture<Bundle> editProperties(final String accountType, final Activity activity, final AccountManagerCallback<Bundle> callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public AccountManagerFuture<Bundle> getAuthTokenByFeatures(final String accountType, final String authTokenType, final String[] features, final Activity activity, final Bundle addAccountOptions, final Bundle getAuthTokenOptions, final AccountManagerCallback<Bundle> callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Intent newChooseAccountIntent(final Account selectedAccount, final ArrayList<Account> allowableAccounts, final String[] allowableAccountTypes, final boolean alwaysPromptForAccount, final String descriptionOverrideText, final String addAccountAuthTokenType, final String[] addAccountRequiredFeatures, final Bundle addAccountOptions) {
        throw new RuntimeException("Stub!");
    }
    
    public static Intent newChooseAccountIntent(final Account selectedAccount, final List<Account> allowableAccounts, final String[] allowableAccountTypes, final String descriptionOverrideText, final String addAccountAuthTokenType, final String[] addAccountRequiredFeatures, final Bundle addAccountOptions) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnAccountsUpdatedListener(final OnAccountsUpdateListener listener, final Handler handler, final boolean updateImmediately) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnAccountsUpdatedListener(final OnAccountsUpdateListener listener, final Handler handler, final boolean updateImmediately, final String[] accountTypes) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnAccountsUpdatedListener(final OnAccountsUpdateListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public AccountManagerFuture<Bundle> startAddAccountSession(final String accountType, final String authTokenType, final String[] requiredFeatures, final Bundle options, final Activity activity, final AccountManagerCallback<Bundle> callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public AccountManagerFuture<Bundle> startUpdateCredentialsSession(final Account account, final String authTokenType, final Bundle options, final Activity activity, final AccountManagerCallback<Bundle> callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public AccountManagerFuture<Bundle> finishSession(final Bundle sessionBundle, final Activity activity, final AccountManagerCallback<Bundle> callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public AccountManagerFuture<Boolean> isCredentialsUpdateSuggested(final Account account, final String statusToken, final AccountManagerCallback<Boolean> callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
}
