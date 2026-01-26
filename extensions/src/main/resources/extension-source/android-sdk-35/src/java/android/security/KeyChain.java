package android.security;

import java.security.cert.X509Certificate;
import java.security.PrivateKey;
import android.content.Context;
import android.net.Uri;
import java.security.Principal;
import android.app.Activity;
import android.content.Intent;

public final class KeyChain
{
    public static final String ACTION_KEYCHAIN_CHANGED = "android.security.action.KEYCHAIN_CHANGED";
    public static final String ACTION_KEY_ACCESS_CHANGED = "android.security.action.KEY_ACCESS_CHANGED";
    @Deprecated
    public static final String ACTION_STORAGE_CHANGED = "android.security.STORAGE_CHANGED";
    public static final String ACTION_TRUST_STORE_CHANGED = "android.security.action.TRUST_STORE_CHANGED";
    public static final String EXTRA_CERTIFICATE = "CERT";
    public static final String EXTRA_KEY_ACCESSIBLE = "android.security.extra.KEY_ACCESSIBLE";
    public static final String EXTRA_KEY_ALIAS = "android.security.extra.KEY_ALIAS";
    public static final String EXTRA_NAME = "name";
    public static final String EXTRA_PKCS12 = "PKCS12";
    public static final String KEY_ALIAS_SELECTION_DENIED = "android:alias-selection-denied";
    
    public KeyChain() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Intent createInstallIntent() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Intent createManageCredentialsIntent(@NonNull final AppUriAuthenticationPolicy policy) {
        throw new RuntimeException("Stub!");
    }
    
    public static void choosePrivateKeyAlias(@NonNull final Activity activity, @NonNull final KeyChainAliasCallback response, @Nullable final String[] keyTypes, @Nullable final Principal[] issuers, @Nullable final String host, final int port, @Nullable final String alias) {
        throw new RuntimeException("Stub!");
    }
    
    public static void choosePrivateKeyAlias(@NonNull final Activity activity, @NonNull final KeyChainAliasCallback response, @Nullable final String[] keyTypes, @Nullable final Principal[] issuers, @Nullable final Uri uri, @Nullable final String alias) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isCredentialManagementApp(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static AppUriAuthenticationPolicy getCredentialManagementAppPolicy(@NonNull final Context context) throws SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean removeCredentialManagementApp(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static PrivateKey getPrivateKey(@NonNull final Context context, @NonNull final String alias) throws InterruptedException, KeyChainException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static X509Certificate[] getCertificateChain(@NonNull final Context context, @NonNull final String alias) throws InterruptedException, KeyChainException {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isKeyAlgorithmSupported(@NonNull final String algorithm) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static boolean isBoundKeyAlgorithm(@NonNull final String algorithm) {
        throw new RuntimeException("Stub!");
    }
}
