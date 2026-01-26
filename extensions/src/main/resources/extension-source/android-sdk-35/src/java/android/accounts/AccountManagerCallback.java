package android.accounts;

public interface AccountManagerCallback<V>
{
    void run(final AccountManagerFuture<V> p0);
}
