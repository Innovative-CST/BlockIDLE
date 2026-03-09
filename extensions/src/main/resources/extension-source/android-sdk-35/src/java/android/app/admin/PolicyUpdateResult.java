package android.app.admin;

public final class PolicyUpdateResult
{
    public static final int RESULT_FAILURE_CONFLICTING_ADMIN_POLICY = 1;
    public static final int RESULT_FAILURE_HARDWARE_LIMITATION = 4;
    public static final int RESULT_FAILURE_STORAGE_LIMIT_REACHED = 3;
    public static final int RESULT_FAILURE_UNKNOWN = -1;
    public static final int RESULT_POLICY_CLEARED = 2;
    public static final int RESULT_POLICY_SET = 0;
    
    public PolicyUpdateResult(final int resultCode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getResultCode() {
        throw new RuntimeException("Stub!");
    }
}
