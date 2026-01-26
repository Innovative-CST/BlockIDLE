package android.adservices.ondevicepersonalization;

import java.util.Set;

public interface KeyValueStore
{
    @Nullable
    byte[] get(@NonNull final String p0);
    
    @NonNull
    Set<String> keySet();
}
