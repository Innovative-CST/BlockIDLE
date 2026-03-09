package android.service.autofill;

import java.util.Set;

public interface SavedDatasetsInfoCallback
{
    public static final int ERROR_NEEDS_USER_ACTION = 2;
    public static final int ERROR_OTHER = 0;
    public static final int ERROR_UNSUPPORTED = 1;
    
    void onSuccess(@NonNull final Set<SavedDatasetsInfo> p0);
    
    void onError(final int p0);
}
