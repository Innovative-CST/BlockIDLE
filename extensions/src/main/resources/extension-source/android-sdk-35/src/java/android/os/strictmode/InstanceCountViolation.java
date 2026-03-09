package android.os.strictmode;

public class InstanceCountViolation extends Violation
{
    InstanceCountViolation() {
        throw new RuntimeException("Stub!");
    }
    
    public long getNumberOfInstances() {
        throw new RuntimeException("Stub!");
    }
}
