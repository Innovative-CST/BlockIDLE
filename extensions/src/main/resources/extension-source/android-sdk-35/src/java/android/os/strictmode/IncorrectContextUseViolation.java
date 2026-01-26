package android.os.strictmode;

public final class IncorrectContextUseViolation extends Violation
{
    public IncorrectContextUseViolation(@NonNull final String message, @NonNull final Throwable originStack) {
        throw new RuntimeException("Stub!");
    }
}
