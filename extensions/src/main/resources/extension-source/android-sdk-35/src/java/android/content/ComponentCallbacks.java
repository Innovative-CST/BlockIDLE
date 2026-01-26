package android.content;

import android.content.res.Configuration;

public interface ComponentCallbacks
{
    void onConfigurationChanged(@NonNull final Configuration p0);
    
    @Deprecated
    void onLowMemory();
}
