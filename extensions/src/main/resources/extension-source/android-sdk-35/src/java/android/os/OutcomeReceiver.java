package android.os;

public interface OutcomeReceiver<R, E extends Throwable>
{
    void onResult(final R p0);
    
    default void onError(@NonNull final E error) {
        throw new RuntimeException("Stub!");
    }
}
