package android.app.admin;

public final class DevicePolicyIdentifiers
{
    public static final String ACCOUNT_MANAGEMENT_DISABLED_POLICY = "accountManagementDisabled";
    public static final String APPLICATION_HIDDEN_POLICY = "applicationHidden";
    public static final String APPLICATION_RESTRICTIONS_POLICY = "applicationRestrictions";
    public static final String AUTO_TIMEZONE_POLICY = "autoTimezone";
    public static final String AUTO_TIME_POLICY = "autoTime";
    public static final String BACKUP_SERVICE_POLICY = "backupService";
    public static final String CAMERA_DISABLED_POLICY = "cameraDisabled";
    public static final String CONTENT_PROTECTION_POLICY = "contentProtection";
    public static final String KEYGUARD_DISABLED_FEATURES_POLICY = "keyguardDisabledFeatures";
    public static final String LOCK_TASK_POLICY = "lockTask";
    public static final String PACKAGES_SUSPENDED_POLICY = "packagesSuspended";
    public static final String PACKAGE_UNINSTALL_BLOCKED_POLICY = "packageUninstallBlocked";
    public static final String PASSWORD_COMPLEXITY_POLICY = "passwordComplexity";
    public static final String PERMISSION_GRANT_POLICY = "permissionGrant";
    public static final String PERSISTENT_PREFERRED_ACTIVITY_POLICY = "persistentPreferredActivity";
    public static final String RESET_PASSWORD_TOKEN_POLICY = "resetPasswordToken";
    public static final String SECURITY_LOGGING_POLICY = "securityLogging";
    public static final String STATUS_BAR_DISABLED_POLICY = "statusBarDisabled";
    public static final String USB_DATA_SIGNALING_POLICY = "usbDataSignaling";
    public static final String USER_CONTROL_DISABLED_PACKAGES_POLICY = "userControlDisabledPackages";
    
    DevicePolicyIdentifiers() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static String getIdentifierForUserRestriction(@NonNull final String restriction) {
        throw new RuntimeException("Stub!");
    }
}
