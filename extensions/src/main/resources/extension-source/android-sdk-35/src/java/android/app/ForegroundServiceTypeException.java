package android.app;

public abstract class ForegroundServiceTypeException extends ServiceStartNotAllowedException
{
    public ForegroundServiceTypeException(@NonNull final String message) {
        throw new RuntimeException("Stub!");
    }
}
