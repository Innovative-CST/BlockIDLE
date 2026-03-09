package android.app.admin;

import android.net.Uri;
import android.telephony.data.ApnSetting;
import java.util.concurrent.Executor;
import android.content.Context;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.content.Intent;
import android.os.UserHandle;
import android.os.PersistableBundle;
import android.os.Bundle;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import java.util.Set;
import java.util.Map;
import android.security.AttestedKeyPair;
import android.security.keystore.KeyGenParameterSpec;
import java.security.cert.Certificate;
import java.security.PrivateKey;
import android.net.ProxyInfo;
import java.util.List;
import android.content.ComponentName;

public class DevicePolicyManager
{
    public static final String ACTION_ADD_DEVICE_ADMIN = "android.app.action.ADD_DEVICE_ADMIN";
    public static final String ACTION_ADMIN_POLICY_COMPLIANCE = "android.app.action.ADMIN_POLICY_COMPLIANCE";
    public static final String ACTION_APPLICATION_DELEGATION_SCOPES_CHANGED = "android.app.action.APPLICATION_DELEGATION_SCOPES_CHANGED";
    public static final String ACTION_CHECK_POLICY_COMPLIANCE = "android.app.action.CHECK_POLICY_COMPLIANCE";
    public static final String ACTION_DEVICE_ADMIN_SERVICE = "android.app.action.DEVICE_ADMIN_SERVICE";
    public static final String ACTION_DEVICE_FINANCING_STATE_CHANGED = "android.app.admin.action.DEVICE_FINANCING_STATE_CHANGED";
    public static final String ACTION_DEVICE_OWNER_CHANGED = "android.app.action.DEVICE_OWNER_CHANGED";
    public static final String ACTION_DEVICE_POLICY_RESOURCE_UPDATED = "android.app.action.DEVICE_POLICY_RESOURCE_UPDATED";
    public static final String ACTION_GET_PROVISIONING_MODE = "android.app.action.GET_PROVISIONING_MODE";
    public static final String ACTION_MANAGED_PROFILE_PROVISIONED = "android.app.action.MANAGED_PROFILE_PROVISIONED";
    public static final String ACTION_PROFILE_OWNER_CHANGED = "android.app.action.PROFILE_OWNER_CHANGED";
    public static final String ACTION_PROVISIONING_SUCCESSFUL = "android.app.action.PROVISIONING_SUCCESSFUL";
    @Deprecated
    public static final String ACTION_PROVISION_MANAGED_DEVICE = "android.app.action.PROVISION_MANAGED_DEVICE";
    public static final String ACTION_PROVISION_MANAGED_PROFILE = "android.app.action.PROVISION_MANAGED_PROFILE";
    public static final String ACTION_SET_NEW_PARENT_PROFILE_PASSWORD = "android.app.action.SET_NEW_PARENT_PROFILE_PASSWORD";
    public static final String ACTION_SET_NEW_PASSWORD = "android.app.action.SET_NEW_PASSWORD";
    public static final String ACTION_START_ENCRYPTION = "android.app.action.START_ENCRYPTION";
    public static final String ACTION_SYSTEM_UPDATE_POLICY_CHANGED = "android.app.action.SYSTEM_UPDATE_POLICY_CHANGED";
    public static final int CONTENT_PROTECTION_DISABLED = 1;
    public static final int CONTENT_PROTECTION_ENABLED = 2;
    public static final int CONTENT_PROTECTION_NOT_CONTROLLED_BY_POLICY = 0;
    public static final String DELEGATION_APP_RESTRICTIONS = "delegation-app-restrictions";
    public static final String DELEGATION_BLOCK_UNINSTALL = "delegation-block-uninstall";
    public static final String DELEGATION_CERT_INSTALL = "delegation-cert-install";
    public static final String DELEGATION_CERT_SELECTION = "delegation-cert-selection";
    public static final String DELEGATION_ENABLE_SYSTEM_APP = "delegation-enable-system-app";
    public static final String DELEGATION_INSTALL_EXISTING_PACKAGE = "delegation-install-existing-package";
    public static final String DELEGATION_KEEP_UNINSTALLED_PACKAGES = "delegation-keep-uninstalled-packages";
    public static final String DELEGATION_NETWORK_LOGGING = "delegation-network-logging";
    public static final String DELEGATION_PACKAGE_ACCESS = "delegation-package-access";
    public static final String DELEGATION_PERMISSION_GRANT = "delegation-permission-grant";
    public static final String DELEGATION_SECURITY_LOGGING = "delegation-security-logging";
    @Deprecated
    public static final int ENCRYPTION_STATUS_ACTIVATING = 2;
    public static final int ENCRYPTION_STATUS_ACTIVE = 3;
    public static final int ENCRYPTION_STATUS_ACTIVE_DEFAULT_KEY = 4;
    public static final int ENCRYPTION_STATUS_ACTIVE_PER_USER = 5;
    public static final int ENCRYPTION_STATUS_INACTIVE = 1;
    public static final int ENCRYPTION_STATUS_UNSUPPORTED = 0;
    public static final String EXTRA_ADD_EXPLANATION = "android.app.extra.ADD_EXPLANATION";
    public static final String EXTRA_DELEGATION_SCOPES = "android.app.extra.DELEGATION_SCOPES";
    public static final String EXTRA_DEVICE_ADMIN = "android.app.extra.DEVICE_ADMIN";
    public static final String EXTRA_DEVICE_PASSWORD_REQUIREMENT_ONLY = "android.app.extra.DEVICE_PASSWORD_REQUIREMENT_ONLY";
    public static final String EXTRA_PASSWORD_COMPLEXITY = "android.app.extra.PASSWORD_COMPLEXITY";
    public static final String EXTRA_PROVISIONING_ACCOUNT_TO_MIGRATE = "android.app.extra.PROVISIONING_ACCOUNT_TO_MIGRATE";
    public static final String EXTRA_PROVISIONING_ADMIN_EXTRAS_BUNDLE = "android.app.extra.PROVISIONING_ADMIN_EXTRAS_BUNDLE";
    public static final String EXTRA_PROVISIONING_ALLOWED_PROVISIONING_MODES = "android.app.extra.PROVISIONING_ALLOWED_PROVISIONING_MODES";
    public static final String EXTRA_PROVISIONING_ALLOW_OFFLINE = "android.app.extra.PROVISIONING_ALLOW_OFFLINE";
    public static final String EXTRA_PROVISIONING_DEVICE_ADMIN_COMPONENT_NAME = "android.app.extra.PROVISIONING_DEVICE_ADMIN_COMPONENT_NAME";
    public static final String EXTRA_PROVISIONING_DEVICE_ADMIN_MINIMUM_VERSION_CODE = "android.app.extra.PROVISIONING_DEVICE_ADMIN_MINIMUM_VERSION_CODE";
    public static final String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_CHECKSUM = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_CHECKSUM";
    public static final String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_COOKIE_HEADER = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_COOKIE_HEADER";
    public static final String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_LOCATION = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_LOCATION";
    @Deprecated
    public static final String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_NAME = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_NAME";
    public static final String EXTRA_PROVISIONING_DEVICE_ADMIN_SIGNATURE_CHECKSUM = "android.app.extra.PROVISIONING_DEVICE_ADMIN_SIGNATURE_CHECKSUM";
    public static final String EXTRA_PROVISIONING_DISCLAIMERS = "android.app.extra.PROVISIONING_DISCLAIMERS";
    public static final String EXTRA_PROVISIONING_DISCLAIMER_CONTENT = "android.app.extra.PROVISIONING_DISCLAIMER_CONTENT";
    public static final String EXTRA_PROVISIONING_DISCLAIMER_HEADER = "android.app.extra.PROVISIONING_DISCLAIMER_HEADER";
    @Deprecated
    public static final String EXTRA_PROVISIONING_EMAIL_ADDRESS = "android.app.extra.PROVISIONING_EMAIL_ADDRESS";
    public static final String EXTRA_PROVISIONING_IMEI = "android.app.extra.PROVISIONING_IMEI";
    public static final String EXTRA_PROVISIONING_KEEP_ACCOUNT_ON_MIGRATION = "android.app.extra.PROVISIONING_KEEP_ACCOUNT_ON_MIGRATION";
    @Deprecated
    public static final String EXTRA_PROVISIONING_KEEP_SCREEN_ON = "android.app.extra.PROVISIONING_KEEP_SCREEN_ON";
    public static final String EXTRA_PROVISIONING_LEAVE_ALL_SYSTEM_APPS_ENABLED = "android.app.extra.PROVISIONING_LEAVE_ALL_SYSTEM_APPS_ENABLED";
    public static final String EXTRA_PROVISIONING_LOCALE = "android.app.extra.PROVISIONING_LOCALE";
    public static final String EXTRA_PROVISIONING_LOCAL_TIME = "android.app.extra.PROVISIONING_LOCAL_TIME";
    @Deprecated
    public static final String EXTRA_PROVISIONING_LOGO_URI = "android.app.extra.PROVISIONING_LOGO_URI";
    @Deprecated
    public static final String EXTRA_PROVISIONING_MAIN_COLOR = "android.app.extra.PROVISIONING_MAIN_COLOR";
    public static final String EXTRA_PROVISIONING_MODE = "android.app.extra.PROVISIONING_MODE";
    public static final String EXTRA_PROVISIONING_SENSORS_PERMISSION_GRANT_OPT_OUT = "android.app.extra.PROVISIONING_SENSORS_PERMISSION_GRANT_OPT_OUT";
    public static final String EXTRA_PROVISIONING_SERIAL_NUMBER = "android.app.extra.PROVISIONING_SERIAL_NUMBER";
    public static final String EXTRA_PROVISIONING_SHOULD_LAUNCH_RESULT_INTENT = "android.app.extra.PROVISIONING_SHOULD_LAUNCH_RESULT_INTENT";
    public static final String EXTRA_PROVISIONING_SKIP_EDUCATION_SCREENS = "android.app.extra.PROVISIONING_SKIP_EDUCATION_SCREENS";
    public static final String EXTRA_PROVISIONING_SKIP_ENCRYPTION = "android.app.extra.PROVISIONING_SKIP_ENCRYPTION";
    @Deprecated
    public static final String EXTRA_PROVISIONING_SKIP_USER_CONSENT = "android.app.extra.PROVISIONING_SKIP_USER_CONSENT";
    public static final String EXTRA_PROVISIONING_TIME_ZONE = "android.app.extra.PROVISIONING_TIME_ZONE";
    public static final String EXTRA_PROVISIONING_USE_MOBILE_DATA = "android.app.extra.PROVISIONING_USE_MOBILE_DATA";
    public static final String EXTRA_PROVISIONING_WIFI_ANONYMOUS_IDENTITY = "android.app.extra.PROVISIONING_WIFI_ANONYMOUS_IDENTITY";
    public static final String EXTRA_PROVISIONING_WIFI_CA_CERTIFICATE = "android.app.extra.PROVISIONING_WIFI_CA_CERTIFICATE";
    public static final String EXTRA_PROVISIONING_WIFI_DOMAIN = "android.app.extra.PROVISIONING_WIFI_DOMAIN";
    public static final String EXTRA_PROVISIONING_WIFI_EAP_METHOD = "android.app.extra.PROVISIONING_WIFI_EAP_METHOD";
    public static final String EXTRA_PROVISIONING_WIFI_HIDDEN = "android.app.extra.PROVISIONING_WIFI_HIDDEN";
    public static final String EXTRA_PROVISIONING_WIFI_IDENTITY = "android.app.extra.PROVISIONING_WIFI_IDENTITY";
    public static final String EXTRA_PROVISIONING_WIFI_PAC_URL = "android.app.extra.PROVISIONING_WIFI_PAC_URL";
    public static final String EXTRA_PROVISIONING_WIFI_PASSWORD = "android.app.extra.PROVISIONING_WIFI_PASSWORD";
    public static final String EXTRA_PROVISIONING_WIFI_PHASE2_AUTH = "android.app.extra.PROVISIONING_WIFI_PHASE2_AUTH";
    public static final String EXTRA_PROVISIONING_WIFI_PROXY_BYPASS = "android.app.extra.PROVISIONING_WIFI_PROXY_BYPASS";
    public static final String EXTRA_PROVISIONING_WIFI_PROXY_HOST = "android.app.extra.PROVISIONING_WIFI_PROXY_HOST";
    public static final String EXTRA_PROVISIONING_WIFI_PROXY_PORT = "android.app.extra.PROVISIONING_WIFI_PROXY_PORT";
    public static final String EXTRA_PROVISIONING_WIFI_SECURITY_TYPE = "android.app.extra.PROVISIONING_WIFI_SECURITY_TYPE";
    public static final String EXTRA_PROVISIONING_WIFI_SSID = "android.app.extra.PROVISIONING_WIFI_SSID";
    public static final String EXTRA_PROVISIONING_WIFI_USER_CERTIFICATE = "android.app.extra.PROVISIONING_WIFI_USER_CERTIFICATE";
    public static final String EXTRA_RESOURCE_IDS = "android.app.extra.RESOURCE_IDS";
    public static final String EXTRA_RESOURCE_TYPE = "android.app.extra.RESOURCE_TYPE";
    public static final int EXTRA_RESOURCE_TYPE_DRAWABLE = 1;
    public static final int EXTRA_RESOURCE_TYPE_STRING = 2;
    public static final String EXTRA_RESULT_LAUNCH_INTENT = "android.app.extra.RESULT_LAUNCH_INTENT";
    public static final int FLAG_EVICT_CREDENTIAL_ENCRYPTION_KEY = 1;
    public static final int FLAG_MANAGED_CAN_ACCESS_PARENT = 2;
    public static final int FLAG_PARENT_CAN_ACCESS_MANAGED = 1;
    public static final int ID_TYPE_BASE_INFO = 1;
    public static final int ID_TYPE_IMEI = 4;
    public static final int ID_TYPE_INDIVIDUAL_ATTESTATION = 16;
    public static final int ID_TYPE_MEID = 8;
    public static final int ID_TYPE_SERIAL = 2;
    public static final int INSTALLKEY_REQUEST_CREDENTIALS_ACCESS = 1;
    public static final int INSTALLKEY_SET_USER_SELECTABLE = 2;
    public static final int KEYGUARD_DISABLE_BIOMETRICS = 416;
    public static final int KEYGUARD_DISABLE_FACE = 128;
    public static final int KEYGUARD_DISABLE_FEATURES_ALL = Integer.MAX_VALUE;
    public static final int KEYGUARD_DISABLE_FEATURES_NONE = 0;
    public static final int KEYGUARD_DISABLE_FINGERPRINT = 32;
    public static final int KEYGUARD_DISABLE_IRIS = 256;
    @Deprecated
    public static final int KEYGUARD_DISABLE_REMOTE_INPUT = 64;
    public static final int KEYGUARD_DISABLE_SECURE_CAMERA = 2;
    public static final int KEYGUARD_DISABLE_SECURE_NOTIFICATIONS = 4;
    public static final int KEYGUARD_DISABLE_SHORTCUTS_ALL = 512;
    public static final int KEYGUARD_DISABLE_TRUST_AGENTS = 16;
    public static final int KEYGUARD_DISABLE_UNREDACTED_NOTIFICATIONS = 8;
    public static final int KEYGUARD_DISABLE_WIDGETS_ALL = 1;
    public static final int LEAVE_ALL_SYSTEM_APPS_ENABLED = 16;
    public static final int LOCK_TASK_FEATURE_BLOCK_ACTIVITY_START_IN_TASK = 64;
    public static final int LOCK_TASK_FEATURE_GLOBAL_ACTIONS = 16;
    public static final int LOCK_TASK_FEATURE_HOME = 4;
    public static final int LOCK_TASK_FEATURE_KEYGUARD = 32;
    public static final int LOCK_TASK_FEATURE_NONE = 0;
    public static final int LOCK_TASK_FEATURE_NOTIFICATIONS = 2;
    public static final int LOCK_TASK_FEATURE_OVERVIEW = 8;
    public static final int LOCK_TASK_FEATURE_SYSTEM_INFO = 1;
    public static final int MAKE_USER_EPHEMERAL = 2;
    public static final String MIME_TYPE_PROVISIONING_NFC = "application/com.android.managedprovisioning";
    public static final int MTE_DISABLED = 2;
    public static final int MTE_ENABLED = 1;
    public static final int MTE_NOT_CONTROLLED_BY_POLICY = 0;
    public static final int NEARBY_STREAMING_DISABLED = 1;
    public static final int NEARBY_STREAMING_ENABLED = 2;
    public static final int NEARBY_STREAMING_NOT_CONTROLLED_BY_POLICY = 0;
    public static final int NEARBY_STREAMING_SAME_MANAGED_ACCOUNT_ONLY = 3;
    public static final int OPERATION_SAFETY_REASON_DRIVING_DISTRACTION = 1;
    public static final int PASSWORD_COMPLEXITY_HIGH = 327680;
    public static final int PASSWORD_COMPLEXITY_LOW = 65536;
    public static final int PASSWORD_COMPLEXITY_MEDIUM = 196608;
    public static final int PASSWORD_COMPLEXITY_NONE = 0;
    public static final int PASSWORD_QUALITY_ALPHABETIC = 262144;
    public static final int PASSWORD_QUALITY_ALPHANUMERIC = 327680;
    public static final int PASSWORD_QUALITY_BIOMETRIC_WEAK = 32768;
    public static final int PASSWORD_QUALITY_COMPLEX = 393216;
    public static final int PASSWORD_QUALITY_NUMERIC = 131072;
    public static final int PASSWORD_QUALITY_NUMERIC_COMPLEX = 196608;
    public static final int PASSWORD_QUALITY_SOMETHING = 65536;
    public static final int PASSWORD_QUALITY_UNSPECIFIED = 0;
    public static final int PERMISSION_GRANT_STATE_DEFAULT = 0;
    public static final int PERMISSION_GRANT_STATE_DENIED = 2;
    public static final int PERMISSION_GRANT_STATE_GRANTED = 1;
    public static final int PERMISSION_POLICY_AUTO_DENY = 2;
    public static final int PERMISSION_POLICY_AUTO_GRANT = 1;
    public static final int PERMISSION_POLICY_PROMPT = 0;
    public static final int PERSONAL_APPS_NOT_SUSPENDED = 0;
    public static final int PERSONAL_APPS_SUSPENDED_EXPLICITLY = 1;
    public static final int PERSONAL_APPS_SUSPENDED_PROFILE_TIMEOUT = 2;
    public static final String POLICY_DISABLE_CAMERA = "policy_disable_camera";
    public static final String POLICY_DISABLE_SCREEN_CAPTURE = "policy_disable_screen_capture";
    public static final int PRIVATE_DNS_MODE_OFF = 1;
    public static final int PRIVATE_DNS_MODE_OPPORTUNISTIC = 2;
    public static final int PRIVATE_DNS_MODE_PROVIDER_HOSTNAME = 3;
    public static final int PRIVATE_DNS_MODE_UNKNOWN = 0;
    public static final int PRIVATE_DNS_SET_ERROR_FAILURE_SETTING = 2;
    public static final int PRIVATE_DNS_SET_ERROR_HOST_NOT_SERVING = 1;
    public static final int PRIVATE_DNS_SET_NO_ERROR = 0;
    public static final int PROVISIONING_MODE_FULLY_MANAGED_DEVICE = 1;
    public static final int PROVISIONING_MODE_MANAGED_PROFILE = 2;
    public static final int PROVISIONING_MODE_MANAGED_PROFILE_ON_PERSONAL_DEVICE = 3;
    public static final int RESET_PASSWORD_DO_NOT_ASK_CREDENTIALS_ON_BOOT = 2;
    public static final int RESET_PASSWORD_REQUIRE_ENTRY = 1;
    public static final int SKIP_SETUP_WIZARD = 1;
    public static final int WIFI_SECURITY_ENTERPRISE_192 = 3;
    public static final int WIFI_SECURITY_ENTERPRISE_EAP = 2;
    public static final int WIFI_SECURITY_OPEN = 0;
    public static final int WIFI_SECURITY_PERSONAL = 1;
    public static final int WIPE_EUICC = 4;
    public static final int WIPE_EXTERNAL_STORAGE = 1;
    public static final int WIPE_RESET_PROTECTION_DATA = 2;
    public static final int WIPE_SILENTLY = 8;
    
    DevicePolicyManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMtePolicy(final int policy) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMtePolicy() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isMtePolicyEnforced() {
        throw new RuntimeException("Stub!");
    }
    
    public void setContentProtectionPolicy(@Nullable final ComponentName admin, final int policy) {
        throw new RuntimeException("Stub!");
    }
    
    public int getContentProtectionPolicy(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSafeOperation(final int reason) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAdminActive(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<ComponentName> getActiveAdmins() {
        throw new RuntimeException("Stub!");
    }
    
    public void removeActiveAdmin(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasGrantedPolicy(@NonNull final ComponentName admin, final int usesPolicy) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPasswordQuality(@NonNull final ComponentName admin, final int quality) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getPasswordQuality(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPasswordMinimumLength(@NonNull final ComponentName admin, final int length) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getPasswordMinimumLength(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPasswordMinimumUpperCase(@NonNull final ComponentName admin, final int length) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getPasswordMinimumUpperCase(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPasswordMinimumLowerCase(@NonNull final ComponentName admin, final int length) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getPasswordMinimumLowerCase(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPasswordMinimumLetters(@NonNull final ComponentName admin, final int length) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getPasswordMinimumLetters(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPasswordMinimumNumeric(@NonNull final ComponentName admin, final int length) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getPasswordMinimumNumeric(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPasswordMinimumSymbols(@NonNull final ComponentName admin, final int length) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getPasswordMinimumSymbols(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPasswordMinimumNonLetter(@NonNull final ComponentName admin, final int length) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getPasswordMinimumNonLetter(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPasswordHistoryLength(@NonNull final ComponentName admin, final int length) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPasswordExpirationTimeout(@Nullable final ComponentName admin, final long timeout) {
        throw new RuntimeException("Stub!");
    }
    
    public long getPasswordExpirationTimeout(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public long getPasswordExpiration(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPasswordHistoryLength(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPasswordMaximumLength(final int quality) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isActivePasswordSufficient() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isActivePasswordSufficientForDeviceRequirement() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPasswordComplexity() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRequiredPasswordComplexity(final int passwordComplexity) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRequiredPasswordComplexity() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUsingUnifiedPassword(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public int getCurrentFailedPasswordAttempts() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaximumFailedPasswordsForWipe(@Nullable final ComponentName admin, final int num) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaximumFailedPasswordsForWipe(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean resetPassword(final String password, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setResetPasswordToken(@Nullable final ComponentName admin, final byte[] token) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean clearResetPasswordToken(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isResetPasswordTokenActive(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean resetPasswordWithToken(@Nullable final ComponentName admin, final String password, final byte[] token, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaximumTimeToLock(@Nullable final ComponentName admin, final long timeMs) {
        throw new RuntimeException("Stub!");
    }
    
    public long getMaximumTimeToLock(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRequiredStrongAuthTimeout(@Nullable final ComponentName admin, final long timeoutMs) {
        throw new RuntimeException("Stub!");
    }
    
    public long getRequiredStrongAuthTimeout(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void lockNow() {
        throw new RuntimeException("Stub!");
    }
    
    public void lockNow(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void wipeData(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void wipeData(final int flags, @NonNull final CharSequence reason) {
        throw new RuntimeException("Stub!");
    }
    
    public void wipeDevice(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFactoryResetProtectionPolicy(@Nullable final ComponentName admin, @Nullable final FactoryResetProtectionPolicy policy) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public FactoryResetProtectionPolicy getFactoryResetProtectionPolicy(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRecommendedGlobalProxy(@NonNull final ComponentName admin, @Nullable final ProxyInfo proxyInfo) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int setStorageEncryption(@NonNull final ComponentName admin, final boolean encrypt) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getStorageEncryption(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public int getStorageEncryptionStatus() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean installCaCert(@Nullable final ComponentName admin, final byte[] certBuffer) {
        throw new RuntimeException("Stub!");
    }
    
    public void uninstallCaCert(@Nullable final ComponentName admin, final byte[] certBuffer) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<byte[]> getInstalledCaCerts(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void uninstallAllUserCaCerts(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasCaCertInstalled(@Nullable final ComponentName admin, final byte[] certBuffer) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean installKeyPair(@Nullable final ComponentName admin, @NonNull final PrivateKey privKey, @NonNull final Certificate cert, @NonNull final String alias) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean installKeyPair(@Nullable final ComponentName admin, @NonNull final PrivateKey privKey, @NonNull final Certificate[] certs, @NonNull final String alias, final boolean requestAccess) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean installKeyPair(@Nullable final ComponentName admin, @NonNull final PrivateKey privKey, @NonNull final Certificate[] certs, @NonNull final String alias, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeKeyPair(@Nullable final ComponentName admin, @NonNull final String alias) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasKeyPair(@NonNull final String alias) {
        throw new RuntimeException("Stub!");
    }
    
    public AttestedKeyPair generateKeyPair(@Nullable final ComponentName admin, @NonNull final String algorithm, @NonNull final KeyGenParameterSpec keySpec, final int idAttestationFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean grantKeyPairToApp(@Nullable final ComponentName admin, @NonNull final String alias, @NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<Integer, Set<String>> getKeyPairGrants(@NonNull final String alias) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean revokeKeyPairFromApp(@Nullable final ComponentName admin, @NonNull final String alias, @NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean grantKeyPairToWifiAuth(@NonNull final String alias) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean revokeKeyPairFromWifiAuth(@NonNull final String alias) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isKeyPairGrantedToWifiAuth(@NonNull final String alias) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDeviceIdAttestationSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUniqueDeviceAttestationSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setKeyPairCertificate(@Nullable final ComponentName admin, @NonNull final String alias, @NonNull final List<Certificate> certs, final boolean isUserSelectable) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setCertInstallerPackage(@NonNull final ComponentName admin, @Nullable final String installerPackage) throws SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public String getCertInstallerPackage(@NonNull final ComponentName admin) throws SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    public void setDelegatedScopes(@NonNull final ComponentName admin, @NonNull final String delegatePackage, @NonNull final List<String> scopes) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getDelegatedScopes(@Nullable final ComponentName admin, @NonNull final String delegatedPackage) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<String> getDelegatePackages(@NonNull final ComponentName admin, @NonNull final String delegationScope) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAlwaysOnVpnPackage(@NonNull final ComponentName admin, @Nullable final String vpnPackage, final boolean lockdownEnabled) throws PackageManager.NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public void setAlwaysOnVpnPackage(@NonNull final ComponentName admin, @Nullable final String vpnPackage, final boolean lockdownEnabled, @Nullable final Set<String> lockdownAllowlist) throws PackageManager.NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAlwaysOnVpnLockdownEnabled(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Set<String> getAlwaysOnVpnLockdownWhitelist(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getAlwaysOnVpnPackage(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCameraDisabled(@Nullable final ComponentName admin, final boolean disabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getCameraDisabled(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean requestBugreport(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setScreenCaptureDisabled(@Nullable final ComponentName admin, final boolean disabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getScreenCaptureDisabled(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setNearbyNotificationStreamingPolicy(final int policy) {
        throw new RuntimeException("Stub!");
    }
    
    public int getNearbyNotificationStreamingPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNearbyAppStreamingPolicy(final int policy) {
        throw new RuntimeException("Stub!");
    }
    
    public int getNearbyAppStreamingPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setAutoTimeRequired(@NonNull final ComponentName admin, final boolean required) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getAutoTimeRequired() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAutoTimeEnabled(@Nullable final ComponentName admin, final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getAutoTimeEnabled(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAutoTimeZoneEnabled(@Nullable final ComponentName admin, final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getAutoTimeZoneEnabled(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setKeyguardDisabledFeatures(@Nullable final ComponentName admin, final int which) {
        throw new RuntimeException("Stub!");
    }
    
    public int getKeyguardDisabledFeatures(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDeviceOwnerApp(final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void clearDeviceOwnerApp(final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void clearProfileOwner(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDeviceOwnerLockScreenInfo(@NonNull final ComponentName admin, final CharSequence info) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getDeviceOwnerLockScreenInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String[] setPackagesSuspended(@Nullable final ComponentName admin, @NonNull final String[] packageNames, final boolean suspended) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPackageSuspended(@Nullable final ComponentName admin, final String packageName) throws PackageManager.NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public void setProfileEnabled(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setProfileName(@NonNull final ComponentName admin, final String profileName) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isProfileOwnerApp(final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOrganizationOwnedDeviceWithManagedProfile() {
        throw new RuntimeException("Stub!");
    }
    
    public void addPersistentPreferredActivity(@Nullable final ComponentName admin, final IntentFilter filter, @NonNull final ComponentName activity) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearPackagePersistentPreferredActivities(@Nullable final ComponentName admin, final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDefaultSmsApplication(@Nullable final ComponentName admin, @NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDefaultDialerApplication(@NonNull final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setApplicationRestrictionsManagingPackage(@NonNull final ComponentName admin, @Nullable final String packageName) throws PackageManager.NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public String getApplicationRestrictionsManagingPackage(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isCallerApplicationRestrictionsManagingPackage() {
        throw new RuntimeException("Stub!");
    }
    
    public void setApplicationRestrictions(@Nullable final ComponentName admin, final String packageName, final Bundle settings) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTrustAgentConfiguration(@Nullable final ComponentName admin, @NonNull final ComponentName target, final PersistableBundle configuration) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<PersistableBundle> getTrustAgentConfiguration(@Nullable final ComponentName admin, @NonNull final ComponentName agent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setCrossProfileCallerIdDisabled(@NonNull final ComponentName admin, final boolean disabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getCrossProfileCallerIdDisabled(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCredentialManagerPolicy(@Nullable final PackagePolicy policy) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PackagePolicy getCredentialManagerPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    public void setManagedProfileCallerIdAccessPolicy(@Nullable final PackagePolicy policy) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PackagePolicy getManagedProfileCallerIdAccessPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    public void setManagedProfileContactsAccessPolicy(@Nullable final PackagePolicy policy) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PackagePolicy getManagedProfileContactsAccessPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setCrossProfileContactsSearchDisabled(@NonNull final ComponentName admin, final boolean disabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getCrossProfileContactsSearchDisabled(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setBluetoothContactSharingDisabled(@NonNull final ComponentName admin, final boolean disabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getBluetoothContactSharingDisabled(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void addCrossProfileIntentFilter(@Nullable final ComponentName admin, final IntentFilter filter, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearCrossProfileIntentFilters(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setPermittedAccessibilityServices(@NonNull final ComponentName admin, final List<String> packageNames) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<String> getPermittedAccessibilityServices(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setPermittedInputMethods(@Nullable final ComponentName admin, final List<String> packageNames) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<String> getPermittedInputMethods(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setPermittedCrossProfileNotificationListeners(@NonNull final ComponentName admin, @Nullable final List<String> packageList) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<String> getPermittedCrossProfileNotificationListeners(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<String> getKeepUninstalledPackages(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setKeepUninstalledPackages(@Nullable final ComponentName admin, @NonNull final List<String> packageNames) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public UserHandle createAndManageUser(@NonNull final ComponentName admin, @NonNull final String name, @NonNull final ComponentName profileOwner, @Nullable final PersistableBundle adminExtras, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeUser(@NonNull final ComponentName admin, @NonNull final UserHandle userHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean switchUser(@NonNull final ComponentName admin, @Nullable final UserHandle userHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public int startUserInBackground(@NonNull final ComponentName admin, @NonNull final UserHandle userHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public int stopUser(@NonNull final ComponentName admin, @NonNull final UserHandle userHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public int logoutUser(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setManagedSubscriptionsPolicy(@Nullable final ManagedSubscriptionsPolicy policy) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ManagedSubscriptionsPolicy getManagedSubscriptionsPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    public List<UserHandle> getSecondaryUsers(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEphemeralUser(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getApplicationRestrictions(@Nullable final ComponentName admin, final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public void addUserRestriction(@NonNull final ComponentName admin, final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public void addUserRestrictionGlobally(@NonNull final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearUserRestriction(@NonNull final ComponentName admin, final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getUserRestrictions(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getUserRestrictionsGlobally() {
        throw new RuntimeException("Stub!");
    }
    
    public Intent createAdminSupportIntent(@NonNull final String restriction) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setApplicationHidden(@Nullable final ComponentName admin, final String packageName, final boolean hidden) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isApplicationHidden(@Nullable final ComponentName admin, final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public void enableSystemApp(@NonNull final ComponentName admin, final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public int enableSystemApp(@NonNull final ComponentName admin, final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean installExistingPackage(@NonNull final ComponentName admin, final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAccountManagementDisabled(@Nullable final ComponentName admin, final String accountType, final boolean disabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String[] getAccountTypesWithManagementDisabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLockTaskPackages(@Nullable final ComponentName admin, @NonNull final String[] packages) throws SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String[] getLockTaskPackages(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLockTaskPermitted(final String pkg) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLockTaskFeatures(@Nullable final ComponentName admin, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLockTaskFeatures(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPreferentialNetworkServiceEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPreferentialNetworkServiceEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPreferentialNetworkServiceConfigs(@NonNull final List<PreferentialNetworkServiceConfig> preferentialNetworkServiceConfigs) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<PreferentialNetworkServiceConfig> getPreferentialNetworkServiceConfigs() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGlobalSetting(@NonNull final ComponentName admin, final String setting, final String value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSystemSetting(@NonNull final ComponentName admin, @NonNull final String setting, final String value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setConfiguredNetworksLockdownState(@Nullable final ComponentName admin, final boolean lockdown) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasLockdownAdminConfiguredNetworks(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setTime(@Nullable final ComponentName admin, final long millis) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setTimeZone(@Nullable final ComponentName admin, final String timeZone) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLocationEnabled(@NonNull final ComponentName admin, final boolean locationEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSecureSetting(@NonNull final ComponentName admin, final String setting, final String value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRestrictionsProvider(@NonNull final ComponentName admin, @Nullable final ComponentName provider) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMasterVolumeMuted(@NonNull final ComponentName admin, final boolean on) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMasterVolumeMuted(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setUninstallBlocked(@Nullable final ComponentName admin, final String packageName, final boolean uninstallBlocked) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUninstallBlocked(@Nullable final ComponentName admin, final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean addCrossProfileWidgetProvider(@Nullable final ComponentName admin, final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeCrossProfileWidgetProvider(@Nullable final ComponentName admin, final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getCrossProfileWidgetProviders(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setUserIcon(@NonNull final ComponentName admin, final Bitmap icon) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSystemUpdatePolicy(@NonNull final ComponentName admin, final SystemUpdatePolicy policy) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SystemUpdatePolicy getSystemUpdatePolicy() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setKeyguardDisabled(@NonNull final ComponentName admin, final boolean disabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setStatusBarDisabled(@Nullable final ComponentName admin, final boolean disabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isStatusBarDisabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SystemUpdateInfo getPendingSystemUpdate(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPermissionPolicy(@NonNull final ComponentName admin, final int policy) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPermissionPolicy(final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setPermissionGrantState(@Nullable final ComponentName admin, @NonNull final String packageName, @NonNull final String permission, final int grantState) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPermissionGrantState(@Nullable final ComponentName admin, @NonNull final String packageName, @NonNull final String permission) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isProvisioningAllowed(@NonNull final String action) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isManagedProfile(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getWifiMacAddress(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void reboot(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setShortSupportMessage(@Nullable final ComponentName admin, @Nullable final CharSequence message) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getShortSupportMessage(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLongSupportMessage(@NonNull final ComponentName admin, @Nullable final CharSequence message) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getLongSupportMessage(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public DevicePolicyManager getParentProfileInstance(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSecurityLoggingEnabled(@Nullable final ComponentName admin, final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSecurityLoggingEnabled(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<SecurityLog.SecurityEvent> retrieveSecurityLogs(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> setMeteredDataDisabledPackages(@NonNull final ComponentName admin, @NonNull final List<String> packageNames) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getMeteredDataDisabledPackages(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<SecurityLog.SecurityEvent> retrievePreRebootSecurityLogs(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setOrganizationColor(@NonNull final ComponentName admin, final int color) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getOrganizationColor(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOrganizationName(@Nullable final ComponentName admin, @Nullable final CharSequence title) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getOrganizationName(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAffiliationIds(@NonNull final ComponentName admin, @NonNull final Set<String> ids) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getAffiliationIds(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAffiliatedUser() {
        throw new RuntimeException("Stub!");
    }
    
    public void setBackupServiceEnabled(@NonNull final ComponentName admin, final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isBackupServiceEnabled(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setNetworkLoggingEnabled(@Nullable final ComponentName admin, final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNetworkLoggingEnabled(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<NetworkEvent> retrieveNetworkLogs(@Nullable final ComponentName admin, final long batchToken) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean bindDeviceAdminServiceAsUser(@NonNull final ComponentName admin, @NonNull final Intent serviceIntent, @NonNull final ServiceConnection conn, final int flags, @NonNull final UserHandle targetUser) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean bindDeviceAdminServiceAsUser(@NonNull final ComponentName admin, @NonNull final Intent serviceIntent, @NonNull final ServiceConnection conn, @NonNull final Context.BindServiceFlags flags, @NonNull final UserHandle targetUser) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<UserHandle> getBindDeviceAdminTargetUsers(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearApplicationUserData(@NonNull final ComponentName admin, @NonNull final String packageName, @NonNull final Executor executor, @NonNull final OnClearApplicationUserDataListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLogoutEnabled(@NonNull final ComponentName admin, final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLogoutEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void transferOwnership(@NonNull final ComponentName admin, @NonNull final ComponentName target, @Nullable final PersistableBundle bundle) {
        throw new RuntimeException("Stub!");
    }
    
    public void setStartUserSessionMessage(@NonNull final ComponentName admin, @Nullable final CharSequence startUserSessionMessage) {
        throw new RuntimeException("Stub!");
    }
    
    public void setEndUserSessionMessage(@NonNull final ComponentName admin, @Nullable final CharSequence endUserSessionMessage) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getStartUserSessionMessage(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getEndUserSessionMessage(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public int addOverrideApn(@NonNull final ComponentName admin, @NonNull final ApnSetting apnSetting) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean updateOverrideApn(@NonNull final ComponentName admin, final int apnId, @NonNull final ApnSetting apnSetting) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeOverrideApn(@NonNull final ComponentName admin, final int apnId) {
        throw new RuntimeException("Stub!");
    }
    
    public List<ApnSetting> getOverrideApns(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOverrideApnsEnabled(@NonNull final ComponentName admin, final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOverrideApnEnabled(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PersistableBundle getTransferOwnershipBundle() {
        throw new RuntimeException("Stub!");
    }
    
    public int setGlobalPrivateDnsModeOpportunistic(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public int setGlobalPrivateDnsModeSpecifiedHost(@NonNull final ComponentName admin, @NonNull final String privateDnsHost) {
        throw new RuntimeException("Stub!");
    }
    
    public void installSystemUpdate(@Nullable final ComponentName admin, @NonNull final Uri updateFilePath, @NonNull final Executor executor, @NonNull final InstallSystemUpdateCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public int getGlobalPrivateDnsMode(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getGlobalPrivateDnsHost(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setCrossProfileCalendarPackages(@NonNull final ComponentName admin, @Nullable final Set<String> packageNames) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public Set<String> getCrossProfileCalendarPackages(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCrossProfilePackages(@NonNull final ComponentName admin, @NonNull final Set<String> packageNames) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getCrossProfilePackages(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setUserControlDisabledPackages(@Nullable final ComponentName admin, @NonNull final List<String> packages) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getUserControlDisabledPackages(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCommonCriteriaModeEnabled(@Nullable final ComponentName admin, final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCommonCriteriaModeEnabled(@Nullable final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPersonalAppsSuspendedReasons(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPersonalAppsSuspended(@NonNull final ComponentName admin, final boolean suspended) {
        throw new RuntimeException("Stub!");
    }
    
    public void setManagedProfileMaximumTimeOff(@NonNull final ComponentName admin, final long timeoutMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public long getManagedProfileMaximumTimeOff(@NonNull final ComponentName admin) {
        throw new RuntimeException("Stub!");
    }
    
    public void acknowledgeDeviceCompliant() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isComplianceAcknowledgementRequired() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getEnrollmentSpecificId() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOrganizationId(@NonNull final String enterpriseId) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canAdminGrantSensorsPermissions() {
        throw new RuntimeException("Stub!");
    }
    
    public void setUsbDataSignalingEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUsbDataSignalingEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canUsbDataSignalingBeDisabled() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<UserHandle> listForegroundAffiliatedUsers() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinimumRequiredWifiSecurityLevel(final int level) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinimumRequiredWifiSecurityLevel() {
        throw new RuntimeException("Stub!");
    }
    
    public void setWifiSsidPolicy(@Nullable final WifiSsidPolicy policy) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public WifiSsidPolicy getWifiSsidPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public DevicePolicyResourcesManager getResources() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getDevicePolicyManagementRoleHolderPackage() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDeviceFinanced() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<Integer> getSubscriptionIds() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class InstallSystemUpdateCallback
    {
        public static final int UPDATE_ERROR_BATTERY_LOW = 5;
        public static final int UPDATE_ERROR_FILE_NOT_FOUND = 4;
        public static final int UPDATE_ERROR_INCORRECT_OS_VERSION = 2;
        public static final int UPDATE_ERROR_UNKNOWN = 1;
        public static final int UPDATE_ERROR_UPDATE_FILE_INVALID = 3;
        
        public InstallSystemUpdateCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onInstallUpdateError(final int errorCode, @NonNull final String errorMessage) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnClearApplicationUserDataListener
    {
        void onApplicationUserDataCleared(final String p0, final boolean p1);
    }
}
