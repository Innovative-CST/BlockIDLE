package android.app.role;

import android.content.Intent;

public final class RoleManager
{
    public static final String ROLE_ASSISTANT = "android.app.role.ASSISTANT";
    public static final String ROLE_BROWSER = "android.app.role.BROWSER";
    public static final String ROLE_CALL_REDIRECTION = "android.app.role.CALL_REDIRECTION";
    public static final String ROLE_CALL_SCREENING = "android.app.role.CALL_SCREENING";
    public static final String ROLE_DIALER = "android.app.role.DIALER";
    public static final String ROLE_EMERGENCY = "android.app.role.EMERGENCY";
    public static final String ROLE_HOME = "android.app.role.HOME";
    public static final String ROLE_NOTES = "android.app.role.NOTES";
    public static final String ROLE_SMS = "android.app.role.SMS";
    public static final String ROLE_WALLET = "android.app.role.WALLET";
    
    RoleManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Intent createRequestRoleIntent(@NonNull final String roleName) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRoleAvailable(@NonNull final String roleName) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRoleHeld(@NonNull final String roleName) {
        throw new RuntimeException("Stub!");
    }
}
