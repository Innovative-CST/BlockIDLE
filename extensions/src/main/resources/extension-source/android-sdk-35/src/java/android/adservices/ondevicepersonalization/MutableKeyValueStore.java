package android.adservices.ondevicepersonalization;

public interface MutableKeyValueStore extends KeyValueStore
{
    @Nullable
    byte[] put(@NonNull final String p0, @NonNull final byte[] p1);
    
    @Nullable
    byte[] remove(@NonNull final String p0);
}
